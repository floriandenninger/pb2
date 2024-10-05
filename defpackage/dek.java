package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dek extends axks {
    public List a;

    public dek() {
        super("elst");
        this.a = new LinkedList();
    }

    @Override // defpackage.axkq
    protected final long h() {
        int size;
        if (s() == 1) {
            size = this.a.size() * 20;
        } else {
            size = this.a.size() * 12;
        }
        return size + 8;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        int g = awxt.g(did.ak(byteBuffer));
        this.a = new LinkedList();
        for (int i = 0; i < g; i++) {
            this.a.add(new dej(this, byteBuffer));
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.a.size());
        for (dej dejVar : this.a) {
            if (dejVar.a.s() == 1) {
                byteBuffer.putLong(dejVar.b);
                byteBuffer.putLong(dejVar.c);
            } else {
                did.aa(byteBuffer, awxt.g(dejVar.b));
                byteBuffer.putInt(awxt.g(dejVar.c));
            }
            did.W(byteBuffer, dejVar.d);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("EditListBox{entries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
