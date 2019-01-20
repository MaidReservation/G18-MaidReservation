package com.kota.developer.demo.Entity;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import  javax.persistence.*;
import com.kota.developer.demo.Entity.*;
@Entity
@Data
@Getter @Setter
@ToString
@EqualsAndHashCode
@Table (name = "Register")
public class Register {
    @Id
    @SequenceGenerator(name="registerSeq",sequenceName="registerSeq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="registerSeq")
    @Column(name="maidId",unique = true, nullable = false)
    private @NonNull Long maidId;
    private @NonNull String maidName;
    private @NonNull String maidAddress;
    private @NonNull String maidEmail;
    private @NonNull String maidPhone;
    private @NonNull String province;
    private @NonNull String district;
    private @NonNull String canton;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = TitleName.class)
    private TitleName titleName;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Typeworking.class)
    private Typeworking typeworking;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = WorkingDate.class)
    private WorkingDate workingDate;

    public Register(){}
    public Register(String maidName,String maidAddress,String maidEmail,String maidPhone,String province,
                    String district,String canton,TitleName titleName,Typeworking typeworking,
                    WorkingDate workingDate){
            this.maidName=maidName;
            this.maidAddress=maidAddress;
            this.maidEmail=maidEmail;
            this.maidPhone=maidPhone;
            this.province=province;
            this.district=district;
            this.canton=canton;
            this.titleName=titleName;
            this.typeworking =typeworking;
            this.workingDate=workingDate;


    }

    public Long getMaidId() {
        return maidId;
    }
    public void setMaidId(Long maidId) {
        this.maidId = maidId;
    }
    public String getMaidName() {
        return maidName;
    }
    public void setMaidName(String maidName) {
        this.maidName = maidName;
    }
    public String getMaidAddress() {
        return maidAddress;
    }
    public void setMaidAddress(String maidAddress) {
        this.maidAddress = maidAddress;
    }
    public String getMaidEmail() {
        return maidEmail;
    }
    public void setMaidEmail(String maidEmail) {
        this.maidEmail = maidEmail;
    }
    public String getMaidPhone() {
        return maidPhone;
    }
    public void setMaidPhone(String maidPhone) {
        this.maidPhone = maidPhone;
    }
    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }
    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }
    public String getCanton() { return canton; }
    public void setCanton(String canton) { this.canton = canton; }
    public TitleName getTitleName() {
        return titleName;
    }
    public void setTitleName(TitleName titleName) {
        this.titleName = titleName;
    }
    public Typeworking getTypeworking() {
        return typeworking;
    }
    public void setTypeworking(Typeworking typeworking) {
        this.typeworking = typeworking;
    }
    public WorkingDate getWorkingDate() {
        return workingDate;
    }
    public void setWorkingDate(WorkingDate workingDate) {
        this.workingDate = workingDate;
    }
}
