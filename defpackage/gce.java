package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gce implements akbl {
    private final acra a;
    private final shf b;
    private final aahd c;
    private final akbl d;
    private final atcf e;
    private long f = 0;

    public gce(aahd aahdVar, shf shfVar, atcf atcfVar, acra acraVar, akbl akblVar) {
        this.c = aahdVar;
        this.b = shfVar;
        this.e = atcfVar;
        this.a = acraVar;
        this.d = akblVar;
    }

    private final void c(atce atceVar) {
        if (atceVar != null) {
            apmg apmgVar = atceVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 1048576) != 0) {
                acra acraVar = this.a;
                apmg apmgVar2 = atceVar.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                acraVar.u(new acqx(apmgVar2.t), null);
            }
        }
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        this.d.li((akby) obj, i);
        if (this.f == 0) {
            return;
        }
        long c = this.b.c();
        long j = this.f;
        atcf atcfVar = this.e;
        if (c - j >= atcfVar.o && (atcfVar.b & 8192) != 0) {
            aahd aahdVar = this.c;
            apxf apxfVar = atcfVar.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
        this.f = 0L;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        this.d.lj((akby) obj);
        aahd aahdVar = this.c;
        atcf atcfVar = this.e;
        whl.I(aahdVar, atcfVar.j, atcfVar);
        this.a.u(new acqx(this.e.i), null);
        this.f = this.b.c();
        atce atceVar = this.e.f;
        if (atceVar == null) {
            atceVar = atce.a;
        }
        c(atceVar);
        atce atceVar2 = this.e.g;
        if (atceVar2 == null) {
            atceVar2 = atce.a;
        }
        c(atceVar2);
    }
}
