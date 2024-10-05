package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajgy implements ajhk {
    private final /* synthetic */ int l;
    public static final /* synthetic */ ajgy k = new ajgy(10);
    public static final /* synthetic */ ajgy j = new ajgy(9);
    public static final /* synthetic */ ajgy i = new ajgy(8);
    public static final /* synthetic */ ajgy h = new ajgy(7);
    public static final /* synthetic */ ajgy g = new ajgy(6);
    public static final /* synthetic */ ajgy f = new ajgy(5);
    public static final /* synthetic */ ajgy e = new ajgy(4);
    public static final /* synthetic */ ajgy d = new ajgy(3);
    public static final /* synthetic */ ajgy c = new ajgy(2);
    public static final /* synthetic */ ajgy b = new ajgy(1);
    public static final /* synthetic */ ajgy a = new ajgy(0);

    private /* synthetic */ ajgy(int i2) {
        this.l = i2;
    }

    @Override // defpackage.ajhk
    public final Object a(Object obj) {
        r1 = true;
        boolean z = true;
        switch (this.l) {
            case 0:
                return Boolean.valueOf(((aulu) obj).y);
            case 1:
                return Boolean.valueOf(((aulu) obj).o);
            case 2:
                return Integer.valueOf(((aulu) obj).q);
            case 3:
                return Boolean.valueOf(((aulu) obj).r);
            case 4:
                return Boolean.valueOf(((aulu) obj).s);
            case 5:
                return Integer.valueOf(((aulu) obj).O);
            case 6:
                return Float.valueOf(((aulu) obj).Q);
            case 7:
                return Boolean.valueOf(((aulu) obj).N);
            case 8:
                return Boolean.valueOf(((aulu) obj).P);
            case 9:
                amru amruVar = ajhe.a;
                return Integer.valueOf(true == ((aulu) obj).j.equals("canary") ? 2 : 1);
            default:
                amru amruVar2 = ajhe.a;
                aulu auluVar = (aulu) obj;
                if (!auluVar.t && !auluVar.u) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
