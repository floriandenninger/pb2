package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeto implements att {
    private final afjf a;
    private final Map b = new HashMap();

    public aeto(afjf afjfVar) {
        afki.a(afjfVar);
        this.a = afjfVar;
    }

    @Override // defpackage.att
    public final synchronized void a(ate ateVar, ath athVar, boolean z, int i) {
        aetn aetnVar = (aetn) this.b.get(ateVar);
        if (aetnVar == null) {
            return;
        }
        if (aetnVar.c == 0 && i > 0) {
            this.a.B(aetnVar.a, aetnVar.b);
        }
        if (!aetnVar.b) {
            if (aetnVar.a) {
                long j = aetnVar.c;
                if (j < 102400 && j + i >= 102400) {
                    this.a.aw();
                }
            } else {
                long j2 = aetnVar.c;
                if (j2 < 40960 && j2 + i >= 40960) {
                    this.a.f();
                }
            }
        }
        aetnVar.c += i;
    }

    @Override // defpackage.att
    public final synchronized void b(ate ateVar, ath athVar, boolean z) {
        aetn aetnVar = (aetn) this.b.get(ateVar);
        if (aetnVar == null) {
            return;
        }
        if (aetnVar.b) {
            this.a.E(aetnVar.a);
        }
        this.b.remove(ateVar);
    }

    @Override // defpackage.att
    public final synchronized void c(ate ateVar, ath athVar, boolean z) {
        if ("/videoplayback".equals(athVar.a.getPath())) {
            try {
                int parseInt = Integer.parseInt(athVar.a.getQueryParameter("itag"));
                boolean z2 = athVar.g == 0;
                Set c = aaoq.c();
                Integer valueOf = Integer.valueOf(parseInt);
                if (c.contains(valueOf)) {
                    this.b.put(ateVar, new aetn(true, z2));
                    this.a.ax(z2);
                } else if (aaoq.b().contains(valueOf)) {
                    this.b.put(ateVar, new aetn(false, z2));
                    this.a.g(z2);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    @Override // defpackage.att
    public final synchronized void d(ate ateVar, ath athVar, boolean z) {
        aetn aetnVar = (aetn) this.b.get(ateVar);
        if (aetnVar == null) {
            return;
        }
        this.a.ap(aetnVar.a, aetnVar.b);
    }
}
