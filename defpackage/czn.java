package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czn extends cze implements cta {
    public czn(czl czlVar) {
        super(czlVar);
    }

    @Override // defpackage.ctd
    public final int a() {
        czs czsVar = ((czl) this.a).a.a;
        cpg cpgVar = (cpg) czsVar.a;
        return cpgVar.a.limit() + cpgVar.c.length + (cpgVar.d.length * 4) + czsVar.j;
    }

    @Override // defpackage.ctd
    public final Class b() {
        return czl.class;
    }

    @Override // defpackage.cze, defpackage.cta
    public final void d() {
        ((czl) this.a).a().prepareToDraw();
    }

    @Override // defpackage.ctd
    public final void e() {
        ctk ctkVar;
        ((czl) this.a).stop();
        czl czlVar = (czl) this.a;
        czlVar.b = true;
        czs czsVar = czlVar.a.a;
        czsVar.b.clear();
        czsVar.d();
        czsVar.f();
        czp czpVar = czsVar.e;
        if (czpVar != null) {
            czsVar.c.j(czpVar);
            czsVar.e = null;
        }
        czp czpVar2 = czsVar.g;
        if (czpVar2 != null) {
            czsVar.c.j(czpVar2);
            czsVar.g = null;
        }
        czp czpVar3 = czsVar.i;
        if (czpVar3 != null) {
            czsVar.c.j(czpVar3);
            czsVar.i = null;
        }
        cpg cpgVar = (cpg) czsVar.a;
        cpgVar.f = null;
        byte[] bArr = cpgVar.c;
        if (bArr != null) {
            cpgVar.j.b(bArr);
        }
        int[] iArr = cpgVar.d;
        if (iArr != null && (ctkVar = cpgVar.j.b) != null) {
            ctkVar.c(iArr);
        }
        Bitmap bitmap = cpgVar.g;
        if (bitmap != null) {
            cpgVar.j.a(bitmap);
        }
        cpgVar.g = null;
        cpgVar.a = null;
        cpgVar.h = null;
        byte[] bArr2 = cpgVar.b;
        if (bArr2 != null) {
            cpgVar.j.b(bArr2);
        }
        czsVar.f = true;
    }
}
