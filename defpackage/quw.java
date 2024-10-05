package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class quw {
    public final File a;
    public final File b;

    public quw(File file) {
        this.a = file;
        this.b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public quw(File file, String str) {
        this.a = file;
        this.b = new File(file, str);
    }
}
