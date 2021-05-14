package entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private  Long id;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private OrderStatus status;

    private List<Product> products = new ArrayList<>();


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Instant getMoment() {
        return this.moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", latitude='" + getLatitude() + "'" +
            ", longitude='" + getLongitude() + "'" +
            ", moment='" + getMoment() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
    
    

    
}
