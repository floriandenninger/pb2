package defpackage;

import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ieo implements afwx {
    final /* synthetic */ iep a;
    private final aros b;

    public ieo(iep iepVar, aros arosVar) {
        this.a = iepVar;
        this.b = arosVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        whu.K(this.a.a, R.string.delete_reel_item_failed, 1);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arot arotVar = (arot) obj;
        abig abigVar = this.a.f;
        aros arosVar = this.b;
        ListIterator listIterator = abigVar.a.listIterator();
        while (listIterator.hasNext()) {
            imm immVar = (imm) ((WeakReference) listIterator.next()).get();
            if (immVar != null) {
                immVar.aT(arosVar, arotVar);
            } else {
                listIterator.remove();
            }
        }
        whu.K(this.a.a, R.string.delete_reel_item_succeed, 1);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
