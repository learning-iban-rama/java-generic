package generic.application;

public class ConstraintApp {

    public static void main(String[] args) {
        NumberData<Integer> intVar = new NumberData<>(1);
        NumberData<Long> longVar = new NumberData<>(1L);
    }

    public static class NumberData<T extends Number> {
        private T val;

        public NumberData(T val) {
            this.val = val;
        }

        public T getVal() {
            return val;
        }

        public void setVal(T val) {
            this.val = val;
        }
    }

}
