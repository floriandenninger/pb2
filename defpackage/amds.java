package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.EOFException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amds implements uyo {
    public final Context a;
    public final azrw b;
    public final anib c;
    public final axpg d;
    public final azrw e;
    public final azrw f;
    private final uyg g;

    public amds(Context context, uyg uygVar, azrw azrwVar, anib anibVar, axpg axpgVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = context;
        this.g = uygVar;
        this.b = azrwVar;
        this.c = anibVar;
        this.d = axpgVar;
        this.e = azrwVar3;
        this.f = azrwVar2;
    }

    public static int b(RandomAccessFile randomAccessFile) {
        try {
            int readInt = randomAccessFile.readInt();
            randomAccessFile.seek(0L);
            return readInt;
        } catch (EOFException unused) {
            randomAccessFile.seek(0L);
            return -1;
        } catch (Throwable th) {
            randomAccessFile.seek(0L);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.writeInt(i);
        randomAccessFile.seek(0L);
    }

    @Override // defpackage.uyo
    public final void a() {
        if (!"robolectric".equals(Build.FINGERPRINT) && uye.b() && this.g.a()) {
            c(true);
        }
    }

    public final void c(final boolean z) {
        amil l = amjw.l("StartupAfterPackageReplaced");
        try {
            final anhy T = anaf.T(amjk.b(new anfy() { // from class: amdp
                /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: IOException -> 0x0092, TRY_ENTER, TryCatch #0 {IOException -> 0x0092, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x003b, B:9:0x0041, B:26:0x0051, B:14:0x0061, B:17:0x0066, B:21:0x007e, B:22:0x0081, B:28:0x0082, B:29:0x0089, B:30:0x008a, B:31:0x0091, B:24:0x004a, B:12:0x0057), top: B:2:0x0005, inners: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[Catch: IOException -> 0x0092, TryCatch #0 {IOException -> 0x0092, blocks: (B:3:0x0005, B:5:0x0015, B:7:0x003b, B:9:0x0041, B:26:0x0051, B:14:0x0061, B:17:0x0066, B:21:0x007e, B:22:0x0081, B:28:0x0082, B:29:0x0089, B:30:0x008a, B:31:0x0091, B:24:0x004a, B:12:0x0057), top: B:2:0x0005, inners: #1 }] */
                @Override // defpackage.anfy
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final defpackage.anhy a() {
                    /*
                        r8 = this;
                        amds r0 = defpackage.amds.this
                        boolean r1 = r2
                        r2 = 0
                        azrw r3 = r0.e     // Catch: java.io.IOException -> L92
                        java.lang.Object r3 = r3.get()     // Catch: java.io.IOException -> L92
                        android.content.pm.PackageInfo r3 = (android.content.pm.PackageInfo) r3     // Catch: java.io.IOException -> L92
                        int r4 = r3.versionCode     // Catch: java.io.IOException -> L92
                        android.content.pm.ApplicationInfo r5 = r3.applicationInfo     // Catch: java.io.IOException -> L92
                        java.lang.String r5 = r5.dataDir     // Catch: java.io.IOException -> L92
                        if (r5 == 0) goto L8a
                        java.io.File r5 = new java.io.File     // Catch: java.io.IOException -> L92
                        android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.io.IOException -> L92
                        java.lang.String r3 = r3.dataDir     // Catch: java.io.IOException -> L92
                        java.lang.String r6 = "files"
                        r5.<init>(r3, r6)     // Catch: java.io.IOException -> L92
                        java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> L92
                        java.lang.String r6 = "tiktok"
                        r3.<init>(r5, r6)     // Catch: java.io.IOException -> L92
                        r3.mkdirs()     // Catch: java.io.IOException -> L92
                        java.io.File r5 = new java.io.File     // Catch: java.io.IOException -> L92
                        java.lang.String r6 = "103243289"
                        r5.<init>(r3, r6)     // Catch: java.io.IOException -> L92
                        boolean r3 = r5.createNewFile()     // Catch: java.io.IOException -> L92
                        boolean r6 = r5.exists()     // Catch: java.io.IOException -> L92
                        if (r6 == 0) goto L82
                        boolean r6 = r5.isFile()     // Catch: java.io.IOException -> L92
                        if (r6 == 0) goto L82
                        java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L92
                        java.lang.String r7 = "rw"
                        r6.<init>(r5, r7)     // Catch: java.io.IOException -> L92
                        if (r3 != 0) goto L56
                        int r3 = defpackage.amds.b(r6)     // Catch: java.lang.Throwable -> L7d
                        if (r4 == r3) goto L51
                        goto L56
                    L51:
                        r6.close()     // Catch: java.io.IOException -> L92
                        r3 = r2
                        goto L5f
                    L56:
                        r3 = -1
                        defpackage.amds.d(r6, r3)     // Catch: java.lang.Throwable -> L7d
                        amdr r3 = new amdr     // Catch: java.lang.Throwable -> L7d
                        r3.<init>()     // Catch: java.lang.Throwable -> L7d
                    L5f:
                        if (r3 != 0) goto L66
                        anhy r0 = defpackage.anaf.O(r2)     // Catch: java.io.IOException -> L92
                        goto Lbe
                    L66:
                        axpg r4 = r0.d     // Catch: java.io.IOException -> L92
                        java.lang.Object r4 = r4.get()     // Catch: java.io.IOException -> L92
                        amba r4 = (defpackage.amba) r4     // Catch: java.io.IOException -> L92
                        anib r5 = r0.c     // Catch: java.io.IOException -> L92
                        java.util.concurrent.Callable r3 = defpackage.amjk.g(r3)     // Catch: java.io.IOException -> L92
                        anhy r3 = r5.submit(r3)     // Catch: java.io.IOException -> L92
                        r4.c(r3)     // Catch: java.io.IOException -> L92
                        r0 = r3
                        goto Lbe
                    L7d:
                        r3 = move-exception
                        r6.close()     // Catch: java.io.IOException -> L92
                        throw r3     // Catch: java.io.IOException -> L92
                    L82:
                        java.io.IOException r3 = new java.io.IOException     // Catch: java.io.IOException -> L92
                        java.lang.String r4 = "Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup."
                        r3.<init>(r4)     // Catch: java.io.IOException -> L92
                        throw r3     // Catch: java.io.IOException -> L92
                    L8a:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L92
                        java.lang.String r4 = "PackageInfo was invalid."
                        r3.<init>(r4)     // Catch: java.io.IOException -> L92
                        throw r3     // Catch: java.io.IOException -> L92
                    L92:
                        r3 = move-exception
                        java.lang.String r4 = "StartupAfterPkgReplaced"
                        if (r1 == 0) goto Lb5
                        int r1 = android.os.Build.VERSION.SDK_INT
                        r5 = 24
                        if (r1 < r5) goto Lb5
                        android.content.Context r1 = r0.a
                        boolean r1 = defpackage.slf.e(r1)
                        if (r1 != 0) goto Laa
                        java.lang.String r1 = "StartupAfterPackageReplaced failed, device was locked. Will reschedule."
                        android.util.Log.w(r4, r1, r3)
                    Laa:
                        android.content.Context r1 = r0.a
                        amdq r3 = new amdq
                        r3.<init>()
                        defpackage.slf.b(r1, r3)
                        goto Lba
                    Lb5:
                        java.lang.String r0 = "StartupAfterPackageReplaced failed, will try again next startup: "
                        android.util.Log.e(r4, r0, r3)
                    Lba:
                        anhy r0 = defpackage.anaf.O(r2)
                    Lbe:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.amdp.a():anhy");
                }
            }), this.c);
            amba ambaVar = (amba) this.d.get();
            l.a(T);
            final TimeUnit timeUnit = TimeUnit.SECONDS;
            final ania schedule = ambaVar.d.schedule(amjk.f(new Runnable() { // from class: amaw
                @Override // java.lang.Runnable
                public final void run() {
                    anhy anhyVar = anhy.this;
                    TimeUnit timeUnit2 = timeUnit;
                    if (anhyVar.isDone()) {
                        return;
                    }
                    ((amxh) ((amxh) ((amxh) amba.a.f()).h(amjq.c())).i("com/google/apps/tiktok/concurrent/AndroidFutures", "lambda$crashApplicationOnFailure$1", 284, "AndroidFutures.java")).v("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", 30L, timeUnit2, anhyVar);
                }
            }), 30L, timeUnit);
            T.d(amjk.f(new Runnable() { // from class: amay
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = schedule;
                    anhy anhyVar = T;
                    future.cancel(true);
                    try {
                        anaf.W(anhyVar);
                    } catch (ExecutionException e) {
                        amjq.d(e.getCause());
                    }
                }
            }), ambaVar.c);
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
