package defpackage;

import com.google.protos.youtube.api.innertube.CpidRefreshCommandOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjm implements aaha {
    private final zju a;

    public zjm(zju zjuVar) {
        this.a = zjuVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqgp aqgpVar = (aqgp) apxfVar.pX(CpidRefreshCommandOuterClass.cpidRefreshCommand);
        if ((aqgpVar.b & 1) != 0) {
            this.a.c(aqgpVar.c);
        }
    }
}
