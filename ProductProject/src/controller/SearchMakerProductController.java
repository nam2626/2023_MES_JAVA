package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class SearchMakerProductController implements Controller {

	@Override
	public void excute(Scanner sc) {
		ArrayList<ProductVO> list = null;
		System.out.println("제조사로 제품검색을 시작합니다.....");
		System.out.println("검색할 제조사 : ");
		String productMaker = sc.nextLine();
		list = ProductService.getInstance().searchMakerProduct(productMaker);
		if(list.isEmpty()) {
			System.out.println("검색된 결과가 없습니다.");
			return;
		}
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}

}









