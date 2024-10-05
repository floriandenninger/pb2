package defpackage;

import android.os.Environment;
import android.util.Log;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.Display$DisplayParams;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axft {
    private static final String a = "axft";

    public static CardboardDevice$DeviceParams a() {
        return (CardboardDevice$DeviceParams) e(CardboardDevice$DeviceParams.newBuilder(), "current_device_params", 894990891, true);
    }

    public static Display$DisplayParams b() {
        return (Display$DisplayParams) e(Display$DisplayParams.newBuilder(), "phone_params", 779508118, false);
    }

    public static boolean c() {
        boolean z;
        try {
            File f = f("current_device_params");
            z = f.exists() ? f.delete() : true;
        } catch (IllegalStateException e) {
            String str = a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Error clearing device parameters: ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
            z = false;
        }
        if (!z) {
            Log.e(a, "Could not clear Cardboard parameters from external storage.");
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x005b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(com.google.vr.sdk.proto.CardboardDevice$DeviceParams r6) {
        /*
            java.lang.String r0 = "Error writing parameters: "
            byte[] r6 = r6.toByteArray()
            java.lang.String r1 = "current_device_params"
            r2 = 0
            r3 = 0
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L66 java.io.FileNotFoundException -> L8f
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L66 java.io.FileNotFoundException -> L8f
            java.io.File r1 = f(r1)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L66 java.io.FileNotFoundException -> L8f
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L66 java.io.FileNotFoundException -> L8f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L64 java.lang.IllegalStateException -> L66 java.io.FileNotFoundException -> L8f
            r1 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.IOException -> L39
            r2 = 894990891(0x35587a2b, float:8.064405E-7)
            r1.putInt(r2)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.IOException -> L39
            int r2 = r6.length     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.IOException -> L39
            r1.putInt(r2)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.IOException -> L39
            byte[] r1 = r1.array()     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.IOException -> L39
            r4.write(r1)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.IOException -> L39
            r4.write(r6)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.IOException -> L39
            r6 = 1
            r3 = 1
            goto L57
        L35:
            r6 = move-exception
            goto L5d
        L37:
            r6 = move-exception
            goto L5f
        L39:
            r6 = move-exception
            java.lang.String r1 = defpackage.axft.a     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.FileNotFoundException -> L61
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.FileNotFoundException -> L61
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.FileNotFoundException -> L61
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.FileNotFoundException -> L61
            if (r2 == 0) goto L4f
            java.lang.String r6 = r0.concat(r6)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.FileNotFoundException -> L61
            goto L54
        L4f:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.FileNotFoundException -> L61
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.FileNotFoundException -> L61
        L54:
            android.util.Log.w(r1, r6)     // Catch: java.lang.Throwable -> L35 java.lang.IllegalStateException -> L37 java.io.FileNotFoundException -> L61
        L57:
            r4.close()     // Catch: java.io.IOException -> L5b
            goto Lb7
        L5b:
            goto Lb7
        L5d:
            r2 = r4
            goto Lc1
        L5f:
            r2 = r4
            goto L67
        L61:
            r6 = move-exception
            r2 = r4
            goto L90
        L64:
            r6 = move-exception
            goto Lc1
        L66:
            r6 = move-exception
        L67:
            java.lang.String r1 = defpackage.axft.a     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L64
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L64
            int r4 = r4 + 26
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L64
            r5.append(r0)     // Catch: java.lang.Throwable -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L64
            android.util.Log.w(r1, r6)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto Lb7
        L8b:
            r2.close()     // Catch: java.io.IOException -> L5b
            goto Lb7
        L8f:
            r6 = move-exception
        L90:
            java.lang.String r0 = defpackage.axft.a     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L64
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L64
            int r1 = r1 + 39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "Parameters file not found for writing: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L64
            r4.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L64
            android.util.Log.e(r0, r6)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto Lb7
            goto L8b
        Lb7:
            if (r3 != 0) goto Lc0
            java.lang.String r6 = defpackage.axft.a
            java.lang.String r0 = "Could not write Cardboard parameters to external storage."
            android.util.Log.e(r6, r0)
        Lc0:
            return r3
        Lc1:
            if (r2 == 0) goto Lc6
            r2.close()     // Catch: java.io.IOException -> Lc6
        Lc6:
            goto Lc8
        Lc7:
            throw r6
        Lc8:
            goto Lc7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axft.d(com.google.vr.sdk.proto.CardboardDevice$DeviceParams):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(7:2|3|4|5|6|7|8)|(1:10)(2:28|(1:30)(5:31|(1:33)|13|14|(1:16)(3:18|19|20)))|11|12|13|14|(0)(0)|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.aooy e(defpackage.aoox r7, java.lang.String r8, int r9, boolean r10) {
        /*
            java.lang.String r0 = "Error reading parameters: "
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L78
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L78
            java.io.File r8 = f(r8)     // Catch: java.lang.Throwable -> L78
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L78
            r8 = 8
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            byte[] r3 = r8.array()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            byte[] r4 = r8.array()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            int r4 = r4.length     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            r5 = 0
            int r3 = r2.read(r3, r5, r4)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            java.lang.String r4 = "Error parsing param record: end of stream."
            r6 = -1
            if (r3 != r6) goto L31
            java.lang.String r8 = defpackage.axft.a     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            android.util.Log.e(r8, r4)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
        L2f:
            r9 = r1
            goto L72
        L31:
            int r3 = r8.getInt()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            int r8 = r8.getInt()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            if (r3 == r9) goto L43
            java.lang.String r8 = defpackage.axft.a     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            java.lang.String r9 = "Error parsing param record: incorrect sentinel."
            android.util.Log.e(r8, r9)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            goto L2f
        L43:
            byte[] r9 = new byte[r8]     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            int r8 = r2.read(r9, r5, r8)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            if (r8 != r6) goto L72
            java.lang.String r8 = defpackage.axft.a     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            android.util.Log.e(r8, r4)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L53
            goto L2f
        L51:
            r8 = move-exception
            goto L7a
        L53:
            r8 = move-exception
            java.lang.String r9 = defpackage.axft.a     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L51
            int r3 = r8.length()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L69
            java.lang.String r8 = r0.concat(r8)     // Catch: java.lang.Throwable -> L51
            goto L6e
        L69:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L51
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L51
        L6e:
            android.util.Log.w(r9, r8)     // Catch: java.lang.Throwable -> L51
            goto L2f
        L72:
            r2.close()     // Catch: java.io.IOException -> L76 java.lang.IllegalStateException -> L80 java.io.FileNotFoundException -> La5
            goto Lb4
        L76:
            goto Lb4
        L78:
            r8 = move-exception
            r2 = r1
        L7a:
            if (r2 == 0) goto L7f
            r2.close()     // Catch: java.io.IOException -> L7f java.lang.IllegalStateException -> L80 java.io.FileNotFoundException -> La5
        L7f:
            throw r8     // Catch: java.lang.IllegalStateException -> L80 java.io.FileNotFoundException -> La5
        L80:
            r8 = move-exception
            java.lang.String r9 = defpackage.axft.a
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r10 = r10 + 26
            r2.<init>(r10)
            r2.append(r0)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r9, r8)
        La3:
            r9 = r1
            goto Lb4
        La5:
            r8 = move-exception
            if (r10 == 0) goto La3
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r8.length()
            goto La3
        Lb4:
            if (r9 != 0) goto Lb7
            return r1
        Lb7:
            aoox r7 = r7.mergeFrom(r9)     // Catch: defpackage.aoob -> Lc0
            aooy r7 = r7.build()     // Catch: defpackage.aoob -> Lc0
            return r7
        Lc0:
            r7 = move-exception
            java.lang.String r8 = defpackage.axft.a
            java.lang.String r9 = "Error reading params from ContentProvider"
            android.util.Log.e(r8, r9, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axft.e(aoox, java.lang.String, int, boolean):aooy");
    }

    private static File f(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), "Cardboard");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
            sb.append(valueOf);
            sb.append(" already exists as a file, but is expected to be a directory.");
            throw new IllegalStateException(sb.toString());
        }
        return new File(file, str);
    }
}
