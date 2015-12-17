package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Test
{
    protected Long employeeId;

    protected String name;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public  Long getEmployeeId()
    {
        return employeeId;
    }

    public  void setEmployeeId(Long employeeId)
    {
        this.employeeId = employeeId;
    }

    @Column(name="TITLE")
    public  String getName()
    {
        return name;
    }

    public  void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
    }

}