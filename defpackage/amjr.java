package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amjr implements amis {
    private final /* synthetic */ int d;
    public static final /* synthetic */ amjr c = new amjr(2);
    public static final /* synthetic */ amjr b = new amjr(1);
    public static final /* synthetic */ amjr a = new amjr(0);

    private /* synthetic */ amjr(int i) {
        this.d = i;
    }

    @Override // defpackage.amis, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.d;
        if (i == 0) {
            WeakHashMap weakHashMap = amjw.a;
        } else if (i == 1) {
            amjw.j();
        } else {
            amjw.b.add(amjw.d);
            uqq.l(amjw.e);
        }
    }
}
