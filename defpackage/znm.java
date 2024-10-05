package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class znm extends znl {
    private final znh e;
    private final ImageView f;
    private final Context g;

    public znm(Context context, znh znhVar, ImageView imageView, acra acraVar, asht ashtVar) {
        super(znhVar, imageView, acraVar, ashtVar);
        this.e = znhVar;
        this.f = imageView;
        this.g = context;
    }

    @Override // defpackage.znl
    public final void g(boolean z, boolean z2, boolean z3) {
        if (this.e.L(z)) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.drawable.camera_flash_enabled;
            if (i < 23 || !z2) {
                ImageView imageView = this.f;
                Resources resources = this.g.getResources();
                if (!z) {
                    i2 = R.drawable.camera_flash_disabled;
                }
                imageView.setImageDrawable(resources.getDrawable(i2));
            } else if (z) {
                j(R.drawable.camera_flash_enable, R.drawable.camera_flash_enabled);
            } else {
                j(R.drawable.camera_flash_disable, R.drawable.camera_flash_disabled);
            }
            if (z3) {
                i(z);
            }
            this.f.setContentDescription(this.g.getString(true != z ? R.string.accessibility_turn_flashlight_on_button : R.string.accessibility_turn_flashlight_off_button));
        }
    }
}
