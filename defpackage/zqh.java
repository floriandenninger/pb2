package defpackage;

import android.os.AsyncTask;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zqh extends AsyncTask {
    final /* synthetic */ axdu a;
    final /* synthetic */ File b;
    final /* synthetic */ axdu c;
    final /* synthetic */ zqi d;

    public zqh(zqi zqiVar, axdu axduVar, File file, axdu axduVar2) {
        this.d = zqiVar;
        this.a = axduVar;
        this.b = file;
        this.c = axduVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r6) {
        /*
            r5 = this;
            java.lang.Void[] r6 = (java.lang.Void[]) r6
            axdu r6 = r5.a
            byte[] r6 = r6.toByteArray()
            r0 = 0
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            java.io.File r1 = r1.getParentFile()     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.exists()     // Catch: java.io.IOException -> L6a
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L24
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            java.io.File r1 = r1.getParentFile()     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.mkdirs()     // Catch: java.io.IOException -> L6a
            if (r1 != 0) goto L24
            r2 = 0
        L24:
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.exists()     // Catch: java.io.IOException -> L6a
            if (r1 == 0) goto L35
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.delete()     // Catch: java.io.IOException -> L6a
            if (r1 != 0) goto L35
            r2 = 0
        L35:
            if (r6 == 0) goto L72
            int r1 = r6.length     // Catch: java.io.IOException -> L6a
            if (r1 <= 0) goto L72
            if (r2 == 0) goto L72
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.createNewFile()     // Catch: java.io.IOException -> L6a
            if (r1 == 0) goto L72
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L6a
            r1.<init>(r6)     // Catch: java.io.IOException -> L6a
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L6a
            java.io.File r2 = r5.b     // Catch: java.io.IOException -> L6a
            r6.<init>(r2)     // Catch: java.io.IOException -> L6a
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.io.IOException -> L6a
        L54:
            int r4 = r1.read(r2)     // Catch: java.io.IOException -> L6a
            if (r4 <= 0) goto L61
            r6.write(r2, r3, r4)     // Catch: java.io.IOException -> L6a
            java.util.Arrays.fill(r2, r3)     // Catch: java.io.IOException -> L6a
            goto L54
        L61:
            r1.close()     // Catch: java.io.IOException -> L6a
            r6.close()     // Catch: java.io.IOException -> L6a
            java.io.File r6 = r5.b     // Catch: java.io.IOException -> L6a
            goto L73
        L6a:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            defpackage.zga.b(r6)
        L72:
            r6 = r0
        L73:
            zqi r1 = r5.d
            java.lang.Object r1 = r1.d
            monitor-enter(r1)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La9
            r2.<init>()     // Catch: java.lang.Throwable -> La9
            zqi r3 = r5.d     // Catch: java.lang.Throwable -> La9
            java.util.List r3 = r3.a     // Catch: java.lang.Throwable -> La9
            r2.addAll(r3)     // Catch: java.lang.Throwable -> La9
            zqi r3 = r5.d     // Catch: java.lang.Throwable -> La9
            java.util.List r3 = r3.a     // Catch: java.lang.Throwable -> La9
            r3.clear()     // Catch: java.lang.Throwable -> La9
            zqi r3 = r5.d     // Catch: java.lang.Throwable -> La9
            amlr r4 = defpackage.amlr.a     // Catch: java.lang.Throwable -> La9
            r3.c = r4     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La9
        L95:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto La7
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> La9
            zrz r3 = (defpackage.zrz) r3     // Catch: java.lang.Throwable -> La9
            axdu r4 = r5.c     // Catch: java.lang.Throwable -> La9
            r3.a(r6, r4)     // Catch: java.lang.Throwable -> La9
            goto L95
        La7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La9
            return r0
        La9:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La9
            goto Lad
        Lac:
            throw r6
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqh.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
