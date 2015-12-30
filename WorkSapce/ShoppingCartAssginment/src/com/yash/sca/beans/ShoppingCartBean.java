package com.yash.sca.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.yash.sca.util.ConnectionProvider;

@ManagedBean
@SessionScoped
public class ShoppingCartBean {
	private String product;
	private String price;
	private String quantity;
	private String totalCost;
	
	
	
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	HttpServletRequest request= (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	HttpSession session= request.getSession(true);
	CustomerBean customerBean= (CustomerBean)session.getAttribute("CustomerBean");
	
	
	public String addProductToCart(){
		String formProduct=request.getParameter("nameOfProduct");
		String formPrice=request.getParameter("priceOfProduct") ;
		String formQuantity=request.getParameter("quantity");
		int TotalCost= Integer.parseInt(formPrice)*Integer.parseInt(formQuantity); 
		String formTotalCost= Integer.toString(TotalCost);
		
		String query = "INSERT INTO SHOPPINGCART VALUES(?,?,?,?,?)";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedstatement;

		try {
			
			preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1, formProduct);
			preparedstatement.setString(2, formPrice);
			preparedstatement.setString(3, formQuantity);
			preparedstatement.setString(4, formTotalCost);
			preparedstatement.setString(5, (customerBean.getUsername()));
			preparedstatement.executeUpdate();
			ConnectionProvider.close();

		} catch (Exception e) {

		}
		return null;
	}

	public String displayCart(){
		String query= "SELECT * FROM SHOPPINGCART WHERE USERNAME=?";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedstatement;
		
		try {
			preparedstatement=connection.prepareStatement(query);
			preparedstatement.setString(1, customerBean.getUsername());
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return "";
	}
	

}
