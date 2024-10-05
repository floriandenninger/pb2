package defpackage;

import android.text.TextUtils;
import android.util.ArrayMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akwd {
    public static final amnm a = amnm.c(":").a();
    private static final amnm e = amnm.c(",").a();
    private static final amnm f = amnm.c("=").a();
    private static final Map g;
    public final String b;
    public final aadw c;
    public final akwg d;
    private final aaea h;

    static {
        ArrayMap arrayMap = new ArrayMap();
        g = arrayMap;
        arrayMap.put("um", akvx.UNKNOWN);
        arrayMap.put("ut", akvy.UNKNOWN);
        arrayMap.put("v", akvz.a);
        arrayMap.put("api", akvv.a);
        arrayMap.put("cf", akvw.UNKNOWN);
    }

    public akwd(aaea aaeaVar, aadw aadwVar, akwg akwgVar, byte[] bArr) {
        this.b = aaec.a(aadwVar).c;
        this.h = aaeaVar;
        this.c = aadwVar;
        this.d = akwgVar;
    }

    public static Set e(String str) {
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            List h = a.h(str);
            if (h.size() >= 4 && ((String) h.get(1)).length() == 36 && ((String) h.get(2)).matches("[0-9]+")) {
                str2 = (String) h.get(3);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return amvs.a;
        }
        HashSet hashSet = new HashSet();
        for (String str3 : e.h(str2)) {
            amnm amnmVar = f;
            List h2 = amnmVar.h(str3);
            if (h2.size() == 2) {
                akvu akvuVar = (akvu) g.get(h2.get(0));
                if (akvuVar != null) {
                    akvu akvuVar2 = null;
                    if (!TextUtils.isEmpty(str3)) {
                        List h3 = amnmVar.h(str3);
                        if (h3.size() == 2 && akvuVar.b().equals(h3.get(0))) {
                            try {
                                akvuVar2 = akvuVar.a(Integer.parseInt((String) h3.get(1)));
                            } catch (NumberFormatException e2) {
                                zga.d("Cannot parse Frontend ID key-value", e2);
                            }
                        }
                    }
                    if (akvuVar2 != null) {
                        hashSet.add(akvuVar2);
                    } else {
                        return amvs.a;
                    }
                } else {
                    return amvs.a;
                }
            } else {
                return amvs.a;
            }
        }
        return hashSet;
    }

    public static boolean f(String str) {
        return e(str).contains(akvv.a);
    }

    public static boolean g(String str) {
        return !e(str).isEmpty();
    }

    private final String h(String str, String str2, int i, boolean z, ammv ammvVar) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(i);
        sb.append(":");
        int i2 = akvz.a.c;
        StringBuilder sb2 = new StringBuilder(13);
        sb2.append("v=");
        sb2.append(i2);
        sb.append(sb2.toString());
        if (z) {
            sb.append(",");
            int i3 = akvv.a.c;
            StringBuilder sb3 = new StringBuilder(15);
            sb3.append("api=");
            sb3.append(i3);
            sb.append(sb3.toString());
        }
        if (ammvVar.h()) {
            avuj avujVar = this.h.a().h;
            if (avujVar == null) {
                avujVar = avuj.a;
            }
            if (avujVar.A) {
                sb.append(",");
                sb.append(akvw.c((avtl) ammvVar.c()));
            }
        }
        return sb.toString();
    }

    private final String i(String str, String str2, int i) {
        return h(str, str2, i, false, amlr.a);
    }

    public final String a(String str, avtl avtlVar, int i) {
        return h(this.b, str, i, true, ammv.j(avtlVar));
    }

    public final String b() {
        return c(yjk.q(), 0);
    }

    public final String c(String str, int i) {
        return i(this.b, str, i);
    }

    public final String d() {
        return i("android_live", yjk.q(), 0);
    }
}
