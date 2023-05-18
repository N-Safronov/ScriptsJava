import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

///Ввод переменных с консоли
public class Main {
    public static void main(String[] args) {
        password();
    }


    static void print(){
        ///char
        System.out.println("char");
        char symbol = '\u0066';// Unicode
        System.out.println(symbol);
        symbol = 102; // ASCII
        System.out.println(symbol);
        symbol = 'f';
        System.out.println(symbol);

        ///boolean
        System.out.println("boolean");
        boolean checker = true;
        System.out.println(checker);
        BitSet selected = new BitSet();
        selected.set(0, true);
        System.out.println(selected.get(0));

        ///byte
        System.out.println("boolean");
        byte value = 2;
        System.out.println(value);
        byte shortByteValue = 0b10; // 2
        System.out.println(shortByteValue);
        byte minByteValue = (byte) 0B1000_0000; // -128
        System.out.println(minByteValue);
        byte maxByteValue = (byte) 0b0111_1111; // 127
        System.out.println(maxByteValue);
        byte minusByteValue = (byte) 0b1111_1111; // -1
        System.out.println(minusByteValue);
        byte plusByteValue = (byte) 0b0000_0001; //1
        System.out.println(plusByteValue);

        //short
        System.out.println("short");
        short number = 35;
        System.out.println(number);
        number = 0b1111111;
        System.out.println(number);
        number = -0b111_1111_1111_1111;
        var a = Short.MIN_VALUE;
        System.out.println(number);

        //int
        System.out.println("int");
        int x = 4;
        System.out.println(x);

        //long
        System.out.println("long");
        long longValue = 4;
        System.out.println(longValue);
        longValue = 2L;
        System.out.println(longValue);

        //float
        System.out.println("float");
        float floatValue = 4.5F;
        System.out.println(floatValue);

        //double
        System.out.println("double");
        double doubleValue = 4.5D;
        System.out.println(doubleValue);

        //String
        System.out.println("String");
        String stringValue = "JAVA";
        System.out.println(stringValue);

        //Array
        System.out.println("Array");
        int[] mas = {0, 1, 2, 5};
        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
    }

    static  void comparison(){
        Scanner keyboard = new Scanner(System.in);
        var firstNumber = keyboard.nextInt();
        var secondNumber = keyboard.nextInt();
        if(firstNumber > secondNumber){
            System.out.println(firstNumber);
        }
    }

    static void gapBetweenNumbers(){
        Scanner keyboard = new Scanner(System.in);
        var firstNumber = keyboard.nextInt();
        var secondNumber = keyboard.nextInt();
        for (int i = firstNumber; i<secondNumber; i++){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    static  void basket(){
        System.out.println("Добавьте продукты в карзину введя номер продкта");
        System.out.println("1 - Яблоко\n2 - Масло\n3 - Арбуз\n 4 - Картошка");
        System.out.println("Введите - 0 для просмотра корзины");
        List<String> groceryBasket = new ArrayList<>();
        while (true){
            Scanner keyboard = new Scanner(System.in);
            var number = keyboard.nextInt();
            switch (number){
                case 0:
                    for (String num : groceryBasket) {

                        System.out.print(num + " | ");
                    }
                    System.out.println();
                    break;
                case 1:
                    groceryBasket.add("Яблоко");
                    break;
                case 2:
                    groceryBasket.add("Масло");
                    break;
                case 3:
                    groceryBasket.add("Арбуз");
                    break;
                case 4:
                    groceryBasket.add("Картошка");
                    break;
            }
        }
    }


    static void password(){
        System.out.println("Введите пароль");
        Scanner keyboard = new Scanner(System.in);
        var password = keyboard.nextInt();
        System.out.println("Повторите пароль для выхода");
        while (true){
            var secondPassword = keyboard.nextInt();
            if(secondPassword == password){
                System.out.println("Верно!");
                return;
            }else{
                System.out.println("Не верно");
            }
        }
    }
}