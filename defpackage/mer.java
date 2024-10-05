package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mer {
    private final ajuw a;
    private final zau b;

    public mer(ajuw ajuwVar, Context context) {
        this.a = ajuwVar;
        this.b = new zau(context);
    }

    public final void a(View view, ImageView imageView, atdc atdcVar, aqev aqevVar, Object obj, acra acraVar) {
        Context context = imageView.getContext();
        if (aqevVar == null) {
            imageView.setImageDrawable(aii.a(context, R.drawable.contextual_menu_anchor));
        } else {
            Drawable a = aii.a(context, R.drawable.contextual_menu_anchor_normal);
            Drawable a2 = aii.a(context, R.drawable.contextual_menu_anchor_pressed);
            Drawable b = this.b.b(a, aqevVar.b);
            Drawable b2 = this.b.b(a2, aqevVar.c);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed}, b2);
            stateListDrawable.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_focused}, b2);
            stateListDrawable.addState(new int[]{android.R.attr.state_enabled, android.R.attr.state_selected}, b2);
            stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, b);
            imageView.setImageDrawable(stateListDrawable);
        }
        this.a.e(view, imageView, atdcVar, obj, acraVar);
    }
}
