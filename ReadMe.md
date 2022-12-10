> $$manualioc
- 手动依赖注入

> $$instance1
- 告知Dagger获取对象实例的方式一：使用构造方法，使用@Inject注解

> $$instance2
- 告知Dagger获取对象实例的方式二：使用Dagger模块，使用模块的@Provides或@Binds注解

> $$scope
- 使用作用域实现单例
- 使用作用域注解，可以将某个对象的生命周期限定为其组件的生命周期
- 作用域的使用规则：
1. 在没必要的情况下，尽量使用默认的作用域，即不指定作用域
2. 使用作用域注解的模块也只能在带有相同作用域注解的组件中使用
3. 开发设计时，一定要有清晰的依赖图，不然容易产生依赖死循环
- 全局单例：使用作用域，且组件和Application绑定

> $$myscope
- 自定义作用域
- Component作为IOC容器，容器中获取实例的地方只要用到了作用域，那么作用域必须和容器保持一致。所以容器内的实例要么没有使用作用域，要么作用域和组件一致

> $$componentdependencies
- 组件依赖：为@Component添加dependencies参数，指定该组件依赖于原组件

> $$subcomponent
- 子组件（比组件依赖方便）：直接使用@SubComponent注解创建新的组件，并装载到父组件中

> $$multiconstructions
- 同一对象多种创建方式
- 使用@Named注解；自定义Qualifier，标识