package com.google.android.apps.youtube.app.search.voice;

import android.content.Intent;
import android.graphics.Point;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.aaq;
import defpackage.aarr;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.acsy;
import defpackage.afsy;
import defpackage.agcm;
import defpackage.aih;
import defpackage.ajyw;
import defpackage.akai;
import defpackage.akap;
import defpackage.akaq;
import defpackage.akar;
import defpackage.akbc;
import defpackage.akcy;
import defpackage.akfn;
import defpackage.akfo;
import defpackage.akfp;
import defpackage.akfq;
import defpackage.akfz;
import defpackage.ammv;
import defpackage.anaf;
import defpackage.aone;
import defpackage.aong;
import defpackage.apxf;
import defpackage.asmn;
import defpackage.atmb;
import defpackage.atmc;
import defpackage.auqe;
import defpackage.axzg;
import defpackage.ayrz;
import defpackage.ce;
import defpackage.dd;
import defpackage.dn;
import defpackage.evr;
import defpackage.gng;
import defpackage.gni;
import defpackage.iw;
import defpackage.jw;
import defpackage.lgx;
import defpackage.lho;
import defpackage.lhz;
import defpackage.lie;
import defpackage.lif;
import defpackage.lil;
import defpackage.liu;
import defpackage.ljv;
import defpackage.ljw;
import defpackage.ljx;
import defpackage.ljz;
import defpackage.lka;
import defpackage.mcy;
import defpackage.ogx;
import defpackage.whu;
import defpackage.ynm;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.yro;
import defpackage.ysy;
import defpackage.zhq;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VoiceSearchHalfPlateV0Activity extends lhz implements akaq, liu, lie, ypd {
    public static final /* synthetic */ int ab = 0;
    private static final PermissionDescriptor[] ac = {new PermissionDescriptor(2, acsb.c(65799), acsb.c(65800))};
    protected akfn A;
    public Runnable B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public LinearLayout f162J;
    public ImageView K;
    public List L = Collections.emptyList();
    public View M;
    public byte[] N;
    public Point O;
    public Point P;
    AudioRecord Q;
    public boolean R;
    public boolean S;
    public auqe T;
    public aadw U;
    public akap V;
    public akbc W;
    public axzg X;
    public agcm Y;
    public ogx Z;
    public ajyw aa;
    private boolean ad;
    private ImageView ae;
    private boolean af;
    private SoundPool ag;
    private int ah;
    private gng ai;
    private String aj;
    private lho ak;
    private boolean al;
    private boolean am;
    private int an;
    private String ao;
    private String ap;
    private int aq;
    private int ar;
    private int as;
    private lil at;
    public Handler b;
    public MicrophoneView c;
    public TextView d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public akfo i;
    public dd j;
    public akar k;
    public boolean l;
    public lif m;
    public acsy n;
    public aaea o;
    public acra p;
    public akfq q;
    public akfz r;
    public aarr s;
    public ysy t;
    public gni u;
    public ypa v;
    public ScheduledExecutorService w;
    public akcy x;
    public afsy y;
    public ConnectivitySlimStatusBarController z;

    private final String p() {
        String c = akbc.c();
        String a = this.W.a();
        if (c.isEmpty() || a.isEmpty()) {
            return "en-US";
        }
        StringBuilder sb = new StringBuilder(c.length() + 1 + String.valueOf(a).length());
        sb.append(c);
        sb.append("-");
        sb.append(a);
        return sb.toString();
    }

    private final void q() {
        setVisible(false);
        this.am = true;
        Intent intent = getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        setResult(-1, intent);
        h();
    }

    private final void r(ce ceVar, String str) {
        ce f = this.j.f(this.aj);
        ceVar.getClass();
        zhq.m(str);
        dn k = this.j.k();
        if (f != null && f.ar() && !f.equals(ceVar)) {
            k.l(f);
        }
        this.M.setVisibility(0);
        if (!ceVar.ar()) {
            k.q(R.id.fragment_container, ceVar, str);
        } else if (ceVar.G) {
            k.n(ceVar);
        }
        k.i = 4099;
        k.a();
        this.aj = str;
    }

    private final boolean s() {
        return getIntent().getBooleanExtra("disableHalfPlateSuggestions", false);
    }

    @Override // defpackage.lie
    public final void a() {
        this.b.post(new ljw(this, 0));
    }

    @Override // defpackage.akaq
    public final void aJ() {
        h();
    }

    @Override // defpackage.akaq
    public final void aK() {
        this.ad = false;
        this.M.setVisibility(8);
        this.b.post(new ljw(this, 3));
    }

    @Override // defpackage.liu
    public final void b() {
        m();
    }

    @Override // defpackage.liu
    public final void c(String str, String str2) {
        this.F.setText(str);
        this.F.requestLayout();
        akfo akfoVar = this.i;
        if (akfoVar != null) {
            akfoVar.a();
            this.i = null;
        }
        o(str2);
    }

    public final void g() {
        if (this.L.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder(getResources().getString(R.string.try_saying_text));
        sb.append(" ''");
        sb.append((String) this.L.get(0));
        sb.append("''");
        this.E.setText(sb);
    }

    public final void h() {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    public final void i(int i) {
        SoundPool soundPool = this.ag;
        if (soundPool != null) {
            soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }

    public final void j() {
        this.h = false;
        this.G = false;
        this.H = false;
        akfo akfoVar = this.i;
        if (akfoVar != null) {
            akfoVar.c();
        }
        l();
    }

    public final void k() {
        this.h = false;
        this.G = false;
        this.H = false;
        akfo akfoVar = this.i;
        if (akfoVar != null) {
            akfoVar.c();
        }
        this.d.setVisibility(8);
        this.C.setVisibility(8);
        this.E.setVisibility(8);
        this.D.setText(getResources().getText(R.string.you_are_offline));
        this.D.setVisibility(0);
        this.c.setVisibility(8);
        this.c.d();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class};
        }
        if (i == 0) {
            boolean a = ((yro) obj).a();
            this.S = a;
            this.z.m(!a);
            if (this.S) {
                this.b.removeCallbacks(this.B);
                this.D.setText(getResources().getText(R.string.you_are_online_half_plate));
                this.c.setEnabled(true);
                this.c.setVisibility(0);
                return null;
            }
            if (this.h) {
                this.b.postDelayed(this.B, 3000L);
                return null;
            }
            k();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void l() {
        this.D.setVisibility(0);
        this.d.setVisibility(8);
        this.C.setVisibility(8);
        this.E.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.d();
        if (!this.S) {
            this.D.setText(getResources().getText(R.string.you_are_offline));
            this.c.setEnabled(false);
        } else if (!this.R) {
            this.D.setText(getResources().getText(R.string.didnt_hear_that_half_plate));
        } else {
            this.D.setText(getResources().getText(R.string.tap_microphone_to_retry));
        }
    }

    public final void m() {
        this.h = true;
        this.I = false;
        this.R = false;
        this.d.setVisibility(8);
        this.d.setText("");
        this.C.setText("");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.D.setText(getResources().getText(R.string.listening));
        this.D.setVisibility(0);
        akfo akfoVar = this.i;
        if (akfoVar == null || !akfoVar.f()) {
            q();
        } else {
            i(this.ah);
            this.c.f();
        }
    }

    public final void n() {
        this.p.n(new acqx(acsb.c(62943)));
        if (evr.I(this.o) && this.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.n.u("voz_vp", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        if (evr.ay(this.U)) {
            ynm.n(this, anaf.V(this.Y.k(), 300L, TimeUnit.MILLISECONDS, this.w), new ljv(this, 1), new ljv(this, 4));
        } else {
            o("");
        }
    }

    public final void o(String str) {
        String str2;
        boolean z;
        if (str.isEmpty()) {
            str2 = p();
            z = false;
        } else {
            str2 = str;
            z = true;
        }
        if (this.A == null) {
            this.A = new lka(this);
        }
        ljz ljzVar = new ljz(this);
        if (this.i == null) {
            akfp a = this.q.a(this.A, ljzVar, this.as, str2, this.N, evr.bl(this.o), this.aq, this.ar, this.ap, p());
            a.C = evr.bm(this.o);
            a.w = evr.q(this.o);
            a.c(evr.r(this.o));
            a.y = evr.z(this.o);
            a.s = evr.ac(this.o);
            a.v = evr.ay(this.U) && z;
            a.b(ammv.j(evr.B(this.o)));
            a.A = evr.x(this.o);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayrz.c((AtomicReference) this.X.d().as(false).V(new lgx(atomicBoolean, 5)));
            a.t = atomicBoolean.get();
            this.i = a.a();
        }
        if (!this.S) {
            k();
        } else if (this.af) {
            this.af = false;
            m();
        }
    }

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        this.p.I(3, new acqx(acsb.c(88272)), null);
        Intent intent = getIntent();
        intent.putExtra("AssistantCsn", this.p.k());
        setResult(1, intent);
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 3;
        int i2 = 0;
        SoundPool soundPool = new SoundPool(5, 3, 0);
        this.ag = soundPool;
        this.ah = soundPool.load(this, R.raw.open, 0);
        this.e = this.ag.load(this, R.raw.success, 0);
        this.f = this.ag.load(this, R.raw.no_input, 0);
        this.g = this.ag.load(this, R.raw.failure, 0);
        this.ai = this.u.a();
        gng gngVar = gng.LIGHT;
        int ordinal = this.ai.ordinal();
        int i3 = 1;
        if (ordinal == 0) {
            setTheme(R.style.Theme_YouTube_HalfPlate_Light);
        } else if (ordinal == 1) {
            setTheme(R.style.Theme_YouTube_HalfPlate_Dark);
        }
        setContentView(true != s() ? R.layout.voice_search_half_plate_v0_activity : R.layout.voice_search_half_plate_v0_disabled_suggestions_activity);
        this.j = getSupportFragmentManager();
        jw.X(getWindow().getDecorView(), new iw() { // from class: lju
            @Override // defpackage.iw
            public final ko a(View view, ko koVar) {
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = VoiceSearchHalfPlateV0Activity.this;
                int L = yjk.L(voiceSearchHalfPlateV0Activity);
                int i4 = koVar.g(7).c;
                int i5 = koVar.g(7).e;
                DisplayMetrics displayMetrics = voiceSearchHalfPlateV0Activity.getResources().getDisplayMetrics();
                int K = yjk.K(displayMetrics, 270);
                voiceSearchHalfPlateV0Activity.findViewById(R.id.half_plate).getLayoutParams().height = K + ((((L - i4) - yjk.K(displayMetrics, 8)) - K) % yjk.K(displayMetrics, 48)) + i5;
                return ko.a;
            }
        });
        if (bundle != null) {
            akar akarVar = (akar) this.j.g(bundle, "permission_request_fragment");
            this.k = akarVar;
            if (akarVar != null && (!TextUtils.equals(this.aj, "PERMISSION_REQUEST_FRAGMENT") || !akai.f(this, ac))) {
                dn k = this.j.k();
                k.l(this.k);
                k.a();
            }
        }
        this.M = findViewById(R.id.fragment_container);
        ImageView imageView = (ImageView) findViewById(R.id.back_button);
        this.ae = imageView;
        imageView.setOnClickListener(new ljx(this, i3));
        MicrophoneView microphoneView = (MicrophoneView) findViewById(R.id.microphone_container);
        this.c = microphoneView;
        ((FloatingActionButton) microphoneView.findViewById(R.id.disabled_microphone)).setImageDrawable(whu.y(this.c.getContext(), R.drawable.yt_outline_mic_white_48, R.attr.ytTextPrimary));
        ((FloatingActionButton) this.c.findViewById(R.id.enabled_microphone)).setImageResource(R.drawable.yt_fill_mic_white_48);
        this.c.setOnClickListener(new ljx(this, i2));
        this.D = (TextView) findViewById(R.id.state_text_view);
        this.d = (TextView) findViewById(R.id.stable_recognized_text);
        this.C = (TextView) findViewById(R.id.unstable_recognized_text);
        this.E = (TextView) findViewById(R.id.listening_voice_tips_text);
        this.F = (TextView) findViewById(R.id.voice_language);
        this.f162J = (LinearLayout) findViewById(R.id.voice_language_button);
        this.K = (ImageView) findViewById(R.id.voice_language_icon);
        int i4 = 2;
        if (!s()) {
            View findViewById = findViewById(R.id.above_half_plate_click_catcher);
            findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: ljy
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = VoiceSearchHalfPlateV0Activity.this;
                    if (motionEvent.getAction() != 1 || voiceSearchHalfPlateV0Activity.P == null) {
                        if (motionEvent.getAction() == 0) {
                            voiceSearchHalfPlateV0Activity.P = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        }
                    } else {
                        voiceSearchHalfPlateV0Activity.O = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        int i5 = voiceSearchHalfPlateV0Activity.P.x;
                        int i6 = voiceSearchHalfPlateV0Activity.P.y;
                        if (yjk.P(voiceSearchHalfPlateV0Activity.getResources().getDisplayMetrics(), (int) Math.hypot(voiceSearchHalfPlateV0Activity.O.x - i5, voiceSearchHalfPlateV0Activity.O.y - i6)) > 20) {
                            return true;
                        }
                    }
                    return false;
                }
            });
            findViewById.setOnClickListener(new ljx(this, i));
        } else {
            findViewById(R.id.above_half_plate_click_catcher).setOnClickListener(new ljx(this, i4));
        }
        lho F = mcy.F(this);
        this.ak = F;
        this.z = this.Z.c(this, F);
        this.z.g((ViewGroup) findViewById(R.id.bottom_container));
        this.S = this.t.o();
        this.B = new ljw(this, i4);
        if (evr.ay(this.U)) {
            lil n = this.aa.n(p());
            this.at = n;
            ynm.n(this, n.a(), new ljv(this, i2), new ljv(this, i4));
        }
        this.as = getIntent().getIntExtra("MicSampleRate", 16000);
        this.aq = getIntent().getIntExtra("MicAudioFormatEncoding", 2);
        this.ar = getIntent().getIntExtra("MicChannelConfig", 16);
        g();
        this.an = getIntent().getIntExtra("ParentVeType", 0);
        this.ao = getIntent().getStringExtra("ParentCSN");
        this.ap = getIntent().getStringExtra("searchEndpointParams");
        this.N = getIntent().getByteArrayExtra("SearchboxStats");
        aong aongVar = (aong) apxf.a.createBuilder();
        aone createBuilder = atmc.a.createBuilder();
        int i5 = this.an;
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b = 2 | atmcVar.b;
        atmcVar.d = i5;
        String str = this.ao;
        if (str != null) {
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            atmcVar2.b |= 1;
            atmcVar2.c = str;
        }
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        this.p.d(acsb.b(22678), (apxf) aongVar.build(), null);
        this.p.n(new acqx(acsb.c(22156)));
        this.p.n(new acqx(acsb.c(88272)));
        this.p.n(new acqx(acsb.c(116555)));
        this.af = true;
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        this.h = false;
        SoundPool soundPool = this.ag;
        if (soundPool != null) {
            soundPool.release();
            this.ag = null;
        }
        akfo akfoVar = this.i;
        if (akfoVar != null) {
            akfoVar.a();
            this.i = null;
        }
        this.A = null;
        this.c.setOnClickListener(null);
        this.ae.setOnClickListener(null);
        this.p.t();
        ConnectivitySlimStatusBarController connectivitySlimStatusBarController = this.z;
        if (connectivitySlimStatusBarController != null) {
            connectivitySlimStatusBarController.i();
        }
        super.onDestroy();
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.am) {
            overridePendingTransition(0, 0);
            this.am = false;
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.ai != this.u.a()) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new ljw(this, 1));
        }
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.v.g(this);
        this.z.m(true);
        if (aih.c(this, "android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                PermissionDescriptor[] permissionDescriptorArr = ac;
                if (akai.f(this, permissionDescriptorArr)) {
                    if (this.ad) {
                        return;
                    }
                    if (this.k == null) {
                        akap akapVar = this.V;
                        akapVar.e(permissionDescriptorArr);
                        akapVar.a = acsb.b(69076);
                        akapVar.b = acsb.c(69077);
                        akapVar.c = acsb.c(69078);
                        akapVar.d = acsb.c(69079);
                        akapVar.b(R.string.vs_permission_allow_access_description);
                        akapVar.c(R.string.vs_permission_open_settings_description);
                        akapVar.e = R.string.permission_fragment_title;
                        this.k = akapVar.a();
                    }
                    this.k.aG(this);
                    this.k.aH(new aaq(this, R.style.Theme_YouTube_Dark_Home));
                    r(this.k, "PERMISSION_REQUEST_FRAGMENT");
                    this.ad = true;
                    return;
                }
            }
            h();
            return;
        }
        AudioRecord a = this.r.a();
        this.Q = a;
        if (a != null) {
            this.aq = a.getAudioFormat();
            this.ar = this.Q.getChannelConfiguration();
            this.as = this.Q.getSampleRate();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayrz.c((AtomicReference) this.X.e().as(false).V(new lgx(atomicBoolean, 5)));
            if (!atomicBoolean.get() || !this.y.t()) {
                n();
                return;
            }
            lif o = lif.o();
            this.m = o;
            o.c = this;
            r(o, "VAA_CONSENT_FRAGMENT");
            return;
        }
        q();
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.v.m(this);
        if (this.al) {
            return;
        }
        h();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.al = z;
    }
}
