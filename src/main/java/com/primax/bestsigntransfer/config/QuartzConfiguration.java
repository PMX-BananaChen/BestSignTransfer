package com.primax.bestsigntransfer.config;

import com.primax.bestsigntransfer.quartz.PlenishBestSignInfoJob;
import com.primax.bestsigntransfer.quartz.SendContractJob;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;


@Configuration
public class QuartzConfiguration {


    /**
     * 回填档案柜资料定时任务
     * @param plenishBestSignInfoJob
     * @return
     */
    @Bean(name = "plenishBestSignInfoJobDetail")
    public MethodInvokingJobDetailFactoryBean plenishBestSignInfoJobDetail(PlenishBestSignInfoJob plenishBestSignInfoJob) {
        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
        // 是否并发执行
        jobDetail.setConcurrent(false);
        // 为需要执行的实体类对应的对象
        jobDetail.setTargetObject(plenishBestSignInfoJob);
        // 需要执行的方法
        jobDetail.setTargetMethod("plenishBestSignInfoTask");
        return jobDetail;
    }

    /**
     * 回填档案柜资料触发器规则
     * @param plenishBestSignInfoJobDetail
     * @return
     */
    @Bean(name = "plenishBestSignInfoTrigger")
    public CronTriggerFactoryBean plenishBestSignInfoTrigger(JobDetail plenishBestSignInfoJobDetail) {
        CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
        trigger.setJobDetail(plenishBestSignInfoJobDetail);
        // cron表达式 "0 */5 * * * ?" 5分钟一次
        trigger.setCronExpression("0 */5 * * * ?");
        return trigger;
    }

    /**
     *发送合同定时任务
     * @param sendContractJob
     * @return
     */
    @Bean(name = "sendContractJobDetail")
    public MethodInvokingJobDetailFactoryBean sendContractJobDetail(SendContractJob sendContractJob) {
        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
        // 是否并发执行
        jobDetail.setConcurrent(false);
        // 为需要执行的实体类对应的对象
        jobDetail.setTargetObject(sendContractJob);
        // 需要执行的方法
        jobDetail.setTargetMethod("sendContractTask");
        return jobDetail;
    }

    /**
     *  发送合同任务触发器规则
     * @param sendContractJobDetail
     * @return
     */
    @Bean(name = "sendContractTrigger")
    public CronTriggerFactoryBean sendContractTrigger(JobDetail sendContractJobDetail) {
        CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
        trigger.setJobDetail(sendContractJobDetail);
        // cron表达式 "0 */5 * * * ?" 5分钟一次
        trigger.setCronExpression("0 */5 * * * ?");
        return trigger;
    }

    /**
     * 注册触发器
     * @param plenishBestSignInfoTrigger
     * @param sendContractTrigger
     * @return
     */
    @Bean(name = "scheduler")
    public SchedulerFactoryBean schedulerFactory(Trigger plenishBestSignInfoTrigger,
                                                 Trigger sendContractTrigger
    ) {
        SchedulerFactoryBean bean = new SchedulerFactoryBean();
        // 延时启动，应用启动1秒后
        bean.setStartupDelay(1);
        // 注册触发器 sendMessageTrigger
        bean.setTriggers(plenishBestSignInfoTrigger,
                sendContractTrigger);
        return bean;
    }

}
