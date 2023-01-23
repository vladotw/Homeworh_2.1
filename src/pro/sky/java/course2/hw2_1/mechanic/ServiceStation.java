package pro.sky.java.course2.hw2_1.mechanic;

import pro.sky.java.course2.hw2_1.bus.Bus;
import pro.sky.java.course2.hw2_1.transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    private final Queue<T> transportQueue = new LinkedList<>();

    public void addTransportToQueue(T transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусам не нужно проходить ТО");
        }else {
            transportQueue.offer(transport);
            System.out.println(transport.getBrand() + " " + transport.getModel() + " встал в очередь на ТО");
        }
    }

    public void condactTO() {
        T transport = transportQueue.poll();
        if (transport != null) {
            System.out.println("ТС " + transport.getBrand() + " " + transport.getModel() + " проходит техосмотр");
        }
    }
}
