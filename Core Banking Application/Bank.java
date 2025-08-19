package p1;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private ArrayList<Branch>branches;
    private ArrayList<Account>accounts;
    Scanner sc=new Scanner(System.in);

    public Bank(){
        System.out.print("Enter Bank Name : ");
        this.bankName=sc.next();
        branches=new ArrayList<>();
        accounts=new ArrayList<>();
    }

    public void addBranch(){
        System.out.print("Enter Branch Name : ");
        String branchName=sc.next();
        String ifsc=this.bankName+branchName;

        private Branch br=new Branch(branchName, ifsc, 0);

        branches.add(br);
        System.out.println("Branch Created Successfully!");
        System.out.println("IFS Code : "+ifsc);
    }
}