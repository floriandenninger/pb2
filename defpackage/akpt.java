package defpackage;

import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorV2;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akpt {
    public final aktg a;
    public final azrw b;
    public final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;

    public akpt(aktg aktgVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        this.a = aktgVar;
        this.d = azrwVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
        this.b = azrwVar4;
        this.c = azrwVar5;
        this.g = azrwVar6;
    }

    public final yxx a() {
        return this.a.f;
    }

    public final akta b() {
        return (akta) this.d.get();
    }

    public final aktd c() {
        return (aktd) this.e.get();
    }

    public final akte d() {
        return (akte) this.f.get();
    }

    public final void e() {
        yyy yyyVar = this.a.e;
        int i = yyyVar.q;
        int i2 = 1;
        if (i == 1) {
            akta aktaVar = (akta) this.d.get();
            if (aktaVar.a > 0) {
                aktaVar.f.start();
            }
        } else if (i == 2) {
            aktd aktdVar = (aktd) this.e.get();
            int i3 = akso.a;
            aktdVar.e.post(new aktb(aktdVar, 0));
            aktdVar.i.schedule(new aktb(aktdVar, i2), aktdVar.a + 50, TimeUnit.MILLISECONDS);
        }
        if (yyyVar.s == 1) {
            akte akteVar = (akte) this.f.get();
            akteVar.b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(akteVar);
        }
        if (yyyVar.r == 1) {
            ((NativeCrashDetectorV2) this.b.get()).b();
        }
        akrx akrxVar = (akrx) this.c.get();
        akrxVar.f = akrxVar.d.g();
    }
}
