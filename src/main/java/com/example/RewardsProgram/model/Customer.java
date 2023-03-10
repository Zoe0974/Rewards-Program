package com.example.RewardsProgram.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(mappedBy="customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CustomerTransaction> transactions;
    @JsonInclude
    @Transient
    private Long rewardPoints;
    @JsonInclude
    @Transient
    private Double totalPurchases;

    public Customer() {
        super();
    }
    public Customer(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<CustomerTransaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(Set<CustomerTransaction> transactions) {
        this.transactions = transactions;
    }
    public Long getRewardPoints() {
        if (transactions == null || transactions.isEmpty()) return 0l;

        return transactions.stream().map(x -> x.getPoints().intValue()).reduce(0, (a,b) -> a + b).longValue();
    }
    public Double getTotalPurchases() {
        if (transactions == null || transactions.isEmpty()) return 0d;

        return transactions.stream().map(x -> x.getTotal().doubleValue()).reduce(0d, (a,b) -> a + b).doubleValue();
    }
}
