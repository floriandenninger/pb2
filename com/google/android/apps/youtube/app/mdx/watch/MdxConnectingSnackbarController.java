package com.google.android.apps.youtube.app.mdx.watch;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.app.mdx.watch.MdxConnectingSnackbarController;
import com.google.android.youtube.R;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acrb;
import defpackage.adlm;
import defpackage.adlr;
import defpackage.adlt;
import defpackage.akbz;
import defpackage.akcb;
import defpackage.any;
import defpackage.aok;
import defpackage.gcm;
import defpackage.gcq;
import defpackage.obr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxConnectingSnackbarController implements adlr, any {
    public final acqz a;
    Optional b;
    private final Context c;
    private final akbz d;
    private final obr e;
    private final adlt f;

    public MdxConnectingSnackbarController(Context context, akbz akbzVar, obr obrVar, adlt adltVar, acqz acqzVar) {
        this.c = context;
        akbzVar.getClass();
        this.d = akbzVar;
        this.e = obrVar;
        this.f = adltVar;
        this.a = acqzVar;
        this.b = Optional.empty();
    }

    private final void g() {
        if (this.b.isPresent()) {
            this.d.n((akcb) this.b.get());
            this.b = Optional.empty();
        }
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        g();
        if (this.e.e()) {
            return;
        }
        akbz akbzVar = this.d;
        gcm d = gcq.d();
        d.d(-1);
        d.k(this.c.getString(R.string.mdx_next_gen_fiji_connected_to_confirm_text, adlmVar.k().c()));
        akbzVar.o(d.b());
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        g();
    }

    @Override // defpackage.adlr
    public final void l(final adlm adlmVar) {
        if (this.e.e() || adlmVar.k() == null || adlmVar.k().c().isEmpty()) {
            return;
        }
        final acqx acqxVar = new acqx(acrb.CAST_SNACKBAR_DISMISS_BUTTON);
        this.a.mM().D(acqxVar);
        gcm d = gcq.d();
        d.f(true);
        d.d(-2);
        d.k(this.c.getString(R.string.mdx_next_gen_fiji_connecting_toast_text, adlmVar.k().c()));
        d.m(this.c.getString(R.string.mdx_next_gen_fiji_connecting_toast_cancel_button_text), new View.OnClickListener() { // from class: jer
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MdxConnectingSnackbarController mdxConnectingSnackbarController = MdxConnectingSnackbarController.this;
                acsa acsaVar = acqxVar;
                adlm adlmVar2 = adlmVar;
                mdxConnectingSnackbarController.a.mM().I(3, acsaVar, null);
                adlmVar2.D();
            }
        });
        d.b = null;
        Optional of = Optional.of(d.b());
        this.b = of;
        this.d.o((akcb) of.get());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.f.i(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.f.k(this);
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
