
package dungeonRun;

public class RunAdmin {
    
   private int mapChoice;
    private int position;

    public RunAdmin(int mapChoice, int position) {
        this.mapChoice = mapChoice;
        this.position = position;
    }

    public int getMapChoice() {
        return mapChoice;
    }

    public void setMapChoice(int mapChoice) {
        this.mapChoice = mapChoice;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}