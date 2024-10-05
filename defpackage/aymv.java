package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymv extends ayep {
    long a;
    final /* synthetic */ aynl b;
    private final aynj c;

    public aymv(aynl aynlVar, aynj aynjVar) {
        this.b = aynlVar;
        this.c = aynjVar;
    }

    @Override // defpackage.ayep
    public final void n(long j) {
        if (this.b.r.f != null) {
            return;
        }
        synchronized (this.b.l) {
            if (this.b.r.f == null) {
                aynj aynjVar = this.c;
                if (!aynjVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    aynl aynlVar = this.b;
                    long j3 = aynlVar.t;
                    if (j2 > j3) {
                        if (j2 > aynlVar.n) {
                            aynjVar.c = true;
                        } else {
                            long a = aynlVar.m.a(j2 - j3);
                            aynl aynlVar2 = this.b;
                            aynlVar2.t = this.a;
                            if (a > aynlVar2.o) {
                                this.c.c = true;
                            }
                        }
                        aynj aynjVar2 = this.c;
                        Runnable q = aynjVar2.c ? this.b.q(aynjVar2) : null;
                        if (q != null) {
                            q.run();
                        }
                    }
                }
            }
        }
    }
}
