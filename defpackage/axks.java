package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axks extends axkq implements deb {
    public int q;
    public int r;

    /* JADX INFO: Access modifiers changed from: protected */
    public axks(String str) {
        super(str);
    }

    public final int r() {
        if (!this.k) {
            q();
        }
        return this.r;
    }

    public final int s() {
        if (!this.k) {
            q();
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(ByteBuffer byteBuffer) {
        did.ab(byteBuffer, this.q);
        did.Z(byteBuffer, this.r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(ByteBuffer byteBuffer) {
        this.q = did.aj(byteBuffer);
        this.r = did.ai(byteBuffer);
    }
}
