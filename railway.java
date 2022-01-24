import java.util.*;
public class railway {
    static int k,res=0,res1=0,po=0,po1=0,f=0,l7=0,RAC=0;
    static int bk=0;
    static String r="",r1="";
    static int id=0,ubid=1,mbid=1,lbid=1,RACid=0,p=0,h=0,lll=0;
    static Scanner sc=new Scanner(System.in);
    static int seat=10;
    static int ub=5,mb=3,lb=2;
    static int waiting=5;
    static String[] pp={"COVAI","TRIPUR","ERODE","SALEM","JOLARPETTAI","KATPADI","CHENNAI","covai","tripur","erode","salem","jolarpettai","katpadi","chennai"};
    //---------------------------------------//
    static ArrayList<String> l=new ArrayList<>(); //username
    static ArrayList<String> l1=new ArrayList<>();//||password
    //------------------------------------------------//
    static ArrayList<String> b=new ArrayList<>();
    static ArrayList<String> b1=new ArrayList<>();
    static ArrayList<String> b2=new ArrayList<>();
    static ArrayList<String> b3=new ArrayList<>();
   static ArrayList<String> tn=new ArrayList<>();//waiting list
   static ArrayList<String> tn1=new ArrayList<>();
   static ArrayList<String> tn2=new ArrayList<>();
   static ArrayList<String> tn4=new ArrayList<>();
   

    public static void main(String[] args)
    {
     
        welcome();
    }
    public static void welcome(){
       System.out.println();
       System.out.println();
        System.out.println("\t\t -----WELCOME TO IRCTC TRAIN BOOKING-----");
        System.out.println();
        System.out.println("1.USER");
        System.out.println("2.ADMIN");
        System.out.println("3.EXIT");
        System.out.println();
        k=sc.nextInt();
        hello();
        
    }
    public static void hello()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if(k<1||k>2)
         welcome();
        else
            switch(k)
            {
                case 1:{
                user();}
                case 2:{
                    admin();
                }
                case 3:{
                welcome();}
            }
    }
    public static void user()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\tHELLO!!!");
      System.out.println("1. LOGIN");
      System.out.println("2. SIGN UP");
      System.out.println("3. EXIT");
      System.out.println();
      int y=sc.nextInt();
      if(y==1)
      {
          login();
      }
      else if(y==2)
      {
          signup();
      }
      else
      {
          welcome();
      }
    }
   public static void login()
   {
    System.out.print("\033[H\033[2J");
    System.out.flush();
       System.out.println("\t\tWELCOME TO LOGIN PAGE");
       System.out.println("ENTER YOUR NAME");
       String h=sc.next();
       res=l.indexOf(h);
       System.out.println("ENTER YOUR PASSWORD");
       String h1=sc.next();
       if(l.contains(h)&&l1.contains(h1))
       { 
        System.out.print("\033[H\033[2J");
        System.out.flush();
           System.out.println();
          System.out.println("1.BOOK TICKETS");
          System.out.println("2.CANCEL TICKETS");
          System.out.println("3.VIEW TICKETS");
          System.out.println("4.CHANGE PASSWORD");
          System.out.println("5.EXIT");
          System.out.println();
          int y=sc.nextInt();
          if(y==1)
          {
              book();
          }
          else if(y==2)
          {
              cancel();
          }
          else if(y==3)
          {
             view();
          }
          else if(y==4)
          {
              changepass();
          }
          else
          {
              user();
          }
       }
       else if(l.contains(h)&&!l1.contains(h1)||!l.contains(h)&&l1.contains(h)){
           System.out.println("USERNAME OR PIN IS INCORRECT");
       }
       else
       {
           System.out.println("ACCOUNT DOES NOT EXIST PLEASE SIGNUP");
       }
       System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            user();

    }
       public static void signup()
     {
    System.out.print("\033[H\033[2J");
    System.out.flush();
       System.out.println("\t\tWELCOME TO REGISTRATION PAGE");
       System.out.println();
       System.out.println("ENTER YOUR NAME");
       String j=sc.next();
       l.add(j);
       System.out.println("ENTER YOUR PIN");
       String u=sc.next();
       System.out.println("RE-ENTER YOUR PIN");
       String u1=sc.next();
       if(u.equals(u1)==true)
       {
        String ll=j.charAt(0)+""+u1+""+id;
        l1.add(ll);
       System.out.println("YOUR PASSWORD IS "+ll);
       id++;
       lll=1;
       }
       else
       {
           System.out.println("PIN DOESN'T MATCH");
       }
       System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            user();


   }
   public static void book()
   {
    System.out.print("\033[H\033[2J");
    System.out.flush();
       System.out.println("COIMBATORE------------> CHENNAI");
       System.out.println();
       System.out.println("\t\t INTERMEDIATE ");
       System.out.println("\t\t   ||||||||");
       System.out.println("\t\t   VVVVVVVV");
       System.out.println("1.COVAI||2.TRIPUR||3.ERODE||4.SALEM||5.JOLARPETTAI||6.KATPADI||7.CHENNAI");
       System.out.println();
       System.out.println("ENTER YOUR DEPATURE INTERMEDIATE");
        r=sc.next();
        po=Arrays.asList(pp).indexOf(r);
       // System.out.println(po);
        System.out.println("ENTER THE DESTINATION");
        r1=sc.next();
        po1=Arrays.asList(pp).indexOf(r1);
        //System.out.println(po1);
       if(r.equals(r1))
       {
          error();
       }
       else if(po>po1)
       {
           error();
       }
      else if(Arrays.stream(pp).anyMatch(r::equals)&&Arrays.stream(pp).anyMatch(r1::equals))
       {
           System.out.println("YOUR TRIP IS FROM "+r+" TO " + r1);
           System.out.println();
           show();
       }

       else{
          error();
       }
       System.out.println("-------ENTER TO CONTINUE------");
       sc.nextLine();
       String s=sc.nextLine();
       if(s.equals(""))
       user();
      

   }
   public static void error()
   {
      System.out.print("\033[H\033[2J");
    System.out.flush();
    if(po>po1)
    {
        System.out.println("NO TRAIN ROUTES ARE AVAILABLE");
    }
    else{
    System.out.println("\t\tPLEASE ENTER THE PROPER INTERMEDIATE"); 
    }
    System.out.println("-------ENTER TO CONTINUE------");
    sc.nextLine();
    String s=sc.nextLine();
    if(s.equals(""))
    user();
   } 
 
