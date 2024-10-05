package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import android.content.Context;
import defpackage.afla;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class a extends afla implements c {
    private int a;
    private int b;
    private com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b c;

    public a(Context context) {
        super(context);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c
    public final void a(int i, int i2) {
        this.a = i;
        this.b = i2;
        requestLayout();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c
    public final void b(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b bVar) {
        this.c = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c
    public final void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = getDefaultSize(this.a, i);
        int defaultSize2 = getDefaultSize(this.b, i2);
        int i4 = this.a;
        if (i4 > 0 && (i3 = this.b) > 0) {
            float f = ((i4 / i3) / (defaultSize / defaultSize2)) - 1.0f;
            if (f > 0.01f) {
                defaultSize2 = (i3 * defaultSize) / i4;
            } else if (f < -0.01f) {
                defaultSize = (i4 * defaultSize2) / i3;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b bVar = this.c;
        if (bVar != null) {
            bVar.b.set(defaultSize);
            bVar.c.set(defaultSize2);
        }
    }
}
