## 7.bean的自动装配  
- 1.自动装配是spring满足bean依赖的一种方式！  
- 2.Spring会在上下文中自动寻找，并自动给bean装配属性。  

Spring有三种装配方式  
1.在xml显示的配置  
2.在java中显示配置  
3.隐式的自动装配bean【重点】 


#### 7.1 byName自动装配  
byname的时候，需要保证所有bean的id唯一，并且这个bean需要和自动注入的属性的set方法的值一致！  
#### 7.2 byType自动装配  
bytype的时候，需要保证所有bean的class唯一，并且这个bean需要和自动注入的属性的类型一致！  
#### 7.3 使用注解实现自动装配
1.导入约束    
2.配置注解支持  
3.@Autowired 直接在属性上使用即可，也可以在set方法中使用。使用AutoWired我们可以不用编写set方法，
前提是你这个自动装配属性在IOC(Spring)容器中存在且符合名字byname！  
4.@Resource   
总结：  
- 都是用来自动装配的，都可以放在属性字段上  
- @ Autowired通过 byname的方式实现  ，而且必须要求这个对象存在。  
- @ Resource默认通过 byname的方式实现，如果找不到名字，则通过 byType实现！如果两个都找不到就报错。
- 执行顺序不同：@Autowired通过byType的方式实现。@Resource默认通过byName的方式实现。

#### 7.4 其他注解说明
@Nullable:字段标记了这个注解，说明这个注解可以为null  


