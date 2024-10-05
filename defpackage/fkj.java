package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fkj implements ywl {
    public final /* synthetic */ vfm a;
    private final /* synthetic */ int b;

    public /* synthetic */ fkj(vfm vfmVar, int i) {
        this.b = i;
        this.a = vfmVar;
    }

    @Override // defpackage.ywl
    public final Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return Long.valueOf(this.a.b((String) obj, ((Long) obj2).longValue()));
        }
        if (i == 1) {
            return Boolean.valueOf(this.a.f((String) obj, ((Boolean) obj2).booleanValue()));
        }
        if (i == 2) {
            return this.a.d((String) obj, (String) obj2);
        }
        if (i == 3) {
            return Boolean.valueOf(this.a.f((String) obj, ((Boolean) obj2).booleanValue()));
        }
        if (i != 4) {
            return Long.valueOf(this.a.b((String) obj, ((Long) obj2).longValue()));
        }
        return Integer.valueOf(this.a.a((String) obj, ((Integer) obj2).intValue()));
    }
}
