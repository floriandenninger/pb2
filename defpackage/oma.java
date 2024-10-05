package defpackage;

import android.app.Activity;
import j$.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oma implements Supplier {
    public final /* synthetic */ Activity a;
    private final /* synthetic */ int b;

    public /* synthetic */ oma(Activity activity, int i) {
        this.b = i;
        this.a = activity;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? lto.c(this.a) : lto.c(this.a);
        }
        return Integer.valueOf(mcy.C(this.a));
    }
}
