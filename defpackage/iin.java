package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class iin extends wv {
    public iin(View view) {
        super(view);
        view.setTag(this);
    }

    public static iin G(View view) {
        Object tag = view.getTag();
        if (tag instanceof iin) {
            return (iin) tag;
        }
        return null;
    }

    public abstract ihm E();

    public abstract void F();
}
