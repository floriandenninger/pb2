package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atk implements atm {
    final /* synthetic */ String a;
    final /* synthetic */ advq b;
    final /* synthetic */ Executor c;
    final /* synthetic */ aenf d;
    final /* synthetic */ atse e;
    final /* synthetic */ aaea f;
    final /* synthetic */ String g;
    final /* synthetic */ aehs h;
    final /* synthetic */ adxh i;
    final /* synthetic */ aefy j;
    final /* synthetic */ axzg k;

    public atk() {
        new atq();
    }

    @Override // defpackage.atd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final atr a() {
        String str;
        aeht a;
        atr z = adyu.z(this.a, this.b, this.c, this.d, this.e, this.k);
        arfd a2 = this.f.a();
        if (a2 != null) {
            atcl atclVar = a2.i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            atsh atshVar = atclVar.d;
            if (atshVar == null) {
                atshVar = atsh.a;
            }
            atsf atsfVar = atshVar.g;
            if (atsfVar == null) {
                atsfVar = atsf.b;
            }
            if (atsfVar.i && (str = this.g) != null && (a = this.h.a(str)) != null) {
                z = this.i.a(z, a);
            }
        }
        return this.j.a(z);
    }

    public atk(String str, advq advqVar, Executor executor, aenf aenfVar, atse atseVar, axzg axzgVar, aaea aaeaVar, String str2, aehs aehsVar, adxh adxhVar, aefy aefyVar, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = advqVar;
        this.c = executor;
        this.d = aenfVar;
        this.e = atseVar;
        this.k = axzgVar;
        this.f = aaeaVar;
        this.g = str2;
        this.h = aehsVar;
        this.i = adxhVar;
        this.j = aefyVar;
        new atq();
    }
}
