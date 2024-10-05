package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acfe implements ypd {
    final /* synthetic */ LiveCreationActivity a;

    public acfe(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wjc.class, aaci.class};
        }
        if (i == 0) {
            wjb wjbVar = wjb.STARTED;
            int ordinal = ((wjc) obj).a().ordinal();
            if (ordinal != 1 && ordinal != 2) {
                return null;
            }
            if (this.a.k.t()) {
                this.a.w();
                return null;
            }
            whu.K(this.a, R.string.lc_not_signed_in, 0);
            this.a.finish();
            return null;
        }
        if (i == 1) {
            ammv f = ((aaci) obj).f();
            if (!((Boolean) f.b(aard.o).e(false)).booleanValue()) {
                return null;
            }
            LiveCreationActivity liveCreationActivity = this.a;
            aqyg aqygVar = ((atnz) f.c()).c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.L(liveCreationActivity, ajcq.b(aqygVar), 0);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
