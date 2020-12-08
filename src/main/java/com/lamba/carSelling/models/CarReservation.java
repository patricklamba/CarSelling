package com.lamba.carSelling.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
//TODO add lombok
@Entity
@Table(name="CAR_RESERVATION")
public class CarReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carReservationId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String model;

    @Column
    private String numberPlate;

    @Column
    private BigDecimal purchasePrice;

    @Column
    private Date purchaseDate;

    @Column
    private boolean contact;

    public Long getCarReservationId() {
        return carReservationId;
    }

    public void setCarReservationId(Long carReservationId) {
        this.carReservationId = carReservationId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public boolean isContact() {
        return contact;
    }

    public void setContact(boolean contact) {
        this.contact = contact;
    }


}
