package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akoz implements swv {
    public final akpb a;

    public akoz(akpb akpbVar) {
        this.a = akpbVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return apfv.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        final apfv apfvVar = (apfv) obj;
        return ayph.t(new ayrm() { // from class: akoy
            @Override // defpackage.ayrm
            public final void a() {
                akoz akozVar = akoz.this;
                apfv apfvVar2 = apfvVar;
                akpb akpbVar = akozVar.a;
                String str = apfvVar2.d;
                arjp arjpVar = apfvVar2.c;
                if (arjpVar == null) {
                    arjpVar = arjp.a;
                }
                akpbVar.a.c(new akpc(str, arjpVar));
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
