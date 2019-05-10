package api;

import java.util.ServiceLoader;
import java.util.List;
import java.util.ArrayList;

public interface Service {
    String getName();

    static List<Service> getInstances() {
        ServiceLoader<Service> services = ServiceLoader.load(Service.class);
        List<Service> list = new ArrayList<>();
        services.iterator().forEachRemaining(list::add);
        return list;
    }
}