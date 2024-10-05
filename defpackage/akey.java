package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akey implements akdg, akdm {
    public aksl a;
    public acsy b;
    private akeb c;
    private final String d;

    public akey(File file) {
        String absolutePath = file.getAbsolutePath();
        zhq.m(absolutePath);
        this.d = absolutePath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c3, code lost:
    
        if (r7 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00af, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a6, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00a4, code lost:
    
        if (r7 != null) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00dd A[Catch: IOException -> 0x00e0, all -> 0x011f, TRY_LEAVE, TryCatch #26 {IOException -> 0x00e0, blocks: (B:109:0x00d8, B:102:0x00dd), top: B:108:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[Catch: all -> 0x011f, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #30 {, blocks: (B:3:0x0001, B:109:0x00d8, B:102:0x00dd, B:103:0x00e0, B:62:0x00e7, B:57:0x00ec, B:38:0x00f0, B:42:0x00f9, B:45:0x0105, B:48:0x0111, B:35:0x00c6, B:67:0x007d, B:90:0x004a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x011f, TRY_ENTER, TRY_LEAVE, TryCatch #30 {, blocks: (B:3:0x0001, B:109:0x00d8, B:102:0x00dd, B:103:0x00e0, B:62:0x00e7, B:57:0x00ec, B:38:0x00f0, B:42:0x00f9, B:45:0x0105, B:48:0x0111, B:35:0x00c6, B:67:0x007d, B:90:0x004a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec A[Catch: IOException -> 0x00ef, all -> 0x011f, TRY_LEAVE, TryCatch #4 {IOException -> 0x00ef, blocks: (B:62:0x00e7, B:57:0x00ec), top: B:61:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized defpackage.akeb f() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akey.f():akeb");
    }

    private final synchronized void g() {
        File file = new File(this.d, "zeroprefixparsed.cache");
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(this.d, "zeroprefix.cache");
        if (file2.exists()) {
            file2.delete();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x007c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    private final synchronized void h(defpackage.akeb r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r4.d     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "zeroprefix.cache"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> La8
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto L13
            r0.delete()     // Catch: java.lang.Throwable -> La8
        L13:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r4.d     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "zeroprefixparsed.cache"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> La8
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L8f java.io.FileNotFoundException -> L91
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8f java.io.FileNotFoundException -> L91
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L8f java.io.FileNotFoundException -> L91
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8f java.io.FileNotFoundException -> L91
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            int r1 = r5.b()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            byte[] r1 = r5.f()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            int r1 = r1.length     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            byte[] r1 = r5.f()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            r0.write(r1)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            java.lang.String r1 = r5.e()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            if (r1 != 0) goto L62
            java.lang.String r1 = r5.e()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            java.lang.String r5 = r5.e()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            r0.write(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
        L62:
            r0.flush()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            r0.close()     // Catch: java.io.IOException -> L7c java.lang.Throwable -> L89 java.io.FileNotFoundException -> L8c
            goto L7c
        L69:
            r5 = move-exception
            r1 = r0
            goto L83
        L6c:
            r5 = move-exception
            r1 = r0
            goto L72
        L6f:
            r5 = move-exception
            goto L83
        L71:
            r5 = move-exception
        L72:
            java.lang.String r0 = "Exception when writing to zeroprefixrawsuggestResponseCache"
            defpackage.akmq.e(r0, r5)     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L7c
            r1.close()     // Catch: java.io.IOException -> L7c java.lang.Throwable -> L89 java.io.FileNotFoundException -> L8c
        L7c:
            r2.close()     // Catch: java.io.IOException -> L81 java.lang.Throwable -> La8
            monitor-exit(r4)
            return
        L81:
            monitor-exit(r4)
            return
        L83:
            if (r1 == 0) goto L88
            r1.close()     // Catch: java.io.IOException -> L88 java.lang.Throwable -> L89 java.io.FileNotFoundException -> L8c
        L88:
            throw r5     // Catch: java.lang.Throwable -> L89 java.io.FileNotFoundException -> L8c
        L89:
            r5 = move-exception
            r1 = r2
            goto La2
        L8c:
            r5 = move-exception
            r1 = r2
            goto L92
        L8f:
            r5 = move-exception
            goto La2
        L91:
            r5 = move-exception
        L92:
            java.lang.String r0 = "Error creating zero-prefix cache file."
            defpackage.zga.n(r0, r5)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto La0
            r1.close()     // Catch: java.io.IOException -> L9e java.lang.Throwable -> La8
            monitor-exit(r4)
            return
        L9e:
            monitor-exit(r4)
            return
        La0:
            monitor-exit(r4)
            return
        La2:
            if (r1 == 0) goto La7
            r1.close()     // Catch: java.io.IOException -> La7 java.lang.Throwable -> La8
        La7:
            throw r5     // Catch: java.lang.Throwable -> La8
        La8:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akey.h(akeb):void");
    }

    @Override // defpackage.akdg
    public final void a(aksl akslVar) {
        throw null;
    }

    public final synchronized akeb b() {
        yjk.e();
        if (this.c == null) {
            this.c = f();
        }
        return this.c;
    }

    @Override // defpackage.akdm
    public final acsy c() {
        return this.b;
    }

    public final synchronized void d() {
        yjk.e();
        this.c = null;
        g();
    }

    public final synchronized void e(akeb akebVar) {
        yjk.e();
        this.c = akebVar;
        h(akebVar);
    }
}
