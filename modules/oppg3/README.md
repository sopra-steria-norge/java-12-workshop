javac -d build --module-source-path src -m module.client,module.domain,module.api
java --module-path build -m module.client/client.Client

1. Kjør eksempelet med run.sh (ev. bruk kommandoene den inneholder direkte). Hvordan kan vi sørge for at alle brukere av module.api også har tilgang til klassen Person uten å bruke en "requires module" direkte?
