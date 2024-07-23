import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;
// import package.java;
// import java.util.Comparator;
// import java.util.Collections;
// import java.util.LinkedHashMap;
// import java.util.LinkedHashSet;
// import java.util.LinkedList;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.TreeMap;
// import java.util.TreeSet;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;

public class Main {
    final static float PI = 3.14f;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Contact contact=new Contact();

        User ahmed = new User("ak1","ahmed","khaled","male","new york","23 august");
        User mohamed = new User("ma2","mohammed","ahmed","male","new york","23 august");
        User ibrahim = new User("ia3","ibrahim","ali","male","new york","23 august");
        User youssef = new User("ya4","youssef","abdallah","male","new york","23 august");
        
        //<------------------add users--------------->
        
        contact.AddUser(ahmed);
        contact.AddUser(mohamed);
        contact.AddUser(ibrahim);
        contact.AddUser(youssef);

        //<------------------edit user info--------------->
        System.out.print("Enter the ID of the user your want to edit : ");
        String userId = scanner.next();
        System.out.println();
        contact.EditUser(userId);
        
        //<------------------delete user--------------->
        
        System.out.print("Enter the ID of the user your want to delete : ");
        String userIdDel = scanner.next();
        System.out.println();
        contact.DeleteUser(userIdDel);
        

        //<------------------show all users--------------->
        contact.ShowAll();
        System.out.println("The number of our users is : "+contact.CountUser());


        //<-------------------set contact info---------------------------->
        Email ahmedEmail = new Email("ahmedKhaled23@gmail.com", "email", "this is my first email");
        Phone ahmedPhone = new Phone("010123456789", "phone", "this is my first phone");
        Address ahmedAddress = new Address("kafrelshekh,dessouk", "email", "this is my current address");
        ahmed.setContactInfo(ahmedEmail, ahmedPhone, ahmedAddress);
        
        System.out.print("Enter the type of the contact info you want to know : ");
        String contactType = scanner.next();
        System.out.println();
        ahmed.searchContactInfo(contactType);
        
    } 

    
}
