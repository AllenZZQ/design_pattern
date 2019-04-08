package designPattern.adapter;

public class Adapter implements AdInterface {

    private AdClass adClass;

    public Adapter(AdClass adClass) {
        this.adClass = adClass;
    }

    @Override
    public void does() {
        adClass.d();
    }
}
