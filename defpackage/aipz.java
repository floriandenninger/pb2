package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.player.stats.HeartbeatClient$HeartbeatClientState;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aipz {
    public final aaxn a;
    public final String b;
    public final aipy c;
    public final aryb d;
    public final byte[] e;
    public final String f;
    public volatile long g;
    public int h;
    private final shf i;
    private final Executor j;
    private final Handler k;
    private final SecureRandom l;
    private final acpl m;
    private volatile boolean p;
    private final AtomicInteger o = new AtomicInteger();
    private final Runnable n = new aipx(this);

    public aipz(shf shfVar, Executor executor, Handler handler, SecureRandom secureRandom, aaxn aaxnVar, String str, aipy aipyVar, aryb arybVar, byte[] bArr, String str2, acpl acplVar) {
        this.i = shfVar;
        this.j = executor;
        this.k = handler;
        this.l = secureRandom;
        this.a = aaxnVar;
        this.b = str;
        this.c = aipyVar;
        this.d = arybVar;
        this.e = bArr;
        this.f = str2;
        this.m = acplVar;
    }

    public final synchronized HeartbeatClient$HeartbeatClientState a() {
        return new HeartbeatClient$HeartbeatClientState(this.d, this.e, this.f, this.g, this.h);
    }

    public final synchronized void b() {
        if (this.g == 0) {
            this.g = this.i.d() + 2000;
        }
    }

    public final synchronized void c(aheg ahegVar) {
        if (!ahegVar.j() || this.p || this.g == 0 || this.g > this.i.d()) {
            return;
        }
        this.p = true;
        this.j.execute(this.n);
    }

    public final void d(final aigr aigrVar, aryi aryiVar, boolean z) {
        this.o.set(0);
        this.p = false;
        this.g = 0L;
        aone createBuilder = ardw.a.createBuilder();
        if (aryiVar != null) {
            aomf aomfVar = aryiVar.p;
            createBuilder.copyOnWrite();
            ardw ardwVar = (ardw) createBuilder.instance;
            aomfVar.getClass();
            ardwVar.b |= 1;
            ardwVar.c = aomfVar;
        }
        createBuilder.copyOnWrite();
        ardw ardwVar2 = (ardw) createBuilder.instance;
        ardwVar2.b |= 2;
        ardwVar2.d = z;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cF((ardw) createBuilder.build());
        this.m.c((arpp) a.build());
        this.k.post(new Runnable() { // from class: aipv
            @Override // java.lang.Runnable
            public final void run() {
                aipz aipzVar = aipz.this;
                aipzVar.c.e(aigrVar);
            }
        });
    }

    public final void e() {
        this.o.set(0);
        this.p = false;
        this.g = this.i.d() + this.d.d;
    }

    public final void f(Exception exc, int i) {
        int incrementAndGet = this.o.incrementAndGet();
        aryb arybVar = this.d;
        if (incrementAndGet <= arybVar.e) {
            this.p = false;
            this.g = (this.o.get() * 2000) + this.i.d() + (this.l.nextInt(999) - 499);
        } else if (arybVar.g) {
            e();
        } else {
            d(new aigr(i, exc), null, true);
        }
    }
}
