package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    //Amazon is the publisher
    //Publisher will have a list of all the subscribers

    private List<OrderPlacedSubscriber> orderPlacedSubscribers;

    private static Amazon instance;


    public Amazon(){
        this.orderPlacedSubscribers = new ArrayList<>();
    }

    public static Amazon getInstance(){
        if (instance==null){
            synchronized (Amazon.class){
                if(instance==null){
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void deRegisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void orderPlaced(){
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers){
            orderPlacedSubscriber.orderPlaceEvent();
        }
    }
}
