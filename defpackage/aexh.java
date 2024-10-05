package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexh extends aeww {
    final /* synthetic */ aexj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aexh(aexj aexjVar, Handler handler, aewj aewjVar, Handler handler2) {
        super(handler, aewjVar, handler2);
        this.d = aexjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(final aexl aexlVar) {
        aexl aexlVar2 = this.d.d;
        if (aexlVar2 != null) {
            long u = aear.u(aexlVar.o, aexlVar2.o);
            long u2 = aear.u(aexlVar.p, aexlVar2.p);
            long micros = TimeUnit.MILLISECONDS.toMicros(50L);
            if (aexlVar.j == aexlVar2.j && aexlVar.k == aexlVar2.k && aexlVar.l == aexlVar2.l && ((u == -9223372036854775807L || Math.abs(u) < micros) && ((aexlVar.p == aexlVar2.p || (u2 != -9223372036854775807L && Math.abs(u2) < micros)) && aexlVar.q == aexlVar2.q && aexlVar.n == aexlVar2.n && amkq.b(aexlVar.e, aexlVar2.e) && aexlVar.r == aexlVar2.r))) {
                return;
            }
        }
        if (this.d.d == null) {
            afic aficVar = afic.ABR;
        }
        this.d.d = aexlVar;
        this.c.post(new Runnable() { // from class: aexg
            @Override // java.lang.Runnable
            public final void run() {
                aexh aexhVar = aexh.this;
                aexhVar.d.rw(aexlVar);
            }
        });
    }
}
