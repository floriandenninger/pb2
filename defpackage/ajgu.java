package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajgu implements ajhm {
    private final /* synthetic */ int l;
    public static final /* synthetic */ ajgu k = new ajgu(10);
    public static final /* synthetic */ ajgu j = new ajgu(9);
    public static final /* synthetic */ ajgu i = new ajgu(8);
    public static final /* synthetic */ ajgu h = new ajgu(7);
    public static final /* synthetic */ ajgu g = new ajgu(6);
    public static final /* synthetic */ ajgu f = new ajgu(5);
    public static final /* synthetic */ ajgu e = new ajgu(4);
    public static final /* synthetic */ ajgu d = new ajgu(3);
    public static final /* synthetic */ ajgu c = new ajgu(2);
    public static final /* synthetic */ ajgu b = new ajgu(1);
    public static final /* synthetic */ ajgu a = new ajgu(0);

    private /* synthetic */ ajgu(int i2) {
        this.l = i2;
    }

    @Override // defpackage.ajhm
    public final void a(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                ((ajha) obj).I = Boolean.valueOf(((Boolean) obj2).booleanValue());
                return;
            case 1:
                ((ajha) obj).F = Boolean.valueOf(((Boolean) obj2).booleanValue());
                return;
            case 2:
                ((ajha) obj).q = Boolean.valueOf(((Boolean) obj2).booleanValue());
                return;
            case 3:
                ((ajha) obj).B = Float.valueOf(((Float) obj2).floatValue());
                return;
            case 4:
                ((ajha) obj).h = Float.valueOf(((Float) obj2).floatValue());
                return;
            case 5:
                ((ajha) obj).M = Float.valueOf(((Float) obj2).floatValue());
                return;
            case 6:
                ((ajha) obj).b = Integer.valueOf(((Integer) obj2).intValue());
                return;
            case 7:
                ((ajha) obj).j = Integer.valueOf(((Integer) obj2).intValue());
                return;
            case 8:
                ((ajha) obj).t = Integer.valueOf(((Integer) obj2).intValue());
                return;
            case 9:
                ((ajha) obj).E = Integer.valueOf(((Integer) obj2).intValue());
                return;
            default:
                String str = (String) obj2;
                if (str != null) {
                    ((ajha) obj).i = str;
                    return;
                }
                throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
        }
    }
}
