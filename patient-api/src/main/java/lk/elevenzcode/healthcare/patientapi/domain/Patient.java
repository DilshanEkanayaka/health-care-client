package lk.elevenzcode.healthcare.patientapi.domain;

import lk.elevenzcode.healthcare.commons.domain.BaseDomain;
import lk.elevenzcode.healthcare.patientapi.util.Constant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = Patient.TABLE_NAME)
public class Patient extends BaseDomain {
  public static final String TABLE_NAME = "patient";

  @Column(name = "name", length = Constant.NAME_LENGTH, nullable = false)
  private String name;



  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "phone_no", length = Constant.PHONENO_LENGTH, nullable = false)
  private String phoneNumber;

  @Column(name = "age", nullable = false)
  private short age;

  @ManyToOne(optional = false)
  @JoinColumn(name = "status", nullable = false)
  private PatientStatus status;

  @Column(name = "user_id")
  private Integer user_id;

  @Column(name = "gender")
  private String gender;

  public Patient() {
  }

  public Patient(Integer id, String name, String email, String phoneNumber, short age,
                 PatientStatus status, Integer user_id,String gender) {
    super(id);
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.age = age;
    this.status = status;
    this.user_id = user_id;
    this.gender=gender;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public short getAge() {
    return age;
  }

  public void setAge(short age) {
    this.age = age;
  }

  public PatientStatus getStatus() {
    return status;
  }

  public void setStatus(PatientStatus status) {
    this.status = status;
  }

  public Integer getUser_id() {
    return user_id;
  }

  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
