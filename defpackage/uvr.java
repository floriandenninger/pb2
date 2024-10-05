package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class uvr {
    private static final Object a = new Object();
    public static final /* synthetic */ int d = 0;
    private static volatile uvq e = null;
    private static volatile boolean f = false;
    private static final AtomicInteger g;
    private static final ansv l;
    final uvp b;
    final String c;
    private final Object h;
    private volatile int i = -1;
    private volatile Object j;
    private final boolean k;

    static {
        new AtomicReference();
        l = new ansv(uxd.b);
        g = new AtomicInteger();
    }

    public uvr(uvp uvpVar, String str, Object obj, boolean z) {
        if (uvpVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.b = uvpVar;
        this.c = str;
        this.h = obj;
        this.k = z;
    }

    public static uvr b(uvp uvpVar, String str, Object obj, uvo uvoVar, boolean z) {
        return new uvn(uvpVar, str, obj, z, uvoVar);
    }

    @Deprecated
    public static void e(Context context) {
        synchronized (a) {
            uvq uvqVar = e;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (uvqVar == null || uvqVar.a != context) {
                uuy.d();
                uvt.a();
                uve.d();
                e = new uvq(context, amkq.x(new nju(context, 8)));
                f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f() {
        g.incrementAndGet();
    }

    public static void g(Context context) {
        if (e == null) {
            synchronized (a) {
                if (e == null) {
                    e(context);
                }
            }
        }
    }

    private final Object h(uvq uvqVar) {
        uvp uvpVar = this.b;
        if (!uvpVar.e) {
            amml ammlVar = uvpVar.i;
            uve a2 = uve.a(uvqVar.a);
            uvp uvpVar2 = this.b;
            String b = a2.b(uvpVar2.e ? null : j(uvpVar2.c));
            if (b != null) {
                return a(b);
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:34|(1:36)(7:48|(1:50)(1:56)|51|(2:53|(1:55))|43|44|45)|37|38|39|40|(1:42)|43|44|45) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(defpackage.uvq r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvr.i(uvq):java.lang.Object");
    }

    private final String j(String str) {
        if (str.isEmpty()) {
            return this.c;
        }
        String valueOf = String.valueOf(this.c);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:8:0x001e, B:10:0x0022, B:13:0x0028, B:15:0x0033, B:18:0x004f, B:20:0x005d, B:22:0x0073, B:23:0x0076, B:24:0x007a, B:25:0x003a, B:28:0x004d, B:29:0x0041, B:31:0x0047, B:34:0x007e), top: B:7:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c() {
        /*
            r5 = this;
            boolean r0 = r5.k
            r1 = 1
            if (r0 != 0) goto L13
            ansv r0 = defpackage.uvr.l
            java.lang.String r2 = r5.c
            r2.getClass()
            boolean r0 = r0.a
            java.lang.String r0 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            defpackage.amkq.O(r1, r0)
        L13:
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.uvr.g
            int r0 = r0.get()
            int r2 = r5.i
            if (r2 >= r0) goto L83
            monitor-enter(r5)
            int r2 = r5.i     // Catch: java.lang.Throwable -> L80
            if (r2 >= r0) goto L7e
            uvq r2 = defpackage.uvr.e     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L27
            goto L28
        L27:
            r1 = 0
        L28:
            java.lang.String r3 = "Must call PhenotypeFlag.init() first"
            defpackage.amkq.O(r1, r3)     // Catch: java.lang.Throwable -> L80
            uvp r1 = r5.b     // Catch: java.lang.Throwable -> L80
            boolean r1 = r1.f     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L41
            java.lang.Object r1 = r5.h(r2)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L3a
            goto L4f
        L3a:
            java.lang.Object r1 = r5.i(r2)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L4f
            goto L4d
        L41:
            java.lang.Object r1 = r5.i(r2)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L4f
            java.lang.Object r1 = r5.h(r2)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L4f
        L4d:
            java.lang.Object r1 = r5.h     // Catch: java.lang.Throwable -> L80
        L4f:
            amnv r2 = r2.b     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L80
            ammv r2 = (defpackage.ammv) r2     // Catch: java.lang.Throwable -> L80
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L7a
            java.lang.Object r1 = r2.c()     // Catch: java.lang.Throwable -> L80
            ajun r1 = (defpackage.ajun) r1     // Catch: java.lang.Throwable -> L80
            uvp r2 = r5.b     // Catch: java.lang.Throwable -> L80
            android.net.Uri r3 = r2.b     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r2.a     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = r2.d     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r5.c     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = r1.z(r3, r2, r4)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L76
            java.lang.Object r1 = r5.h     // Catch: java.lang.Throwable -> L80
            goto L7a
        L76:
            java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.Throwable -> L80
        L7a:
            r5.j = r1     // Catch: java.lang.Throwable -> L80
            r5.i = r0     // Catch: java.lang.Throwable -> L80
        L7e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            goto L83
        L80:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r0
        L83:
            java.lang.Object r0 = r5.j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvr.c():java.lang.Object");
    }

    public final String d() {
        return j(this.b.d);
    }
}
