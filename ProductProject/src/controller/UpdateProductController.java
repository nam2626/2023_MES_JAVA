package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class UpdateProductController implements Controller {

	@Override
	public void excute(Scanner sc) {
		System.out.println("제품정보 수정을 시작합니다....");
		System.out.println("수정할 제품번호 : ");
		String productNo = sc.nextLine();
		ProductVO vo = ProductService.getInstance().searchProduct(productNo);
		if(vo == null) {
			System.out.println("수정할 제품이 없습니다.");
			return;
		}
		System.out.println("수정할 제품명 : ");
		String productName = sc.nextLine();
		System.out.println("수정할 제조사 : ");
		String productMaker = sc.nextLine();
		System.out.println("수정할 재고 : ");
		int ea = sc.nextInt();sc.nextLine();
		System.out.println("수정할 제품위치 : ");
		String storage = sc.nextLine();
		
		vo.setProductMaker(productMaker);
		vo.setProductName(productName);
		vo.setEa(ea);
		vo.setStorage(storage);
		
		System.out.println("제품정보 수정이 완료되었습니다.");
	}

}





