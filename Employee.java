public class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int i,String fn,String ln,int s){
        id=i;
        firstName=fn;
        lastName=ln;
        salary=s;
    }

    public int getID(){
        return id;
    }
    public String getFirstname(){
        return firstName;
    }
    public String getLastname(){
        return lastName;
    }
    public String getName(){
        return '"'+firstName+' '+lastName+'"';
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int new_s){
        salary=new_s;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        salary=salary+(salary*percent/100);
        return salary;
    }
    public String toString(){
        return "Employee[id= "+id+",name= "+firstName+" "+lastName+",salary= "+salary+"]";
    }
}