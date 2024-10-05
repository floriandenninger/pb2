package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ksv implements ayrs {
    final /* synthetic */ ksx a;
    private BitmapDrawable b;
    private int c;

    public ksv(ksx ksxVar) {
        this.a = ksxVar;
    }

    @Override // defpackage.ayrs
    public final /* synthetic */ void a(Object obj) {
        Drawable a;
        BitmapDrawable bitmapDrawable;
        Optional optional = (Optional) obj;
        if (this.a.d.isPresent()) {
            if (optional.isPresent()) {
                ((TextView) ((yzr) this.a.d.get()).b).setText(((ahtd) optional.get()).a);
                int a2 = this.a.b.a(((ahtd) optional.get()).b);
                if (a2 == 0 || (a = aii.a(this.a.c, a2)) == null) {
                    bitmapDrawable = null;
                } else {
                    Bitmap bitmap = ((BitmapDrawable) a).getBitmap();
                    if (this.b == null || this.c != a2) {
                        int dimensionPixelSize = this.a.c.getResources().getDimensionPixelSize(R.dimen.ic_marker_decoration_size);
                        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.a.c.getResources(), Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true));
                        this.b = bitmapDrawable2;
                        bitmapDrawable2.setAntiAlias(true);
                        this.c = a2;
                    }
                    bitmapDrawable = this.b;
                }
                ((TextView) ((yzr) this.a.d.get()).b).setCompoundDrawablesRelativeWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                ((yzr) this.a.d.get()).a(true, false);
            } else {
                ((yzr) this.a.d.get()).a(false, false);
            }
            this.a.e();
        }
    }
}
