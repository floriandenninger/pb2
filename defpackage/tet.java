package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tet extends tei {
    public final Handler a = new Handler(Looper.getMainLooper(), new ter(this));
    public final Set b = new HashSet();
    public final tdq c;
    public tes d;
    private final tec e;
    private boolean f;

    public tet(tdq tdqVar) {
        this.c = tdqVar;
        this.e = new tec(tdqVar);
    }

    private final void g() {
        int i = teu.d;
        this.c.a.c.remove(this);
        this.a.removeMessages(0);
    }

    @Override // defpackage.tei
    public final void a(tey teyVar, tfa tfaVar) {
        View a;
        double d;
        if (this.f || teyVar == null || (a = teyVar.a()) == null) {
            return;
        }
        tdy a2 = this.e.a(teyVar, a);
        tes tesVar = this.d;
        if (tesVar == null) {
            AudioManager audioManager = (AudioManager) a.getContext().getSystemService("audio");
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume <= 0) {
                d = 0.0d;
            } else {
                double streamVolume = audioManager.getStreamVolume(3);
                double d2 = streamMaxVolume;
                Double.isNaN(streamVolume);
                Double.isNaN(d2);
                d = Math.min(streamVolume / d2, 1.0d);
            }
        } else {
            d = tesVar.c;
        }
        c(teyVar, new VisibilityChangeEventData(a2, d, teyVar.b().booleanValue()), tfaVar);
        if (tfaVar != null && tfaVar.s) {
            teyVar.l();
        }
        teyVar.m();
        if (tfaVar == null) {
            return;
        }
        if (tfaVar.v) {
            if (this.b.remove(teyVar) && this.b.isEmpty()) {
                g();
                return;
            }
            return;
        }
        boolean isEmpty = this.b.isEmpty();
        this.b.add(teyVar);
        if (isEmpty) {
            f();
        }
    }

    @Override // defpackage.tei
    public final void b() {
        this.b.clear();
        g();
        this.f = true;
        tes tesVar = this.d;
        if (tesVar != null) {
            if (tesVar.b) {
                tesVar.a.unregisterContentObserver(tesVar);
                tesVar.b = false;
            }
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(teb tebVar) {
        View a;
        if (this.f || tebVar == null || (a = tebVar.a()) == null) {
            return;
        }
        tdy a2 = this.e.a(tebVar, a);
        long currentTimeMillis = System.currentTimeMillis();
        if (tebVar.c == -1) {
            tebVar.c = currentTimeMillis;
        }
        long j = tebVar.b;
        if (j == 0) {
            tebVar.b = currentTimeMillis;
            j = currentTimeMillis;
        }
        tebVar.e.b(currentTimeMillis - j, a2.a, a2.b);
        tebVar.f = a2;
        tebVar.b = currentTimeMillis;
        if (!tebVar.g() || tebVar.m) {
            return;
        }
        tebVar.h.a(tebVar.i("lidarim", "v"), tebVar.a());
        tebVar.m = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(teb tebVar) {
        d(tebVar);
        if (this.b.remove(tebVar) && this.b.isEmpty()) {
            g();
        }
    }

    public final void f() {
        int i = teu.d;
        this.c.a.c.add(this);
        this.a.sendEmptyMessageDelayed(0, 200L);
    }
}
