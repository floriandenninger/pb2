package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vrl extends dg {
    final /* synthetic */ vrm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrl(vrm vrmVar, dd ddVar) {
        super(ddVar);
        this.c = vrmVar;
    }

    @Override // defpackage.dg
    public final ce b(int i) {
        return (ce) ((vqw) this.c.an.get(i)).d.get();
    }

    @Override // defpackage.bxz
    public final void i(ViewGroup viewGroup, Object obj) {
        ce ceVar = (ce) obj;
        ce ceVar2 = ((dg) this).a;
        if (ceVar != ceVar2) {
            if (ceVar2 != null) {
                ceVar2.ai(false);
                ((dg) this).a.an(false);
            }
            ceVar.ai(true);
            ceVar.an(true);
            ((dg) this).a = ceVar;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            tgb b = tgj.b(childAt);
            if (b != null) {
                if (g(childAt, obj)) {
                    if (b.f() == 2) {
                        b.g(1);
                    }
                } else if (b.f() == 1) {
                    b.g(2);
                }
            }
        }
    }

    @Override // defpackage.bxz
    public final int j() {
        return this.c.an.size();
    }

    @Override // defpackage.bxz
    public final CharSequence l(int i) {
        vrm vrmVar = this.c;
        return vrmVar.O(((vqw) vrmVar.an.get(i)).e);
    }
}
