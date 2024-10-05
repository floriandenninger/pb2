package defpackage;

import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajiy extends sni {
    private final acpl a;

    public ajiy(acpl acplVar) {
        this.a = acplVar;
    }

    @Override // defpackage.sni
    public final aomu a() {
        return asuc.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFunctionBinding
    public final StatusOr execute(byte[] bArr) {
        try {
            asuc asucVar = (asuc) aonm.parseFrom(asuc.a, bArr, aomw.a());
            acpl acplVar = this.a;
            arpp arppVar = asucVar.c;
            if (arppVar == null) {
                arppVar = arpp.d();
            }
            boolean c = acplVar.c(arppVar);
            aone createBuilder = asud.a.createBuilder();
            createBuilder.copyOnWrite();
            asud asudVar = (asud) createBuilder.instance;
            asudVar.b |= 1;
            asudVar.c = c;
            return StatusOr.fromValue(((asud) createBuilder.build()).toByteArray());
        } catch (aoob e) {
            return StatusOr.fromStatus(Status.e.c(e));
        }
    }
}
