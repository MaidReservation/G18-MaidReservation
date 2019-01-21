package sut.se.g18.Entity;
import lombok.*;
import  javax.persistence.*;
@Entity
@Data
@Getter @Setter
@ToString
@EqualsAndHashCode
@Table (name = "Register")
public class MaidRegisterEntity {
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

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = TitleNameEntity.class)
    private TitleNameEntity titleNameEntity;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = TypeworkingEntity.class)
    private TypeworkingEntity typeworkingEntity;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = WorkingDateEntity.class)
    private WorkingDateEntity workingDateEntity;

    public MaidRegisterEntity(){}
    public MaidRegisterEntity(String maidName, String maidAddress, String maidEmail, String maidPhone, String province,
                              String district, String canton, TitleNameEntity titleNameEntity, TypeworkingEntity typeworkingEntity,
                              WorkingDateEntity workingDateEntity){
            this.maidName=maidName;
            this.maidAddress=maidAddress;
            this.maidEmail=maidEmail;
            this.maidPhone=maidPhone;
            this.province=province;
            this.district=district;
            this.canton=canton;
            this.titleNameEntity = titleNameEntity;
            this.typeworkingEntity = typeworkingEntity;
            this.workingDateEntity = workingDateEntity;


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
    public TitleNameEntity getTitleNameEntity() {
        return titleNameEntity;
    }
    public void setTitleNameEntity(TitleNameEntity titleNameEntity) {
        this.titleNameEntity = titleNameEntity;
    }
    public TypeworkingEntity getTypeworkingEntity() {
        return typeworkingEntity;
    }
    public void setTypeworkingEntity(TypeworkingEntity typeworkingEntity) {
        this.typeworkingEntity = typeworkingEntity;
    }
    public WorkingDateEntity getWorkingDateEntity() {
        return workingDateEntity;
    }
    public void setWorkingDateEntity(WorkingDateEntity workingDateEntity) {
        this.workingDateEntity = workingDateEntity;
    }
}
