package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmo extends axml {
    private short a;

    @Override // defpackage.axml
    public final String a() {
        return "roll";
    }

    @Override // defpackage.axml
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.a);
        allocate.rewind();
        return allocate;
    }

    @Override // defpackage.axml
    public final void c(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((axmo) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
