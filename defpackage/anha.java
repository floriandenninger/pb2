package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anha {
    private final AtomicReference b = new AtomicReference(anhv.a);
    public angz a = new angz();

    private anha() {
    }

    public static anha a() {
        return new anha();
    }

    public final anhy b(anfy anfyVar, Executor executor) {
        anfyVar.getClass();
        executor.getClass();
        angy angyVar = new angy(executor, this);
        angv angvVar = new angv(angyVar, anfyVar);
        SettableFuture f = SettableFuture.f();
        anhy anhyVar = (anhy) this.b.getAndSet(f);
        aniu f2 = aniu.f(angvVar);
        anhyVar.d(f2, angyVar);
        anhy P = anaf.P(f2);
        angw angwVar = new angw(f2, f, anhyVar, P, angyVar);
        P.d(angwVar, angq.a);
        f2.d(angwVar, angq.a);
        return P;
    }
}
