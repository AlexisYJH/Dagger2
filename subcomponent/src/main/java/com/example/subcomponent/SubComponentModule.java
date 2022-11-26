package com.example.subcomponent;

import dagger.Module;

/**
 * @author AlexisYin
 */
//3. 新建模块，指定subcomponents为刚刚新建的子组件
@Module(subcomponents = UserComponent.class)
public class SubComponentModule {
}
