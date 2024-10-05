package defpackage;

import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdz extends aaru {
    public String a;
    private String b;

    public abdz(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/get_offers", ajoyVar, afsxVar, null, null, null);
        this.b = "";
        this.a = "";
        s(3);
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi g = g();
        g.c("itemParams", this.b);
        String str = this.a;
        if (str != null) {
            g.c("couponCode", str);
        }
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(((asfz) a().build()).d);
    }

    public final void d(YpcOffersEndpoint$YPCOffersEndpoint ypcOffersEndpoint$YPCOffersEndpoint) {
        ypcOffersEndpoint$YPCOffersEndpoint.getClass();
        this.b = i(ypcOffersEndpoint$YPCOffersEndpoint.b);
    }

    @Override // defpackage.aaru
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = asfz.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        asfz asfzVar = (asfz) createBuilder.instance;
        str.getClass();
        asfzVar.b |= 2;
        asfzVar.d = str;
        String str2 = this.a;
        createBuilder.copyOnWrite();
        asfz asfzVar2 = (asfz) createBuilder.instance;
        str2.getClass();
        asfzVar2.b |= 4;
        asfzVar2.e = str2;
        return createBuilder;
    }
}
