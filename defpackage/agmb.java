package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmb implements agoy {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final aais e;
    private final shf f;
    private final ypa g;

    public agmb(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, shf shfVar, ypa ypaVar, aais aaisVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.f = shfVar;
        this.g = ypaVar;
        this.e = aaisVar;
    }

    private final agou d(afsx afsxVar, String str, atpo atpoVar) {
        amru r;
        int bO;
        atqq r2;
        int bO2;
        agsn a = ((agof) this.c.get()).a();
        if (!afsxVar.d().equals(a.q())) {
            return agou.b;
        }
        agil A = a.A();
        if (A == null) {
            return agou.b;
        }
        try {
            ammv ammvVar = (ammv) a.m().h(str).get(30L, TimeUnit.SECONDS);
            if (ammvVar.h()) {
                PlayerResponseModel m = A.m(str);
                if (m == null || (r2 = m.r()) == null || (bO2 = anaf.bO(r2.h)) == 0 || bO2 != 2) {
                    try {
                        PlayerResponseModel l = ((agzx) this.a.get()).l(str, 2, ((atwy) atpoVar.pX(atwy.b)).d.I());
                        boolean G = A.G(str, l, this.f.c(), true, (aapf) this.b.get());
                        atqq r3 = l.r();
                        boolean z = false;
                        if (ahbx.l(l.q()) && r3 != null && (bO = anaf.bO(r3.h)) != 0 && bO == 2) {
                            z = true;
                        }
                        if (!z) {
                            A.V(str, agnf.CANNOT_OFFLINE);
                            try {
                                ammvVar = (ammv) a.m().h(str).get(30L, TimeUnit.SECONDS);
                            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                            }
                            if (ammvVar.h()) {
                                this.g.f(new agli((agnv) ammvVar.c(), atqs.NOT_PLAYABLE));
                            }
                        }
                        if (!G || !z) {
                            return agou.c;
                        }
                        agot a2 = agou.a();
                        a2.a = 2;
                        atwy atwyVar = (atwy) atpoVar.pX(atwy.b);
                        int i = (atwyVar.c & 64) != 0 ? atwyVar.i : -1;
                        aong aongVar = (aong) atpoVar.toBuilder();
                        aongVar.copyOnWrite();
                        atpo atpoVar2 = (atpo) aongVar.instance;
                        atpoVar2.c |= 1;
                        atpoVar2.d = i;
                        atpo atpoVar3 = (atpo) aongVar.build();
                        aone createBuilder = atpq.a.createBuilder();
                        createBuilder.copyOnWrite();
                        atpq atpqVar = (atpq) createBuilder.instance;
                        atpqVar.c = 1;
                        atpqVar.b |= 1;
                        String f = aalt.f(120, str);
                        createBuilder.copyOnWrite();
                        atpq atpqVar2 = (atpq) createBuilder.instance;
                        f.getClass();
                        atpqVar2.b |= 2;
                        atpqVar2.d = f;
                        createBuilder.copyOnWrite();
                        atpq atpqVar3 = (atpq) createBuilder.instance;
                        atpoVar3.getClass();
                        atpqVar3.e = atpoVar3;
                        atpqVar3.b |= 4;
                        atpq atpqVar4 = (atpq) createBuilder.build();
                        VideoStreamingData videoStreamingData = l.c;
                        if (videoStreamingData == null || videoStreamingData.o().isEmpty()) {
                            r = amru.r(atpqVar4);
                        } else {
                            aone createBuilder2 = atpq.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            atpq atpqVar5 = (atpq) createBuilder2.instance;
                            atpqVar5.c = 1;
                            atpqVar5.b = 1 | atpqVar5.b;
                            String f2 = aalt.f(146, str);
                            createBuilder2.copyOnWrite();
                            atpq atpqVar6 = (atpq) createBuilder2.instance;
                            f2.getClass();
                            atpqVar6.b |= 2;
                            atpqVar6.d = f2;
                            createBuilder2.copyOnWrite();
                            atpq atpqVar7 = (atpq) createBuilder2.instance;
                            atpoVar3.getClass();
                            atpqVar7.e = atpoVar3;
                            atpqVar7.b |= 4;
                            createBuilder2.aG(atpqVar4);
                            r = amru.r((atpq) createBuilder2.build());
                        }
                        a2.b(r);
                        return a2.a();
                    } catch (aasx unused2) {
                        return agou.c;
                    }
                }
                return agou.a;
            }
            return agou.c;
        } catch (InterruptedException | ExecutionException | TimeoutException unused3) {
            return agou.b;
        }
    }

    private static amru e(int i) {
        amrp f = amru.f();
        for (int i2 = 0; i2 < i; i2++) {
            f.h(agou.b);
        }
        return f.g();
    }

    private final void f(agsn agsnVar, long j, atqq atqqVar, agnu agnuVar) {
        agst l = agsnVar.l();
        agnt c = agnuVar.c();
        c.b = atqqVar;
        c.d = j;
        if (l.k(c.a())) {
            this.g.d(new aglh(agnuVar.a));
        } else {
            String str = agnuVar.a;
            zga.b(str.length() != 0 ? "[Offline] UpdateVideoPolicy failed for video ".concat(str) : new String("[Offline] UpdateVideoPolicy failed for video "));
        }
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0229  */
    @Override // defpackage.agoy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy b(defpackage.afsx r27, defpackage.atpq r28) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmb.b(afsx, atpq):anhy");
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        throw new UnsupportedOperationException();
    }
}
