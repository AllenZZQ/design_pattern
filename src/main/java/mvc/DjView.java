package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * view拥有controller，策略模式。
 * 当接受客户行为时，通过controller来行动
 * view是model的监听者，当model变化时进行更新
 */
public class DjView implements BeatOberver, ActionListener {

    private BeatModelInterface beatModelInterface;

    private ControllerInterface controllerInterface;

    public DjView(BeatModelInterface beatModelInterface, ControllerInterface controllerInterface) {
        this.beatModelInterface = beatModelInterface;
        this.controllerInterface = controllerInterface;
        beatModelInterface.registerObserver(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controllerInterface.start();
        controllerInterface.increase();
    }
}
