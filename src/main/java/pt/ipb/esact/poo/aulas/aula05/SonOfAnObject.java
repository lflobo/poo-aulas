package pt.ipb.esact.poo.aulas.aula05;

class Parent {
}

class Relative extends Parent {
    int stack = 0;
    void method() {
        System.out.println(stack++);
        method();
    }
}

class SonOfAnObject {

    @Override
    public String toString() {
        return "I'm a son of an object...";
    }

    public static void main(String[] args) {
        Relative s = new Relative();
        s.method();
    }

}
