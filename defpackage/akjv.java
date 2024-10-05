package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akjv extends akjy implements akmf {
    public ajjz ae;
    public ajoy af;
    public akht ag;
    public akhs ah;
    public ViewSwitcher ai;
    public ViewGroup aj;
    public Object ak;
    private akli al;
    private ajox am;

    @Override // defpackage.akjy, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        this.al = new akli(activity, this.ae);
        ajpd ajpdVar = new ajpd();
        ajnq ajnqVar = new ajnq();
        ajnqVar.f(uyw.class, new whk(activity, 4, (int[]) null));
        ajox a = this.af.a(ajnqVar);
        this.am = a;
        a.h(ajpdVar);
        akht akhtVar = this.ag;
        akli akliVar = this.al;
        int orElse = wbs.W(activity, R.attr.ytTextPrimary).orElse(0);
        Context context = (Context) akhtVar.a.get();
        context.getClass();
        aahd aahdVar = (aahd) akhtVar.b.get();
        aahdVar.getClass();
        zki zkiVar = (zki) akhtVar.c.get();
        zkiVar.getClass();
        zkd zkdVar = (zkd) akhtVar.d.get();
        zkdVar.getClass();
        akmh akmhVar = (akmh) akhtVar.e.get();
        akmhVar.getClass();
        akliVar.getClass();
        this.ah = new akhs(context, aahdVar, zkiVar, zkdVar, akmhVar, this, ajpdVar, akliVar, orElse);
        this.am.rU(new akju(this.ah));
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        akhs akhsVar = this.ah;
        zkj zkjVar = akhsVar.f;
        if (zkjVar != null) {
            akhsVar.a.a(zkjVar);
            akhsVar.f = null;
        }
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        akhs akhsVar = this.ah;
        akhsVar.e();
        if (akhsVar.c != null && akhsVar.g != null) {
            zkj zkjVar = akhsVar.f;
            if (zkjVar != null) {
                akhsVar.a.a(zkjVar);
            }
            akhsVar.f = new zkj(akhsVar, Arrays.asList(akhsVar.g, akhsVar.c));
            zkd zkdVar = akhsVar.a;
            zkj zkjVar2 = akhsVar.f;
            yjk.f();
            amkq.E(true);
            Iterator it = zkjVar2.b.iterator();
            while (it.hasNext()) {
                yjj.w(zkdVar.a, (Uri) it.next(), zkjVar2.a);
            }
            ((zkk) zkdVar.b.get()).g(zkjVar2.b, akhsVar);
        }
        akhsVar.d();
    }

    @Override // defpackage.akmf
    public final void aF() {
        ViewSwitcher viewSwitcher = this.ai;
        if (viewSwitcher == null || viewSwitcher.getCurrentView() == null || this.ai.getCurrentView().getId() != R.id.progress_spinner) {
            return;
        }
        this.ai.showNext();
    }

    @Override // defpackage.akmf
    public final void aG(ci ciVar) {
        super.qh(ciVar.getSupportFragmentManager(), null);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(1, 0);
        Bundle bundle2 = this.m;
        if (bundle2.containsKey("CONTEXT_MENU")) {
            try {
                this.ah.g((atdc) amkq.cj(bundle2, "CONTEXT_MENU", atdc.a, aomw.b()), this.ak);
            } catch (aoob unused) {
                kv();
                zga.l("Conversation bottom sheet failed to merge MenuRenderer.");
            }
        }
        akhs akhsVar = this.ah;
        String string = bundle2.getString("CONTACT_PATH_KEY");
        Object obj = this.ak;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        akhsVar.g = new Uri.Builder().path(string).build();
        akhsVar.h = obj;
        akhsVar.h();
        akhsVar.d();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.share_bottom_sheet_list_fragment, viewGroup, false);
        viewGroup2.setBackgroundColor(wbs.W(viewGroup2.getContext(), R.attr.ytBrandBackgroundSolid).orElse(0));
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.bottom_sheet_list_view);
        recyclerView.af(new LinearLayoutManager(1));
        recyclerView.ac(this.am);
        recyclerView.setPadding(0, qX().getDimensionPixelSize(R.dimen.bottom_sheet_padding_top), 0, 0);
        this.aj = viewGroup2;
        viewGroup2.addOnLayoutChangeListener(new akjt(this));
        this.aj.addView(this.al.a, 0);
        ViewSwitcher viewSwitcher = (ViewSwitcher) layoutInflater.inflate(R.layout.conversation_bottom_sheet_fragment, viewGroup, false);
        this.ai = viewSwitcher;
        viewSwitcher.addView(this.aj);
        return this.ai;
    }
}
