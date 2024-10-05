package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abds extends aasw implements aasm {
    public final aaea a;
    public final abdq b;
    public final zfm c;
    private final abdt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abds(ajoy ajoyVar, ammv ammvVar, azrw azrwVar, aaea aaeaVar, abdt abdtVar, abdq abdqVar, zfm zfmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, (ysl) ammvVar.d(new uqa(azrwVar, 4)), null, null, null);
        azrwVar.getClass();
        this.g = abdtVar;
        this.b = abdqVar;
        this.a = aaeaVar;
        this.c = zfmVar;
    }

    public static aart e(aaea aaeaVar, zfm zfmVar) {
        if (zfmVar == null) {
            return null;
        }
        aars a = aart.a(zfmVar);
        a.a = zxq.d;
        atfr atfrVar = aaeaVar.a().f;
        if (atfrVar == null) {
            atfrVar = atfr.a;
        }
        final awdx awdxVar = atfrVar.l;
        if (awdxVar == null) {
            awdxVar = awdx.a;
        }
        if (awdxVar.b) {
            a.b = zfmVar.b(new zfn(awdxVar.d, awdxVar.e, awdxVar.f, awdxVar.c, awdxVar.g));
            a.b(new ammy() { // from class: abdp
                @Override // defpackage.ammy
                public final boolean a(Object obj) {
                    awdx awdxVar2 = awdx.this;
                    cnq cnqVar = (cnq) obj;
                    if (yny.c(cnqVar)) {
                        return true;
                    }
                    return awdxVar2.h.contains(Integer.valueOf(cnqVar.b.a));
                }
            });
        }
        return a.a();
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.b.k((abdu) aaruVar, aaslVar, afwxVar, e(this.a, this.c));
    }

    public final WatchNextResponseModel d(abdu abduVar) {
        aart e = e(this.a, this.c);
        abdq abdqVar = this.b;
        yjk.e();
        afww f = afww.f();
        abdqVar.f(abduVar, f, e);
        aooy aooyVar = (aooy) ynm.d(f, aard.h);
        abdqVar.l(aooyVar);
        return (WatchNextResponseModel) abdqVar.h(aooyVar);
    }

    @Override // defpackage.aasm
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final abdu a(ajce ajceVar) {
        abdu b = this.g.b();
        b.d = abdu.i(ajceVar.b());
        b.m(ajceVar.d());
        return b;
    }
}
