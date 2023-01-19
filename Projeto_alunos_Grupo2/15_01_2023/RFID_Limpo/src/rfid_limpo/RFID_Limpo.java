/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rfid_limpo;

import java.awt.EventQueue;
import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;

public class RFID_Limpo {

    String readline;
    SerialPort comPort;
    String commPort = "COM5";
    int baudrate = 9600;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RFID_Limpo frame = new RFID_Limpo();
                    //frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public RFID_Limpo() {
        initializeSerialPort();
    }

    void initializeSerialPort() {
        System.out.println("Connecting to " + commPort + " with speed " + baudrate + " (check these from Arduino IDE!)");
        //  receive(readline); 

        comPort = SerialPort.getCommPort(commPort);
        comPort.openPort();
        comPort.setBaudRate(baudrate);
        comPort.addDataListener(new SerialPortDataListener() {
            @Override
            public int getListeningEvents() {
                return SerialPort.LISTENING_EVENT_DATA_AVAILABLE;
            }

            @Override
            public void serialEvent(SerialPortEvent event) {
                if (event.getEventType() != SerialPort.LISTENING_EVENT_DATA_AVAILABLE) {
                    System.err.println("No data on SerialPort");
                    return;
                }
                int bytesAvailable = comPort.bytesAvailable();
                if (bytesAvailable < 1) {
                    System.err.println("Can not read from SerialPort");
                    return;
                }
                byte[] newData = new byte[bytesAvailable];
                int numRead = comPort.readBytes(newData, newData.length);
                // System.out.println("Read " + numRead + " bytes.");
                if (numRead > 0) {
                    for (int i = 0; i < newData.length; ++i) {
                        if ((char) newData[i] == '\n' || (char) newData[i] == '\r') {
                            readline = readline.trim();
                            if (readline.length() > 0) {
                                receive(readline);
                            }
                            readline = "";
                        } else {
                            readline = readline + (char) newData[i];
                        }
                    }
                }
            }
        });

    }

    public void receive(String line) {
        if (line == null) {
            return;
        }
        String welcome = "Welkom, ";
        System.out.println(line);

    }
}
