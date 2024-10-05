package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nib implements ajtk {
    private final /* synthetic */ int a;

    public nib(int i) {
        this.a = i;
    }

    @Override // defpackage.ajtk
    public final Object a(Object obj) {
        Object mgeVar;
        if (this.a == 0) {
            return obj instanceof apoj ? new nia((apoj) obj) : obj;
        }
        if (obj instanceof augj) {
            mgeVar = new mgf((augj) obj);
        } else {
            if (!(obj instanceof augf)) {
                return !(obj instanceof auhl) ? obj : new mgg((auhl) obj);
            }
            mgeVar = new mge((augf) obj);
        }
        return mgeVar;
    }
}
