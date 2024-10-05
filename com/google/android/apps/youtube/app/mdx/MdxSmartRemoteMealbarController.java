package com.google.android.apps.youtube.app.mdx;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.youtube.app.mdx.MdxSmartRemoteMealbarController;
import com.google.android.youtube.R;
import defpackage.addy;
import defpackage.adgb;
import defpackage.adlt;
import defpackage.adqg;
import defpackage.afsy;
import defpackage.afte;
import defpackage.akbw;
import defpackage.akbx;
import defpackage.any;
import defpackage.aok;
import defpackage.ipu;
import defpackage.jeu;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zim;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxSmartRemoteMealbarController implements any, ypd {
    public final Activity a;
    public final akbw b;
    public final addy c;
    public final SharedPreferences d;
    public final adlt e;
    public final afsy f;
    public final afte g;
    public final zim h;
    private final ypa i;

    public MdxSmartRemoteMealbarController(Activity activity, akbw akbwVar, addy addyVar, ypa ypaVar, SharedPreferences sharedPreferences, adlt adltVar, afsy afsyVar, afte afteVar, zim zimVar) {
        this.a = activity;
        this.b = akbwVar;
        this.c = addyVar;
        this.i = ypaVar;
        this.d = sharedPreferences;
        this.e = adltVar;
        this.f = afsyVar;
        this.g = afteVar;
        this.h = zimVar;
        Optional.empty();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        final int i2 = 1;
        final int i3 = 0;
        if (i == -1) {
            return new Class[]{adqg.class};
        }
        if (i == 0) {
            adqg adqgVar = (adqg) obj;
            final adgb b = adqgVar.b();
            if (b == null || this.e.g() != null || adqgVar.a() == this.d.getLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", 0L)) {
                return null;
            }
            jeu jeuVar = new jeu(1);
            Resources resources = this.a.getResources();
            if (this.f.c().g()) {
                akbw akbwVar = this.b;
                akbx m = akbwVar.m();
                m.c = resources.getText(R.string.mdx_smart_remote_mealbar_incognito_title);
                m.m = jeuVar;
                akbx e = m.a(resources.getText(R.string.mdx_smart_remote_mealbar_incognito_connect_button_text), new View.OnClickListener(this) { // from class: jcd
                    public final /* synthetic */ MdxSmartRemoteMealbarController a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (i2 != 0) {
                            final MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController = this.a;
                            final adgb adgbVar = b;
                            mdxSmartRemoteMealbarController.g.e(new afsp() { // from class: jce
                                @Override // defpackage.afsp
                                public final void a() {
                                    MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController2 = MdxSmartRemoteMealbarController.this;
                                    mdxSmartRemoteMealbarController2.c.J(adgbVar, new jcf(mdxSmartRemoteMealbarController2));
                                }
                            });
                        } else {
                            MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController2 = this.a;
                            mdxSmartRemoteMealbarController2.c.J(b, new jcf(mdxSmartRemoteMealbarController2));
                        }
                    }
                }).c(resources.getText(R.string.mdx_smart_remote_mealbar_cancel_button_text), ipu.b).e(R.drawable.quantum_ic_incognito_circle_grey600_36);
                e.i(false);
                akbwVar.o(e.f());
            } else {
                akbw akbwVar2 = this.b;
                akbx m2 = akbwVar2.m();
                m2.c = resources.getText(R.string.mdx_smart_remote_mealbar_title);
                m2.d = resources.getText(R.string.mdx_smart_remote_mealbar_detail_text);
                m2.m = jeuVar;
                akbx e2 = m2.a(resources.getText(R.string.mdx_smart_remote_mealbar_connect_button_text), new View.OnClickListener(this) { // from class: jcd
                    public final /* synthetic */ MdxSmartRemoteMealbarController a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (i3 != 0) {
                            final MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController = this.a;
                            final adgb adgbVar = b;
                            mdxSmartRemoteMealbarController.g.e(new afsp() { // from class: jce
                                @Override // defpackage.afsp
                                public final void a() {
                                    MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController2 = MdxSmartRemoteMealbarController.this;
                                    mdxSmartRemoteMealbarController2.c.J(adgbVar, new jcf(mdxSmartRemoteMealbarController2));
                                }
                            });
                        } else {
                            MdxSmartRemoteMealbarController mdxSmartRemoteMealbarController2 = this.a;
                            mdxSmartRemoteMealbarController2.c.J(b, new jcf(mdxSmartRemoteMealbarController2));
                        }
                    }
                }).c(resources.getText(R.string.mdx_smart_remote_mealbar_cancel_button_text), ipu.c).e(R.drawable.mdx_smart_remote_mic_grey3);
                e2.i(false);
                akbwVar2.o(e2.f());
            }
            this.d.edit().putLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", adqgVar.a()).apply();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.i.m(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.i.g(this);
    }
}
