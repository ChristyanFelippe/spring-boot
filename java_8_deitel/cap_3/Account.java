public class Account {

    private String name;

    // o construtor inicializa name com nome do parâmetro
    public Account (String name){
        this.name = name; // o nome do construtor é nome da classe ÿ
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}