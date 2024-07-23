import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


/* complete the edit of contact info and its options*/
public class Contact {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<User>users=new ArrayList<>() ;
    private static int numberOfUsers;
    public void Contact(){

    }
    public void AddUser(User user){
        users.add(user);
        System.out.println("Congrats,the user "+user.getFullName()+" is added successfully.");
    }
    public void EditUser(String userId){
        boolean userFound=false;
        for(User user:users){
            if(user.getUserId().equals(userId)){
                System.out.println("1- First Name");
                System.out.println("2- Last Name");
                System.out.println("3- Gender");
                System.out.println("4- City");
                System.out.println("5- Contact Info");
                System.out.print("choose what you want to edit: (Enter the number)");
                try{
                    int userChoice=scanner.nextInt();
                    System.out.println();
                    switch (userChoice) {
                        case 1:
                            System.out.print("Enter the new First Name : ");
                            String newFirstName = scanner.next();
                            user.setFirstName(newFirstName);
                            System.out.println("First name is updated successfully!.");
                            break;
                        case 2:
                            System.out.print("Enter the new Last Name : ");
                            String newLastName = scanner.next();
                            user.setLastName(newLastName);
                            System.out.println("Last name is updated successfully!.");
                            break;
                        case 3:
                            System.out.print("Enter the new Gender : ");
                            String newGender = scanner.next();
                            user.setGender(newGender);
                            System.out.println("Gender is updated successfully!.");
                            break;
                        case 4:
                            System.out.print("Enter the new city : ");
                            String newCity = scanner.next();
                            user.setCity(newCity);
                            System.out.println("City is updated successfully!.");
                            break;
                        case 5:
                            System.out.print("Enter the type of contact info you want to change: ");
                            String contactType = scanner.next();
                            System.out.println("Choose what you want to change from the selected contact info (Enter number): ");
                            System.out.println("1- Contact Type");
                            System.out.println("2- Contact content");
                            System.out.println("3- Contact Description");
                            int changedContact =scanner.nextInt();
                            switch (changedContact) {
                                case 1:
                                    System.out.print("Enter the new Type : ");
                                    String newType = scanner.next();
                                    
                                    break;
                                case 2:

                                    break;
                                case 3 :
                                    break;
                                default:
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Error, your choice is not found;");
                            EditUser(userId);
                            break;
                    }
                }catch(Exception e){
                    System.out.println("It's not a valid input ,Try Again!.");
                    EditUser(userId);
                }
                userFound=true;
                break;
            }
        }
        if(!userFound){
            System.out.println("Sorry, user with entered ID is not found");
        }
    }
    public int CountUser(){
        numberOfUsers=users.size();
        return numberOfUsers;
    }
    public void SearchUser(String userId){
        for(User user:users){
            if(user.getUserId()==userId){
                user.showUserInfo();
                System.out.println();
            }else{
                System.out.println("Sorry,user with the entered ID is not found.");
            }
        }
    }
    public void DeleteUser(String userId){
        Iterator<User>iterator=users.iterator();
        boolean userFound = false;
        while(iterator.hasNext()){
            User currentUser = iterator.next();
            if(userId .equals(currentUser.getUserId())){
                
                users.remove(currentUser);
                System.out.println("User deleted successfully.");
                userFound = true;
                break;
            }
        }
        if (!userFound) {
            System.out.println("Sorry, user with the entered ID is not found.");
        }
    }
    public void ShowAll(){
        System.out.println("They are our users.");
        for(User user:users){
            System.out.println(user.getUserId());
            user.showUserInfo();
            System.out.println();
        }
    }
    

}
