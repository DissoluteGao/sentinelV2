package com.alibaba.csp.sentinel.dashboard.rule.nacos.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "nacos.server")
public class NacosConfigProperties {

    private String ip;

    private String port;

    private String namespace;

    private String groupId;

    private String flowRulePostfix;

    private String degradeRulePostfix;

    private String authorityRulePostfix;

    private String systemRulePostfix;

    private String paramRulePostfix;

    private String apiPostfix;

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getPort() {
        return port;
    }
    public void setPort(String port) {
        this.port = port;
    }
    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public String getServerAddr() {
        return this.getIp()+":"+this.getPort();
    }

    public String getFlowRulePostfix() {
        return flowRulePostfix;
    }

    public void setFlowRulePostfix(String flowRulePostfix) {
        this.flowRulePostfix = flowRulePostfix;
    }

    public String getDegradeRulePostfix() {
        return degradeRulePostfix;
    }

    public void setDegradeRulePostfix(String degradeRulePostfix) {
        this.degradeRulePostfix = degradeRulePostfix;
    }

    public String getAuthorityRulePostfix() {
        return authorityRulePostfix;
    }

    public void setAuthorityRulePostfix(String authorityRulePostfix) {
        this.authorityRulePostfix = authorityRulePostfix;
    }

    public String getSystemRulePostfix() {
        return systemRulePostfix;
    }

    public void setSystemRulePostfix(String systemRulePostfix) {
        this.systemRulePostfix = systemRulePostfix;
    }

    public String getParamRulePostfix() {
        return paramRulePostfix;
    }

    public void setParamRulePostfix(String paramRulePostfix) {
        this.paramRulePostfix = paramRulePostfix;
    }

    public String getApiPostfix() {
        return apiPostfix;
    }

    public void setApiPostfix(String apiPostfix) {
        this.apiPostfix = apiPostfix;
    }

    @Override
    public String toString() {
        return "NacosConfigProperties [ip=" + ip + ", port=" + port + ", namespace="
                + namespace + ", groupId=" + groupId + "]" + ", flowRulePostfix=" + flowRulePostfix + "]"
                + ", apiPostfix=" + apiPostfix + "]";
    }
}
