package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.po.Products;
import com.service.ProductsService;
import com.service.Impl.ProductsServiceImpl;



/**
 * Servlet implementation class ProductsServlet
 */
@WebServlet("/ProductsServlet")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String action=request.getParameter("action");
		if(action!=null)
		{
			if(action.equals("add")){
				add(request,response);
			}
			else if(action.equals("findbyid"))
			{
				findbyid(request,response);
			}
			else if(action.equals("findall"))
			{
				findall(request,response);
			}
			else if(action.equals("updateProducts"))
			{
				updateproducts(request,response);
			}
		}
	}

	private void updateproducts(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Products p=new Products();
		p.setId(Integer.valueOf(request.getParameter("id")));
		p.setName(request.getParameter("name"));//商品名称
		p.setPrice(Double.valueOf(request.getParameter("price")));//商品价格
		p.setPnum(Integer.valueOf(request.getParameter("pnum")));//商品库存
		p.setCategory(request.getParameter("category"));//商品分类s
		p.setImgurl(request.getParameter("imgurl"));//商品图片
		p.setDescription(request.getParameter("description"));//商品描述
		ProductsService productsService=new ProductsServiceImpl();
		int b=productsService.updateproducts(p);
		if(b>0)
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("admin/findbyid.jsp");
		}
	}

	private void findall(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void findbyid(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int id=Integer.valueOf(request.getParameter("id"));
		ProductsService productsService=new ProductsServiceImpl();
		Products p = productsService.findbyid(id);
		request.setAttribute("pd", p);
		request.getRequestDispatcher("admin/updateProducts.jsp").forward(request, response);
					
		}

	private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {

		request.setCharacterEncoding("utf-8");
		Products p=new Products();
		p.setName(request.getParameter("name"));//商品名称
		p.setPrice(Double.valueOf(request.getParameter("price")));//商品价格
		p.setPnum(Integer.valueOf(request.getParameter("pnum")));//商品库存
		p.setCategory(request.getParameter("category"));//商品分类s
		p.setImgurl(request.getParameter("imgurl"));//商品图片
		p.setDescription(request.getParameter("description"));//商品描述
		ProductsService productsService=new ProductsServiceImpl();
		int b=productsService.add(p);
		if(b>0)
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("admin/add.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
