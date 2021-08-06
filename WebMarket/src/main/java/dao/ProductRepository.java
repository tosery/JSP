package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {
	private ArrayList<Product>listOfProducts = new ArrayList<Product>();
	
	public ArrayList<Product> getAllProducts(){//메서드 생성
		return listOfProducts;
	}

	public ProductRepository() {
		Product phone = new Product("P1234", "iphone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation");
		notebook.setCategory("Note book");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("New");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
		tablet.setCategory("Smart Phone");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("New");
		
		listOfProducts.add(phone);
	}
}
