package defpackage;

import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rat implements qqu {
    public boolean a = true;
    final /* synthetic */ qql b;

    protected rat() {
    }

    public rat(qql qqlVar) {
        this.b = qqlVar;
    }

    @Override // defpackage.qqu
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        rbq rbqVar = (rbq) obj;
        if (this.a) {
            rpv rpvVar = (rpv) obj2;
            raq raqVar = new raq(rpvVar);
            try {
                qqj qqjVar = this.b.b;
                if (qqjVar != null) {
                    rbp rbpVar = rbqVar.b;
                    rbpVar.e.a();
                    synchronized (rbpVar.d) {
                        ray rayVar = (ray) rbpVar.d.remove(qqjVar);
                        if (rayVar != null) {
                            rayVar.a();
                            rbpVar.e.b().a(LocationRequestUpdateData.a(rayVar, raqVar));
                        }
                    }
                }
            } catch (RuntimeException e) {
                rpvVar.c(e);
            }
        }
    }
}
