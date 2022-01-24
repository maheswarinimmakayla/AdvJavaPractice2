package com.productserverexamples;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/api/v1") 
public class ProductServerExample {
ArrayList<Product> productList = new ArrayList<Product>();
	
	@Path("/productdetails")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAllProduct(){
		productList = createProductList();
		return productList;
	}
	
	public ArrayList<Product> createProductList() {
		productList.add(new Product(123,"rama",434,"nds"));
		productList.add(new Product(124,"ram",3434,"dds"));
		productList.add(new Product(125,"raghs",43443,"hyd"));
		return productList;
	}

}
