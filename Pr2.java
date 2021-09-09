// you should define 'main' method in 'Main' class.
public class Pr2 {
	// your code
  public static void main(String[] args) {
    int boardingLimit  = 5;
    int goRound = (38/4);
    int remain = (38%4);
    int lastRound = 0;
    if (remain <= 4) {
        lastRound++;

    }
    int trip = goRound + lastRound;
    System.out.println("Number of Round Trips  = " + trip);
  }
}
