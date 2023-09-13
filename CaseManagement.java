import java.util.*;
public class CaseManagement
{
    Scanner in = new Scanner(System.in);
    String name;
    int age, caseID=0, fees=0, N1=0, N2=0, N3=0;
    long aadharNumber;
    CaseManagement(String n, int a1, long a2)
    {
        name = n;
        age = a1;
        aadharNumber = a2;
    }
    void selectLawyers()
    {
        System.out.println("Please contact one of these lawyers from the list below if you don't have one already.");
        System.out.println("Skyler Floyd            342-8631");
        System.out.println("Esperanza Phillips      550-1675");
        System.out.println("Nicole Liu              762-0356");
        System.out.println("Immanuel Adkins         644-2182");
        System.out.println("Derek Massey            658-3916");
        System.out.println("Luis Graves             300-2557");
        System.out.println("Braylon Buck            162-1585");
        System.out.println("Quinn Peck              258-3799");
        System.out.println("Aryana Wiley            109-6666");
        System.out.println("Selena Bush             874-8593");
    }
    void fileCase()
    {
        System.out.println("What type of court case do you want to file?");
        System.out.println("Enter '1' for Civil Case, '2' for Criminal Case and '3' for Family case");
        int choice = in.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("You can file a Civil case, go to your district court and submit additional details with this case ID: ");
                caseID = (int) (Math.random()*1000000);
                System.out.println("Case ID: " + caseID);
                break;
            case 2:
                System.out.println("You can file a Criminal case, go to your district court and submit additional details with this case ID: ");
                caseID = (int) (Math.random()*1000000);
                System.out.println("Case ID: " + caseID);
                break;
            case 3:
                System.out.println("You can file a Family case, go to your district court and submit additional details with this case ID: ");
                caseID = (int) (Math.random()*1000000);
                System.out.println("Case ID: " + caseID);
                break;
            default:
                System.out.println("Invalid input, try again");
        }
        N1++;
    }
    void withdrawCase()
    {
        System.out.println("Enter your case ID: ");
        int c = in.nextInt();
        System.out.println("Your case " + c + " will be successfully withdrawn in 2-3 business days");
        caseID=0;
        N2++;
    }
    void appealCase()
    {
        System.out.println("Enter your case ID: ");
        int c = in.nextInt();
        System.out.println("Your case appeal will be reviewed, and the decision will be conveyed within a week.");
        System.out.println("The decision will be conveyed via email");
        N3++;
    }
    void payCourtFees()
    {
        fees = (N1*1260) + (N2*250) + (N3*625);
        System.out.println("Your due court fees is: ₹" + fees);
        System.out.println("Go to govtindia.payment.com to pay your due court fees online, otherwise go to your district court to pay it with cash.");
    }
    void display()
    {
        fees = (N1*1260) + (N2*250) + (N3*625);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Aadhar Number: " + aadharNumber);
        if(caseID==0)
            System.out.println("No ongoing case");
        else
        {
            System.out.println("Case ID: " + caseID);
            System.out.println("Due court fees: ₹" + fees);
        }
    }
    void edit()
    {
        System.out.println("Previous age: " + age);
        System.out.println("Enter new age: ");
        age = in.nextInt();
        System.out.println("Previous aadhar number: " + aadharNumber);
        System.out.println("Enter new aadhar number: ");
        aadharNumber = in.nextLong();
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String X;
        int b1;
        long b2;
        System.out.println("Enter your name: ");
        X = in.nextLine();
        System.out.println("Enter your age: ");
        b1 = in.nextInt();
        System.out.println("Enter your aadhar card number: ");
        b2 = in.nextLong();
        CaseManagement ob = new CaseManagement(X, b1, b2);
        int p=1, choice;
        while(p>0)
        {
            System.out.println("Enter 1 to file a case.");
            System.out.println("Enter 2 to withdraw a case.");
            System.out.println("Enter 3 to appeal for a higher court.");
            System.out.println("Enter 4 to check any due court fees");
            System.out.println("Enter 5 to view different lawyers");
            System.out.println("Enter 6 to view user details.");
            System.out.println("Enter 7 to edit user details.");
            System.out.println("Enter your choice: ");
            choice = in.nextInt();
            switch(choice)
            {
                case 1: ob.fileCase();
                    break;
                case 2: ob.withdrawCase();
                    break;
                case 3: ob.appealCase();
                    break;
                case 4: ob.payCourtFees();
                    break;
                case 5: ob.selectLawyers();
                    break;
                case 6: ob.display();
                    break;
                case 7: ob.edit();
                    break;
                default:
                    System.out.println("Invalid input, try again!");
            }
            System.out.println("\nEnter 0 to continue, press any other key to exit: ");
            int f = in.nextInt();
            if(f!=0)
                break;
        }
    }
}