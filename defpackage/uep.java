package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uep implements View.OnAttachStateChangeListener {
    final /* synthetic */ ueg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ueq c;

    public uep(ueq ueqVar, ueg uegVar, boolean z) {
        this.c = ueqVar;
        this.a = uegVar;
        this.b = z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        ueq ueqVar = this.c;
        Drawable a = this.a.a();
        uqq.j();
        ImageView imageView = (ImageView) ueqVar.a.get();
        if (!ueqVar.d && imageView != null) {
            imageView.setImageDrawable(a);
        }
        if (this.b) {
            this.c.b();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
