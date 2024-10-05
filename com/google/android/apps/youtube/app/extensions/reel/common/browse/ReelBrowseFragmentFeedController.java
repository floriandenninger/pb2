package com.google.android.apps.youtube.app.extensions.reel.common.browse;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.youtube.R;
import defpackage.aaea;
import defpackage.aame;
import defpackage.aaue;
import defpackage.aawx;
import defpackage.acqz;
import defpackage.ajhb;
import defpackage.ajlx;
import defpackage.ajoy;
import defpackage.ajpd;
import defpackage.ajvb;
import defpackage.ajvq;
import defpackage.ajwi;
import defpackage.ajwk;
import defpackage.ajxa;
import defpackage.ajxi;
import defpackage.ajxj;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.autm;
import defpackage.avef;
import defpackage.aveh;
import defpackage.aypn;
import defpackage.fzb;
import defpackage.gab;
import defpackage.hcb;
import defpackage.hcc;
import defpackage.ibl;
import defpackage.lwk;
import defpackage.nmp;
import defpackage.nmq;
import defpackage.ogx;
import defpackage.sxw;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zaw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelBrowseFragmentFeedController implements any, ypd {
    public final acqz a;
    public final ypa b;
    public final SfvAudioItemPlaybackController c;
    public final fzb d = new ibl(1);
    public gab e;
    public nmq f;
    public final ogx g;
    private final ajoy h;
    private final aaue i;
    private final zaw j;
    private final aypn k;
    private final ajvb l;
    private final ajvq m;
    private final aaea n;
    private final ajxj o;
    private final ajlx p;
    private final sxw q;
    private final lwk r;

    public ReelBrowseFragmentFeedController(acqz acqzVar, ajoy ajoyVar, ypa ypaVar, aaue aaueVar, zaw zawVar, aaea aaeaVar, aypn aypnVar, ajvb ajvbVar, ajxj ajxjVar, ajvq ajvqVar, ogx ogxVar, SfvAudioItemPlaybackController sfvAudioItemPlaybackController, lwk lwkVar, ajlx ajlxVar, sxw sxwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = acqzVar;
        this.h = ajoyVar;
        this.b = ypaVar;
        this.i = aaueVar;
        this.j = zawVar;
        this.n = aaeaVar;
        this.k = aypnVar;
        this.l = ajvbVar;
        this.o = ajxjVar;
        this.m = ajvqVar;
        this.g = ogxVar;
        this.c = sfvAudioItemPlaybackController;
        this.r = lwkVar;
        this.p = ajlxVar;
        this.q = sxwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [ajos, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [ajos, java.lang.Object] */
    public final void g(Context context, List list, hcb hcbVar) {
        int i;
        int i2;
        RecyclerView recyclerView;
        View view;
        hcc hccVar;
        aame aameVar;
        ajwi ajwiVar;
        List list2 = list;
        hcb hcbVar2 = hcbVar;
        this.f.k();
        ajxi a = this.o.a(this.i, this.a.mM());
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i3 < list.size()) {
            aame aameVar2 = (aame) list2.get(i3);
            int i5 = true == aameVar2.a.f ? i3 : i4;
            aame aameVar3 = (aame) list2.get(i3);
            hcc hccVar2 = hcbVar2 != null ? (hcc) hcbVar2.a.get(aameVar2) : null;
            View inflate = LayoutInflater.from(context).inflate(R.layout.reel_section_list, (ViewGroup) null);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.section_list);
            recyclerView2.af(linearLayoutManager);
            autm autmVar = this.n.a().z;
            if (autmVar == null) {
                autmVar = autm.a;
            }
            if (autmVar.u) {
                recyclerView = recyclerView2;
                view = inflate;
                hccVar = hccVar2;
                i2 = i3;
                aameVar = aameVar3;
                ajwiVar = this.r.a(hccVar2 != null ? hccVar2.a : null, this.p, recyclerView2, this.i, a, this.a.mM(), this.l.get(), ajxa.WI, ajwk.d, ajhb.SHORTS, this.q, context);
            } else {
                i2 = i3;
                recyclerView = recyclerView2;
                view = inflate;
                hccVar = hccVar2;
                aameVar = aameVar3;
                ajwiVar = new ajwi(hccVar != null ? hccVar.a : null, recyclerView, this.h, this.m, this.i, this.b, a, this.j, this.a.mM(), this.l.get(), ajxa.WI, ajwk.d, this.n, this.k);
            }
            ajpd ajpdVar = new ajpd();
            aveh avehVar = aameVar.a;
            if ((avehVar.b & 2048) != 0) {
                avef avefVar = avehVar.i;
                if (avefVar == null) {
                    avefVar = avef.a;
                }
                ajpdVar.add(avefVar);
            }
            ajwiVar.L(ajpdVar);
            if (hccVar != null) {
                recyclerView.n.Y(hccVar.b);
                ajwiVar.c();
            } else {
                ajwiVar.V(aameVar.a());
            }
            arrayList.add(new nmp(avehVar, view, ajwiVar, null));
            i3 = i2 + 1;
            list2 = list;
            hcbVar2 = hcbVar;
            i4 = i5;
        }
        hcb hcbVar3 = hcbVar2;
        if (hcbVar3 != null && (i = hcbVar3.c) != -1) {
            i4 = i;
        }
        this.f.m(this.e, arrayList, i4);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aawx.class};
        }
        if (i == 0) {
            for (nmp nmpVar : this.f.i()) {
                if (amkq.e("SFV_AUDIO_PICKER_SAVED_TAB", nmpVar.a.c)) {
                    nmpVar.c.l();
                }
            }
            if (!amkq.e("SFV_AUDIO_PICKER_SAVED_TAB", ((nmp) this.f.i().get(this.f.a())).a.c)) {
                return null;
            }
            this.c.j();
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
    public final void lh(aok aokVar) {
        nmq nmqVar = this.f;
        if (nmqVar != null) {
            nmqVar.j();
        }
        this.b.m(this);
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
