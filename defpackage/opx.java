package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class opx implements ayrw {
    public final /* synthetic */ amsx a;
    private final /* synthetic */ int b;

    public /* synthetic */ opx(amsx amsxVar, int i) {
        this.b = i;
        this.a = amsxVar;
    }

    @Override // defpackage.ayrw
    public final boolean a(Object obj) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? !this.a.contains(((opl) obj).a) : !this.a.contains((fiw) obj);
        }
        return this.a.contains(((opl) obj).a);
    }
}
