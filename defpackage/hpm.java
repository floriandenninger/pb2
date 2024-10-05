package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchResultsController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;
import com.google.android.libraries.youtube.innertube.model.SearchResponseModel;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hpm extends hpj implements hpp {
    public Context a;
    public hrv ae;
    public akei af;
    public hpw ag;
    public TextView ah;
    public boolean ai;
    public MusicSearchResultsController b;
    public SfvAudioItemPlaybackController c;
    public acqz d;
    public MusicSearchSuggestionsController e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [ajos, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [ajos, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v1, types: [ajos, java.lang.Object] */
    @Override // defpackage.ce
    public final void aa(View view, Bundle bundle) {
        int i;
        ajwi ajwiVar;
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            zga.b("No args found for MusicSearchFragment, pass the command in the args.");
            return;
        }
        byte[] byteArray = bundle2.getByteArray("SfvMusicSearchFragmentCommandKey");
        if (byteArray == null) {
            zga.b("No search command found.");
            return;
        }
        apxf c = aahg.c(byteArray);
        this.d.mM().e(acsb.b(100355), acrs.DEFAULT, c, adyu.cg(c, asit.b), adyu.cg(c, asit.a));
        this.d.mM().n(new acqx(acsb.c(22156)));
        this.c.j();
        this.X.b(this.c);
        if (this.ae.f()) {
            ((TextView) view.findViewById(R.id.music_search_title)).setText(R.string.sounds_search_page_title);
        } else {
            ((TextView) view.findViewById(R.id.music_search_title)).setText(R.string.music_search_page_title);
        }
        view.findViewById(R.id.music_search_exit).setOnClickListener(new View.OnClickListener() { // from class: hpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hpm.this.p(true);
            }
        });
        ((LoadingFrameLayout) view.findViewById(R.id.music_search_loading_frame_layout)).h("");
        MusicSearchResultsController musicSearchResultsController = this.b;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.music_search_contents_container);
        musicSearchResultsController.q = (LoadingFrameLayout) frameLayout.findViewById(R.id.music_search_loading_frame_layout);
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.music_search_content_recycler_view);
        musicSearchResultsController.t = recyclerView;
        musicSearchResultsController.u = (RecyclerView) frameLayout.findViewById(R.id.music_search_suggestions_recycler_view);
        amkq.E(recyclerView != null);
        Context context = musicSearchResultsController.r;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(1);
        recyclerView.af(linearLayoutManager);
        ajxi a = musicSearchResultsController.d.a(musicSearchResultsController.j, musicSearchResultsController.f.mM());
        autm autmVar = musicSearchResultsController.h.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        if (autmVar.u) {
            lwk lwkVar = musicSearchResultsController.w;
            ajlx ajlxVar = musicSearchResultsController.n;
            abcs abcsVar = musicSearchResultsController.j;
            acra mM = musicSearchResultsController.f.mM();
            ?? r18 = musicSearchResultsController.g.get();
            ajxa ajxaVar = ajxa.WI;
            ajwk ajwkVar = ajwk.d;
            ajhb ajhbVar = ajhb.SHORTS;
            sxw sxwVar = musicSearchResultsController.o;
            Context context2 = musicSearchResultsController.r;
            i = R.id.music_search_suggestions_recycler_view;
            ajwiVar = lwkVar.a(null, ajlxVar, recyclerView, abcsVar, a, mM, r18, ajxaVar, ajwkVar, ajhbVar, sxwVar, context2);
        } else {
            i = R.id.music_search_suggestions_recycler_view;
            ajwiVar = new ajwi(null, recyclerView, musicSearchResultsController.a, musicSearchResultsController.b, musicSearchResultsController.j, musicSearchResultsController.c, a, musicSearchResultsController.e, musicSearchResultsController.f.mM(), musicSearchResultsController.g.get(), ajxa.WI, ajwk.d, musicSearchResultsController.h, musicSearchResultsController.i);
        }
        musicSearchResultsController.p = ajwiVar;
        this.b.s = c;
        autm autmVar2 = this.ae.a.a().z;
        if (autmVar2 == null) {
            autmVar2 = autm.a;
        }
        boolean z = autmVar2.r;
        this.ai = z;
        if (z) {
            final MusicSearchSuggestionsController musicSearchSuggestionsController = this.e;
            FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.music_search_contents_container);
            musicSearchSuggestionsController.o = (LoadingFrameLayout) frameLayout2.findViewById(R.id.music_search_loading_frame_layout);
            musicSearchSuggestionsController.p = (RecyclerView) frameLayout2.findViewById(i);
            musicSearchSuggestionsController.q = (RecyclerView) frameLayout2.findViewById(R.id.music_search_content_recycler_view);
            amkq.E(musicSearchSuggestionsController.p != null);
            Activity activity = musicSearchSuggestionsController.k;
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
            linearLayoutManager2.ab(1);
            musicSearchSuggestionsController.p.af(linearLayoutManager2);
            musicSearchSuggestionsController.p.aD(musicSearchSuggestionsController.s);
            musicSearchSuggestionsController.l = new ajwi(null, musicSearchSuggestionsController.p, musicSearchSuggestionsController.a, musicSearchSuggestionsController.b, aasm.n, musicSearchSuggestionsController.c, musicSearchSuggestionsController.d.a(aasm.n, musicSearchSuggestionsController.f.mM()), musicSearchSuggestionsController.e, musicSearchSuggestionsController.f.mM(), musicSearchSuggestionsController.g.get(), ajxa.WI, ajwk.d, musicSearchSuggestionsController.h, musicSearchSuggestionsController.i);
            musicSearchSuggestionsController.m = musicSearchSuggestionsController.r.b(musicSearchSuggestionsController.j);
            musicSearchSuggestionsController.n = musicSearchSuggestionsController.m.a().ax(new ayrs() { // from class: hpq
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    MusicSearchSuggestionsController musicSearchSuggestionsController2 = MusicSearchSuggestionsController.this;
                    akps akpsVar = (akps) obj;
                    if (musicSearchSuggestionsController2.l == null || musicSearchSuggestionsController2.o == null) {
                        return;
                    }
                    musicSearchSuggestionsController2.f.mM().n(new acqx(akpsVar.a.d));
                    musicSearchSuggestionsController2.o.a();
                    musicSearchSuggestionsController2.p.setVisibility(0);
                    musicSearchSuggestionsController2.q.setVisibility(8);
                    musicSearchSuggestionsController2.l.M(akpsVar.a());
                }
            });
            MusicSearchSuggestionsController musicSearchSuggestionsController2 = this.e;
            if (c.pY(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand) && (((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) c.pX(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).b & 2) != 0) {
                musicSearchSuggestionsController2.j.c = ((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) c.pX(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).d;
            }
            this.b.v = this.ai;
        }
        hpw hpwVar = new hpw(this.a, (ViewGroup) view.findViewById(R.id.search_input_container));
        this.ag = hpwVar;
        hpwVar.c = new hpl(this);
        this.af.g();
        this.af.d();
        hpw hpwVar2 = this.ag;
        hpwVar2.a.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) hpwVar2.b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(hpwVar2.a, 1);
        }
        this.ah = (TextView) view.findViewById(R.id.search_input_text);
    }

    @Override // defpackage.ce
    public final void lZ() {
        if (C() != null) {
            whu.B(C());
        }
        super.lZ();
        this.ag.c = null;
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(this.a).inflate(R.layout.music_search_fragment, viewGroup, false);
    }

    @Override // defpackage.hpp
    public final void o(String str) {
        hpw hpwVar = this.ag;
        hpwVar.a.setText(str);
        whu.D(hpwVar.a);
        whu.J(hpwVar.a);
    }

    public final void p(boolean z) {
        dd supportFragmentManager = C().getSupportFragmentManager();
        supportFragmentManager.K();
        this.d.mM().I(3, new acqx(acsb.c(22156)), null);
        this.d.mM().t();
        if (z && supportFragmentManager.f("ReelBrowseFragmentTag") != null) {
            supportFragmentManager.K();
        }
        supportFragmentManager.aa();
    }

    public final void q(String str) {
        ammv ammvVar;
        akpi akpiVar;
        this.c.j();
        if (this.ai && (akpiVar = this.e.m) != null) {
            akpiVar.b();
        }
        final MusicSearchResultsController musicSearchResultsController = this.b;
        LoadingFrameLayout loadingFrameLayout = musicSearchResultsController.q;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.c();
        }
        RecyclerView recyclerView = musicSearchResultsController.u;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        abcq d = musicSearchResultsController.j.d();
        d.a = abcq.i(str);
        apxf apxfVar = musicSearchResultsController.s;
        if (apxfVar != null) {
            d.l(apxfVar.c);
        } else {
            d.l(aomf.b);
        }
        if (musicSearchResultsController.v) {
            d.d = musicSearchResultsController.m.a("youtube-sfv");
        }
        apxf apxfVar2 = musicSearchResultsController.s;
        if (apxfVar2 == null || !apxfVar2.pY(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand) || ((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) apxfVar2.pX(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).c.isEmpty()) {
            ammvVar = amlr.a;
        } else {
            ammvVar = ammv.j(((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) apxfVar2.pX(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).c);
        }
        if (ammvVar.h()) {
            d.c = (String) ammvVar.c();
        }
        ynm.k(musicSearchResultsController.j.a.g(d, musicSearchResultsController.k), musicSearchResultsController.l, new ynk() { // from class: hpn
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                LoadingFrameLayout loadingFrameLayout2 = MusicSearchResultsController.this.q;
                if (loadingFrameLayout2 == null) {
                    return;
                }
                loadingFrameLayout2.b(th.getLocalizedMessage(), true);
            }
        }, new ynl() { // from class: hpo
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                MusicSearchResultsController musicSearchResultsController2 = MusicSearchResultsController.this;
                SearchResponseModel searchResponseModel = (SearchResponseModel) obj;
                if (musicSearchResultsController2.p == null || musicSearchResultsController2.q == null) {
                    return;
                }
                RecyclerView recyclerView2 = musicSearchResultsController2.u;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(8);
                }
                RecyclerView recyclerView3 = musicSearchResultsController2.t;
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                musicSearchResultsController2.f.mM().D(new acqx(searchResponseModel.d()));
                musicSearchResultsController2.q.a();
                musicSearchResultsController2.p.M(searchResponseModel.e());
            }
        });
    }
}
