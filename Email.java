public class Email extends Contacts{
    private String email;
    Email(String email,String type,String description){
        super(type,description);
        this.setEmail(email);
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return "";
    }
    public String getPlace(){
        return "";
    }
    
    public void setPhone(String newContent){}
    public void setPlace(String newContent){}
    

}
