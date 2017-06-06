import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader 
{
    public static void main(String[] args) 
    {
        //gets the csv file from the folder
        String csvFile = "Final Project Database.csv";
        String line = "";
        String cvsSplitBy = ",";
        //try and catch reads through the csv file
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] name = line.split(cvsSplitBy);
                //prints the values
                System.out.println("Name: " + name[0] + " " + name [1] + 
                "\nEmail: " + name[2] + "\nPassword: " + name[3] +
                "\nBirthday: " + name[4] + "\nType: " + name[5] + "\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

