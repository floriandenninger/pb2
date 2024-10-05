package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ong implements fgp, gjb {
    public final WatchWhileActivity a;
    public int b;
    public boolean c;
    private final its d;
    private PaneDescriptor e;
    private fhg f;

    public ong(WatchWhileActivity watchWhileActivity, its itsVar) {
        this.a = watchWhileActivity;
        this.d = itsVar;
    }

    public final void a() {
        PaneDescriptor paneDescriptor = this.e;
        if (paneDescriptor == null) {
            return;
        }
        boolean z = !this.d.f(paneDescriptor);
        fhg fhgVar = this.f;
        if ((fhgVar != null && fhgVar.h()) || z) {
            if (this.c) {
                return;
            }
            this.a.getWindow().setSoftInputMode(this.b);
        } else {
            this.a.getWindow().setSoftInputMode(48);
            this.c = false;
        }
    }

    @Override // defpackage.gjb
    public final void g(gir girVar) {
        this.e = PaneDescriptor.b(girVar);
        a();
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        this.f = fhgVar;
        a();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
