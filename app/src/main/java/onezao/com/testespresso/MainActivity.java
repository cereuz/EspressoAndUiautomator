package onezao.com.testespresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnhello(View view){
        Toast.makeText(this,"我是一个按钮！",Toast.LENGTH_LONG).show();
    }
    public void btnhello2(View view){
        Toast.makeText(this,"我是一个按钮2！",Toast.LENGTH_LONG).show();
    }
}
