package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ens implements amml {
    private final /* synthetic */ int r;
    public static final /* synthetic */ ens q = new ens(18);
    public static final /* synthetic */ ens p = new ens(17);
    public static final /* synthetic */ ens o = new ens(16);
    public static final /* synthetic */ ens n = new ens(15);
    public static final /* synthetic */ ens m = new ens(14);
    public static final /* synthetic */ ens l = new ens(13);
    public static final /* synthetic */ ens k = new ens(12);
    public static final /* synthetic */ ens j = new ens(11);
    public static final /* synthetic */ ens i = new ens(10);
    public static final /* synthetic */ ens h = new ens(9);
    public static final /* synthetic */ ens g = new ens(8);
    public static final /* synthetic */ ens f = new ens(7);
    public static final /* synthetic */ ens e = new ens(6);
    public static final /* synthetic */ ens d = new ens(5);
    public static final /* synthetic */ ens c = new ens(4);
    public static final /* synthetic */ ens b = new ens(1);
    public static final /* synthetic */ ens a = new ens(0);

    public /* synthetic */ ens(int i2) {
        this.r = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.r) {
            case 0:
                return new Exception((Throwable) obj);
            case 1:
                return (pjq) obj;
            case 2:
                aone builder = ((eok) obj).toBuilder();
                builder.copyOnWrite();
                eok eokVar = (eok) builder.instance;
                eokVar.b |= 1024;
                eokVar.m = 1;
                return (eok) builder.build();
            case 3:
                aone builder2 = ((eok) obj).toBuilder();
                builder2.copyOnWrite();
                eok eokVar2 = (eok) builder2.instance;
                eokVar2.b |= 256;
                eokVar2.k = 1;
                return (eok) builder2.build();
            case 4:
                aqyg aqygVar = ((aprk) obj).j;
                return aqygVar == null ? aqyg.a : aqygVar;
            case 5:
                aqyg aqygVar2 = ((aprk) obj).h;
                return aqygVar2 == null ? aqyg.a : aqygVar2;
            case 6:
                apro aproVar = ((aprk) obj).g;
                if (aproVar == null) {
                    aproVar = apro.a;
                }
                if (aproVar.b == 105917786) {
                    return (aprn) aproVar.c;
                }
                return aprn.a;
            case 7:
                apro aproVar2 = ((aprk) obj).f;
                if (aproVar2 == null) {
                    aproVar2 = apro.a;
                }
                if (aproVar2.b == 105917786) {
                    return (aprn) aproVar2.c;
                }
                return aprn.a;
            case 8:
                apro aproVar3 = ((aprk) obj).e;
                if (aproVar3 == null) {
                    aproVar3 = apro.a;
                }
                if (aproVar3.b == 105917786) {
                    return (aprn) aproVar3.c;
                }
                return aprn.a;
            case 9:
                aprm aprmVar = ((aprk) obj).c;
                if (aprmVar == null) {
                    aprmVar = aprm.a;
                }
                if (aprmVar.b == 109219466) {
                    return (aprl) aprmVar.c;
                }
                return aprl.a;
            case 10:
                aprm aprmVar2 = ((aprk) obj).d;
                if (aprmVar2 == null) {
                    aprmVar2 = aprm.a;
                }
                if (aprmVar2.b == 109219466) {
                    return (aprl) aprmVar2.c;
                }
                return aprl.a;
            case 11:
                apxf apxfVar = ((aprl) obj).d;
                return apxfVar == null ? apxf.a : apxfVar;
            case 12:
                avgg avggVar = ((aprl) obj).c;
                return avggVar == null ? avgg.a : avggVar;
            case 13:
                return Boolean.valueOf((((aprl) obj).b & 2) != 0);
            case 14:
                return ((PlayerResponseModel) obj).a;
            case 15:
                aone builder3 = ((evq) obj).toBuilder();
                builder3.copyOnWrite();
                evq evqVar = (evq) builder3.instance;
                evqVar.b |= 2;
                evqVar.d = true;
                return (evq) builder3.build();
            case 16:
                return ((aioc) obj).V();
            case 17:
                return ((ajbl) obj).J();
            case 18:
                return new Exception((Throwable) obj);
            case 19:
                aone builder4 = ((fke) obj).toBuilder();
                builder4.copyOnWrite();
                fke fkeVar = (fke) builder4.instance;
                fkeVar.b |= 2;
                fkeVar.d = false;
                return (fke) builder4.build();
            default:
                aone builder5 = ((fkg) obj).toBuilder();
                builder5.copyOnWrite();
                fkg fkgVar = (fkg) builder5.instance;
                fkgVar.b |= 4;
                fkgVar.e = true;
                return (fkg) builder5.build();
        }
    }
}
