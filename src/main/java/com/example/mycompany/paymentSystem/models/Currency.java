package com.example.mycompany.paymentSystem.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor

public class Currency {

    @Override
    public String toString() {
        return "Currency{" +
                "currency='" + currency + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 3)
    private String currency;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "currency")
    private List<CustomerCurrency> customerCurrencies;



    @OneToMany(cascade = CascadeType.ALL,mappedBy = "fromCurrency")
    private List<Exchange> exchangesFrom;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "toCurrency")
    private List<Exchange> exchangesTo;

}
