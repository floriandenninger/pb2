package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akmq {
    public static boolean a;

    public static Uri a(String str) {
        return ajmu.g(3, "connections", str);
    }

    public static final void b(Object obj, auqh auqhVar, akgk akgkVar, akgl akglVar, akgf akgfVar) {
        akgkVar.h.b(akgk.b(auqhVar).bV);
        List c = akgk.c(auqhVar);
        int i = 0;
        while (true) {
            if (i >= c.size()) {
                i = -1;
                break;
            } else if (((auqc) c.get(i)).e.equals(obj.toString())) {
                break;
            } else {
                i++;
            }
        }
        auqc auqcVar = (auqc) c.get(i);
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        aahd aahdVar = akgkVar.d;
        apxf apxfVar = auqcVar.g;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, hashMap);
        if (akgfVar != null) {
            akgfVar.a.n(auqcVar.c);
        }
        int i2 = 0;
        while (i2 < c.size()) {
            akglVar.e((auqc) c.get(i2), i2 == i);
            i2++;
        }
    }

    public static acsx c(akdm akdmVar) {
        if (akdmVar == null || akdmVar.c() == null || !a || Math.random() % 10.0d != 0.0d) {
            return null;
        }
        return akdmVar.c().b(asmn.LATENCY_ACTION_SUGGEST);
    }

    public static void d(String str) {
        e(str, null);
    }

    public static void e(String str, Throwable th) {
        if (a) {
            afsi.c(2, 33, str, th);
        }
    }

    public static void f(aksl akslVar, String str, String str2) {
        if (akslVar == null || !a) {
            return;
        }
        akslVar.c(str, str2);
    }

    public static void g(akdl akdlVar) {
        if (akdlVar == null || akdlVar.ob() == null || !a) {
            return;
        }
        akdlVar.ob().c("ss_rp");
    }
}
