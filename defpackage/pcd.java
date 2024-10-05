package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pcd {
    public pbz a;
    private final pbz[] b;
    private final pca c;

    public pcd(pbz[] pbzVarArr, pca pcaVar) {
        this.b = pbzVarArr;
        this.c = pcaVar;
    }

    public final pbz a(pbw pbwVar) {
        pbz pbzVar = this.a;
        if (pbzVar != null) {
            return pbzVar;
        }
        pbz[] pbzVarArr = this.b;
        int length = pbzVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            pbz pbzVar2 = pbzVarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                pbwVar.i();
                throw th;
            }
            if (pbzVar2.e(pbwVar)) {
                this.a = pbzVar2;
                pbwVar.i();
                break;
            }
            continue;
            pbwVar.i();
            i++;
        }
        pbz pbzVar3 = this.a;
        if (pbzVar3 == null) {
            throw new pcf(this.b);
        }
        pbzVar3.a(this.c);
        return this.a;
    }
}
