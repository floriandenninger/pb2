package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xks extends xlc {
    public ImageView a;
    private boolean f;

    public xks() {
        super(false);
    }

    private final void f(boolean z, boolean z2) {
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setVisibility((z2 && z && !this.f) ? 0 : 8);
        }
    }

    public final void a(boolean z) {
        this.f = z;
        f(((Boolean) this.b).booleanValue(), this.d);
    }

    @Override // defpackage.xkt
    public final /* bridge */ /* synthetic */ void b(Object obj, boolean z) {
        f(((Boolean) obj).booleanValue(), z);
    }
}
