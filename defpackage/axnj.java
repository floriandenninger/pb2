package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axnj extends axml {
    int a;
    int b;

    @Override // defpackage.axml
    public final String a() {
        return "sync";
    }

    @Override // defpackage.axml
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        did.ab(allocate, this.b + (this.a << 6));
        return (ByteBuffer) allocate.rewind();
    }

    @Override // defpackage.axml
    public final void c(ByteBuffer byteBuffer) {
        int aj = did.aj(byteBuffer);
        this.a = (aj & 192) >> 6;
        this.b = aj & 63;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axnj axnjVar = (axnj) obj;
        return this.b == axnjVar.b && this.a == axnjVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(62);
        sb.append("SyncSampleEntry{reserved=");
        sb.append(i);
        sb.append(", nalUnitType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
