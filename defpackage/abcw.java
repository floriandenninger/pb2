package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcw implements aaha {
    public static final /* synthetic */ int a = 0;
    private final akpe b;

    public abcw(akpe akpeVar, byte[] bArr) {
        this.b = akpeVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        String str = (String) yjj.u(map, "com.google.android.libraries.youtube.innertube.services.social.query", String.class);
        afwx afwxVar = (afwx) yjj.u(map, "com.google.android.libraries.youtube.innertube.services.social.listener", afwx.class);
        if (str == null || afwxVar == null) {
            return;
        }
        byte[] I = whl.G(apxfVar).I();
        akpe akpeVar = this.b;
        ynm.k(akpeVar.c.b(new abcx(akpeVar, str, I, null), akpeVar.b), angq.a, new izp(afwxVar, 4), new izq(afwxVar, 4));
    }
}
