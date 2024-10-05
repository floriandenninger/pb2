package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpb extends View {
    public abpa a;
    private final Runnable b;

    public abpb(Context context) {
        super(context);
        this.b = new aboz(this);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(this.b);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        onConfigurationChanged(getContext().getResources().getConfiguration());
    }
}
