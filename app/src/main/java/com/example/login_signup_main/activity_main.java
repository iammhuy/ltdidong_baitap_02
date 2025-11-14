package com.example.login_signup_main;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // Gọi hàm để thiết lập các icon trong GridLayout
        setupFeatureGrid();
    }

    private void setupFeatureGrid() {
        // Hàng 1
        updateFeatureItem(R.id.feature_inbox, R.drawable.ic_1, "Inbox");
        updateFeatureItem(R.id.feature_map, R.drawable.ic_2, "Map");
        updateFeatureItem(R.id.feature_chat, R.drawable.ic_3, "Chat");
        updateFeatureItem(R.id.feature_report, R.drawable.ic_4, "Report");

        // Hàng 2
        updateFeatureItem(R.id.feature_calendar, R.drawable.ic_5, "Calendar");
        updateFeatureItem(R.id.feature_tips, R.drawable.ic_6, "Tips");
        updateFeatureItem(R.id.feature_settings, R.drawable.ic_7, "Settings");
        updateFeatureItem(R.id.feature_other, R.drawable.ic_8, "Other");
    }

    private void updateFeatureItem(int viewId, int iconResId, String label) {
        View featureView = findViewById(viewId);
        ImageView icon = featureView.findViewById(R.id.feature_icon);
        TextView text = featureView.findViewById(R.id.feature_label);

        icon.setImageResource(iconResId);
        text.setText(label);
    }
}