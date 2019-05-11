javac -d build --module-source-path src -m module.one,module.two
java --module-path build -m module.one/one.One

1. Få dette modulære eksempelet til å bygge.
2. Hvorfor må java.logging legges til i moduldeskriptoren mens java.time fungerer?
3. Modulen din har default tilgang til java.base kjør "java --describe-module java.base" for å se moduldeskriptoren dens.
4. Fra One.java i module.one ta i bruk Two.java sin getModule() metode og logg informasjon om module.two. Se litt på hva slags info og operasjoner man har tilgjengelig på et Module object. Ev. https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/Module.html
