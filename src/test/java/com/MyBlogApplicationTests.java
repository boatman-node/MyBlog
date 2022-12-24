package com;


import com.Entity.*;
import com.Mapper.articlesMapper;
import com.Mapper.setArtitleLabelMapper;
import com.Servcie.*;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.util.Date;

@SpringBootTest
class MyBlogApplicationTests {
    @Autowired
    commentsService commentsService;
    @Autowired
    UserInformationService informationService;
    @Test
    void test01(){

    }
    @Test
    void Test02(){
        System.out.println(informationService.RegisteredUsers(new UserInformation( 11342142,"23夫2874", "151037074662", "1369186", "1963470712@qq.com", "https://img0.baidu.com/it/u=1705694933,4002952892&fm=253&app=138&size=w931&n=0&f=JPEG&fmt=auto?sec=1671901200&t=c276753ba75660c9a8e4a86e970e84a8", new Date(),null,8 , "15007074662", "rrrr")));
    }

    @Test
    void Test03(){
        lablesServIce.insertLabImpl(new labels(1934,"asjx","悲鸣","ffffffffff",1369194318));
    }
    @Autowired
    LablesServIce lablesServIce;
    @Autowired
    setArtitleLabelService setArtitleLabelMapper1;
    @Autowired
    UserInformationService userInformationService;
    @Test
    void Test013(){
        System.out.println(userInformationService.UserList(1, 1).getResultContent().toString());
    }
    @Test
    void Test01(){
        articlesService1.LatestArticle().getResultContent().forEach(e-> System.out.println(e.getArticleLikeCount()));

    }
    @Autowired
    articlesService articlesService1;
    @Test
    void Test011(){
        String N=" Spring Cloud是一个微服务框架，相比Dubbo等RPC框架, Spring Cloud提供的全套的分布式系统解决方案。 \n" +
                "\n" +
                "      Spring Cloud对微服务基础框架Netflix的多个开源组件进行了封装，同时又实现了和云端平台以及和Spring Boot开发框架的集成。 \n" +
                "\n" +
                "      Spring Cloud为微服务架构开发涉及的配置管理，服务治理，熔断机制，智能路由，微代理，控制总线，一次性token，全局一致性锁，leader选举，分布式session，集群状态管理等操作提供了一种简单的开发方式。\n" +
                "\n" +
                "      Spring Cloud 为开发者提供了快速构建分布式系统的工具，开发者可以快速的启动服务或构建应用、同时能够快速和云平台资源进行对接。   \n" +
                "\n" +
                "**SpringCloud版本对应**\n" +
                "\n" +
                "> 2020.0.x aka Ilford ---------------- 2.4.x, 2.5.x (Starting with 2020.0.3)\n" +
                "\n" +
                "\n" +
                "> Hoxton----------------------> 2.2.x, 2.3.x (Starting with SR5)\n" +
                "\n" +
                "\n" +
                "\n" +
                "> Greenwich-----------------------> 2.1.x\n" +
                "\n" +
                "\n" +
                "> Finchley-------------------------------> 2.0.x\n" +
                "\n" +
                "\n" +
                "> Edgware----------------------------------> 1.5.x\n" +
                "\n" +
                "\n" +
                "> Dalston--------------------> 1.5.x\n" +
                "\n" +
                "\n" +
                "\n" +
                "**SpringCloud使用Bootsrtap**\n" +
                "     Spring Cloud应用程序通过创建“ bootstrap ”上下文来运行，该上下文是主应用程序的父上下文。它负责从外部源加载配置属性，并负责解密本地外部配置文件中的属性。这两个上下文共享一个Environment，它是任何Spring应用程序的外部属性的来源。默认情况下，引导程序属性（不是bootstrap.properties，而是引导程序阶段加载的属性）具有较高的优先级，因此它们不能被本地配置覆盖。\n" +
                "\n" +
                "   **SpringCloud使用外部配置\n" +
                "\n" +
                "```java\n" +
                "spring:\n" +
                "  application:\n" +
                "    name: foo\n" +
                "  cloud:\n" +
                "    config:\n" +
                "      uri: ${SPRING_CONFIG_URI:http://localhost:8888}\n" +
                "   \n" +
                "```\n" +
                "**日记配置**\n" +
                "\n" +
                "> 如果要使用Spring Boot来配置日志设置，则应将此配置放在`bootstrap或者appliction。[yml | 属性]（如果您希望将其应用于所有事件）。\n" +
                "> \n" +
                "\n" +
                "> 为了使Spring Cloud正确初始化日志记录配置，您不能使用自定义前缀。例如，初始化记录系统时，Spring\n" +
                "> Cloud无法识别使用`custom.loggin.logpath`\n" +
                "\n" +
                "\n" +
                "   \n" +
                "\n" +
                "```java\n" +
                "custom.loggin.logpath=\"E:/E\"\n" +
                "```\n" +
                "## Eureka服务发现和注册\n" +
                "\n" +
                "> Eureka 是一种基于 REST（Representational State Transfer）的服务，主要用于 AWS 云中，用于定位服务，以实现中间层服务器的负载平衡和故障转移。我们称这个服务为Eureka Server。Eureka 还附带了一个基于 Java 的客户端组件，即Eureka Client，这使得与服务的交互更加容易。客户端还有一个内置的负载均衡器，可以进行基本的循环负载均衡。在 Netflix，一个更复杂的负载均衡器包裹 Eureka 以提供基于流量、资源使用、错误条件等多个因素的加权负载均衡，以提供卓越的弹性。\n" +
                ">\n" +
                "**应用客户端和应用服务器如何通信？**\n" +
                "> 通信技术可以是您喜欢的任何东西。Eureka 可帮助您找到有关您想要与之通信的服务的信息，但不会对协议或通信方法施加任何限制。例如，您可以使用 Eureka 获取目标服务器地址并使用协议，例如 thrift、http(s) 或任何其他 RPC 机制。\n" +
                ">\n" +
                "**Eureka心跳机制**\n" +
                "> 服务向 Eureka注册，然后(默认)每 30 秒发送一次心跳以更新租约。如果客户端多次无法续订租约，则在大约 90秒内将其从服务器注册表中取出。注册信息和续费被复制到集群中的所有 eureka 节点。来自任何区域的客户端都可以查找注册表信息（每 30 秒发生一次）以定位他们的服务（可以在任何区域中）并进行远程调用。\n" +
                "> \n" +
                "\n" +
                "**可配置性**\n" +
                "使用 Eureka，您可以动态添加或删除集群节点。您可以调整从超时到线程池的内部配置。Eureka 使用archaius，如果你有一个配置源实现，很多这些配置可以动态调整\n" +
                "\n" +
                "> Archaius 包含一组 Netflix 使用的配置管理 API。它提供以下功能： 动态的、类型化的属性 高吞吐量和线程安全配置操作\n" +
                "> 允许获取配置源的属性更改的轮询框架 在有效/“获胜”属性突变时调用的回调机制（在配置的有序层次结构中） 可以通过 JConsole\n" +
                "> 访问以检查和调用属性操作的 JMX MBean 用于应用程序（以及大多数愿意使用基于约定的属性文件位置的 Web\n" +
                "> 应用程序）的开箱即用的复合配置（具有有序的层次结构） URL、JDBC 和 Amazon DynamoDB 的动态配置源的实现 Scala\n" +
                "> 动态属性包装器\n" +
                "> \n" +
                "***配置Eureka***\n" +
                "Eureka 带有两个组件 - Eureka Client(消费端)和Eureka Server(服务端)。您使用 Eureka 的架构通常有两个应用程序\n" +
                "> **Application Client**  使用 Eureka Client 向 Application Service 发出请求。\n" +
                "> **Application Service** 它接收来自应用程序客户端的请求并返回响应。\n" +
                "> \n" +
                "> **EurekaService**\n" +
                "应用程序客户端的 Eureka Client\n" +
                "应用服务的 Eureka Client\n" +
                "\n" +
                "```java\n" +
                " <dependency>\n" +
                "  <groupId>com.netflix.eureka</groupId>\n" +
                "  <artifactId>eureka-client</artifactId>\n" +
                "  <version>1.1.16</version>\n" +
                " </dependency>\n" +
                "```\n" +
                "\n" +
                "```java\n" +
                "# ##Eureka 客户端配置示例 Eureka 客户端\n" +
                "\n" +
                "#查看 eureka-examples 中的 README 以查看示例设置的概述\n" +
                "\n" +
                "#请注意，对于纯粹的客户端使用（例如，仅用于获取有关其他服务的信息，\n" +
                "#无需注册。此属性适用于单例 DiscoveryClient 所以\n" +
                "#如果您运行的服务器既是服务提供者又是服务消费者，\n" +
                "#然后不要将此属性设置为false。\n" +
                "eureka.registration.enabled = false\n" +
                "\n" +
                "# # 与到达 eureka 服务器相关的配置\n" +
                "eureka.preferSameZone = true\n" +
                "eureka.shouldUseDns = false\n" +
                "eureka.serviceUrl.default = http://localhost:8080/eureka/v2/\n" +
                "\n" +
                "eureka.decoderName = JacksonJson\n" +
                "```\n" +
                "\n" +
                "```java\n" +
                "# ##Eureka 客户端配置，用于向 Eureka 注册的示例服务\n" +
                "\n" +
                "#查看 eureka-examples 中的 README 以查看示例设置的概述\n" +
                "\n" +
                "# # 注册时自我识别相关的配置。\n" +
                "# # 还有其他可以定义的属性，请参阅 eureka-client/../CloudInstanceConfig 以获取完整详细信息。\n" +
                "#我在哪里部署？\n" +
                "eureka.region =默认\n" +
                "\n" +
                "#我的应用程序名称是什么？（客户端可以查询这个appName）\n" +
                "eureka.name = sampleRegisteringService\n" +
                "\n" +
                "#我的应用程序虚拟 IP 地址是什么？（客户端可以查询这个vipAddress）\n" +
                "eureka.vipAddress = sampleservice.mydomain.net\n" +
                "\n" +
                "#我服务的端口是什么？（如果端口 8001 已在您的环境中使用，请更改此设置）\n" +
                "eureka.port = 8001\n" +
                "\n" +
                "# # 与到达 eureka 服务器相关的配置\n" +
                "eureka.preferSameZone = true\n" +
                "eureka.shouldUseDns = false\n" +
                "eureka.serviceUrl.default = http://localhost:8080/eureka/v2/\n" +
                "```\n" +
                "\n" +
                "> 为本地开发配置 当运行 eureka 服务器进行本地开发时，通常需要等待大约 3\n" +
                "> 分钟，直到它完全启动。这是由于默认服务器行为会搜索对等方以进行同步并在找不到可用对等方时重试。这个等待时间可以通过设置属性来减少eureka.numberRegistrySyncRetries=0。\n" +
                "\n" +
                "**更新**\n" +
                "Eureka 客户端需要通过每 30 秒发送一次心跳来更新租约。更新通知 Eureka 服务器该实例还活着。如果服务器在 90 秒内没有看到更新，它将从其注册表中删除该实例。建议不要更改更新间隔，因为服务器使用该信息来确定客户端到服务器通信是否存在广泛传播的问题。\n" +
                "\n" +
                "\n" +
                "\n" +
                "**自我保护模式**\n" +
                "\n" +
                "> 如果 Eureka 服务器检测到比预期数量多的注册客户端以不礼貌的方式终止了它们的连接，并且同时等待驱逐，它们将进入自我保护模式。这样做是为了确保灾难性网络事件不会清除 eureka 注册表数据，并将其向下传播到所有客户端。\n" +
                "> \n" +
                "> 为了更好地理解自我保护，首先要了解尤里卡客户端如何“结束”他们的注册生命周期。eureka\n" +
                "> 协议要求客户端在永久离开时执行明确的注销操作。例如，在提供的 java 客户端中，这是在 shutdown() 方法中完成的。任何连续 3\n" +
                "> 次心跳更新失败的客户端都被认为是不洁终止，并将被后台驱逐进程驱逐。当当前注册表的 > 15% 处于此后期状态时，将启用自我保护。\n" +
                "**如何禁用自我保护**\n" +
                "自我保存配置在此处定义。要在示例中禁用自我保存，请设置属性：eureka.enableSelfPreservation=false。\n" +
                "\n" +
                "**对点通信**\n" +
                "确保您已访问此页面以了解 Eureka 集群配置。\n" +
                "\n" +
                "Eureka 客户端尝试与同一区域中的 Eureka 服务器通信。如果与服务器通信出现问题，或者如果服务器不存在于同一区域中，则客户端将故障转移到其他区域中的服务器。\n" +
                "\n" +
                "一旦服务器开始接收流量，在服务器上执行的所有操作都会复制到服务器知道的所有对等节点。如果操作由于某种原因失败，则在下一次心跳时会协调信息，该心跳也会在服务器之间复制。\n" +
                "\n" +
                "当 Eureka 服务器启动时，它会尝试从相邻节点获取所有实例注册表信息。如果从节点获取信息出现问题，服务器会在放弃之前尝试所有对等点。如果服务器能够成功获取所有实例，则它会根据该信息设置它应该接收的续订阈值。如果任何时候续订率低于为该值配置的百分比（15 分钟内低于 85%），服务器将停止使实例过期以保护当前实例注册表信息。\n" +
                "\n" +
                "在 Netflix 中，上述保护措施称为自保模式，主要用于一组客户端和 Eureka Server 之间存在网络分区的场景中的保护。在这些情况下，服务器会尝试保护它已有的信息。可能会出现大规模中断的情况，这可能会导致客户端获取不再存在的实例。客户端必须确保他们对 eureka 服务器返回不存在或无响应的实例具有弹性。在这些情况下最好的保护是快速超时并尝试其他服务器。\n" +
                "\n" +
                "在服务器无法从相邻节点获取注册信息的情况下，它会等待几分钟（5 分钟），以便客户端可以注册他们的信息。服务器通过仅将流量偏向一组实例并导致容量问题，努力不向那里的客户端提供部分信息。\n" +
                "\n" +
                "尤里卡服务器彼此使用尤里卡客户端和服务器所描述之间使用相同的机制进行通信此处。\n" +
                "\n" +
                "另外值得注意的是，如果需要，可以在服务器上调整多种配置，包括服务器之间的通信。\n" +
                "\n" +
                "**Peer 之间的网络中断期间会发生什么？**\n" +
                "\n" +
                "> 对等点之间的心跳复制可能会失败，服务器会检测到这种情况并进入自我保护模式以保护当前状态。\n" +
                "注册可能发生在孤立的服务器中，一些客户端可能会反映新的注册，而其他客户端可能不会。\n" +
                "在网络连接恢复到稳定状态后，这种情况会自动更正。当对等方能够正常通信时，注册信息会自动传输到没有它们的服务器。\n" +
                "## hystrix熔断和限流\n" +
                "**简介**\n" +
                "> Hystrix 是一个延迟和容错库，旨在隔离对远程系统、服务和 3rd 方库的访问点，停止级联故障并在故障不可避免的复杂分布式系统中启用弹性。\n" +
                "\n" +
                "**Maven**\n" +
                "\n" +
                "```java\n" +
                "<dependency>\n" +
                "    <groupId>com.netflix.hystrix</groupId>\n" +
                "    <artifactId>hystrix-core</artifactId>\n" +
                "    <version>x.y.z</version>\n" +
                "</dependency>\n" +
                "\n" +
                "```\n" +
                "**Hystrix有什么用**\n" +
                "\n" +
                ">通过第三方客户端库访问的依赖项（通常通过网络）提供延迟和故障的保护和控制。\n" +
                "停止复杂分布式系统中的级联故障。\n" +
                "快速失败并快速恢复。\n" +
                "在可能的情况下回退并优雅地降级。\n" +
                "实现近乎实时的监控、警报和操作控制。\n" +
                ">\n" +
                "**Hystrix工作原理和设计原则是什么**\n" +
                "\n" +
                "> Hystrix 的工作原理是：\n" +
                "> \n" +
                "> 防止任何单个依赖项耗尽所有容器（例如 Tomcat）用户线程。 减轻负载和快速失败而不是排队。 在可行的情况下提供回退以保护用户免于失败。\n" +
                "> 使用隔离技术（例如隔板、泳道和断路器模式）来限制任何一种依赖性的影响。 通过近乎实时的指标、监控和警报优化发现时间\n" +
                "> 通过配置更改的低延迟传播和支持 Hystrix 大部分方面的动态属性更改来优化恢复时间，这允许您使用低延迟反馈循环进行实时操作修改。\n" +
                "> 防止整个依赖客户端执行中的故障，而不仅仅是网络流量。\n" +
                "Hystrix执行了什么操作\n" +
                "> Hystrix 如何实现其目标？\n" +
                "\n" +
                "\n" +
                ">将所有对外部系统（或“依赖项”）的调用包装在一个HystrixCommandorHystrixObservableCommand对象中，该对象通常在单独的线程中执行（这是命令模式的一个示例）。\n" +
                "超时调用时间超过您定义的阈值。有一个默认值，但对于大多数依赖项，您可以通过“属性”自定义设置这些超时，以便它们略高于每个依赖项的测量的第99.5个百分位性能。\n" +
                "为每个依赖项维护一个小的线程池（或信号量）；如果它已满，则发往该依赖项的请求将立即被拒绝，而不是排队。\n" +
                "测量成功、失败（客户端抛出的异常）、超时和线程拒绝。\n" +
                "如果服务的错误百分比超过阈值，则手动或自动触发断路器以在一段时间内停止对特定服务的所有请求。\n" +
                "当请求失败、被拒绝、超时或短路时执行回退逻辑。\n" +
                ">近乎实时地监控指标和配置更改。\n" +
                "\n";
        for (int i = 10; i < 20; i++) {
            articlesService1.InsertArticles(new articles(i*10000,1369194318,"asjx",N,0,0,new Date(),i),"asjx",1369194318);

        }
        }
    @Test
    void Test024(){
        System.out.println(articlesService1.DeleteArticles("Spring", 1963470712));
    }
    @Test
    void Test14(){
        System.out.println(articlesService1.SelectArticles("asjx", 1369194318));
    }
    @Autowired
    articlesMapper mapper;
    @Test
    void Test59(){
        System.out.println(mapper.selectOne(new QueryWrapper<articles>().eq("article_title", "Spring").and(e->e.eq("user_id",1963470712))));
    }

}
