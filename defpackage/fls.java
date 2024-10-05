package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fls implements flt {
    public final aeb a = new aeb();
    public boolean b;

    @Override // defpackage.flt
    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        int i = 0;
        while (true) {
            aeb aebVar = this.a;
            if (i >= aebVar.b) {
                return;
            }
            ((flt) aebVar.b(i)).a(z);
            i++;
        }
    }
}
