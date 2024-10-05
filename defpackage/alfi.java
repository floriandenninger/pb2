package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alfi extends FrameLayout.LayoutParams {
    public int a;
    float b;

    public alfi() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }

    public alfi(byte[] bArr) {
        super(-1, -2, 17);
        this.a = 0;
        this.b = 0.5f;
    }

    public alfi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alfo.d);
        this.a = obtainStyledAttributes.getInt(0, 0);
        this.b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public alfi(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        this.b = 0.5f;
    }
}
