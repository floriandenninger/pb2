package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axms extends axml {
    private boolean a;

    @Override // defpackage.axml
    public final String a() {
        return "tele";
    }

    @Override // defpackage.axml
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (true != this.a ? 0 : 128));
        allocate.rewind();
        return allocate;
    }

    @Override // defpackage.axml
    public final void c(ByteBuffer byteBuffer) {
        this.a = (byteBuffer.get() & 128) == 128;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((axms) obj).a;
    }

    public final int hashCode() {
        return (this.a ? 1 : 0) * 31;
    }

    public final String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.a + '}';
    }
}
