package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dex extends axks {
    public List a;

    public dex() {
        super("sdtp");
        this.a = new ArrayList();
    }

    @Override // defpackage.axkq
    protected final long h() {
        return this.a.size() + 4;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.a.add(new dew(did.aj(byteBuffer)));
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            did.ab(byteBuffer, ((dew) it.next()).a);
        }
    }

    public final String toString() {
        return "SampleDependencyTypeBox{entries=" + this.a + '}';
    }
}
