package org.springside.examples.quickstart.service.order;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springside.examples.quickstart.domain.RedisConfig;
import org.springside.examples.quickstart.entity.Order;

/**
 * Created by ronghaizheng on 15/2/7.
 */
@Service
public class OrderService {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private RedisTemplate redisTemplate;

    public Order redisQueryOrderDetail(String orderId) {
        if (StringUtils.isBlank(orderId)) {
            return null;
        }
        HashOperations<String, String, Order> hashOrderOpt = redisTemplate.opsForHash();
        return hashOrderOpt.get(RedisConfig.ORDER_DETAIL_HASH_KEY, orderId);
    }
}
