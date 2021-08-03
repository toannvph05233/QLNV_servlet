package services;

import daos.CRUDNhanVien;
import daos.CRUDPhongBan;
import models.NhanVien;
import models.PhongBan;

import java.util.ArrayList;

public class PhongBanService {
    public ArrayList<PhongBan> listPB = new ArrayList<>();

    public PhongBanService() {
        try {
            listPB = CRUDPhongBan.showPhongBan();
            for (PhongBan pb:listPB
                 ) {
                System.out.println(pb.getName());

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
