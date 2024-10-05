package com.google.android.libraries.youtube.ads.player.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import defpackage.ka;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BrandInteractionView extends LinearLayout {
    public final int a;
    public ImageButton b;
    public ImageButton c;
    public LinearLayout d;
    public ka e;
    private final int f;
    private final int g;

    public BrandInteractionView(Context context) {
        super(context);
        Resources resources = context.getResources();
        this.a = resources.getInteger(R.integer.config_longAnimTime);
        this.f = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.brand_interaction_default_bottom_margin);
        this.g = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.brand_interaction_cta_bottom_margin);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        yny.z(this, yny.k((z || (z2 && z3)) ? this.g : this.f), ViewGroup.MarginLayoutParams.class);
    }

    public BrandInteractionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.a = resources.getInteger(R.integer.config_longAnimTime);
        this.f = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.brand_interaction_default_bottom_margin);
        this.g = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.brand_interaction_cta_bottom_margin);
    }

    public BrandInteractionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.a = resources.getInteger(R.integer.config_longAnimTime);
        this.f = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.brand_interaction_default_bottom_margin);
        this.g = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.brand_interaction_cta_bottom_margin);
    }

    public BrandInteractionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Resources resources = context.getResources();
        this.a = resources.getInteger(R.integer.config_longAnimTime);
        this.f = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.brand_interaction_default_bottom_margin);
        this.g = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.brand_interaction_cta_bottom_margin);
    }
}
