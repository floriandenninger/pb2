package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ult implements amml {
    public void a(qrl qrlVar, ukh ukhVar) {
        throw null;
    }

    @Override // defpackage.amml
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        qrl qrlVar = (qrl) obj;
        ukh a = uki.a();
        if (qrlVar.c() != null) {
            a.b(qrlVar.c());
        }
        if (qrlVar.e() != null) {
            a.a = qrlVar.e();
        }
        if (qrlVar.g() != null) {
            b(qrlVar, a);
        }
        if (qrlVar.f() != null) {
            a(qrlVar, a);
        }
        if (qrlVar.b() != null) {
            a.d = qrlVar.b();
        }
        c(qrlVar, a);
        if (qrlVar.d() != null) {
            a.e = qrlVar.d();
        }
        return a.a();
    }

    public void b(qrl qrlVar, ukh ukhVar) {
        throw null;
    }

    public abstract void c(qrl qrlVar, ukh ukhVar);
}
