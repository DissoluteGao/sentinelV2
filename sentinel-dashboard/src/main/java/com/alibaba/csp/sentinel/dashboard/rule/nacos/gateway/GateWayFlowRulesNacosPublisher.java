package com.alibaba.csp.sentinel.dashboard.rule.nacos.gateway;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.gateway.GatewayFlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.config.NacosConfigProperties;
import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.util.AssertUtil;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("gateWayFlowRulesNacosPublisher")
public class GateWayFlowRulesNacosPublisher implements DynamicRulePublisher<List<GatewayFlowRuleEntity>> {

    @Autowired
    private ConfigService configService;
    @Autowired
    private Converter<List<GatewayFlowRuleEntity>, String> converter;
    @Autowired
    private NacosConfigProperties nacosConfigProperties;

    @Override
    public void publish(String app, List<GatewayFlowRuleEntity> rules) throws Exception {
        AssertUtil.notEmpty(app, "app name cannot be empty");
        if (rules == null) {
            return;
        }
        configService.publishConfig(app + nacosConfigProperties.getFlowRulePostfix(),
                nacosConfigProperties.getGroupId(), converter.convert(rules));
    }
}
