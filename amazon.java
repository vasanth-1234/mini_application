import java.util.*;

import javax.print.DocFlavor.STRING;

class amazon {
    public static Scanner sc=new Scanner(System.in);
    static List<String> metem = new ArrayList<>();//name
    static List<String> meid = new ArrayList<>();//id
    static List<String> mepass = new ArrayList<>();//pass

    //----------------------------------------------------------//


    static List<String> meper = new ArrayList<>();//name
    static List<String> mepid = new ArrayList<>();//id
    static List<String> meppass = new ArrayList<>();//pass

    //-----------------------------------------------------------//

    static List<Integer> proid = new ArrayList<>();//Productid
    static List<String> proname = new ArrayList<>();//product name
    static List<Integer> proprice = new ArrayList<>();//product price
    static List<Integer> proquan = new ArrayList<>();//product quantu
    static List<Integer> prodis = new ArrayList<>();//product dis
    static List<Integer> prosal = new ArrayList<>();//pro saled
    static List<String> promerid = new ArrayList<>();//product merchamt id
    static List<Integer> procat = new ArrayList<>();//product catag
    static List<String> procatname = new ArrayList<>();//product catag name
    static int product_id=1002;
    
    
    //---------------------------------------------------------------------//

    static List<String> username = new ArrayList<>();//username name
    static List<String> userpass = new ArrayList<>();//userpassword
    static List<Integer> userbal = new ArrayList<>();//userbal
    static List<Integer> usercart = new ArrayList<>();//usercart
    static List<String> usercartname = new ArrayList<>();//usercartid
    static List<Integer> usercartrate = new ArrayList<>();//user order
    static List<String> userordername = new ArrayList<>();//userorder id
    static List<Integer> userorder = new ArrayList<>();//user order
    static List<Integer> userorderprice = new ArrayList<>();//user order price

