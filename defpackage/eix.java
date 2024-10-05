package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eix extends eiu implements gjd, nnh {
    public azrw ae;
    public ajoy af;
    public ajfh ag;
    public azrw ah;
    public gje ai;
    public azrw aj;
    public HatsController ak;
    public Executor al;
    public fgq am;
    public gni an;
    public ajpd ao;
    public ajvp ap;
    public acra aq;
    public boolean ar;
    public aaxn as;
    private ajox at;

    public static final ajvo aL(ajtx ajtxVar, ajvp ajvpVar) {
        ajvn a = ajvo.a();
        a.d = ajvpVar;
        a.a = ajtxVar;
        return a.a();
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        ((ojc) this.aj.get()).d(this);
    }

    @Override // defpackage.ce
    public final void aD() {
        dismiss();
    }

    public final void aH() {
        this.ao.clear();
    }

    @Override // defpackage.gjd
    public final void aJ(gjf gjfVar) {
        dismiss();
    }

    @Override // defpackage.nnh
    public final void aK(fhd fhdVar) {
    }

    @Override // defpackage.nnh
    public final void aM() {
        dismiss();
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.ao = new ajpd();
        ajpa ajpaVar = new ajpa();
        ajpaVar.f(ajds.class, new ajou(this.ae));
        ajpaVar.f(ajvo.class, new ajou(this.ah));
        ajox a = this.af.a(ajpaVar);
        this.at = a;
        a.h(this.ao);
        this.at.rU(new ajnw(this.aq));
        this.ai.m(this);
        ((ojc) this.aj.get()).a(this);
        o(2, this.an.a() == gng.LIGHT ? R.style.Theme_YouTube_ProfileCard_Light : R.style.Theme_YouTube_ProfileCard_Dark);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.profile_card_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        recyclerView.ac(this.at);
        recyclerView.af(new LinearLayoutManager());
        this.ao.add(aL(ajtw.a(), null));
        return inflate;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.ar) {
            abdg p = this.as.p();
            p.k();
            aone createBuilder = asce.a.createBuilder();
            asca ascaVar = asca.a;
            createBuilder.copyOnWrite();
            asce asceVar = (asce) createBuilder.instance;
            ascaVar.getClass();
            asceVar.c = ascaVar;
            asceVar.b = 5;
            p.a = (asce) createBuilder.build();
            ynm.k(this.as.q(p), this.al, egw.e, new eiw(this, 0));
        }
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        return new algj(C(), this.b);
    }
}
