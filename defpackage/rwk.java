package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rwk extends LinearLayout.LayoutParams {
    public byte a;
    public int b;
    public boolean c;
    public boolean d;

    public rwk() {
        this(-1, -1, (byte) 2, 0);
    }

    public final boolean a() {
        return (this.a & 32) != 0;
    }

    public final boolean b(byte b) {
        byte b2 = this.a;
        return (b2 & b) == b && ((((byte) (b | 32)) ^ (-1)) & b2) == 0;
    }

    public final void c() {
        this.d = true;
    }

    public final void d() {
        this.c = true;
    }

    @Override // android.view.ViewGroup.LayoutParams
    protected final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, -2);
        this.height = typedArray.getLayoutDimension(i2, -2);
    }

    public rwk(int i, int i2, byte b, int i3) {
        super(i, i2);
        this.a = b;
        this.b = i3;
    }

    public rwk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rum.b);
        this.a = (byte) obtainStyledAttributes.getInt(0, 2);
        this.b = obtainStyledAttributes.getInt(4, 0);
        this.c = obtainStyledAttributes.getBoolean(3, false);
        this.d = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }

    public rwk(ViewGroup.LayoutParams layoutParams) {
        super(0, 0);
        this.width = layoutParams.width;
        this.height = layoutParams.height;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            this.weight = layoutParams2.weight;
            this.gravity = layoutParams2.gravity;
        }
        if (layoutParams instanceof rwk) {
            rwk rwkVar = (rwk) layoutParams;
            this.a = rwkVar.a;
            this.b = rwkVar.b;
            this.c = rwkVar.c;
            this.d = rwkVar.d;
        }
    }
}
