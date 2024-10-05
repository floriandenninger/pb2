package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mmc extends ajnc {
    public mmc(Context context, ajos ajosVar) {
        super(context, ajosVar);
    }

    @Override // defpackage.ajnc
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return frameLayout;
    }
}
