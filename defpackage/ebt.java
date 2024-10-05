package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebt implements Callable {
    private final ebe a;
    private final aone b;

    public ebt(ebe ebeVar, aone aoneVar) {
        this.a = ebeVar;
        this.b = aoneVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Future future = this.a.j;
        if (future != null) {
            future.get();
        }
        dvo dvoVar = this.a.i;
        if (dvoVar == null) {
            return null;
        }
        try {
            synchronized (this.b) {
                this.b.mergeFrom(dvoVar.toByteArray(), aomw.a());
            }
            return null;
        } catch (aoob | NullPointerException unused) {
            return null;
        }
    }
}
