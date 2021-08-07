package cn.gao.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new Driver());
        //
        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/spring?serverTimezone=GMT","root","123456");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
