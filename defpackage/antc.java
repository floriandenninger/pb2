package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.UserManager;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class antc {
    public final anur c;
    private final Context g;
    private final String h;
    private final antg i;
    private final anva k;
    public static final Object a = new Object();
    private static final Executor f = new anta();
    public static final Map b = new adz();
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean();
    public final List e = new CopyOnWriteArrayList();

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165 A[LOOP:1: B:28:0x015f->B:30:0x0165, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected antc(final android.content.Context r10, java.lang.String r11, defpackage.antg r12) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.antc.<init>(android.content.Context, java.lang.String, antg):void");
    }

    public static antc b() {
        antc antcVar;
        synchronized (a) {
            antcVar = (antc) b.get("[DEFAULT]");
            if (antcVar == null) {
                String a2 = qtp.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 116);
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(a2);
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return antcVar;
    }

    public static antc c(Context context, antg antgVar) {
        return d(context, antgVar, "[DEFAULT]");
    }

    public static antc d(Context context, antg antgVar, String str) {
        antc antcVar;
        AtomicReference atomicReference = ansz.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (ansz.a.get() == null) {
                ansz anszVar = new ansz();
                if (ansz.a.compareAndSet(null, anszVar)) {
                    qpa.b(application);
                    qpa.a.a(anszVar);
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map map = b;
            boolean z = !map.containsKey(trim);
            StringBuilder sb = new StringBuilder(String.valueOf(trim).length() + 33);
            sb.append("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            qip.aw(z, sb.toString());
            qip.az(context, "Application context cannot be null.");
            antcVar = new antc(context, trim, antgVar);
            map.put(trim, antcVar);
        }
        antcVar.i();
        return antcVar;
    }

    private final void l() {
        qip.aw(!this.j.get(), "FirebaseApp was deleted");
    }

    public final Context a() {
        l();
        return this.g;
    }

    public final antg e() {
        l();
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof antc) {
            return this.h.equals(((antc) obj).g());
        }
        return false;
    }

    public final Object f(Class cls) {
        l();
        return this.c.a(cls);
    }

    public final String g() {
        l();
        return this.h;
    }

    public final String h() {
        String ag = oba.ag(g().getBytes(Charset.defaultCharset()));
        String ag2 = oba.ag(e().b.getBytes(Charset.defaultCharset()));
        StringBuilder sb = new StringBuilder(String.valueOf(ag).length() + 1 + String.valueOf(ag2).length());
        sb.append(ag);
        sb.append("+");
        sb.append(ag2);
        return sb.toString();
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final void i() {
        HashMap hashMap;
        Context context = this.g;
        if (Build.VERSION.SDK_INT < 24 || ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            String valueOf = String.valueOf(g());
            if (valueOf.length() != 0) {
                "Device unlocked: initializing all Firebase APIs for app ".concat(valueOf);
            }
            anur anurVar = this.c;
            boolean k = k();
            if (anurVar.b.compareAndSet(null, Boolean.valueOf(k))) {
                synchronized (anurVar) {
                    hashMap = new HashMap(anurVar.a);
                }
                anurVar.d(hashMap, k);
                return;
            }
            return;
        }
        String valueOf2 = String.valueOf(g());
        if (valueOf2.length() != 0) {
            "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(valueOf2);
        }
        Context context2 = this.g;
        if (antb.a.get() == null) {
            antb antbVar = new antb(context2);
            if (antb.a.compareAndSet(null, antbVar)) {
                context2.registerReceiver(antbVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public final boolean j() {
        l();
        return ((anxy) this.k.a()).a();
    }

    public final boolean k() {
        return "[DEFAULT]".equals(g());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("name", this.h, arrayList);
        qar.l("options", this.i, arrayList);
        return qar.k(arrayList, this);
    }
}
