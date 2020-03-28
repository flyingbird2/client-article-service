package myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }

    @Override
    public Server choose(Object key) {
        log.info("kai shi ----->>>>");
        Server server = getLoadBalancer().getAllServers().get(0);
        log.info("target server info = {}",server);
        return server;
    }
}
