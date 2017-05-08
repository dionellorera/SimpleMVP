package com.personal.dione.mvp;

import android.text.TextUtils;

/**
 * Created by Tagcash-321143214324 on 5/8/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(String username, String password, OnLoginFinishedListener listener) {
        boolean isValid = true;
        if (TextUtils.isEmpty(username)) {
            listener.onUsernameError();
            isValid = false;
        }

        if (TextUtils.isEmpty(password)) {
            listener.onPasswordError();
            isValid = false;
        }

        if (isValid) {
            listener.onSuccess();
        }
    }
}
