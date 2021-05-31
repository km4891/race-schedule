import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class App {

        // This is a class called Getdate
        static class Getdate {

            // it has a member variable constant for the format string
            public static final String FORMAT = "yyyy-MM-dd hh:mm:ss";
    
            // it has a member function that returns the date as a string
            public String getDateString() {
                Date date = Calendar.getInstance().getTime();
                DateFormat dateFormat = new SimpleDateFormat(FORMAT);
                return dateFormat.format(date);
            }
        } 


    public static class Raceschedule {
        Scanner s = new Scanner(System.in);
        int selection;
            String[] race1 = {
                "Horse: Snowstorm\nJockey: Joey Buttafuoco\nWeight: 135lbs\n",
                "Horse: Knee High\nJockey: Tonya Harding\nWeight: 128lbs\n", 
                "Horse: Pants on Fire\nJockey: Ellis Philbuckle\nWeight: 131lbs\n",
                "Horse: *NSYNC\nJockey: Lance Bass\nWeight: 138lbs\n",
                "Horse: 5th Element\nJockey: Bruce Willis\nWeight: 133lbs\n"
            };
            String[] race2 = {
                "Horse: Pulp N Slick\nJockey: AJ Shaw\nWeight: 129lbs\n",
                "Horse: Peewee\nJockey: Paul Ruebens\nWeight: 137lbs\n", 
                "Horse: Barnaby\nJockey: Peter Falk\nWeight: 132lbs\n",
                "Horse: National Treasure\nJockey: Nic Cage\nWeight: 130lbs\n",
                "Horse: Stargate\nJockey: Kurt Russell\nWeight: 135lbs\n" 
            };
            String[] race3 = {
                "Horse: Sandals\nJockey: Michael Scarn\nWeight: 136lbs\n",
                "Horse: Philadelphia\nJockey: Jim Halpert\nWeight: 137lbs\n", 
                "Horse: Motel Art\nJockey: Pam Beasley\nWeight: 127lbs\n",
                "Horse: Pretzel Day\nJockey: Stanley Hudson\nWeight: 140lbs\n",
                "Horse: Chili Con Carne\nJockey: Kevin Malone\nWeight: 132lbs\n" 
            };
            
            
            // randomizes the solution given
            Random r = new Random();
            int low = 1;
            int high = 5;
            int race1index = r.nextInt(high - low) + low;
            int race2index = r.nextInt(high - low) + low;
            int race3index = r.nextInt(high - low) + low;
            int rannum = r.nextInt(high - low) + low;
            
        
         // creating an instance of Getdate and we are naming this instance mydate
        Getdate mydate = new Getdate();
        // calling the member function getDateString and saving it in s
        String d = mydate.getDateString();

    
            
       
        
        // choices menu
        void menu() {
            System.out.println("Welcom to Canyon Country Derby! Please make a selection");
            System.out.println("1. View Race 1 Schedule");
            System.out.println("2. View Race 2 Schedule");
            System.out.println("3. View Race 3 Schedule");
            System.out.println("4. View ALL Race Schedules");
            System.out.println("5. Exit");

       
            selection = s.nextInt();
            
            
                if (selection == 1) {   
                    System.out.println("Race 1: " + d);
                    for (int i=rannum; i<5; i++) {            
                    int sz = race1.length;
                    if (race1index >= sz) race1index = 0;
                    System.out.println(race1[race1index]);
                    race1index++;
                    }
                    
                    
                } else if (selection == 2) {
                    System.out.println("Race 2: " + d);
                    for (int i=rannum; i<5; i++) {
                    int sz = race2.length;
                    if (race2index >= sz) race2index = 0;
                    System.out.println(race2[race2index]);
                    race2index++;
                    }
                    
                
                } else if (selection == 3) {
                    System.out.println("Race 3: " + d);
                    for (int i=rannum; i<5; i++) {
                    int sz = race3.length;
                    if (race3index >= sz) race3index = 0;
                    System.out.println(race3[race3index]);
                    System.out.println(race3index);
                    race3index++;
                    }
                    

                } 
                else if (selection == 4) {
                    System.out.println("Race 1: " + d);
                    for (int i=rannum; i<5; i++) {            
                    int sz = race1.length;
                    if (race1index >= sz) race1index = 0;
                    System.out.println(race1[race1index]);
                    race1index++;
                    };
                    System.out.println("Race 2: " + d);
                    for (int i=rannum; i<5; i++) {
                    int sz = race2.length;
                    if (race2index >= sz) race2index = 0;
                    System.out.println( race2[race2index]);
                    race2index++;
                    };
                    System.out.println("Race 3: " + d);
                    for (int i=rannum; i<5; i++) {
                    int sz = race3.length;
                    if (race3index >= sz) race3index = 0;
                    System.out.println(race3[race3index]);
                    // System.out.println(hippyindex);
                    race3index++;
                }
            }   
        }
        int getselection() {
            return selection;
        }
    }
    public static void main(String[] args) throws Exception {
        Raceschedule selection1 = new Raceschedule();

     
        
        
        
        // System.out.println("make a selection");
        while (selection1.getselection() != 5) {
            selection1.menu();
        }
        System.out.println("See you next time at Canyon Country Derby!");
        
    }
}
