package controller;

import model.Products;
import service.ProductService;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(
        name = "ProductControl",
        value = "/products"
)

public class ProductControl extends HttpServlet {
    private ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                showFromEdit(req, resp);
                break;
            case "create":
                showCreateForm(req, resp);
                break;
            case "delete":

                break;
            default:
                editProduct(req, resp);


        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = " ";
        }
        switch (action) {
            case "edit":
//                editProduct(req,resp);
                break;
            case "create":
                showCreateForm(req, resp);
                break;
            case "delete":

                break;
            default:
                showAllProduct(req, resp);
        }
    }

    private void editProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int index = Integer.parseInt(req.getParameter("is"));
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        Products p = new Products(index + 1, name, price);
        productService.edit(index, p);
        resp.sendRedirect("/product");

    }

    private void showFromEdit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("products/edit.jsp");
        int index = Integer.parseInt(req.getParameter("id"));
        Products products = productService.findById(index);
        req.setAttribute("product", products);
        dispatcher.forward(req, resp);
    }

    private void showAllProduct(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("prosucts/list.jsp");
        List<Products> productsList = productService.findAll();
        req.setAttribute("listdanhsach", productsList);
        dispatcher.forward(req, resp);
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("product/create.jsp");


        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
