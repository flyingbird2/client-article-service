package myrule;

import com.netflix.client.IClientConfigAware;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyRule2 implements IRule {
    private ILoadBalancer iLoadBalancer;
    @Override
    public Server choose(Object key) {
        Server server = iLoadBalancer.getAllServers().get(0);
        log.info("myrule2 target server info = {}",server);
        return server;

    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        this.iLoadBalancer = lb;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return iLoadBalancer;
    }


}
