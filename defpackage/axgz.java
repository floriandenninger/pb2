package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axgz extends FrameLayout {
    final /* synthetic */ axha a;
    private Configuration b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axgz(axha axhaVar, Context context) {
        super(context);
        this.a = axhaVar;
        this.b = new Configuration(context.getResources().getConfiguration());
    }

    private final void a(Configuration configuration) {
        int diff = configuration.diff(this.b);
        if ((diff & 4096) == 0 && (diff & 128) == 0) {
            return;
        }
        this.b = new Configuration(configuration);
        axha axhaVar = this.a;
        axhaVar.c(axhaVar.p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.a.a.getResources().getConfiguration());
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration);
    }
}
