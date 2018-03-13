package onezao.com.testespresso;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

/**
 * Created by XYL-SJ005 on 2018/3/13.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void btn2Hello(View view){
        Toast.makeText(this,"我是第二个页面的按钮，你已经点击了哦。",Toast.LENGTH_SHORT).show();
    }
}
