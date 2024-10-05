package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hiz implements ajom, zae {
    private final AudioTrackView a;
    private final ajkj b;

    public hiz(ajjz ajjzVar, ViewGroup viewGroup) {
        AudioTrackView audioTrackView = (AudioTrackView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.audio_track, viewGroup, false);
        this.a = audioTrackView;
        this.b = new ajkj(ajjzVar, audioTrackView.d);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.zae
    public final void d(ImageView imageView) {
        afsi.b(2, 6, "[ShortsCreation][Android][Edit]Failure while loading thumbnail.");
    }

    @Override // defpackage.zae
    public final void e(ImageView imageView) {
    }

    @Override // defpackage.zae
    public final void f(ImageView imageView) {
    }

    @Override // defpackage.zae
    public final void g() {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        ShortsCreationSelectedTrack shortsCreationSelectedTrack = ((hjb) obj).a;
        avgg h = shortsCreationSelectedTrack.h();
        if (h != null) {
            this.b.m(h, true, false, this);
        }
        String j = shortsCreationSelectedTrack.j();
        if (j != null) {
            this.a.c.setText(j);
        }
        if (shortsCreationSelectedTrack.d().h()) {
            long longValue = ((Long) shortsCreationSelectedTrack.d().c()).longValue();
            long min = Math.min(15000L, longValue);
            AudioTrackView audioTrackView = this.a;
            long b = audioTrackView.a.b();
            if (b > 0) {
                audioTrackView.f = b;
            }
            audioTrackView.g = Math.min(min, audioTrackView.f);
            this.a.c(shortsCreationSelectedTrack.a(), longValue, shortsCreationSelectedTrack.e());
        }
    }
}
