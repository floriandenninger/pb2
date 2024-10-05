package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmr extends axks {
    public String a;
    public final List b;
    private String c;

    public axmr() {
        super("sbgp");
        this.b = new LinkedList();
    }

    @Override // defpackage.axkq
    protected final long h() {
        return s() == 1 ? (this.b.size() * 8) + 16 : (this.b.size() * 8) + 12;
    }

    @Override // defpackage.axkq
    protected final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = did.am(byteBuffer);
        if (s() == 1) {
            this.c = did.am(byteBuffer);
        }
        long ak = did.ak(byteBuffer);
        while (true) {
            long j = (-1) + ak;
            if (ak <= 0) {
                return;
            }
            this.b.add(new axmq(awxt.g(did.ak(byteBuffer)), awxt.g(did.ak(byteBuffer))));
            ak = j;
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        byteBuffer.put(this.a.getBytes());
        if (s() == 1) {
            byteBuffer.put(this.c.getBytes());
        }
        did.aa(byteBuffer, this.b.size());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            did.aa(byteBuffer, ((axmq) it.next()).a);
            did.aa(byteBuffer, r1.b);
        }
    }
}
