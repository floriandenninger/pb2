package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class uxh implements uxi {
    public final /* synthetic */ Class a;
    private final /* synthetic */ int b;

    public /* synthetic */ uxh(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    @Override // defpackage.uxi
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return (Double) this.a.cast(obj);
        }
        if (i != 1) {
            return i != 2 ? (String) this.a.cast(obj) : (Long) this.a.cast(obj);
        }
        return (Boolean) this.a.cast(obj);
    }
}
