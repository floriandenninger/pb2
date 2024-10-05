package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adid implements adht {
    public static final String a;
    private final yrw b;
    private final adhz c;

    static {
        String valueOf = String.valueOf(adid.class.getCanonicalName());
        a = zga.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public adid(yrw yrwVar, adhz adhzVar) {
        this.b = yrwVar;
        this.c = adhzVar;
    }

    @Override // defpackage.adht
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return b((adgn) obj, 4);
    }

    public final adfw b(adgn adgnVar, int i) {
        if (adgnVar == null) {
            return null;
        }
        ysj c = ysk.c(String.valueOf(this.c.a()).concat("get_screen"));
        try {
            c.b = ysi.d(Collections.singletonMap("pairing_code", adgnVar.c), "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
        }
        ysk a2 = c.a();
        adic adicVar = new adic(a2.a, i);
        adyu.w(this.b, a2, adicVar);
        return adicVar.a;
    }
}
