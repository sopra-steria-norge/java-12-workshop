mkdir -p build

javac -d build -sourcepath src $(find src -name '*.java')
java -cp build Main