
package electronics_shop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Electronics_shop {

static void password(){
        String temp;
        String pass2;
 try
 {
     File pass=new File("Password.txt");
     Scanner input = new Scanner(pass);
         pass2=input.nextLine();
     input.close();
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter old password: ");
     String passold=scan.nextLine();
     if(pass2.equalsIgnoreCase(passold)){
         Scanner sc = new Scanner(System.in);
     File file = new File("Password.txt");
     FileWriter fr = new FileWriter(file, true);
     BufferedWriter br = new BufferedWriter(fr);
     PrintWriter pr = new PrintWriter(br);
     System.out.print("Enter new password: ");
     temp = sc.nextLine();
     pr.println(temp);
 
pr.close();
br.close();
fr.close();
  try
 { 
  
     String del_name = passold;
     String content = "";
     File myObj = new File("Password.txt");
     Scanner myReader = new Scanner(myObj);
     
     StringBuffer buffer = new StringBuffer();
     while (myReader.hasNextLine()) {
        String name = myReader.nextLine();
        
         
        if(!name.equalsIgnoreCase(del_name))
        {
            buffer.append(name+System.lineSeparator());
        }
       
      }
     content = buffer.toString();
     System.out.println("Password Changed Successful");
     FileWriter writer = new FileWriter("Password.txt");
     writer.append(content);
     writer.flush();
 }
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }  
 catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
 }
     }
     else{
         System.out.println("Incorrect password");
     }
}
catch(IOException e) {
		e.printStackTrace();
             
         }


    }
static void file_create(){
    try {
        File password=new File("Password.txt");
        password.createNewFile();
        //phone
      File xiomi = new File("Xiomi.txt");
      xiomi.createNewFile();
      File vivo = new File("Vivo.txt");
      vivo.createNewFile();
      File samsung = new File("Samsung.txt");
      samsung.createNewFile();
      File oppo = new File("Oppo.txt");
      oppo.createNewFile();
      File iphone = new File("iphone.txt");
      iphone.createNewFile();
      //laptop
      File hp = new File("HP.txt");
      hp.createNewFile();
      File asus = new File("Asus.txt");
      asus.createNewFile();
      File dell = new File("Dell.txt");
      dell.createNewFile();
      File acer = new File("Acer.txt");
      acer.createNewFile();
      File apple = new File("Apple.txt");
      apple.createNewFile();
      //TV
      File conion = new File("Conion_TV.txt");
      conion.createNewFile();
      File lg = new File("LG_TV.txt");
      lg.createNewFile();
      File sony = new File("Sony_TV.txt");
      sony.createNewFile();
      File samsung_tv = new File("Samsung_TV.txt");
      samsung_tv.createNewFile();
      //AC
      File general = new File("General_Ac.txt");
      general.createNewFile();
      File walton = new File("Walton_AC.txt");
      walton.createNewFile();
      File whirlpool = new File("Whirlpool_AC.txt");
      whirlpool.createNewFile();
      File eco = new File("Eco+_AC.txt");
      eco.createNewFile();
      //fridge
      File conion_fr = new File("Conion_fridge.txt");
      conion_fr.createNewFile();
      File whirlpool_fr = new File("Whirlpool_fridge.txt");
      whirlpool_fr.createNewFile();
      File walton_fr = new File("Walton_fridge.txt");
      walton_fr.createNewFile();
      File hitachi_fr = new File("Hitachi_fridge.txt");
      hitachi_fr.createNewFile();
 } 
 catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }
}
static void Smart_phone_add(){
        Scanner input = new Scanner(System.in);
    String note,txt=null;
    int i=1;
    while(i<2){
    System.out.print("\nBrands available\n1.Xiomi\n2.iphone\n3.Samsung\n4.Vivo\n5.Oppo\nPress any option(1-5) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Xiomi.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="iphone.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Samsung.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Vivo.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("5")){
        txt="Oppo.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-5)");
    }
  }
 try
 {
     File file = new File(txt);
     FileWriter fr = new FileWriter(file, true);
     BufferedWriter br = new BufferedWriter(fr);
     PrintWriter pr = new PrintWriter(br);
     System.out.print("Enter Model Name: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter Price: ");
     note = input.nextLine();
     pr.println(note) ;
     System.out.print("Enter Bettery: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter Internal Ram in GB: ");
     note = input.nextLine();
     pr.println(note) ;
     
 
pr.close();
br.close();
fr.close();
}     
catch(IOException e) {
		e.printStackTrace();
             
         }
    System.out.println("Item added successful");
    }
