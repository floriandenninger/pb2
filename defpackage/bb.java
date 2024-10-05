package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bb {
    public static final Set a = new HashSet();
    public static final boolean b;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r0 <= 0) goto L11;
     */
    static {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            defpackage.bb.a = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L39
            java.lang.String r3 = "(\\d+)\\.(\\d+)(\\.\\d+)?"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r0 = r3.matcher(r0)
            boolean r3 = r0.matches()
            if (r3 == 0) goto L39
            java.lang.String r3 = r0.group(r1)     // Catch: java.lang.NumberFormatException -> L39
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L39
            r4 = 2
            java.lang.String r0 = r0.group(r4)     // Catch: java.lang.NumberFormatException -> L39
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L39
            if (r3 > r4) goto L3a
            if (r3 != r4) goto L39
            if (r0 <= 0) goto L39
            goto L3a
        L39:
            r1 = 0
        L3a:
            defpackage.bb.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.<clinit>():void");
    }

    public static Field a(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static void b(File file) {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
