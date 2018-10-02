package newapp.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.google.gson.*;

public class MainActivity extends AppCompatActivity {
EditText email;
EditText password;
TextView errtxt;
CUser User;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        errtxt = (TextView) findViewById(R.id.errtxt);
//    CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox);
   /*     checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {          //кнопка показать/скрыть пароль
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) password.setTransformationMethod(new PasswordTransformationMethod());
                else password.setTransformationMethod(null);
                password.setSelection(password.length());
            }
        });  */
        User = CUser.instance();
    }

    public interface Authentification {
        public String getUserData(String email, String password);
    }

    public void Enter(View v) {
        errtxt.setText("Вход пока не работает, сорян, чуваки. \n"+User.getUserData(email.getText().toString(), password.getText().toString()).toString());
    }

    public void Register(View v) {
        errtxt.setText("Регистрация пока не работает, сорян, чуваки.");
/*        Intent intent = new Intent(this, emailActivity.class);
        startActivity(intent); */
    }
}


