package drebot;

/**
 * Created by Igoruch on 10.03.2016.
 */
public class Product {
    private String name;
    private String code;
    private int count;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCount() {
        return count;
    }

    public Product(String name, String code, int count){
        this.name = name;
        this.code = code;
        this.count = count;
    }
}
