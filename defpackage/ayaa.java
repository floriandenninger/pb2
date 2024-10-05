package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayaa implements ayab {
    public static final ayab a = new ayaa(0);
    private final /* synthetic */ int b;

    public ayaa(int i) {
        this.b = i;
    }

    @Override // defpackage.ayak
    public final InputStream a(InputStream inputStream) {
        return this.b != 0 ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.ayac, defpackage.ayak
    public final String b() {
        return this.b != 0 ? "gzip" : "identity";
    }
}
