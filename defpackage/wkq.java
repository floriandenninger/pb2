package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkq implements aaha {
    private final aaxn a;

    public wkq(aaxn aaxnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        aaxnVar.getClass();
        this.a = aaxnVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aaxn aaxnVar = this.a;
        aatn aatnVar = new aatn(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        aatm aatmVar = (aatm) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aatm.class);
        arzs arzsVar = (arzs) yjj.u(map, "KEY_CODE_DELIVERY_METHOD", arzs.class);
        if (arzsVar == null) {
            arzsVar = arzs.CODE_DELIVERY_METHOD_UNKNOWN;
        }
        aatnVar.b = (String) yjj.u(map, "KEY_PHONE_NUMBER", String.class);
        aatnVar.c = (String) yjj.u(map, "KEY_COUNTRY_CODE", String.class);
        aatnVar.a = arzsVar;
        this.a.b.e(aatnVar, new aatl(aatmVar));
    }
}
