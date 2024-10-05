package com.google.android.apps.youtube.app.search.voice;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
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
import defpackage.akfb;
import defpackage.akfn;
import defpackage.akfo;
import defpackage.akfp;
import defpackage.akfq;
import defpackage.akfz;
import defpackage.ammv;
import defpackage.ammx;
import defpackage.anaf;
import defpackage.anbt;
import defpackage.aone;
import defpackage.aong;
import defpackage.apxf;
import defpackage.asmn;
import defpackage.atmb;
import defpackage.atmc;
import defpackage.auqe;
import defpackage.axzd;
import defpackage.axzg;
import defpackage.ayrz;
import defpackage.ce;
import defpackage.dd;
import defpackage.dn;
import defpackage.evr;
import defpackage.ffv;
import defpackage.gng;
import defpackage.gni;
import defpackage.jg;
import defpackage.jnh;
import defpackage.lgx;
import defpackage.lho;
import defpackage.lhu;
import defpackage.lie;
import defpackage.lif;
import defpackage.lil;
import defpackage.liu;
import defpackage.lix;
import defpackage.liy;
import defpackage.liz;
import defpackage.lja;
import defpackage.ljb;
import defpackage.ljc;
import defpackage.mcy;
import defpackage.ogx;
import defpackage.whu;
import defpackage.yjk;
import defpackage.ynm;
import defpackage.yny;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.yro;
import defpackage.ysy;
import defpackage.zga;
import defpackage.zhq;
import defpackage.zjg;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VoiceSearchActivity extends lhu implements akaq, liu, lie, ypd {
    public static final /* synthetic */ int af = 0;
    private static final PermissionDescriptor[] ag = {new PermissionDescriptor(2, acsb.c(65799), acsb.c(65800))};
    public ConnectivitySlimStatusBarController A;
    protected akfn B;
    public Runnable C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f160J;
    public boolean K;
    public boolean L;
    public LinearLayout M;
    public ImageView N;
    public View P;
    public byte[] Q;
    public ImageView R;
    public lif S;
    AudioRecord T;
    public boolean U;
    public boolean V;
    public auqe W;
    public aadw Y;
    public akap Z;
    private lil aA;
    public akbc aa;
    public axzg ab;
    public agcm ac;
    public ogx ad;
    public ajyw ae;
    private boolean ah;
    private ImageView ai;
    private boolean aj;
    private SoundPool ak;
    private int al;
    private gng am;
    private String an;
    private lho ao;
    private boolean ap;
    private boolean aq;
    private RelativeLayout ar;
    private ViewGroup as;
    private int at;
    private String au;
    private String av;
    private ffv aw;
    private int ax;
    private int ay;
    private int az;
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
    public akfb z;
    public int m = 0;
    public List O = Collections.emptyList();
    public final Interpolator X = jg.o(0.05f, 0.0f, 0.0f, 1.0f);

    private final Boolean q() {
        return Boolean.valueOf(getResources().getConfiguration().screenHeightDp >= 400);
    }

    private final String r() {
        String c = akbc.c();
        String a = this.aa.a();
        if (c.isEmpty() || a.isEmpty()) {
            return "en-US";
        }
        StringBuilder sb = new StringBuilder(c.length() + 1 + String.valueOf(a).length());
        sb.append(c);
        sb.append("-");
        sb.append(a);
        return sb.toString();
    }

    private final void s() {
        int dimension;
        float dimension2;
        int dimensionPixelSize;
        int i;
        int i2;
        int i3;
        float dimensionPixelSize2;
        float dimensionPixelSize3;
        int dimensionPixelSize4;
        float f;
        float f2;
        Resources resources = getResources();
        int dimension3 = (int) resources.getDimension(R.dimen.text_layout_margin_start_end_bottom);
        if (yjk.aa(this)) {
            if (yjk.Y(this)) {
                i2 = resources.getDimensionPixelSize(R.dimen.microphone_view_margin_bottom_tablet_land);
                f = 0.22f;
                f2 = 0.2f;
            } else {
                i2 = resources.getDimensionPixelSize(R.dimen.microphone_view_margin_bottom_tablet);
                f = 0.24f;
                f2 = 0.1f;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.state_text_margin_bottom_tablet);
            this.P.setOnApplyWindowInsetsListener(new lja(this));
            i3 = (int) (f * (yjk.L(this) - this.m));
            i = (int) (f2 * yjk.N(this));
        } else {
            if (q().booleanValue()) {
                dimension = (int) resources.getDimension(R.dimen.microphone_view_margin_bottom);
                dimension2 = resources.getDimension(R.dimen.text_layout_margin_top);
            } else {
                dimension = (int) resources.getDimension(R.dimen.microphone_view_margin_bottom_land);
                dimension2 = resources.getDimension(R.dimen.text_layout_margin_top_land);
            }
            int i4 = (int) dimension2;
            int dimension4 = (int) resources.getDimension(R.dimen.text_layout_margin_start_end_bottom);
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.state_text_margin_bottom);
            i = dimension4;
            i2 = dimension;
            i3 = i4;
        }
        yny.z(this.c, yny.s(0, 0, 0, i2), ViewGroup.MarginLayoutParams.class);
        yny.z(this.ar, yny.s(i, i3, i, dimension3), ViewGroup.MarginLayoutParams.class);
        yny.z(this.E, yny.s(0, 0, 0, dimensionPixelSize), ViewGroup.MarginLayoutParams.class);
        Resources resources2 = getResources();
        if (yjk.aa(this)) {
            dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.voice_search_small_text_size_tablet);
            dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_size_tablet);
            dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_line_spacing_extra_tablet);
        } else {
            dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.voice_search_small_text_size);
            dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_size);
            dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_line_spacing_extra);
        }
        float f3 = dimensionPixelSize4;
        this.E.setTextSize(0, dimensionPixelSize3);
        this.E.setLineSpacing(f3, 1.0f);
        this.d.setTextSize(0, dimensionPixelSize3);
        this.d.setLineSpacing(f3, 1.0f);
        this.D.setTextSize(0, dimensionPixelSize3);
        this.D.setLineSpacing(f3, 1.0f);
        this.G.setTextSize(0, dimensionPixelSize2);
        this.H.setTextSize(0, dimensionPixelSize2);
        this.F.setTextSize(0, dimensionPixelSize2);
    }

    private final void t() {
        setVisible(false);
        this.aq = true;
        Intent intent = getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        setResult(-1, intent);
        h();
    }

    private final void u(ce ceVar, String str) {
        ce f = this.j.f(this.an);
        ceVar.getClass();
        zhq.m(str);
        dn k = this.j.k();
        if (f != null && f.ar() && !f.equals(ceVar)) {
            k.l(f);
        }
        this.P.setVisibility(0);
        if (!ceVar.ar()) {
            k.q(R.id.fragment_container, ceVar, str);
        } else if (ceVar.G) {
            k.n(ceVar);
        }
        k.i = 4099;
        k.a();
        this.an = str;
    }

    @Override // defpackage.lie
    public final void a() {
        this.b.post(new lix(this, 0));
    }

    @Override // defpackage.akaq
    public final void aJ() {
        h();
    }

    @Override // defpackage.akaq
    public final void aK() {
        this.ah = false;
        this.P.setVisibility(8);
        this.b.post(new lix(this, 3));
    }

    @Override // defpackage.liu
    public final void b() {
        this.F.setVisibility(4);
        this.G.setVisibility(8);
        m();
    }

    @Override // defpackage.liu
    public final void c(String str, String str2) {
        this.I.setText(str);
        this.I.requestLayout();
        akfo akfoVar = this.i;
        if (akfoVar != null) {
            akfoVar.a();
            this.i = null;
        }
        o(str2);
    }

    public final void g() {
        int i = 0;
        if (!q().booleanValue()) {
            if (!Boolean.valueOf(getResources().getConfiguration().screenWidthDp >= 400).booleanValue()) {
                return;
            }
        }
        if (this.O.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder(getResources().getString(R.string.try_saying_text));
        if (q().booleanValue()) {
            sb.append("\n\n''");
        } else {
            sb.append("\n''");
        }
        sb.append((String) this.O.get(0));
        sb.append("''");
        this.H.setText(sb);
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.O) {
            i++;
            sb2.append("''");
            sb2.append(str);
            sb2.append("''");
            if (i >= 3) {
                break;
            } else {
                sb2.append("\n\n");
            }
        }
        this.G.setText(sb2);
    }

    public final void h() {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    public final void i(int i) {
        SoundPool soundPool = this.ak;
        if (soundPool != null) {
            soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }

    public final void j() {
        this.h = false;
        this.f160J = false;
        this.K = false;
        akfo akfoVar = this.i;
        if (akfoVar != null) {
            akfoVar.c();
        }
        l();
    }

    public final void k() {
        this.h = false;
        this.f160J = false;
        this.K = false;
        akfo akfoVar = this.i;
        if (akfoVar != null) {
            akfoVar.c();
        }
        this.F.setVisibility(0);
        this.d.setVisibility(8);
        this.D.setVisibility(8);
        this.H.setVisibility(8);
        this.G.setVisibility(8);
        this.E.setText(getResources().getText(R.string.you_are_offline));
        this.E.setVisibility(0);
        this.c.setVisibility(8);
        this.c.d();
        if (p()) {
            this.R.animate().alpha(0.0f).setDuration(200L).setInterpolator(this.X);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class};
        }
        if (i == 0) {
            boolean a = ((yro) obj).a();
            this.V = a;
            this.A.m(!a);
            if (this.V) {
                this.b.removeCallbacks(this.C);
                this.E.setText(getResources().getText(R.string.you_are_online));
                this.c.setEnabled(true);
                this.c.setVisibility(0);
                return null;
            }
            if (this.h) {
                this.b.postDelayed(this.C, 3000L);
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
        this.F.setVisibility(0);
        this.E.setVisibility(0);
        this.d.setVisibility(8);
        this.D.setVisibility(8);
        this.H.setVisibility(8);
        this.G.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.d();
        if (p()) {
            this.R.animate().alpha(0.0f).setDuration(200L).setInterpolator(this.X);
        }
        if (!this.V) {
            this.E.setText(getResources().getText(R.string.you_are_offline));
            this.c.setEnabled(false);
        } else if (!this.U) {
            this.E.setText(getResources().getText(R.string.didnt_hear_that));
        } else if (!ammx.e(this.G.getText().toString())) {
            this.E.setText(getResources().getText(R.string.try_saying_text));
            this.G.setVisibility(0);
        } else {
            this.E.setText(getResources().getText(R.string.try_again_text));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void m() {
        char c;
        CharSequence text;
        InputStream openRawResource;
        byte[] bArr;
        this.h = true;
        this.L = false;
        this.U = false;
        this.d.setVisibility(8);
        this.d.setText("");
        this.D.setText("");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        TextView textView = this.E;
        String str = (String) this.ab.a.a.Y(axzd.e).B().aB();
        switch (str.hashCode()) {
            case -2140931533:
                if (str.equals("start_speaking_transliterated_hindi")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -2088435442:
                if (str.equals("speak_into_the_phone")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -107484659:
                if (str.equals("start_speaking")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 358371414:
                if (str.equals("try_saying_something")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            text = getResources().getText(R.string.start_speaking);
        } else if (c == 1) {
            text = getResources().getText(R.string.speak_into_the_phone);
        } else if (c != 2) {
            if (c == 3) {
                text = getResources().getText(R.string.try_saying_something_transliterated_hindi);
            } else {
                text = getResources().getText(R.string.listening);
            }
        } else if (Locale.getDefault().equals(Locale.forLanguageTag("en-IN"))) {
            text = getResources().getText(R.string.start_speaking_transliterated_hindi);
        } else {
            text = getResources().getText(R.string.start_speaking);
        }
        textView.setText(text);
        this.E.setVisibility(0);
        akfo akfoVar = this.i;
        if (akfoVar == null || !akfoVar.f()) {
            t();
        } else {
            i(this.al);
            this.c.f();
        }
        if (p() && this.h) {
            this.R.animate().alpha(1.0f).setDuration(200L).setInterpolator(this.X);
            gng a = this.u.a();
            this.am = a;
            if (a == gng.DARK) {
                openRawResource = getResources().openRawResource(R.drawable.face_only_grey3);
            } else {
                openRawResource = getResources().openRawResource(R.drawable.face_only_grey5);
            }
            try {
                bArr = anbt.c(openRawResource);
            } catch (IOException e) {
                zga.d("Error converting speaking gif asset to byte array", e);
                bArr = null;
            }
            if (bArr != null) {
                try {
                    this.R.setImageDrawable(this.aw.b(bArr));
                } catch (zjg e2) {
                    zga.d("Error downloading or decoding speaking gif asset.", e2);
                }
            }
        }
    }

    public final void n() {
        this.p.n(new acqx(acsb.c(62943)));
        if (evr.I(this.o) && this.n.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.n.u("voz_vp", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        if (evr.ay(this.Y)) {
            ynm.n(this, anaf.V(this.ac.k(), 300L, TimeUnit.MILLISECONDS, this.w), new liz(this, 3), new liz(this, 2));
        } else {
            o("");
        }
    }

    public final void o(String str) {
        String str2;
        boolean z;
        if (str.isEmpty()) {
            str2 = r();
            z = false;
        } else {
            str2 = str;
            z = true;
        }
        if (this.B == null) {
            this.B = new ljc(this);
        }
        ljb ljbVar = new ljb(this);
        if (this.i == null) {
            akfp a = this.q.a(this.B, ljbVar, this.az, str2, this.Q, evr.bl(this.o), this.ax, this.ay, this.av, r());
            a.C = evr.bm(this.o);
            a.w = evr.q(this.o);
            a.c(evr.r(this.o));
            a.y = evr.z(this.o);
            a.s = evr.ac(this.o);
            a.v = evr.ay(this.Y) && z;
            a.b(ammv.j(evr.B(this.o)));
            a.A = evr.x(this.o);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayrz.c((AtomicReference) this.ab.d().as(false).V(new lgx(atomicBoolean, 2)));
            a.t = atomicBoolean.get();
            a.u = this.ab.g().booleanValue();
            this.i = a.a();
        }
        if (!this.V) {
            k();
        } else if (this.aj) {
            this.aj = false;
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

    @Override // defpackage.ml, defpackage.ci, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s();
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        SoundPool soundPool = new SoundPool(5, 3, 0);
        this.ak = soundPool;
        this.al = soundPool.load(this, R.raw.open, 0);
        this.e = this.ak.load(this, R.raw.success, 0);
        this.f = this.ak.load(this, R.raw.no_input, 0);
        this.g = this.ak.load(this, R.raw.failure, 0);
        this.am = this.u.a();
        gng gngVar = gng.LIGHT;
        int ordinal = this.am.ordinal();
        int i2 = 1;
        if (ordinal == 0) {
            setTheme(R.style.Theme_YouTube_Home);
        } else if (ordinal == 1) {
            setTheme(R.style.Theme_YouTube_Dark_Home);
        }
        setContentView(R.layout.voice_search_activity);
        dd supportFragmentManager = getSupportFragmentManager();
        this.j = supportFragmentManager;
        if (bundle != null) {
            akar akarVar = (akar) supportFragmentManager.g(bundle, "permission_request_fragment");
            this.k = akarVar;
            if (akarVar != null && (!TextUtils.equals(this.an, "PERMISSION_REQUEST_FRAGMENT") || !akai.f(this, ag))) {
                dn k = this.j.k();
                k.l(this.k);
                k.a();
            }
        }
        this.P = findViewById(R.id.fragment_container);
        ImageView imageView = (ImageView) findViewById(R.id.back_button);
        this.ai = imageView;
        imageView.setOnClickListener(new liy(this, i2));
        MicrophoneView microphoneView = (MicrophoneView) findViewById(R.id.microphone_container);
        this.c = microphoneView;
        ((FloatingActionButton) microphoneView.findViewById(R.id.disabled_microphone)).setImageDrawable(whu.y(this.c.getContext(), R.drawable.yt_outline_mic_white_48, R.attr.ytTextPrimary));
        ((FloatingActionButton) this.c.findViewById(R.id.enabled_microphone)).setImageResource(R.drawable.yt_fill_mic_white_48);
        this.c.setOnClickListener(new liy(this, i));
        this.E = (TextView) findViewById(R.id.state_text_view);
        this.d = (TextView) findViewById(R.id.stable_recognized_text);
        this.D = (TextView) findViewById(R.id.unstable_recognized_text);
        this.F = (TextView) findViewById(R.id.error_text);
        this.G = (TextView) findViewById(R.id.error_voice_tips);
        this.H = (TextView) findViewById(R.id.listening_voice_tips_text);
        this.ar = (RelativeLayout) findViewById(R.id.voice_text_container);
        this.as = (ViewGroup) findViewById(R.id.bottom_container);
        this.I = (TextView) findViewById(R.id.voice_language);
        this.M = (LinearLayout) findViewById(R.id.voice_language_button);
        this.N = (ImageView) findViewById(R.id.voice_language_icon);
        this.R = (ImageView) findViewById(R.id.speaking_gif);
        this.aw = new ffv(this);
        lho F = mcy.F(this);
        this.ao = F;
        ConnectivitySlimStatusBarController c = this.ad.c(this, F);
        this.A = c;
        c.g(this.as);
        this.V = this.t.o();
        this.C = new lix(this, 2);
        if (evr.ay(this.Y)) {
            lil n = this.ae.n(r());
            this.aA = n;
            ynm.n(this, n.a(), new liz(this, 4), new liz(this, i2));
        }
        this.az = getIntent().getIntExtra("MicSampleRate", 16000);
        this.ax = getIntent().getIntExtra("MicAudioFormatEncoding", 2);
        this.ay = getIntent().getIntExtra("MicChannelConfig", 16);
        s();
        g();
        this.at = getIntent().getIntExtra("ParentVeType", 0);
        this.au = getIntent().getStringExtra("ParentCSN");
        this.av = getIntent().getStringExtra("searchEndpointParams");
        this.Q = getIntent().getByteArrayExtra("SearchboxStats");
        aong aongVar = (aong) apxf.a.createBuilder();
        aone createBuilder = atmc.a.createBuilder();
        int i3 = this.at;
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b = 2 | atmcVar.b;
        atmcVar.d = i3;
        String str = this.au;
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
        this.aj = true;
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        this.h = false;
        SoundPool soundPool = this.ak;
        if (soundPool != null) {
            soundPool.release();
            this.ak = null;
        }
        akfo akfoVar = this.i;
        if (akfoVar != null) {
            akfoVar.a();
            this.i = null;
        }
        this.B = null;
        this.c.setOnClickListener(null);
        this.ai.setOnClickListener(null);
        this.p.t();
        ConnectivitySlimStatusBarController connectivitySlimStatusBarController = this.A;
        if (connectivitySlimStatusBarController != null) {
            connectivitySlimStatusBarController.i();
        }
        super.onDestroy();
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.aq) {
            overridePendingTransition(0, 0);
            this.aq = false;
        }
        if (this.ab.g().booleanValue()) {
            ynm.o(this, this.z.a(), jnh.j, jnh.g);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.am != this.u.a()) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new lix(this, 1));
        }
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.v.g(this);
        this.A.m(true);
        if (aih.c(this, "android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                PermissionDescriptor[] permissionDescriptorArr = ag;
                if (akai.f(this, permissionDescriptorArr)) {
                    if (this.ah) {
                        return;
                    }
                    if (this.k == null) {
                        akap akapVar = this.Z;
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
                    u(this.k, "PERMISSION_REQUEST_FRAGMENT");
                    this.ah = true;
                    return;
                }
            }
            h();
            return;
        }
        AudioRecord a = this.r.a();
        this.T = a;
        if (a != null) {
            this.ax = a.getAudioFormat();
            this.ay = this.T.getChannelConfiguration();
            this.az = this.T.getSampleRate();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayrz.c((AtomicReference) this.ab.e().as(false).V(new lgx(atomicBoolean, 2)));
            if (!atomicBoolean.get() || !this.y.t()) {
                n();
                return;
            }
            lif o = lif.o();
            this.S = o;
            o.c = this;
            u(o, "VAA_CONSENT_FRAGMENT");
            return;
        }
        t();
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.v.m(this);
        if (this.ap) {
            return;
        }
        h();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.ap = z;
    }

    public final boolean p() {
        return !((String) this.ab.f().j().X()).isEmpty();
    }
}
