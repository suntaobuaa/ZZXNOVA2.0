package test.nova;

public class MyInfo {
    private int myAge;
    private String myName; 
    private String myAddress;
    private String myEducation;
    
    public  MyInfo(){ }
    
    public int getMyAge (){
        return myAge;
    }  
    public void setMyAge (int age){
        this.myAge=age;
    }
    
    
    public String getMyName() {
        return myName;
    }
    public void setMyName(String name) {
        this.myName=name;
    }
    
    public String getMyAddress() {
        return myAddress;
    }
    public void setMyAddress(String address) {
        this.myAddress=address;
    }

    public String getMyEducation() {
        return myEducation;
    }
    public void setMyEducation (String education){
        this.myEducation=education;
    }
}
