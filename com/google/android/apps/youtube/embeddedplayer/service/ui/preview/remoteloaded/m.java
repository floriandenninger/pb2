package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ahus;
import defpackage.ahux;
import defpackage.alta;
import defpackage.ayqx;
import defpackage.ayrz;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m extends ahus {
    public TextView a;
    public TextView b;
    public l c;
    public ayqx d;
    public com.google.android.apps.youtube.embeddedplayer.service.model.d e;
    public ayqx f;
    public boolean g;
    private FrameLayout h;
    private boolean i;

    public m(Context context) {
        super(context);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.h = new FrameLayout(context);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.g) {
            try {
                from.inflate(R.layout.preview_to_player_transition_overlay, this.h);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("Unable to inflate LazyPreviewThumbnailOverlay: ");
                sb.append(valueOf);
                alta.B(sb.toString(), new Object[0]);
                return this.h;
            }
        } else {
            from.inflate(R.layout.preview_to_player_transition_overlay, this.h);
        }
        if (!this.f.e()) {
            ayrz.c((AtomicReference) this.f);
        }
        this.i = true;
        this.a = (TextView) this.h.findViewById(R.id.embed_title);
        this.b = (TextView) this.h.findViewById(R.id.embed_subtitle);
        ImageView imageView = (ImageView) this.h.findViewById(R.id.embed_preview_thumbnail);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.preview_to_player_fade_animation);
        l lVar = new l(imageView, loadAnimation);
        loadAnimation.setAnimationListener(lVar);
        this.c = lVar;
        kV();
        return this.h;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* synthetic */ void d(Context context, View view) {
        if (np()) {
            this.a.setText(this.e.b);
            this.b.setText(this.e.c);
            Bitmap bitmap = this.e.d;
            if (bitmap != null) {
                this.c.a.setImageBitmap(bitmap);
            }
            if (ab(2)) {
                this.a.setVisibility(0);
                this.b.setVisibility(0);
            }
            if (ab(1)) {
                l lVar = this.c;
                lVar.a.clearAnimation();
                lVar.a.setAlpha(lVar.c);
                lVar.a.setVisibility(0);
            }
        }
    }

    public final void k() {
        super.aa();
        Z(2);
    }

    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.e = false;
        kU.b();
        kU.a();
        return kU;
    }

    @Override // defpackage.ahus
    public final void kV() {
        super.X();
        if (np()) {
            this.a.setVisibility(8);
            this.b.setVisibility(8);
            l lVar = this.c;
            lVar.a.clearAnimation();
            lVar.a.setVisibility(8);
        }
    }

    public final void m() {
        super.aa();
        Z(1);
    }

    @Override // defpackage.ahus, defpackage.ahuu
    public final boolean np() {
        return this.i && super.np();
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.e != null;
    }
}
