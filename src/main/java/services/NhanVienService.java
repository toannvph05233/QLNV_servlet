package services;

import daos.CRUDNhanVien;
import models.NhanVien;

import java.util.ArrayList;

public class NhanVienService{
    public ArrayList<NhanVien> listNV = new ArrayList<>();

    public NhanVienService() {
        try {
            listNV = CRUDNhanVien.showNhanVien();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void save(NhanVien nhanVien){
        try{
            CRUDNhanVien.saveNhanVien(nhanVien);
            listNV = CRUDNhanVien.showNhanVien();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void edit(NhanVien nhanVien){
        try{
            CRUDNhanVien.editNhanVien(nhanVien);
            listNV = CRUDNhanVien.showNhanVien();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void delete(int id){
        try{
            CRUDNhanVien.deleteNhanVien(id);
            listNV = CRUDNhanVien.showNhanVien();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
