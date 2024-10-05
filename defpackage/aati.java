package defpackage;

import com.google.protos.youtube.api.innertube.RequiredSignInRendererOuterClass;
import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aati {
    public final arip a;
    public aatd b;
    private List c;
    private aumf d;

    public aati(arip aripVar) {
        this.a = aripVar;
    }

    public final aata a() {
        arip aripVar = this.a;
        if (aripVar != null) {
            apxf apxfVar = aripVar.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint)) {
                apxf apxfVar2 = this.a.d;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                String a = new aatj((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) apxfVar2.pX(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint)).a();
                if (a == null) {
                    return null;
                }
                for (aata aataVar : c()) {
                    if (aataVar.l() && a.equals(aataVar.i())) {
                        return aataVar;
                    }
                }
            }
        }
        return null;
    }

    public final aumf b() {
        arip aripVar;
        if (this.d == null && (aripVar = this.a) != null) {
            aulq aulqVar = aripVar.f;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(RequiredSignInRendererOuterClass.requiredSignInRenderer)) {
                aulq aulqVar2 = this.a.f;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                this.d = (aumf) aulqVar2.pX(RequiredSignInRendererOuterClass.requiredSignInRenderer);
            }
        }
        return this.d;
    }

    public final List c() {
        if (this.c == null) {
            LinkedList linkedList = new LinkedList();
            for (ariq ariqVar : this.a.c) {
                if (ariqVar.b == 77108254) {
                    for (aovg aovgVar : ((aovh) ariqVar.c).c) {
                        if (aovgVar.b == 63434476) {
                            for (aovd aovdVar : ((aove) aovgVar.c).b) {
                                if (aovdVar.b == 62381864) {
                                    aata aataVar = new aata((aova) aovdVar.c);
                                    aataVar.a().getClass();
                                    if (!aataVar.d().pY(aupc.b)) {
                                        if (aataVar.l()) {
                                            if (aataVar.n()) {
                                                zhq.m(aataVar.k());
                                            } else {
                                                zhq.m(aataVar.i());
                                            }
                                        }
                                        linkedList.add(aataVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.c = Collections.unmodifiableList(linkedList);
        }
        return this.c;
    }
}
