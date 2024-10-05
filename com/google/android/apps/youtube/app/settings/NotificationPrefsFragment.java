package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import defpackage.acqz;
import defpackage.acsb;
import defpackage.akgk;
import defpackage.ayqx;
import defpackage.azqb;
import defpackage.lkr;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotificationPrefsFragment extends lkr {
    private ayqx ae;
    public acqz c;
    public akgk d;
    public SettingsDataAccess e;

    private final void aL(CharSequence charSequence) {
        Preference ol = ol(charSequence);
        if (ol != null) {
            o().af(ol);
        }
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.ae = this.e.g(new Runnable() { // from class: lle
            @Override // java.lang.Runnable
            public final void run() {
                aupr auprVar;
                aqyg aqygVar;
                NotificationPrefsFragment notificationPrefsFragment = NotificationPrefsFragment.this;
                if (notificationPrefsFragment.ar()) {
                    Iterator it = notificationPrefsFragment.e.i().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            auprVar = null;
                            break;
                        }
                        Object next = it.next();
                        if (next instanceof aupr) {
                            auprVar = (aupr) next;
                            break;
                        }
                    }
                    if (auprVar != null) {
                        ci C = notificationPrefsFragment.C();
                        if ((auprVar.b & 1) != 0) {
                            aqygVar = auprVar.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        C.setTitle(ajcq.b(aqygVar));
                        notificationPrefsFragment.d.d(notificationPrefsFragment, auprVar.d);
                        notificationPrefsFragment.s(null);
                    }
                }
            }
        });
    }

    @Override // defpackage.ce
    public final void V() {
        azqb.f((AtomicReference) this.ae);
        super.V();
        aL("daily_digest_notification_preference");
        aL("quiet_hours_notification_preference");
    }

    @Override // defpackage.bsk
    public final void aH() {
        this.a.g("youtube");
        this.c.mM().d(acsb.b(57173), null, null);
    }

    @Override // defpackage.bsk
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae(null);
        return n;
    }
}
