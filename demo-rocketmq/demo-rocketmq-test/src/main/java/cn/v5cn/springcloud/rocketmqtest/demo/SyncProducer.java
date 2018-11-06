package cn.v5cn.springcloud.rocketmqtest.demo;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;

public class SyncProducer {

    public static void main(String[] args) {
        try {
            DefaultMQProducer producer = new DefaultMQProducer("nsop-test");
            producer.setNamesrvAddr("localhost:9876");
            producer.start();

            for(int i = 0; i < 10; i++) {
                Message message = new Message("TopicTest"/*Topic*/,
                        "TagA"/*Tag*/,
                        ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET)/*Message body*/);
                SendResult sendResult = producer.send(message);
                System.out.printf("%s%n",sendResult);
            }

            producer.shutdown();
        } catch (MQClientException | UnsupportedEncodingException | RemotingException | MQBrokerException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
