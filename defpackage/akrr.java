package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akrr {
    public final Context b;
    public final azrw c;
    public final azrw d;
    public boolean f;
    private final azrw g;
    public final Object a = new Object();
    public final Map e = new HashMap();

    public akrr(Context context, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.b = context;
        this.g = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(avdh avdhVar) {
        aone createBuilder = avdg.a.createBuilder();
        if (avdhVar != null) {
            createBuilder.copyOnWrite();
            avdg avdgVar = (avdg) createBuilder.instance;
            avdgVar.c = avdhVar.c;
            avdgVar.b |= 1;
        }
        c(createBuilder, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(avdh avdhVar) {
        if (this.f) {
            aktn aktnVar = new aktn("Heartbeat", avdhVar);
            unf a = unf.a();
            a.a.d(aktnVar.toString());
            return;
        }
        a(avdhVar);
    }

    public final void c(aone aoneVar, boolean z, boolean z2) {
        if (z) {
            ((akrs) this.g.get()).a((avdg) aoneVar.build(), true);
            return;
        }
        synchronized (this.a) {
            for (akqj akqjVar : this.e.values()) {
                if (akqjVar.e()) {
                    z2 |= akqjVar.f(this.b, aoneVar);
                }
            }
        }
        if (z2) {
            ((akrs) this.g.get()).a((avdg) aoneVar.build(), false);
        }
    }
}
