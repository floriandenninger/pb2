package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmu extends axml {
    private boolean a;
    private short b;

    @Override // defpackage.axml
    public final String a() {
        return "rap ";
    }

    @Override // defpackage.axml
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((true != this.a ? (short) 0 : (short) 128) | this.b));
        allocate.rewind();
        return allocate;
    }

    @Override // defpackage.axml
    public final void c(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        this.a = (b & 128) == 128;
        this.b = (short) (b & Byte.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axmu axmuVar = (axmu) obj;
        return this.b == axmuVar.b && this.a == axmuVar.a;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) * 31) + this.b;
    }

    public final String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.a + ", numLeadingSamples=" + ((int) this.b) + '}';
    }
}
