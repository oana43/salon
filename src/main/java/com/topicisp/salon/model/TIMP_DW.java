package com.topicisp.salon.model;

import java.util.Date;

public class TIMP_DW {
    private Date id_timp;
    private String an;
    private String semestru;
    private String trimestru;
    private String luna;
    private String saptamana_an;
    private String saptamana_luna;
    private String zi_an;
    private String zi_luna;
    private int zi_saptamana;
    private String zi_nume;
    private String luna_nume;
    private int weekend;
    private int an_bisect;
    private int saptamana_calendar;
    private int saptamana_an_business;

    public TIMP_DW() {
    }

    public TIMP_DW(Date id_timp, String an, String semestru, String trimestru, String luna, String saptamana_an, String saptamana_luna, String zi_an, String zi_luna, int zi_saptamana, String zi_nume, String luna_nume, int weekend, int an_bisect, int saptamana_calendar, int saptamana_an_business) {
        this.id_timp = id_timp;
        this.an = an;
        this.semestru = semestru;
        this.trimestru = trimestru;
        this.luna = luna;
        this.saptamana_an = saptamana_an;
        this.saptamana_luna = saptamana_luna;
        this.zi_an = zi_an;
        this.zi_luna = zi_luna;
        this.zi_saptamana = zi_saptamana;
        this.zi_nume = zi_nume;
        this.luna_nume = luna_nume;
        this.weekend = weekend;
        this.an_bisect = an_bisect;
        this.saptamana_calendar = saptamana_calendar;
        this.saptamana_an_business = saptamana_an_business;
    }

    public Date getId_timp() {
        return id_timp;
    }

    public void setId_timp(Date id_timp) {
        this.id_timp = id_timp;
    }

    public String getAn() {
        return an;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public String getSemestru() {
        return semestru;
    }

    public void setSemestru(String semestru) {
        this.semestru = semestru;
    }

    public String getTrimestru() {
        return trimestru;
    }

    public void setTrimestru(String trimestru) {
        this.trimestru = trimestru;
    }

    public String getLuna() {
        return luna;
    }

    public void setLuna(String luna) {
        this.luna = luna;
    }

    public String getSaptamana_an() {
        return saptamana_an;
    }

    public void setSaptamana_an(String saptamana_an) {
        this.saptamana_an = saptamana_an;
    }

    public String getSaptamana_luna() {
        return saptamana_luna;
    }

    public void setSaptamana_luna(String saptamana_luna) {
        this.saptamana_luna = saptamana_luna;
    }

    public String getZi_an() {
        return zi_an;
    }

    public void setZi_an(String zi_an) {
        this.zi_an = zi_an;
    }

    public String getZi_luna() {
        return zi_luna;
    }

    public void setZi_luna(String zi_luna) {
        this.zi_luna = zi_luna;
    }

    public int getZi_saptamana() {
        return zi_saptamana;
    }

    public void setZi_saptamana(int zi_saptamana) {
        this.zi_saptamana = zi_saptamana;
    }

    public String getZi_nume() {
        return zi_nume;
    }

    public void setZi_nume(String zi_nume) {
        this.zi_nume = zi_nume;
    }

    public String getLuna_nume() {
        return luna_nume;
    }

    public void setLuna_nume(String luna_nume) {
        this.luna_nume = luna_nume;
    }

    public int getWeekend() {
        return weekend;
    }

    public void setWeekend(int weekend) {
        this.weekend = weekend;
    }

    public int getAn_bisect() {
        return an_bisect;
    }

    public void setAn_bisect(int an_bisect) {
        this.an_bisect = an_bisect;
    }

    public int getSaptamana_calendar() {
        return saptamana_calendar;
    }

    public void setSaptamana_calendar(int saptamana_calendar) {
        this.saptamana_calendar = saptamana_calendar;
    }

    public int getSaptamana_an_business() {
        return saptamana_an_business;
    }

    public void setSaptamana_an_business(int saptamana_an_business) {
        this.saptamana_an_business = saptamana_an_business;
    }

    @Override
    public String toString() {
        return "TIMP_DW{" +
                "id_timp=" + id_timp +
                ", an='" + an + '\'' +
                ", semestru='" + semestru + '\'' +
                ", trimestru='" + trimestru + '\'' +
                ", luna='" + luna + '\'' +
                ", saptamana_an='" + saptamana_an + '\'' +
                ", saptamana_luna='" + saptamana_luna + '\'' +
                ", zi_an='" + zi_an + '\'' +
                ", zi_luna='" + zi_luna + '\'' +
                ", zi_saptamana=" + zi_saptamana +
                ", zi_nume='" + zi_nume + '\'' +
                ", luna_nume='" + luna_nume + '\'' +
                ", weekend=" + weekend +
                ", an_bisect=" + an_bisect +
                ", saptamana_calendar=" + saptamana_calendar +
                ", saptamana_an_business=" + saptamana_an_business +
                '}';
    }
}
