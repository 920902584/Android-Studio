package query.view.zone.sun.personview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mr.Zou on 2016/11/9.
 */
public class ViewFive extends Activity {
    private Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_five);
        button7 = (Button) findViewById(R.id.Button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ViewFive.this,ChoiceViews.class);
                startActivity(intent);
            }
        });
    }
}
