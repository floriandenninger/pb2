package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aeqy implements Runnable {
    public final /* synthetic */ aerf a;
    private final /* synthetic */ int b;

    public /* synthetic */ aeqy(aerf aerfVar, int i) {
        this.b = i;
        this.a = aerfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.d();
                return;
            case 1:
                aerf aerfVar = this.a;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = aerfVar.a;
                StringBuilder sb = new StringBuilder(35);
                sb.append("start_delta_ms.");
                sb.append(elapsedRealtime - j);
                aerfVar.i("empup", new aeqs(sb.toString()));
                return;
            case 2:
                this.a.f();
                return;
            case 3:
                this.a.m();
                return;
            case 4:
                this.a.n();
                return;
            case 5:
                this.a.q();
                return;
            case 6:
                this.a.r();
                return;
            default:
                this.a.v();
                return;
        }
    }
}
