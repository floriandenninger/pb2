package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vdw extends FilterInputStream {
    public vdw(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return this.in.read(bArr);
    }
}
