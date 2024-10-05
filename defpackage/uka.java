package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uka implements View.OnAttachStateChangeListener {
    final /* synthetic */ ukb a;
    private final View b;
    private final tyo c;

    public uka(ukb ukbVar, View view) {
        this.a = ukbVar;
        this.b = view;
        this.c = new ujz(this, view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a.b(this.c);
        ufh ufhVar = this.a.a;
        if (((ufn) ufhVar).d) {
            this.c.af(ufhVar.a());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a.c(this.c);
    }

    public final void a(Object obj) {
        ujq b;
        if (obj != null) {
            String Y = tyo.Y(obj);
            b = (Y == null || !Y.contains("@")) ? ujq.b() : new ujq(1, Y);
        } else {
            b = ujq.b();
        }
        ujq c = ukc.c(this.b);
        if (c == null) {
            tgk b2 = this.a.b.b();
            View view = this.b;
            tfy a = this.a.b.c().a(90569);
            a.d(b.a());
            a.d(ujr.a);
            b2.b(view, a);
            ukc.d(this.b, b);
            return;
        }
        if (c.equals(b) || !jw.aj(this.b)) {
            return;
        }
        ukc ukcVar = this.a.c;
        View view2 = this.b;
        if (b.equals(ukc.c(view2))) {
            return;
        }
        ukc.b(ukcVar.a, view2);
        tgk b3 = ukcVar.b.b();
        tgk.d(view2);
        tfy a2 = ukcVar.b.c().a(90569);
        a2.d(b.a());
        a2.d(ujr.a);
        b3.b(view2, a2);
        ukc.a(ukcVar.a, view2);
        ukc.d(view2, b);
    }
}
