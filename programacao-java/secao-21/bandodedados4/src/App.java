import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class App {
    public static void main(String[] args){

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                "UPDATE seller "
                + "SET BaseSalary = BaseSalary + ? "
                + "WHERE "
                + "(DepartmentId = ?)");

            st.setDouble(1, 200);
            st.setInt(2, 2);

            int rowAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
       
    }
}
