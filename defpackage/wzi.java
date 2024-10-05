package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzi implements actc {
    private final aifw a;
    private final ahcc b;
    private final amnv c;
    private final /* synthetic */ int d;

    public wzi(aifw aifwVar, afhz afhzVar, amnv amnvVar, int i, byte[] bArr) {
        this.d = i;
        this.a = aifwVar;
        ahcc ahccVar = new ahcc();
        this.b = ahccVar;
        this.c = amnvVar;
        afhzVar.d(ahccVar);
    }

    public wzi(aifw aifwVar, afhz afhzVar, amnv amnvVar, int i) {
        this.d = i;
        this.a = aifwVar;
        ahcc ahccVar = new ahcc();
        this.b = ahccVar;
        this.c = amnvVar;
        afhzVar.d(ahccVar);
    }

    public wzi(aifw aifwVar, afhz afhzVar, amnv amnvVar, int i, char[] cArr) {
        this.d = i;
        this.a = aifwVar;
        ahcc ahccVar = new ahcc();
        this.b = ahccVar;
        this.c = amnvVar;
        afhzVar.d(ahccVar);
    }

    public wzi(aifw aifwVar, afhz afhzVar, amnv amnvVar, int i, short[] sArr) {
        this.d = i;
        this.a = aifwVar;
        ahcc ahccVar = new ahcc();
        this.b = ahccVar;
        this.c = amnvVar;
        afhzVar.d(ahccVar);
    }

    @Override // defpackage.actc
    public final actb a(actg actgVar) {
        int i = this.d;
        if (i == 0) {
            this.b.f();
            return new wzj(this.b, actgVar.a().a(), this.a.d().d(), actgVar.e().t(), ((fdb) this.c).a);
        }
        if (i == 1) {
            this.b.f();
            return new wzg(this.b, actgVar.a().a(), this.a.d().d(), actgVar.e().t(), ((fdb) this.c).a);
        }
        if (i == 2) {
            this.b.f();
            return new wzk(this.b, actgVar.a().a(), this.a.d().d(), actgVar.e().t(), ((fdb) this.c).a);
        }
        this.b.f();
        return new ahcf(actgVar.a().a(), this.a.d().d(), actgVar.e().t(), this.b, ((fdb) this.c).a);
    }
}
