package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anyi {
    private static final Object a = new Object();
    private static anzv b;

    public static rpt a(Context context, Intent intent) {
        anzv anzvVar;
        synchronized (a) {
            if (b == null) {
                b = new anzv(context);
            }
            anzvVar = b;
        }
        return anzvVar.a(intent).b(qmq.j, qxc.e);
    }

    public static final rpt b(final Intent intent, final Context context, Executor executor) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (oba.aa() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (!z || flags != 0) {
            return rqr.a(executor, new Callable() { // from class: anyh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i;
                    Context context2 = context;
                    Intent intent2 = intent;
                    anzc a2 = anzc.a();
                    a2.c.offer(intent2);
                    Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                    intent3.setPackage(context2.getPackageName());
                    String b2 = a2.b(context2, intent3);
                    if (b2 != null) {
                        intent3.setClassName(context2.getPackageName(), b2);
                    }
                    try {
                        ComponentName componentName = null;
                        if (a2.c(context2)) {
                            synchronized (anzp.b) {
                                if (anzp.c == null) {
                                    anzp.c = new row(context2);
                                    row rowVar = anzp.c;
                                    synchronized (rowVar.b) {
                                        rowVar.g = true;
                                    }
                                }
                                boolean b3 = anzp.b(intent3);
                                anzp.a(intent3, true);
                                ComponentName startService = context2.startService(intent3);
                                if (startService != null) {
                                    if (!b3) {
                                        final row rowVar2 = anzp.c;
                                        long j = anzp.a;
                                        rowVar2.m.incrementAndGet();
                                        String str = rowVar2.k;
                                        rqr rqrVar = row.p;
                                        long max = Math.max(Math.min(Long.MAX_VALUE, row.a), 1L);
                                        if (j > 0) {
                                            max = Math.min(j, max);
                                        }
                                        synchronized (rowVar2.b) {
                                            if (!rowVar2.b()) {
                                                rqr rqrVar2 = row.p;
                                                rqr rqrVar3 = row.p;
                                                rowVar2.i = rah.a;
                                                rowVar2.c.acquire();
                                                qtl qtlVar = rowVar2.o;
                                                SystemClock.elapsedRealtime();
                                            }
                                            rowVar2.d++;
                                            rowVar2.h++;
                                            rowVar2.c();
                                            ajbh ajbhVar = (ajbh) rowVar2.l.get(null);
                                            if (ajbhVar == null) {
                                                ajbhVar = new ajbh((byte[]) null, (char[]) null);
                                                rowVar2.l.put(null, ajbhVar);
                                            }
                                            rqr rqrVar4 = row.p;
                                            String str2 = rowVar2.j;
                                            ajbhVar.i++;
                                            qtl qtlVar2 = rowVar2.o;
                                            long elapsedRealtime = SystemClock.elapsedRealtime();
                                            long j2 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                                            if (j2 > rowVar2.f) {
                                                rowVar2.f = j2;
                                                Future future = rowVar2.e;
                                                if (future != null) {
                                                    future.cancel(false);
                                                }
                                                rowVar2.e = rowVar2.n.schedule(new Runnable() { // from class: rov
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        row rowVar3 = row.this;
                                                        synchronized (rowVar3.b) {
                                                            if (rowVar3.b()) {
                                                                Log.e("WakeLock", rowVar3.j.concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                                                                rowVar3.a();
                                                                if (rowVar3.b()) {
                                                                    rowVar3.d = 1;
                                                                    rowVar3.d();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }, max, TimeUnit.MILLISECONDS);
                                            }
                                        }
                                    }
                                    componentName = startService;
                                }
                            }
                        } else {
                            componentName = context2.startService(intent3);
                        }
                        if (componentName == null) {
                            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                            i = 404;
                        } else {
                            i = -1;
                        }
                    } catch (IllegalStateException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                        sb.append("Failed to start service while in background: ");
                        sb.append(valueOf);
                        Log.e("FirebaseMessaging", sb.toString());
                        i = 402;
                    } catch (SecurityException e2) {
                        Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                        i = 401;
                    }
                    return Integer.valueOf(i);
                }
            }).c(executor, new rox() { // from class: anyg
                @Override // defpackage.rox
                public final Object a(rpt rptVar) {
                    return (oba.aa() && ((Integer) rptVar.g()).intValue() == 402) ? anyi.a(context, intent).b(qmq.j, qxc.f) : rptVar;
                }
            });
        }
        return a(context, intent);
    }
}
