package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akpz implements akqb {
    public final shf a;
    public long b;
    private final azrw c;
    private final int d;
    private final long e;

    public akpz(azrw azrwVar, avdl avdlVar, shf shfVar) {
        this.c = azrwVar;
        this.d = avdlVar.c;
        this.e = TimeUnit.SECONDS.toMillis(avdlVar.d);
        this.a = shfVar;
    }

    @Override // defpackage.akqb
    public final int a() {
        return this.d;
    }

    @Override // defpackage.akqb
    public final boolean b() {
        if (!((akqo) this.c.get()).b()) {
            long j = this.e;
            if (j <= 0 || j + this.b > this.a.d()) {
                return true;
            }
        }
        return false;
    }
}
