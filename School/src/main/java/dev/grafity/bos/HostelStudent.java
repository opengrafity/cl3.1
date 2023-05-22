package dev.grafity.bos;

import dev.grafity.Student;

public class HostelStudent extends Student {

    float hostalFees;
    public float getTotalFee(){
        float totalFee = fees + hostalFees;
        return totalFee+(fees*0.05F);
    }
}
