import java.util.*;

public class App {

    public static class Raceschedule {
        Scanner s = new Scanner(System.in);
        int mood;
            String[] popSongs = {
                "Horse: Snowstorm\nJockey: Joey Buttafuoco\nWeight: 135lbs\n",
                "Horse: Knee High\nJockey: Tonya Harding\nWeight: 128lbs\n", 
                "Horse: Pants on Fire\nJockey: Ellis Philbuckle\nWeight: 131lbs\n",
                "Horse: *NSYNC\nJockey: Lance Bass\nWeight: 138lbs\n",
                "Horse: 5th Element\nJockey: Bruce Willis\nWeight: 133lbs\n"
            };
            String[] metalSongs = {
                "Limp Bizkit - Break Stuff (https://www.youtube.com/watch?v=ZpUYjpKg9KY)",
                "Twisted Sister - We're Not Gonna Take It (https://www.youtube.com/watch?v=V9AbeALNVkk)",
                "Black Sabbath - Iron Man (https://www.youtube.com/watch?v=5s7_WbiR79E)", 
                "White Zombie - More Human Than Human (https://www.youtube.com/watch?v=E0E0ynyIUsg)" 
            };
            String[] hippySongs = {
                "Jefferson Airplane - White Rabbit (https://www.youtube.com/watch?v=WANNqr-vcx0&)",
                "Strawberry Alarm Clock - Peppermints & Incense (https://www.youtube.com/watch?v=4rw1_FNdy-Y)",
                "Iron Butterfly - In-A-Gadda-Da-Vida (https://www.youtube.com/watch?v=UIVe-rZBcm4)",
                "Jimi Hendrix - Purple Haze (https://www.youtube.com/watch?v=cJunCsrhJjg)"
            };
            String[] loveSongs = {
                "Marvin Gaye - Let's Get It On (https://www.youtube.com/watch?v=9vAiESu5wrA)",
                "Barry White - Can't Get Enough Of Your Love Baby (https://www.youtube.com/watch?v=WASXt0bcl6U)",
                "Clarence Carter - Strokin' (https://www.youtube.com/watch?v=P7gMkiOPSeA)",
                "Salt N Pepa - Push It (https://www.youtube.com/watch?v=vCadcBR95oU)"
            };
            
            // randomizes the solution given
            Random r = new Random();
            int low = 1;
            int high = 4;
            int popindex = r.nextInt(high - low) + low;
            int metalindex = r.nextInt(high - low) + low;
            int hippyindex = r.nextInt(high - low) + low;
            int loveindex = r.nextInt(high - low) + low;
           
            
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
                    for (int i=0; i<4; i++) {            
                    int sz = popSongs.length;
                    if (popindex >= sz) popindex = 0;
                    System.out.println(popSongs[popindex]);
                    popindex++;
                    }
                    System.out.println( name + ", are you ready to go to the mall and get the latest Tiger Beat? (y/n)");
                    char c = s.next().charAt(0);
                    if (c == 'y') mood = 5;
                    
                } else if (mood == 2) {
                    
                    int sz = metalSongs.length;
                    if (metalindex >= sz) metalindex = 0;
                    System.out.println("Ready to kill your ears and crank this to 11 " + metalSongs[metalindex]);
                    metalindex++;
                    
                    System.out.println("Did that get out all your angsty teen anger out? (y/n)");
                    char c = s.next().charAt(0);
                    if (c == 'y') mood = 5;
                
                } else if (mood == 3) {

                    int sz = hippySongs.length;
                    if (hippyindex >= sz) hippyindex = 0;
                    System.out.println("Turn on, Tune in, Drop out and listen to this " + hippySongs[hippyindex]);
                    System.out.println(hippyindex);
                    hippyindex++;

                    System.out.println("Are you all groovy now? (y/n)");
                    char c = s.next().charAt(0);
                    if (c == 'y') mood = 5;

                } else if (mood == 4) {

                    int sz = loveSongs.length;
                    if (loveindex >= sz) loveindex = 0;
                    System.out.println("Light some candles and turn this on " + loveSongs[loveindex]);
                    loveindex++;

                    System.out.println("Do you need smoke after that? (y/n)");
                    char c = s.next().charAt(0);
                    if (c == 'y') mood = 5;
            
                } else if (mood == 5)  {
                    
                }
            
            
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
