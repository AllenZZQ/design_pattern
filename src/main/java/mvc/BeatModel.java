package mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * model包含状态和应用逻辑
 */
public class BeatModel implements BeatModelInterface {


    private List<BeatOberver> beatObervers = new ArrayList<>();

    @Override
    public void initialize() {

    }

    @Override
    public void on() {
        System.out.println("i am on");
    }

    @Override
    public void off() {
        System.out.println("i am off");
    }

    @Override
    public void registerObserver(BeatOberver beatOberver) {
        beatObervers.add(beatOberver);
    }
}
