package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.io.IOException;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aabu implements aapu {
    private final cnd a;
    private final ahzq b;

    public aabu(cnd cndVar, ahzq ahzqVar) {
        cndVar.getClass();
        this.a = cndVar;
        ahzqVar.getClass();
        this.b = ahzqVar;
    }

    @Override // defpackage.aapu
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apxf apxfVar = (apxf) obj;
        if (ahzq.a(apxfVar)) {
            amkq.N(ahzq.a(apxfVar));
            awdq awdqVar = ((awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint)).m;
            if (awdqVar == null) {
                awdqVar = awdq.a;
            }
            atxn atxnVar = awdqVar.d;
            if (atxnVar == null) {
                atxnVar = atxn.a;
            }
            byte[] I = atxnVar.c.I();
            ahzq ahzqVar = this.b;
            aijr d = ((aijp) ahzqVar.a.get()).d();
            awdp awdpVar = (awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint);
            int i = awdpVar.b;
            if ((i & 1) != 0) {
                d.b = awdpVar.d;
            }
            if ((i & 2) != 0) {
                d.d = awdpVar.e;
            }
            if ((i & 4) != 0) {
                d.s = awdpVar.f;
            }
            if ((i & 512) != 0) {
                d.c = awdpVar.l;
            }
            d.l(apxfVar.c);
            d.j = true;
            ahzqVar.b.qZ(d);
            String b = d.b();
            arnd arndVar = null;
            if (I != null) {
                try {
                    aomk O = aomk.O(I);
                    int n = O.n();
                    while (true) {
                        if (n == 0) {
                            break;
                        }
                        if (aoqp.a(n) == 1) {
                            arnd arndVar2 = arnd.a;
                            aomw b2 = aomw.b();
                            int k = ((aomg) O).k();
                            O.P();
                            int f = ((aomg) O).f(k);
                            ((aomg) O).a++;
                            aonm parsePartialFrom = aonm.parsePartialFrom(arndVar2, O, b2);
                            ((aomg) O).B(0);
                            ((aomg) O).a--;
                            if (((aomg) O).d() != 0) {
                                throw aoob.j();
                            }
                            ((aomg) O).C(f);
                            arndVar = (arnd) parsePartialFrom;
                        } else {
                            O.G(n);
                            n = O.n();
                        }
                    }
                } catch (IOException e) {
                    try {
                        throw new aoob(e.getMessage());
                    } catch (aoob e2) {
                        String valueOf = String.valueOf(e2.getLocalizedMessage());
                        zga.l(valueOf.length() != 0 ? "Failed to parse inlined prefetch data: ".concat(valueOf) : new String("Failed to parse inlined prefetch data: "));
                    }
                }
            }
            cnc dy = adyu.dy(I, Collections.emptyMap(), arndVar);
            if (dy != null) {
                this.a.d(b, dy);
            }
        }
    }
}
