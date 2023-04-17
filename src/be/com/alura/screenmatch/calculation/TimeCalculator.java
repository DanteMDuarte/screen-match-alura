package be.com.alura.screenmatch.calculation;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void include(Movie m) {
//        this.totalTime += m.getDurationInMinutes();
//    }
//
//    public void include(Series s) {
//        this.totalTime += s.getDurationInMinutes();
//    }

    public void include(Title title) {
        this.totalTime +=title.getDurationInMinutes();
    }
}
