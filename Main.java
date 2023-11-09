public class Main {
    
    public static void main(String[] args) {
        // Create and initialize objects as needed, and call their methods to produce the desired output.
        
        Student mark=new Student("Mark",46,"old male","Fodor suli");
        //getGoal markg=("Live for the moment.");
        Student jane=new Student("Jane",30,"old Female","Fodor suli");
        
        Student John=new Student("john Doe",20,"old Male","from BME ");

        Student Jane_Doe=new Student("jane Doe",30,"old female","from The School of Life");

        Mentor Gandhi=new Mentor("Gandhi",148,"old Male","");

        Mentor Jane_Doe2=new Mentor("Jane Doe",30,"old Male","who represents Google and hired 3 students so far");
        
        Sponsor Jane2=new Sponsor("Jane Doe",30,"old Female","who represents Google and hired 3 students so far.");
        
        Sponsor Elon=new Sponsor("Elon Mask",46,"old Male","who represents SpaceX and hired 5 students so far.");
        mark.introduce();
        System.out.println("My goal is: Live for the moment.");
        jane.introduce();
        System.out.println("My goal is: Live for the moment.");
        John.introduce();
        System.out.println("My goal is: Be a junior software developer.");
        Jane_Doe.introduce();
        System.out.println("My goal is: Be a junior software developer.");
        Gandhi.introduce();
        System.out.println("My goal is: Educate brilliant junior software developers.");
        Jane_Doe2.introduce();
         System.out.println("My goal is: Educate brilliant junior software developers.");
        Jane2.introduce();
        System.out.println("My goal is: Hire brilliant junior software developers.");
        Elon.introduce();
    System.out.println("My goal is: Hire brilliant junior software developers.");
        
    }
}
