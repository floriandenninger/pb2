package defpackage;

import java.io.File;
import java.io.FileFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zfp implements FileFilter {
    private final /* synthetic */ int d;
    public static final /* synthetic */ zfp c = new zfp(3);
    public static final /* synthetic */ zfp b = new zfp(2);
    public static final /* synthetic */ zfp a = new zfp(0);

    public /* synthetic */ zfp(int i) {
        this.d = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = this.d;
        if (i == 0) {
            return file.getAbsolutePath().contains("_cleanup_mv");
        }
        if (i != 1) {
            if (i == 2) {
                return file.getName().startsWith("BLOB_STORAGE");
            }
            long j = alrm.a;
            return file.getName().endsWith(".apk");
        }
        String name = file.getName();
        if (name.startsWith("cpu")) {
            for (int i2 = 3; i2 < name.length(); i2++) {
                if (Character.isDigit(name.charAt(i2))) {
                }
            }
            return true;
        }
        return false;
    }
}
