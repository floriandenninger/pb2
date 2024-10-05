package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ppe extends ppc {
    public static final EventMessage c(pth pthVar) {
        String t = pthVar.t();
        pse.c(t);
        String t2 = pthVar.t();
        pse.c(t2);
        return new EventMessage(t, t2, pthVar.o(), pthVar.o(), Arrays.copyOfRange(pthVar.a, pthVar.b, pthVar.c));
    }

    @Override // defpackage.ppc
    protected final Metadata b(ppz ppzVar, ByteBuffer byteBuffer) {
        return new Metadata(c(new pth(byteBuffer.array(), byteBuffer.limit())));
    }
}
