package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryh implements rxw {
    private final ryo[] a;

    public ryh(ryo[] ryoVarArr) {
        this.a = ryoVarArr;
    }

    @Override // defpackage.rxw
    public final List b(List list, ryv ryvVar, int i, rwl rwlVar, rxu rxuVar, rxl rxlVar, rze rzeVar, boolean z) {
        ryo[] ryoVarArr = this.a;
        for (int i2 = 0; i2 < 6; i2++) {
            ryo ryoVar = ryoVarArr[i2];
            if (ryoVar.a.f(ryvVar) >= 3) {
                return ryoVar.b(list, ryvVar, i, rwlVar, rxuVar, rxlVar, rzeVar, z);
            }
        }
        return this.a[5].b(list, ryvVar, i, rwlVar, rxuVar, rxlVar, rzeVar, z);
    }
}
