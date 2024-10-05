package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pet implements pbz {
    private boolean d;
    private boolean e;
    private boolean f;
    private pca g;
    private final peu a = new peu();
    private final pgx c = new pgx(4096);
    private final SparseArray b = new SparseArray();

    @Override // defpackage.pbz
    public final void a(pca pcaVar) {
        this.g = pcaVar;
        pcaVar.pK(pcm.f);
    }

    @Override // defpackage.pbz
    public final void d() {
        this.a.b();
        for (int i = 0; i < this.b.size(); i++) {
            pes pesVar = (pes) this.b.valueAt(i);
            pesVar.f = false;
            pesVar.a.d();
        }
    }

    @Override // defpackage.pbz
    public final boolean e(pbw pbwVar) {
        byte[] bArr = new byte[14];
        pbwVar.g(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        pbwVar.e(bArr[13] & 7);
        pbwVar.g(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    @Override // defpackage.pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.pbw r16, defpackage.tfq r17) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pet.f(pbw, tfq):int");
    }
}
