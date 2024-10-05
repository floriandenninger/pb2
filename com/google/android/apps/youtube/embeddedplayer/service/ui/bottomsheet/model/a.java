package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acrb;
import defpackage.aomf;
import defpackage.opn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class a {
    public final int a;
    public final String b;
    public boolean c;
    public Drawable d;
    public String e;
    public CharSequence f;
    public acrb g;
    public aomf h;

    public a(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public void a(View view, Context context) {
        ColorStateList colorStateList;
        TextView textView = (TextView) view.findViewById(R.id.list_item_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        TextView textView2 = (TextView) view.findViewById(R.id.list_item_text_secondary_separator);
        TextView textView3 = (TextView) view.findViewById(R.id.list_item_text_secondary);
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList = context.getResources().getColorStateList(R.color.embed_black_text, context.getTheme());
        } else {
            colorStateList = context.getResources().getColorStateList(R.color.embed_black_text);
        }
        opn.a(this, view, textView, imageView, textView3, textView2, colorStateList);
    }
}
