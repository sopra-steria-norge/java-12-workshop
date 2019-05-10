rm -r build
mkdir -p build

javac -d build --module-source-path src -m module.client,module.domain,module.api
java --module-path build -m module.client/client.Client