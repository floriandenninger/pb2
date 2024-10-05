package defpackage;

import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfh {
    public final HashSet a = new HashSet();
    private final Executor b;
    private boolean c;

    public sfh(Executor executor) {
        this.b = executor;
    }

    public final synchronized anhy a() {
        anhy a;
        this.c = true;
        a = anaf.H(this.a).a(gip.d, this.b);
        this.a.clear();
        return a;
    }

    public final synchronized anhy b(sfg sfgVar) {
        if (this.c) {
            return anaf.M();
        }
        anhy a = sfgVar.a();
        this.a.add(a);
        anaf.Y(a, new sff(this, a), this.b);
        return a;
    }

    public final synchronized boolean c() {
        return this.c;
    }
}
