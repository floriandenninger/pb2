package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class uwx implements FilenameFilter {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ uwx(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public uwx(String str, int i, byte[] bArr) {
        this.b = i;
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.b != 0 ? str.startsWith(this.a) : str.equals(this.a.concat(".pb"));
    }
}
