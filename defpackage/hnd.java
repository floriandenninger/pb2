package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hnd implements hnf, hmi {
    private final ainy a;
    private final ainl b;
    private final Context c;
    private final aifp d = new aifp(new hnc(), aifq.a, aifq.a, aifq.a);
    private final hmw e;
    private long f;
    private PlayerView g;

    public hnd(Context context, aioc aiocVar, hmw hmwVar) {
        this.a = aiocVar.E();
        this.b = aiocVar.D();
        this.c = context;
        this.e = hmwVar;
    }

    @Override // defpackage.hnf
    public final void a(long j) {
        this.f = j;
        this.a.U(j);
        if (this.a.d()) {
            return;
        }
        this.a.b();
    }

    @Override // defpackage.hnf
    public final void b() {
        this.a.a();
        this.e.i(this.f);
        PlayerView playerView = this.g;
        if (playerView != null) {
            playerView.setVisibility(8);
        }
    }

    @Override // defpackage.hnf
    public final void c() {
        PlaybackStartDescriptor playbackStartDescriptor;
        PlayerView playerView = this.g;
        if (playerView != null) {
            this.a.x(playerView.d, this.d);
            this.g.setVisibility(0);
        } else {
            this.a.x(new PlayerView(this.c).d, this.d);
        }
        ShortsCreationSelectedTrack a = this.e.a();
        if (a != null) {
            aone createBuilder = awdp.a.createBuilder();
            String k = a.k();
            createBuilder.copyOnWrite();
            awdp awdpVar = (awdp) createBuilder.instance;
            awdpVar.b |= 1;
            awdpVar.d = k;
            String i = a.i();
            if (i != null) {
                createBuilder.copyOnWrite();
                awdp awdpVar2 = (awdp) createBuilder.instance;
                awdpVar2.b |= 512;
                awdpVar2.l = i;
            }
            aong aongVar = (aong) apxf.a.createBuilder();
            aongVar.e(WatchEndpointOuterClass.watchEndpoint, (awdp) createBuilder.build());
            apxf apxfVar = (apxf) aongVar.build();
            aifz d = PlaybackStartDescriptor.d();
            d.a = apxfVar;
            d.d();
            d.k = a.a();
            playbackStartDescriptor = d.a();
        } else {
            playbackStartDescriptor = null;
        }
        if (playbackStartDescriptor != null) {
            this.b.d(playbackStartDescriptor);
        }
    }

    @Override // defpackage.hnf
    public final void d(long j) {
        aixh n = this.a.n();
        if (n != null) {
            long b = n.b();
            long j2 = this.f;
            if (b >= j + j2) {
                this.a.U(j2);
            }
        }
    }

    @Override // defpackage.hnf
    public final void e() {
        this.a.a();
    }

    @Override // defpackage.hnf
    public final void f(PlayerView playerView) {
        this.g = playerView;
    }

    @Override // defpackage.hnf
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.hmi
    public final long j() {
        aixh n = this.a.n();
        return n != null ? n.b() : this.f;
    }
}
