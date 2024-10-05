package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aldb implements akxu {
    final /* synthetic */ aldd a;

    public aldb(aldd alddVar) {
        this.a = alddVar;
    }

    @Override // defpackage.akxu
    public final void a(String str, String str2, aufk aufkVar) {
        aldd alddVar = this.a;
        synchronized (alddVar.g) {
            if (str2 != null) {
                if (alddVar.g.containsKey(str2)) {
                    alddVar.f.d((String) ((Pair) alddVar.g.get(str2)).first, aufkVar);
                }
            }
        }
    }

    @Override // defpackage.akxu
    public final /* synthetic */ void b(String str, String str2, avgc avgcVar) {
    }

    @Override // defpackage.akxu
    public final /* synthetic */ void c(String str, String str2, avsp avspVar) {
    }

    @Override // defpackage.akxu
    public final void d(String str, String str2, avuh avuhVar) {
        aldd alddVar = this.a;
        synchronized (alddVar.g) {
            if (str2 != null) {
                if (alddVar.g.containsKey(str2)) {
                    try {
                        alddVar.c.a((String) ((Pair) alddVar.g.get(str2)).first, new aldc(alddVar.e, avuhVar));
                    } catch (akwn e) {
                        alddVar.i.e("UploadFeedbackTask JobStorageException", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.akxu
    public final void e(String str) {
        aldd alddVar = this.a;
        if (str == null) {
            return;
        }
        alddVar.s(str, alddVar.d.d());
    }

    @Override // defpackage.akxu
    public final void f(String str, Exception exc) {
        aldd alddVar = this.a;
        alddVar.i.e("Polling finished with error.", exc);
        if (str == null) {
            return;
        }
        alddVar.s(str, alddVar.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED));
    }

    @Override // defpackage.akxu
    public final /* synthetic */ void g() {
    }
}
