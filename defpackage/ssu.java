package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ssu implements sym {
    @Override // defpackage.sym
    public final int a() {
        return 386544496;
    }

    @Override // defpackage.sym
    public final /* synthetic */ aoam b(ByteBuffer byteBuffer) {
        axou axouVar = new axou();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axouVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axouVar;
    }

    @Override // defpackage.syn
    public final /* bridge */ /* synthetic */ void c(dhe dheVar, sxc sxcVar, String str, Object obj, sxs sxsVar, swt swtVar) {
        sxsVar.t((axou) obj);
    }

    @Override // defpackage.syn
    public final /* synthetic */ void e(sxs sxsVar) {
    }
}
