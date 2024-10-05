package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahwg implements ypd {
    final /* synthetic */ LiveOverlayPresenter a;

    public ahwg(LiveOverlayPresenter liveOverlayPresenter) {
        this.a = liveOverlayPresenter;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahee.class};
        }
        if (i == 0) {
            if (((ahee) obj).a) {
                this.a.a.m();
                return null;
            }
            this.a.a.u(this.a.n != aign.ENDED);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
