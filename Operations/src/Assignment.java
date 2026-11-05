public class Assignment{
    static void main(String[] args){
        int quantity = 2, a = 5, b = 7, d = 3,e = 4;
        quantity = quantity + 4;
        int c = (a >= b) ? a : b; //Ternary Operator
        int f = ++d; //Increment Operator
        int g = --e; // decrement Operator
        if (c == b){
            System.out.println(quantity+"\n"+c+"\n"+f+"\n"+g);
        }
    }
}