package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aitz implements afts {
    private final SparseArray a = new SparseArray();

    @Override // defpackage.afts
    public final /* bridge */ /* synthetic */ Object a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            arrayList.add(((aiuk) this.a.valueAt(i)).a());
        }
        return new aiua(arrayList);
    }

    public final aiuk b(int i) {
        aiuk aiukVar = (aiuk) this.a.get(i);
        if (aiukVar != null) {
            return aiukVar;
        }
        aiuk aiukVar2 = new aiuk(i);
        this.a.put(i, aiukVar2);
        return aiukVar2;
    }

    public final void c(int i, String str, int i2, int i3) {
        b(i).d(str, i2, i3);
    }
}
