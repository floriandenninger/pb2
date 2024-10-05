package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzz implements fzd, ygx, fzk {
    private final Context a;
    private final LayoutInflater b;
    private final arfm c;
    private final acra d;
    private View e;
    private yha f;
    private final mdb g;
    private final akht h;

    public lzz(mda mdaVar, Context context, akht akhtVar, acra acraVar, arfm arfmVar, byte[] bArr) {
        this.a = context;
        this.b = LayoutInflater.from(context);
        this.h = akhtVar;
        this.d = acraVar;
        this.c = arfmVar;
        this.g = mdaVar.b();
    }

    private final void b(boolean z) {
        whu.I(this.e, z);
    }

    @Override // defpackage.fzd
    public final void a(zau zauVar, int i) {
        yha yhaVar;
        if (i != wbs.Q(this.a, R.attr.ytIconActiveOther) || (yhaVar = this.f) == null) {
            yha yhaVar2 = this.f;
            if (yhaVar2 != null) {
                yhaVar2.k(zauVar.b(yhaVar2.f(), i));
                return;
            }
            return;
        }
        yhaVar.k(zauVar.b(yhaVar.f(), wbs.Q(this.a, R.attr.ytTextPrimary)));
    }

    @Override // defpackage.fze
    public final int g() {
        return this.g.a();
    }

    @Override // defpackage.fze
    public final int h() {
        return 0;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return this;
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
        if (this.e == null) {
            this.e = this.b.inflate(R.layout.mobile_topbar_icon_badge_item, (ViewGroup) null, false);
        }
        if (this.f == null) {
            this.f = this.h.b((ViewStub) this.e.findViewById(R.id.icon_badge));
        }
        ajok ajokVar = new ajok();
        ajokVar.a(this.d);
        this.f.oB(ajokVar, this.c);
        if (!this.c.c.isEmpty()) {
            this.f.j(this);
        }
        b(this.c.f);
        menuItem.setShowAsAction(2);
        menuItem.setActionView(this.e);
    }

    @Override // defpackage.fze
    public final boolean m() {
        return false;
    }

    @Override // defpackage.fzk
    public final int n() {
        return this.g.a + 1000;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        aots aotsVar = this.c.i;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) == 0) {
            return "";
        }
        aots aotsVar2 = this.c.i;
        if (aotsVar2 == null) {
            aotsVar2 = aots.a;
        }
        return aotsVar2.c;
    }

    @Override // defpackage.ygx
    public final void ou(arfk arfkVar) {
        yha yhaVar = this.f;
        if (yhaVar == null || !yhaVar.n(arfkVar)) {
            return;
        }
        b(arfkVar.getIsVisible().booleanValue());
    }
}
