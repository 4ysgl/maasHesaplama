public class Employee
{
    String name;
    double salary; // maaş
    int workHours;// çalısma saati
    int hireYear;// işe baslama yılı

    Employee(String name ,double salary,int workHours,int hireYear)
    {
        this.name=name;
     this.salary=salary;
     this.workHours=workHours;
     this.hireYear=hireYear;

    }
    void tax()// maasa uygulanan vergi
    {
        /*Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
*/
        if (this.salary >= 1000)
        {
        salary = (this.salary * 3) / 100;

            System.out.println("VERGİ :" + this.salary);
        }
        else if (this.salary<1000)
        {

            System.out.println("MAAŞA VERGİ UYGULANMAYACAK  ");

        }


    }
void bonus()
{
/*bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.*/


    if (this.workHours>40)
    {
       salary = (this.workHours-40)*30;
        System.out.println("BONUS: "+this.salary);
    }

}

void  raiseSalary()
{
    if (2021- (this.hireYear)<10)
    {
       salary=(this.salary*105)/100;
        System.out.println("MAAŞ ARTIŞI = "+this.salary);


    }
    else if (2021-(this.hireYear)>9 && 2021- (this.hireYear)< 20 )
    {
        this.salary=(salary*110)/100;
        System.out.println("MAAŞ ARTISI: = "+this.salary);


    }
    else if (2021-(this.hireYear)>19)
    {
     salary=(this.salary*115)/100;
        System.out.println("MAAŞ ARTISI : "+this.salary);
    }
}
void toPrint()
{
    System.out.println("ÇALISANIN ADI :" +name);
    System.out.println("MAAŞ : " +this.salary);
    System.out.println("ÇALISMA SAATİ: " +this.workHours);
    System.out.println("BAŞLAMA YILI " +this.hireYear);

}
}
