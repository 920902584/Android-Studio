package query.view.zone.sun.personview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by Mr.Zou on 2016/9/13.
 */
public class ViewMap extends Activity {
    private Button enterquerybutton,returnpageone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.viewmap);
        enterquerybutton = (Button) findViewById(R.id.enterquerybutton);
        returnpageone = (Button)findViewById(R.id.returnpageone);
        enterquerybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ViewMap.this, ChoiceViews.class);
                startActivity(intent);

            }
        });
        returnpageone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ViewMap.this,Main.class);
                startActivity(intent);
            }
        });
    }
}



