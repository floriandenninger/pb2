package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afqj {
    public afqt a = new afqt() { // from class: afqg
        @Override // defpackage.afqt
        public final afqu a() {
            return null;
        }
    };
    private final Map b;

    public afqj(String str, String str2, afqh afqhVar, afqi afqiVar, ammv ammvVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("cplatform", afqhVar.i);
        hashMap.put("c", afqiVar.q);
        zhq.m(str2);
        hashMap.put("cver", str2);
        hashMap.put("cos", "Android");
        hashMap.put("cosver", Build.VERSION.RELEASE);
        hashMap.put("csdk", Integer.toString("REL".equals(Build.VERSION.CODENAME) ? Build.VERSION.SDK_INT : Build.VERSION.SDK_INT + 1));
        zhq.m(str);
        hashMap.put("cbr", str);
        hashMap.put("cbrver", str2);
        hashMap.put("cbrand", Build.MANUFACTURER);
        hashMap.put("cmodel", (String) ammvVar.e(Build.MODEL));
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public final Map a() {
        afqu a = this.a.a();
        if (a == null) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("cplayer", a.name());
    }

    public final Map b() {
        Map map = this.b;
        Map a = a();
        if (a.isEmpty()) {
            return map;
        }
        HashMap hashMap = new HashMap(map.size() + a.size());
        hashMap.putAll(map);
        hashMap.putAll(a);
        return hashMap;
    }

    public final void c(zhy zhyVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            zhyVar.h((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void d(zhy zhyVar) {
        for (Map.Entry entry : b().entrySet()) {
            zhyVar.h((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
