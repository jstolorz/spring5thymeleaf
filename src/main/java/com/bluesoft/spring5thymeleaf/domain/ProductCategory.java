package com.bluesoft.spring5thymeleaf.domain;

public class ProductCategory {
    private Integer id;
    private String category;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }
}
