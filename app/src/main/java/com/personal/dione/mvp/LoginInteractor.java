package com.personal.dione.mvp;

/**
 * Created by Tagcash-321143214324 on 5/8/2017.
 */

public interface LoginInteractor {
    interface OnLoginFinishedListener {
        void onUsernameError();
        void onPasswordError();
        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
