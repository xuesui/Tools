package com.example.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tools.toast.ToastXS;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button success = findViewById(R.id.btn_success);
        Button warn = findViewById(R.id.btn_warn);
        Button info = findViewById(R.id.btn_info);
        Button error = findViewById(R.id.btn_error);
        Button normal = findViewById(R.id.btn_normal);
        Button custom = findViewById(R.id.btn_custom);

        success.setOnClickListener(this);
        warn.setOnClickListener(this);
        info.setOnClickListener(this);
        error.setOnClickListener(this);
        normal.setOnClickListener(this);
        custom.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_success:
                ToastXS.success(this, "嘿嘿嘿");
                break;
            case R.id.btn_warn:
                ToastXS.warning(this, "嘿嘿嘿舒适度");
                break;
            case R.id.btn_info:
                ToastXS.info(this, "嘿嘿嘿就是");
                break;
            case R.id.btn_error:
                ToastXS.error(this, "嘿嘿嘿三剑客上集");
                break;
            case R.id.btn_normal:
                ToastXS.normal(this, "嘿嘿嘿数据库是我");
                break;
            case R.id.btn_custom:
                ToastXS.custom(this, "嘿嘿嘿花生哈市", getResources().getDrawable(R.drawable.ic_launcher_foreground), ToastXS.LENGTH_SHORT, true);
                break;
            default:
                break;
        }
    }


}
