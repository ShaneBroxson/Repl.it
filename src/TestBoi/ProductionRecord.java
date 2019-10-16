package TestBoi;

import java.util.Date;

public class ProductionRecord {
    private int prodNum;
    private int prodID;
    private String serialNum;
    //private String date;
    Date currentDate = new Date();

    ProductionRecord(int prodNum, int prodID, String serialNum, Date currentDate){
        this.prodNum = prodNum;
        this.prodID = prodID;
        this.serialNum = serialNum;
        this.currentDate = currentDate;
    }
    public String toString() {
        return "Production Num: " + prodNum + " Product ID: " + prodID + " Serial Num: " + serialNum + " Date: " + currentDate;
    }


    public void setProductionNum(int prodNum){
        this.prodNum = prodNum;
    }
    public void setProductID(int prodID){
        this.prodID = prodID;
    }
    public void setSerialNum(String serialNum){
        this.serialNum = serialNum;
    }
    public void setProdDate(Date currentDate){
        this.currentDate = currentDate;
    }

    public int getProductionNum(){
        return this.prodNum;
    }
    public int getProductID(){
        return this.prodID;
    }
    public String getSerialNum(){
        return this.serialNum;
    }
    public Date getProdDate(){
        return currentDate;
    }
}