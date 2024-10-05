package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afly implements ayrv {
    private final /* synthetic */ int u;
    public static final /* synthetic */ afly t = new afly(20);
    public static final /* synthetic */ afly s = new afly(19);
    public static final /* synthetic */ afly r = new afly(18);
    public static final /* synthetic */ afly q = new afly(17);
    public static final /* synthetic */ afly p = new afly(16);
    public static final /* synthetic */ afly o = new afly(15);
    public static final /* synthetic */ afly n = new afly(14);
    public static final /* synthetic */ afly m = new afly(13);
    public static final /* synthetic */ afly l = new afly(12);
    public static final /* synthetic */ afly k = new afly(11);
    public static final /* synthetic */ afly j = new afly(10);
    public static final /* synthetic */ afly i = new afly(8);
    public static final /* synthetic */ afly h = new afly(7);
    public static final /* synthetic */ afly g = new afly(6);
    public static final /* synthetic */ afly f = new afly(5);
    public static final /* synthetic */ afly e = new afly(4);
    public static final /* synthetic */ afly d = new afly(3);
    public static final /* synthetic */ afly c = new afly(2);
    public static final /* synthetic */ afly b = new afly(1);
    public static final /* synthetic */ afly a = new afly(0);

    public /* synthetic */ afly(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        bajg b2;
        aypy W;
        switch (this.u) {
            case 0:
                return (byte[]) ((ammv) obj).c();
            case 1:
                atcl atclVar = ((arfd) obj).i;
                if (atclVar == null) {
                    atclVar = atcl.a;
                }
                apks apksVar = atclVar.e;
                return apksVar == null ? apks.a : apksVar;
            case 2:
                try {
                    return aypy.W((aufh) aonm.parseFrom(aufh.a, (byte[]) obj, aomw.b()));
                } catch (aoob e2) {
                    return aypy.J(e2);
                }
            case 3:
                aufh aufhVar = (aufh) obj;
                if ((aufhVar.b & 32) == 0) {
                    bajn k2 = bajn.k();
                    if (k2 == null) {
                        throw new NullPointerException("Zone must not be null");
                    }
                    bajg bajgVar = new bajg(k2);
                    int n2 = 60 - bajgVar.n();
                    if (n2 < 15) {
                        n2 += 60;
                    }
                    b2 = bajgVar.b(n2);
                } else {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    aufi aufiVar = aufhVar.e;
                    if (aufiVar == null) {
                        aufiVar = aufi.a;
                    }
                    b2 = new bajg(timeUnit.toMillis(aufiVar.c));
                }
                return new afme(b2, aufhVar);
            case 4:
                return (byte[]) ((ammv) obj).c();
            case 5:
                ammv ammvVar = (ammv) obj;
                try {
                    if (!ammvVar.h()) {
                        aone createBuilder = awrc.a.createBuilder();
                        createBuilder.copyOnWrite();
                        awrc awrcVar = (awrc) createBuilder.instance;
                        awrcVar.f = 1;
                        awrcVar.b |= 64;
                        W = aypy.W((awrc) createBuilder.build());
                    } else {
                        W = aypy.W((awrc) aonm.parseFrom(awrc.a, (byte[]) ammvVar.c(), aomw.b()));
                    }
                    return W;
                } catch (aoob e3) {
                    return aypy.J(e3);
                }
            case 6:
                try {
                    return aypy.W((aven) aonm.parseFrom(aven.a, (byte[]) obj, aomw.b()));
                } catch (aoob e4) {
                    return aypy.J(e4);
                }
            case 7:
                return ((Bundle) obj).getString("authtoken");
            case 8:
                atog atogVar = ((arfd) obj).p;
                if (atogVar == null) {
                    atogVar = atog.a;
                }
                atob atobVar = atogVar.h;
                return atobVar == null ? atob.a : atobVar;
            case 9:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 0) {
                    return afzv.b();
                }
                boolean z = false;
                int i2 = 0;
                boolean z2 = true;
                for (Object obj2 : objArr) {
                    if (obj2 instanceof afzv) {
                        afzv afzvVar = (afzv) obj2;
                        z = z || afzvVar.a;
                        boolean z3 = afzvVar.c;
                        i2 += z3 ? 0 : afzvVar.b;
                        z2 = z2 && z3;
                    }
                }
                return afzv.a(z, i2, z2);
            case 10:
                return ((ahel) obj).a().X();
            case 11:
                return (aakt) ((ammv) obj).c();
            case 12:
                return Boolean.valueOf(((ahef) obj).c().a(aign.PLAYBACK_INTERRUPTED, aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING));
            case 13:
                return Boolean.valueOf(((awwk) obj).d);
            case 14:
                final ajbl a2 = ((ahel) obj).a();
                return a2.x().A(new ayrv() { // from class: ahwo
                    @Override // defpackage.ayrv
                    public final Object a(Object obj3) {
                        return new Object[]{ajbl.this, (afih) obj3};
                    }
                });
            case 15:
                zga.f("WillAutonavInformer", "Error retrieving isAutoNavDisabled, assuming restricted.", (Throwable) obj);
                return false;
            case 16:
                return ((ahel) obj).a().X();
            case 17:
                return ((ahel) obj).a().X();
            case 18:
                return ammv.j(Boolean.valueOf(((awwm) obj).c));
            case 19:
                return ((ahds) obj).b();
            default:
                return ((akpc) obj).b;
        }
    }
}
