package ggikko.me.kotlinexample.ui

import android.app.Application
import com.example.dagger.kotlin.ApplicationComponent
import com.example.dagger.kotlin.AppModule
import com.example.dagger.kotlin.DaggerApplicationComponent

/**
 * Created by ggikko on 16. 8. 3..
 */
class GgikkoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //dagger inject
        initDaggerInject().inject(this);
    }

    fun initDaggerInject() : ApplicationComponent{
        return DaggerApplicationComponent.builder().appModule(AppModule(this)).build();
    }
}