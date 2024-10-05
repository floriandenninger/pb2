package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vva extends axks {
    private int a;

    public vva() {
        super("st3d");
        this.a = -1;
    }

    @Override // defpackage.axkq
    protected final long h() {
        return 5L;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int aj = did.aj(byteBuffer);
        if (aj == 0) {
            this.a = 0;
            return;
        }
        if (aj == 1) {
            this.a = 1;
        } else if (aj == 2) {
            this.a = 2;
        } else {
            if (aj != 3) {
                return;
            }
            this.a = 3;
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.ab(byteBuffer, this.a);
    }
}
