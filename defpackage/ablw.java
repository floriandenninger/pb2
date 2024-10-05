package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ablw extends ClickableSpan {
    final /* synthetic */ ClickableSpan a;
    final /* synthetic */ ablx b;

    public ablw(ablx ablxVar, ClickableSpan clickableSpan) {
        this.b = ablxVar;
        this.a = clickableSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.t = true;
        this.a.onClick(view);
    }
}
