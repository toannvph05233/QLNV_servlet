package controllers;

import models.NhanVien;
import services.NhanVienService;

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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null){
            action= "";
        }
        switch (action){
            case "create":
                resp.sendRedirect("views/createNhanVien.jsp");
                break;
            default:
                req.setAttribute("listNV",nhanVienService.listNV);
                RequestDispatcher requestDispatcher;
                requestDispatcher = req.getRequestDispatcher("views/showNhanVien.jsp");
                requestDispatcher.forward(req,resp);

        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String birthday = req.getParameter("birthday");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        int idPB = Integer.parseInt(req.getParameter("idPB"));

        NhanVien nhanVien = new NhanVien(id,name,birthday,email,address,idPB);
        nhanVienService.save(nhanVien);
        resp.sendRedirect("/nhanvien");

    }
}
