package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ablv extends ClickableSpan {
    final /* synthetic */ ajok a;
    final /* synthetic */ asps b;
    final /* synthetic */ ablx c;

    public ablv(ablx ablxVar, ajok ajokVar, asps aspsVar) {
        this.c = ablxVar;
        this.a = ajokVar;
        this.b = aspsVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ablx ablxVar = this.c;
        ablxVar.s = true;
        ablxVar.oB(this.a, this.b);
    }
}
