javac -d build -sourcepath src $(find src -name '*.java')
java -cp build Main

1. Kjør run.sh eller kommandoene den inneholder for å se at classpath fortsatt eksisterer og at ikke modulær kode kan kompileres og kjøres på Java 9+
2. Legg merkee til hvordan denne klassen hører til unnamed module og derfor ikke kan kjøres med module-path. Modulen har ikke et navn dermed vil ikke kommandoen under kunne kjøres.
 
 java --module-path out -module moduleName/com.module.Main
