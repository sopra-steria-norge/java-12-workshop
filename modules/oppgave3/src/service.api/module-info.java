module service.api {
    exports api to service.provider.one,service.provider.two;
    uses api.Service;
}