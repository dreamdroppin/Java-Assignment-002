import javax.sound.midi.SysexMessage;



//Remember to later group the print w/ the int Time
public class Time {

    public static void main(String[] args) {

        //Start Time: 01:29:09
        int hour = 1;
        int minute = 29;
        int second = 9;

        //Display seconds since midnight
        //If 60 works for minute in the textbook

        System.out.println("Number of seconds since midnight: " + (hour * 3600 + minute * 60 + second));

        //Display seconds /until/ midnight ; remaining in the day
        //If the top was multiplication, and is the reverse of this...
        //System.out.println("Number of seconds until midnight: " + (hour / 3600 + minute / 60 + second);

        //Okay... How many seconds are in a day? 86,400
        //And how many have passed? 5349
        //How can I display 81,051 WHILE typing in something that could work for all situations?
        //A set in stone unchanging fact is that there are 86,400 seconds in a day:

        System.out.println("Number of seconds until midnight: " + (86400 - (hour * 3600 + minute * 60 + second)));
        //System.out.println(86400- (hour * 3600 + minute * 60 + second));

        //Display percentage of day that pasted
        //How can I make this into a fraction?

        System.out.print("Percent of the day that has passed: " + (hour * 3600.0 + minute * 60.0 + second) / (24 * 3600.0) * 100.0);

        //This is to stop how somehow percent of day and finish time are one line?
        System.out.println(" ");

        //Modify to time when done
        //Finish Time:

        int donehour = 12;
        int doneminute = 51;
        int donesecond = 8;

        System.out.println("Finish Time: " + donehour + ":" + doneminute + ":" + donesecond);

        //System.out.println("Duration of this Assignment: " + (donehour - hour) + ":" + (doneminute - minute) + ":" + (donesecond - second));
        //From this the seconds came out as -1

        //Apparently you can handle "negative" values

        int durationsecond = donesecond - second;
        int durationminute = doneminute - minute;

        // Handle negative values
        if (durationsecond < 0) {
            durationsecond += 60;
            durationminute--;

            System.out.println("Duration of this Assignment: " + (donehour - hour) + ":" + (doneminute - minute) + ":" + durationsecond);
        }

    }

}

