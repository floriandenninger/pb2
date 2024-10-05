package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jfd implements View.OnClickListener {
    final /* synthetic */ jfe a;

    public jfd(jfe jfeVar) {
        this.a = jfeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.equals(this.a.c)) {
            jfe jfeVar = this.a;
            if (jfeVar.b.isPresent()) {
                ((adlm) jfeVar.b.get()).T(!jfeVar.c.isSelected());
                jfeVar.n();
                return;
            }
            return;
        }
        if (view.equals(this.a.d)) {
            jfe jfeVar2 = this.a;
            if (jfeVar2.b.isPresent()) {
                ((adlm) jfeVar2.b.get()).U(!jfeVar2.d.isSelected());
                jfeVar2.n();
            }
        }
    }
}
