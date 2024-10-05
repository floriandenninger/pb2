package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.aii;
import defpackage.boi;
import defpackage.ji;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public final AnimationDrawable a;
    public final AnimationDrawable b;
    public final String c;
    public final String d;
    public boolean e;
    public View.OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) aii.a(context, R.drawable.mr_group_expand);
        this.a = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) aii.a(context, R.drawable.mr_group_collapse);
        this.b = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(ji.u(context, i), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.c = string;
        this.d = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new boi(this));
    }
}
