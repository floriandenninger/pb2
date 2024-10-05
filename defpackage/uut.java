package defpackage;

import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uut {
    private static final amnm d = amnm.b('/').a();
    static final uus a = new uur(1);
    static final uus b = new uur(0);
    static final uus c = new uur(2);

    public static List a(String str) {
        return amkq.aU(d.h(str), tur.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(uus uusVar, aoox aooxVar) {
        String a2 = uusVar.a(aooxVar);
        String b2 = uusVar.b(aooxVar);
        if (!TextUtils.isEmpty(a2) || TextUtils.isEmpty(b2)) {
            uusVar.c(aooxVar, null);
        } else {
            uusVar.c(aooxVar, anrs.a(b2));
        }
        uusVar.d(aooxVar);
    }
}
