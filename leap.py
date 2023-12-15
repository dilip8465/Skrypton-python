year=int(input("Enter the year"))
if(year%4==0):
    if(year%100!=0 or year%400==0):
        print("leap year")
    else:
        print("Not Leap Year")
else:
    print("not leap year")
 
