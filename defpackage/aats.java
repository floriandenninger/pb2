package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aats extends aaru {
    public String A;
    public String a;
    public String b;
    public String c;
    public long d;
    public long s;
    public int t;
    public long u;
    public long v;
    public int w;
    public int x;
    public int y;
    public int z;

    public aats(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("player/ad_break", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = -2L;
        this.s = -1L;
        this.t = -1;
        this.u = -1L;
        this.v = -1L;
        this.w = -1;
        this.x = -1;
        this.y = 0;
        this.z = 0;
        this.A = "";
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arir.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arir arirVar = (arir) createBuilder.instance;
        str.getClass();
        arirVar.b |= 4;
        arirVar.d = str;
        long j = this.d;
        createBuilder.copyOnWrite();
        arir arirVar2 = (arir) createBuilder.instance;
        arirVar2.b |= 8;
        arirVar2.e = j;
        int i = this.t;
        createBuilder.copyOnWrite();
        arir arirVar3 = (arir) createBuilder.instance;
        arirVar3.b |= 16;
        arirVar3.f = i;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        arir arirVar4 = (arir) createBuilder.instance;
        str2.getClass();
        arirVar4.b |= 64;
        arirVar4.h = str2;
        long j2 = this.u;
        if (j2 >= 0) {
            createBuilder.copyOnWrite();
            arir arirVar5 = (arir) createBuilder.instance;
            arirVar5.b |= 2097152;
            arirVar5.k = j2;
        }
        if (!this.c.equals("")) {
            String str3 = this.c;
            createBuilder.copyOnWrite();
            arir arirVar6 = (arir) createBuilder.instance;
            str3.getClass();
            arirVar6.b |= 32768;
            arirVar6.i = str3;
        }
        long j3 = this.s;
        if (j3 >= 0) {
            createBuilder.copyOnWrite();
            arir arirVar7 = (arir) createBuilder.instance;
            arirVar7.b |= 65536;
            arirVar7.j = j3;
        }
        aone createBuilder2 = atws.a.createBuilder();
        String str4 = this.A;
        createBuilder2.copyOnWrite();
        atws atwsVar = (atws) createBuilder2.instance;
        str4.getClass();
        atwsVar.b |= 16384;
        atwsVar.p = str4;
        long j4 = this.v;
        createBuilder2.copyOnWrite();
        atws atwsVar2 = (atws) createBuilder2.instance;
        atwsVar2.b |= 8;
        atwsVar2.f = j4;
        int i2 = this.w;
        createBuilder2.copyOnWrite();
        atws atwsVar3 = (atws) createBuilder2.instance;
        atwsVar3.b |= 4;
        atwsVar3.e = i2;
        int i3 = this.x;
        if (i3 != -1) {
            createBuilder2.copyOnWrite();
            atws atwsVar4 = (atws) createBuilder2.instance;
            atwsVar4.b |= 64;
            atwsVar4.i = i3;
        }
        int i4 = this.y;
        createBuilder2.copyOnWrite();
        atws atwsVar5 = (atws) createBuilder2.instance;
        atwsVar5.b |= 32;
        atwsVar5.h = i4;
        int i5 = this.z;
        createBuilder2.copyOnWrite();
        atws atwsVar6 = (atws) createBuilder2.instance;
        atwsVar6.b |= 16;
        atwsVar6.g = i5;
        aone createBuilder3 = atwv.a.createBuilder();
        createBuilder3.copyOnWrite();
        atwv atwvVar = (atwv) createBuilder3.instance;
        atws atwsVar7 = (atws) createBuilder2.build();
        atwsVar7.getClass();
        atwvVar.c = atwsVar7;
        atwvVar.b |= 1;
        createBuilder.copyOnWrite();
        arir arirVar8 = (arir) createBuilder.instance;
        atwv atwvVar2 = (atwv) createBuilder3.build();
        atwvVar2.getClass();
        arirVar8.g = atwvVar2;
        arirVar8.b |= 32;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(!"".equals(this.a));
        amkq.N(!"".equals(this.b));
        amkq.N(this.t != -1);
        amkq.N(this.w != -1);
        amkq.N(this.x != -1);
        amkq.N(true);
        amkq.N(this.z != -1);
        amkq.N(!"".equals(this.A));
    }
}
