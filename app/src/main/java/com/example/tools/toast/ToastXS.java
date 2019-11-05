package com.example.tools.toast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import com.example.tools.R;


/**
 * Created by Xuesui
 * package com.example.subassembly.toast
 * on 2019/11/5
 * at 16:20
 * describe: 这是一个toast的辅助工具，可以针对不同分级设置不同的toast，并且可以选择是否显示图标以及着色。
 */
@SuppressLint("InflateParams")
public class ToastXS {
    private static final Typeface LOADED_TOAST_TYPEFACE = Typeface.create("sans-serif-condensed", Typeface.NORMAL);
    private static Typeface currentTypeface = LOADED_TOAST_TYPEFACE;
    private static int textSize = 16; // in SP

    //图标是否和文字颜色一致
    private static boolean tintIcon = true;

    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    private ToastXS() {
    }

    public static void normal(Context context, @StringRes int message) {
        normal(context, context.getString(message), LENGTH_SHORT, null, false);
    }

    public static void normal(Context context, CharSequence message) {
        normal(context, message, LENGTH_SHORT, null, false);
    }

    public static void normal(Context context, @StringRes int message, Drawable icon) {
        normal(context, context.getString(message), LENGTH_SHORT, icon, true);
    }

    public static void normal(Context context, CharSequence message, Drawable icon) {
        normal(context, message, LENGTH_SHORT, icon, true);
    }

    public static void normal(Context context, @StringRes int message, int duration) {
        normal(context, context.getString(message), duration, null, false);
    }

    public static void normal(Context context, CharSequence message, int duration) {
        normal(context, message, duration, null, false);
    }

    public static void normal(Context context, @StringRes int message, int duration,
                               Drawable icon) {
        normal(context, context.getString(message), duration, icon, true);
    }

    public static void normal(Context context, CharSequence message, int duration,
                               Drawable icon) {
        normal(context, message, duration, icon, true);
    }

    private static void normal(Context context, CharSequence message, int duration,
                                Drawable icon, boolean withIcon) {
        custom(context, message, icon, ToastUtils.getColor(context, R.color.normalColor),
                ToastUtils.getColor(context, R.color.defaultTextColor), duration, withIcon, true);
    }

    public static void warning(Context context, @StringRes int message) {
        warning(context, context.getString(message), LENGTH_SHORT, true);
    }


    public static void warning(Context context, CharSequence message) {
        warning(context, message, LENGTH_SHORT, true);
    }

    public static void warning(Context context, @StringRes int message, int duration) {
        warning(context, context.getString(message), duration, true);
    }

    public static void warning(Context context, CharSequence message, int duration) {
        warning(context, message, duration, true);
    }

    public static void warning(Context context, @StringRes int message, int duration, boolean withIcon) {
        custom(context, context.getString(message), ToastUtils.getDrawable(context, R.drawable.ic_error_outline_white_24dp),
                ToastUtils.getColor(context, R.color.warningColor), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, true);
    }

    public static void warning(Context context, CharSequence message, int duration, boolean withIcon) {
        custom(context, message, ToastUtils.getDrawable(context, R.drawable.ic_error_outline_white_24dp),
                ToastUtils.getColor(context, R.color.warningColor), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, true);
    }

