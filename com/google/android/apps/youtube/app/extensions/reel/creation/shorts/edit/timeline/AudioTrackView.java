package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui.MusicWaveformView;
import com.google.android.youtube.R;
import defpackage.acsb;
import defpackage.aii;
import defpackage.ammv;
import defpackage.amru;
import defpackage.hfq;
import defpackage.hgo;
import defpackage.hjg;
import defpackage.hni;
import defpackage.hok;
import defpackage.hrv;
import defpackage.jqr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AudioTrackView extends hjg implements hni {
    public hgo a;
    public hrv b;
    public final TextView c;
    public final ImageView d;
    MusicWaveformView e;
    public long f;
    public long g;
    public jqr h;
    private final int i;
    private final LinearLayout j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final float o;
    private int p;
    private long q;
    private long r;
    private ammv s;

    public AudioTrackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final int i(long j) {
        return (int) (((((float) j) / ((float) this.a.b())) * this.p) + this.i);
    }

    @Override // defpackage.hni
    public final void b() {
    }

    public final void c(long j, long j2, ammv ammvVar) {
        this.r = j2;
        this.s = ammvVar;
        this.e.d(0.0f, 0.0f, r0.getWidth());
        int height = this.e.getHeight();
        float f = this.o;
        MusicWaveformView musicWaveformView = this.e;
        int i = this.n;
        hok hokVar = musicWaveformView.a;
        hokVar.g = i;
        hokVar.f = (int) (height - f);
        long j3 = this.g;
        musicWaveformView.b(j3, j3, this);
        if (ammvVar == null || !ammvVar.h()) {
            this.e.a(j2);
        } else {
            this.e.c(j2, (byte[]) ammvVar.c(), amru.q());
        }
        this.q = j;
        this.e.e(j);
    }

    @Override // defpackage.hni
    public final boolean f(long j) {
        return true;
    }

    @Override // defpackage.hni
    public final void ma() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int i5 = this.i;
        this.p = (width - i5) - i5;
        this.j.layout(i(0L), getPaddingTop(), i(this.g), getHeight() - getPaddingBottom());
        ImageView imageView = this.d;
        int i6 = this.k;
        int i7 = this.m + i6;
        imageView.layout(i6, i6, i7, i7);
        int height = this.j.getHeight();
        int lineHeight = this.c.getLineHeight();
        int i8 = this.k;
        int i9 = ((((height / 2) - lineHeight) - i8) / 2) + i8;
        this.c.layout(this.d.getRight() + this.k, i9, this.j.getWidth() - this.k, this.c.getLineHeight() + i9);
        int height2 = this.j.getHeight();
        int i10 = this.l;
        int height3 = (this.j.getHeight() / 2) - this.l;
        this.e.layout(0, (this.j.getHeight() / 2) + this.l, this.j.getWidth(), (height2 / 2) + i10 + height3 + height3);
        c(this.q, this.r, this.s);
        jqr jqrVar = this.h;
        if (jqrVar != null) {
            hfq a = jqrVar.a(acsb.c(127670));
            a.h(true);
            a.a();
        }
    }

    public AudioTrackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = 0;
        this.f = this.b.b();
        this.g = this.b.b();
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        this.j = linearLayout;
        addView(linearLayout);
        linearLayout.setBackgroundColor(resources.getColor(R.color.timeline_audio_track_default_color));
        linearLayout.setBackground(resources.getDrawable(R.drawable.audio_track_shape));
        linearLayout.setClipToOutline(true);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setMinLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setIncludeFontPadding(false);
        linearLayout.addView(textView);
        MusicWaveformView musicWaveformView = new MusicWaveformView(context);
        this.e = musicWaveformView;
        linearLayout.addView(musicWaveformView);
        this.e.setEnabled(false);
        this.e.h = this;
        this.i = aii.a(context, R.drawable.ic_timeline_track_left_handle).getIntrinsicWidth();
        this.k = (int) getResources().getDimension(R.dimen.audio_track_container_padding);
        this.l = (int) getResources().getDimension(R.dimen.audio_track_waveform_padding);
        this.m = (int) getResources().getDimension(R.dimen.audio_track_thumbnail_size);
        this.o = context.getResources().getDimension(R.dimen.camera_music_waveform_stroke_width);
        this.n = (int) context.getResources().getDimension(R.dimen.audio_track_background_radius);
    }
}
