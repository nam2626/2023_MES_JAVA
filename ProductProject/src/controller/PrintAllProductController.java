package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class PrintAllProductController implements Controller {

	@Override
	public void excute(Scanner sc) {
		ArrayList<ProductVO> list = ProductService.getInstance().getList();
		
		if(list.isEmpty()) {
			System.out.println("등록된 제품 정보가 없습니다.");
			return;
		}
		
		System.out.println("전체 제품 정보를 출력합니다....");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}





