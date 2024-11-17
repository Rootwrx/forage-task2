package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId", nullable = false)

    private Client client;

    @Column(nullable = false)
    private String creationDate;

    public Portfolio(Client client) {

        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
