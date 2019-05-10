mkdir -p lib
jar --create -f lib/provider-one.jar -C build/service.provider.one .
jar --create -f lib/provider-two.jar -C build/service.provider.two .
jar --create -f lib/api.jar -C build/service.api .
jar --create -f lib/client.jar -C build/module.client .