package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dc implements db {
    final int a;
    final int b;
    final /* synthetic */ dd c;

    public dc(dd ddVar, int i, int i2) {
        this.c = ddVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.db
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        ce ceVar = this.c.p;
        if (ceVar == null || this.a >= 0 || !ceVar.mN().Z()) {
            return this.c.af(arrayList, arrayList2, this.a, this.b);
        }
        return false;
    }
}
