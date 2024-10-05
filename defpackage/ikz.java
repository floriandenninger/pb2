package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ikz implements zaa {
    private final ColorDrawable a;

    public ikz(ColorDrawable colorDrawable) {
        this.a = colorDrawable;
    }

    @Override // defpackage.zaa
    public final void a(ImageView imageView) {
        imageView.setImageDrawable(this.a);
    }
}
