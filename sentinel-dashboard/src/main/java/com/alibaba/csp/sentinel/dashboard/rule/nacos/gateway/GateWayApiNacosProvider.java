package com.alibaba.csp.sentinel.dashboard.rule.nacos.gateway;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.gateway.ApiDefinitionEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.config.NacosConfigProperties;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.config.NacosConfigUtil;
import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.util.StringUtil;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("gateWayApiNacosProvider")
public class GateWayApiNacosProvider implements DynamicRuleProvider<List<ApiDefinitionEntity>> {
    @Autowired
    private ConfigService configService;
    @Autowired
    private Converter<String , List<ApiDefinitionEntity>> converter;
    @Autowired
    private NacosConfigProperties nacosConfigProperties;
    @Override
    public List<ApiDefinitionEntity> getRules(String appName) throws Exception {
        String rules = configService.getConfig(appName+ nacosConfigProperties.getApiPostfix()
                ,nacosConfigProperties.getGroupId(),3000);
        if(StringUtil.isEmpty(rules)){
            return new ArrayList<>();
        }
        return converter.convert(rules);
    }
}
