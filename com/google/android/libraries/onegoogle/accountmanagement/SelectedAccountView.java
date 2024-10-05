package com.google.android.libraries.onegoogle.accountmanagement;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.youtube.R;
import defpackage.amkq;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.ufe;
import defpackage.uff;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SelectedAccountView extends ConstraintLayout implements uff {
    private static final Property q = Property.of(ImageView.class, Float.class, "rotation");
    public final AccountParticleDisc i;
    public final ImageView j;
    public final ImageView k;
    public final FrameLayout l;
    public final ObjectAnimator m;
    public ufe n;
    public boolean o;
    public ammv p;
    private final TextView r;
    private final TextView s;
    private final TextView t;

    public SelectedAccountView(Context context) {
        this(context, null);
    }

    @Override // defpackage.uff
    public final TextView e() {
        return this.t;
    }

    @Override // defpackage.uff
    public final TextView f() {
        return this.r;
    }

    @Override // defpackage.uff
    public final TextView g() {
        return this.s;
    }

    @Override // defpackage.uff
    public final AccountParticleDisc h() {
        return this.i;
    }

    public final void i() {
        amkq.O(true, "Cannot show right drawable (info/chevron) and counter at the same time");
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = amlr.a;
        LayoutInflater.from(context).inflate(R.layout.selected_account_view, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.account_menu_header_signed_in_layout_min_height);
        if (dimensionPixelSize != this.d) {
            this.d = dimensionPixelSize;
            requestLayout();
        }
        this.r = (TextView) findViewById(R.id.account_display_name);
        this.s = (TextView) findViewById(R.id.account_name);
        this.t = (TextView) findViewById(R.id.counter);
        this.i = (AccountParticleDisc) findViewById(R.id.account_avatar);
        ImageView imageView = (ImageView) findViewById(R.id.og_collapsed_chevron);
        this.j = imageView;
        this.m = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) q, 360.0f, 180.0f);
        this.k = (ImageView) findViewById(R.id.og_custom_icon);
        this.l = (FrameLayout) findViewById(R.id.og_trailing_drawable_container);
    }
}
