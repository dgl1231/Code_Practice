package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pro=new Product();
		pro.setpName("���̺극��ũ");
		pro.setPrice(100000);
		pro.setBrand("����Ű");
		
		System.out.println(pro.information());
	}

}
