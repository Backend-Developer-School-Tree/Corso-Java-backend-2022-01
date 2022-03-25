package tree_express;

import java.util.Objects;
import java.util.UUID;

public class Delivery {
    private UUID id;
    private TreeExpressUser sender;
    private TreeExpressUser receiver;
    private double weight;
    private DeliveryType deliveryType;

    public Delivery(UUID id, TreeExpressUser sender, TreeExpressUser receiver, double weight, DeliveryType deliveryType) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
        this.deliveryType = deliveryType;
    }

    public UUID getId() {
        return id;
    }

    public TreeExpressUser getSender() {
        return sender;
    }

    public TreeExpressUser getReceiver() {
        return receiver;
    }

    public double getWeight() {
        return weight;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(id, delivery.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
