package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ufz extends oy {
    final /* synthetic */ amru a;
    final /* synthetic */ ugb b;

    public ufz(ugb ugbVar, amru amruVar) {
        this.b = ugbVar;
        this.a = amruVar;
    }

    @Override // defpackage.oy
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.oy
    public final int b() {
        return this.b.f.size();
    }

    @Override // defpackage.oy
    public final boolean c(int i, int i2) {
        return ((ugn) this.b.f.get(i)).equals(this.a.get(i2));
    }

    @Override // defpackage.oy
    public final boolean d(int i, int i2) {
        return c(i, i2);
    }
}
