import java.sql.*;
import java.util.ArrayList;

public class DBManeger {
    public static final String url = "jdbc:postgresql://localhost/finaldatabase";
    public static String user = "postgres";
    public static String password = "admin";
    public static Connection connection;
    public static void connect()
    {
        try{
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("CONNECTED SUCCSESSFULLY");
        }catch(Exception e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    
    public static ArrayList<User> getAllUsers(){
        ArrayList<User> users = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement(""+
                   "SELECT * FROM public.userd");

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next())
            {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String card = resultSet.getString("creditcard");
                int cvv = resultSet.getInt("cvv");
                double balance = resultSet.getDouble("balance");
                String password = resultSet.getString("password");
                users.add(new User(name,surname,age,card,cvv,balance,id,password));
            }
            statement.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return users;

    }

    public static User getUser(Integer id)
    {
        User user = null;
        try{
            PreparedStatement statement = connection.prepareStatement(""+
                    "SELECT * FROM public.userd WHERE id=?");
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next())
            {
                Integer id_user = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String card = resultSet.getString("creditcard");
                int cvv = resultSet.getInt("cvv");
                double balance = resultSet.getDouble("balance");
                String password = resultSet.getString("password");
                user = new User(name,surname,age,card,cvv,balance,id_user,password);
            }
            statement.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public static void addUser(User user)throws SQLException
    {
        PreparedStatement statement = connection.prepareStatement(""+
                "INSERT INTO public.userd (\n" +
                "name, surname, age, creditcard, cvv, balance, password) VALUES (\n" +
                "?, ?, ?, ?, ?, ?, ?)");

        statement.setString(1,user.getName());
        statement.setString(2,user.getSurname());
        statement.setInt(3,user.getAge());
        statement.setString(4,user.getCreditcard());
        statement.setInt(5,user.getCvv());
        statement.setDouble(6,user.getBalance());
        statement.setString(7,user.getPassword());

        int rows = statement.executeUpdate();
        statement.close();
    }

    public static void updateUser(User user)
    {
        try{
            PreparedStatement statement = connection.prepareStatement(""+
                    "UPDATE public.userd SET\n" +
                    "name = ?,surname =?,age=?,creditcard=?,cvv =?,balance=?,password=? WHERE\n" +
                    "id = ?;");
            statement.setString(1,user.getName());
            statement.setString(2,user.getSurname());
            statement.setInt(3,user.getAge());
            statement.setString(4,user.getCreditcard());
            statement.setInt(5,user.getCvv());
            statement.setDouble(6,user.getBalance());
            statement.setString(7,user.getPassword());
            statement.setInt(8,user.getId());

            int rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void deleteUser(Integer id)
    {
        try{
            PreparedStatement statement = connection.prepareStatement(""+
                    "delete from public.userd\n"+
                    "where id = ?");
            statement.setInt(1,id);

            int rows = statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
