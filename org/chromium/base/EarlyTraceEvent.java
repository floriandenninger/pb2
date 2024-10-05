package org.chromium.base;

import J.N;
import android.os.SystemClock;
import defpackage.badq;
import defpackage.badr;
import defpackage.bads;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EarlyTraceEvent {
    static volatile int a;
    static List b;
    static List c;
    private static boolean d;
    private static final Object e = new Object();

    public static void a(String str, boolean z) {
        if (d()) {
            bads badsVar = new bads(str, true, z);
            synchronized (e) {
                if (d()) {
                    b.add(badsVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        synchronized (e) {
            if (d()) {
                if (!b.isEmpty()) {
                    g(b);
                    b.clear();
                }
                if (!c.isEmpty()) {
                    f(c);
                    c.clear();
                }
                a = 2;
                b = null;
                c = null;
            }
        }
    }

    public static void c(String str, boolean z) {
        if (d()) {
            bads badsVar = new bads(str, false, z);
            synchronized (e) {
                if (d()) {
                    b.add(badsVar);
                }
            }
        }
    }

    public static boolean d() {
        return a == 1;
    }

    private static long e() {
        return (N.MklbOJun() * 1000) - SystemClock.elapsedRealtimeNanos();
    }

    private static void f(List list) {
        long e2 = e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            badr badrVar = (badr) it.next();
            if (badrVar.a) {
                N.M_Gv8TwM(badrVar.b, badrVar.c, badrVar.d + e2);
            } else {
                N.MrKsqeCD(badrVar.b, badrVar.c, badrVar.d + e2);
            }
        }
    }

    private static void g(List list) {
        long e2 = e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bads badsVar = (bads) it.next();
            if (badsVar.a) {
                if (badsVar.b) {
                    N.M7UXCmoq(badsVar.c, badsVar.e + e2, badsVar.d, badsVar.f);
                } else {
                    N.MrWG2uUW(badsVar.c, badsVar.e + e2, badsVar.d, badsVar.f);
                }
            } else if (badsVar.b) {
                N.MRlw2LEn(badsVar.c, badsVar.e + e2, badsVar.d, badsVar.f);
            } else {
                N.MmyrhqXB(badsVar.c, badsVar.e + e2, badsVar.d, badsVar.f);
            }
        }
    }

    public static boolean getBackgroundStartupTracingFlag() {
        return d;
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        badq.a.edit().putBoolean("bg_startup_tracing", z).apply();
    }
}
