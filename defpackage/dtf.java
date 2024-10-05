package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtf {
    final SparseArray a = new SparseArray();
    final Map b = new HashMap();
    public final int c;
    private final boolean d;
    private int e;

    public dtf(boolean z, int i) {
        this.d = z;
        this.c = i;
        this.e = i + 1;
    }

    public final void a(dte dteVar) {
        int i;
        if (!dteVar.k() || dteVar == dsj.a) {
            return;
        }
        if (!this.d) {
            dteVar.o();
            if (!this.d || this.c != dteVar.a()) {
                dqo d = dteVar.d();
                if (this.b.containsKey(d)) {
                    i = ((Integer) this.b.get(d)).intValue();
                } else {
                    dteVar.o();
                    int i2 = this.e;
                    this.e = i2 + 1;
                    this.a.put(i2, d);
                    this.b.put(d, Integer.valueOf(i2));
                    i = i2;
                }
                dteVar.o();
                dteVar.g(i);
                return;
            }
            throw new IllegalStateException("CustomViewType cannot be the same as ComponentViewType.");
        }
        dteVar.o();
        throw new IllegalStateException("If you enable custom viewTypes, you must provide a customViewType in ViewRenderInfo.");
    }
}