    public static void info(Context context, @StringRes int message) {
        info(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    public static void info(Context context, CharSequence message) {
        info(context, message, Toast.LENGTH_SHORT, true);
    }

    public static void info(Context context, @StringRes int message, int duration) {
        info(context, context.getString(message), duration, true);
    }

    public static void info(Context context, CharSequence message, int duration) {
        info(context, message, duration, true);
    }

    public static void info(Context context, @StringRes int message, int duration, boolean withIcon) {
        custom(context, context.getString(message), ToastUtils.getDrawable(context, R.drawable.ic_info_outline_white_24dp),
                ToastUtils.getColor(context, R.color.infoColor), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, true);
    }

    public static void info(Context context, CharSequence message, int duration, boolean withIcon) {
        custom(context, message, ToastUtils.getDrawable(context, R.drawable.ic_info_outline_white_24dp),
                ToastUtils.getColor(context, R.color.infoColor), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, true);
    }

    public static void success(Context context, @StringRes int message) {
        success(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    public static void success(Context context, CharSequence message) {
        success(context, message, Toast.LENGTH_SHORT, true);
    }

    public static void success(Context context, @StringRes int message, int duration) {
        success(context, context.getString(message), duration, true);
    }

    public static void success(Context context, CharSequence message, int duration) {
        success(context, message, duration, true);
    }

    public static void success(Context context, @StringRes int message, int duration, boolean withIcon) {
        custom(context, context.getString(message), ToastUtils.getDrawable(context, R.drawable.ic_check_white_24dp),
                ToastUtils.getColor(context, R.color.successColor), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, true);
    }


    public static void success(Context context, CharSequence message, int duration, boolean withIcon) {
        custom(context, message, ToastUtils.getDrawable(context, R.drawable.ic_check_white_24dp),
                ToastUtils.getColor(context, R.color.successColor), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, true);
    }

    public static void error(Context context, @StringRes int message) {
        error(context, context.getString(message), Toast.LENGTH_SHORT, true);
    }

    public static void error(Context context, CharSequence message) {
        error(context, message, Toast.LENGTH_SHORT, true);
    }

    public static void error(Context context, @StringRes int message, int duration) {
        error(context, context.getString(message), duration, true);
    }

    public static void error(Context context, CharSequence message, int duration) {
        error(context, message, duration, true);
    }

    public static void error(Context context, @StringRes int message, int duration, boolean withIcon) {
        custom(context, context.getString(message), ToastUtils.getDrawable(context, R.drawable.ic_clear_white_24dp),
                ToastUtils.getColor(context, R.color.errorColor), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, true);
    }

    public static void error(Context context, CharSequence message, int duration, boolean withIcon) {
        custom(context, message, ToastUtils.getDrawable(context, R.drawable.ic_clear_white_24dp),
                ToastUtils.getColor(context, R.color.errorColor), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, true);
    }

    public static void custom(Context context, @StringRes int message, Drawable icon,
                               int duration, boolean withIcon) {
         custom(context, context.getString(message), icon, -1, ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, false);
    }

    public static void custom(Context context, CharSequence message, Drawable icon,
                               int duration, boolean withIcon) {
        custom(context, message, icon, -1, ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, false);
    }

    public static void custom(Context context, @StringRes int message, @DrawableRes int iconRes,
                               @ColorRes int tintColorRes, int duration,
                               boolean withIcon, boolean shouldTint) {
        custom(context, context.getString(message), ToastUtils.getDrawable(context, iconRes),
                ToastUtils.getColor(context, tintColorRes), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, shouldTint);
    }

    public static void custom(Context context, CharSequence message, @DrawableRes int iconRes,
                               @ColorRes int tintColorRes, int duration,
                               boolean withIcon, boolean shouldTint) {
       custom(context, message, ToastUtils.getDrawable(context, iconRes),
                ToastUtils.getColor(context, tintColorRes), ToastUtils.getColor(context, R.color.defaultTextColor),
                duration, withIcon, shouldTint);
    }

    public static void custom(Context context, @StringRes int message, Drawable icon,
                               @ColorRes int tintColorRes, int duration,
                               boolean withIcon, boolean shouldTint) {
        custom(context, context.getString(message), icon, ToastUtils.getColor(context, tintColorRes),
                ToastUtils.getColor(context, R.color.defaultTextColor), duration, withIcon, shouldTint);
    }

    public static void custom(Context context, @StringRes int message, Drawable icon,
                               @ColorRes int tintColorRes, @ColorRes int textColorRes, int duration,
                               boolean withIcon, boolean shouldTint) {
        custom(context, context.getString(message), icon, ToastUtils.getColor(context, tintColorRes),
                ToastUtils.getColor(context, textColorRes), duration, withIcon, shouldTint);
    }

    //自定义的主要实现
    @SuppressLint("ShowToast")
    private static void custom(Context context, CharSequence message, Drawable icon,
                                @ColorInt int tintColor, @ColorInt int textColor, int duration,
                                boolean withIcon, boolean shouldTint) {
        final Toast currentToast = Toast.makeText(context, "", duration);
        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.toast_layout, null);

        final ImageView toastIcon = toastLayout.findViewById(R.id.toast_icon);
        final TextView toastTextView = toastLayout.findViewById(R.id.toast_text);

        Drawable drawableFrame;

        //根据shouldTint判断是否需要为背景上色
        if (shouldTint) {
            drawableFrame = ToastUtils.tint9PatchDrawableFrame(context, tintColor);
        } else {
            drawableFrame = ToastUtils.getDrawable(context, R.drawable.toast_frame);
        }

        //设置背景
        ToastUtils.setBackground(toastLayout, drawableFrame);

        //根据withIcon判断是否设置icon
        if (withIcon) {
            if (icon == null) {
                throw new IllegalArgumentException("传入icon为空，请设置withicon为false或者传入不为空的icon！");
            } else {
                ToastUtils.setBackground(toastIcon, tintIcon ? ToastUtils.tintIcon(icon, textColor) : icon);
            }
        } else {
            toastIcon.setVisibility(View.GONE);
        }

        toastTextView.setText(message);
        toastTextView.setTextColor(textColor);
        toastTextView.setTypeface(currentTypeface);
        toastTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);

        currentToast.setView(toastLayout);
        currentToast.show();
    }

    //用于设置ToastXS各种属性的静态内部类
    public static class Config {
        private Typeface typeface = ToastXS.currentTypeface;
        private int textSize = ToastXS.textSize;
        private boolean tintIcon = ToastXS.tintIcon;

        private Config() {
        }

        public static Config getInstance() {
            return new Config();
        }

        public static void reset() {
            ToastXS.currentTypeface = LOADED_TOAST_TYPEFACE;
            ToastXS.textSize = 16;
            ToastXS.tintIcon = true;
        }

        public Config setToastTypeface(Typeface typeface) {
            this.typeface = typeface;
            return this;
        }

        public Config setTextSize(int sizeInSp) {
            this.textSize = sizeInSp;
            return this;
        }

        public Config tintIcon(boolean tintIcon) {
            this.tintIcon = tintIcon;
            return this;
        }

        public void apply() {
            ToastXS.currentTypeface = typeface;
            ToastXS.textSize = textSize;
            ToastXS.tintIcon = tintIcon;
        }
    }
}
