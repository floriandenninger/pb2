package defpackage;

import android.text.TextPaint;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aflj extends drp {
    private final sww a;
    private final awnw b;
    private final awnw c;

    public aflj(awne awneVar, sww swwVar) {
        this.a = swwVar;
        awnw awnwVar = awneVar.e;
        this.b = awnwVar == null ? awnw.a : awnwVar;
        awnw awnwVar2 = awneVar.f;
        this.c = awnwVar2 == null ? awnw.a : awnwVar2;
    }

    @Override // defpackage.drp
    public final boolean a(View view) {
        awnw awnwVar = this.c;
        if (awnwVar == null) {
            return false;
        }
        sww swwVar = this.a;
        sws a = swu.a();
        a.a = view;
        swwVar.b(awnwVar, a.a()).Q();
        return true;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        awnw awnwVar = this.b;
        if (awnwVar != null) {
            sww swwVar = this.a;
            sws a = swu.a();
            a.a = view;
            swwVar.b(awnwVar, a.a()).Q();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
