package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhv implements adht {
    public static final String a;
    private final yrw b;
    private final adhz c;
    private final int d;

    static {
        String valueOf = String.valueOf(adhv.class.getCanonicalName());
        a = zga.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public adhv(yrw yrwVar, adhz adhzVar, acun acunVar) {
        this.b = yrwVar;
        this.c = adhzVar;
        this.d = Math.max(1, acunVar.P + 1);
    }

    @Override // defpackage.adht
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return b((Collection) obj, 4);
    }

    public final Map b(Collection collection, int i) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyMap();
        }
        for (int i2 = 0; i2 < this.d; i2++) {
            ysj c = ysk.c(String.valueOf(this.c.a()).concat("get_lounge_token_batch"));
            try {
                c.b = ysi.d(Collections.singletonMap("screen_ids", TextUtils.join(",", collection)), "ISO-8859-1");
            } catch (UnsupportedEncodingException unused) {
            }
            ysk a2 = c.a();
            adhu adhuVar = new adhu(a2.a, i);
            adyu.w(this.b, a2, adhuVar);
            Map map = adhuVar.a;
            if (map != null) {
                return map;
            }
        }
        return null;
    }
}
