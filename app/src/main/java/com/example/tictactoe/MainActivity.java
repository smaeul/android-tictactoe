package com.example.tictactoe;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.tictactoe.databinding.MainActivityBinding;

/**
 * Main tic-tac-toe game board activity.
 */

public class MainActivity extends Activity {
    private final GameController controller = new GameController();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final MainActivityBinding binding =
                DataBindingUtil.setContentView(this, R.layout.main_activity);
        binding.setController(controller);
    }
}
