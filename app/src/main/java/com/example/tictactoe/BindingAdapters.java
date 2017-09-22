package com.example.tictactoe;

import android.content.res.Resources;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Helper functions for data binding.
 */

public final class BindingAdapters {
    @BindingAdapter({"android:src"})
    public static void setImageDrawable(ImageView view, GamePiece oldPiece, GamePiece newPiece) {
        if (newPiece == oldPiece)
            return;
        final int resourceId = newPiece.getResourceId();
        if (resourceId != 0) {
            final Resources.Theme theme = view.getContext().getTheme();
            final Drawable drawable = view.getResources().getDrawable(resourceId, theme);
            view.setImageDrawable(drawable);
        } else {
            view.setImageDrawable(null);
        }
    }

    private BindingAdapters() {
        // Prevent instantiation.
    }
}
