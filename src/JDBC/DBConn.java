package JDBC;

import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        Connection connect = null;
        String sql = "SELECT * FROM student";
        String insertSql = "INSERT INTO student (student_name, student_class) VALUES ('Damla', 4)";
        String prSql = "INSERT INTO student (student_name, student_class) VALUES (?, ?)";
        String updateSql = "UPDATE student SET student_name = 'Mahmut' WHERE student_id = 2";
        String updatePrSql = "UPDATE student SET student_name = ? WHERE student_id = ?";
        String deleteSql = "DELETE FROM student WHERE student_id = 4";
        String deletePrSql = "DELETE FROM student WHERE student_id = ?";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);


//            GET OPERATION
//            Statement st = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            ResultSet data = st.executeQuery(sql);
//
//            objeleri tek tek dönerek bilgisini yazdırır
//            while(data.next()) {
//                System.out.println("ID: " + data.getInt("student_id"));
//                System.out.println("Ad: " + data.getString("student_name"));
//                System.out.println("Sınıf: " + data.getInt("student_class"));
//                System.out.println("####################");
//            }
//
//            sıradaki datayı alır
//            data.next();
//            ilk gördüğü datayı alır
//            data.first();
//            son gördüğü datayı alır
//            data.last();
//            referans verilen datayı alır
//            data.absolute(2);
//
//            System.out.println(data.getString("student_name"));



//            INSERT SQL
//            Statement st = connect.createStatement();
//            System.out.println(st.executeUpdate(insertSql));
//
//            Prepared Statement Insert Sql
//            PreparedStatement prSt = connect.prepareStatement(prSql);
//            prSt.setString(1, "Ahmet");
//            prSt.setInt(2, 4);
//            prSt.executeUpdate();
//            prSt.close();



//            UPDATE SQL
//            Statement st = connect.createStatement();
//            st.executeUpdate(updateSql);
//
//            Prepared Statement Update Sql
//            PreparedStatement pr = connect.prepareStatement(updatePrSql);
//            pr.setInt(2, 4);
//            pr.setString(1, "Orhan");
//            pr.executeUpdate();



//            DELETE SQL
//            Statement st = connect.createStatement();
//            st.executeUpdate(deleteSql);
//
//            PreparedStatement pr = connect.prepareStatement(deletePrSql);
//            pr.setInt(1, 5);
//            pr.executeUpdate();
            connect.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
