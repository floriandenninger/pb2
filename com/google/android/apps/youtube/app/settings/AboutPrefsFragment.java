package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.settings.AboutPrefsFragment;
import defpackage.akgk;
import defpackage.ayqx;
import defpackage.azqb;
import defpackage.ffs;
import defpackage.lkn;
import defpackage.lnn;
import defpackage.lno;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AboutPrefsFragment extends lkn implements lnn {
    public ffs ae;
    private ayqx af;
    public akgk c;
    public lno d;
    public SettingsDataAccess e;

    @Override // defpackage.bsk
    public final void aH() {
        this.a.g("youtube");
    }

    @Override // defpackage.lnn
    public final void aJ() {
        this.d.a = null;
        this.ae.a(C(), "yt_android_settings");
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mD() {
        super.mD();
        this.d.a = null;
        azqb.f((AtomicReference) this.af);
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mS() {
        super.mS();
        this.d.a = this;
        this.af = this.e.g(new Runnable() { // from class: lke
            @Override // java.lang.Runnable
            public final void run() {
                aupv o;
                AboutPrefsFragment aboutPrefsFragment = AboutPrefsFragment.this;
                if (aboutPrefsFragment.ar() && (o = aboutPrefsFragment.e.o(10009)) != null) {
                    akgk akgkVar = aboutPrefsFragment.c;
                    aboutPrefsFragment.C().getApplicationContext();
                    aony<aupw> aonyVar = o.d;
                    amrp f = amru.f();
                    for (aupw aupwVar : aonyVar) {
                        auqg auqgVar = aupwVar.g;
                        if (auqgVar == null) {
                            auqgVar = auqg.a;
                        }
                        aqyg aqygVar = auqgVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        aony aonyVar2 = aqygVar.c;
                        aong aongVar = (aong) aqyi.a.createBuilder();
                        aongVar.copyOnWrite();
                        aqyi aqyiVar = (aqyi) aongVar.instance;
                        aqyiVar.b |= 1;
                        aqyiVar.c = "Open source licenses";
                        aonyVar2.contains(aongVar.build());
                        f.h(aupwVar);
                    }
                    akgkVar.d(aboutPrefsFragment, f.g());
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
