# Apache-Kafka-SpringBoot-MicroService


STEP 1: START THE KAFKA ENVIRONMENT

# Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties

# Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties

STEP 2: CREATE A TOPIC TO STORE YOUR EVENTS

$ bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

$ bin/kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092

STEP 3: WRITE SOME EVENTS INTO THE TOPIC

$ bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092

STEP 4: READ THE EVENTS

$ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

