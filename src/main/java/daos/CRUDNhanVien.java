package daos;

import models.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CRUDNhanVien {
    static Connection connection = ConnectionCSDL.getConnection();


    public static ArrayList<NhanVien> showNhanVien() throws Exception {
        String sqlSelect = "select * from nhanvien";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlSelect);
        ArrayList<NhanVien> listNV = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String birthday = resultSet.getString("birthday");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            int idPB = resultSet.getInt("idPB");

            listNV.add(new NhanVien(id, name, birthday, email, address, idPB));
        }
        return listNV;
    }

    public static void saveNhanVien(NhanVien nhanVien) throws Exception {
        String sqlSave = "insert into nhanvien value(?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlSave);

        preparedStatement.setInt(1, nhanVien.getId());
        preparedStatement.setString(2, nhanVien.getName());
        preparedStatement.setString(3, nhanVien.getBirthday());
        preparedStatement.setString(4, nhanVien.getEmail());
        preparedStatement.setString(5, nhanVien.getAddress());
        preparedStatement.setInt(6, nhanVien.getIdPB());

        preparedStatement.execute();

    }

    public static void editNhanVien(NhanVien nhanVien) throws Exception {
        String sqlEdit = "update nhanvien set name =?,birthday =?,email=?,address=?,idPB=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlEdit);

        preparedStatement.setInt(6, nhanVien.getId());
        preparedStatement.setString(1, nhanVien.getName());
        preparedStatement.setString(2, nhanVien.getBirthday());
        preparedStatement.setString(3, nhanVien.getEmail());
        preparedStatement.setString(4, nhanVien.getAddress());
        preparedStatement.setInt(5, nhanVien.getIdPB());

        preparedStatement.execute();

    }

    public static void deleteNhanVien(int id) throws Exception {
        String sqlDelete = "delete from nhanvien where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }


}
