package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfh extends axks {
    public final List a;

    public dfh() {
        super("subs");
        this.a = new ArrayList();
    }

    @Override // defpackage.axkq
    protected final long h() {
        long j = 8;
        for (dfg dfgVar : this.a) {
            j += 6;
            for (int i = 0; i < dfgVar.b.size(); i++) {
                j = j + (s() == 1 ? 4L : 2L) + 6;
            }
        }
        return j;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        long ak = did.ak(byteBuffer);
        for (int i = 0; i < ak; i++) {
            dfg dfgVar = new dfg();
            dfgVar.a = did.ak(byteBuffer);
            int ah = did.ah(byteBuffer);
            for (int i2 = 0; i2 < ah; i2++) {
                dff dffVar = new dff();
                dffVar.a = s() == 1 ? did.ak(byteBuffer) : did.ah(byteBuffer);
                dffVar.b = did.aj(byteBuffer);
                dffVar.c = did.aj(byteBuffer);
                dffVar.d = did.ak(byteBuffer);
                dfgVar.b.add(dffVar);
            }
            this.a.add(dfgVar);
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        did.aa(byteBuffer, this.a.size());
        for (dfg dfgVar : this.a) {
            did.aa(byteBuffer, dfgVar.a);
            did.Y(byteBuffer, dfgVar.b.size());
            for (dff dffVar : dfgVar.b) {
                if (s() != 1) {
                    did.Y(byteBuffer, awxt.g(dffVar.a));
                } else {
                    did.aa(byteBuffer, dffVar.a);
                }
                did.ab(byteBuffer, dffVar.b);
                did.ab(byteBuffer, dffVar.c);
                did.aa(byteBuffer, dffVar.d);
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
        sb.append("SubSampleInformationBox{entryCount=");
        sb.append(size);
        sb.append(", entries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
