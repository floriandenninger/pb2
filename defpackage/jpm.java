package defpackage;

import android.content.Context;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpm implements jpi {
    private final Context a;
    private final aais b;
    private final afsy c;
    private final jpf d;
    private final axzg e;
    private final ajoy f;

    public jpm(Context context, aais aaisVar, ajoy ajoyVar, afsy afsyVar, jpf jpfVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = context;
        this.b = aaisVar;
        this.f = ajoyVar;
        this.c = afsyVar;
        this.d = jpfVar;
        this.e = axzgVar;
    }

    @Override // defpackage.jpi
    public final int a() {
        return 261;
    }

    @Override // defpackage.jpi
    public final int b() {
        return 173;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    @Override // defpackage.jpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.jpg c(defpackage.aakt r20, java.lang.String r21, defpackage.jph r22) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpm.c(aakt, java.lang.String, jph):jpg");
    }

    @Override // defpackage.jpi
    public final ammv d(String str) {
        awas z = etx.z(str, this.e);
        return z == null ? amlr.a : ammv.j(fhe.o(z.c));
    }

    @Override // defpackage.jpi
    public final amsx e(String str) {
        awas z = etx.z(str, this.e);
        if (z == null) {
            return amvs.a;
        }
        String str2 = z.c;
        String o = fhe.o(str2);
        HashSet ap = amkq.ap(this.f.E(o), this.f.E(fhe.q(str2)), this.f.E(fhe.A(str2)), this.f.E(fhe.l(str2)), this.f.E(fhe.z(str2)));
        asxs asxsVar = (asxs) this.b.a(this.c.c()).f(o).g(asxs.class).X();
        String str3 = asxsVar != null ? asxsVar.b.f : null;
        if (str3 != null) {
            ap.add(this.f.E(str3));
        }
        return amsx.p(ap);
    }

    @Override // defpackage.jpi
    public final Class f() {
        return asxs.class;
    }

    @Override // defpackage.jpi
    public final Class g() {
        return aqok.class;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(1, str);
    }
}
