module service.provider.one {
    requires service.api;
    provides api.Service with provider.one.ServiceOneImpl;
}