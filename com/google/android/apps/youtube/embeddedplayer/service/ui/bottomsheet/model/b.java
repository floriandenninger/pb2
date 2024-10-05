package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.opn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends a {
    public boolean i;

    public b(String str) {
        super(str, -1);
        this.i = false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a
    public final void a(View view, Context context) {
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
        ColorStateList colorStateList2 = colorStateList;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.list_item_checkmark);
        opn.a(this, view, textView, imageView, textView3, textView2, colorStateList2);
        if (this.i) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(4);
        }
    }

    public final void b() {
        this.i = true;
    }
}
