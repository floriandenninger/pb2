package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ukb implements ujx {
    public final ufh a;
    public final tip b;
    public final ukc c;

    public ukb(ufh ufhVar, tip tipVar) {
        this.a = ufhVar;
        this.b = tipVar;
        this.c = new ukc(this, tipVar);
    }

    @Override // defpackage.ujx
    public final void a(View view, int i) {
        uqq.j();
        this.b.b().b(view, this.b.c().a(i));
    }

    @Override // defpackage.ujx
    public final void b(View view, int i) {
        uqq.j();
        this.b.b().e(view, this.b.c().a(i));
    }

    @Override // defpackage.ujx
    public final void c(View view) {
        uqq.j();
        this.b.b();
        tgk.d(view);
    }

    @Override // defpackage.ujx
    public final void d(View view) {
        uqq.j();
        uka ukaVar = new uka(this, view);
        view.addOnAttachStateChangeListener(ukaVar);
        ukaVar.a(this.a.a());
        if (jw.aj(view)) {
            ukaVar.onViewAttachedToWindow(view);
        }
    }

    @Override // defpackage.ujx
    public final void e(awns awnsVar, View view) {
        tgd a = this.b.a();
        if (((sgf) view.getTag(R.id.interaction_info_tag)) != null) {
            amkq.N(!awnsVar.a.pY(null));
            throw null;
        }
        a.a(awnsVar.f(), view);
    }
}
