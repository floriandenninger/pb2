package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qvn implements qvt {
    private final /* synthetic */ int a;

    public qvn(int i) {
        this.a = i;
    }

    @Override // defpackage.qvt
    public final qvs a(Context context, String str, qvr qvrVar) {
        int b;
        int i = this.a;
        int i2 = 0;
        if (i == 0) {
            qvs qvsVar = new qvs();
            int a = qvrVar.a(context, str);
            qvsVar.a = a;
            if (a != 0) {
                b = qvrVar.b(context, str, false);
                qvsVar.b = b;
            } else {
                b = qvrVar.b(context, str, true);
                qvsVar.b = b;
            }
            int i3 = qvsVar.a;
            if (i3 != 0) {
                i2 = i3;
            } else if (b == 0) {
                qvsVar.c = 0;
                return qvsVar;
            }
            if (i2 >= b) {
                qvsVar.c = -1;
            } else {
                qvsVar.c = 1;
            }
            return qvsVar;
        }
        if (i == 1) {
            qvs qvsVar2 = new qvs();
            int b2 = qvrVar.b(context, str, true);
            qvsVar2.b = b2;
            if (b2 != 0) {
                qvsVar2.c = 1;
            } else {
                int a2 = qvrVar.a(context, str);
                qvsVar2.a = a2;
                if (a2 != 0) {
                    qvsVar2.c = -1;
                }
            }
            return qvsVar2;
        }
        qvs qvsVar3 = new qvs();
        qvsVar3.a = qvrVar.a(context, str);
        int b3 = qvrVar.b(context, str, true);
        qvsVar3.b = b3;
        int i4 = qvsVar3.a;
        if (i4 != 0) {
            i2 = i4;
        } else if (b3 == 0) {
            qvsVar3.c = 0;
            return qvsVar3;
        }
        if (b3 >= i2) {
            qvsVar3.c = 1;
        } else {
            qvsVar3.c = -1;
        }
        return qvsVar3;
    }
}
