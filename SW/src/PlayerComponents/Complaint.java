package PlayerComponents;
import System.*;
import PlaygroundComponents.*;

public class Complaint {
    public Complaint(int playerId, int playgroundId, String temp){
        this.playerId = playerId;
        this.playgroundId = playgroundId;
        text = temp;
    }

    Database db = new Database();
    int playerId;
    int playgroundId;
    String text;

    public void run(){
        db.addComplaint(this);
    }
}