package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aimv implements aimt, aimq {
    private final PlaybackStartDescriptor a;
    private final String[] b;
    private final Set c;
    private int d;
    private int e;

    public aimv(PlaybackStartDescriptor playbackStartDescriptor) {
        this.a = playbackStartDescriptor;
        this.b = v(playbackStartDescriptor);
        this.e = playbackStartDescriptor.b();
        this.c = new HashSet();
    }

    private final PlaybackStartDescriptor m(int i, boolean z) {
        int max = Math.max(0, Math.min(i, this.b.length - 1));
        if (max != i) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Out of bounds access of video IDs list. Index ");
            sb.append(i);
            sb.append(" bounded to ");
            sb.append(max);
            afsi.b(1, 10, sb.toString());
        }
        aifz d = PlaybackStartDescriptor.d();
        d.a = aigp.f(this.b[max], "", -1, 0.0f);
        d.f = z;
        d.e = z;
        return d.a();
    }

    private final synchronized PlaybackStartDescriptor n(boolean z) {
        if (!r()) {
            afsi.b(1, 10, "Attempting to advance to non-existent video.");
            return null;
        }
        q((B() == 1 && t()) ? 0 : this.e + 1);
        return m(this.e, z);
    }

    private final synchronized PlaybackStartDescriptor o() {
        int max;
        if (!s()) {
            afsi.b(1, 10, "Attempting to go to prior video of the first video.");
            return null;
        }
        if (B() != 1 || this.e > 0) {
            max = Math.max(0, this.e - 1);
        } else {
            max = this.b.length - 1;
        }
        q(max);
        return m(this.e, false);
    }

    private final synchronized void p() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aime) it.next()).a();
        }
    }

    private final synchronized void q(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        p();
    }

    private final synchronized boolean r() {
        if (B() != 1) {
            if (t()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean s() {
        if (B() != 1) {
            if (this.e <= 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean t() {
        return this.e >= this.b.length + (-1);
    }

    private static String[] v(PlaybackStartDescriptor playbackStartDescriptor) {
        List m = playbackStartDescriptor.m();
        return m == null ? new String[0] : (String[]) m.toArray(new String[0]);
    }

    @Override // defpackage.aimq
    public final synchronized int B() {
        return this.d;
    }

    @Override // defpackage.aimq
    public final synchronized void C(int i) {
        boolean s = s();
        boolean r = r();
        this.d = i;
        if (s == s() && r == r()) {
            return;
        }
        p();
    }

    @Override // defpackage.aimt
    public final PlaybackStartDescriptor a(aims aimsVar) {
        aimr aimrVar = aimr.NEXT;
        int ordinal = aimsVar.e.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return o();
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    afsi.b(1, 10, "Autonav unsupported by VideoIdsSequenceNavigator.");
                    return null;
                }
                if (ordinal == 4) {
                    return aimsVar.f;
                }
                String valueOf = String.valueOf(aimsVar.e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Unsupported navigation type: ");
                sb.append(valueOf);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        return n(aimsVar.e == aimr.AUTOPLAY);
    }

    @Override // defpackage.aimt
    public final aigd b(aims aimsVar) {
        return aigd.a;
    }

    @Override // defpackage.aimt
    public final aims c(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        return new aims(aimr.JUMP, playbackStartDescriptor, aigdVar);
    }

    @Override // defpackage.aimt
    public final SequenceNavigatorState d() {
        return new VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState(this.a, this.e);
    }

    @Override // defpackage.aimt
    public final void e(boolean z) {
    }

    @Override // defpackage.aimt
    public final void f(aims aimsVar, PlaybackStartDescriptor playbackStartDescriptor) {
    }

    @Override // defpackage.aimt
    public final void g() {
    }

    @Override // defpackage.aimt
    public final void h(WatchNextResponseModel watchNextResponseModel) {
    }

    @Override // defpackage.aimt
    public final boolean i() {
        return false;
    }

    @Override // defpackage.aimt
    public final int j(aims aimsVar) {
        aimr aimrVar = aimr.NEXT;
        int ordinal = aimsVar.e.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return aims.a(s());
            }
            if (ordinal != 2) {
                return ordinal != 3 ? ordinal != 4 ? 1 : 2 : aims.a(false);
            }
        }
        return aims.a(r());
    }

    @Override // defpackage.aimt
    public final synchronized void k(aime aimeVar) {
        this.c.add(aimeVar);
    }

    @Override // defpackage.aimt
    public final synchronized void l(aime aimeVar) {
        this.c.remove(aimeVar);
    }

    @Override // defpackage.aimq
    public final /* synthetic */ boolean u(int i) {
        return i == 1;
    }

    public aimv(VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState videoIdsSequenceNavigator$VideoIdsSequenceNavigatorState) {
        PlaybackStartDescriptor playbackStartDescriptor = videoIdsSequenceNavigator$VideoIdsSequenceNavigatorState.a;
        this.a = playbackStartDescriptor;
        this.b = v(playbackStartDescriptor);
        this.e = videoIdsSequenceNavigator$VideoIdsSequenceNavigatorState.b;
        this.c = new HashSet();
    }
}
