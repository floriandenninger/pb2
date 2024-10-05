package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afo extends afk {
    public afk[] aq = new afk[4];
    public int ar = 0;

    public final void T(ArrayList arrayList, int i, agf agfVar) {
        for (int i2 = 0; i2 < this.ar; i2++) {
            agfVar.d(this.aq[i2]);
        }
        for (int i3 = 0; i3 < this.ar; i3++) {
            aco.b(this.aq[i3], i, arrayList, agfVar);
        }
    }
}
