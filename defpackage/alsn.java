package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alsn extends ContextThemeWrapper {
    public alsn(Context context, int i) {
        super(context, i);
    }

    @Override // android.view.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, false);
    }
}
