package drebot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igoruch on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Product> products = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть найменування продукції");
        String name = reader.readLine();
        System.out.println("Введіть код продукції");
        String code = reader.readLine();
        System.out.println("Введіть кількість одиниць продукції");
        int count = Integer.parseInt(reader.readLine());
        Product product = new Product(name,code,count);
        products.add(product);
        System.out.println("------------------");
        System.out.println("Перелік продукції на складі:");
        for (int i = 0; i <products.size() ; i++) {
            System.out.println("Назва:" + products.get(i).getName() +
                    "  Штрих-код:" + products.get(i).getCode()+
                    "  Кількість:" + products.get(i).getCount());
        }
        System.out.println("\nВидалити продукцію на складі?   Y/N");
        String yesNo = reader.readLine();
        if(yesNo.equals("Y")){
            delete(products);
            for (int i = 0; i <5 ; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("");
        }
        if (products.isEmpty()) System.out.println("На складі більше не залишилось продукції");



    }
    public static void delete(List<Product> products){
        for (int i = 0; i <products.size() ; i++) {
            products.remove(i);
        }

    }

}
