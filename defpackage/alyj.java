package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alyj implements anfz {
    public final List a;
    public final int b;
    public final Executor c;
    private final ammy e;
    public int d = -1;
    private final anfz f = amjk.c(this);

    public alyj(List list, ammy ammyVar, Executor executor) {
        this.a = list;
        this.b = list.size();
        this.e = ammyVar;
        this.c = executor;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.e.a(obj)) {
            return anaf.O(obj);
        }
        return b();
    }

    public final anhy b() {
        int i = this.d + 1;
        this.d = i;
        if (i < this.b) {
            return anfq.i((anhy) this.a.get(i), this.f, this.c);
        }
        return anaf.O(null);
    }
}
