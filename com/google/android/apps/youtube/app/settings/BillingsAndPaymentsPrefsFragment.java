package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.settings.BillingsAndPaymentsPrefsFragment;
import defpackage.akgk;
import defpackage.ayqx;
import defpackage.azqb;
import defpackage.lkp;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BillingsAndPaymentsPrefsFragment extends lkp {
    public akgk c;
    public SettingsDataAccess d;
    ayqx e;

    @Override // defpackage.bsk
    public final void aH() {
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        this.e = this.d.g(new Runnable() { // from class: lkg
            @Override // java.lang.Runnable
            public final void run() {
                aupv o;
                aqyg aqygVar;
                BillingsAndPaymentsPrefsFragment billingsAndPaymentsPrefsFragment = BillingsAndPaymentsPrefsFragment.this;
                if (billingsAndPaymentsPrefsFragment.ar() && (o = billingsAndPaymentsPrefsFragment.d.o(10048)) != null) {
                    ci C = billingsAndPaymentsPrefsFragment.C();
                    if ((o.b & 1) != 0) {
                        aqygVar = o.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    C.setTitle(ajcq.b(aqygVar));
                    billingsAndPaymentsPrefsFragment.c.d(billingsAndPaymentsPrefsFragment, o.d);
                }
            }
        });
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mD() {
        super.mD();
        azqb.f((AtomicReference) this.e);
    }

    @Override // defpackage.bsk
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae(null);
        return n;
    }
}
