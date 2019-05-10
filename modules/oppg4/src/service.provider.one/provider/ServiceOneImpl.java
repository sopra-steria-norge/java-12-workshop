package provider.one;

import api.Service;

public class ServiceOneImpl implements Service{

    @Override
    public String getName() {
        return "Service One implementation";
    }
}