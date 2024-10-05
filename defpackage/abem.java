package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abem extends aaru {
    public String a;
    public String b;
    public String c;
    public int d;

    public abem(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/update_cross_device_offline_state", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        this.d = 1;
        this.b = "";
        this.c = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        asda asdaVar = (asda) a().build();
        zhq.m(asdaVar.d);
        zhq.m(asdaVar.f);
        int J2 = awxr.J(asdaVar.e);
        boolean z = false;
        if (J2 != 0 && J2 != 1) {
            z = true;
        }
        amkq.N(z);
        zhq.m(asdaVar.g);
    }

    @Override // defpackage.aaru
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = asda.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asda asdaVar = (asda) createBuilder.instance;
        str.getClass();
        asdaVar.b |= 2;
        asdaVar.d = str;
        int i = this.d;
        createBuilder.copyOnWrite();
        asda asdaVar2 = (asda) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            asdaVar2.e = i2;
            asdaVar2.b |= 4;
            String str2 = this.b;
            createBuilder.copyOnWrite();
            asda asdaVar3 = (asda) createBuilder.instance;
            str2.getClass();
            asdaVar3.b |= 8;
            asdaVar3.f = str2;
            String str3 = this.c;
            createBuilder.copyOnWrite();
            asda asdaVar4 = (asda) createBuilder.instance;
            str3.getClass();
            asdaVar4.b |= 16;
            asdaVar4.g = str3;
            return createBuilder;
        }
        throw null;
    }
}
