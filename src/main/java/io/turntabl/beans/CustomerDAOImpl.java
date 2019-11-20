package io.turntabl.beans;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.tree.RowMapper;

public class CustomerDAOImpl{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }


        // List<ProductTO> productsFound = new ArrayList<>();
        // "select products.product_name, products.unit_price from products inner join order_details on products.product_id = order_details.product_id inner join orders on order_details.order_id = orders.order_id inner join customers on orders.customer_id = customers.customer_id where customers.contact_name like ? ");


}
