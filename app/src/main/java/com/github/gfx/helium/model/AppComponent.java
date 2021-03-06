package com.github.gfx.helium.model;

import com.github.gfx.helium.StethoDelegator;
import com.github.gfx.helium.activity.MainActivity;
import com.github.gfx.helium.fragment.EpitomeEntryFragment;
import com.github.gfx.helium.fragment.HatebuEntryFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(StethoDelegator stethoDelegator);

    void inject(HatebuEntryFragment fragment);

    void inject(EpitomeEntryFragment fragment);

    void inject(MainActivity activity);
}
