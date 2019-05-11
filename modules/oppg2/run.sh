javac -d build --module-source-path src -m module.one,module.two
java --module-path build -m module.one/one.One