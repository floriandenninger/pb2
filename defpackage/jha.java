package defpackage;

import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jha implements ypd {
    final /* synthetic */ OfflineModeChangedMealbarController a;

    public jha(OfflineModeChangedMealbarController offlineModeChangedMealbarController) {
        this.a = offlineModeChangedMealbarController;
    }

    public final void a(ahej ahejVar) {
        fhf a;
        if (this.a.c.g().h() && !this.a.b.o() && (((this.a.f == 2 && ahejVar.a() == 5) || ahejVar.a() == 8) && (a = this.a.d.a()) != null && !a.e())) {
            this.a.e.postDelayed(new Runnable() { // from class: jgz
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineModeChangedMealbarController offlineModeChangedMealbarController = jha.this.a;
                    offlineModeChangedMealbarController.j(offlineModeChangedMealbarController.g());
                }
            }, 500L);
        }
        this.a.f = ahejVar.a();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahej.class};
        }
        if (i == 0) {
            a((ahej) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
