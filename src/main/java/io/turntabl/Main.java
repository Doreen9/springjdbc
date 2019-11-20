package io.turntabl;

import io.turntabl.beans.ProductDAOImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Main {
    public static void main(String[] args){

       // Scanner scanner = new Scanner(System.in);
        // String cusName = scanner.nextLine();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ProductDAOImpl productDao = (ProductDAOImpl) context.getBean("prodao");

        // List<ProductTO> products = productDao.getProductNames(cusName);

        productDao.viewProducts();

        // System.out.println(products);

    }
}
