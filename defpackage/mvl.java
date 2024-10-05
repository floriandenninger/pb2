package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvl extends ajnc {
    public mvl(Context context, ajos ajosVar) {
        super(context, ajosVar);
    }

    @Override // defpackage.ajnc
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
