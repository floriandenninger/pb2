package defpackage;

import android.text.TextPaint;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class srd extends drp {
    private final sww a;
    private final syb b;
    private final szx c;
    private final szx d;

    public srd(axoo axooVar, sww swwVar, szz szzVar, syb sybVar) {
        this.a = swwVar;
        this.b = sybVar;
        this.c = szzVar.g(axooVar.aK());
        this.d = szzVar.g(axooVar.aJ());
    }

    @Override // defpackage.drp
    public final boolean a(View view) {
        szx szxVar = this.d;
        if (szxVar == null) {
            return false;
        }
        sww swwVar = this.a;
        awnw a = szxVar.a();
        sws a2 = swu.a();
        a2.a = view;
        a2.h = this.b;
        swwVar.b(a, a2.a()).Q();
        return true;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        szx szxVar = this.c;
        if (szxVar != null) {
            sww swwVar = this.a;
            awnw a = szxVar.a();
            sws a2 = swu.a();
            a2.a = view;
            a2.h = this.b;
            swwVar.b(a, a2.a()).Q();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
