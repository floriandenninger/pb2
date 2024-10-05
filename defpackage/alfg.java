package defpackage;

import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alfg implements iw {
    final /* synthetic */ alfk a;

    public alfg(alfk alfkVar) {
        this.a = alfkVar;
    }

    @Override // defpackage.iw
    public final ko a(View view, ko koVar) {
        alfk alfkVar = this.a;
        ko koVar2 = true != jw.af(alfkVar) ? null : koVar;
        if (!Objects.equals(alfkVar.h, koVar2)) {
            alfkVar.h = koVar2;
            alfkVar.requestLayout();
        }
        return koVar.n();
    }
}
