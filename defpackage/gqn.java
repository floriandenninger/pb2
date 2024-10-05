package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqn implements swv {
    private final aavy a;
    private final afsy b;
    private final aahd c;
    private final zaw d;
    private final Executor e;
    private final ajoy f;

    public gqn(aavy aavyVar, ajoy ajoyVar, afsy afsyVar, aahd aahdVar, zaw zawVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = aavyVar;
        this.f = ajoyVar;
        this.b = afsyVar;
        this.c = aahdVar;
        this.d = zawVar;
        this.e = executor;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return awtp.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        awtp awtpVar = (awtp) obj;
        if ((awtpVar.c & 1) == 0) {
            return ayph.s(new Throwable("CreatePostElementCommand has no post request"));
        }
        arma armaVar = awtpVar.d;
        if (armaVar == null) {
            armaVar = arma.a;
        }
        aawa aawaVar = new aawa(this.f, this.b.c(), null, null, null);
        int i = armaVar.b;
        if ((i & 32) != 0) {
            aawaVar.s = armaVar.h;
        }
        if ((i & 4) != 0) {
            aawaVar.d(armaVar.g);
        }
        if ((armaVar.b & 2) != 0) {
            aawaVar.e(armaVar.f);
        }
        int i2 = armaVar.c;
        if (i2 == 9) {
            arlm arlmVar = (arlm) armaVar.d;
            if ((arlmVar.b & 1) != 0) {
                aawaVar.b = arlmVar.c;
            }
            if ((arlmVar.b & 4) != 0) {
                argf argfVar = (armaVar.c == 9 ? (arlm) armaVar.d : arlm.a).e;
                if (argfVar == null) {
                    argfVar = argf.a;
                }
                aawaVar.u = argfVar;
            }
            if (((armaVar.c == 9 ? (arlm) armaVar.d : arlm.a).b & 2) != 0) {
                aawaVar.t = (armaVar.c == 9 ? (arlm) armaVar.d : arlm.a).d;
            }
        } else if (i2 == 10) {
            arln arlnVar = (arln) armaVar.d;
            if ((arlnVar.b & 1) != 0) {
                aawaVar.d = arlnVar.c;
            }
        } else if (i2 == 8) {
            aawaVar.a = ((arlp) armaVar.d).b;
        } else if (i2 == 7) {
            arlr arlrVar = (arlr) armaVar.d;
            if ((arlrVar.b & 1) != 0) {
                aawaVar.c = arlrVar.c;
            }
        } else if (i2 == 14) {
            aawaVar.v = (arll) armaVar.d;
        } else if (i2 == 15) {
            aawaVar.w = ((arlq) armaVar.d).c;
        }
        anhy d = this.a.d(aawaVar, this.e);
        anaf.Y(d, new gqm(this.c, this.d), angq.a);
        return wbs.O(d);
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
