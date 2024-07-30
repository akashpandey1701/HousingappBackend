package com.example.HosuingAppBackend.Models;

import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userDetails")
public class User {

    @NonNull
    private String headname;
    @NonNull
    private String district;
    @NonNull
    private String villageName;
    @NonNull
    @Id
    private String raashanCardno;
    @NonNull
    private String adharCardno;

    public User(String headname, String district, String villageName, String raashanCardno, String adharCardno) {
        this.headname = headname;
        this.district = district;
        this.villageName = villageName;
        this.raashanCardno = raashanCardno;
        this.adharCardno = adharCardno;
    }

    public String getHeadname() {
        return headname;
    }

    public void setHeadname(String headname) {
        this.headname = headname;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getRaashanCardno() {
        return raashanCardno;
    }

    public void setRaashanCardno(String raashanCardno) {
        this.raashanCardno = raashanCardno;
    }

    public String getAdharCardno() {
        return adharCardno;
    }

    public void setAdharCardno(String adharCardno) {
        this.adharCardno = adharCardno;
    }
}
