package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class quz {
    public final File a;
    public final File b;
    private final quw c;

    public quz(quw quwVar, File file, File file2) {
        this.c = quwVar;
        this.a = file;
        this.b = file2;
    }

    public final File a() {
        return this.c.b;
    }

    public final File b() {
        return this.c.a;
    }

    public final boolean c() {
        return a().isFile() && this.a.isDirectory();
    }
}
