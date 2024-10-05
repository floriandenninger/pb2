package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advd {
    public static final advc a = new advc();

    public static File a(ansv ansvVar, File file) {
        if (true != ansvVar.a) {
            file = null;
        }
        if (file != null) {
            try {
                file.mkdirs();
                File.createTempFile("cache", "probe", file).delete();
            } catch (IOException unused) {
                afsi.e(1, 6, "Cannot write to the cache dir.", 0.1d);
                return null;
            }
        }
        return file;
    }
}
