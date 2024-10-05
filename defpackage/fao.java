package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fao {
    public final File a;

    public fao(File file) {
        this.a = file;
    }

    public final void a() {
        if (this.a.exists()) {
            this.a.delete();
        }
    }
}
