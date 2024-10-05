package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dij extends dlh implements dkt {
    private final AtomicInteger c;
    private final int d;

    public dij(int i) {
        super(i);
        this.c = new AtomicInteger(0);
        this.d = i;
    }

    @Override // defpackage.dkt
    public final Object a(Context context, dhk dhkVar) {
        Object d = super.d();
        if (d != null) {
            return d;
        }
        this.c.incrementAndGet();
        return dhkVar.J(context);
    }

    @Override // defpackage.dkt
    public final void b(Context context, dhk dhkVar) {
        if (this.b < this.a && this.c.getAndIncrement() < this.d) {
            c(dhkVar.J(context));
        }
    }
}
