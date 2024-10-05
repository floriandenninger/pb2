package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class blj extends blm {
    public static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final long a(pth pthVar) {
        byte[] bArr = pthVar.a;
        int i = bArr[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = bArr[1] & 63;
        }
        int i4 = i >> 3;
        return e(i3 * (i4 >= 16 ? 2500 << r1 : i4 >= 12 ? 10000 << (r1 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.o = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final boolean c(pth pthVar, long j, blk blkVar) {
        if (!this.o) {
            byte[] copyOf = Arrays.copyOf(pthVar.a, pthVar.c);
            int f = hp.f(copyOf);
            List i = hp.i(copyOf);
            pmr pmrVar = new pmr();
            pmrVar.k = "audio/opus";
            pmrVar.x = f;
            pmrVar.y = 48000;
            pmrVar.m = i;
            blkVar.a = pmrVar.a();
            this.o = true;
            return true;
        }
        pse.c(blkVar.a);
        boolean z = pthVar.d() == 1332770163;
        pthVar.G(0);
        return z;
    }
}