static void Smart_phone_search(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    int count=0;
    while(true){
    System.out.print("\nBrands available\n1.Xiomi\n2.iphone\n3.Samsung\n4.Vivo\n5.Oppo\nPress any option(1-5) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Xiomi.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="iphone.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Samsung.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Vivo.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("5")){
        txt="Oppo.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-5)");
    }
    }
       String name,pri,bet,dis;
 try {
      File raihan = new File(txt);
      input = new Scanner(raihan);
      while (input.hasNextLine()) {
        name = input.nextLine();
        pri = input.nextLine();
        bet=input.nextLine();
        dis=input.nextLine();
        System.out.println("Model name:"+name+"\nPrice:"+pri+"\nBettery:"+bet+"mah"+"\nDisplay: "+dis+" inches\n");
        count++;
      }
 } 
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }
   System.out.println("\nAvailable item: "+count+" pieces"); 
}
static void Smart_phone_change(){
     
    Scanner choice = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("\nBrands available\n1.Xiomi\n2.iphone\n3.Samsung\n4.Vivo\n5.Oppo\nPress any option(1-5) that brand you looking for: ");
    String ca=choice.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Xiomi.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="iphone.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Samsung.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Vivo.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("5")){
        txt="Oppo.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-5)");
    }
    }
    Scanner sc = new Scanner(System.in);
 System.out.print("\nEnter Model Name: ");
 String n = sc.nextLine();
 String content;
 try
 { 
     File phone = new File(txt);
     Scanner input = new Scanner(phone);
     int j=1;
     StringBuffer buffer = new StringBuffer();
     while (input.hasNextLine()) {
        String name = input.nextLine();
        double price = Double.parseDouble(input.nextLine());
        String add = input.nextLine();
        String sal = input.nextLine();
        
     
        if(name.equalsIgnoreCase(n))
        {
            while(true){
            String c;
            System.out.print("If you want to increase price then press 1 or if you want to decrease price then press 2: ");
            c=sc.nextLine();
            if(c.equalsIgnoreCase("1")){
                System.out.print("\nEnter inrease amount: ");
                String i=sc.nextLine();
                price=price+Double.parseDouble(i);
                break;
            }
            else if(c.equalsIgnoreCase("2")){
                System.out.print("\nEnter derease amount: ");
                String d=sc.nextLine();
                price=price-Double.parseDouble(d);
                break;
            }
            else{
                System.out.println("Invalid press. please press option 1 or 2");
            }
            }
            
            j++;
        }
        buffer.append(name+System.lineSeparator());
        buffer.append(String.valueOf(price)+System.lineSeparator());
        buffer.append(add+System.lineSeparator());
        buffer.append(sal+System.lineSeparator());
      }
     content = buffer.toString();
     if(j==1){
         System.out.println("Invalid name. please enter a valid name");
     }
     else{
         System.out.println("\nPrice changed successful");
     }
     FileWriter writer = new FileWriter(txt);
         writer.append(content);
         writer.flush();
 }
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }  
 catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
 }
 
}
static void Smart_phone_sell(){
    Scanner choice = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("\nBrands available\n1.Xiomi\n2.iphone\n3.Samsung\n4.Vivo\n5.Oppo\nPress any option(1-5) that brand you looking for: ");
    String ca=choice.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Xiomi.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="iphone.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Samsung.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Vivo.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("5")){
        txt="Oppo.txt";
        break;
    }
    else{
        System.out.println("\nInvalid press. Please press in range(1-5)");
    }
    }
    try {
            Scanner in;
            in = new Scanner(System.in);
            int j=1;

            System.out.print("\nEnter Model Name: ");
            String del_name = in.nextLine();
            String content = "";
            File myObj = new File(txt);
            Scanner myReader = new Scanner(myObj);

            StringBuffer buffer = new StringBuffer();
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                double age = Double.parseDouble(myReader.nextLine());
                String add = myReader.nextLine();
                String sal = myReader.nextLine();

                if (!name.equalsIgnoreCase(del_name)) {
                    buffer.append(name + System.lineSeparator());
                    buffer.append(String.valueOf(age) + System.lineSeparator());
                    buffer.append(add + System.lineSeparator());
                    buffer.append(sal + System.lineSeparator());
                }
                if(name.equalsIgnoreCase(del_name)){
                    j++;
                }

            }
            content = buffer.toString();
            if(j==1){
                System.out.println("\nInvalid Model name. Please enter a valid name");
            }
            else{
                System.out.println("\nItem sell successful");
            }
            FileWriter writer = new FileWriter(txt);
            writer.append(content);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
        }
}
static void Laptop_add(){
     Scanner input = new Scanner(System.in);
    String note,txt=null;
    int i=1;
    while(i<2){
    System.out.print("\nBrands available\n1.HP\n2.Asus\n3.Dell\n4.Acer\n5.Apple\nPress any option(1-5) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="HP.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Asus.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Dell.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Acer.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("5")){
        txt="Apple.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-5)");
    }
  }
 try
 {
     File file = new File(txt);
     FileWriter fr = new FileWriter(file, true);
     BufferedWriter br = new BufferedWriter(fr);
     PrintWriter pr = new PrintWriter(br);
     System.out.print("Enter Model Name: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter Price: ");
     note = input.nextLine();
     pr.println(note) ;
     System.out.print("Enter Ram Storage in GB: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter Display Size in inches: ");
     note = input.nextLine();
     pr.println(note) ;
     System.out.print("Enter Processor identity: ");
     note = input.nextLine();
     pr.println(note) ;
     
 
pr.close();
br.close();
fr.close();
}     
catch(IOException e) {
		e.printStackTrace();
             
         }
    System.out.println("Item added successful");
}
static void Laptop_search(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    int i=1,count=0;
    while(i<2){
    System.out.print("\nBrands available\n1.HP\n2.Asus\n3.Dell\n4.Acer\n5.Apple\nPress any option(1-5) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="HP.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Asus.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Dell.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Acer.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("5")){
        txt="Apple.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-5)");
    }
    }
       String name,pri,hd,dis,gen;
 try {
      File raihan = new File(txt);
      input = new Scanner(raihan);
      while (input.hasNextLine()) {
        name = input.nextLine();
        pri = input.nextLine();
        hd=input.nextLine();
        dis=input.nextLine();
        gen=input.nextLine();
        System.out.println("\nModel name:"+name+"\nPrice:"+pri+"\nRam:"+hd+"GB"+"\nDisplay: "+dis+" inches\n"+"Processor: "+gen);
        count++;
      }
 } 
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }
    System.out.println("\nAvailable item: "+count+" pieces");
}
static void Laptop_change(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("Brands available\n1.HP\n2.Asus\n3.Dell\n4.Acer\n5.Apple\nPress any option(1-5) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="HP.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Asus.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Dell.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Acer.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("5")){
        txt="Apple.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-5)");
    }
    }
    Scanner sc = new Scanner(System.in);
 System.out.print("Enter Name: ");
 String n = sc.nextLine();
 String content;
 try
 { 
     File phone = new File(txt);
     Scanner scan = new Scanner(phone);
     int j=1;
     StringBuffer buffer = new StringBuffer();
     while (scan.hasNextLine()) {
        String name = scan.nextLine();
        double price = Double.parseDouble(scan.nextLine());
        String add = scan.nextLine();
        String sal = scan.nextLine();
        String pro = scan.nextLine();
        
     
        if(name.equalsIgnoreCase(n))
        {
            while(true){
            String c;
            System.out.print("If you want to increase price then press 1 or if you want to decrease price then press 2: ");
            c=sc.nextLine();
            if(c.equalsIgnoreCase("1")){
                System.out.print("Enter inrease amount: ");
                String i=sc.nextLine();
                price=price+Double.parseDouble(i);
                break;
            }
            else if(c.equalsIgnoreCase("2")){
                System.out.print("Enter derease amount: ");
                String d=sc.nextLine();
                price=price-Double.parseDouble(d);
                break;
            }
            else{
                System.out.println("Invalid press. please press option 1 or 2");
            }
            }
            
            j++;
        }
        buffer.append(name+System.lineSeparator());
        buffer.append(String.valueOf(price)+System.lineSeparator());
        buffer.append(add+System.lineSeparator());
        buffer.append(sal+System.lineSeparator());
        buffer.append(pro+System.lineSeparator());
      }
     content = buffer.toString();
     if(j==1){
         System.out.println("Invalid name. please enter a valid name");
     }
     else{
         System.out.println("Price changed successful");
     }
     FileWriter writer = new FileWriter(txt);
         writer.append(content);
         writer.flush();
 }
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }  
 catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
 }
}
static void Laptop_sell(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("\nBrands available\n1.HP\n2.Asus\n3.Dell\n4.Acer\n5.Apple\nPress any option(1-5) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="HP.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Asus.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Dell.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Acer.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("5")){
        txt="Apple.txt";
        break;
    }
    else{
        System.out.println("\nInvalid press. Please press in range(1-5)");
    }
    }
    try {
            Scanner in;
            in = new Scanner(System.in);
            int j=1;

            System.out.print("\nEnter Model Name: ");
            String del_name = in.nextLine();
            String content = "";
            File myObj = new File(txt);
            Scanner myReader = new Scanner(myObj);

            StringBuffer buffer = new StringBuffer();
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                double age = Double.parseDouble(myReader.nextLine());
                String add = myReader.nextLine();
                String sal = myReader.nextLine();
                String pro = myReader.nextLine();

                if (!name.equalsIgnoreCase(del_name)) {
                    buffer.append(name + System.lineSeparator());
                    buffer.append(String.valueOf(age) + System.lineSeparator());
                    buffer.append(add + System.lineSeparator());
                    buffer.append(sal + System.lineSeparator());
                    buffer.append(pro + System.lineSeparator());
                }
                if(name.equalsIgnoreCase(del_name)){
                    j++;
                }

            }
            content = buffer.toString();
            if(j==1){
                System.out.println("Invalid Model name. Please enter a valid name");
            }
            else{
                System.out.println("Item sell successful");
            }
            FileWriter writer = new FileWriter(txt);
            writer.append(content);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
        }
}
static void TV_search(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    int i=1,count=0;
    while(i<2){
    System.out.print("\nBrands available\n1.Samsung\n2.Sony\n3.LG\n4.Conion\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Samsung_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Sony_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="LG_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Conion_TV.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-4)");
    }
    }
       String name,pri,dis,wa;
 try {
      File raihan = new File(txt);
      input = new Scanner(raihan);
      while (input.hasNextLine()) {
        name = input.nextLine();
        pri = input.nextLine();
        dis=input.nextLine();
        wa=input.nextLine();
        System.out.println("\nModel name:"+name+"\nPrice BDT:"+pri+"\nDisplay:"+dis+" inches"+"\n"+wa+" years warrenty");
        count++;
      }
 } 
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }
    System.out.println("\nAvailable item: "+count+" pieces");
}
static void TV_add(){
    Scanner input = new Scanner(System.in);
    String note,txt=null;
    int i=1;
    while(i<2){
    System.out.print("\nBrands available\n1.Samsung\n2.Sony\n3.LG\n4.Conion\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Samsung_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Sony_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="LG_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Conion_TV.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-5)");
    }
  }
 try
 {
     File file = new File(txt);
     FileWriter fr = new FileWriter(file, true);
     BufferedWriter br = new BufferedWriter(fr);
     PrintWriter pr = new PrintWriter(br);
     System.out.print("Enter Model Name: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter Price: ");
     note = input.nextLine();
     pr.println(note) ;
     System.out.print("Enter Display size in inches: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter Warrenty im years: ");
     note = input.nextLine();
     pr.println(note) ;
 
pr.close();
br.close();
fr.close();
}     
catch(IOException e) {
		e.printStackTrace();
             
         }
    System.out.println("Item added successful");
}
static void TV_change(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("Brands available\n1.Samsung\n2.Sony\n3.LG\n4.Conion\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Samsung_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Sony_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="LG_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Conion_TV.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-4)");
    }
  }
     Scanner sc = new Scanner(System.in);
 System.out.print("Enter Name: ");
 String n = sc.nextLine();
 String content;
 try
 { 
     File phone = new File(txt);
     Scanner scan = new Scanner(phone);
     int j=1;
     StringBuffer buffer = new StringBuffer();
     while (scan.hasNextLine()) {
        String name = scan.nextLine();
        double price = Double.parseDouble(scan.nextLine());
        String add = scan.nextLine();
        String sal = scan.nextLine();
        
     
        if(name.equalsIgnoreCase(n))
        {
            while(true){
            String c;
            System.out.print("If you want to increase price then press 1 or if you want to decrease price then press 2: ");
            c=sc.nextLine();
            if(c.equalsIgnoreCase("1")){
                System.out.print("Enter inrease amount: ");
                String i=sc.nextLine();
                price=price+Double.parseDouble(i);
                break;
            }
            else if(c.equalsIgnoreCase("2")){
                System.out.print("Enter derease amount: ");
                String d=sc.nextLine();
                price=price-Double.parseDouble(d);
                break;
            }
            else{
                System.out.println("Invalid press. please press option 1 or 2");
            }
            }
            
            j++;
        }
        buffer.append(name+System.lineSeparator());
        buffer.append(String.valueOf(price)+System.lineSeparator());
        buffer.append(add+System.lineSeparator());
        buffer.append(sal+System.lineSeparator());
      }
     content = buffer.toString();
     if(j==1){
         System.out.println("Invalid name. please enter a valid name");
     }
     else{
         System.out.println("Price changed successful");
     }
     FileWriter writer = new FileWriter(txt);
         writer.append(content);
         writer.flush();
 }
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }  
 catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
 }
}
static void TV_sell(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("\nBrands available\n1.Samsung\n2.Sony\n3.LG\n4.Conion\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Samsung_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Sony_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="LG_TV.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Conion_TV.txt";
        break;
    }
    else{
        System.out.println("\nInvalid press. Please press in range(1-4)");
    }
  }
    try {
            Scanner in;
            in = new Scanner(System.in);
            int j=1;

            System.out.print("\nEnter Model Name: ");
            String del_name = in.nextLine();
            String content = "";
            File myObj = new File(txt);
            Scanner myReader = new Scanner(myObj);

            StringBuffer buffer = new StringBuffer();
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                double age = Double.parseDouble(myReader.nextLine());
                String add = myReader.nextLine();
                String sal = myReader.nextLine();

                if (!name.equalsIgnoreCase(del_name)) {
                    buffer.append(name + System.lineSeparator());
                    buffer.append(String.valueOf(age) + System.lineSeparator());
                    buffer.append(add + System.lineSeparator());
                    buffer.append(sal + System.lineSeparator());
                }
                if(name.equalsIgnoreCase(del_name)){
                    j++;
                }

            }
            content = buffer.toString();
            if(j==1){
                System.out.println("Invalid Model name. Please enter a valid name");
            }
            else{
                System.out.println("Item sell successful");
            }
            FileWriter writer = new FileWriter(txt);
            writer.append(content);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
        }
}
static void AC_search(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    int i=1,count=0;
    while(i<2){
    System.out.print("\nBrands available\n1.General\n2.Whirlpool\n3.Eco+\n4.Walton\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="General_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Whirlpool_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Eco+_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Walton_AC.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-4)");
    }
    }
       String name,pri,ton,wa;
 try {
      File raihan = new File(txt);
      input = new Scanner(raihan);
      while (input.hasNextLine()) {
        name = input.nextLine();
        pri = input.nextLine();
        ton=input.nextLine();
        wa=input.nextLine();
        System.out.println("\nModel name:"+name+"\nPrice BDT:"+pri+"\n"+ton+" Ton"+"\n"+wa+" years compressor warrenty");
        count++;
      }
 } 
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }
    System.out.println("\nAvailable item: "+count+" pieces");
}
static void AC_add(){
    Scanner input = new Scanner(System.in);
    String note,txt=null;
    int i=1;
    while(i<2){
    System.out.print("\nBrands available\n1.General\n2.Whirlpool\n3.Eco+\n4.Walton\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="General_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Whirlpool_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Eco+_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Walton_AC.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-4)");
    }
  }
 try
 {
     File file = new File(txt);
     FileWriter fr = new FileWriter(file, true);
     BufferedWriter br = new BufferedWriter(fr);
     PrintWriter pr = new PrintWriter(br);
     System.out.print("Enter Model Name: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter Price: ");
     note = input.nextLine();
     pr.println(note) ;
     System.out.print("Enter Ton details: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter compressor Warrenty in years: ");
     note = input.nextLine();
     pr.println(note) ;
 
pr.close();
br.close();
fr.close();
}     
catch(IOException e) {
		e.printStackTrace();
             
         }
    System.out.println("\nItem added successful");
}
static void AC_change(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("Brands available\n1.General\n2.Whirlpool\n3.Eco+\n4.Walton\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="General_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Whirlpool_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Eco+_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Walton_AC.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-4)");
    }
  }
    Scanner sc = new Scanner(System.in);
 System.out.print("Enter Name: ");
 String n = sc.nextLine();
 String content;
 try
 { 
     File phone = new File(txt);
     Scanner scan = new Scanner(phone);
     int j=1;
     StringBuffer buffer = new StringBuffer();
     while (scan.hasNextLine()) {
        String name = scan.nextLine();
        double price = Double.parseDouble(scan.nextLine());
        String add = scan.nextLine();
        String sal = scan.nextLine();
        
     
        if(name.equalsIgnoreCase(n))
        {
            while(true){
            String c;
            System.out.print("If you want to increase price then press 1 or if you want to decrease price then press 2: ");
            c=sc.nextLine();
            if(c.equalsIgnoreCase("1")){
                System.out.print("Enter inrease amount: ");
                String i=sc.nextLine();
                price=price+Double.parseDouble(i);
                break;
            }
            else if(c.equalsIgnoreCase("2")){
                System.out.print("Enter derease amount: ");
                String d=sc.nextLine();
                price=price-Double.parseDouble(d);
                break;
            }
            else{
                System.out.println("Invalid press. please press option 1 or 2");
            }
            }
            
            j++;
        }
        buffer.append(name+System.lineSeparator());
        buffer.append(String.valueOf(price)+System.lineSeparator());
        buffer.append(add+System.lineSeparator());
        buffer.append(sal+System.lineSeparator());
      }
     content = buffer.toString();
     if(j==1){
         System.out.println("Invalid name. please enter a valid name");
     }
     else{
         System.out.println("Price changed successful");
     }
     FileWriter writer = new FileWriter(txt);
         writer.append(content);
         writer.flush();
 }
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }  
 catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
 }
}
static void AC_sell(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("\nBrands available\n1.General\n2.Whirlpool\n3.Eco+\n4.Walton\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="General_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Whirlpool_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Eco+_AC.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Walton_AC.txt";
        break;
    }
    else{
        System.out.println("\nInvalid press. Please press in range(1-4)");
    }
  }
    try {
            Scanner in;
            in = new Scanner(System.in);
            int j=1;

            System.out.print("\nEnter Model Name: ");
            String del_name = in.nextLine();
            String content = "";
            File myObj = new File(txt);
            Scanner myReader = new Scanner(myObj);

            StringBuffer buffer = new StringBuffer();
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                double age = Double.parseDouble(myReader.nextLine());
                String add = myReader.nextLine();
                String sal = myReader.nextLine();

                if (!name.equalsIgnoreCase(del_name)) {
                    buffer.append(name + System.lineSeparator());
                    buffer.append(String.valueOf(age) + System.lineSeparator());
                    buffer.append(add + System.lineSeparator());
                    buffer.append(sal + System.lineSeparator());
                }
                if(name.equalsIgnoreCase(del_name)){
                    j++;
                }

            }
            content = buffer.toString();
            if(j==1){
                System.out.println("Invalid Model name. Please enter a valid name");
            }
            else{
                System.out.println("Item sell successful");
            }
            FileWriter writer = new FileWriter(txt);
            writer.append(content);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
        }
}
static void Fridge_search(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    int i=1,count=0;
    while(i<2){
    System.out.print("Brands available\n1.Walton\n2.Whirlpool\n3.Conion\n4.Hitachi\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Walton_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Whirlpool_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Conion_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Hitachi_fridge.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-4)");
    }
    }
       String name,pri,cap,wa,clr;
 try {
      File raihan = new File(txt);
      input = new Scanner(raihan);
      while (input.hasNextLine()) {
        name = input.nextLine();
        pri = input.nextLine();
        cap=input.nextLine();
        wa=input.nextLine();
        clr=input.nextLine();
        System.out.println("\nModel name:"+name+"\nPrice BDT:"+pri+"\nCapacity:"+cap+" Liters"+"\n"+wa+" years compressor warrenty"+"\ncolor:"+clr);
        count++;
      }
 } 
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }
    System.out.println("\nAvailable item: "+count+" pieces");
}
static void Fridge_add(){
     Scanner input = new Scanner(System.in);
    String note,txt=null;
    int i=1;
    while(i<2){
    System.out.print("\nBrands available\n1.Walton\n2.Whirlpool\n3.Conion\n4.Hitachi\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Walton_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Whirlpool_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Conion_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Hitachi_fridge.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-4)");
    }
  }
 try
 {
     File file = new File(txt);
     FileWriter fr = new FileWriter(file, true);
     BufferedWriter br = new BufferedWriter(fr);
     PrintWriter pr = new PrintWriter(br);
     System.out.print("Enter Model Name: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter Price: ");
     note = input.nextLine();
     pr.println(note) ;
     System.out.print("Enter capacity in liters: ");
     note = input.nextLine();
     pr.println(note);
     System.out.print("Enter compressor Warrenty in years: ");
     note = input.nextLine();
     pr.println(note) ;
     System.out.print("Enter color: ");
     note = input.nextLine();
     pr.println(note) ;
 
pr.close();
br.close();
fr.close();
}     
catch(IOException e) {
		e.printStackTrace();
             
         }
    System.out.println("\nItem added successful");
}
static void Fridge_change(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("Brands available\n1.Walton\n2.Whirlpool\n3.Conion\n4.Hitachi\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Walton_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Whirlpool_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Conion_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Hitachi_fridge.txt";
        break;
    }
    else{
        System.out.println("Invalid press. Please press in range(1-4)");
    }
  }
    Scanner sc = new Scanner(System.in);
 System.out.print("Enter Name: ");
 String n = sc.nextLine();
 String content;
 try
 { 
     File phone = new File(txt);
     Scanner scan = new Scanner(phone);
     int j=1;
     StringBuffer buffer = new StringBuffer();
     while (scan.hasNextLine()) {
        String name = scan.nextLine();
        double price = Double.parseDouble(scan.nextLine());
        String add = scan.nextLine();
        String sal = scan.nextLine();
        String pro = scan.nextLine();
        
     
        if(name.equalsIgnoreCase(n))
        {
            while(true){
            String c;
            System.out.print("If you want to increase price then press 1 or if you want to decrease price then press 2: ");
            c=sc.nextLine();
            if(c.equalsIgnoreCase("1")){
                System.out.print("Enter inrease amount: ");
                String i=sc.nextLine();
                price=price+Double.parseDouble(i);
                break;
            }
            else if(c.equalsIgnoreCase("2")){
                System.out.print("Enter derease amount: ");
                String d=sc.nextLine();
                price=price-Double.parseDouble(d);
                break;
            }
            else{
                System.out.println("Invalid press. please press option 1 or 2");
            }
            }
            
            j++;
        }
        buffer.append(name+System.lineSeparator());
        buffer.append(String.valueOf(price)+System.lineSeparator());
        buffer.append(add+System.lineSeparator());
        buffer.append(sal+System.lineSeparator());
        buffer.append(pro+System.lineSeparator());
      }
     content = buffer.toString();
     if(j==1){
         System.out.println("Invalid name. please enter a valid name");
     }
     else{
         System.out.println("Price changed successful");
     }
     FileWriter writer = new FileWriter(txt);
         writer.append(content);
         writer.flush();
 }
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }  
 catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
 }
}
static void Fridge_sell(){
    Scanner input = new Scanner(System.in);
    String txt=null;
    while(true){
    System.out.print("\nBrands available\n1.Walton\n2.Whirlpool\n3.Conion\n4.Hitachi\nPress any option(1-4) that brand you looking for: ");
    String ca=input.nextLine();
    if(ca.equalsIgnoreCase("1")){
        txt="Walton_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("2")){
        txt="Whirlpool_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("3")){
        txt="Conion_fridge.txt";
        break;
    }
    else if(ca.equalsIgnoreCase("4")){
        txt="Hitachi_fridge.txt";
        break;
    }
    else{
        System.out.println("\nInvalid press. Please press in range(1-4)");
    }
  }
    try {
            Scanner in;
            in = new Scanner(System.in);
            int j=1;

            System.out.print("\nEnter Model Name: ");
            String del_name = in.nextLine();
            String content = "";
            File myObj = new File(txt);
            Scanner myReader = new Scanner(myObj);

            StringBuffer buffer = new StringBuffer();
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                double age = Double.parseDouble(myReader.nextLine());
                String add = myReader.nextLine();
                String sal = myReader.nextLine();
                String pro = myReader.nextLine();

                if (!name.equalsIgnoreCase(del_name)) {
                    buffer.append(name + System.lineSeparator());
                    buffer.append(String.valueOf(age) + System.lineSeparator());
                    buffer.append(add + System.lineSeparator());
                    buffer.append(sal + System.lineSeparator());
                    buffer.append(pro + System.lineSeparator());
                }
                if(name.equalsIgnoreCase(del_name)){
                    j++;
                }

            }
            content = buffer.toString();
            if(j==1){
                System.out.println("Invalid Model name. Please enter a valid name");
            }
            else{
                System.out.println("Item sell successful");
            }
            FileWriter writer = new FileWriter(txt);
            writer.append(content);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Electronics_shop.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public static void main(String[] args) {
        file_create();
        Scanner input = new Scanner(System.in);
        String c;
        while(true){
            System.out.print("\n1.For Customers\n2.For the owner of this shop\n3.For Exit of this shop\nPress any option(1-3): ");
            c=input.nextLine();
            if(c.equalsIgnoreCase("1")){
                while(true){
                System.out.print("\nWelcome to our Shop!\nWe have the products in the store is\n1.Smart phone\n2.Laptop\n3.Air conditioner\n4.Television\n5.Refrigerator\n6.For previous menu\nPress any option(1-6) that product you want: ");
                String cus = input.nextLine();
                if(cus.equalsIgnoreCase("1")){
                    Smart_phone_search();
                    break;
                }
                else if(cus.equalsIgnoreCase("2")){
                    Laptop_search();
                    break;
                }
                else if(cus.equalsIgnoreCase("3")){
                    AC_search();
                    break;
                }
                else if(cus.equalsIgnoreCase("4")){
                    TV_search();
                    break;
                }
                else if(cus.equalsIgnoreCase("5")){
                    Fridge_search();
                    break;
                }
                else if(cus.equalsIgnoreCase("6")){
                    break;
                }
                else{
                    System.out.println("Invalid press. Please press a valid option(1-6)");
                }
              }
            }
            else if(c.equalsIgnoreCase("2")){
                System.out.print("This option is only for the owner of this shop. If you access this option then enter password: ");
                String pass2;
                try
                {
                    File pass=new File("Password.txt");
                    Scanner enter = new Scanner(pass);
                    pass2=enter.nextLine();
                    enter.close();
                    Scanner scan = new Scanner(System.in);
                    String passold=scan.nextLine();
                    if(pass2.equalsIgnoreCase(passold)){
                        while(true){
                        System.out.print("\nWelcome sir! What you want to do\n1.For sell a product\n2.For add a product\n3.For change a product price\n4.For change password\n5.For previous menu\nPress any option(1-5)that you want: ");
                        String own=scan.nextLine();
                        if(own.equalsIgnoreCase("1")){
                            while(true){
                            System.out.print("\nWhich product do you want to sell\n1.Smart phone\n2.Laptop\n3.Air conditioner\n4.Television\n5.Refrigerator\n6.For Previous menu\nPress any option(1-5)that you want: ");
                            String sell=scan.nextLine();
                            if(sell.equalsIgnoreCase("1")){
                                Smart_phone_sell();
                                break;
                            }else if(sell.equalsIgnoreCase("2")){
                                Laptop_sell();
                                break;
                            }else if(sell.equalsIgnoreCase("3")){
                                AC_sell();
                                break;
                            }else if(sell.equalsIgnoreCase("4")){
                                TV_sell();
                                break;
                            }else if(sell.equalsIgnoreCase("5")){
                                Fridge_sell();
                                break;
                            }else if(sell.equalsIgnoreCase("6")){
                                break;
                            }else{
                                System.out.println("Invalid press. Please press a valid option(1-6)");
                            }
                            }
                        }else if(own.equalsIgnoreCase("2")){
                            while(true){
                            System.out.print("\nWhich product do you want to add\n1.Smart phone\n2.Laptop\n3.Air conditioner\n4.Television\n5.Refrigerator\n6.For Previous menu\nPress any option(1-5)that you want: ");
                            String add=scan.nextLine();
                            if(add.equalsIgnoreCase("1")){
                                Smart_phone_add();
                                break;
                            }else if(add.equalsIgnoreCase("2")){
                                Laptop_add();
                                break;
                            }else if(add.equalsIgnoreCase("3")){
                                AC_add();
                                break;
                            }else if(add.equalsIgnoreCase("4")){
                                TV_add();
                                break;
                            }else if(add.equalsIgnoreCase("5")){
                                Fridge_add();
                                break;
                            }else if(add.equalsIgnoreCase("6")){
                                break;
                            }else{
                                System.out.println("Invalid press. Please press a valid option(1-6)");
                            }
                            }
                        }else if(own.equalsIgnoreCase("3")){
                            while(true){
                            System.out.print("\nWhich product do you want to change price\n1.Smart phone\n2.Laptop\n3.Air conditioner\n4.Television\n5.Refrigerator\n6.For Previous menu\nPress any option(1-5)that you want: ");
                            String change=scan.nextLine();
                            if(change.equalsIgnoreCase("1")){
                                Smart_phone_change();
                                break;
                            }else if(change.equalsIgnoreCase("2")){
                                Laptop_change();
                                break;
                            }else if(change.equalsIgnoreCase("3")){
                                AC_change();
                                break;
                            }else if(change.equalsIgnoreCase("4")){
                                TV_change();
                                break;
                            }else if(change.equalsIgnoreCase("5")){
                                Fridge_change();
                                break;
                            }else if(change.equalsIgnoreCase("6")){
                                break;
                            }else{
                                System.out.println("Invalid press. Please press a valid option(1-6)");
                            }
                            }
                        }else if(own.equalsIgnoreCase("4")){
                            password();
                            break;
                        }else if(own.equalsIgnoreCase("5")){
                            break;
                        }else{
                            System.out.println("Invalid press. Please press a valid option(1-5)");
                        }
                        }
                    }else{
                        System.out.println("Incorrect password");
                    }
                }catch(IOException e) {
		e.printStackTrace();
             
         }
            }else if(c.equalsIgnoreCase("3")){
                System.out.println("Thank you for using our system. Bye!");
                break;
            }else{
                System.out.println("Invalid press. Please press a valid option(1-3)");
            }
        }
  }
    
}

