package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ble extends blm {
    private bip a;
    private bld o;

    private static boolean g(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final long a(pth pthVar) {
        if (!g(pthVar.a)) {
            return -1L;
        }
        int i = (pthVar.a[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int b = bfn.b(pthVar, i);
            pthVar.G(0);
            return b;
        }
        pthVar.H(4);
        pthVar.r();
        int b2 = bfn.b(pthVar, i);
        pthVar.G(0);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.blm
    public final boolean c(pth pthVar, long j, blk blkVar) {
        byte[] bArr = pthVar.a;
        bip bipVar = this.a;
        if (bipVar == null) {
            bip bipVar2 = new bip(bArr, 17);
            this.a = bipVar2;
            blkVar.a = bipVar2.d(Arrays.copyOfRange(bArr, 9, pthVar.c), null);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            bio b = bgy.b(pthVar);
            bip c = bipVar.c(b);
            this.a = c;
            this.o = new bld(c, b);
            return true;
        }
        if (!g(bArr)) {
            return true;
        }
        bld bldVar = this.o;
        if (bldVar != null) {
            bldVar.a = j;
            blkVar.b = bldVar;
        }
        pse.c(blkVar.a);
        return false;
    }
}
