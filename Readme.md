## Student Info
Matric:271059
Name: Ng Shen Meng
## Introduction
This assignment is telling about to calculate the monthly repayment of car, loan of car, principal of car, interest of car and the balance payment of car.
Assignment 1 is drawing flowchart and writting pseuducode. Assignment 2 is typing program code.
## Pseuducode
```
Start
Declare method prototype for line(), calLoan, calInterestPayment, calPrincipal, calBalance , calMonthlyPayment and calTotalLoan.
Declare variables for Year, Index, CarPrice, DownPayment, Interest, Loan, Principal, InterestPayment, Balance, MonthlyPayment, TotalPrincipal, TotalInterestPayment, TotalBalance and TotalLoan. 
Initialize Loan, Principal, InterestPayment, Balance, MonthlyPayment, TotalPrincipal, TotalInterestPayment, TotalBalance and TotalLoan to zero . 
Input the CarPrice, DownPayment, LoanPeriod and Interest.
IF DownPayment is less than zero OR CarPrice is less than thirty thousand OR Interest is less than three OR Interest is more than seven OR Year is less than five OR Year is more than nine. THEN
		 	Display “Error, please check your input!!! ”.
	ELSE	
		  	Initialize Index to one
			While Index is less than or equal  to Year 
	Call method calLoan, calInterestPayment, calPrincipal and calBalance
	Add one to Index counter
    Call method calMonthlyPayment
	Display “Monthly Repayment”
	Display MonthlyPayment
	Call method line()
	Display “YEARS PRINCIPAL INTEREST BALANCE”.
	Call method line()
	Initialize Index to one
			While Index is less than or equal  to Year 
TotalPrincipal= TotalPrincipal + Principal	
TotalInterestPayment= InterestPayment + InterestPayment
Call method TotalLoan 
TotalBalance= TotalLoan-TotalPrincipal
Display Index, TotalPrincipal, TotalInterestPayment and TotalBalance
		 	Call line()
	END IF
	End
    
Pseuducode for calLoan Method 

1.	Start 
2.	Declare Loan
3. 	Loan = price – downpayment
4.	Return Loan
5.	End

Pseuducode for calInterestPayment Method 

1.	Start 
2.	Declare InterestPayment
3. 	InterestPayment = loan*interest/100
4.	Return InterestPayment
5.	End

Pseuducode for calPrincipal Method 

1.	Start 
2.	Declare Principal
3. 	Principal = (loan/year)+interestpayment
4.	Return Principal
5.	End

Pseuducode for calBalance Method 

1.	Start 
2.	Declare Balance
3. 	Balance = (loan+(interestpayment*year)) – principal
4.	Return Balance
5.	End

Pseuducode for calMonthlyPayment Method 

1.	Start 
2.	Declare MonthlyPayment
3. 	MonthlyPayment = (loan/year/12) – (interestpayment/12)
4.	Return MonthlyPayment
5.	End
```

## Flowchart
![Flowchart](https://github.com/ngshenmeng2401/271059-STIA1113-A191-A1A2/blob/master/Programming%20Assignment%201%20(5).pdf)

## Screenshot of the output
![output](https://github.com/ngshenmeng2401/271059-STIA1113-A191-A1A2/blob/master/Output.png)
