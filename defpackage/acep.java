package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acep implements Runnable {
    public final /* synthetic */ LiveCreationActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ acep(LiveCreationActivity liveCreationActivity, int i) {
        this.b = i;
        this.a = liveCreationActivity;
    }

    public acep(LiveCreationActivity liveCreationActivity, int i, byte[] bArr) {
        this.b = i;
        this.a = liveCreationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            LiveCreationActivity liveCreationActivity = this.a;
            if (liveCreationActivity.H != null) {
                if (!liveCreationActivity.M) {
                    dn k = liveCreationActivity.D.k();
                    k.m(liveCreationActivity.H);
                    k.a();
                }
                liveCreationActivity.H.aG(null);
                liveCreationActivity.H = null;
            }
            liveCreationActivity.aC();
            liveCreationActivity.aA(true ^ "LIVE_STREAM_FRAGMENT".equals(liveCreationActivity.C.w));
            liveCreationActivity.w();
            return;
        }
        if (i == 1) {
            LiveCreationActivity liveCreationActivity2 = this.a;
            new abrx(liveCreationActivity2, liveCreationActivity2.r).c();
            return;
        }
        int i2 = 2;
        if (i == 2) {
            LiveCreationActivity liveCreationActivity3 = this.a;
            liveCreationActivity3.aD(liveCreationActivity3.f176J, "EDIT_THUMBNAIL_FRAGMENT_NAME");
            return;
        }
        int i3 = 3;
        if (i == 3) {
            LiveCreationActivity liveCreationActivity4 = this.a;
            acen acenVar = new acen(liveCreationActivity4, 0);
            ynm.o(liveCreationActivity4, liveCreationActivity4.X.a(), new hly(acenVar, i3), new hly(acenVar, i2));
        } else {
            if (i == 4) {
                this.a.aK();
                return;
            }
            if (this.a.aa.m()) {
                LiveCreationActivity liveCreationActivity5 = this.a;
                liveCreationActivity5.aq(liveCreationActivity5.r.c());
            } else {
                SharedPreferences.Editor edit = this.a.A.edit();
                edit.putLong("SHARED_PREF_LS_TIMESTAMP_KEY", this.a.r.c());
                edit.commit();
            }
            this.a.R.postDelayed(this, LiveCreationActivity.d);
        }
    }
}
