package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class def extends axks {
    public List a;

    public def() {
        super("ctts");
        this.a = Collections.emptyList();
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (this.a.size() * 8) + 8;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int g = awxt.g(did.ak(byteBuffer));
        this.a = new ArrayList(g);
        for (int i = 0; i < g; i++) {
            this.a.add(new dee(awxt.g(did.ak(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.a.size());
        for (dee deeVar : this.a) {
            did.aa(byteBuffer, deeVar.a);
            byteBuffer.putInt(deeVar.b);
        }
    }
}
