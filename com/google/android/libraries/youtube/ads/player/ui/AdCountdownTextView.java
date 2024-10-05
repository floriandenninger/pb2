package com.google.android.libraries.youtube.ads.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import defpackage.xkk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdCountdownTextView extends YouTubeTextView {
    public int a;

    public AdCountdownTextView(Context context) {
        super(context);
        this.a = -1;
        a(context, null, 0, 0);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Resources.Theme theme = context.getTheme();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, xkk.a, i, i2);
            if (obtainStyledAttributes.hasValue(6)) {
                this.a = obtainStyledAttributes.getInt(6, -1);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public AdCountdownTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        a(context, attributeSet, 0, 0);
    }

    public AdCountdownTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        a(context, attributeSet, i, 0);
    }

    public AdCountdownTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = -1;
        a(context, attributeSet, i, i2);
    }
}
