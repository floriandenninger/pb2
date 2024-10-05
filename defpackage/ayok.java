package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayok extends InputStream implements aybh {
    public aooy a;
    public final aopf b;
    public ByteArrayInputStream c;

    public ayok(aooy aooyVar, aopf aopfVar) {
        this.a = aooyVar;
        this.b = aopfVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        aooy aooyVar = this.a;
        if (aooyVar != null) {
            return aooyVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        aooy aooyVar = this.a;
        if (aooyVar != null) {
            this.c = new ByteArrayInputStream(aooyVar.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        aooy aooyVar = this.a;
        if (aooyVar != null) {
            int serializedSize = aooyVar.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                aomp am = aomp.am(bArr, i, serializedSize);
                this.a.writeTo(am);
                am.an();
                this.a = null;
                this.c = null;
                return serializedSize;
            }
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
