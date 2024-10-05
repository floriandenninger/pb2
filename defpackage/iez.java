package defpackage;

import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iez implements aaha {
    private final iip a;
    private final gru b;

    public iez(iip iipVar, gru gruVar) {
        this.a = iipVar;
        this.b = gruVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Optional a = this.a.a();
        atdf atdfVar = ((MenuEndpointOuterClass$MenuEndpoint) apxfVar.pX(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        atdc atdcVar = atdfVar.c;
        if (atdcVar == null) {
            atdcVar = atdc.a;
        }
        if (!atdcVar.k || !a.isPresent()) {
            this.b.kE(apxfVar, map);
        } else {
            ((iiq) a.get()).r(atdcVar);
        }
    }
}
