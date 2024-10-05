package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import defpackage.alta;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class t extends a {
    public TextureView a;
    public final com.google.android.youtube.api.jar.client.i b;

    public t(Context context, com.google.android.youtube.api.jar.client.i iVar) {
        super(context);
        this.b = iVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c
    public final void e() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c
    public final void f() {
        TextureView textureView = this.a;
        if (textureView != null) {
            removeView(textureView);
            addView(this.a);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c
    public final void h() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            return;
        }
        com.google.android.youtube.api.jar.client.i iVar = this.b;
        alta.B("Cannot attach a YouTubePlayerView backed by a TextureView to a Window that is not hardware accelerated", new Object[0]);
        iVar.b.az(14);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextureView textureView = this.a;
        if (textureView != null) {
            textureView.layout(0, 0, textureView.getMeasuredWidth(), this.a.getMeasuredHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.a, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        TextureView textureView = this.a;
        if (textureView != null) {
            textureView.measure(makeMeasureSpec, makeMeasureSpec2);
        }
    }
}