public static void show()
{
    //System.out.print("\033[H\033[2J");
    //System.out.flush();
    System.out.println("1.AC (OR) 2.NON-AC");
    h=sc.nextInt();
    if(h==1)
    {
     System.out.println(" YOU PREFFERD AC");
    }
    else
    {
        System.out.println(" YOU PREFFERD NON-AC");
    }
    System.out.println("\t\tAVAILABLE BERTHS");
    System.out.println("TOTAL NO OF SEATS AVAILABLE : "+seat);
    System.out.println("1.UPPER BIRTH : "+ub);
    System.out.println("2.MIDDLE BIRTH : "+mb);
    System.out.println("3.LOWER BIRTH : "+lb);
    System.out.println("4.RAC : "+RAC);
    System.out.println();
    System.out.println("YOUR ID IS "+bk);
    System.out.println();
    System.out.println();
    System.out.println("ENTER THE NO.OF.SEATS");
    p=sc.nextInt();
    System.out.println("ENTER YOUR PREFFERENCE");
     l7=sc.nextInt();
     if(p<=seat){
    if(l7==1)
    {
     if(ub!=0&&p<=ub)
     {
         System.out.println("YOUR SEAT IS CONFIRMED");
         seat-=p;
         ub-=p;
             if(p>1)
             {
                 oneticket();
             }
             else{
         b.add("UB"+ubid);
         ubid++;
         bk++;
         twoticket();}
        }
         else
         waiting();
    }
    else if(l7==2)
    { 
        if(mb!=0&&p<=mb)
        {
        System.out.println("YOUR SEAT IS CONFIRMED");
        seat-=p;
        mb-=p;
            if(p>1)
            {
                oneticket();
            }else{
            b.add("MB"+mbid);
            mbid++;
            bk++;
            twoticket();
            }
     }
     else
     waiting();
    }
    else if(l7==3)
     {
         if(lb!=0&&p<=lb)
         {
            System.out.println("YOUR SEAT IS CONFIRMED");
            seat-=p;
            lb-=p;
                if(p>1)
                {
                    oneticket();
                }else{

                b.add("LB"+lbid);
                lbid++;
                bk++;
                twoticket();
                         }
        }
         else
         waiting();
    }
    else if(l7==4)
     {
         if(RAC!=0&&p<=RAC)
         {
            System.out.println("YOUR SEAT IS CONFIRMED");
            seat-=p;
            RAC-=p;
                if(p>1)
                {
                    oneticket();
                }else{

                b.add("RAC"+RACid);
                RACid++;
                bk++;
                twoticket();
                         }
        }
         else
         waiting();
        }
    }
         else
         waiting();
    System.out.println("-------ENTER TO CONTINUE------");
    sc.nextLine();
    String s=sc.nextLine();
    if(s.equals(""))
    view();
        }
