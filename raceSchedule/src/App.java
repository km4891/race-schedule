import java.util.*;

public class App {

    public static class Raceschedule {
        Scanner s = new Scanner(System.in);
        int mood;
            String[] race1 = {
                "Horse: Snowstorm\nJockey: Joey Buttafuoco\nWeight: 135lbs\n",
                "Horse: Knee High\nJockey: Tonya Harding\nWeight: 128lbs\n", 
                "Horse: Pants on Fire\nJockey: Ellis Philbuckle\nWeight: 131lbs\n",
                "Horse: *NSYNC\nJockey: Lance Bass\nWeight: 138lbs\n",
                "Horse: 5th Element\nJockey: Bruce Willis\nWeight: 133lbs\n"
            };
            String[] metalSongs = {
                "Horse: Pulp N Slick\nJockey: AJ Shaw\nWeight: 129lbs\n",
                "Horse: Peewee\nJockey: Paul Ruebens\nWeight: 137lbs\n", 
                "Horse: Barnaby\nJockey: Peter Falk\nWeight: 132lbs\n",
                "Horse: National Treasure\nJockey: Nic Cage\nWeight: 130lbs\n",
                "Horse: Stargate\nJockey: Kurt Russell\nWeight: 135lbs\n" 
            };
            String[] hippySongs = {
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
            int metalindex = r.nextInt(high - low) + low;
            int hippyindex = r.nextInt(high - low) + low;
            int loveindex = r.nextInt(high - low) + low;
            int rannum = r.nextInt(high - low) + low;
            int rannum2 = r.nextInt(high - low) + low;
            int rannum3 = r.nextInt(high - low) + low;

            
            String name;
        
        // Getgroove() {
        //     name = s.next();
        // }
        
        // Getgroove(String name) {
        //     this.name = name;
        // }
        
        // choices menu
        void menu() {
            System.out.println("What kind of mood are you in " + name + "?");
            System.out.println("1. I'm feeling very bubblicious");
            System.out.println("2. I want to breaking something tonight");
            System.out.println("3. I'm crunchy peanut butter on toast");
            System.out.println("4. I'm... uh... you know....");
            System.out.println("5. Oh I'm already getting down with my bad self");

       
            mood = s.nextInt();
            
            
                if (mood == 1) {   
                    System.out.println("Race 1:");
                    for (int i=rannum; i<5; i++) {            
                    int sz = race1.length;
                    if (race1index >= sz) race1index = 0;
                    System.out.println(race1[race1index]);
                    race1index++;
                    }
                    System.out.println( name + ", are you ready to go to the mall and get the latest Tiger Beat? (y/n)");
                    char c = s.next().charAt(0);
                    if (c == 'y') mood = 5;
                    
                } else if (mood == 2) {
                    System.out.println("Race 2:");
                    for (int i=rannum; i<4; i++) {
                    int sz = metalSongs.length;
                    if (metalindex >= sz) metalindex = 0;
                    System.out.println("Ready to kill your ears and crank this to 11 " + metalSongs[metalindex]);
                    metalindex++;
                    }
                    System.out.println("Did that get out all your angsty teen anger out? (y/n)");
                    char c = s.next().charAt(0);
                    if (c == 'y') mood = 5;
                
                } else if (mood == 3) {
                    System.out.println("Race 3:");
                    for (int i=rannum; i<4; i++) {
                    int sz = hippySongs.length;
                    if (hippyindex >= sz) hippyindex = 0;
                    System.out.println("Turn on, Tune in, Drop out and listen to this " + hippySongs[hippyindex]);
                    System.out.println(hippyindex);
                    hippyindex++;
                    }
                    System.out.println("Are you all groovy now? (y/n)");
                    char c = s.next().charAt(0);
                    if (c == 'y') mood = 5;

                } 
                else if (mood == 4) {
                    System.out.println("Race 1:");
                    for (int i=rannum; i<5; i++) {            
                    int sz = race1.length;
                    if (race1index >= sz) race1index = 0;
                    System.out.println(race1[race1index]);
                    race1index++;
                    };
                    System.out.println("Race 2:");
                    for (int i=rannum; i<5; i++) {
                    int sz = metalSongs.length;
                    if (metalindex >= sz) metalindex = 0;
                    System.out.println( metalSongs[metalindex]);
                    metalindex++;
                    };
                    System.out.println("Race 3:");
                    for (int i=rannum; i<5; i++) {
                    int sz = hippySongs.length;
                    if (hippyindex >= sz) hippyindex = 0;
                    System.out.println( hippySongs[hippyindex]);
                    // System.out.println(hippyindex);
                    hippyindex++;
                }
            }

               
            
                // } else if (mood == 5)  {
                    
                // }
            
            
        }
        
        int getmood() {
            return mood;
        }
        // String getname() {
        //     return name;
        // }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("This is the International Man of Mystery, Austin Powers. I'm here to help you get your mojo back. Yeah Baby!");
        // System.out.print("So what's you name? ");
        Raceschedule mood1 = new Raceschedule();
        // // creates a new instance
        // Getgroove name2 = new Getgroove("Fred");
     
        
        
        
        System.out.println("make a selection");
        while (mood1.getmood() != 5) {
            mood1.menu();
        }
        System.out.println("Glad I could help you get your groove thang back!");
        
    }
}
