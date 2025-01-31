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
     tax();
     bonus();
     raiseSalary();

    }
    double tax()// maasa uygulanan vergi
    {
        /*Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
*/
        if (this.salary >= 1000)
        {
        return this.salary * 0.03 ;

        }
        else if (this.salary<1000)
        {

            System.out.println("MAAŞA VERGİ UYGULANMAYACAK  ");

        }
return 0;

    }
int bonus()
{
/*bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.*/


    if (this.workHours>40)
    {
       return (this.workHours-40)*30;

    }
    return 0;
}

double   raiseSalary()
{
    int calismaYili = 2021 - hireYear;

    if (calismaYili < 10) {
        return this.salary * 0.05;

    } else if (calismaYili > 9 && calismaYili < 20) {
        return this.salary * 0.10;


    } else if (calismaYili > 20) {
        return this.salary * 0.15;

    }

    return 0;
}

    void toPrint()
    {
        double tax=tax();
        int bonush=bonus();
        double raise=raiseSalary();
        double ektoplam= (this.salary-tax)+bonush;
        double toplam=(this.salary-tax)+bonush+raise;

        System.out.println("ÇALISANIN ADI :" +name);
        System.out.println("MAAŞ : " +this.salary);
        System.out.println("ÇALISMA SAATİ: " +this.workHours);
        System.out.println("BAŞLAMA YILI " +this.hireYear);
        System.out.println("BONUS: "+bonush);
        System.out.println("VERGİ : "+tax);
        System.out.println("MAAŞ ARTISI: "+raise);
        System.out.println("VERGİ + BONUS toplamı: "+ektoplam);
        System.out.println("TOPLAM MAAŞ: "+toplam);


    }

}


