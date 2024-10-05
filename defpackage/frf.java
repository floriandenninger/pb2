package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Space;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class frf implements ajom {
    private final Context a;
    private final Space b;

    public frf(Context context) {
        this.a = context;
        this.b = new Space(context);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        frd frdVar = (frd) obj;
        int i = 0;
        if (ajokVar.c("vertical_padding_should_display_top") != Boolean.FALSE || ajokVar.c("position") != 0) {
            i = frdVar.b != 1 ? frdVar.a : yjk.K(this.a.getResources().getDisplayMetrics(), frdVar.a);
        }
        this.b.setMinimumHeight(i);
    }
}
