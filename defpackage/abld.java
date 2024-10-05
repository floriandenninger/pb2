package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abld implements azrw {
    public final /* synthetic */ ViewGroup.MarginLayoutParams a;
    private final /* synthetic */ int b;

    public /* synthetic */ abld(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        this.b = i;
        this.a = marginLayoutParams;
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        if (i != 0 && i != 1 && i != 2 && i == 3) {
            return this.a;
        }
        return this.a;
    }
}
