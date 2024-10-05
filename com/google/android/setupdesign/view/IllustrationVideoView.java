package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Animatable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import defpackage.alta;
import defpackage.altp;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class IllustrationVideoView extends TextureView implements Animatable, TextureView.SurfaceTextureListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener {
    protected MediaPlayer a;
    Surface b;
    private float c;
    private int d;
    private String e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i;

    public IllustrationVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 1.0f;
        this.d = 0;
        this.g = true;
        this.h = 0;
        this.i = false;
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, altp.k);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (alta.f()) {
            this.g = obtainStyledAttributes.getBoolean(0, true);
        }
        obtainStyledAttributes.recycle();
        String packageName = getContext().getPackageName();
        if (resourceId != this.d || (packageName != null && !packageName.equals(this.e))) {
            this.d = resourceId;
            this.e = packageName;
            a();
        }
        setScaleX(0.9999999f);
        setScaleX(0.9999999f);
        setSurfaceTextureListener(this);
    }

    private final void c() {
        if (getWindowVisibility() == 0) {
            Surface surface = this.b;
            if (surface != null) {
                surface.release();
                this.b = null;
            }
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                d(true);
                this.b = new Surface(surfaceTexture);
            }
            if (this.b != null) {
                a();
            }
        }
    }

    private final void d(boolean z) {
        this.i = z;
        setVisibility(this.h);
    }

    protected final void a() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        if (this.b == null || this.d == 0) {
            return;
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.a = mediaPlayer2;
        mediaPlayer2.setSurface(this.b);
        this.a.setOnPreparedListener(this);
        this.a.setOnSeekCompleteListener(this);
        this.a.setOnInfoListener(this);
        this.a.setOnErrorListener(this);
        int i = this.d;
        String str = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/");
        sb.append(i);
        try {
            this.a.setDataSource(getContext(), Uri.parse(sb.toString()), (Map<String, String>) null);
            this.a.prepareAsync();
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("Unable to set video data source: ");
            sb2.append(i);
            Log.e("IllustrationVideoView", sb2.toString(), e);
        }
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.a = null;
            this.f = false;
        }
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        MediaPlayer mediaPlayer = this.a;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(53);
        sb.append("MediaPlayer error. what=");
        sb.append(i);
        sb.append(" extra=");
        sb.append(i2);
        Log.w("IllustrationVideoView", sb.toString());
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            d(false);
        }
        return false;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = size2;
        float f2 = this.c;
        float f3 = size * f2;
        if (f < f3) {
            size = (int) (f / f2);
        } else {
            size2 = (int) f3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        float f;
        this.f = true;
        mediaPlayer.setLooping(true);
        if (mediaPlayer.getVideoWidth() <= 0 || mediaPlayer.getVideoHeight() <= 0) {
            int videoWidth = mediaPlayer.getVideoWidth();
            int videoHeight = mediaPlayer.getVideoHeight();
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unexpected video size=");
            sb.append(videoWidth);
            sb.append("x");
            sb.append(videoHeight);
            Log.w("IllustrationVideoView", sb.toString());
            f = 0.0f;
        } else {
            f = mediaPlayer.getVideoHeight() / mediaPlayer.getVideoWidth();
        }
        if (Float.compare(this.c, f) != 0) {
            this.c = f;
            requestLayout();
        }
        if (getWindowVisibility() == 0) {
            start();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f) {
            mediaPlayer.start();
        } else {
            Log.e("IllustrationVideoView", "Seek complete but media player not prepared");
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        d(true);
        c();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            start();
        } else {
            stop();
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            b();
        } else if (this.b == null) {
            c();
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.h = i;
        if (this.i && i == 0) {
            i = 4;
        }
        super.setVisibility(i);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        MediaPlayer mediaPlayer;
        if (!this.f || (mediaPlayer = this.a) == null || mediaPlayer.isPlaying()) {
            return;
        }
        this.a.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        MediaPlayer mediaPlayer;
        if (this.g && this.f && (mediaPlayer = this.a) != null) {
            mediaPlayer.pause();
        }
    }
}
