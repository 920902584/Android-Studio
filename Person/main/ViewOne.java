package query.view.zone.sun.personview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mr.Zou on 2016/9/13.
 */
public class ViewOne extends Activity {
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("万寿山");
        setContentView(R.layout.view_one);
        button3 = (Button) findViewById(R.id.Button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ViewOne.this,ChoiceViews.class);
                startActivity(intent);
            }
        });
    }
}
