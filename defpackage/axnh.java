package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axnh extends axks {
    public short a;
    public short[] b;
    public int c;
    public String d;
    private String e;

    public axnh() {
        super("saiz");
        this.b = new short[0];
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (1 != (r() & 1) ? 4 : 12) + 5 + (this.a == 0 ? this.b.length : 0);
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if ((r() & 1) == 1) {
            this.d = did.am(byteBuffer);
            this.e = did.am(byteBuffer);
        }
        this.a = (short) did.aj(byteBuffer);
        int g = awxt.g(did.ak(byteBuffer));
        this.c = g;
        if (this.a == 0) {
            this.b = new short[g];
            for (int i = 0; i < this.c; i++) {
                this.b[i] = (short) did.aj(byteBuffer);
            }
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if ((r() & 1) == 1) {
            byteBuffer.put(ddz.b(this.d));
            byteBuffer.put(ddz.b(this.e));
        }
        did.ab(byteBuffer, this.a);
        if (this.a == 0) {
            did.aa(byteBuffer, this.b.length);
            for (short s : this.b) {
                did.ab(byteBuffer, s);
            }
            return;
        }
        did.aa(byteBuffer, this.c);
    }

    public final String toString() {
        short s = this.a;
        int i = this.c;
        String str = this.d;
        String str2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 130 + String.valueOf(str2).length());
        sb.append("SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=");
        sb.append((int) s);
        sb.append(", sampleCount=");
        sb.append(i);
        sb.append(", auxInfoType='");
        sb.append(str);
        sb.append("', auxInfoTypeParameter='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }
}
