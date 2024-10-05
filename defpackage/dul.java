package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dul extends ViewGroup {
    public dul(Context context) {
        super(context, null);
    }

    public abstract void o(dum dumVar, int i, int i2);

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (i == 130) {
            i = 130;
        }
        return super.requestFocus(i, rect);
    }

    public abstract void t(int i, dum dumVar);
}
