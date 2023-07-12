
class GreaterThan2 implements ReturnValueInterface {
	private int object;

    public GreaterThan2(int object) {
        this.object = object;
    }

    public int returnValue() {
        return object;
    }

    public int getValue() {
        return object;
    }
}