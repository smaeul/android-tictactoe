package com.example.tictactoe;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

/**
 * Main tic-tac-toe game board activity.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.main_activity);
    }
}
