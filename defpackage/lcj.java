package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lcj implements fzk {
    public MenuItem a;
    final /* synthetic */ lcl b;
    private final Resources c;
    private final mdb d;

    public lcj(lcl lclVar, Context context, mda mdaVar) {
        this.b = lclVar;
        this.c = context.getResources();
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
        return false;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        this.a = menuItem;
    }

    @Override // defpackage.fze
    public final boolean m() {
        this.b.s();
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return this.d.a;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return this.c.getString(R.string.overflow_search_filter);
    }
}
