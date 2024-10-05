package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aayc extends aaru {
    public asnp a;
    public String b;

    public aayc(String str, ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(str, ajoyVar, afsxVar, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(this.a.d.isEmpty() != this.a.c.isEmpty());
    }

    public final void d(apxf apxfVar) {
        amkq.E(apxfVar.pY(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint));
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) apxfVar.pX(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        if (!apxfVar.c.H()) {
            l(apxfVar.c);
        } else {
            k();
        }
        if ((likeEndpointOuterClass$LikeEndpoint.b & 2) != 0) {
            asnp asnpVar = likeEndpointOuterClass$LikeEndpoint.f;
            if (asnpVar == null) {
                asnpVar = asnp.a;
            }
            this.a = asnpVar;
        }
        int i = likeEndpointOuterClass$LikeEndpoint.c;
        int i2 = i != 0 ? i != 6 ? i != 7 ? i != 8 ? 0 : 3 : 2 : 1 : 4;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            this.b = i == 6 ? (String) likeEndpointOuterClass$LikeEndpoint.d : "";
        } else if (i3 == 1) {
            this.b = i == 7 ? (String) likeEndpointOuterClass$LikeEndpoint.d : "";
        } else {
            if (i3 != 2) {
                return;
            }
            this.b = i == 8 ? (String) likeEndpointOuterClass$LikeEndpoint.d : "";
        }
    }

    public final void e(asnp asnpVar) {
        asnpVar.getClass();
        this.a = asnpVar;
    }

    public final void v(String str) {
        aone createBuilder = asnp.a.createBuilder();
        createBuilder.copyOnWrite();
        asnp asnpVar = (asnp) createBuilder.instance;
        asnpVar.b |= 2;
        asnpVar.d = str;
        this.a = (asnp) createBuilder.build();
    }

    public final void w(String str) {
        aone createBuilder = asnp.a.createBuilder();
        createBuilder.copyOnWrite();
        asnp asnpVar = (asnp) createBuilder.instance;
        asnpVar.b |= 1;
        asnpVar.c = str;
        this.a = (asnp) createBuilder.build();
    }
}
