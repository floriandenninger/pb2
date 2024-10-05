package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgk {
    final /* synthetic */ rgm a;

    public rgk(rgm rgmVar) {
        this.a = rgmVar;
    }

    public final void a(int i, String str, List list, boolean z, boolean z2) {
        rfn rfnVar;
        int i2 = i - 1;
        if (i2 == 0) {
            rfnVar = this.a.aF().j;
        } else if (i2 != 1) {
            if (i2 == 3) {
                rfnVar = this.a.aF().k;
            } else if (i2 != 4) {
                rfnVar = this.a.aF().i;
            } else if (z) {
                rfnVar = this.a.aF().g;
            } else if (!z2) {
                rfnVar = this.a.aF().h;
            } else {
                rfnVar = this.a.aF().f;
            }
        } else if (z) {
            rfnVar = this.a.aF().d;
        } else if (!z2) {
            rfnVar = this.a.aF().e;
        } else {
            rfnVar = this.a.aF().c;
        }
        int size = list.size();
        if (size == 1) {
            rfnVar.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            rfnVar.c(str, list.get(0), list.get(1));
        } else if (size == 3) {
            rfnVar.d(str, list.get(0), list.get(1), list.get(2));
        } else {
            rfnVar.a(str);
        }
    }
}
