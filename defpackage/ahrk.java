package defpackage;

import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahrk implements ypd {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;

    public ahrk(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter) {
        this.a = creatorEndscreenOverlayPresenter;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahee.class};
        }
        if (i == 0) {
            this.a.g.e(((ahee) obj).a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
