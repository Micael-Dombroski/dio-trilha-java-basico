package exercicio1;

import exercicio1.clocks.BRLClock;
import exercicio1.clocks.Clock;
import exercicio1.clocks.USClock;

public class Main {
    public static void main(String[] args) {
        Clock brlclock = new BRLClock();
        brlclock.setSecond(0);
        brlclock.setMinute(0);
        brlclock.setHour(5);

        System.out.println(brlclock.getTime());
        System.out.println(new USClock().convert(brlclock).getTime());
    }
}
