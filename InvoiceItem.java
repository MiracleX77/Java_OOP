public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String i,String d ,int q,double u){
        id=i;
        desc=d;
        qty=q;
        unitPrice=u;
    }
    public String getID(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int new_qty){
        qty=new_qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double new_unit){
        unitPrice=new_unit;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    public String toString(){
        return "InvoiceItem[id= "+id+",desc= "+desc+",qty= "+qty+",unitPrice= "+unitPrice+"]";
    } 

    
}
