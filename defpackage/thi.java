package defpackage;

import android.util.SparseIntArray;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class thi implements tfp, thg {
    private final andp a;
    private final List b;
    private final List c;
    private final SparseIntArray d;
    private final List e;
    private final SparseIntArray f;
    private final amru g;

    public thi(andp andpVar, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.a = andpVar;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = sparseIntArray;
        this.e = Collections.unmodifiableList(list3);
        this.f = sparseIntArray2;
        amkq.F(!list.isEmpty(), "Must have at least one graft");
        amkq.F(list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size(), "All children must have a parent specified.");
        this.g = amru.r(sgf.M((thh) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amkq.E(sgf.M((thh) it.next()).equals(this.g.get(0)));
        }
    }

    @Override // defpackage.thg
    public /* synthetic */ tgf a() {
        return sgf.M(this);
    }

    @Override // defpackage.thg
    public List b() {
        return this.g;
    }

    public SparseIntArray c() {
        return this.d;
    }

    public /* synthetic */ tgf d() {
        return sgf.N(this);
    }

    public andp e() {
        return this.a;
    }

    public List f() {
        return this.b;
    }

    public List g() {
        return this.c;
    }

    public String toString() {
        ammu Y = amkq.Y(this);
        ando andoVar = a().d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        Y.e("rootVeId", andoVar.d);
        ando andoVar2 = d().d;
        if (andoVar2 == null) {
            andoVar2 = ando.a;
        }
        Y.e("targetVeId", andoVar2.d);
        return Y.toString();
    }
}
