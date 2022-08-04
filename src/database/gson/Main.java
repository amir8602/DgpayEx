package database.gson;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        List<Person> people1 = new ArrayList<>();

        File file = new File("C:\\Users\\Amir\\Desktop\\tx.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT  * from person");
            while (resultSet.next()){
                people.add(new Person(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4)
                ));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        String toJson = gson.toJson(people);
        String toJson1= gson.toJson(new Person("ali","bagheri",29));
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(toJson1);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(toJson);

        //System.out.println(gson.fromJson(, Person.class));

        String data="";
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                 data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Person person = gson.fromJson(data, Person.class);
        System.out.println(person);

    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","1995");
    }
}

