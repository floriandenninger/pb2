package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcw extends lo {
    public mcv a = mcv.a();
    final /* synthetic */ mce b;

    public mcw() {
    }

    public mcw(mce mceVar) {
        this.b = mceVar;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        LinearLayout linearLayout;
        mcv mcvVar = this.a;
        int i3 = mcvVar.a + i;
        mcvVar.a = i3;
        if (mcvVar.c) {
            boolean z = Math.abs(i3) > 50;
            boolean z2 = this.a.b;
            if (!z2) {
                if (z) {
                    LinearLayout linearLayout2 = this.b.b;
                    if (linearLayout2 == null) {
                        return;
                    }
                    mce.j(linearLayout2, true, linearLayout2.getWidth());
                    mce mceVar = this.b;
                    aomf aomfVar = mceVar.c;
                    if (aomfVar != null) {
                        mceVar.a.u(new acqx(aomfVar), null);
                    }
                    this.a.b = true;
                    return;
                }
                z = false;
            }
            if (!z2 || z || (linearLayout = this.b.b) == null) {
                return;
            }
            mce.j(linearLayout, false, linearLayout.getWidth());
            this.a.b = false;
        }
    }
}
