import java.util.ArrayList;

public class User{
    private String id;
    private String firstName;
    private String lastName;
    private String gender;
    private String city;
    private String addedDate;
    public ArrayList<Contacts>contactInfo = new ArrayList<>();
    User(String id,String firstName,String lastName,String gender,String city,String addedDate){
        this.id=id;
        this.addedDate=addedDate;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGender(gender);
        this.setCity(city);
    }
    public void searchContactInfo(String type){
        String contactContent="";
        String contactDescription="";
        boolean contactFound = false;
        for(Contacts contact:contactInfo){
            if(type.toLowerCase().equals(contact.getType())){
                switch (type) {
                    case "phone":
                        contactContent=contact.getPhone();
                        break;
                    case "email":
                        contactContent=contact.getEmail();
                        break;
                    case "Address":
                        contactContent=contact.getPlace();
                        break;
                    default:
                        System.out.println("Sorry,this type of contact is not found ,Try Again!.");
                        break;
                }
                contactDescription=contact.getDescription();
                contactFound=true;
                break;
            }

        }
        if(contactFound){
            System.out.println("Your "+type+" is "+ contactContent+" and its description is //-> "+contactDescription);
        }else{
            System.out.println("Sorry,this type of contact is not found ,Try Again!.");
        }
    }
    public void showUserInfo(){
        System.out.println("Hi,my name is "+this.getFullName()+" and i am a "+this.gender+" live in "+this.city+ " joined in "+this.addedDate);
    }
    public String getFullName(){
        return this.firstName+" "+this.lastName;
    }
    public String getUserId(){
        return this.id;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setContactInfo(Email email,Phone phone , Address address){
        contactInfo.add(email);
        contactInfo.add(phone);
        contactInfo.add(address);
    }
}
