package codeclass;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Country country = new Country("1","iran","",1000,1000,1000,1000);
        Country country2 = new Country("2","germany","",2000,2000,2000,2000);
        Country country3 = new Country("3","usa","",3000,3000,3000,3000);
        Country country4 = new Country("4","italy","",4000,4000,4000,4000);


        City city = new City(1,"tehran","1",10000);
        City city2 = new City(2,"dortmund","2",20000);
        City city3 = new City(3,"NY","3",30000);
        City city4 = new City(4,"venice","4",40000);
        List<Movie> movies=new ArrayList<>();
        movies.add(1,new Movie());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "1995");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM movieeeeee");
            while (resultSet.next()) {

                movies.add(new Movie(resultSet.getInt("id"), resultSet.getString("title"),
                        resultSet.getInt("year"), resultSet.getString("imdbl")));


            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(movies);


        ////////////////////////////////cities//////////////////////////////
        List<City> cities = new ArrayList<>();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "1995");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM city");
            while (resultSet.next()) {

                cities.add(new City(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(4), resultSet.getInt(3)));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

//پرجمعیت ترین شهرهای هر کشور
//تعداد فیلم های دیرکتور ها
    }
}
