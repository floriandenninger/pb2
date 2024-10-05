package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agto {
    public final ScheduledExecutorService a;
    public final aahv b;
    public final azrw c;
    public final azrw d;
    public final azrw e;
    public agsa f;
    public anhy g;
    public anhy h;
    private anhy i;

    public agto(ScheduledExecutorService scheduledExecutorService, aahv aahvVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = scheduledExecutorService;
        this.b = aahvVar;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = azrwVar3;
    }

    public static final void d(Throwable th) {
        cnq cnqVar;
        if (th instanceof cnq) {
            cnqVar = (cnq) th;
        } else {
            cnqVar = new cnq(th);
        }
        String valueOf = String.valueOf(cnqVar.getMessage());
        zga.b(valueOf.length() != 0 ? "[Offline] OfflineVideoPlaybackPositionSyncService request failed: ".concat(valueOf) : new String("[Offline] OfflineVideoPlaybackPositionSyncService request failed: "));
    }

    public final void a() {
        anhy anhyVar = this.i;
        if (anhyVar == null || anhyVar.isCancelled() || this.i.isDone()) {
            anhy i = anfq.i(anht.q(anaf.O(((agof) this.e.get()).a())), ufj.m, this.a);
            this.i = i;
            ynm.k(i, angq.a, afka.o, new agtl(this, 2));
        }
    }
}
