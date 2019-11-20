package io.turntabl.beans;

public class CustomerTO {
    private String company_name;
    private Integer customer_id;
    private String contact_name;
    private String city;

    public CustomerTO() {
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany_name() {

        return this.company_name;
    }

    public Integer getCustomer_id() {

        return this.customer_id;
    }

    public String getContact_name() {

        return this.contact_name;
    }

    public String getCity() {

        return this.city;
    }
}
