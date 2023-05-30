package vo;

public class ProductVO {
	private String productNo;
	private String productName;
	private String productMaker;
	private int ea;
	private String storage;
	public ProductVO(String productNo, String productName, String productMaker, int ea, String storage) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productMaker = productMaker;
		this.ea = ea;
		this.storage = storage;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductMaker() {
		return productMaker;
	}
	public void setProductMaker(String productMaker) {
		this.productMaker = productMaker;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s %d %s", productNo, productName,
				productMaker,ea,storage);
	}
	
	
	
}









