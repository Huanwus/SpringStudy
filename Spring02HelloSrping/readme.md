## 3.Spring Hello
1.Hello对象是谁创建的？  由spring创建的  
2.Hello对象的属性值是怎么设置的？  由spring设置  

这个过程就叫控制反转：  
控制：谁来控制对象的创建，传统应用程序的对象是由程序本身控制创建的，使用 Spring后，对象是由 Spring来创建的  
反转：程序本身不创建对象，而变成被动的接收对象  
依赖注入：就是利用set方法来进行注入的  
IoC是—种编程思想，由主动的编程变成被动的接收可以通过 new ClassPathXmlApplicationContext去浏览一下底层源码  

oK，到了现在，我们彻底不用在程序中去改动了，要实现不同的操作，只需要在xml配置文件中进行修改，所谓的loC，一句话搞定：对象由 Spring来创建，管理，装配！