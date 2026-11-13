import java.util.Scanner;
class Bank{
    private Long accountNumber;
    private  String accountholderName;
    private double accountbalance;
    
    void getter(){
System.out.println("-------Bank Account details--------");
System.out.println("Account number:"+accountNumber);
System.out.println("Account Holder Name:"+accountholderName);
System.out.println("Account Balance:"+accountbalance);
    }
    void setter(Integer l,String b,double c){
        Account number=l;
        Account HolderName=b;
        Account Balance=c;
    }
    void getter1(){
        System.out.println("---Update account number---");
        System.out.println("Account holder number:"+accountNumber);
        System.out.println("Account holder name:"+accountholderName);
        System.out.println("Account Balanece:"+accountbalance);

    }
    
    void setter(Long d){
        accountNumber=d;
    }
}
public class Miniproject1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank e=new Bank();
        System.out.println("Enter Accountnumber:");
        Integer l= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account holder name:");
        String b = sc.next();
        System.out.println("Enter Balance:");
         double c =sc.nextDouble();
         System.out.println("Enter  new Accountnumber:");
        Long d= sc.nextLong();
e.setter(l,b,c);
e.getter();
e.setter(d);
e.getter1();

    }

    
}

