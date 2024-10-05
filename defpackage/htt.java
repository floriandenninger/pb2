package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class htt implements ajde {
    final /* synthetic */ htu a;

    public htt(htu htuVar) {
        this.a = htuVar;
    }

    @Override // defpackage.ajde
    public final void a() {
        apmh apmhVar = this.a.ap.i;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 16384) != 0) {
            htu htuVar = this.a;
            aahd aahdVar = htuVar.c;
            apmh apmhVar2 = htuVar.ap.i;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apxf apxfVar = apmgVar2.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }

    @Override // defpackage.ajde
    public final void b() {
    }

    @Override // defpackage.ajde
    public final void c(boolean z) {
        this.a.ar.c();
    }
}
