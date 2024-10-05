package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwr implements akbl {
    final /* synthetic */ String a;
    final /* synthetic */ jws b;

    public jwr(jws jwsVar, String str) {
        this.b = jwsVar;
        this.a = str;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        if (i != 1) {
            jws jwsVar = this.b;
            ci ciVar = jwsVar.a;
            anhy b = jwsVar.d.b(this.a);
            final String str = this.a;
            ynm.n(ciVar, b, new zfi() { // from class: jwq
                @Override // defpackage.zfi
                public final void a(Object obj2) {
                    Throwable th = (Throwable) obj2;
                    String valueOf = String.valueOf(str);
                    zga.d(valueOf.length() != 0 ? "Failed to complete delete of video ".concat(valueOf) : new String("Failed to complete delete of video "), th);
                }
            }, ynm.b);
        }
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        jws jwsVar = this.b;
        ci ciVar = jwsVar.a;
        jvh jvhVar = jwsVar.d;
        String str = this.a;
        ynm.n(ciVar, anfq.i(jvhVar.b.j(new fjz(str, 9)), new jvg(jvhVar, str, 1), angq.a), jnh.b, ynm.b);
    }
}
