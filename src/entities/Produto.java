package entities;

public class Produto {
     private Double price;
     private String name;

    public Produto() {
    }

    public Produto(Double price, String name) {
        this.price = price;
        this.name = name;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Produto[Name = " + name +  " - price R$ = " + String.format("%.2f",price) +   "]";
    }
}
