package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tm extends tl {
    @Override // defpackage.tl, defpackage.jr
    public final void c(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.jr
    public final boolean d(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
