package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fih implements ayrv {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ fih(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            int i2 = this.a;
            amru amruVar = (amru) obj;
            int size = amruVar.size();
            if (i2 != -1) {
                amruVar = amruVar.subList(0, Math.min(i2, amruVar.size()));
            }
            return fie.a(size, amruVar);
        }
        if (i == 1) {
            return ete.f(this.a, ((etb) obj).a());
        }
        if (i != 2) {
            if (i != 3) {
                return Integer.valueOf(((Integer) obj).intValue() - this.a);
            }
            return Boolean.valueOf(((Integer) obj).intValue() == this.a);
        }
        int i3 = this.a;
        int i4 = jrk.b;
        return Integer.valueOf(i3 - ((amsx) obj).size());
    }
}
