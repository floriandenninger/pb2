package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajnd extends ajnc {
    public ajnd(Context context, ajos ajosVar) {
        super(context, ajosVar);
    }

    @Override // defpackage.ajnc
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new af(0));
        frameLayout.setId(View.generateViewId());
        return frameLayout;
    }
}
