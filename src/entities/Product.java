package entities;

public class Product {

    private Long id;
    private String name;
    private Double price;
    private String descriprion;
    private String imageUri;


    public Product() {
    }


    public Product(Long id, String name, Double price, String descriprion, String imageUri) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descriprion = descriprion;
        this.imageUri = imageUri;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescriprion() {
        return this.descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    public String getImageUri() {
        return this.imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", descriprion='" + getDescriprion() + "'" +
            ", imageUri='" + getImageUri() + "'" +
            "}";
    }
    


}
