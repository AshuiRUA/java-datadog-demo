# java-datadog-demo


# How to run?
mvn package

java -javaagent:dd-java-agent.jar -Ddd.profiling.enabled=true -XX:FlightRecorderOptions=stackdepth=256 -Ddd.logs.injection=true -Ddd.service=java-datadog-demo -Ddd.env=dev -Ddd.version=1.0.0  -jar ./target/java-datadog-demo-0.0.1-SNAPSHOT.jar
