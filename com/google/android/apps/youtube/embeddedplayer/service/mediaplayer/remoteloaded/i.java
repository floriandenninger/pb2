package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i extends a {
    public final b a;
    public SurfaceView b;
    public View c;
    private Runnable d;

    private i(Context context, b bVar) {
        super(context);
        bVar.getClass();
        this.a = bVar;
    }

    public static i i(Context context, b bVar) {
        final i iVar = new i(context, bVar);
        View view = new View(iVar.getContext());
        iVar.c = view;
        view.setBackgroundColor(-16777216);
        iVar.addView(iVar.c);
        iVar.d = new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.c.setVisibility(8);
            }
        };
        return iVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c
    public final void e() {
        removeCallbacks(this.d);
        this.c.setVisibility(0);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c
    public final void f() {
        SurfaceView surfaceView = this.b;
        if (surfaceView != null) {
            removeView(surfaceView);
            addView(this.b, 0);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c
    public final void h() {
        postDelayed(this.d, 0L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SurfaceView surfaceView = this.b;
        if (surfaceView != null) {
            surfaceView.layout(0, 0, surfaceView.getMeasuredWidth(), this.b.getMeasuredHeight());
        }
        if (this.c.getVisibility() != 8) {
            View view = this.c;
            view.layout(0, 0, view.getMeasuredWidth(), this.c.getMeasuredHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.a, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        SurfaceView surfaceView = this.b;
        if (surfaceView != null) {
            surfaceView.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.c.getVisibility() != 8) {
            this.c.measure(makeMeasureSpec, makeMeasureSpec2);
        }
    }
}
