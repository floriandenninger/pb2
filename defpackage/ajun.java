package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajun {
    public final Map a;

    public ajun(Map map) {
        this.a = map;
    }

    public ajun(Map map, char[] cArr) {
        this.a = map;
    }

    public ajun(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = DesugarCollections.synchronizedMap(new HashMap());
    }

    private final synchronized boolean D(auwg auwgVar) {
        Boolean bool;
        bool = (Boolean) this.a.get(auwgVar);
        return bool == null ? auwgVar.g : bool.booleanValue();
    }

    public static String n(apxf apxfVar) {
        if (apxfVar.c.d() > 0) {
            return apxfVar.c.D(Charset.defaultCharset());
        }
        if (!apxfVar.pY(atmb.b)) {
            return null;
        }
        atmc atmcVar = (atmc) apxfVar.pX(atmb.b);
        if ((atmcVar.b & 2) == 0) {
            return null;
        }
        int i = atmcVar.e;
        int i2 = atmcVar.d;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i2);
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    public final saw A(sax saxVar) {
        return (saw) this.a.get(saxVar);
    }

    public final Object B(Object obj) {
        return this.a.get(obj);
    }

    public final wbs C(String str) {
        return (wbs) this.a.get(str);
    }

    public final arev a(arev arevVar) {
        return this.a.containsKey(arevVar) ? (arev) this.a.get(arevVar) : arevVar;
    }

    public final List b(arev arevVar) {
        return a(arevVar).d;
    }

    public final Long c() {
        return e("x-head-seqnum");
    }

    public final Long d() {
        String g = g("x-head-time-millis");
        if (g != null) {
            try {
                return Long.valueOf(TimeUnit.MILLISECONDS.toMicros(Long.parseLong(g)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final Long e(String str) {
        String g = g(str);
        if (g != null) {
            try {
                return Long.valueOf(Long.parseLong(g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final Long f() {
        return e("x-segment-lmt");
    }

    public final String g(String str) {
        List list = (List) this.a.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public final Set h() {
        return this.a.entrySet();
    }

    public final void i(String str, String str2) {
        List list = (List) this.a.get(str);
        if (list == null) {
            this.a.put(str, amkq.aR(str2));
        } else {
            list.clear();
            list.add(str2);
        }
    }

    public final void j(String str, String str2) {
        List list = (List) this.a.get(str);
        if (list == null) {
            this.a.put(str, amkq.aR(str2));
        } else {
            list.add(str2);
        }
    }

    public final void k(String str, String str2) {
        if (this.a.containsKey(str)) {
            return;
        }
        j(str, str2);
    }

    public final void l(aooy aooyVar) {
        this.a.put(aooyVar, true);
    }

    public final boolean m(aooy aooyVar) {
        return this.a.containsKey(aooyVar);
    }

    public final synchronized void o() {
        this.a.clear();
    }

    public final synchronized void p(auwg auwgVar, boolean z) {
        this.a.put(auwgVar, Boolean.valueOf(z));
    }

    public final synchronized boolean q(auwg auwgVar) {
        return D(auwgVar);
    }

    public final apmg r(aqab aqabVar) {
        apmg apmgVar = (apmg) this.a.get(aqabVar);
        if (apmgVar != null) {
            return apmgVar;
        }
        apmh apmhVar = aqabVar.c;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            return null;
        }
        apmh apmhVar2 = aqabVar.c;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar2 = apmhVar2.c;
        return apmgVar2 == null ? apmg.a : apmgVar2;
    }

    public final void s(aqab aqabVar, apmg apmgVar) {
        this.a.put(aqabVar, apmgVar);
    }

    public final boolean t(aqab aqabVar) {
        if (!this.a.containsKey(aqabVar)) {
            apmh apmhVar = aqabVar.c;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((apmhVar.b & 1) == 0) {
                return false;
            }
        }
        return true;
    }

    public final xgv u(String str) {
        return (xgv) this.a.get(str);
    }

    public final xgv v(String str) {
        return (xgv) this.a.remove(str);
    }

    public final List w() {
        try {
            Collection values = this.a.values();
            ArrayList arrayList = new ArrayList(values.size());
            arrayList.addAll(values);
            return arrayList;
        } catch (RuntimeException e) {
            boolean z = Looper.myLooper() == Looper.getMainLooper();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 81);
            sb.append("[Control flow] failed to grab registered triggers. Is main thread? ");
            sb.append(z);
            sb.append(", error: ");
            sb.append(message);
            afsi.b(2, 1, sb.toString());
            return new ArrayList();
        }
    }

    public final void x(String str, xgv xgvVar) {
        this.a.put(str, xgvVar);
    }

    public final boolean y(String str) {
        return this.a.containsKey(str);
    }

    public final String z(Uri uri, String str, String str2) {
        if (uri == null) {
            return null;
        }
        Map map = (Map) this.a.get(uri.toString());
        if (map == null) {
            return null;
        }
        if (str != null) {
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        return (String) map.get(str2);
    }

    public ajun(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new WeakHashMap();
    }

    public ajun(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public ajun(short[] sArr, byte[] bArr) {
        this.a = rwh.t();
    }

    public ajun(char[] cArr, byte[] bArr) {
        this.a = rwh.t();
    }

    public ajun(byte[] bArr, short[] sArr) {
        this.a = new HashMap();
    }

    public ajun(short[] sArr) {
        this.a = new HashMap();
    }

    public ajun(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = DesugarCollections.synchronizedMap(new IdentityHashMap());
    }

    public ajun(byte[] bArr, char[] cArr) {
        this.a = new IdentityHashMap();
    }

    public ajun(Map map, byte[] bArr) {
        this.a = Collections.unmodifiableMap(map);
    }

    public ajun(char[] cArr) {
        this.a = new ConcurrentHashMap();
    }

    public ajun(byte[] bArr, byte[] bArr2) {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public ajun(byte[] bArr) {
        this.a = new HashMap();
    }

    public ajun() {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }
}
