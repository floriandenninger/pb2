package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.bsy;
import defpackage.gl;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    protected void c() {
        this.k.h(this);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gl.q(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bsy.c, i, i2);
        String w = gl.w(obtainStyledAttributes, 9, 0);
        this.a = w;
        if (w == null) {
            this.a = this.q;
        }
        this.b = gl.w(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.d = gl.w(obtainStyledAttributes, 11, 3);
        this.e = gl.w(obtainStyledAttributes, 10, 4);
        this.f = gl.s(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
}
