package io.turntabl.beans;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;



public class ProductDAOImpl {

    private JdbcTemplate jdbcTemplate;


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
// get product details by a specific customer name
    public List<ProductTO> getProductNames(String cusName) {
            //PreparedStatement query2 = database.prepareStatement("select count(order_details.product_id) as count, products.product_name from products inner join order_details on products.product_id = order_details.product_id group by products.product_name order by count desc limit 5"
        List<ProductTO> products = this.jdbcTemplate.query("select products.product_name, products.unit_price from products inner join order_details on products.product_id = order_details.product_id inner join orders on order_details.order_id = orders.order_id inner join customers on orders.customer_id = customers.customer_id where customers.contact_name like ? ",
                new Object[]{cusName + '%'},
                BeanPropertyRowMapper.newInstance(ProductTO.class));
        // List<ProductTO> products = this.jdbcTemplate.query("select product_name, products.unit_price from products", BeanPropertyRowMapper.newInstance(ProductTO.class));

        return products;
    }

    public void viewProducts() {
        List<ProductTO> products = this.jdbcTemplate.query("select count(order_details.product_id) as count, products.unit_price, products.product_name from products inner join order_details on products.product_id = order_details.product_id group by products.product_name, products.unit_price order by count desc limit 5", BeanPropertyRowMapper.newInstance(ProductTO.class));
        System.out.println(products);
    }

}
