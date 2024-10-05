package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hta extends znl {
    private final znh e;
    private final ImageView f;
    private final Context g;

    public hta(Context context, znh znhVar, ImageView imageView, acra acraVar) {
        super(znhVar, imageView, acraVar, null);
        this.e = znhVar;
        this.f = imageView;
        this.g = context;
    }

    @Override // defpackage.znl
    public final void g(boolean z, boolean z2, boolean z3) {
        if (this.e.L(z)) {
            this.f.setImageDrawable(this.g.getResources().getDrawable(true != z ? R.drawable.reel_flash_off_icon_v2 : R.drawable.reel_flash_on_icon_v2));
            if (z3) {
                i(z);
            }
            this.f.setContentDescription(this.g.getString(true != z ? R.string.accessibility_turn_flashlight_on_button : R.string.accessibility_turn_flashlight_off_button));
        }
    }
}
