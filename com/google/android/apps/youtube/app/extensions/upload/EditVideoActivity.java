package com.google.android.apps.youtube.app.extensions.upload;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import defpackage.aahd;
import defpackage.aamd;
import defpackage.aarr;
import defpackage.abde;
import defpackage.acqq;
import defpackage.acqx;
import defpackage.acsb;
import defpackage.afos;
import defpackage.afot;
import defpackage.afpb;
import defpackage.afsy;
import defpackage.afto;
import defpackage.aii;
import defpackage.ajcq;
import defpackage.ajjz;
import defpackage.ajyg;
import defpackage.akai;
import defpackage.akcy;
import defpackage.akvq;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.amru;
import defpackage.aone;
import defpackage.aqqm;
import defpackage.aqyg;
import defpackage.arux;
import defpackage.aruy;
import defpackage.arvr;
import defpackage.arvs;
import defpackage.astx;
import defpackage.aszh;
import defpackage.aszi;
import defpackage.aulq;
import defpackage.auov;
import defpackage.avec;
import defpackage.aved;
import defpackage.dd;
import defpackage.dn;
import defpackage.fzc;
import defpackage.gbh;
import defpackage.gcl;
import defpackage.gcq;
import defpackage.gng;
import defpackage.ipr;
import defpackage.ipv;
import defpackage.ipw;
import defpackage.iqa;
import defpackage.iqb;
import defpackage.iqd;
import defpackage.iqg;
import defpackage.lu;
import defpackage.whu;
import defpackage.yjk;
import defpackage.ypd;
import defpackage.zga;
import defpackage.zhq;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EditVideoActivity extends iqg implements ypd {
    private ViewAnimatorHelper S;
    private LoadingFrameLayout T;
    private afpb U;
    private byte[] V;
    public gbh g;
    public aahd h;
    public afsy i;
    public aarr j;
    public afot k;
    public gcl l;
    public ajyg m;
    public akvq n;
    public ipw o;
    public ipr p;
    public akcy q;
    public String r;
    public aruy s;
    public boolean t;
    public gcq u;
    public iqd v;
    public abde w;

    private final void C() {
        gcq gcqVar = this.u;
        if (gcqVar != null) {
            this.l.f(gcqVar);
            this.g.c(true);
        }
    }

    private final void D() {
        dn k = getSupportFragmentManager().k();
        k.m(this.U);
        k.a();
        getSupportFragmentManager().aa();
        E();
    }

    private final void E() {
        setSupportActionBar(this.p.d);
        this.v = new iqd(this);
        mH().c(amru.r(this.v));
        lu supportActionBar = getSupportActionBar();
        supportActionBar.o(R.string.edit_video_form_title);
        supportActionBar.j(true);
        supportActionBar.m(aii.a(this, R.drawable.yt_outline_arrow_left_black_24));
        supportActionBar.A();
        this.M.d(this.p.d, findViewById(R.id.recycler_view), findViewById(R.id.element_fragment));
        this.v.b(this.N);
    }

    @Override // defpackage.ips
    public final void g(aqqm aqqmVar) {
        aqyg aqygVar;
        ipw ipwVar = this.o;
        dd supportFragmentManager = getSupportFragmentManager();
        lu supportActionBar = getSupportActionBar();
        fzc mH = mH();
        ajyg ajygVar = this.m;
        aahd aahdVar = this.h;
        ipwVar.c = supportFragmentManager;
        ipwVar.d = ajygVar;
        aulq aulqVar = aqqmVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ipwVar.b = (aszh) aulqVar.pX(aszi.a);
        aszh aszhVar = ipwVar.b;
        if ((aszhVar.b & 256) != 0) {
            aqygVar = aszhVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        supportActionBar.p(ajcq.b(aqygVar));
        mH.c(amru.r(new ipv(ipwVar)));
        ajjz ajjzVar = ipwVar.a;
        afpb afpbVar = new afpb();
        afpbVar.b = aqqmVar;
        afpbVar.c = ajjzVar;
        afpbVar.e = aahdVar;
        afpbVar.d = supportActionBar;
        dn k = supportFragmentManager.k();
        k.u(R.id.edit_thumbnails_fragment, afpbVar, "edit_thumbnails_fragment");
        k.x();
        k.a();
        supportFragmentManager.aa();
        this.U = afpbVar;
    }

    @Override // defpackage.euc
    protected final void h(gng gngVar) {
        if (gngVar == gng.DARK) {
            setTheme(R.style.Theme_YouTube_EditVideoActivity_Dark);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            finish();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.iqw
    public final int l() {
        return R.id.recycler_view;
    }

    @Override // defpackage.iqw
    public final View m() {
        return this.p.d;
    }

    @Override // defpackage.iqw
    public final ViewAnimatorHelper n() {
        return this.S;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.euc, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.edit_activity);
        this.p.a(this);
        E();
        if (bundle != null && bundle.getByteArray("get_metadata_editor_response_key") != null) {
            aruy aruyVar = (aruy) this.j.a(bundle.getByteArray("get_metadata_editor_response_key"), aruy.a);
            this.s = aruyVar;
            if (aruyVar == null) {
                throw new RuntimeException("Failed to parse a known parcelable proto");
            }
        }
        this.q.g(findViewById(android.R.id.content));
        this.S = (ViewAnimatorHelper) findViewById(R.id.view_animator);
        this.T = (LoadingFrameLayout) findViewById(R.id.edit_activity_layout);
        this.g.d((BottomUiContainer) findViewById(R.id.bottom_ui_container));
        mM().d(acsb.b(49953), null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iqw, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.t = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iqw, defpackage.ci, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.A.m(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.euc, defpackage.ci, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.i.t()) {
            finish();
        } else {
            this.A.g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zv, defpackage.er, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        aruy aruyVar = this.s;
        if (aruyVar != null) {
            bundle.putByteArray("get_metadata_editor_response_key", aruyVar.toByteArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.euc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (!this.i.t()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (!"android.intent.action.EDIT".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            zga.b(valueOf.length() != 0 ? "Unsupported action: ".concat(valueOf) : new String("Unsupported action: "));
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("video_id");
        this.r = stringExtra;
        if (stringExtra == null) {
            zga.b("VideoId not provided.");
            finish();
            return;
        }
        this.V = intent.getByteArrayExtra("click_tracking_params");
        if (this.s == null) {
            zhq.m(this.r);
            this.T.a();
            this.T.c();
            if (!A() || !akai.g(this)) {
                r(null);
                return;
            } else {
                this.k.b(new afos() { // from class: ipy
                    @Override // defpackage.afos
                    public final void a(astx astxVar) {
                        EditVideoActivity.this.r(astxVar);
                    }
                });
                return;
            }
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        super.onStop();
        C();
    }

    @Override // defpackage.iqw
    public final ammv p() {
        return amlr.a;
    }

    public final void q() {
        if (this.t) {
            return;
        }
        whu.K(this, R.string.edit_video_done, 0);
        Intent intent = new Intent();
        intent.putExtra("refresh_my_videos", true);
        setResult(-1, intent);
        finish();
    }

    public final void r(astx astxVar) {
        aone createBuilder = arux.a.createBuilder();
        String str = this.r;
        createBuilder.copyOnWrite();
        arux aruxVar = (arux) createBuilder.instance;
        str.getClass();
        aruxVar.b |= 2;
        aruxVar.d = str;
        if (astxVar != null) {
            createBuilder.copyOnWrite();
            arux aruxVar2 = (arux) createBuilder.instance;
            aruxVar2.e = astxVar;
            aruxVar2.b |= 4;
        }
        this.w.a(createBuilder, new iqa(this), this.V);
    }

    @Override // defpackage.iqw
    public final void s() {
        iqd iqdVar = this.v;
        if (iqdVar != null) {
            boolean z = false;
            if (this.N && !this.O) {
                z = true;
            }
            iqdVar.b(z);
        }
    }

    public final void t() {
        yjk.f();
        aruy aruyVar = this.s;
        aruyVar.getClass();
        if ((aruyVar.b & 512) != 0) {
            ((acqq) mM()).D(new acqx(this.s.g));
        }
        aruy aruyVar2 = this.s;
        yjk.f();
        Iterator it = aruyVar2.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            arvs arvsVar = (arvs) it.next();
            avec avecVar = arvsVar.b;
            if (avecVar == null) {
                avecVar = avec.a;
            }
            aved avedVar = avecVar.b;
            if (avedVar == null) {
                avedVar = aved.a;
            }
            if ((avedVar.b & 1) != 0) {
                avec avecVar2 = arvsVar.b;
                if (avecVar2 == null) {
                    avecVar2 = avec.a;
                }
                aved avedVar2 = avecVar2.b;
                if (avedVar2 == null) {
                    avedVar2 = aved.a;
                }
                auov auovVar = avedVar2.c;
                if (auovVar == null) {
                    auovVar = auov.a;
                }
                aamd aamdVar = new aamd(auovVar);
                arvr arvrVar = aruyVar2.e;
                if (arvrVar == null) {
                    arvrVar = arvr.a;
                }
                y(aamdVar, arvrVar);
                this.S.b(R.id.recycler_view);
            }
        }
        this.T.a();
    }

    @Override // defpackage.iqw
    public final void u(aone aoneVar) {
        this.v.b(false);
        C();
        this.w.b(aoneVar, new iqb(this, aoneVar), null);
    }

    @Override // defpackage.euc
    public final void j() {
        afpb afpbVar = this.U;
        if (afpbVar == null || !afpbVar.ar()) {
            super.onBackPressed();
        } else {
            D();
        }
    }

    @Override // defpackage.iqw, defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        afpb afpbVar = this.U;
        if (afpbVar == null || !afpbVar.ar()) {
            super.onBackPressed();
        } else {
            D();
        }
    }
}
