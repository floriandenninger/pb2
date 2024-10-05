package com.google.android.apps.youtube.app.common.inappupdate;

import android.app.Activity;
import android.content.IntentSender;
import android.view.View;
import com.google.android.apps.youtube.app.common.inappupdate.DefaultInAppUpdateController;
import com.google.android.play.core.install.InstallState;
import com.google.android.youtube.R;
import defpackage.acpx;
import defpackage.akbz;
import defpackage.alod;
import defpackage.alof;
import defpackage.alok;
import defpackage.aloz;
import defpackage.alrx;
import defpackage.alsa;
import defpackage.alsc;
import defpackage.amkq;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.any;
import defpackage.aok;
import defpackage.aqxl;
import defpackage.argm;
import defpackage.argo;
import defpackage.ffz;
import defpackage.fgb;
import defpackage.gcm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DefaultInAppUpdateController implements fgb, aloz, any {
    public final alof a;
    public final ffz b;
    private final Activity c;
    private final akbz d;
    private int e;
    private volatile boolean f;
    private volatile boolean g;

    public DefaultInAppUpdateController(Activity activity, akbz akbzVar, alof alofVar, ffz ffzVar) {
        this.c = activity;
        this.d = akbzVar;
        this.a = alofVar;
        this.b = ffzVar;
    }

    private final void k() {
        if (this.g) {
            return;
        }
        this.g = true;
        akbz akbzVar = this.d;
        gcm gcmVar = (gcm) akbzVar.m();
        gcmVar.k(this.c.getString(R.string.in_app_update_downloaded_message));
        gcmVar.m(this.c.getString(R.string.in_app_update_restart_button), new View.OnClickListener() { // from class: ffw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultInAppUpdateController defaultInAppUpdateController = DefaultInAppUpdateController.this;
                defaultInAppUpdateController.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_USER_COMPLETE_UPDATE);
                defaultInAppUpdateController.a.d();
            }
        });
        akbzVar.o(gcmVar.b());
    }

    @Override // defpackage.fgb
    public final void g(int i, int i2) {
        if (i == 2400) {
            if (i2 == -1) {
                this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_OK);
            } else if (i2 == 0) {
                this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_CANCELED);
            } else {
                if (i2 != 1) {
                    return;
                }
                this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_FAILED);
            }
        }
    }

    public final void h(alod alodVar) {
        if (alodVar.a == 2 && alodVar.a(alok.a(this.e)) != null) {
            this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_GET_INFO_UPDATE_AVAILABLE);
            try {
                this.a.e(alodVar, this.e, this.c);
                this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_SHOW_DIALOG_OK);
                return;
            } catch (IntentSender.SendIntentException unused) {
                this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_SHOW_DIALOG_FAILED);
                return;
            }
        }
        if (alodVar.b == 11) {
            this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADED);
            k();
        } else if (alodVar.a == 1) {
            this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_GET_INFO_UPDATE_NOT_AVAILABLE);
        }
    }

    @Override // defpackage.alpd
    public final /* synthetic */ void i(Object obj) {
        InstallState installState = (InstallState) obj;
        if (installState.b() == 2) {
            this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADING);
            if (this.f) {
                return;
            }
            this.f = true;
            akbz akbzVar = this.d;
            gcm gcmVar = (gcm) akbzVar.m();
            gcmVar.k(this.c.getString(R.string.in_app_update_downloading_message));
            gcmVar.d(0);
            akbzVar.o(gcmVar.b());
            return;
        }
        if (installState.b() == 11) {
            this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADED);
            k();
        } else if (installState.b() == 6) {
            this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_CANCELED);
        } else if (installState.b() == 5) {
            this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_FAILED);
        }
    }

    @Override // defpackage.fgb
    public final void j(argm argmVar) {
        ammv j;
        int dO = amkq.dO(argmVar.b);
        if (dO == 0) {
            dO = 1;
        }
        if (dO == 2) {
            j = ammv.j(0);
        } else {
            j = dO == 3 ? ammv.j(1) : amlr.a;
        }
        if (j.h()) {
            this.e = ((Integer) j.c()).intValue();
            this.f = false;
            this.g = false;
            ffz ffzVar = this.b;
            ffzVar.a.e(new acpx(argo.IN_APP_UPDATE_EVENT_TYPE_STARTED.q, 7), aqxl.FLOW_TYPE_IN_APP_UPDATE);
            ffzVar.b.clear();
            this.a.b(this);
            alsc a = this.a.a();
            a.e(new alsa() { // from class: ffy
                @Override // defpackage.alsa
                public final void a(Object obj) {
                    DefaultInAppUpdateController.this.h((alod) obj);
                }
            });
            a.d(new alrx() { // from class: ffx
                @Override // defpackage.alrx
                public final void a(Exception exc) {
                    DefaultInAppUpdateController.this.b.a(argo.IN_APP_UPDATE_EVENT_TYPE_GET_INFO_FAILED);
                }
            });
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.a.c(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
