package mvc;

public interface BeatModelInterface {

    void initialize();

    void on();

    void off();

    void registerObserver(BeatOberver beatOberver);


}
