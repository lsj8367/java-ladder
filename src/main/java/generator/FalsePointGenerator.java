package generator;

public class FalsePointGenerator implements PointGenerator {
    @Override
    public boolean isConnect(boolean previousPoint) {
        return Boolean.FALSE;
    }

    @Override
    public boolean random() {
        return false;
    }
}
