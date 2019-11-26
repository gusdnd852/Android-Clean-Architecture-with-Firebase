package com.hyunwoong.sample.core.viewmodel;

import com.hyunwoong.sample.R;
import com.hyunwoong.sample.base.BaseViewModel;
import com.hyunwoong.sample.core.activity.SplashActivity;
import com.hyunwoong.sample.util.view.OnXML;

/**
 * @author : Hyunwoong
 * @when : 2019-11-18 오후 12:08
 * @homepage : https://github.com/gusdnd852
 */
public class SplashViewModel extends BaseViewModel {

    @OnXML(resid = R.layout.splash)
    public void splash(SplashActivity activity) {
        if (activity.isRemembered()) activity.autonomousSignIn();
        else activity.delayAndMove(2500);
    }
}