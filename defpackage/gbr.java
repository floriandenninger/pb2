package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gbr implements amml {
    private final /* synthetic */ int u;
    public static final /* synthetic */ gbr t = new gbr(20);
    public static final /* synthetic */ gbr s = new gbr(19);
    public static final /* synthetic */ gbr r = new gbr(18);
    public static final /* synthetic */ gbr q = new gbr(17);
    public static final /* synthetic */ gbr p = new gbr(16);
    public static final /* synthetic */ gbr o = new gbr(15);
    public static final /* synthetic */ gbr n = new gbr(14);
    public static final /* synthetic */ gbr m = new gbr(13);
    public static final /* synthetic */ gbr l = new gbr(12);
    public static final /* synthetic */ gbr k = new gbr(11);
    public static final /* synthetic */ gbr j = new gbr(10);
    public static final /* synthetic */ gbr i = new gbr(9);
    public static final /* synthetic */ gbr h = new gbr(8);
    public static final /* synthetic */ gbr g = new gbr(6);
    public static final /* synthetic */ gbr f = new gbr(5);
    public static final /* synthetic */ gbr e = new gbr(4);
    public static final /* synthetic */ gbr d = new gbr(3);
    public static final /* synthetic */ gbr c = new gbr(2);
    public static final /* synthetic */ gbr b = new gbr(1);
    public static final /* synthetic */ gbr a = new gbr(0);

    public /* synthetic */ gbr(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        boolean z = false;
        z = false;
        switch (this.u) {
            case 0:
                return ((ajbl) obj).M();
            case 1:
                return ((aioc) obj).ab();
            case 2:
                return ((aioc) obj).V();
            case 3:
                return ((ajbl) obj).J();
            case 4:
                return ((Boolean) obj).booleanValue() ? gkw.ENABLED : gkw.APP_DISABLED;
            case 5:
                return ((gnh) obj).f;
            case 6:
                return Boolean.valueOf(((gnh) obj).e);
            case 7:
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    return Optional.empty();
                }
                aakt aaktVar = (aakt) optional.get();
                if (aaktVar instanceof awil) {
                    return Optional.of(evr.bQ((awil) aaktVar));
                }
                if (aaktVar instanceof asxs) {
                    return Optional.of(evr.bP((asxs) aaktVar));
                }
                return Optional.empty();
            case 8:
                fzf fzfVar = (fzf) obj;
                fzfVar.d(amvs.a);
                return fzfVar;
            case 9:
                return aork.a;
            case 10:
                return ((aioc) obj).V();
            case 11:
                return ((ajbl) obj).J();
            case 12:
                return amru.n(amkq.bg((List) obj, eri.t));
            case 13:
                Integer num = (Integer) obj;
                acsc acscVar = hda.a;
                if (num != null && num.intValue() < 3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                idr idrVar = (idr) obj;
                acsc acscVar2 = hda.a;
                return Integer.valueOf(idrVar != null ? idrVar.o : 0);
            case 15:
                idr idrVar2 = (idr) obj;
                acsc acscVar3 = hda.a;
                int i2 = idrVar2.o;
                aone builder = idrVar2.toBuilder();
                builder.copyOnWrite();
                ((idr) builder.instance).o = i2 + 1;
                return (idr) builder.build();
            case 16:
                return Long.valueOf(((pom) obj).p());
            case 17:
                return Long.valueOf(((pom) obj).q());
            case 18:
                return Boolean.valueOf(((pom) obj).h());
            case 19:
                amru amruVar = hmc.a;
                aone builder2 = ((hqe) obj).toBuilder();
                builder2.copyOnWrite();
                ((hqe) builder2.instance).b = true;
                return (hqe) builder2.build();
            default:
                int i3 = htu.ax;
                aone builder3 = ((idr) obj).toBuilder();
                builder3.copyOnWrite();
                ((idr) builder3.instance).n = true;
                return (idr) builder3.build();
        }
    }
}
