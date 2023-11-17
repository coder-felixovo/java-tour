工厂方法模式  
从PenFactoryMethod示例来看，不再提供一个统一的工厂类来创建所有具体类的实例，而是针对不同具体类实现了不同的工厂，提供了一个与具体类相同等级的结构。  

角色和职责
* 具体类的公共接口或者父类  
本例为Pen
* 具体实现类  
本例为BallPointPen、MarkerPen、Pencil
* 工厂接口  
本例为Factory
* 具体工厂  
本例为BallPointPenFactory、MarkerPenFactory、PencilFactory  
  
优点  
* 工厂方法用来创建具体类的实例，同时向客户端隐藏了具体类实例化的细节，只关心具体类对应的工厂即可。  
* 基于具体类的公共接口或者工厂接口的多态性设计是工厂方法模式的关键。它能够让工厂能够自主确定创建何种具体实现类的对象，但是具体对象的创建细节又封装到了具体工厂的内部。工厂方法模式被称为多态工厂模式，就正是因为所有的具体工厂类都有一个公共的接口或者父类。  
* 添加新的具体类时，无需修改现有代码，只需增加类的实现以及对应的工厂类即可，符合开闭原则。
  
缺点
* 添加新的具体类和对应的工厂类，系统中类的个数增加，在一定程度上增加了系统的复杂度。
* 考虑到系统的扩展性，需要引入抽象层，在客户端代码中均使用抽象层进行定义，增加了系统的抽象型和理解难度。
  
适用场景  
客户端无需知道它所需要的对象的类，只需要知道它的工厂即可，具体类的实例由工厂创建。