package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancb extends anaf {
    private final File a;

    public ancb(File file) {
        file.getClass();
        this.a = file;
    }

    public final FileInputStream cp() {
        return new FileInputStream(this.a);
    }

    @Override // defpackage.anaf
    public final byte[] h() {
        anby a = anby.a();
        try {
            FileInputStream cp = cp();
            a.c(cp);
            return anbt.d(cp, cp.getChannel().size());
        } finally {
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Files.asByteSource(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
