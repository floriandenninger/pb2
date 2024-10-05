package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
@axmb(b = {20})
/* loaded from: classes2.dex */
public final class axmh extends axlx {
    int a;

    @Override // defpackage.axlx
    public final void a(ByteBuffer byteBuffer) {
        this.a = did.aj(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((axmh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.axlx
    public final String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.a) + '}';
    }
}
