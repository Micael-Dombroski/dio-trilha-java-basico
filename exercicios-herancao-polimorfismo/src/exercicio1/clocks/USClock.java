package exercicio1.clocks;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday () {
        this.periodIndicator= "PM";
    }
    public void setBeforeMidday () {
        this.periodIndicator= "AM";
    }

    public void setHour(int hour) {
        if (hour >= 12 && hour <= 23) {
            this.hour = 12;
            setAfterMidday();
            this.hour = hour -12;
            return;
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        setBeforeMidday();
    }

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock:
                this.hour = usClock.getHour();
                this.periodIndicator = getPeriodIndicator();
                break;
            case BRLClock brlClock:
                this.setHour(brlClock.getHour());
                break;
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }
    
}
