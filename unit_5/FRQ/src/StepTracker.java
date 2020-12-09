public class StepTracker {

    private int stepAmt;
    private int stepTkn;
    private int day;
    private int actDay;

    public StepTracker(int step){
        stepAmt = step;
    }

    public int activeDays(){
        return actDay;
    }

    public double averageSteps(){
        if(day>0) {
            return (double)stepTkn / day;
        }
        return 0;
    }

    public void addDailySteps(int amt){
        day++;
        stepTkn+=amt;
        if(amt>=stepAmt){
            actDay++;
        }
    }



}
