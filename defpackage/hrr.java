package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrr {
    public final hos a;

    public hrr(hos hosVar) {
        this.a = hosVar;
    }

    public static boolean a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        return file.delete();
    }
}
