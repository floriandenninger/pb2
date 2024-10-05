package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mac implements fzk {
    private final aahd a;
    private final apxf b;
    private final CharSequence c;
    private final aomf d;
    private final acra e;
    private final mdb f;

    public mac(mda mdaVar, aahd aahdVar, apxf apxfVar, CharSequence charSequence, aomf aomfVar, acra acraVar) {
        this.f = mdaVar.b();
        aahdVar.getClass();
        this.a = aahdVar;
        this.b = apxfVar;
        this.c = charSequence;
        this.d = aomfVar;
        this.e = acraVar;
    }

    @Override // defpackage.fze
    public final int g() {
        return this.f.a();
    }

    @Override // defpackage.fze
    public final int h() {
        return 0;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final void j() {
        acra acraVar;
        aomf aomfVar = this.d;
        if (aomfVar == null || aomfVar.H() || (acraVar = this.e) == null) {
            return;
        }
        acraVar.u(new acqx(this.d), null);
    }

    @Override // defpackage.fze
    public final boolean k() {
        return false;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        menuItem.setTitle(this.c);
    }

    @Override // defpackage.fze
    public final boolean m() {
        acra acraVar;
        aomf aomfVar = this.d;
        if (aomfVar != null && !aomfVar.H() && (acraVar = this.e) != null) {
            acraVar.I(3, new acqx(this.d), null);
        }
        apxf apxfVar = this.b;
        if (apxfVar == null) {
            return false;
        }
        this.a.a(apxfVar);
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return this.f.a;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return this.c;
    }
}
