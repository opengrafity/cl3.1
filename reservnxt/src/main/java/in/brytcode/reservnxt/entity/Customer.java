package in.brytcode.reservnxt.entity;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @SequenceGenerator(name="custIdSeq",sequenceName = "CUST_ID_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "custIdSeq")
    private int id;
    private String name;
    private String mobileNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
