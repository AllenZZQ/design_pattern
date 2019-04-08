package mvc;

/**
 * controller控制model的行为，也可以控制view的行为
 */
public class BeatController implements ControllerInterface {

    BeatModelInterface beatModelInterface;
    DjView djView;

    public BeatController(BeatModelInterface beatModelInterface, DjView djView) {
        this.beatModelInterface = beatModelInterface;
        this.djView = djView;
    }

    @Override
    public void start() {
        beatModelInterface.on();
    }

    @Override
    public void stop() {
        beatModelInterface.off();
    }

    @Override
    public void increase() {

    }
}
