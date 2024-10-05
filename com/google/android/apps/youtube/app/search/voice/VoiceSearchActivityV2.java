package com.google.android.apps.youtube.app.search.voice;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.aaq;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.acsy;
import defpackage.afsy;
import defpackage.aih;
import defpackage.ajyw;
import defpackage.akai;
import defpackage.akap;
import defpackage.akaq;
import defpackage.akar;
import defpackage.akbc;
import defpackage.akcy;
import defpackage.aone;
import defpackage.aong;
import defpackage.apxf;
import defpackage.asmn;
import defpackage.atmb;
import defpackage.atmc;
import defpackage.axzg;
import defpackage.ayrz;
import defpackage.ce;
import defpackage.dd;
import defpackage.dn;
import defpackage.evr;
import defpackage.gng;
import defpackage.gni;
import defpackage.lgx;
import defpackage.lho;
import defpackage.lhw;
import defpackage.lie;
import defpackage.lif;
import defpackage.lio;
import defpackage.liu;
import defpackage.ljf;
import defpackage.ljm;
import defpackage.ljn;
import defpackage.ljt;
import defpackage.mcy;
import defpackage.ogx;
import defpackage.ohx;
import defpackage.ynm;
import defpackage.ypa;
import defpackage.zfi;
import defpackage.zhq;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VoiceSearchActivityV2 extends lhw implements akaq, liu, ljm, lie {
    private static final PermissionDescriptor[] u = {new PermissionDescriptor(2, acsb.c(65799), acsb.c(65800))};
    private lho A;
    private ljt B;
    private boolean C;
    private boolean D;
    private ViewGroup E;
    private int F;
    private String G;
    private String H;
    private byte[] I;

    /* renamed from: J, reason: collision with root package name */
    private lio f161J;
    public Handler b;
    public dd c;
    public akar d;
    public acsy e;
    public aaea f;
    public acra g;
    public gni h;
    public ypa i;
    public afsy j;
    ljn k;
    public View l;
    public lif m;
    public aadw n;
    public akap o;
    public ohx p;
    public axzg q;
    public ogx r;
    public ogx s;
    public ajyw t;
    private boolean v;
    private boolean w;
    private gng x;
    private String y;
    private ConnectivitySlimStatusBarController z;

    private final void k() {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    private final void l(ce ceVar, String str) {
        ce f = this.c.f(this.y);
        ceVar.getClass();
        zhq.m(str);
        dn k = this.c.k();
        if (f != null && f.ar() && !f.equals(ceVar)) {
            k.l(f);
        }
        this.l.setVisibility(0);
        if (!ceVar.ar()) {
            k.q(R.id.fragment_container, ceVar, str);
        } else if (ceVar.G) {
            k.n(ceVar);
        }
        k.i = 4099;
        k.a();
        this.y = str;
    }

    @Override // defpackage.lie
    public final void a() {
        this.b.post(new ljf(this, 0));
    }

    @Override // defpackage.akaq
    public final void aJ() {
        k();
    }

    @Override // defpackage.akaq
    public final void aK() {
        this.v = false;
        this.l.setVisibility(8);
        this.b.post(new ljf(this, 2));
    }

    @Override // defpackage.liu
    public final void b() {
        this.k.n();
    }

    @Override // defpackage.liu
    public final void c(String str, String str2) {
        lio lioVar = this.f161J;
        lioVar.d.setText(str);
        lioVar.d.requestLayout();
        this.k.k();
        j(str2);
    }

    @Override // defpackage.ljm
    public final void f() {
        Intent intent = getIntent();
        intent.putExtra("AssistantCsn", this.g.k());
        setResult(1, intent);
        k();
    }

    @Override // defpackage.ljm
    public final void g(byte[] bArr) {
        if (evr.I(this.f) && this.e.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.e.u("voz_rqf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        Intent intent = getIntent();
        intent.putExtra("RecognizedText", bArr);
        intent.putExtra("AssistantCsn", this.g.k());
        intent.putExtra("SearchboxStats", this.I);
        setResult(-1, intent);
        this.k.j();
        k();
    }

    @Override // defpackage.ljm
    public final void h() {
        setVisible(false);
        this.D = true;
        Intent intent = getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        setResult(-1, intent);
        k();
    }

    public final void i() {
        this.g.n(new acqx(acsb.c(62943)));
        if (evr.I(this.f) && this.e.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.e.u("voz_vp", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        if (evr.ay(this.n)) {
            final int i = 0;
            final int i2 = 1;
            ynm.n(this, this.k.b(), new zfi(this) { // from class: lje
                public final /* synthetic */ VoiceSearchActivityV2 a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final void a(Object obj) {
                    if (i == 0) {
                        this.a.j("");
                    } else {
                        this.a.j((String) obj);
                    }
                }
            }, new zfi(this) { // from class: lje
                public final /* synthetic */ VoiceSearchActivityV2 a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final void a(Object obj) {
                    if (i2 == 0) {
                        this.a.j("");
                    } else {
                        this.a.j((String) obj);
                    }
                }
            });
            return;
        }
        j("");
    }

    public final void j(String str) {
        this.k.g(str, this.I, this.H);
        ljn ljnVar = this.k;
        if (!ljnVar.o) {
            ljnVar.d();
        } else if (this.w) {
            this.w = false;
            ljnVar.n();
        }
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B.s();
        this.k.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x = this.h.a();
        gng gngVar = gng.LIGHT;
        int ordinal = this.x.ordinal();
        if (ordinal == 0) {
            setTheme(R.style.Theme_YouTube_Home);
        } else if (ordinal == 1) {
            setTheme(R.style.Theme_YouTube_Dark_Home);
        }
        setContentView(R.layout.voice_search_activity);
        View findViewById = findViewById(R.id.voice_search);
        dd supportFragmentManager = getSupportFragmentManager();
        this.c = supportFragmentManager;
        if (bundle != null) {
            akar akarVar = (akar) supportFragmentManager.g(bundle, "permission_request_fragment");
            this.d = akarVar;
            if (akarVar != null && (!TextUtils.equals(this.y, "PERMISSION_REQUEST_FRAGMENT") || !akai.f(this, u))) {
                dn k = this.c.k();
                k.l(this.d);
                k.a();
            }
        }
        this.l = findViewById(R.id.fragment_container);
        this.E = (ViewGroup) findViewById(R.id.bottom_container);
        lho F = mcy.F(this);
        this.A = F;
        ConnectivitySlimStatusBarController c = this.s.c(this, F);
        this.z = c;
        c.g(this.E);
        this.F = getIntent().getIntExtra("ParentVeType", 0);
        this.G = getIntent().getStringExtra("ParentCSN");
        this.H = getIntent().getStringExtra("searchEndpointParams");
        this.I = getIntent().getByteArrayExtra("SearchboxStats");
        aong aongVar = (aong) apxf.a.createBuilder();
        aone createBuilder = atmc.a.createBuilder();
        int i = this.F;
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 2;
        atmcVar.d = i;
        String str = this.G;
        if (str != null) {
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            atmcVar2.b |= 1;
            atmcVar2.c = str;
        }
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        this.g.d(acsb.b(22678), (apxf) aongVar.build(), null);
        ajyw ajywVar = this.t;
        acra acraVar = this.g;
        Context context = (Context) ajywVar.c.get();
        context.getClass();
        gni gniVar = (gni) ajywVar.a.get();
        gniVar.getClass();
        axzg axzgVar = (axzg) ajywVar.b.get();
        axzgVar.getClass();
        findViewById.getClass();
        acraVar.getClass();
        ljt ljtVar = new ljt(context, gniVar, axzgVar, findViewById, acraVar, null);
        this.B = ljtVar;
        ljtVar.s();
        this.k = this.p.b(this, this.B, this.z, this.b, this.g, this.e);
        getOnBackPressedDispatcher().a(this.k.a());
        ogx ogxVar = this.r;
        LinearLayout linearLayout = (LinearLayout) findViewById.findViewById(R.id.voice_language_button);
        acra acraVar2 = this.g;
        dd ddVar = this.c;
        ljn ljnVar = this.k;
        aadw aadwVar = (aadw) ogxVar.c.get();
        aadwVar.getClass();
        ajyw ajywVar2 = (ajyw) ogxVar.d.get();
        ajywVar2.getClass();
        akbc akbcVar = (akbc) ogxVar.b.get();
        akbcVar.getClass();
        akcy akcyVar = (akcy) ogxVar.a.get();
        akcyVar.getClass();
        linearLayout.getClass();
        acraVar2.getClass();
        ddVar.getClass();
        ljnVar.getClass();
        this.f161J = new lio(aadwVar, ajywVar2, akbcVar, akcyVar, this, linearLayout, acraVar2, ddVar, ljnVar, null, null, null, null, null);
        this.w = true;
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        this.k.o();
        this.g.t();
        ConnectivitySlimStatusBarController connectivitySlimStatusBarController = this.z;
        if (connectivitySlimStatusBarController != null) {
            connectivitySlimStatusBarController.i();
        }
        this.b.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.D) {
            overridePendingTransition(0, 0);
            this.D = false;
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.x != this.h.a()) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new ljf(this, 1));
        }
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.i.g(this.k);
        this.z.m(true);
        if (aih.c(this, "android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                PermissionDescriptor[] permissionDescriptorArr = u;
                if (akai.f(this, permissionDescriptorArr)) {
                    if (this.v) {
                        return;
                    }
                    if (this.d == null) {
                        akap akapVar = this.o;
                        akapVar.e(permissionDescriptorArr);
                        akapVar.a = acsb.b(69076);
                        akapVar.b = acsb.c(69077);
                        akapVar.c = acsb.c(69078);
                        akapVar.d = acsb.c(69079);
                        akapVar.b(R.string.vs_permission_allow_access_description);
                        akapVar.c(R.string.vs_permission_open_settings_description);
                        akapVar.e = R.string.permission_fragment_title;
                        this.d = akapVar.a();
                    }
                    this.d.aG(this);
                    this.d.aH(new aaq(this, R.style.Theme_YouTube_Dark_Home));
                    l(this.d, "PERMISSION_REQUEST_FRAGMENT");
                    this.v = true;
                    return;
                }
            }
            k();
            return;
        }
        if (this.k.p()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayrz.c((AtomicReference) this.q.e().as(false).V(new lgx(atomicBoolean, 3)));
            if (!atomicBoolean.get() || !this.j.t()) {
                i();
                return;
            }
            lif o = lif.o();
            this.m = o;
            o.c = this;
            l(o, "VAA_CONSENT_FRAGMENT");
            return;
        }
        h();
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.i.m(this.k);
        if (this.C) {
            return;
        }
        k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.C = z;
    }
}
