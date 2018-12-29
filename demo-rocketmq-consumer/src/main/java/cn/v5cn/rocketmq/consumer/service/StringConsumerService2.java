package cn.v5cn.rocketmq.consumer.service;

import cn.v5cn.rocketmq.consumer.util.Constants;
import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;
import org.apache.rocketmq.spring.starter.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.starter.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(topic = "test5555",consumerGroup = Constants.SPRING_TOPIC_CONSUMER)
public class StringConsumerService2 implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("接收到消息时间2：" + System.currentTimeMillis());
        System.out.println(s);
    }
}
