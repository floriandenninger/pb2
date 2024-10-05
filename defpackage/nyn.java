package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryListIterator;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nyn implements nys, nyo {
    public final Set a = new CopyOnWriteArraySet();
    public WatchHistoryListIterator b = new WatchHistoryListIterator();
    private final azrw d;
    private PlaybackServiceState e;
    private boolean f;
    private final aadw g;

    public nyn(azrw azrwVar, aadw aadwVar) {
        this.d = azrwVar;
        this.g = aadwVar;
    }

    private final boolean n(PlaybackServiceState playbackServiceState) {
        PlaybackStartDescriptor playbackStartDescriptor;
        PlaybackStartDescriptor a = a();
        if (a == null) {
            return false;
        }
        ainy ainyVar = (ainy) this.d.get();
        if (ainyVar.M(a)) {
            oba.c(a, ainyVar);
            return true;
        }
        String k = a.k();
        if (playbackServiceState == null || TextUtils.isEmpty(k) || !TextUtils.equals(k, ainyVar.p()) || (playbackStartDescriptor = playbackServiceState.a) == null) {
            return false;
        }
        this.b.set(playbackStartDescriptor);
        if (ainyVar.M(playbackStartDescriptor)) {
            oba.c(playbackStartDescriptor, ainyVar);
            return true;
        }
        return false;
    }

    final PlaybackStartDescriptor a() {
        if (this.b.d()) {
            return null;
        }
        return (PlaybackStartDescriptor) this.b.c;
    }

    @Override // defpackage.nys
    public final void b() {
        this.b.a();
    }

    @Override // defpackage.nys
    public final void c() {
        this.b.c();
        this.b.b();
    }

    public final void d() {
        n(null);
    }

    @Override // defpackage.nys
    public final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        WatchHistoryListIterator watchHistoryListIterator = (WatchHistoryListIterator) bundle.getParcelable("watch_history_list_iterator");
        if (watchHistoryListIterator == null) {
            this.e = null;
        } else {
            this.b = watchHistoryListIterator;
            this.e = (PlaybackServiceState) bundle.getParcelable("playback_service_state");
        }
    }

    @Override // defpackage.nys
    public final void f(PlaybackStartDescriptor playbackStartDescriptor, boolean z) {
        String k = playbackStartDescriptor.k();
        PlaybackStartDescriptor a = a();
        String k2 = a != null ? a.k() : null;
        if (TextUtils.isEmpty(k) || !TextUtils.equals(k, k2)) {
            if (z) {
                b();
            } else {
                d();
                this.b.b();
            }
            WatchHistoryListIterator watchHistoryListIterator = this.b;
            if (!watchHistoryListIterator.d()) {
                watchHistoryListIterator.a.offerFirst(watchHistoryListIterator.c);
            }
            watchHistoryListIterator.c = playbackStartDescriptor;
        }
    }

    @Override // defpackage.nys
    public final void g(Bundle bundle) {
        bundle.putParcelable("watch_history_list_iterator", this.b);
        bundle.putParcelable("playback_service_state", c ? this.e : null);
    }

    @Override // defpackage.nys
    public final void h(boolean z) {
        PlaybackServiceState l;
        if (a() == null) {
            return;
        }
        ainy ainyVar = (ainy) this.d.get();
        if (z) {
            l = ainyVar.k();
        } else {
            l = ainyVar.l(true);
        }
        if (true != n(l)) {
            l = null;
        }
        this.e = l;
    }

    @Override // defpackage.nys
    public final void i(boolean z) {
        this.f = z;
    }

    public final boolean j() {
        return this.b.hasPrevious();
    }

    public final boolean k() {
        return this.b.hasNext();
    }

    @Override // defpackage.nyo
    public final void l(kcy kcyVar) {
        this.a.add(kcyVar);
    }

    @Override // defpackage.nys
    public final void m(kcy kcyVar) {
        PlaybackStartDescriptor a = a();
        if (a == null) {
            return;
        }
        if (!this.f) {
            asvu asvuVar = this.g.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.W) {
                return;
            }
        }
        a.p(true);
        kcyVar.a.aM(a, this.e);
        this.e = null;
    }
}
