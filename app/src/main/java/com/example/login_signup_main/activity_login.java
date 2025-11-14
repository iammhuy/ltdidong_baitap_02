package com.example.login_signup_main;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

// 1. Tên class phải tuân theo quy tắc PascalCase (viết hoa chữ cái đầu)
// 2. Phải kế thừa (extends) từ AppCompatActivity
public class activity_login extends AppCompatActivity {

    // 3. Ghi đè phương thức onCreate()
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 4. Liên kết file XML layout với Activity này
        setContentView(R.layout.activity_login);

        // Từ đây trở đi, bạn có thể viết code để xử lý các sự kiện
        // ví dụ như bắt sự kiện click cho nút đăng nhập, v.v.
    }
}