public static void view()
{
    System.out.println("ENTER YOUR ID");
    int bkk=sc.nextInt();
System.out.println("-------------------------------------------");
 System.out.println("\t\tYOUR TICKET");
 System.out.println("NAME : "+l.get(res));
 System.out.println("COACH : "+b3.get(bkk));
 System.out.println("SEAT NO : "+b.get(bkk));
 //tn4.add(b.get(res));
 System.out.println("FROM : "+b1.get(bkk));
 System.out.println("TO : "+b2.get(bkk));
 System.out.println();
 System.out.println("-------ENTER TO CONTINUE------");
    sc.nextLine();
    String s=sc.nextLine();
    if(s.equals(""))
user();
}
public static void changepass()
{
    System.out.println("ENTER THE OLD PASSWORD");
    String a=sc.next();
    if(l1.contains(a))
    {
        System.out.println();
        System.out.println("ENTER THE NEW PASSWORD");
        String a1=sc.next();
        res1=l1.indexOf(a1);
        l1.set(res,a1);
        System.out.println();
        System.out.println("YOUR PASSWORD CHANGED SUCCESSFULLY");
        System.out.println();
        System.out.println("-------ENTER TO CONTINUE------");
           sc.nextLine();
           String s=sc.nextLine();
           if(s.equals(""))
          login();

    }
    else{
        System.out.println("PASSWORD DOESN'T MATCH");
        System.out.println();
        System.out.println("-------ENTER TO CONTINUE------");
           sc.nextLine();
           String s=sc.nextLine();
           if(s.equals(""))
           user();
    }
}
public static void waiting()
{
    if(p>seat||p>seat||p>seat){
        System.out.println("SEAT IS NOT AVAILABLE");
        System.out.println();
        System.out.println("-------ENTER TO CONTINUE------");
           sc.nextLine();
           String s=sc.nextLine();
           if(s.equals(""))
        login();
    }
    else{
    System.out.println("YOUR ARE ON WAITING LIST");
            waiting-=p;
           // lll=p;
            tn.add(r);
            tn1.add(r1);
            if(h==1)
            tn2.add("AC");
            else
            tn2.add("NON-AC");  
            System.out.println("-------ENTER TO CONTINUE------");
           sc.nextLine();
           String s=sc.nextLine();
           if(s.equals(""))
           login();
    }

}
public static void cancel()
{
    System.out.println("ARE YOU SURE YOU WANT TO CANCEL THE TICKET");
    System.out.println("PRESS 10 TO CONFIRM");
    int u=sc.nextInt();
    if(u==10)
    {
        System.out.println("ENTER YOUR ID");
        int hhhhh=sc.nextInt();
        seat+=p;
        RAC+=p;
        b.remove(hhhhh);
        b1.remove(hhhhh);
        b2.remove(hhhhh);
        b3.remove(hhhhh);
        bk--;
        System.out.println("TICKET CANCELLED");
        if(tn.contains(r)&&tn1.contains(r1))
        {
            reload();
        }
    }
    else
    {
        user();
    }
    System.out.println("-------ENTER TO CONTINUE------");
    sc.nextLine();
    String s=sc.nextLine();
    if(s.equals(""))
    user();
}
public static void oneticket()
{
    bk++;
    if(l7==1){
b.add(p+""+"UB"+" "+"(BULK)");}
else if(l7==2){
b.add(p+""+"MB"+" "+"(BULK)");}
else if(l7==3){
b.add(p+""+"LB"+" "+"(BULK)");}
else if(l7==4){
    b.add(p+""+"RAC"+" "+"(BULK)");}
System.out.println("-------ENTER TO CONTINUE------");
sc.nextLine();
String s=sc.nextLine();
if(s.equals(""))
twoticket();
}
public static void twoticket()
{
    b1.add(r);
         b2.add(r1);
         if(h==1)
         b3.add("AC");
         else
         b3.add("NON-AC");
         view();
} 
public static void admin()
{
    System.out.println("\t\tWELCOME ADMIN");
    System.out.println("ENTER THE NAME");
    String p=sc.next();
    System.out.println("ENTER THE PASSWORD");
    String p1=sc.next();
    if(p.contains("vasanth")&&p1.contains(p1))
    {
     System.out.println("1.CHECK THE SOLDOUT TICKETS");
     String h3=sc.next();
    if(h3.equals("1"))
    {
    if(bk==0)
    {
        System.out.println("NO SOLD TICKETS");
    }
    else{
     for(int i=0;i<bk;i++)
     {
         System.out.println("--------------------------------------------------");
        System.out.println("NAME : "+l.get(res));
        System.out.println("COACH : "+b3.get(i));
        System.out.println("SEAT NO : "+b.get(i));
        System.out.println("FROM : "+b1.get(i));
        System.out.println("TO : "+b2.get(i));
     }
    }
}
    else{
        welcome();
    }


}
else{
    System.out.println("USERNAME OR PASSWORD IS INCORRECT");
}
System.out.println("-------ENTER TO CONTINUE------");
sc.nextLine();
String s=sc.nextLine();
if(s.equals(""))
welcome();

}
public static void reload()
{
    seat-=p;
    RAC-=p;
    b1.addAll(tn);
    b2.addAll(tn1);
    b3.addAll(tn2);
    bk++;
    b.add("RAC");
}
}