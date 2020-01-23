package com.androidapplication.daggerpractice;



import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ViewModuleModule.class)
public interface PlayerComponent {
    void inject(MainActivity activity);
}
