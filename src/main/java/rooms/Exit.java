package rooms;
import java.lang.Math;

public enum Exit {
    EXIT1("West"),
    EXIT2("East"),
    EXIT3("North"),
    EXIT4("South");

    public String direction;

    Exit(String direction) {
        this.direction = direction;
    }

    public String getExit(){
        return this.direction;
    }

}

