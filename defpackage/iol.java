package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iol extends aaru {
    public String a;
    public boolean b;
    public int c;
    public aone d;

    public iol(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("reel/reel_item_watch", ajoyVar, afsxVar, 1, (byte[]) null, (byte[]) null, (byte[]) null);
        this.c = 1;
        this.b = false;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arsc.a.createBuilder();
        aryo aryoVar = (aryo) this.d.build();
        createBuilder.copyOnWrite();
        arsc arscVar = (arsc) createBuilder.instance;
        aryoVar.getClass();
        arscVar.e = aryoVar;
        arscVar.b |= 4;
        int i = this.c;
        createBuilder.copyOnWrite();
        arsc arscVar2 = (arsc) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            arscVar2.d = i2;
            arscVar2.b |= 2;
            String str = this.a;
            if (str != null) {
                createBuilder.copyOnWrite();
                arsc arscVar3 = (arsc) createBuilder.instance;
                arscVar3.b |= 8;
                arscVar3.f = str;
            }
            boolean z = this.b;
            createBuilder.copyOnWrite();
            arsc arscVar4 = (arsc) createBuilder.instance;
            arscVar4.b |= 16;
            arscVar4.g = z;
            return createBuilder;
        }
        throw null;
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi afpiVar = new afpi();
        afpiVar.c("serviceName", this.m);
        afpiVar.c("identity", this.n.d());
        int i = this.c;
        int i2 = i - 1;
        if (i != 0) {
            afpiVar.b("inputType", i2);
            afpiVar.c("videoId", ((aryo) this.d.instance).d);
            afpiVar.c("playlistId", i(((aryo) this.d.instance).i));
            afpiVar.b("playlistIndex", f(((aryo) this.d.instance).j));
            afpiVar.c("playerParams", i(((aryo) this.d.instance).k));
            afpiVar.c("reelWatchEndpointParams", i(this.a));
            return afpiVar.a();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        aone aoneVar = this.d;
        aoneVar.getClass();
        if (this.c == 3) {
            return;
        }
        boolean z = true;
        if (((aryo) aoneVar.instance).i.isEmpty()) {
            amkq.N(!((aryo) this.d.instance).d.isEmpty());
            return;
        }
        if (((aryo) this.d.instance).d.isEmpty() && ((aryo) this.d.instance).j <= 0) {
            z = false;
        }
        amkq.N(z);
    }
}
