package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mas implements ayrs {
    public final /* synthetic */ maw a;
    private final /* synthetic */ int b;

    public /* synthetic */ mas(maw mawVar, int i) {
        this.b = i;
        this.a = mawVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            maw mawVar = this.a;
            if (((Integer) obj).intValue() == 2) {
                mawVar.b.l(true);
                return;
            }
            return;
        }
        maw mawVar2 = this.a;
        yny.z(mawVar2.b, yny.v(mawVar2.g.l() ? ((zck) obj).a.a.top : 0), ViewGroup.MarginLayoutParams.class);
    }
}
