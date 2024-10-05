package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqf extends akpy {
    static final long a = TimeUnit.MINUTES.toSeconds(2);
    long b;
    private boolean c = false;
    private final afrw d;
    private final shf e;

    public akqf(afrw afrwVar, shf shfVar) {
        this.d = afrwVar;
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
        List i;
        long c = this.e.c();
        this.d.j();
        if (c < this.b || (i = this.d.i()) == null || i.size() == 0) {
            return false;
        }
        aoneVar.copyOnWrite();
        avdg avdgVar = (avdg) aoneVar.instance;
        avdg avdgVar2 = avdg.a;
        avdgVar.h = avdg.emptyProtobufList();
        aoneVar.aU(i);
        return true;
    }
}
