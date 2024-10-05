package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfc extends axks {
    public List a;

    public dfc() {
        super("stsc");
        this.a = Collections.emptyList();
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (this.a.size() * 12) + 8;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int g = awxt.g(did.ak(byteBuffer));
        this.a = new ArrayList(g);
        for (int i = 0; i < g; i++) {
            this.a.add(new dfb(did.ak(byteBuffer), did.ak(byteBuffer), did.ak(byteBuffer)));
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.a.size());
        for (dfb dfbVar : this.a) {
            did.aa(byteBuffer, dfbVar.a);
            did.aa(byteBuffer, dfbVar.b);
            did.aa(byteBuffer, dfbVar.c);
        }
    }

    public final String toString() {
        int size = this.a.size();
        StringBuilder sb = new StringBuilder(40);
        sb.append("SampleToChunkBox[entryCount=");
        sb.append(size);
        sb.append("]");
        return sb.toString();
    }
}
