package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqe extends akpy {
    static final long a = TimeUnit.MINUTES.toSeconds(2);
    long b;
    private boolean c = false;
    private final azrw d;
    private final shf e;

    public akqe(azrw azrwVar, shf shfVar) {
        azrwVar.getClass();
        this.d = azrwVar;
        shfVar.getClass();
        this.e = shfVar;
    }

    @Override // defpackage.akqj
    public final void d(avdy avdyVar) {
        long millis;
        if (avdyVar == null || (avdyVar.b & 256) == 0) {
            return;
        }
        avdq avdqVar = avdyVar.g;
        if (avdqVar == null) {
            avdqVar = avdq.a;
        }
        this.c = avdqVar.b;
        avdq avdqVar2 = avdyVar.g;
        if (avdqVar2 == null) {
            avdqVar2 = avdq.a;
        }
        long j = avdqVar2.c;
        long j2 = a;
        if (j <= j2) {
            millis = TimeUnit.SECONDS.toMillis(j2);
        } else {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            avdq avdqVar3 = avdyVar.g;
            if (avdqVar3 == null) {
                avdqVar3 = avdq.a;
            }
            millis = timeUnit.toMillis(avdqVar3.c);
        }
        this.b = millis;
    }

    @Override // defpackage.akqj
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.akqj
    public final boolean f(Context context, aone aoneVar) {
        long c = this.e.c();
        afrv afrvVar = (afrv) this.d.get();
        amxd listIterator = afrvVar.a.keySet().listIterator();
        long j = -1;
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            long a2 = afrvVar.a((String) listIterator.next());
            if (a2 == -2) {
                j = -2;
                break;
            }
            j = Math.max(a2, j);
        }
        if (j == -1) {
            amxd listIterator2 = afrvVar.a.keySet().listIterator();
            while (listIterator2.hasNext()) {
                afrvVar.c((String) listIterator2.next());
            }
            amxd listIterator3 = afrvVar.a.keySet().listIterator();
            while (listIterator3.hasNext()) {
                afrvVar.i((String) listIterator3.next(), c);
            }
            return false;
        }
        if (j != -2 && c - j >= this.b) {
            HashMap hashMap = new HashMap();
            amxd listIterator4 = afrvVar.a.keySet().listIterator();
            while (listIterator4.hasNext()) {
                String str = (String) listIterator4.next();
                aqjl b = afrvVar.b(str, c);
                if (b != null) {
                    hashMap.put(str, b);
                }
            }
            if (hashMap.size() == 0) {
                hashMap = null;
            }
            if (hashMap != null && hashMap.size() != 0) {
                aoneVar.copyOnWrite();
                avdg avdgVar = (avdg) aoneVar.instance;
                avdg avdgVar2 = avdg.a;
                avdgVar.h = avdg.emptyProtobufList();
                aoneVar.aU(hashMap.values());
                for (String str2 : hashMap.keySet()) {
                    afrvVar.c(str2);
                    afrvVar.i(str2, this.e.c());
                }
                return true;
            }
        }
        return false;
    }
}
