package me.iacn.editcolorhelper;

import android.content.res.ColorStateList;
import android.widget.EditText;

/**
 * Created by iAcn on 2017/2/12
 * Emali iAcn0301@foxmail.com
 */

public class EditColorHelper {

    public static void setColor(EditText editText, int color) {
        // Update underline color
        setUnderlineColor(editText, color);

        // Update Highlight Color
        setHighlightColor(editText, color);
    }

    public static void setUnderlineColor(EditText editText, int color) {
        int[][] states = new int[1][];
        states[0] = new int[]{};

        int[] colors = new int[1];
        colors[0] = color;

        ColorStateList colorStateList = new ColorStateList(states, colors);
        editText.setBackgroundTintList(colorStateList);
    }

    public static void setHighlightColor(EditText editText, int color) {
        // The value 102 is Android original EditText highlight transparency
        int translateColor = ColorUtils.setAlphaComponent(color, 102);
        editText.setHighlightColor(translateColor);
    }
}