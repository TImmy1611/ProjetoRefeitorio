package projetorefeitorio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static org.apache.logging.log4j.core.util.Assert.isEmpty;
import org.apache.poi.xssf.usermodel.*;
import static projetorefeitorio.LigaBD.ligacao;

/**
 *
 * @author vquerido
 */
public class ReadEL {

    public static void main(String filename) throws FileNotFoundException, IOException, SQLException {
        //DECLARAÇÃO DE VARIÁVEIS
        boolean encontrado;
        String nome = "";
        String email = "";
        int nif = 0;
        int codigo = 0;
        String dataF = "";
        String dataI = "";
        ArrayList<Integer> alunos = new ArrayList<>();

        Connection liga = ligacao();
        //VERIFICA SE O FORMANDO JÁ EXISTE NA TABELA
        String query;
        PreparedStatement ps;
        ResultSet rs;

        String excelFilePath = filename;
        FileInputStream inputstream = new FileInputStream(excelFilePath);

        XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        //TRIM DO IDTURMA        
        String string = filename;
        String[] split1 = string.split("\\\\");
        int tamanho = split1.length;
        String idTurma = split1[tamanho - 1];
        String[] split2 = idTurma.split("\\.");
        idTurma = split2[0];
        idTurma = idTurma.replace("_", ".");
        System.out.println(idTurma);

        ////LOOP FOR PARA PERCORRER O FICHEIRO E EXTRAIR INFO
        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();

        for (int r = 1; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            encontrado = false;
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);

                switch (cell.getCellType()) {
                    case STRING:
                        if (c == 1) {
                            nome = cell.getStringCellValue();

                        }
                        if (c == 6) {
                            email = cell.getStringCellValue();

                        }
                        if (c == 8) {
                            nif = Integer.parseInt(cell.getStringCellValue());
                        }
                        break;
                    case NUMERIC:
                        if (c == 0) {
                            codigo = (int) cell.getNumericCellValue();
                            query = "SELECT idFormando FROM formando WHERE idFormando='" + codigo + "'";
                            ps = liga.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE,
                                    ResultSet.CONCUR_UPDATABLE);
                            rs = ps.executeQuery();
                            rs.first();

                            if (!isEmpty(rs.first())) {
                                encontrado = true;
                            }
                        }
                        if (c == 4) {
                            dataI = String.valueOf(cell.getNumericCellValue());
                            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = cell.getDateCellValue();
                            dataI = df.format(date);
                            //System.out.println("Data Inicial: "+dataI);
                        }
                        if (c == 5) {
                            dataF = String.valueOf(cell.getNumericCellValue());
                            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = cell.getDateCellValue();
                            dataF = df.format(date);
                            //System.out.println("Data Final: "+dataF);
                        }
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;
                }

            }
            alunos.add(codigo);
            if (encontrado) {
                LigaBD.MudarAtividadeFormando(codigo, 1);
            }
            try {
                LigaBD.registaFormando(nome, email, nif, codigo);
            } catch (SQLException ex) {
                Logger.getLogger(ReadEL.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        //TODO SQL idTurma, nome, email, nif, codigo, dataI, dataF
        String desc = JOptionPane.showInputDialog("Descrição da turma");

        try {
            LigaBD.registaTurma(idTurma, dataI, dataF, desc);
        } catch (SQLException ex) {
            Logger.getLogger(ReadEL.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            LigaBD.associarFormandoTurma(alunos, idTurma);
        } catch (SQLException ex) {
            Logger.getLogger(ReadEL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
