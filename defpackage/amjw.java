package defpackage;

import android.os.Build;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjw {
    public static int f;
    public static amir h;
    static final ammr i = new ammr("tiktok_systrace", (int[]) null);
    public static final WeakHashMap a = new WeakHashMap();
    private static final ThreadLocal j = new amjs();
    public static final Deque b = new ArrayDeque();
    public static final Deque c = new ArrayDeque();
    public static final Object d = new Object();
    public static final Runnable e = ajfg.h;
    public static int g = 0;

    public static amir a() {
        return ((amjv) j.get()).d;
    }

    static amir b() {
        return (amir) c.peek();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amir c() {
        amir a2 = a();
        return a2 == null ? new amia() : a2;
    }

    public static amir d() {
        amir amirVar = h;
        if (amirVar == null) {
            return null;
        }
        h = null;
        return amirVar;
    }

    public static amir e(amir amirVar) {
        return r((amjv) j.get(), amirVar);
    }

    public static amis f() {
        amir b2;
        f++;
        if (g == 0) {
            amjv amjvVar = (amjv) j.get();
            if (amjvVar.d == null && (b2 = b()) != null) {
                r(amjvVar, b2);
                g = f;
            }
        }
        return amjr.b;
    }

    public static String g(amir amirVar) {
        int i2 = 0;
        amir amirVar2 = amirVar;
        while (amirVar2 != null) {
            i2 += amirVar2.b().length();
            amirVar2 = amirVar2.a();
            if (amirVar2 != null) {
                i2 += 4;
            }
        }
        char[] cArr = new char[i2];
        while (amirVar != null) {
            String b2 = amirVar.b();
            i2 -= b2.length();
            b2.getChars(0, b2.length(), cArr, i2);
            amirVar = amirVar.a();
            if (amirVar != null) {
                i2 -= 4;
                " -> ".getChars(0, 4, cArr, i2);
            }
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map h() {
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = a;
        synchronized (weakHashMap) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                amir amirVar = ((amjv) entry.getValue()).d;
                if (amirVar != null) {
                    hashMap.put((Thread) entry.getKey(), amirVar);
                }
            }
        }
        return hashMap;
    }

    public static void i(amir amirVar) {
        amirVar.getClass();
        amjv amjvVar = (amjv) j.get();
        amir amirVar2 = amjvVar.d;
        amkq.T(amirVar == amirVar2, "Wrong trace, expected %s but got %s", amirVar2.b(), amirVar.b());
        r(amjvVar, amirVar2.a());
    }

    public static void j() {
        int i2 = f;
        int i3 = i2 - 1;
        f = i3;
        if (i3 < 0) {
            throw new IllegalStateException("More calls to pause than to resume");
        }
        if (g == i2) {
            amkq.O(!c.isEmpty(), "current async trace should not be null");
            e(null);
            g = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(amir amirVar, String str) {
        if (amirVar instanceof amht) {
            String g2 = g(amirVar);
            if (!"".equals(g2)) {
                g2 = g2.length() != 0 ? ": ".concat(g2) : new String(": ");
            }
            amhr amhrVar = new amhr(g2, str, ((amht) amirVar).e());
            amjq.c();
            throw amhrVar;
        }
        amhr amhrVar2 = new amhr(str);
        amjq.c();
        throw amhrVar2;
    }

    public static amil l(String str) {
        return m(str, amio.a);
    }

    public static amil m(String str, amip amipVar) {
        return n(str, amipVar, true);
    }

    public static amil n(String str, amip amipVar, boolean z) {
        amir f2;
        amir a2 = a();
        if (a2 == null) {
            f2 = new amib(str, amipVar, z);
        } else if (a2 instanceof amht) {
            f2 = ((amht) a2).d(str, amipVar, z);
        } else {
            f2 = a2.f(str, amipVar);
        }
        e(f2);
        return new amil(f2);
    }

    public static boolean o() {
        return a() != null;
    }

    public static amis p() {
        amjv amjvVar = (amjv) j.get();
        if (!amjvVar.a) {
            return amjr.a;
        }
        amij amijVar = amjvVar.d;
        if (amijVar == null) {
            amijVar = new amia();
        }
        b.add(amijVar);
        uqq.l(e);
        return amjr.c;
    }

    public static boolean q() {
        amir b2;
        amir b3 = b();
        if (b3 == null || (b3 instanceof amht)) {
            return false;
        }
        f++;
        if (g == 0) {
            amjv amjvVar = (amjv) j.get();
            if (amjvVar.d == null && (b2 = b()) != null) {
                r(amjvVar, b2);
                g = f;
            }
        }
        return true;
    }

    private static amir r(amjv amjvVar, amir amirVar) {
        boolean s;
        amir amirVar2 = amjvVar.d;
        if (amirVar2 == amirVar) {
            return amirVar;
        }
        if (amirVar2 == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                s = amjt.a();
            } else {
                s = uqq.s(i);
            }
            amjvVar.c = s;
        }
        if (amjvVar.c) {
            v(amirVar2, amirVar);
        }
        amjvVar.d = amirVar;
        amju amjuVar = amjvVar.b;
        return amirVar2;
    }

    private static void s(String str) {
        if (str.length() > 127) {
            str.substring(0, 127);
        }
    }

    private static void t(amir amirVar) {
        if (amirVar.a() != null) {
            t(amirVar.a());
        }
        s(amirVar.b());
    }

    private static void u(amir amirVar) {
        if (amirVar.a() != null) {
            u(amirVar.a());
        }
    }

    private static void v(amir amirVar, amir amirVar2) {
        if (amirVar != null) {
            if (amirVar2 != null) {
                if (amirVar.a() == amirVar2) {
                    return;
                }
                if (amirVar == amirVar2.a()) {
                    s(amirVar2.b());
                    return;
                }
            }
            u(amirVar);
        }
        if (amirVar2 != null) {
            t(amirVar2);
        }
    }
}
