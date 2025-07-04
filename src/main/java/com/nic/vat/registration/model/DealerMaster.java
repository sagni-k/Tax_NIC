package com.nic.vat.registration.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"web_trn_dlr_mst\"", schema = "tvat")

@Data
public class DealerMaster {

    @Id
    @Column(name = "ack_no", nullable = false)
    private BigDecimal ackNo;

    @Column(name = "\"ack_date\"", nullable = false)
    private LocalDate ackDate;


    @Column(name = "tin_no")
    private BigDecimal tinNo;

    @Column(name = "dc_no")
    private BigDecimal dcNo;

    @Column(name = "appl_name_s")
    private String applNameS;

    @Column(name = "appl_name_g")
    private String applNameG;

    @Column(name = "trad_name")
    private String tradName;

    @Column(name = "bus_addr1")
    private String busAddr1;

    @Column(name = "bus_addr2")
    private String busAddr2;

    @Column(name = "bus_plac")
    private String busPlac;

    @Column(name = "bus_dist_cd")
    private BigDecimal busDistCd;

    @Column(name = "bus_pin_cd")
    private BigDecimal busPinCd;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "fax")
    private String fax;

    @Column(name = "email")
    private String email;

    @Column(name = "bus_status")
    private BigDecimal busStatus;

    @Column(name = "fath_name")
    private String fathName;

    @Column(name = "pan")
    private String pan;

    @Column(name = "dt_birth")
    private LocalDate dtBirth;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "office")
    private String office;

    @Column(name = "reg_type")
    private String regType;

    @Column(name = "mobile")
    private BigDecimal mobile;

    @Column(name = "resi_add1")
    private String resiAdd1;

    @Column(name = "resi_addr2")
    private String resiAddr2;

    @Column(name = "resi_place")
    private String resiPlace;

    @Column(name = "resi_dist_cd")
    private BigDecimal resiDistCd;

    @Column(name = "resi_pin")
    private BigDecimal resiPin;

    @Column(name = "perm_addr")
    private String permAddr;

    @Column(name = "perm_place")
    private String permPlace;

    @Column(name = "perm_pin")
    private BigDecimal permPin;

    @Column(name = "perm_dist_cd")
    private BigDecimal permDistCd;

    // ... You can continue adding other fields similarly based on project need.
}




