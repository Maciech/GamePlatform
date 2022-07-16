import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BazaUzytkownikow extends Main {

    String sciezkaBaza = "D:\\InteliiJ\\BaseApp07_12\\UserDatabase.txt";
    String exception = "Username Password";
    public void Read(String nick, String password) throws FileNotFoundException{
        File file = new File(sciezkaBaza);
        Scanner scannerR = new Scanner(file);

        while (scannerR.hasNextLine()) {
            String lineR = scannerR.nextLine();
            int len = lineR.length();
            String loginParameters = nick+" "+password;

            if(loginParameters.contains("Username Password") && exception.length() == loginParameters.length()){
                status = 1;
                break;
            }
            if (lineR.contains(loginParameters) && len == loginParameters.length()) {
                System.out.println("Zalogowano");
                status = 5;
                PanelExample panelExample = new PanelExample();
                panelExample.libraryView();
                break;
            }
            if (!scannerR.hasNextLine()) {
                status = 1; // 1 - wrong nick or pass , 2 - account exists, 5 - logged in, 6 - account registered
                break;
            }
        }
    }

    public void Write(String nick, String password) throws IOException {

        File file = new File(sciezkaBaza);
        Scanner scannerW = new Scanner(file);

        while (scannerW.hasNextLine()) {
            String lineW = scannerW.nextLine();
            int len = lineW.length();
            String loginParameters = nick+" "+password;

            if (loginParameters.contains("Username Password") && exception.length() == loginParameters.length()){
                status = 1;
                break;
            }
            if (lineW.contains(loginParameters) && loginParameters.length() == len) {
                status = 2;
                System.out.println("Account exists");
                break;
            }
            if (!scannerW.hasNextLine()) {
                status = 6;
                FileWriter fileWriter = new FileWriter(sciezkaBaza, true);
                fileWriter.write(nick + " " + password + "\r\n");
                fileWriter.close();
                System.out.println("Account registered");
                break;
            }

        }
    }
}

