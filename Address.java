public class Address extends Contacts{
    private String place;
    Address(String place,String type,String description){
        super(type,description);
        this.setPlace(place);
    }
    public void setPlace(String place){
        this.place=place;
    }
    public String getPlace(){
        return this.place;
    }
    public String getPhone(){
        return "";
    }
    public String getEmail(){
        return "";
    }
    public void setPhone(String newContent){}
    public void setEmail(String newContent){}
    
}
