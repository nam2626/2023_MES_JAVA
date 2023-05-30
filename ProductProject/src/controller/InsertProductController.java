package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class InsertProductController implements Controller {

	@Override
	public void excute(Scanner sc) {
		System.out.println("제품정보 등록을 시작합니다....");
		System.out.println("제품번호 : ");
		String productNo = sc.nextLine();
		System.out.println("제품명 : ");
		String productName = sc.nextLine();
		System.out.println("제조사 : ");
		String productMaker = sc.nextLine();
		System.out.println("재고 : ");
		int ea = sc.nextInt();sc.nextLine();
		System.out.println("제품위치 : ");
		String storage = sc.nextLine();
		
		boolean result = ProductService.getInstance().insertProduct(
				new ProductVO(productNo, productName, productMaker, ea, storage));
		
		if(result)
			System.out.println("제품 등록 성공");
		else
			System.out.println("제품 등록 실패");
			
	}

}







