package query.view.zone.sun.personview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mr.Zou on 2016/11/9.
 */
public class ViewSix extends Activity {
    private Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_six);
        button8 = (Button) findViewById(R.id.Button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ViewSix.this,ChoiceViews.class);
                startActivity(intent);
            }
        });
    }
}
