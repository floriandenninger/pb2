package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsi implements fwn {
    public View a;
    private final Context b;
    private final akch c;
    private final afsy d;
    private akcj e;

    public jsi(Context context, akch akchVar, afsy afsyVar) {
        this.b = context;
        this.c = akchVar;
        this.d = afsyVar;
    }

    @Override // defpackage.fwk
    public final int c() {
        return 2800;
    }

    @Override // defpackage.fwk
    public final void d() {
    }

    @Override // defpackage.fwk
    public final void e() {
        if (this.a == null) {
            return;
        }
        akch akchVar = this.c;
        if (this.e == null) {
            akci a = akchVar.a();
            View view = this.a;
            view.getClass();
            a.a = view;
            a.c = this.b.getResources().getString(R.string.offline_thumbnail_overlay_tooltip_details);
            a.i(1);
            a.c(2);
            a.f = new jeu(2);
            a.l();
            this.e = a.a();
        }
        akchVar.c(this.e);
    }

    @Override // defpackage.fwn
    public final boolean f() {
        return this.d.t();
    }
}
