package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aidf implements amml {
    private final /* synthetic */ int v;
    public static final /* synthetic */ aidf u = new aidf(20);
    public static final /* synthetic */ aidf t = new aidf(19);
    public static final /* synthetic */ aidf s = new aidf(18);
    public static final /* synthetic */ aidf r = new aidf(17);
    public static final /* synthetic */ aidf q = new aidf(16);
    public static final /* synthetic */ aidf p = new aidf(15);
    public static final /* synthetic */ aidf o = new aidf(14);
    public static final /* synthetic */ aidf n = new aidf(13);
    public static final /* synthetic */ aidf m = new aidf(12);
    public static final /* synthetic */ aidf l = new aidf(11);
    public static final /* synthetic */ aidf k = new aidf(10);
    public static final /* synthetic */ aidf j = new aidf(9);
    public static final /* synthetic */ aidf i = new aidf(8);
    public static final /* synthetic */ aidf h = new aidf(7);
    public static final /* synthetic */ aidf g = new aidf(6);
    public static final /* synthetic */ aidf f = new aidf(5);
    public static final /* synthetic */ aidf e = new aidf(4);
    public static final /* synthetic */ aidf d = new aidf(3);
    public static final /* synthetic */ aidf c = new aidf(2);
    public static final /* synthetic */ aidf b = new aidf(1);
    public static final /* synthetic */ aidf a = new aidf(0);

    private /* synthetic */ aidf(int i2) {
        this.v = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((ajbl) obj).s();
            case 1:
                return ((ajbl) obj).S();
            case 2:
                return ((ajbl) obj).F();
            case 3:
                return ((ajbl) obj).s();
            case 4:
                return Boolean.valueOf(((awwk) obj).d);
            case 5:
                aoms aomsVar = ((awwk) obj).c;
                if (aomsVar == null) {
                    aomsVar = aoms.a;
                }
                return String.valueOf(aomsVar.b);
            case 6:
                return ((aioc) obj).ab();
            case 7:
                return ((ajbl) obj).J();
            case 8:
                return ((ajbl) obj).J();
            case 9:
                return ((aioc) obj).V();
            case 10:
                return ((ajbl) obj).J();
            case 11:
                aone aoneVar = (aone) obj;
                aoneVar.copyOnWrite();
                awwp awwpVar = (awwp) aoneVar.instance;
                awwp awwpVar2 = awwp.a;
                awwpVar.b |= 1;
                awwpVar.c = 1;
                return aoneVar;
            case 12:
                return Boolean.valueOf(((awwp) obj).c > 0);
            case 13:
                return ((ajbl) obj).t();
            case 14:
                return ((ajbl) obj).u();
            case 15:
                return ((ajbl) obj).G();
            case 16:
                return ((ajbl) obj).M();
            case 17:
                return ((ajbl) obj).U();
            case 18:
                return ((ajbl) obj).V();
            case 19:
                return ((ajbl) obj).W();
            default:
                return Boolean.valueOf(((awwm) obj).c);
        }
    }
}
