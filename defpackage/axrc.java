package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axrc {
    public final File a;
    public final OutputStream b;

    public axrc(File file) {
        File createTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.a = createTempFile;
        this.b = new FileOutputStream(createTempFile);
    }

    public final String a() {
        return this.a.getAbsolutePath();
    }
}
