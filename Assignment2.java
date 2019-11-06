import java.util.Scanner;

import javax.swing.JOptionPane;

public class Assignment2 {
    

        public static void main(String[]args){
        
        /*Declaration*/
        int Year;
        int Index;
         
        float CarPrice;
        float DownPayment;
        float Interest;
        float Loan=0;
        float Principal=0;
        float InterestPayment=0;
        float Balance=0;
        float MonthlyPayment=0;
        float TotalPrincipal=0;
        float TotalInterestPayment=0;
        float TotalBalance=0;
        float TotalLoan=0;

         /*Input*/
         Scanner input = new Scanner(System.in);

         System.out.println("Car Price (RM):");
         CarPrice = input.nextInt();
        
         System.out.println("Down Payment (RM):");
         DownPayment = input.nextInt();

         System.out.println("Loan Period (Year 5-9):");
         Year = input.nextInt();

         System.out.println("Interest Rate (%):");
         Interest = input.nextInt();

         /*Selection*/    
            if(DownPayment<0 || CarPrice<30000  || Interest<3 || Interest>7 || Year<5 || Year>9)
                    {
                    System.out.println("Error, please check your input!!!!");
                    }
                    
                else {
                    /*Loop*/
                    for( Index=1;Index<=Year;Index++){
                        Loan = calLoan(CarPrice,DownPayment);
                        InterestPayment = calInterestPayment(Loan,Interest);
                        Principal= calPrincipal(Loan,Year, InterestPayment);
                        Balance = calBalance(Loan,InterestPayment,Year,Principal);
                    }

                    /*Display Monthly Payment*/
                        MonthlyPayment = calMonthlyPayment(Loan,Year,InterestPayment);
                        System.out.printf("\t\t\t\t\t\tMonthly Repayment\n");
                        System.out.printf("\t\t\t\t\t\t\tRM%.2f\n\n",MonthlyPayment);
                    
                    /*Display Car Loan Table Header*/
                    line();
                    System.out.printf("\n\tYEARS\t\t\t\tPRINCIPAL\t\t\tINTEREST\t\t\t  BALANCE\n");
                    line();

                    /*Display Details  Car Loan Table */
                    for( Index=1;Index<=Year;Index++){

                        TotalPrincipal+=Principal;
                        TotalInterestPayment+=InterestPayment;
                        TotalLoan= calTotalLoan(Loan,Year,InterestPayment);
                        TotalBalance=TotalLoan-TotalPrincipal;
                        System.out.printf("\n\t%d",Index);
                        System.out.printf("\t\t\t\t%9.2f",TotalPrincipal);
                        System.out.printf("\t\t\t%8.2f",TotalInterestPayment);   
                        System.out.printf("\t\t\t%9.2f\n",TotalBalance);
                    }
                   
                    /*Loop*/
                   line();
                }
}
        public static void line(){
                    int line=1;
                    while(line<=130){
                        System.out.printf("%c",45);
                        line++; 
                    }
        }

        public static float calLoan(float price,float downpayment){
            float Loan = price - downpayment;
            return Loan;
        } 

        public static float calInterestPayment(float loan,float interest){
            float InterestPayment = loan*interest/100;
            return InterestPayment;
        }
        public static float calPrincipal(float loan,float year,float interestpayment){
            float Principal= (loan/year)+interestpayment;
            return Principal;
        }
        public static float calBalance(float loan , float interestpayment , float year , float principal){
            float Balance= (loan+(interestpayment*year))-principal;
            return Balance;
        }
        public static float calMonthlyPayment(float loan,float year,float interestpayment){
            float MonthlyPayment= (loan/year/12)+(interestpayment/12);
            return MonthlyPayment;
        }

        public static float calTotalLoan(float loan,float year,float interestpayment){
            float TotalLoan= (year*interestpayment)+loan;
            return TotalLoan;
        }
    }