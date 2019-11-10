package com.sdm.vilkiwebApp.Domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "vilka")
public class Vilka {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String Bk1team1;
    private String Bk1team2;
    private String Bk2team1;
    private String Bk2team2;
    private String kindOfSport;
    private String bkName1;
    private String bkName2;
    private long startTime;
    private double BkName1coef;
    private double BkName2coef;
    private String typeBk1;
    private String typeBk2;
    private double income;


    public Vilka() {
    }

    public Vilka(String bk1team1, String bk1team2, String bk2team1, String bk2team2, String kindOfSport, String bkName1, String bkName2, long startTime, double bkName1coef, double bkName2coef, String typeBk1, String typeBk2, double income) {
        Bk1team1 = bk1team1;
        Bk1team2 = bk1team2;
        Bk2team1 = bk2team1;
        Bk2team2 = bk2team2;
        this.kindOfSport = kindOfSport;
        this.bkName1 = bkName1;
        this.bkName2 = bkName2;
        this.startTime = startTime;
        BkName1coef = bkName1coef;
        BkName2coef = bkName2coef;
        this.typeBk1 = typeBk1;
        this.typeBk2 = typeBk2;
        this.income = income;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBk1team1() {
        return Bk1team1;
    }

    public void setBk1team1(String bk1team1) {
        Bk1team1 = bk1team1;
    }

    public String getBk1team2() {
        return Bk1team2;
    }

    public void setBk1team2(String bk1team2) {
        Bk1team2 = bk1team2;
    }

    public String getBk2team1() {
        return Bk2team1;
    }

    public void setBk2team1(String bk2team1) {
        Bk2team1 = bk2team1;
    }

    public String getBk2team2() {
        return Bk2team2;
    }

    public void setBk2team2(String bk2team2) {
        Bk2team2 = bk2team2;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public String getBkName1() {
        return bkName1;
    }

    public void setBkName1(String bkName1) {
        this.bkName1 = bkName1;
    }

    public String getBkName2() {
        return bkName2;
    }

    public void setBkName2(String bkName2) {
        this.bkName2 = bkName2;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public double getBkName1coef() {
        return BkName1coef;
    }

    public void setBkName1coef(double bkName1coef) {
        BkName1coef = bkName1coef;
    }

    public double getBkName2coef() {
        return BkName2coef;
    }

    public void setBkName2coef(double bkName2coef) {
        BkName2coef = bkName2coef;
    }

    public String getTypeBk1() {
        return typeBk1;
    }

    public void setTypeBk1(String typeBk1) {
        this.typeBk1 = typeBk1;
    }

    public String getTypeBk2() {
        return typeBk2;
    }

    public void setTypeBk2(String typeBk2) {
        this.typeBk2 = typeBk2;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }


    public String getStartTimeNormal() {
        Date date = new Date(startTime * 1000);
        return String.valueOf(date);
    }
}
