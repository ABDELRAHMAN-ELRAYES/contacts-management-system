public class Phone extends Contacts {
    private String phone;
    Phone(String phone,String type,String description){
        super(type,description);
        this.setPhone(phone);
    }
    public void setPhone(String  phone){
        this.phone=phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getPlace(){
        return "";
    }
    public String getEmail(){
        return "";
    }
    public void setPlace(String newContent){}
    public void setEmail(String newContent){}
    
}
