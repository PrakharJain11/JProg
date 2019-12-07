package com.prakharjain.Immutable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public final class Employee implements Cloneable, Externalizable{
    private final Integer age;
    private final String name;
    private final List<String> companies;
    private final Date dob;

    public Employee(Integer age, String name,List<String> companies, Date dob) {
        this.age = age;
        this.name = name;
        this.companies = companies;
        this.dob = dob;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public Date getDob() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.dob);
        return cal.getTime();
    }

    public List<String> getCompanies() {
        List<String> clone = new ArrayList<String>(this.companies.size());
        for(String companyName : this.companies) {
            clone.add(companyName);
        }
        return clone;
    }

    @Override
    public String toString() {
        StringBuffer strb = new StringBuffer();
        strb.append("AGE").append(" ").append(this.age)
            .append(", NAME ").append(this.name)
            .append(", DOB ").append(this.getDateString())
            .append(", COMPANIES WORKED IN ");      
        for(String companyName : this.companies) {
            strb.append(companyName).append(",");
        }

        strb.deleteCharAt(strb.length() - 1);
        return strb.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Cannot be cloned");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        throw new IOException("This operation is not supported");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        throw new IOException("This operation is not supported");
    }

    private String getDateString() {
        String date = null;
        DateFormat df = null;
        try {
            df = new SimpleDateFormat("dd MMM yyyy");
            date = df.format(this.dob);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return date;
        
    }
}
