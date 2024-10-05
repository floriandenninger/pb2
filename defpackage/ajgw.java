package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajgw implements ajhf {
    private final /* synthetic */ int f;
    public static final /* synthetic */ ajgw e = new ajgw(4);
    public static final /* synthetic */ ajgw d = new ajgw(3);
    public static final /* synthetic */ ajgw c = new ajgw(2);
    public static final /* synthetic */ ajgw b = new ajgw(1);
    public static final /* synthetic */ ajgw a = new ajgw(0);

    private /* synthetic */ ajgw(int i) {
        this.f = i;
    }

    @Override // defpackage.ajhf
    public final void a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            ((ajhc) obj).o = Float.valueOf(((Float) obj2).floatValue());
            return;
        }
        if (i == 1) {
            ((ajhc) obj).j = Boolean.valueOf(((Boolean) obj2).booleanValue());
        } else if (i == 2) {
            ((ajhc) obj).b = Float.valueOf(((Float) obj2).floatValue());
        } else if (i == 3) {
            ((ajhc) obj).n = Integer.valueOf(((Integer) obj2).intValue());
        } else {
            ((ajhc) obj).a = Integer.valueOf(((Integer) obj2).intValue());
        }
    }
}
