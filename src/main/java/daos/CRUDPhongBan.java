package daos;

import models.NhanVien;
import models.PhongBan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CRUDPhongBan {
    static Connection connection = ConnectionCSDL.getConnection();


    public static ArrayList<PhongBan> showPhongBan() throws Exception {
        String sqlSelect = "select * from phongban";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlSelect);
        ArrayList<PhongBan> listPB = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            listPB.add(new PhongBan(id, name));
        }
        return listPB;
    }

}
