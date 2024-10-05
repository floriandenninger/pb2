package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class usq implements Runnable {
    public final /* synthetic */ usu a;
    private final /* synthetic */ int b;

    public /* synthetic */ usq(usu usuVar, int i) {
        this.b = i;
        this.a = usuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            uss.c(this.a);
            return;
        }
        if (i == 1) {
            uss.b(this.a);
            return;
        }
        if (i != 2) {
            usu usuVar = this.a;
            uqq.j();
            if (usuVar.b.i != 0) {
                return;
            }
            usuVar.b.i = SystemClock.elapsedRealtime();
            usuVar.b.m.i = true;
            return;
        }
        usu usuVar2 = this.a;
        uqq.j();
        if (usuVar2.b.j != 0) {
            return;
        }
        usuVar2.b.j = SystemClock.elapsedRealtime();
        usuVar2.b.m.j = true;
    }
}
