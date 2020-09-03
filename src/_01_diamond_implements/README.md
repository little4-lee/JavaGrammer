Impl extends Base implements ISubSuper
               |                 |  
               |                 |
               ----> ISuper  <----

ISubSuper虽然继承了ISuper的方法，但并未实现，所以调用过程中并没有出现菱形引用(Diamond Reference)
所以，菱形引用会有问题, 菱形implements没有问题