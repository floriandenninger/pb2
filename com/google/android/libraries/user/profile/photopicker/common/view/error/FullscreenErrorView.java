package com.google.android.libraries.user.profile.photopicker.common.view.error;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.youtube.R;
import defpackage.axpj;
import defpackage.axxp;
import defpackage.gl;
import defpackage.nz;
import defpackage.tgd;
import defpackage.tgn;
import defpackage.vni;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FullscreenErrorView extends vni {
    public tgn d;
    public tgd e;
    public MaterialTextView f;
    public MaterialButton g;
    public MaterialButton h;
    private AppCompatImageView j;

    public FullscreenErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!((vni) this).i) {
            Object context2 = getContext();
            while (!(context2 instanceof axpj) && (context2 instanceof ContextWrapper)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            ((axpj) context2).g().g(this);
        }
        if (!axxp.h()) {
            inflate(getContext(), R.layout.photo_picker_fullscreen_error, this);
        } else {
            inflate(getContext(), R.layout.photo_picker_fullscreen_error_remove_settings, this);
        }
        this.j = (AppCompatImageView) findViewById(R.id.photo_picker_error_image);
        this.f = (MaterialTextView) findViewById(R.id.photo_picker_error_text);
        this.g = (MaterialButton) findViewById(R.id.photo_picker_retry_button);
        this.d.a.a(110128).a(this);
        this.d.a.a(97066).a(this.g);
        if (axxp.h()) {
            return;
        }
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.photo_picker_settings_button);
        this.h = materialButton;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: vnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullscreenErrorView fullscreenErrorView = FullscreenErrorView.this;
                fullscreenErrorView.e.a(tgc.a(), fullscreenErrorView.h);
                fullscreenErrorView.getContext().startActivity(new Intent("android.settings.SETTINGS"));
            }
        });
        this.d.a.a(104981).a(this.h);
    }

    public final void c() {
        Drawable c = gl.c(nz.b(getContext(), R.drawable.quantum_gm_ic_alert_vd_theme_24));
        c.setTint(getResources().getColor(R.color.google_grey500));
        this.j.setImageDrawable(c);
    }
}
