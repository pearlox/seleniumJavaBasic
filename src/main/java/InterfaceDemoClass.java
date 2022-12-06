import java.util.ArrayList;
import java.util.List;

public class InterfaceDemoClass implements demo,demo2 {

    public void display() {
    List list = new ArrayList();
    }

    @Override
    public void disp() {

    }
}

interface demo {

    int demoX = 1;
    public void display();
}

interface demo2 {
    public void disp();
}
