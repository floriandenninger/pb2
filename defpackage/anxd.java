package defpackage;

import android.text.TextUtils;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anxd implements anxe {
    public static final Object a = new Object();
    private static final ThreadFactory g = new anxc(0);
    public final antc b;
    public final anxs c;
    public final anxp d;
    public final anxm e;
    public final anxo f;
    private final Object h;
    private final ExecutorService i;
    private final ExecutorService j;
    private String k;
    private final Set l;
    private final List m;

    public anxd(antc antcVar, anwy anwyVar, anwy anwyVar2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = g;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        anxs anxsVar = new anxs(antcVar.a(), anwyVar, anwyVar2);
        anxp anxpVar = new anxp(antcVar);
        anxm b = anxm.b();
        anxo anxoVar = new anxo(antcVar);
        int i = anxk.a;
        this.h = new Object();
        this.l = new HashSet();
        this.m = new ArrayList();
        this.b = antcVar;
        this.c = anxsVar;
        this.d = anxpVar;
        this.e = b;
        this.f = anxoVar;
        this.i = threadPoolExecutor;
        this.j = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    public static anxd b() {
        return c(antc.b());
    }

    public static anxd c(antc antcVar) {
        qip.ap(true, "Null is not a valid value of FirebaseApp.");
        return (anxd) antcVar.f(anxe.class);
    }

    private final synchronized String m() {
        return this.k;
    }

    private final void n(anxl anxlVar) {
        synchronized (this.h) {
            this.m.add(anxlVar);
        }
    }

    private final void o() {
        qip.ay(e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qip.ay(f(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qip.ay(d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qip.ap(anxm.d(e()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qip.ap(anxm.b.matcher(d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.anxe
    public final rpt a() {
        o();
        String m = m();
        if (m == null) {
            rpv rpvVar = new rpv();
            n(new anxh(rpvVar));
            rpx rpxVar = rpvVar.a;
            this.i.execute(new anxb(this, 1));
            return rpxVar;
        }
        return rqr.c(m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return this.b.e().a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String e() {
        return this.b.e().b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f() {
        return this.b.e().d;
    }

    public final void g(Exception exc) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((anxl) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void h(anxr anxrVar) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((anxl) it.next()).b(anxrVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void i(String str) {
        this.k = str;
    }

    public final synchronized void j(anxr anxrVar, anxr anxrVar2) {
        if (this.l.size() != 0 && !anxrVar.a.equals(anxrVar2.a)) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((anxn) it.next()).a();
            }
        }
    }

    public final void k() {
        anxr a2;
        String str;
        String string;
        synchronized (a) {
            anwz b = anwz.b(this.b.a());
            try {
                a2 = this.d.a();
                if (a2.c()) {
                    if ((!this.b.g().equals("CHIME_ANDROID_SDK") && !this.b.k()) || a2.g != 1) {
                        string = anxk.a();
                    } else {
                        anxo anxoVar = this.f;
                        synchronized (anxoVar.b) {
                            synchronized (anxoVar.b) {
                                str = null;
                                string = anxoVar.b.getString("|S|id", null);
                            }
                            if (string == null) {
                                synchronized (anxoVar.b) {
                                    String string2 = anxoVar.b.getString("|S||P|", null);
                                    if (string2 != null) {
                                        PublicKey b2 = anxo.b(string2);
                                        if (b2 != null) {
                                            str = anxo.a(b2);
                                        }
                                    }
                                }
                                string = str;
                            }
                        }
                        if (TextUtils.isEmpty(string)) {
                            string = anxk.a();
                        }
                    }
                    anxp anxpVar = this.d;
                    anxq f = a2.f();
                    f.a = string;
                    f.c(3);
                    a2 = f.a();
                    anxpVar.b(a2);
                }
            } finally {
                if (b != null) {
                    b.a();
                }
            }
        }
        h(a2);
        this.j.execute(new Runnable() { // from class: anxa
            /* JADX WARN: Removed duplicated region for block: B:27:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x01a8 A[Catch: anxf -> 0x01a9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {anxf -> 0x01a9, blocks: (B:11:0x001b, B:13:0x0023, B:16:0x002a, B:18:0x0032, B:24:0x0051, B:56:0x0061, B:57:0x0068, B:58:0x0069, B:59:0x006f, B:60:0x008b, B:62:0x008d, B:64:0x0092, B:66:0x009a, B:67:0x009e, B:80:0x0102, B:84:0x0120, B:85:0x0125, B:86:0x012c, B:87:0x012d, B:88:0x01a8, B:101:0x0100, B:69:0x009f, B:71:0x00a4, B:73:0x00db, B:76:0x00e1, B:90:0x00e9, B:78:0x00f6, B:94:0x00f9, B:97:0x00fc), top: B:10:0x001b, inners: #4 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 442
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.anxa.run():void");
            }
        });
    }

    @Override // defpackage.anxe
    public final rpt l() {
        o();
        rpv rpvVar = new rpv();
        n(new anxg(this.e, rpvVar));
        rpx rpxVar = rpvVar.a;
        this.i.execute(new anxb(this, 0));
        return rpxVar;
    }
}
