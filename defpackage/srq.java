package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class srq implements srr {
    private final sww a;
    private final szz b;
    private final /* synthetic */ int c;

    public srq(sww swwVar, szz szzVar, int i) {
        this.c = i;
        this.a = swwVar;
        this.b = szzVar;
    }

    @Override // defpackage.srr
    public final int a() {
        return this.c != 0 ? 334827261 : 336816453;
    }

    @Override // defpackage.srr
    public final /* synthetic */ IntersectionObserver b(aoam aoamVar, swu swuVar) {
        if (this.c == 0) {
            return new srp((axor) aoamVar, this.a, swuVar, this.b);
        }
        return new srn((axom) aoamVar, this.a, swuVar, this.b);
    }

    @Override // defpackage.srr
    public final /* synthetic */ aoam c(aoam aoamVar) {
        if (this.c == 0) {
            ByteBuffer V = aoamVar.V();
            axor axorVar = new axor();
            V.order(ByteOrder.LITTLE_ENDIAN);
            axorVar.f(V.getInt(V.position()) + V.position(), V);
            return axorVar;
        }
        ByteBuffer V2 = aoamVar.V();
        axom axomVar = new axom();
        V2.order(ByteOrder.LITTLE_ENDIAN);
        axomVar.f(V2.getInt(V2.position()) + V2.position(), V2);
        return axomVar;
    }
}
