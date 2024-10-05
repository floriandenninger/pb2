package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mlq extends lo {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    final /* synthetic */ mlu b;

    public mlq(mlu mluVar) {
        this.b = mluVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        int i2;
        if (i == 0) {
            if (this.b.u.J() != -1) {
                mlu mluVar = this.b;
                mluVar.m = mluVar.u.J();
            }
            this.b.k();
            mlu mluVar2 = this.b;
            if (mluVar2.o != null && mluVar2.l != null && mluVar2.q && (i2 = mluVar2.p) != mluVar2.m) {
                Object obj = mluVar2.f.get(i2);
                if (obj instanceof aqjc) {
                    aqjc aqjcVar = (aqjc) obj;
                    if ((aqjcVar.b & 2097152) != 0) {
                        mluVar2.l.I(65, new acqx(aqjcVar.x.I()), null);
                    }
                }
            }
            mlu mluVar3 = this.b;
            mluVar3.q = false;
            mluVar3.h();
            this.b.q();
        } else if (i == 1) {
            mlu mluVar4 = this.b;
            if (!mluVar4.q) {
                mluVar4.q = true;
                mluVar4.c();
                mlu mluVar5 = this.b;
                mluVar5.p = mluVar5.u.J();
            }
        }
        mlu mluVar6 = this.b;
        mluVar6.f.get(mluVar6.m);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((mgx) it.next()).a();
        }
    }
}
