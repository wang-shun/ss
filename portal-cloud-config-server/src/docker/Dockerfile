# SpringCloud注册中心
FROM harbor.sstcsoft.com/public/alpine/jre8u161:latest
MAINTAINER wangzhuhua <wangzhuhua6343@dingtalk.com >
LABEL Description="SSTC SpringCloud Register Center"

#配置环境
RUN mkdir /var/lib/sstc
ENV SSTC_HOME /var/lib/sstc
WORKDIR $SSTC_HOME

# 装载程序
ADD portal-cloud-config-server/target/portal-cloud-config-server-*.jar /var/lib/sstc/application.jar

#复制启动脚本  
#ADD run.sh /usr/lib/sstc/
#设置脚本权限  
#RUN chmod 755 /usr/lib/sstc/run.sh

#暴露端口
EXPOSE 8761

ENTRYPOINT ["java" , "-jar", "/var/lib/sstc/application.jar" ]

#CMD java -jar application.jar