
public class Main 
{
 public static void main(String[] args) 
 {
	 Person p = new Person("Muhammed", "Maaghagha",011, "Muhammed.a.elshimy@gmail.com");
		System.out.println(p.toString());
	 Student st = new Student(new Status("Freshman"),"Muhammed", "Maaghagha",011, "Muhammed.a.elshimy@gmail.com");
	    System.out.println(st.toString());
      Employee e = new Employee("Muhammed", "Maaghagha",011, "Muhammed.a.elshimy@gmail.com", "G", 2500, new MyDate(7,7,2018));
		System.out.println(e.toString());
      faculty f = new faculty( "G", 2500, new MyDate(7,7,2018),"Muhammed", "Maaghagha",011, "Muhammed.a.elshimy@gmail.com",30,"Doctor" );
        System.out.println(f.toString());
       Staff s = new Staff("Manager","Muhammed", "Maaghagha",011, "Muhammed.a.elshimy@gmail.com", "G", 2500, new MyDate(7,7,2018));
        System.out.println(s.toString());
}

}
