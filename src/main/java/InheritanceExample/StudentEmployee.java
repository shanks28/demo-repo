package InheritanceExample;

public class StudentEmployee extends Student {
    private double rateofpayperhour;
    private String employeeid;

    public StudentEmployee(String firstname,String lastname,String studentid,double rateofpayperhour,String employeeid){
        super(firstname,lastname,studentid);
        this.employeeid=employeeid;
        this.rateofpayperhour=rateofpayperhour;

    }
    public String getEmployeeid(){
        return employeeid;
    }
    public double getRateofpayperhour(){
        return rateofpayperhour;
    }
    public void setRateofpayperhour(double rateofpayperhour){
        this.rateofpayperhour=rateofpayperhour;
    }
    public void setEmployeeid(String employeeid){
        this.employeeid=employeeid;
    }
    @Override
    public String toString(){
        return "rate of pay"+rateofpayperhour+"emp id"+employeeid+super.toString();
    }
}
