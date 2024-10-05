package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.settings.PrivacyPrefsFragment;
import defpackage.aaea;
import defpackage.akgk;
import defpackage.ayqx;
import defpackage.azqb;
import defpackage.lkt;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PrivacyPrefsFragment extends lkt {
    private ayqx ae;
    public aaea c;
    public akgk d;
    public SettingsDataAccess e;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.ae = this.e.g(new Runnable() { // from class: llw
            @Override // java.lang.Runnable
            public final void run() {
                aupv o;
                aqyg aqygVar;
                PrivacyPrefsFragment privacyPrefsFragment = PrivacyPrefsFragment.this;
                if (privacyPrefsFragment.ar()) {
                    if (!evr.O(privacyPrefsFragment.c) || !fhe.G(privacyPrefsFragment.e.i(), apuj.class)) {
                        o = privacyPrefsFragment.e.o(10029);
                    } else {
                        o = privacyPrefsFragment.e.o(10003);
                    }
                    if (o != null) {
                        ci C = privacyPrefsFragment.C();
                        if ((o.b & 1) != 0) {
                            aqygVar = o.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        C.setTitle(ajcq.b(aqygVar));
                        privacyPrefsFragment.d.d(privacyPrefsFragment, o.d);
                    }
                }
            }
        });
    }

    @Override // defpackage.bsk
    public final void aH() {
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mD() {
        super.mD();
        azqb.f((AtomicReference) this.ae);
    }

    @Override // defpackage.bsk
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae(null);
        return n;
    }
}
