package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgr implements pga {
    public final pgh a;
    public final Looper b;
    public final pge c = new pge("manifestLoader:single");
    public long d;
    final /* synthetic */ pgs e;
    private final pgp f;

    public pgr(pgs pgsVar, pgh pghVar, Looper looper, pgp pgpVar) {
        this.e = pgsVar;
        this.a = pghVar;
        this.b = looper;
        this.f = pgpVar;
    }

    private final void a() {
        this.c.b();
    }

    @Override // defpackage.pga
    public final void n(pgc pgcVar) {
        try {
            Object obj = this.a.a;
            pgs pgsVar = this.e;
            long j = this.d;
            pgsVar.l = obj;
            pgsVar.m = j;
            pgsVar.n = SystemClock.elapsedRealtime();
            pgp pgpVar = this.f;
            yjk.e();
            if (((aedz) pgpVar).c != null) {
                Handler handler = ((aedz) pgpVar).a;
                final aedz aedzVar = (aedz) pgpVar;
                handler.post(new Runnable() { // from class: aedv
                    @Override // java.lang.Runnable
                    public final void run() {
                        aedz aedzVar2 = aedz.this;
                        afba afbaVar = aedzVar2.c;
                        afbaVar.f.U(afbaVar.a.k(Collections.emptyList(), Collections.emptyList(), aedzVar2.b), afbaVar.b, afbaVar.c, afbaVar.d, afbaVar.e);
                        afbs afbsVar = afbaVar.f;
                        if (afbsVar.z != null) {
                            afbsVar.z = null;
                        }
                    }
                });
            }
            aedz.d();
        } finally {
            a();
        }
    }

    @Override // defpackage.pga
    public final void o(pgc pgcVar, IOException iOException) {
        try {
            this.f.a(iOException);
        } finally {
            a();
        }
    }

    @Override // defpackage.pga
    public final void p() {
        try {
            this.f.a(new pgq(new CancellationException()));
        } finally {
            a();
        }
    }
}
