package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpe implements jpi {
    public final int a;
    public final Class b;
    private final aahv c;
    private final amml d;
    private final ajoy e;

    public jpe(aahv aahvVar, ajoy ajoyVar, int i, Class cls, amml ammlVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = aahvVar;
        this.e = ajoyVar;
        this.a = i;
        this.b = cls;
        this.d = ammlVar;
    }

    @Override // defpackage.jpi
    public final int a() {
        return this.a;
    }

    @Override // defpackage.jpi
    public final int b() {
        return this.a;
    }

    @Override // defpackage.jpi
    public final jpg c(aakt aaktVar, String str, jph jphVar) {
        aahu c = this.c.c();
        if (aaktVar != null) {
            return jpg.a(aaktVar.e().a(c));
        }
        whu whuVar = (whu) this.d.apply(str);
        whuVar.getClass();
        return jpg.a(whuVar.a(c));
    }

    @Override // defpackage.jpi
    public final ammv d(String str) {
        return ammv.j(str);
    }

    @Override // defpackage.jpi
    public final amsx e(String str) {
        return amsx.r(this.e.E(str));
    }

    @Override // defpackage.jpi
    public final Class f() {
        return this.b;
    }

    @Override // defpackage.jpi
    public final Class g() {
        return this.b;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(1, str);
    }
}
