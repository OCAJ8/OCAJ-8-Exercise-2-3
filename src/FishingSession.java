/**
 * Created by Thiago Bomfim
 * on 1/5/17.
 */
public class FishingSession {
    private String session;
    boolean baitAvailable = false;

    public static void main(String[] args) {
        FishingSession fishingSession = new FishingSession();
        fishingSession.setSession("active");
        int piecesOfBait = 5;

        piecesOfBait = 4; // Fox steals the bait!

        while (piecesOfBait != 0 ) {
            castForFish();
                  /* Check to see if bait is available */
            if (fishingSession.isBaitAvailable() == false) {
                    /* Place a new piece of bait on the hook */
                fishingSession.setBaitAvailable(true);
                System.out.println("Set baitAvailable to true");
                piecesOfBait--;
                System.out.println(piecesOfBait);
            }
        }
    }

    private static void castForFish() {
        // do something to cast for fish
    }

    private void setSession(String active) {
        this.session = active ;

    }

    public boolean isBaitAvailable() {
        return baitAvailable;
    }

    public void setBaitAvailable(boolean baitAvailable) {
        this.baitAvailable = baitAvailable;
    }
}
