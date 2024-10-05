package defpackage;

import com.google.protos.youtube.api.innertube.SignOutEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eim implements aaha {
    public final aahd a;
    private final aftn b;
    private final afte c;
    private final ci d;

    public eim(aftn aftnVar, afte afteVar, aahd aahdVar, ci ciVar) {
        this.b = aftnVar;
        this.c = afteVar;
        this.a = aahdVar;
        this.d = ciVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, final Map map) {
        if (!apxfVar.pY(SignOutEndpointOuterClass.signOutEndpoint) || (((auus) apxfVar.pX(SignOutEndpointOuterClass.signOutEndpoint)).b & 2) == 0) {
            this.b.qj("User requested sign out.");
            return;
        }
        final auus auusVar = (auus) apxfVar.pX(SignOutEndpointOuterClass.signOutEndpoint);
        afte afteVar = this.c;
        auur auurVar = auusVar.c;
        if (auurVar == null) {
            auurVar = auur.a;
        }
        afteVar.d(auurVar.b);
        if ((auusVar.b & 4) != 0) {
            ynm.n(this.d, this.c.b(), ept.b, new zfi() { // from class: eil
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    eim eimVar = eim.this;
                    auus auusVar2 = auusVar;
                    Map map2 = map;
                    if (((Boolean) obj).booleanValue()) {
                        apxf apxfVar2 = auusVar2.d;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        eimVar.a.c(whu.f(apxfVar2), map2);
                    }
                }
            });
        }
    }
}