    static List<String> list=new ArrayList<>();



   
    public static void add(){
        meper.add("vasanth");
        mepid.add("a001");
        meppass.add("1234");
        proid.add(1001);
        proname.add("vivo");
        proprice.add(16000);
        proquan.add(10);
        prodis.add(10);
        prosal.add(0);
        promerid.add("a001");
        procat.add(1);
        procatname.add("Phone");
        username.add("vasanth");
        userpass.add("1234");
        userbal.add(40000);
        list.add("Phone");
        list.add("Laptop");
        list.add("Clothes");
        list.add("Kitchen equipement");

    }
    public static void delay(){
        System.out.println("Press 1 to continue");
        int one =sc.nextInt();
        if(one==1){

        }
    }
    public static void clearscreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void approval(){
        clearscreen();
        System.out.println("\tWelcome Admin");
        for(int i =0;i<metem.size();i++){
            meper.add(metem.get(i));
            mepid.add(meid.get(i));
            meppass.add(mepass.get(i));
        }
        metem.clear();
        meid.clear();
        mepass.clear();
        System.out.println("Approved....");
        

    }
    public static void listmerchent(){
        clearscreen();
        System.out.println("\tWelcome Admin");
        System.out.println("List of Merchant");
        for(int i =0;i<meper.size();i++){
            System.out.println();
            System.out.println("Merchant Number : "+(i+1)+"\n");
            System.out.println("Merchant Name :"+meper.get(i));
            System.out.println("Merchant ID   :"+mepid.get(i));
           
        }
       
    }
    public static void removemerchent(){
        a:while(true){
            System.out.println("Merchant id:");
            String check=sc.next();
            sc.nextLine();
            int check1=0;
            for(int i=0;i<mepid.size();i++){
              

                if(check.equals(mepid.get(i))){
                    meper.remove(i);
                    mepid.remove(i);
                    meppass.remove(i);
                    check1=1;
                    System.out.println("Merchant Removed...");
                    break a;
                }
            }
            if(check1==0){
                System.out.println("Merchant not found...");
                break a;
            }
              
           }
    }
    public static void meruser(){
           
            System.out.println("Enter Merchant Id:");
            String merusr=sc.next();
            sc.nextLine();
            System.out.println("Enter Merchant password:");
            String merpass=sc.next();
            sc.nextLine();    
           a: while(true){
                for(int i=0;i<meper.size();i++){
                    if(mepid.get(i).equals(merusr) && meppass.get(i).equals(merpass) ){
                        while(true){
                        clearscreen();
                        System.out.println("\tWellcome "+meper.get(i));
                        System.out.println("1. Add Product\n2. List My Products\n3. Edit Product\n4. Remove Product\n5. View most sold product\n6. View Sales Report\n7. Home");
                        System.out.println("Enter Choice :");
                        int meruser=sc.nextInt();
                        if(meruser==1){
                              addproduct(i);
                        }else if(meruser==2){
                             listproduct(i);
                        }else if(meruser==3){
                             editproduct(i);
                        }else if(meruser==4){
                             removeproduct(i);
                        }else if(meruser==5){
                            mostsoldproduct(i);
                        }else if(meruser==6){
                            salesreport(i);
                        }
                        else if(meruser==7){
                            break a;
                        }else{
                            System.out.println("Invalid input..");
                            delay();
                        }delay();
                    }
                    
                    
                    }
                }
                System.out.println("Invalid Password or username...");
                delay();
                break;
                
           }
        
    }
    public static void addproduct(int i){
        int product_catagory;
        while(true){
       System.out.println("Choose product catagory :\n1. Phone\n2. Laptop\n3. Clothes\n4. Kitchen equipement");
        product_catagory=sc.nextInt();
       if(product_catagory==1){
          procatname.add("Phone");
          break;
       }else if(product_catagory==2){
          procatname.add("Laptop");
          break;
       }else if(product_catagory==3){
          procatname.add("Clothes");
          break;
       }else if(product_catagory==4){
          procatname.add("Kitchen equipement");
          break;
       }else{
        System.out.println("Invalid input...");
       }
       }
       System.out.println();
       System.out.println("Enter Product name:");
       String product_name=sc.next();
       sc.nextLine();
       System.out.println();
       System.out.println("Enter Product price");
       int product_price=sc.nextInt();
       System.out.println();
       System.out.println("Enter Product Quantity");
       int product_Quantity=sc.nextInt();
       System.out.println();
       System.out.println("Enter Product Discount");
       int product_discount=sc.nextInt();
       System.out.println();
       proname.add(product_name);
       proquan.add(product_Quantity);
       proprice.add(product_price);
       prodis.add(product_discount);
       proid.add(product_id);
       product_id++;
       promerid.add(mepid.get(i));
       prosal.add(0);
       procat.add(product_catagory);
       
       System.out.println("Product added...");
       

    }
    public static void listproduct(int i){
        clearscreen();
        String list=mepid.get(i);
        System.out.println("List of products");
        for (int j=0;j<proid.size();j++){
            if(list.equals(promerid.get(j))){
                System.out.println("Merchant Name    :"+meper.get(i));
                System.out.println("Product ID       :"+proid.get(j));
                System.out.println("Product Catagory :"+procatname.get(j));
                System.out.println("Product Name     :"+proname.get(j));
                System.out.println("Product Price    :"+proprice.get(j));
                System.out.println("Product Quantity :"+proquan.get(j));
                System.out.println("Product Discount :"+prodis.get(j));
                System.out.println("Product Saled    :"+prosal.get(j));
                System.out.println("----------------------------------------");
                System.out.println();

            }
            
           
        }
       
    }
    public static void alllistproduct(){
        clearscreen();
        
        System.out.println("List of products");
        for (int j=0;j<proid.size();j++){
            
                System.out.println("Merchant Id      :"+promerid.get(j));
                System.out.println("Product ID       :"+proid.get(j));
                System.out.println("Product Catagory :"+procatname.get(j));
                System.out.println("Product Name     :"+proname.get(j));
                System.out.println("Product Price    :"+proprice.get(j));
                System.out.println("Product Quantity :"+proquan.get(j));
                System.out.println("Product Discount :"+prodis.get(j));
                System.out.println("Product Saled    :"+prosal.get(j));

            
            System.out.println("----------------------------------------");
            System.out.println();
        }
       
    }
    public static void editproduct(int i){
        clearscreen();
        String list=mepid.get(i);
        System.out.println("Enter Product Id:");
        int id=sc.nextInt();
        int check=0;
        System.out.println("Edit products");
        for (int j=0;j<proid.size();j++){
            if(list.equals(promerid.get(j))&& proid.get(j)==id){
                System.out.println("Merchant Name    :"+meper.get(i));
                System.out.println("Product ID       :"+proid.get(j));
                System.out.println("Product Catagory :"+procatname.get(j));
                System.out.println("Product Name     :"+proname.get(j));
                System.out.println("Enter new Name   :");
                String newname=sc.next();sc.nextLine();
                proname.set(j,newname);
                System.out.println("Product Price    :"+proprice.get(j));
                System.out.println("Enter new Price  :");
                int productprice=sc.nextInt();
                proprice.set(j,productprice);
                System.out.println("Product Quantity :"+proquan.get(j));
                System.out.println("Enter new count  :");
                int productquan=sc.nextInt();
                proquan.set(j,productquan);
                System.out.println("Product Discount    :"+prodis.get(j));
                System.out.println("Enter new Discount  :");
                int productdis=sc.nextInt();
                prodis.set(j,productdis);
                System.out.println("Product Saled    :"+prosal.get(j));
                System.out.println("----------------------------------------");
                check=1;
                System.out.println();

            }  
        }
        if(check==0){
            System.out.println("Invalid product id...");
        }
    }
    public static void removeproduct(int i){
        clearscreen();
        String list=mepid.get(i);
        System.out.println("Remove product");
        System.out.println("Enter Product ID");
        int productid=sc.nextInt();
        int id=0;
        
        for (int j=0;j<proid.size();j++){
            if(list.equals(promerid.get(j))&& productid==proid.get(j)){

                proid.remove(j);
                procatname.remove(j);
                proname.remove(j);
                proprice.remove(j);
                proquan.remove(j);
                prodis.remove(j);
                prosal.remove(j);
                promerid.remove(j);
                procat.remove(j);
                System.out.println("Product Removed...");
                id=1;

            }
            
           
        }if(id==0){
            System.out.println("Product Id not found...");
        }

       
    }
    public static void mostsoldproduct(int i){
        clearscreen();
        String list=mepid.get(i);
        int check=0;
        System.out.println("Most sold product");
        for (int j=0;j<proid.size();j++){
            if(list.equals(promerid.get(j))){
                 if(check<prosal.get(j)){
                     check=prosal.get(j);
                 }
            }   
        }
        for (int j=0;j<proid.size();j++){
            if(list.equals(promerid.get(j)) && prosal.get(j)==check){
                System.out.println("Merchant Name    :"+meper.get(i));
                System.out.println("Product ID       :"+proid.get(j));
                System.out.println("Product Catagory :"+procatname.get(j));
                System.out.println("Product Name     :"+proname.get(j));
                System.out.println("Product Price    :"+proprice.get(j));
                System.out.println("Product Quantity :"+proquan.get(j));
                System.out.println("Product Discount :"+prodis.get(j));
                System.out.println("Product Sold     :"+prosal.get(j));
                
            }   
        }
    }
    public static void newuser(){
        System.out.println("Enter username :");
        String usrname=sc.next();
        sc.nextLine();
        System.out.println("Enter user password:");
        String usrpass=sc.next();
        sc.nextLine();   
        int check=0;
        a:while(true){
            for(int i =0;i<username.size();++i){
                if(username.get(i).equals(usrname) && userpass.get(i).equals(usrpass) ){
                    check=1;
                    while(true){
                        clearscreen();
                        System.out.println("\tWellcome "+username.get(i));
                        System.out.println("1.Shopping");
                        System.out.println("2.Your Cart");
                        System.out.println("3.Order History");
                        System.out.println("4.Wallet");
                        System.out.println("5.Password change");
                        System.out.println("6.Exit");
                        System.out.println("Enter your choice:");
                        int userchoice=sc.nextInt(); 

                        if(userchoice==1){
                           shopping(i);
                        }else if(userchoice==2){
                           cart(i);
                        }else if(userchoice==3){
                           order(i);
                        }else if(userchoice==4){
                            wallet(i);
                        }else if(userchoice==5){
                            pingeneration(i);
                        }else if(userchoice==6){
                               break a;
                        }else{
                            System.out.println("Invalid Input...");
                        }
                       
                        
                    }
                }}if(check==0){
                    System.out.println("Invalid username or password");
                    break a;
                }

            
        }
    }
    public static void user(){
        clearscreen();
        System.out.println("ADD new User");
        a1:while(true){
        System.out.println("Enter User name:");
        String check=sc.next();
        sc.nextLine();
        int check1=0;
        for(int i=0;i<username.size();i++){                    
           if(check.equals(username.get(i)) ){
               System.out.println("name is alerdy in use try another name");
                  check1=1;
                   break ;
            }
        }
        if(check1==0){
             username.add(check);
             break a1;
            }
                              
        }
        a1:while(true){
        System.out.println("Enter password:");
        String check=sc.next();
        sc.nextLine();
        int check1=0;
        for(int i=0;i<userpass.size();i++){                    
           if(check.equals(userpass.get(i)) ){
               System.out.println("password is alerdy in use try another password");
                  check1=1;
                   break ;
            }
        }
        if(check1==0){
             userpass.add(check);
             break a1;
            }
                              
        }
        System.out.println("Enter User balance :");
        int usrbalance=sc.nextInt();
        userbal.add(usrbalance);
        System.out.println("User Created..");
        System.out.println(username+" "+userpass+" "+userbal);
    }
    public static void cart(int a){
        clearscreen();
        while(true){
            int check=0;

        System.out.println("\tWelcome to cart");
         for(int i =0;i<usercart.size();i++){
             if(username.get(a).equals(usercartname.get(i))){
                for(int j=0;j<proid.size();j++){
                    if(usercart.get(i).equals(proid.get(j)) && proquan.get(j)>0){
                        System.out.println((i+1)+"). ");
                        System.out.println("Product ID       :"+proid.get(j));
                        System.out.println("Product Catagory :"+procatname.get(j));
                        System.out.println("Product Name     :"+proname.get(j));
                        System.out.println("Product Price    :"+proprice.get(j));
                        check=j;
                    }
                }
               
             }
         }
         System.out.println("1. Buy\n2. Back\nEnter choise :");
         int buy=sc.nextInt();
         if(buy==1){
         System.out.println("Enter Product ID :");
                int productid=sc.nextInt();
                for(int j=0;j<proid.size();j++){
                if(productid==proid.get(j)){

                    int product_price=(proprice.get(j))/prodis.get(j);
                    int pr=proprice.get(j)-product_price;

                    if(pr<=userbal.get(a)){
                        System.out.println("Final Price :"+pr);
                        userbal.set(a,userbal.get(a)-pr);
                        System.out.println("Product Ordred it will delivered in 10 days...");
                        userordername.add(username.get(a));
                        System.out.println(userordername);
                        userorder.add(proid.get(j));
                        userorderprice.add(pr);
                        usercart.remove(proid.get(j));
                        usercartname.remove(username.get(a));
                        prosal.set(j,(prosal.get(j)+1));
                        proquan.set(j,(proquan.get(j)-1));
                        delay();
                    }else{
                        System.out.println("Insufficient Balance...");
                    }
                }}}else if(buy==2){
                    break;
                }else{
                    System.out.println("Invalid input..");
                }
            }
         
    }
    public static void shopping(int a){
        while(true){
        clearscreen();
        System.out.println("\tWelcome To Shopping");

        System.out.println("Choose product catagory :\n1. Phone\n2. Laptop\n3. Clothes\n4. Kitchen equipement\n5. Exit");
        
        System.out.println("Enter Choice:");
        int usrcatagory=sc.nextInt();
        
        if(usrcatagory==1){
           product(0,a);
        }else if(usrcatagory==2){
            product(1,a);

        }else if(usrcatagory==3){
            product(2,a);

        }else if(usrcatagory==4){
            product(3,a);
        }else if(usrcatagory==5){
           break;
        }else{
           System.out.println("Invalid Input...");
        }
        
        }

    }
    public static void order(int a){
        clearscreen();
        int check=0;
        while(true){
        System.out.println("\tYour Order");
         for(int i =0;i<userorder.size();i++){
             if(username.get(a).equals(userordername.get(i))){
                for(int j=0;j<proid.size();j++){
                    if(userorder.get(i).equals(proid.get(j))){
                        System.out.println((i+1)+"). ");
                        System.out.println("Product ID       :"+proid.get(j));
                        System.out.println("Product Catagory :"+procatname.get(j));
                        System.out.println("Product Name     :"+proname.get(j));
                        System.out.println("Product Price    :"+userorderprice.get(i));
                        System.out.println();
                        check=1;
            
                    }}
                    if(check==0){
                        System.out.println("Invalid id");
                    }
                
               
             }
         }
         
         delay();
         break;
        }
    }
    public static void product(int a,int p){
        while(true){
            clearscreen();
            System.out.println("List of Products");
            System.out.println("Product Catagory :"+list.get(a));
            for(int j=0;j<proname.size();j++){
                if (procat.get(j)==(a+1)&& proquan.get(j)>0){
                    System.out.println("Product ID       :"+proid.get(j));
                    System.out.println("Product Name     :"+proname.get(j));
                    System.out.println("Product Price    :"+proprice.get(j));
                    System.out.println("Product Quantity :"+proquan.get(j));
                    System.out.println("Product Discount :"+prodis.get(j));
                    System.out.println("----------------------------------------");
                    System.out.println();
                }
            }
            
            System.out.println("1.Add to cart");
            System.out.println("2.Buy");
            System.out.println("3.Back");
            System.out.println("Enter choice:");
            int catagory1=sc.nextInt();
            if(catagory1==1){
                System.out.println("Enter Product ID :");
                int productid=sc.nextInt();
                int check1=0;
                for(int j=0;j<proid.size();j++){
                if(productid==proid.get(j)){
                    usercart.add(productid);
                    usercartname.add(username.get(p));
                    System.out.println("Added to cart");
                    System.out.println(username.get(p));
                    check1=1;
                    delay();

                }
                }
                if(check1==0){
                    System.out.println("Invalid id...");
                    delay();
                }
                
            }else if(catagory1==2){
                System.out.println("Enter Product ID :");
                int productid=sc.nextInt();
                int check=0;
                for(int j=0;j<proid.size();j++){
                if(productid==proid.get(j)){
                    check=1;
                    int product_price=(proprice.get(j))/prodis.get(j);
                    int pr=proprice.get(j)-product_price;

                    if(pr<=userbal.get(p)){
                        System.out.println("Final Price :"+pr);
                        userbal.set(p,userbal.get(p)-pr);
                        System.out.println("Product Ordred it will delivered in 10 days...");
                        userordername.add(username.get(p));
                        System.out.println(userordername);
                        userorder.add(proid.get(j));
                        userorderprice.add(pr);
                        prosal.set(j,(prosal.get(j)+1));
                        proquan.set(j,(proquan.get(j)-1));
                        delay();

                       

                    }

                }}if(check==0){
                    System.out.println("Invalid Product Id....");
                    delay();
                }
            }else if (catagory1==3){
                break ;
                
            }
        }
    }
    public static void wallet(int a){
        while(true){
        clearscreen();
        System.out.println("\tWallet");
        System.out.println("Your current balance:"+userbal.get(a));
        System.out.println("1.Add money\n2.Back\nEnter choice:");
        int wallet=sc.nextInt();
        if(wallet==1){
            System.out.println("Enter Amount:");
            int amount =sc.nextInt();
            userbal.set(a,(userbal.get(a)+amount));
            System.out.println("Amount Added");
            System.out.println();
            System.out.println("Your current balance:"+userbal.get(a));
            System.out.println();
            delay();
        }else if(wallet==2){
            break;
        }else{
           System.out.println("Invalid input...");
        }
    }
    }
    public static void pingeneration(int i){
        clearscreen();
        System.out.println("\tWelcome "+username.get(i));
        System.out.println("Enter new Pin:");
        String newpin=sc.next();
        sc.nextLine();
        System.out.println("Confirm new Pin:");
        String repin=sc.next();
        sc.nextLine();
        if(newpin.equals(repin)){
            userpass.set(i,newpin);
            System.out.println("Pin changed Succesfully...");
        }else{
            System.out.println("Pin mismatch...");
        }
        delay();

    }
    public static void salesreport(int i){
        clearscreen();
        String list=mepid.get(i);
        System.out.println("List of products");
        for (int j=0;j<proid.size();j++){
            if(list.equals(promerid.get(j))){
                
                System.out.println("Product ID       :"+proid.get(j));
                System.out.println("Product Catagory :"+procatname.get(j));
                System.out.println("Product Name     :"+proname.get(j));
                System.out.println("Product Saled    :"+prosal.get(j));
                System.out.println("----------------------------------------");
                System.out.println();

            }
            
           
        }
    }
    public static void main(String[] args){
        add();
        while(true){
            clearscreen();
            System.out.println("-----Amazon-----");
            System.out.println("1. Admin");
            System.out.println("2. Merchant");
            System.out.println("3. User");
            System.out.println("4. Exit");
            System.out.println("Enter Choice: ");
            int Choice=sc.nextInt();
            if(Choice==1) {

                
                System.out.println("Enter admin username:");
                String adminusr=sc.next();
                sc.nextLine();
                System.out.println("Enter admin password:");
                String adminpass=sc.next();
                sc.nextLine();
                while(true){
                if(adminpass.equals("1234") && adminusr.equals("vasanth")){
                    clearscreen();
                    System.out.println("\t-----Welcome Admin-----\n\t\t1. Merchant Approval List\n\t\t2. Add Merchant\n\t\t3. Remove Merchant\n\t\t4. List the Merchant\n\t\t5. List all Products\n\t\t6. Home\n\t\t Enter Choice: ");  
                       int usrchoice=sc.nextInt();
                       if(usrchoice==1){
                           approval();
                       }else if(usrchoice==2){
                        System.out.println("ADD new Merchant");
                        a1:while(true){
                           System.out.println("Merchant name:");
                           String check=sc.next();
                           sc.nextLine();
                           int check1=0;
                           for(int i=0;i<meper.size();i++){
                               if(check.equals(meper.get(i))){
                                   System.out.println("name is alerdy in use try another name");
                                   check1=1;
                                   break ;
                               }
                           }
                           if(check1==0){
                               meper.add(check);
                               break a1;
                           }
                             
                          }
                        a:while(true){
                        System.out.println("Merchant id:");
                        String check=sc.next();
                        sc.nextLine();
                        int check1=0;
                        for(int i=0;i<mepid.size();i++){
                            if(check.equals(mepid.get(i))){
                                System.out.println("Id is alerdy in use try another id");
                                check1=1;
                                break ;
                            }
                        }
                        if(check1==0){
                            mepid.add(check);
                            break a;
                        }
                          
                       }
                       a2:while(true){
                           System.out.println("Merchant password:");
                           String check=sc.next();
                           sc.nextLine();
                           int check1=0;
                           for(int i=0;i<meppass.size();i++){
                               if(check.equals(meppass.get(i))){
                                   System.out.println("Password is alerdy in use try another Password");
                                   check1=1;
                                   break ;
                               }
                           }
                           if(check1==0){
                               meppass.add(check);
                               break a2;
                           }
                             
                          }
                          System.out.println("Account Added");
                         
                        }
                       else if(usrchoice==3){
                           removemerchent();
                        }
                       else if(usrchoice==4){
                           listmerchent();
                        }else if(usrchoice==5){
                            alllistproduct();
                        }
                       else if(usrchoice==6){
                           break;
                        }else{
                          System.out.println("Invalid input");
                      }
                     delay();

                }else{break;}
                }

            }
            else if(Choice==2) {
               while(true){
                   clearscreen(); 
                System.out.println("\t-----Merchant Portal-----\n\t\t1. New Merchant\n\t\t2. Existing Merchant\n\t\t3. Exit \n\t\t Enter Choice: ");  
                  int Merchoice=sc.nextInt();
                  if(Merchoice==1){
                         System.out.println("ADD new Merchant");
                         a1:while(true){
                            System.out.println("Merchant name:");
                            String check=sc.next();
                            sc.nextLine();
                            int check1=0;
                            for(int i=0;i<metem.size();i++){
                                for(int j=0;j<meper.size();j++){
                                if(check.equals(metem.get(i)) && check.equals(meper.get(j))){
                                    System.out.println("name is alerdy in use try another name");
                                    check1=1;
                                    break ;
                                }}
                            }
                            if(check1==0){
                                metem.add(check);
                                break a1;
                            }
                              
                           }
                         a:while(true){
                         System.out.println("Merchant id:");
                         String check=sc.next();
                         sc.nextLine();
                         int check1=0;
                         for(int i=0;i<meid.size();i++){
                            for(int j=0;j<mepid.size();j++){
                                if(check.equals(meid.get(i)) && check.equals(mepid.get(j))){
                            
                                 System.out.println("Id is alerdy in use try another id");
                                 check1=1;
                                 break ;
                             }
                         }}
                         if(check1==0){
                             meid.add(check);
                             break a;
                         }
                           
                        }
                        a2:while(true){
                            System.out.println("Merchant password:");
                            String check=sc.next();
                            sc.nextLine();
                            int check1=0;
                            for(int i=0;i<mepass.size();i++){
                                for(int j=0;j<meppass.size();j++){
                                    if(check.equals(mepass.get(i)) && check.equals(meppass.get(j))){
                                    System.out.println("Password is alerdy in use try another Password");
                                    check1=1;
                                    break ;
                                }}
                            }
                            if(check1==0){
                                mepass.add(check);
                                break a2;
                            }                 
                           }
                           System.out.println("Acount is waiting for admin approval ");
                           delay();
                  }else if(Merchoice==2){
                    meruser();
                  }else if(Merchoice==3){
                      break;
                    }else{
                       
                      System.out.println("Invalid input");
                      delay();
                  }
               }
            }
            else if(Choice==3) {
               while(true){
                   clearscreen();
                   System.out.println("\t-----Welcome User-----\n1. New User\n2. Existing User\n3. Home \n Enter Choice: ");  
                   int userchoise=sc.nextInt();
                   if(userchoise==1){
                       user();
                   }else if(userchoise==2){
                     newuser();
                   }else if(userchoise==3){
                       break;

                   }else{
                       System.out.println("Invalid input");

                   }
                   delay();

               }
            }
            else if(Choice==4) {
                  break;
            }else{
                System.out.println("Invalid input");
                delay();
            }

        }
    }
}
