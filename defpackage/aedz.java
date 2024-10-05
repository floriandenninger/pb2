package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aedz implements Callable, pgp {
    public final Handler a = new Handler(Looper.getMainLooper());
    public aaos b;
    public final afba c;
    private final afhf d;
    private final PlayerConfigModel e;
    private final aeea f;
    private int g;

    public aedz(afhf afhfVar, PlayerConfigModel playerConfigModel, aeea aeeaVar, afba afbaVar) {
        this.d = afhfVar;
        this.e = playerConfigModel;
        this.f = aeeaVar;
        this.c = afbaVar;
    }

    public static void d() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override // defpackage.pgp
    public final void a(final IOException iOException) {
        yjk.e();
        afic aficVar = afic.ABR;
        int i = this.g + 1;
        this.g = i;
        if (i < 2) {
            try {
                Thread.sleep(2500L);
                c();
            } catch (InterruptedException unused) {
            }
        } else {
            if (this.c != null) {
                this.a.post(new Runnable() { // from class: aedw
                    @Override // java.lang.Runnable
                    public final void run() {
                        aedz aedzVar = aedz.this;
                        aedzVar.c.a(iOException);
                    }
                });
            }
            d();
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aaos call() {
        yjk.e();
        afjg afjgVar = new afjg(this.d.a());
        aeef aeefVar = new aeef(this.f.a);
        zhy b = zhy.b(this.f.c);
        if (!TextUtils.isEmpty(this.f.b)) {
            b.h("cpn", this.f.b);
        }
        apdl apdlVar = this.e.c.j;
        if (apdlVar == null) {
            apdlVar = apdl.a;
        }
        int i = apdlVar.h;
        if (i == 0) {
            i = 5;
        }
        b.k("mpd_version", i);
        String uri = b.a().toString();
        aquz aquzVar = this.e.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        int i2 = aquzVar.aL;
        if (i2 == 0) {
            i2 = 3;
        }
        this.b = new aaos(uri, afjgVar, aeefVar, i2);
        aedy aedyVar = new aedy(this);
        aedyVar.start();
        try {
            aedyVar.join();
        } catch (InterruptedException e) {
            if (this.c != null) {
                this.a.post(new Runnable() { // from class: aedx
                    @Override // java.lang.Runnable
                    public final void run() {
                        aedz aedzVar = aedz.this;
                        aedzVar.c.a(e);
                    }
                });
            }
        }
        return this.b;
    }

    public final void c() {
        aaos aaosVar = this.b;
        pgr pgrVar = new pgr(aaosVar, new pgh(aaosVar.d, aaosVar.b, aaosVar.a), Looper.myLooper(), this);
        pgrVar.d = SystemClock.elapsedRealtime();
        pgrVar.c.e(pgrVar.b, pgrVar.a, pgrVar);
    }
}
