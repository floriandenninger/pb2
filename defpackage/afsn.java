package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afsn {
    private static final StackTraceElement[] a = new StackTraceElement[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Error] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Throwable a(java.lang.Throwable r9) {
        /*
            java.lang.String r0 = "ThrowableTrimmer"
            java.lang.StackTraceElement[] r1 = r9.getStackTrace()
            java.lang.String r2 = r9.getMessage()
            r3 = 409600(0x64000, float:5.73972E-40)
            r4 = 0
            if (r2 == 0) goto L19
            int r2 = r2.length()
            int r3 = r3 - r2
            int r3 = java.lang.Math.max(r3, r4)
        L19:
            int r2 = r1.length
            r5 = 0
            r6 = 0
        L1c:
            if (r4 >= r2) goto L31
            r7 = r1[r4]
            java.lang.String r7 = r7.toString()
            int r7 = r7.length()
            int r5 = r5 + r7
            if (r5 <= r3) goto L2c
            goto L31
        L2c:
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L1c
        L31:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r1, r6)
            java.lang.StackTraceElement[] r2 = (java.lang.StackTraceElement[]) r2
            java.lang.StackTraceElement[] r3 = defpackage.afsn.a
            r9.setStackTrace(r3)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r4 = 0
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch: java.io.IOException -> L7d
            r5.<init>(r3)     // Catch: java.io.IOException -> L7d
            r5.writeObject(r9)     // Catch: java.lang.Throwable -> L7f
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.ClassNotFoundException -> L6d java.io.IOException -> L6f java.lang.Throwable -> L7f
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch: java.lang.ClassNotFoundException -> L6d java.io.IOException -> L6f java.lang.Throwable -> L7f
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.ClassNotFoundException -> L6d java.io.IOException -> L6f java.lang.Throwable -> L7f
            r7.<init>(r3)     // Catch: java.lang.ClassNotFoundException -> L6d java.io.IOException -> L6f java.lang.Throwable -> L7f
            r6.<init>(r7)     // Catch: java.lang.ClassNotFoundException -> L6d java.io.IOException -> L6f java.lang.Throwable -> L7f
            java.lang.Object r3 = r6.readObject()     // Catch: java.lang.Throwable -> L68
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> L68
            r6.close()     // Catch: java.lang.Throwable -> L62 java.lang.ClassNotFoundException -> L64 java.io.IOException -> L66
            goto L78
        L62:
            r4 = move-exception
            goto L83
        L64:
            r4 = move-exception
            goto L73
        L66:
            r4 = move-exception
            goto L73
        L68:
            r3 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L6c
        L6c:
            throw r3     // Catch: java.lang.ClassNotFoundException -> L6d java.io.IOException -> L6f java.lang.Throwable -> L7f
        L6d:
            r3 = move-exception
            goto L70
        L6f:
            r3 = move-exception
        L70:
            r8 = r4
            r4 = r3
            r3 = r8
        L73:
            java.lang.String r6 = "Couldn't deserialize throwable."
            android.util.Log.e(r0, r6, r4)     // Catch: java.lang.Throwable -> L62
        L78:
            r4 = r3
            r5.close()     // Catch: java.io.IOException -> L7d
            goto L90
        L7d:
            r3 = move-exception
            goto L8b
        L7f:
            r3 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
        L83:
            r5.close()     // Catch: java.lang.Throwable -> L86
        L86:
            throw r4     // Catch: java.io.IOException -> L87
        L87:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
        L8b:
            java.lang.String r5 = "Couldn't serialize throwable."
            android.util.Log.e(r0, r5, r3)
        L90:
            if (r4 != 0) goto Lb7
            boolean r0 = r9 instanceof java.lang.Error
            if (r0 == 0) goto La0
            java.lang.Error r4 = new java.lang.Error
            java.lang.String r0 = r9.getMessage()
            r4.<init>(r0)
            goto Lb7
        La0:
            boolean r0 = r9 instanceof java.lang.Exception
            if (r0 == 0) goto Lae
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r0 = r9.getMessage()
            r4.<init>(r0)
            goto Lb7
        Lae:
            java.lang.Throwable r4 = new java.lang.Throwable
            java.lang.String r0 = r9.getMessage()
            r4.<init>(r0)
        Lb7:
            r9.setStackTrace(r1)
            r4.setStackTrace(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afsn.a(java.lang.Throwable):java.lang.Throwable");
    }

    public static boolean b(Throwable th) {
        int i;
        String message = th.getMessage();
        if (message != null) {
            i = message.length();
            if (i > 409600) {
                return true;
            }
        } else {
            i = 0;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            i += stackTraceElement.toString().length();
            if (i > 409600) {
                return true;
            }
        }
        return false;
    }
}
