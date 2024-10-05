package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahbz implements amml {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ahbz u = new ahbz(20);
    public static final /* synthetic */ ahbz t = new ahbz(19);
    public static final /* synthetic */ ahbz s = new ahbz(18);
    public static final /* synthetic */ ahbz r = new ahbz(17);
    public static final /* synthetic */ ahbz q = new ahbz(16);
    public static final /* synthetic */ ahbz p = new ahbz(15);
    public static final /* synthetic */ ahbz o = new ahbz(14);
    public static final /* synthetic */ ahbz n = new ahbz(13);
    public static final /* synthetic */ ahbz m = new ahbz(12);
    public static final /* synthetic */ ahbz l = new ahbz(11);
    public static final /* synthetic */ ahbz k = new ahbz(10);
    public static final /* synthetic */ ahbz j = new ahbz(9);
    public static final /* synthetic */ ahbz i = new ahbz(8);
    public static final /* synthetic */ ahbz h = new ahbz(7);
    public static final /* synthetic */ ahbz g = new ahbz(6);
    public static final /* synthetic */ ahbz f = new ahbz(5);
    public static final /* synthetic */ ahbz e = new ahbz(4);
    public static final /* synthetic */ ahbz d = new ahbz(3);
    public static final /* synthetic */ ahbz c = new ahbz(2);
    public static final /* synthetic */ ahbz b = new ahbz(1);
    public static final /* synthetic */ ahbz a = new ahbz(0);

    private /* synthetic */ ahbz(int i2) {
        this.v = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((ajbl) obj).L();
            case 1:
                return ((ajbl) obj).I();
            case 2:
                return ((ajbl) obj).U();
            case 3:
                return ((ajbl) obj).B();
            case 4:
                return ((ajbl) obj).D();
            case 5:
                return ((ajbl) obj).E();
            case 6:
                return ((ajbl) obj).H();
            case 7:
                return ((ajbl) obj).I();
            case 8:
                int i2 = ahot.a;
                aone builder = ((awwl) obj).toBuilder();
                builder.copyOnWrite();
                awwl awwlVar = (awwl) builder.instance;
                awwlVar.c = 2;
                awwlVar.b |= 1;
                return (awwl) builder.build();
            case 9:
                int i3 = ahot.a;
                aone builder2 = ((awwl) obj).toBuilder();
                builder2.copyOnWrite();
                awwl awwlVar2 = (awwl) builder2.instance;
                awwlVar2.c = 1;
                awwlVar2.b |= 1;
                return (awwl) builder2.build();
            case 10:
                aone builder3 = ((awwl) obj).toBuilder();
                builder3.copyOnWrite();
                awwl awwlVar3 = (awwl) builder3.instance;
                awwlVar3.b = 2 | awwlVar3.b;
                awwlVar3.d = false;
                return (awwl) builder3.build();
            case 11:
                return ((ajbl) obj).G();
            case 12:
                return ((ajbl) obj).G();
            case 13:
                return ((aioc) obj).V();
            case 14:
                return ((ajbl) obj).C();
            case 15:
                return ((aioc) obj).V();
            case 16:
                return ((aioc) obj).ab();
            case 17:
                return ((ajbl) obj).R();
            case 18:
                return ((ajbl) obj).W();
            case 19:
                return ((aioc) obj).V();
            default:
                return ((ajbl) obj).R();
        }
    }
}
