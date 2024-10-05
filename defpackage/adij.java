package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adij {
    public static final /* synthetic */ int i = 0;
    protected final azrw a;
    public aheg b;
    public awdp c;
    public final aioc e;
    public String g;
    public final adii h = new adii(this, 1);
    public final adii d = new adii(this, 0);
    public final ayqw f = new ayqw();

    static {
        zga.a("MDX.CurrentPlaybackMonitor");
    }

    public adij(azrw azrwVar, aioc aiocVar) {
        this.a = azrwVar;
        this.e = aiocVar;
    }

    protected abstract int a();

    protected abstract adle b(adle adleVar);

    public final adle c(boolean z) {
        awdp awdpVar;
        aomf aomfVar;
        ainy ainyVar = (ainy) this.a.get();
        String str = this.g;
        if (str == null) {
            str = ainyVar.q();
        }
        aixh n = ainyVar.n();
        PlayerResponseModel c = n == null ? null : n.c();
        boolean z2 = false;
        if (n != null && c != null) {
            atbl atblVar = c.c().c.s;
            if (atblVar == null) {
                atblVar = atbl.a;
            }
            if (atblVar.b) {
                z2 = true;
            }
        }
        if (!z) {
            return adle.a;
        }
        if (TextUtils.isEmpty(str) || z2) {
            return b(adle.a);
        }
        PlaybackStartDescriptor playbackStartDescriptor = ainyVar.k().a;
        if (playbackStartDescriptor != null) {
            apxf apxfVar = playbackStartDescriptor.b;
            aomfVar = apxfVar == null ? null : apxfVar.c;
            awdpVar = apxfVar == null ? this.c : (awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint);
        } else {
            awdpVar = this.c;
            aomfVar = null;
        }
        adld c2 = adle.c();
        c2.f(str);
        c2.e(a());
        c2.b(adjd.a(c, this.b));
        c2.a = ainyVar.m();
        c2.d = aomfVar == null ? null : aomfVar.I();
        c2.c = awdpVar == null ? null : awdpVar.l;
        c2.b = awdpVar != null ? awdpVar.g : null;
        String d = d();
        if (d != null) {
            c2.d(d);
        }
        return b(c2.a());
    }

    protected abstract String d();
}
