package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xwe extends ajnc {
    /* JADX WARN: Type inference failed for: r2v1, types: [ajos, java.lang.Object] */
    public xwe(Context context, ajvb ajvbVar) {
        super(context, ajvbVar.get());
    }

    @Override // defpackage.ajnc
    protected final /* bridge */ /* synthetic */ ViewGroup a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
