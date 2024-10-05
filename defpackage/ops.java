package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ops implements ayrv {
    public final /* synthetic */ ayrv a;
    public final /* synthetic */ ayrv b;
    private final /* synthetic */ int c;

    public /* synthetic */ ops(ayrv ayrvVar, ayrv ayrvVar2, int i) {
        this.c = i;
        this.a = ayrvVar;
        this.b = ayrvVar2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        if (this.c == 0) {
            return (amrz) ((aypy) obj).Y(new ops(this.a, this.b, 1)).A(ohs.r, ayso.a).ar(amrz.h(), opu.a).G(ohs.t).X();
        }
        return ammw.a(this.a.a(obj), this.b.a(obj));
    }
}
