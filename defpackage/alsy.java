package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alsy implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TemplateLayout a;

    public alsy(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.a.b);
        TemplateLayout templateLayout = this.a;
        templateLayout.setXFraction(templateLayout.a);
        return true;
    }
}
