package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ls extends ViewGroup.MarginLayoutParams {
    public int a;

    public ls(int i, int i2) {
        super(i, i2);
        this.a = 8388627;
    }

    public ls(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nx.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public ls(ls lsVar) {
        super((ViewGroup.MarginLayoutParams) lsVar);
        this.a = 0;
        this.a = lsVar.a;
    }

    public ls(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
