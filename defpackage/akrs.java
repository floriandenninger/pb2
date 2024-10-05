package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akrs {
    public final Object a = new Object();
    public final Map b = new HashMap();
    private final azrw c;

    public akrs(azrw azrwVar) {
        this.c = azrwVar;
    }

    public final void a(avdg avdgVar, boolean z) {
        synchronized (this.a) {
            akqo akqoVar = (akqo) this.c.get();
            aone builder = avdgVar.toBuilder();
            akqoVar.d(builder);
            akqoVar.c(builder);
            avdg avdgVar2 = (avdg) builder.build();
            for (aktk aktkVar : this.b.values()) {
                if (aktkVar.b()) {
                    if (z) {
                        aktkVar.d(avdgVar2);
                    } else {
                        aktkVar.c(avdgVar2);
                    }
                }
            }
        }
    }
}
