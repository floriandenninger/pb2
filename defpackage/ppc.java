package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ppc implements pox {
    @Override // defpackage.pox
    public final Metadata a(ppz ppzVar) {
        ByteBuffer byteBuffer = ppzVar.b;
        pse.c(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        pse.e(z);
        if (ppzVar.isDecodeOnly()) {
            return null;
        }
        return b(ppzVar, byteBuffer);
    }

    protected abstract Metadata b(ppz ppzVar, ByteBuffer byteBuffer);
}
