package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aemb implements MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, aemg {
    public aemf a;
    private final MediaPlayer b;
    private PlayerConfigModel c;

    public aemb() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.b = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnVideoSizeChangedListener(this);
        mediaPlayer.setOnBufferingUpdateListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnInfoListener(this);
    }

    @Override // defpackage.aemg
    public final int a() {
        return this.b.getAudioSessionId();
    }

    @Override // defpackage.aemg
    public final int b() {
        return this.b.getCurrentPosition();
    }

    @Override // defpackage.aemg
    public final int c() {
        return this.b.getDuration();
    }

    @Override // defpackage.aemg
    public final void f() {
        this.b.pause();
    }

    @Override // defpackage.aemg
    public final void g() {
        this.b.prepare();
    }

    @Override // defpackage.aemg
    public final void h() {
        this.b.prepareAsync();
    }

    @Override // defpackage.aemg
    public final void i() {
        this.b.release();
    }

    @Override // defpackage.aemg
    public final void j(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("32 bit integer overflow attempting to seekTo: ");
            sb.append(j);
            sb.append(".");
            afsi.b(1, 6, sb.toString());
            return;
        }
        this.b.seekTo((int) j);
    }

    @Override // defpackage.aemg
    public final void k(int i) {
        this.b.setAudioStreamType(i);
    }

    @Override // defpackage.aemg
    public final void l(Context context, Uri uri, Map map, PlayerConfigModel playerConfigModel) {
        this.b.setDataSource(context, uri, (Map<String, String>) map);
        this.c = playerConfigModel;
    }

    @Override // defpackage.aemg
    public final void m(SurfaceHolder surfaceHolder) {
        try {
            this.b.setDisplay(surfaceHolder);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.aemg
    public final void n(aemf aemfVar) {
        this.a = aemfVar;
    }

    @Override // defpackage.aemg
    public final void o(PlaybackParams playbackParams) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.b.setPlaybackParams(playbackParams);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        aemf aemfVar = this.a;
        if (aemfVar != null) {
            aemfVar.s(i);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        aemf aemfVar = this.a;
        if (aemfVar != null) {
            aemfVar.t();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        aemf aemfVar = this.a;
        if (aemfVar != null) {
            return aemfVar.u(i, i2);
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        aemf aemfVar = this.a;
        if (aemfVar != null) {
            aemfVar.v(i, i2);
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        aemf aemfVar = this.a;
        if (aemfVar != null) {
            aemfVar.d(this);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        aemf aemfVar = this.a;
        if (aemfVar != null) {
            aemfVar.w();
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        aemf aemfVar = this.a;
        if (aemfVar != null) {
            aemfVar.e(this, i, i2);
        }
    }

    @Override // defpackage.aemg
    public final void p(Surface surface) {
        try {
            this.b.setSurface(surface);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.aemg
    public final void q(float f, float f2) {
        this.b.setVolume(aedn.m(this.c, f), aedn.m(this.c, f2));
    }

    @Override // defpackage.aemg
    public final void r() {
        this.b.start();
    }
}
