package lab1;

import java.time.LocalDate;

class Screening {
    private String screeningName;
    private double profit;
    private LocalDate screeningDate;

    public Screening(String screeningName, double profit, LocalDate screeningDate) {
        this.screeningName = screeningName;
        this.profit = profit;
        this.screeningDate = screeningDate;
    }


    public String getScreeningName() {
        return screeningName;
    }

    public void setScreeningName(String screeningName) {
        this.screeningName = screeningName;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public LocalDate getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(LocalDate screeningDate) {
        this.screeningDate = screeningDate;
    }


    public String toString() {
        return "Screening: " + screeningName + ", Profit: " + profit + ", Date: " + screeningDate;
    }
}

