package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aylk implements ayoc {
    private InputStream a;

    public aylk(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.ayoc
    public final InputStream f() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
