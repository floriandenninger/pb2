package defpackage;

import android.util.SparseIntArray;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgz implements tgs {
    final /* synthetic */ tha a;
    private int b = -1;

    public tgz(tha thaVar) {
        this.a = thaVar;
    }

    @Override // defpackage.tgs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(tgb tgbVar) {
        List list;
        List list2;
        SparseIntArray sparseIntArray;
        amkq.N(tgbVar.c());
        aong aongVar = tgbVar.c;
        ando andoVar = ((tgf) aongVar.instance).d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        amkq.N((andoVar.b & 2048) != 0);
        int r = anaf.r(((tgf) aongVar.instance).e);
        if (r == 0 || r == 1) {
            list = this.a.f;
            int size = list.size();
            list2 = this.a.f;
            list2.add(tgbVar.a());
            sparseIntArray = this.a.g;
            sparseIntArray.put(size, this.b);
            int i = this.b;
            this.b = size;
            tgbVar.a.l(this);
            this.b = i;
        }
    }
}
