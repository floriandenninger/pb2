package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nmd implements fzk {
    private final apxf a;
    private final CharSequence b;
    private final aahd c;
    private final int d;

    public nmd(apxf apxfVar, CharSequence charSequence, aahd aahdVar, int i) {
        this.a = apxfVar;
        this.b = charSequence;
        this.c = aahdVar;
        if (i == 1) {
            this.d = 1;
        } else {
            this.d = 2;
        }
    }

    @Override // defpackage.fze
    public final int g() {
        return this.d;
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
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            menuItem.setTitle(charSequence);
        }
    }

    @Override // defpackage.fze
    public final boolean m() {
        this.c.c(this.a, null);
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 0;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return this.b;
    }
}
