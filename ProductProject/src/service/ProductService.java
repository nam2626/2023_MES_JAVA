package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import vo.ProductVO;

public class ProductService {
	private static ProductService instance = new ProductService();
	
	private ArrayList<ProductVO> list; 
		
	private ProductService() {
		list = new ArrayList<ProductVO>();
		list.add(new ProductVO("1111", "갤럭시S22", "삼성", 20, "제1창고"));
		list.add(new ProductVO("1112", "갤럭시S11", "짭성", 12, "제2창고"));
		list.add(new ProductVO("1113", "갤럭시S09", "삼성", 13, "제2창고"));
	}

	public static ProductService getInstance() {
		if(instance == null)
			instance = new ProductService();
		return instance;
	}

	public boolean insertProduct(ProductVO productVO) {
		return list.add(productVO);
	}

	public ArrayList<ProductVO> getList() {
		return list;
	}

	public ArrayList<ProductVO> searchMakerProduct(String productMaker) {
		ArrayList<ProductVO> result = new ArrayList<ProductVO>();
		
		for (ProductVO productVO : list) {
			if(productVO.getProductMaker().equals(productMaker))
				result.add(productVO);
		}
		
		return result;
	}

	public ProductVO searchProduct(String productNo) {
		for (ProductVO productVO : list) {
			if(productVO.getProductNo().equals(productNo))
				return productVO;
		}
		return null;
	}


	
}











