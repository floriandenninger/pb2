package defpackage;

import android.util.Log;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afsi {
    private static afsm a;
    private static Queue b = new ArrayBlockingQueue(10);

    public static void a(afsm afsmVar) {
        afsmVar.getClass();
        a = afsmVar;
        Queue queue = b;
        if (queue != null) {
            for (afsh afshVar = (afsh) queue.poll(); afshVar != null; afshVar = (afsh) b.poll()) {
                Throwable th = afshVar.b;
                if (th != null) {
                    c(afshVar.c, afshVar.d, afshVar.a, th);
                } else {
                    final int i = afshVar.c;
                    final int i2 = afshVar.d;
                    final String str = afshVar.a;
                    final afsm afsmVar2 = a;
                    if (afsmVar2 == null) {
                        Queue queue2 = b;
                        if (queue2 != null && !queue2.offer(new afsh(i, i2, str))) {
                            zga.l(String.format("ECatcher log not initialized: level: %s, category: %s, message: %s", adyu.B(i), adyu.C(i2), str));
                        }
                    } else if (!afsmVar2.e) {
                        zga.l(String.format("ECatcher disabled: level: %s, category: %s, message: %s", adyu.B(i), adyu.C(i2), str));
                    } else {
                        afsmVar2.a.execute(new Runnable() { // from class: afsj
                            @Override // java.lang.Runnable
                            public final void run() {
                                afsm afsmVar3 = afsm.this;
                                int i3 = i;
                                int i4 = i2;
                                String str2 = str;
                                if (afsmVar3.d.h()) {
                                    ((acpk) afsmVar3.d.c()).d(afsmVar3.j(i3, i4, str2, null));
                                }
                                Map e = afsmVar3.e(str2);
                                zhy i5 = afsmVar3.i(i3, i4, null);
                                e.put("stacktrace.c++", null);
                                e.put("stacktrace.java", "");
                                afsmVar3.h(i5, e);
                            }
                        });
                    }
                }
            }
        }
        b = null;
    }

    public static void b(int i, int i2, String str) {
        c(i, i2, str, new Exception());
    }

    public static void c(final int i, final int i2, final String str, final Throwable th) {
        final afsm afsmVar = a;
        if (afsmVar != null) {
            if (!afsmVar.e) {
                zga.n(String.format("ECatcher disabled: level: %s, category: %s, message: %s", adyu.B(i), adyu.C(i2), str), th);
                return;
            } else {
                afsmVar.a.execute(new Runnable() { // from class: afsk
                    @Override // java.lang.Runnable
                    public final void run() {
                        afsm afsmVar2 = afsm.this;
                        int i3 = i;
                        int i4 = i2;
                        String str2 = str;
                        Throwable th2 = th;
                        if (afsmVar2.d.h()) {
                            ((acpk) afsmVar2.d.c()).d(afsmVar2.j(i3, i4, str2, th2));
                        }
                        if (afsmVar2.f) {
                            ((acpk) afsmVar2.c.get()).d(afsmVar2.j(i3, i4, str2, th2));
                            return;
                        }
                        String stackTraceString = Log.getStackTraceString(th2);
                        Map e = afsmVar2.e(str2);
                        zhy i5 = afsmVar2.i(i3, i4, th2.getClass().getCanonicalName());
                        e.put("stacktrace.java", stackTraceString);
                        afsmVar2.h(i5, e);
                    }
                });
                return;
            }
        }
        Queue queue = b;
        if (queue == null || queue.offer(new afsh(i, i2, str, th))) {
            return;
        }
        zga.n(String.format("ECatcher log not initialized: level: %s, category: %s, message: %s", adyu.B(i), adyu.C(i2), str), th);
    }

    public static boolean d(int i, int i2, String str, Exception exc, double d) {
        if (Math.random() >= d) {
            return false;
        }
        c(i, i2, str, exc);
        return true;
    }

    public static void e(int i, int i2, String str, double d) {
        if (Math.random() < d) {
            b(i, i2, str);
        }
    }

    public static void f(String str, Map map) {
        afsm afsmVar = a;
        if (afsmVar != null) {
            afsmVar.b = map;
        }
        b(2, 12, str);
    }
}
