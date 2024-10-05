package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agwx implements afhd {
    final /* synthetic */ agwy a;
    private final /* synthetic */ int b;

    public agwx(agwy agwyVar, int i) {
        this.b = i;
        this.a = agwyVar;
    }

    @Override // defpackage.afhd
    public final void a(Exception exc) {
    }

    @Override // defpackage.afhd
    public final void b(int i) {
    }

    @Override // defpackage.afhd
    public final void c(long j) {
        int i = this.b;
        if (i == 0) {
            this.a.f = j;
            return;
        }
        if (i == 1) {
            this.a.e = j;
        } else if (i != 2) {
            this.a.h = j;
        } else {
            this.a.g = j;
        }
    }
}
