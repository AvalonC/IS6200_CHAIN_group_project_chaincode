package org.hyperledger.fabric.samples.assettransfer;

import java.util.Objects;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import com.owlike.genson.annotation.JsonProperty;

@DataType()
public final class Asset {
    @Property()
    private final String employeeID;

    @Property()
    private final String name;

    @Property()
    private final String birthday;

    @Property()
    private final String graduateSchool;

    @Property()
    private final String jobTitle;

    @Property()
    private final String department;

    @Property()
    private final float salary;

    @Property()
    private final String cardNumber;

    @Property()
    private final String record;


    public String getEmployeeID() {
        return employeeID;
    }


    public String getName() {
        return name;
    }


    public String getBirthday() {
        return birthday;
    }


    public String getGraduateSchool() {
        return graduateSchool;
    }


    public String getJobTitle() {
        return jobTitle;
    }


    public String getDepartment() {
        return department;
    }


    public float getSalary() {
        return salary;
    }


    public String getCardNumber() {
        return cardNumber;
    }


    public String getRecord() {
        return record;
    }



    public Asset(@JsonProperty("employeeID") final String employeeID, @JsonProperty("name") final String name,
                 @JsonProperty("birthday") final String birthday, @JsonProperty("graduateSchool") final String graduateSchool,
                 @JsonProperty("jobTitle") final String jobTitle, @JsonProperty("department") final String department,
                 @JsonProperty("salary") final float salary, @JsonProperty("cardNumber") final String cardNumber, @JsonProperty("record") final String record) {
        this.employeeID = employeeID;
        this.name = name;
        this.birthday = birthday;
        this.graduateSchool = graduateSchool;
        this.jobTitle = jobTitle;
        this.department = department;
        this.salary = salary;
        this.cardNumber = cardNumber;
        this.record = record;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        Asset other = (Asset) obj;

        return Objects.deepEquals(
                new String[]{getEmployeeID(), getName(), getBirthday(), getGraduateSchool(), getJobTitle(),
                        getDepartment()},
                new String[]{other.getEmployeeID(), other.getName(), other.getBirthday(), other.getGraduateSchool(), other.getJobTitle(),
                        other.getDepartment()})
                &&
                Objects.deepEquals(
                        new String[]{getRecord(), getCardNumber()},
                        new String[]{other.getRecord(), other.getCardNumber()});
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeID(), getName(), getBirthday(), getGraduateSchool(), getJobTitle(),
                getDepartment(), getSalary(), getRecord());
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + "[employeeID=" + employeeID + ", name=" + name + ", birthday=" + birthday + ", graduateSchool=" + graduateSchool
                + ", jobTitle=" + jobTitle + ", department=" + department + ", salary=" + salary + ", cardNumber="
                + cardNumber + ", record=" + record + "]";
    }


}