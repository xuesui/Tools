package com.example.tools.toast;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;

import com.example.tools.R;


/**
 * Created by Xuesui
 * package com.example.subassembly.toast
 * on 2019/11/5
 * at 16:01
 * describe: 为自定义Toast准备的工具类，主要功能是为drawable资源着色，
 * 以及根据资源id获得对应的drawable和color，最后还有为布局设置drawable
 */
final class ToastUtils {
    private ToastUtils(){}

    //为图标上色
    static Drawable tintIcon(Drawable drawable, @ColorInt int color){
        drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        return drawable;
    }

    //为背景上色
    static Drawable tint9PatchDrawableFrame(Context context, @ColorInt int tintColor) {
        final NinePatchDrawable toastDrawable = (NinePatchDrawable) getDrawable(context, R.drawable.toast_frame);
        if (toastDrawable != null) {
            return tintIcon(toastDrawable, tintColor);
        }
        return null;
    }

    //获取drawable对象
    static Drawable getDrawable(Context context, @DrawableRes int id) {
        return AppCompatResources.getDrawable(context, id);
    }

    //获取颜色
    static int getColor(Context context, @ColorRes int color){
        return ContextCompat.getColor(context, color);
    }

    //设置drawable到view
    static void setBackground(View view,Drawable drawable){
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN){
            view.setBackground(drawable);
        }else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
