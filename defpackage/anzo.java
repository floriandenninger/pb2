package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anzo implements Runnable {
    private static final Object c = new Object();
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final anzm b;
    private final anyw f;
    private final PowerManager.WakeLock g;
    private final long h;

    public anzo(anzm anzmVar, Context context, anyw anywVar, long j) {
        this.b = anzmVar;
        this.a = context;
        this.h = j;
        this.f = anywVar;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    private static boolean c(Context context) {
        boolean booleanValue;
        synchronized (c) {
            Boolean bool = d;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            d = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean a() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z = activeNetworkInfo.isConnected();
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b0, code lost:
    
        r4 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00ac, code lost:
    
        if (r4.equals("S") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ae, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0181, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x018c, code lost:
    
        if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019f, code lost:
    
        if (r1.getMessage() == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a1, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d3, code lost:
    
        r11.b.g(r11.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01a9, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        r4 = r3.b;
        r5 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (r5 == 83) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r5 == 85) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        if (r4.equals("U") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
    
        if (r4 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        if (r4 == 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b7, code lost:
    
        r4 = r3.a;
        r5 = r1.a;
        r6 = r1.b.d();
        r7 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        if (r4.length() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d0, code lost:
    
        r9 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        r7.putString("gcm.topic", r9);
        r7.putString("delete", "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        if (r4.length() == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ed, code lost:
    
        r4 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f7, code lost:
    
        defpackage.anzm.c(defpackage.anys.b(r5.a(r6, r4, r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        r4 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d5, code lost:
    
        r9 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0147, code lost:
    
        r1.d.d(r3);
        r4 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        r3 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0157, code lost:
    
        if (r1.c.containsKey(r3) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015c, code lost:
    
        r5 = (java.util.ArrayDeque) r1.c.get(r3);
        r6 = (defpackage.rpv) r5.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016a, code lost:
    
        if (r6 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016c, code lost:
    
        r6.b(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0174, code lost:
    
        if (r5.isEmpty() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0176, code lost:
    
        r1.c.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017b, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0159, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0103, code lost:
    
        r4 = r3.a;
        r5 = r1.a;
        r6 = r1.b.d();
        r7 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011a, code lost:
    
        if (r4.length() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011c, code lost:
    
        r9 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0127, code lost:
    
        r7.putString("gcm.topic", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0130, code lost:
    
        if (r4.length() == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0132, code lost:
    
        r4 = "/topics/".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013c, code lost:
    
        defpackage.anzm.c(defpackage.anys.b(r5.a(r6, r4, r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0137, code lost:
    
        r4 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0121, code lost:
    
        r9 = new java.lang.String("/topics/");
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzo.run():void");
    }
}
