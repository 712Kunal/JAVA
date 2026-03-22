
// FINAL IN VARIABLE'S, METHODS AND CLASSES
// final class will not allow to inherit itself ->
// final class A {

//     public void show() {
//         System.out.println("In show A");
//     }

//     // final method can't be override
//     public final void add() {
//         System.out.println("In A add");
//     }
// }

// class B extends A {

//     public void show() {
//         System.out.println("In show B");
//     }

//     public void add() {
//         System.out.println("In B add");
//     }
// }

class FinalKeyword {

    public static void main(String[] args) {
        final float PI = 3.14f;

        System.out.println(PI);
        // PI = 32.3F; -> cannot assign a value to final variable PI
    }

}
