package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kp extends ClickableSpan {
    private final int a;
    private final ks b;
    private final int c;

    public kp(int i, ks ksVar, int i2) {
        this.a = i;
        this.b = ksVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        ks ksVar = this.b;
        ksVar.b.performAction(this.c, bundle);
    }
}
