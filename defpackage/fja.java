package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fja implements fif {
    private final fio a;
    private final aais b;
    private final aahv c;
    private final afsy d;
    private final axzf e;

    public fja(fio fioVar, aais aaisVar, aahv aahvVar, afsy afsyVar, axzf axzfVar, byte[] bArr) {
        this.a = fioVar;
        this.b = aaisVar;
        this.c = aahvVar;
        this.d = afsyVar;
        this.e = axzfVar;
    }

    private final aakv d() {
        if (this.e.b().booleanValue()) {
            return this.c.a(this.d.c());
        }
        return c();
    }

    @Override // defpackage.fif
    public final ayps a(String str) {
        return this.a.a(d(), fhe.w(), str);
    }

    @Override // defpackage.fif
    public final ayqj b(fid fidVar) {
        return this.a.b(d(), fhe.w(), (aqnf) fidVar.a.e(aqnf.FILTER_TYPE_NONE), ((Integer) fidVar.b.e(-1)).intValue(), (fic) fidVar.c.e(fic.NONE));
    }

    public final aakv c() {
        return this.b.a(this.d.c());
    }
}
