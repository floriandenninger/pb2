package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dlu implements dkf {
    public static dlu a;
    public static final dkb c;
    public final ThreadPoolExecutor b;

    static {
        boolean z = doa.a;
        c = new dkb(2, 2, 5);
    }

    public dlu(dkb dkbVar) {
        this.b = new dkc(dkbVar.a, dkbVar.b, dkbVar.c);
    }

    public static dlu d(dkb dkbVar) {
        return new dlu(dkbVar);
    }

    @Override // defpackage.dkf
    public final void a(Runnable runnable) {
        this.b.remove(runnable);
    }

    @Override // defpackage.dkf
    public final void b() {
    }

    @Override // defpackage.dkf
    public final void c(Runnable runnable) {
        try {
            this.b.execute(runnable);
        } catch (RejectedExecutionException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Cannot execute layout calculation task; ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
    }
}
