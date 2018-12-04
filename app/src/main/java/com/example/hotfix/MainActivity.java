package com.example.hotfix;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.text)
    TextView text;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk";
        File patchFile = new File(path);
        Log.i("TEST", "path-=-=>" + path);
        if (patchFile.exists() && patchFile.length() > 0) {
            Log.i("TEST", "-=-=>正在修复");
            TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), path);
        }
        text.setText("最新的 hitfix 信息");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"最新的toast",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
