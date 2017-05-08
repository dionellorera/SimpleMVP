package com.personal.dione.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    private EditText username;
    private EditText password;
    private Button login;
    private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
        presenter = new LoginPresenterImpl(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                presenter.validateCredentials(username.getText().toString(), password.getText().toString());
                break;
        }

    }

    @Override
    public void setUsernameError() {
        username.setError("ERROR UNAME");
    }

    @Override
    public void setPasswordError() {
        password.setError("PWORD ERROR");
    }

    @Override
    public void navigateToHome() {
        Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();
    }
}
