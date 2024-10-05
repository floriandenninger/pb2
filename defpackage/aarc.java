package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aarc implements zfh {
    private final /* synthetic */ int d;
    public static final /* synthetic */ aarc c = new aarc(2);
    public static final /* synthetic */ aarc b = new aarc(1);
    public static final /* synthetic */ aarc a = new aarc(0);

    private /* synthetic */ aarc(int i) {
        this.d = i;
    }

    @Override // defpackage.zfh
    public final void a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            aarh.e((String) obj, (Throwable) obj2);
            return;
        }
        if (i == 1) {
            String d = ammx.d((String) obj);
            if (obj2 == null) {
                afsi.b(1, 18, d);
                return;
            } else {
                afsi.c(1, 18, d, (Throwable) obj2);
                return;
            }
        }
        akbc.r((String) obj, (Throwable) obj2);
    }
}
