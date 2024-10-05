package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijl extends aaru {
    public ammv a;
    public ammv b;

    public aijl(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("get_watch", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        this.a = amlr.a;
        this.b = amlr.a;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asbl.a.createBuilder();
        if (this.a.h()) {
            aryo aryoVar = (aryo) ((aijr) this.a.c()).a().build();
            createBuilder.copyOnWrite();
            asbl asblVar = (asbl) createBuilder.instance;
            aryoVar.getClass();
            asblVar.d = aryoVar;
            asblVar.b |= 2;
        }
        if (this.b.h()) {
            asfb asfbVar = (asfb) ((abdu) this.b.c()).a().build();
            createBuilder.copyOnWrite();
            asbl asblVar2 = (asbl) createBuilder.instance;
            asfbVar.getClass();
            asblVar2.e = asfbVar;
            asblVar2.b |= 4;
        }
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi g = g();
        if (this.a.h()) {
            g.c("playerRequest", ((aijr) this.a.c()).b());
        }
        if (this.b.h()) {
            g.c("watchNextRequest", ((abdu) this.b.c()).b());
        }
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        boolean z = true;
        if (!this.a.h() && !this.b.h()) {
            z = false;
        }
        amkq.N(z);
    }
}
