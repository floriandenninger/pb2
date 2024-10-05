package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aklr implements View.OnClickListener {
    final /* synthetic */ aklt a;

    public aklr(aklt akltVar) {
        this.a = akltVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a.toggle();
    }
}
