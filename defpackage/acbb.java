package defpackage;

import java.io.PipedOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acbb extends PipedOutputStream {
    private final acba a;

    public acbb(acba acbaVar) {
        super(acbaVar);
        this.a = acbaVar;
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.a.a(bArr, i, i2);
    }
}
