<img src="https://user-images.githubusercontent.com/9434884/43697219-3cb4ef3a-9975-11e8-9a9c-73f4f537442d.png" alt="Sentinel Logo" width="50%">

# Sentinel: The Sentinel of Your Microservices

[![Travis Build Status](https://travis-ci.org/alibaba/Sentinel.svg?branch=master)](https://travis-ci.org/alibaba/Sentinel)
[![Codecov](https://codecov.io/gh/alibaba/Sentinel/branch/master/graph/badge.svg)](https://codecov.io/gh/alibaba/Sentinel)
[![Maven Central](https://img.shields.io/maven-central/v/com.alibaba.csp/sentinel-core.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:com.alibaba.csp%20AND%20a:sentinel-core)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![Gitter](https://badges.gitter.im/alibaba/Sentinel.svg)](https://gitter.im/alibaba/Sentinel)

改写各项规则推送nacos更新，自动创建相关规则文件
下载后直接mvn install，启动sentinel-dashboard项目下的jar包即可
相关配置在sentinel-dashboard下的application.properties中修改
nacos.server开头的配置，主要为生成的规则文件后缀及组名以及实际nacos地址等
nacos若开启了密码连接，请自行添加参数
规则推送拉取参照：
https://blog.csdn.net/weixin_42437633/article/details/108328767
sentinel版本为1.8.0

See the [中文文档](https://github.com/alibaba/Sentinel/wiki/%E4%BB%8B%E7%BB%8D) for document in Chinese.

See the [Wiki](https://github.com/alibaba/Sentinel/wiki) for full documentation, examples, blog posts, operational details and other information.
