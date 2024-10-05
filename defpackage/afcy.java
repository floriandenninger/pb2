package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afcy extends afcr {
    private int[] c;
    private int d;

    public afcy(afhs afhsVar, aesa aesaVar) {
        super(afhsVar, aesaVar);
    }

    @Override // defpackage.afcr
    public final void a(List list, long j, long j2, afcp[] afcpVarArr, afco afcoVar) {
        afcp afcpVar;
        int length;
        afcoVar.b = 3;
        int length2 = afcpVarArr.length;
        int i = 0;
        if (length2 == 1) {
            afcpVar = afcpVarArr[0];
        } else {
            int[] iArr = this.c;
            if (iArr == null || (length = iArr.length) != (length2 - 1) * length2) {
                this.c = new int[(length2 - 1) * length2];
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = i2 + 1;
                    for (int i5 = i4; i5 < length2; i5++) {
                        int[] iArr2 = this.c;
                        int i6 = i3 + 1;
                        iArr2[i3] = i2;
                        i3 = i6 + 1;
                        iArr2[i6] = i5;
                    }
                    i2 = i4;
                }
                this.d = 0;
            } else {
                i = (this.d + 1) % length;
                this.d = i;
            }
            afcpVar = afcpVarArr[this.c[i]];
        }
        afcoVar.c = afcpVar;
        afcoVar.d = aenk.a;
    }
}
