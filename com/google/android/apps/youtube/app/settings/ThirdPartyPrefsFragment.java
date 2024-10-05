package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.settings.ThirdPartyPrefsFragment;
import defpackage.akgk;
import defpackage.ayqx;
import defpackage.azqb;
import defpackage.lkx;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ThirdPartyPrefsFragment extends lkx {
    public akgk c;
    public SettingsDataAccess d;
    ayqx e;

    @Override // defpackage.ce
    public final void V() {
        o().ab();
        azqb.f((AtomicReference) this.e);
        super.V();
    }

    @Override // defpackage.bsk
    public final void aH() {
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        this.e = this.d.g(new Runnable() { // from class: lmx
            @Override // java.lang.Runnable
            public final void run() {
                aupv o;
                aqyg aqygVar;
                ThirdPartyPrefsFragment thirdPartyPrefsFragment = ThirdPartyPrefsFragment.this;
                if (thirdPartyPrefsFragment.ar() && (o = thirdPartyPrefsFragment.d.o(10039)) != null) {
                    ci C = thirdPartyPrefsFragment.C();
                    if ((o.b & 1) != 0) {
                        aqygVar = o.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    C.setTitle(ajcq.b(aqygVar));
                    thirdPartyPrefsFragment.c.d(thirdPartyPrefsFragment, o.d);
                }
            }
        });
    }

    @Override // defpackage.bsk
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae(null);
        return n;
    }
}
