package kg.geekteck.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import kg.geekteck.tests.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private CustomMath math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        math=new CustomMath();

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvResult.setVisibility(View.VISIBLE);
            }
        });
        binding.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(binding.etNum1.getText().toString());
                int b = Integer.parseInt(binding.etNum2.getText().toString());
                binding.tvResult.setText(math.sub(a,b));
            }
        });

        binding.btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(binding.etNum1.getText().toString());
                int b = Integer.parseInt(binding.etNum2.getText().toString());
                binding.tvResult.setText(math.multiply(a,b));
            }
        });
        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(binding.etNum1.getText().toString());
                int b = Integer.parseInt(binding.etNum2.getText().toString());
                binding.tvResult.setText(math.division(a,b));
            }
        });

    }
}