# DesignPattern
## 五种最常用设计模式CodeDemo
### 创建型模式:star_and_crescent:
#### 单例模式（Singleton Pattern）
> 饿汉式（推荐：必须保证实例被使用到）
> 
> 懒汉式（不推荐：线程不安全 OR 效率低）
> 
> 双重检查（推荐：volatile + synchronized 两次检查Double Check）
> 
> 静态内部类（推荐：不随类加载而加载，调用才加载且通过类加载机制保证初始化实例仅一个线程）
> 
> 枚举（推荐；最安全的单例---防止反射破坏）

#### 工厂模式（Factory Pattern）
> 简单工厂模式（Simple Factory Pattern）
> * 通过一个工厂类创建不同类型的产品对象
> 
> 工厂方法模式（Factory Method Pattern）
> * 将对象的创建延迟到子类进行
> 
> 抽象工厂模式（Abstract Factory Pattern）
> * 提供了创建一系列组合或相互依赖的对象的接口，而无需指定它们具体的类

### 结构型模式:star_of_david:
#### 装饰器模式（Decorator Pattern）
> 不改变已有对象接口的基础上动态给对象添加额外功能

#### 代理模式（Proxy Pattern）
> 通过代理对象控制对原始对象的访问
> 
> 静态代理
> * 目标对象（具体主题）和代理对象（代理主题）需实现同一个接口---扩展维护困难
> 
> 动态代理
> * JDK代理：目标对象需实现接口
> 
> * CGLIB代理：目标对象无需实现接口

### 行为型模式:six_pointed_star:
#### 观察者模式（Observer Pattern）
> 用于构建对象间的一对多依赖关系；
> 
> 当一个对象（被观察者）发生变化，其他依赖该对象的对象（观察者）会自动收到通知并进行相应的更新。