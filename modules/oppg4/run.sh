javac -d build --module-source-path src -m module.client,service.provider.one,service.provider.two,service.api
java --module-path build -m module.client/client.Client