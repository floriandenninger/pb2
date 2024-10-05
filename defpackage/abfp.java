package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abfp extends abfi {
    private final azrw a;
    private final Executor b;
    private final AtomicBoolean c;
    private final aacu d;

    public abfp(SharedPreferences sharedPreferences, azrw azrwVar, azrw azrwVar2, aacu aacuVar, Executor executor) {
        super(sharedPreferences, azrwVar2);
        this.c = new AtomicBoolean(false);
        this.a = azrwVar;
        this.d = aacuVar;
        this.b = executor;
    }

    @Override // defpackage.abfi
    protected final synchronized void c() {
        if (this.c.compareAndSet(false, true)) {
            aaxw aaxwVar = (aaxw) this.a.get();
            aaxv a = aaxwVar.a();
            a.m(aaef.b);
            this.d.a().L(false).l().ao(ayqj.D(aaxwVar.b(a, this.b)).G(zcz.r).K(new ayrv() { // from class: abfo
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    abfp abfpVar = abfp.this;
                    Throwable th = (Throwable) obj;
                    if (th instanceof ExecutionException) {
                        abfpVar.d(22);
                    } else if (th instanceof InterruptedException) {
                        abfpVar.d(21);
                    }
                    return amlr.a;
                }
            }).l().ah(amlr.a), nxd.r).ab(azre.b(this.b)).G(new ayrs() { // from class: abfn
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    abfp abfpVar = abfp.this;
                    Pair pair = (Pair) obj;
                    Boolean bool = (Boolean) pair.first;
                    asem asemVar = (asem) ((ammv) pair.second).f();
                    if (bool.booleanValue() || asemVar == null) {
                        return;
                    }
                    abfpVar.b(asemVar);
                }
            }).as(Pair.create(false, amlr.a)).U();
        }
    }
}
