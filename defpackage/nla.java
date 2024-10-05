package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nla implements fzk {
    final /* synthetic */ nlb a;
    private final apxf b;
    private final CharSequence c;
    private final mdb d;

    public nla(nlb nlbVar, apxf apxfVar, CharSequence charSequence, mda mdaVar) {
        this.a = nlbVar;
        this.b = apxfVar;
        this.c = charSequence;
        this.d = mdaVar.b();
    }

    @Override // defpackage.fze
    public final int g() {
        return this.d.a();
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
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            menuItem.setTitle(charSequence);
        }
    }

    @Override // defpackage.fze
    public final boolean m() {
        this.a.e.a(this.b);
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return this.d.a;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
