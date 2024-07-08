package generic.application;

public class MultipleConstraintApp {

    public static void main(String[] args) {
//        Data<Manager> managerData = new Data<Manager>(new Manager());
        Data<VicePresident> managerVicePresident = new Data<>(new VicePresident());
        managerVicePresident.getData();

    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {
    }

    public static class Manager extends Employee {
        @Override

        public String toString() {
            return "Manager{}";
        }
    }

    public static class VicePresident extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("hello " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            this.data.sayHello("rama");
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

}
