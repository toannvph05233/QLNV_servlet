package controllers;

import models.NhanVien;
import services.NhanVienService;
import services.PhongBanService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/nhanvien"})
public class NhanVienServlet extends HttpServlet {
    NhanVienService nhanVienService = new NhanVienService();
    PhongBanService phongBanService = new PhongBanService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher requestDispatcher;

        if (action == null){
            action= "";
        }
        switch (action){
            case "create":
                req.setAttribute("listPB",phongBanService.listPB);
                requestDispatcher = req.getRequestDispatcher("views/createNhanVien.jsp");
                requestDispatcher.forward(req,resp);
                break;
            case "edit":
                int indexEdit = Integer.parseInt(req.getParameter("index"));
                req.setAttribute("listPB",phongBanService.listPB);
                req.setAttribute("nhanVien",nhanVienService.listNV.get(indexEdit));
                requestDispatcher = req.getRequestDispatcher("views/editNhanVien.jsp");
                requestDispatcher.forward(req,resp);
                break;
            case "delete":
                int id = Integer.parseInt(req.getParameter("id"));
                nhanVienService.delete(id);
                resp.sendRedirect("/nhanvien");
                break;
            default:
                req.setAttribute("listNV",nhanVienService.listNV);
                requestDispatcher = req.getRequestDispatcher("views/showNhanVien.jsp");
                requestDispatcher.forward(req,resp);

        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String birthday = req.getParameter("birthday");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        int idPB = Integer.parseInt(req.getParameter("idPB"));
        NhanVien nhanVien = new NhanVien(id,name,birthday,email,address,idPB);

        switch (action){
            case "create":
                nhanVienService.save(nhanVien);
                break;
            case "edit":
                nhanVienService.edit(nhanVien);

        }
        resp.sendRedirect("/nhanvien");


    }
}
