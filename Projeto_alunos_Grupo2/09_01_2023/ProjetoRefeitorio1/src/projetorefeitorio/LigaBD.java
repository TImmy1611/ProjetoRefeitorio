package projetorefeitorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LigaBD {

    public static Connection ligacao() throws SQLException {
        String url;//integratedSecurity=true;";
        url = "jdbc:mysql://localhost:3306/dbcantina?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        Connection liga = null;
        try {
            liga = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Erro na tentativa de ligação à base de dados");
            ex.printStackTrace();
        }
        return liga;
    }

    public static void registaUtilizador(String login, String nome, String password, int tipo, String atividade) throws SQLException {
        Connection liga = ligacao();
        String query = "INSERT INTO admin(Nome,Login,Password,Tipo_admin_id_tipoadmin,Estado_atividade_idEstado_atividade)"
                + "VALUES(?,?,?,?,?)";
        PreparedStatement ps = liga.prepareStatement(query);
        ps.setString(1, nome);
        ps.setString(2, login);
        ps.setString(3, password);
        ps.setInt(4, tipo);
        ps.setString(5, atividade);
        ps.execute();
    }

    public static void MudarEstadoAtividade(int id, int estadoatividade) throws SQLException {
        Connection conn = LigaBD.ligacao();
        String sql = "UPDATE admin SET Estado_atividade_idEstado_atividade=? WHERE id_admin='" + id + "'";
        PreparedStatement ps = conn.prepareStatement(sql);
        if (estadoatividade == 0) {
            ps.setInt(1, 1);
            ps.executeUpdate();
        } else {
            ps.setInt(1, 0);
            ps.executeUpdate();
        }

    }

    public static void registaFormando(String nome, String email, int nif, int codigo) throws SQLException {
        Connection liga = ligacao();
        String query = "INSERT INTO formando(idFormando,Nome,Email,NIF,Tipo_Residencia_idTipo_Residencia,Estado_atividade_idEstado_atividade)"
                + "VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = liga.prepareStatement(query);
        ps.setInt(1, codigo);
        ps.setString(2, nome);
        ps.setString(3, email);
        ps.setInt(4, nif);
        ps.setInt(5, 0);
        ps.setInt(6, 1);
        ps.execute();
    }

    public static void registaTurma(String idTurma, String dataI, String dataF, String desc) throws SQLException {
        Connection liga = ligacao();
        String query = "INSERT INTO turma(data_inicio,data_fim,descricao,cod_curso)"
                + "VALUES(?,?,?,?)";
        PreparedStatement ps = liga.prepareStatement(query);
        ps.setString(1, dataI);
        ps.setString(2, dataF);
        ps.setString(3, desc);
        ps.setString(4, idTurma);
        ps.execute();
    }

    public static void associarFormandoTurma(ArrayList<Integer> alunos, String cod_curso) throws SQLException {
        Connection liga = ligacao();
        String query = "SELECT idTurma FROM turma WHERE cod_curso = '" + cod_curso + "'";
        PreparedStatement ps = liga.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        rs.first();
        int idturma = rs.getInt("idTurma");
        String query2 = "INSERT INTO turma_has_formando(Turma_idTurma,Formando_idFormando)" + "VALUES(?,?)";
        ps = liga.prepareStatement(query2);
        for (int i = 0; i < alunos.size(); i++) {
            ps.setInt(1, idturma);
            ps.setInt(2, alunos.get(i));
            ps.execute();
        }
    }

    public static void MudarDataFimTurma(int id, String dataF) throws SQLException {
        Connection conn = LigaBD.ligacao();
        String sql = "UPDATE turma SET data_fim=? WHERE idTurma='" + id + "'";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setString(1, dataF);
        ps.execute();
    }
    public static void MudarEmailFormando(int id, String email) throws SQLException {
        Connection conn = LigaBD.ligacao();
        String sql = "UPDATE formando SET Email=? WHERE idFormando='" + id + "'";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setString(1, email);
        ps.execute();
    }
    public static void MudarResidenciaFormando(int id, int resi) throws SQLException {
        Connection conn = LigaBD.ligacao();
        String sql = "UPDATE formando SET Tipo_Residencia_idTipo_Residencia=? WHERE idFormando='" + id + "'";
        PreparedStatement ps = conn.prepareStatement(sql);
        if (resi == 0) {
            ps.setInt(1, 1);
            ps.executeUpdate();
        } else {
            ps.setInt(1, 0);
            ps.executeUpdate();
        }
    }
    public static void MudarAtividadeFormando(int id, String est) throws SQLException {
        Connection conn = LigaBD.ligacao();
        String sql = "UPDATE formando SET Estado_atividade_idEstado_atividade=? WHERE idFormando='" + id + "'";
        PreparedStatement ps = conn.prepareStatement(sql);
        if (est.equals("0")) {
            ps.setInt(1, 1);
            ps.executeUpdate();
        } else {
            ps.setInt(1, 0);
            ps.executeUpdate();
        }
    }
}
