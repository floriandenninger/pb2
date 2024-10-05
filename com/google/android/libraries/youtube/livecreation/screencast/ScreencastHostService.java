package com.google.android.libraries.youtube.livecreation.screencast;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import defpackage.abrk;
import defpackage.abrn;
import defpackage.absp;
import defpackage.absq;
import defpackage.abvt;
import defpackage.abwl;
import defpackage.abwr;
import defpackage.abwt;
import defpackage.abwu;
import defpackage.abwv;
import defpackage.abww;
import defpackage.abwy;
import defpackage.abwz;
import defpackage.acay;
import defpackage.acby;
import defpackage.acbz;
import defpackage.accc;
import defpackage.acce;
import defpackage.acco;
import defpackage.accp;
import defpackage.accy;
import defpackage.acdc;
import defpackage.acde;
import defpackage.acdn;
import defpackage.acdw;
import defpackage.acdx;
import defpackage.acdy;
import defpackage.aceb;
import defpackage.aced;
import defpackage.aceh;
import defpackage.acei;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acrb;
import defpackage.acsb;
import defpackage.adyu;
import defpackage.aeqh;
import defpackage.afsy;
import defpackage.afto;
import defpackage.aih;
import defpackage.ajjz;
import defpackage.ajut;
import defpackage.akcs;
import defpackage.akcv;
import defpackage.aksl;
import defpackage.amkq;
import defpackage.aqyg;
import defpackage.asru;
import defpackage.atfw;
import defpackage.atgf;
import defpackage.avhy;
import defpackage.axpg;
import defpackage.axqv;
import defpackage.axze;
import defpackage.dy;
import defpackage.mh;
import defpackage.mi;
import defpackage.wbs;
import defpackage.wdm;
import defpackage.whl;
import defpackage.yny;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zfi;
import defpackage.zxq;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ScreencastHostService extends acbz implements acdx, abwr, abwu, abwt, absp, ypd {
    public static final /* synthetic */ int s = 0;
    private static final long t = TimeUnit.SECONDS.toMillis(30);
    private atgf A;
    public ypa a;
    public acra b;
    public abwz c;
    public absq d;
    public abrn e;
    public Executor f;
    public Executor g;
    public axpg h;
    public SharedPreferences i;
    public aksl j;
    public boolean k;
    public boolean l;
    public acdy m;
    public abwy n;
    public acay o;
    public acby p;
    public aeqh q;
    public axze r;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private String z;

    private final void B() {
        acdy acdyVar = this.m;
        if (acdyVar == null) {
            Log.w("ScreencastHostServ", "No screencast controls UI available.");
        } else {
            acei aceiVar = acdyVar.b;
            aceiVar.d();
            if (aceiVar.a.getParent() != null) {
                aceiVar.g.removeView(aceiVar.a);
            }
            acdyVar.c.c();
            acdyVar.c.i();
            acdyVar.e();
            acdw acdwVar = acdyVar.d;
            if (acdwVar != null) {
                acdwVar.a();
            }
            acdyVar.i = 1;
        }
        this.l = false;
        this.k = false;
        if (!this.v) {
            stopSelf();
        }
        stopForeground(true);
    }

    private final void C() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) ScreencastHostService.class);
        intent.putExtra("EXTRA_STOP_SESSION_WITH_CONFIRM", true);
        PendingIntent service = PendingIntent.getService(this, 0, intent, yny.M() | 134217728);
        Resources resources = getResources();
        int i = true != this.l ? R.string.screencast_notification_title_cancel_stream : R.string.screencast_notification_title_stop_stream;
        dy dyVar = new dy(this);
        whl.y(dyVar);
        dyVar.r(R.drawable.ic_livestreaming_white_24);
        dyVar.x = "status";
        dyVar.k = 1;
        dyVar.k(resources.getString(i));
        dyVar.j(resources.getString(R.string.screencast_notification_text));
        dyVar.g = service;
        dyVar.o(true);
        startForeground(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor, dyVar.b());
    }

    public static Intent c(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) ScreencastHostService.class);
        intent.putExtra("EXTRA_STOP_SESSION", true);
        return intent;
    }

    public static Intent p(Context context, afsy afsyVar, String str, boolean z, String str2, String str3, atgf atgfVar, long j, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Intent intent) {
        afsyVar.getClass();
        Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) ScreencastHostService.class);
        intent2.putExtra("EXTRA_START_SESSION", true);
        intent2.putExtra("EXTRA_ORIENTATION_IS_PORTRAIT", z);
        intent2.putExtra("EXTRA_VIDEO_ID", str);
        intent2.putExtra("EXTRA_STREAM_URL", str2);
        intent2.putExtra("EXTRA_STREAM_KEY", str3);
        intent2.putExtra("EXTRA_USE_CBR_MODE", z3);
        intent2.putExtra("EXTRA_USE_RATE_BOUNCE_MODE", z4);
        intent2.putExtra("EXTRA_ALLOW_240P", z5);
        intent2.putExtra("EXTRA_ALLOW_360P", z6);
        intent2.putExtra("EXTRA_USE_WEBRTC", z7);
        intent2.putExtra("EXTRA_START_WITH_SELF_CAM", true);
        intent2.putExtra("EXTRA_START_WITH_MIC", z2);
        intent2.putExtra("EXTRA_START_WITH_CHAT", false);
        intent2.putExtra("EXTRA_SCREEN_CAPTURE_PERMISSION", intent);
        intent2.putExtra("EXTRA_TIMER_START_BASE", j);
        intent2.putExtra("EXTRA_TIMER_DURATION", j2);
        intent2.putExtra("EXTRA_SEND_BUFFER_CHUNK_COUNT", i);
        intent2.putExtra("EXTRA_STREAM_SCREEN_RENDERER", new ParcelableMessageLite(atgfVar));
        return intent2;
    }

    private final Dialog r() {
        mh mhVar = new mh(getApplicationContext(), 2132083833);
        mhVar.c(true);
        mhVar.n(R.string.stop_screencast_session_title);
        mhVar.f(R.string.stop_screencast_session_message);
        mhVar.k(R.string.ok, new DialogInterface.OnClickListener() { // from class: acca
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                adyu.cw(ScreencastHostService.this.getApplicationContext());
            }
        });
        mhVar.h(R.string.cancel, null);
        mi b = mhVar.b();
        b.getWindow().setType(Build.VERSION.SDK_INT >= 26 ? 2038 : 2003);
        return b;
    }

    @Override // defpackage.abwu
    public final void A(final abwl abwlVar) {
        this.m.e();
        acdy acdyVar = this.m;
        String string = getResources().getString(R.string.screencast_capture_communication_error);
        final byte[] bArr = null;
        View.OnClickListener onClickListener = new View.OnClickListener(abwlVar, bArr, bArr) { // from class: acci
            public final /* synthetic */ abwl b;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreencastHostService screencastHostService = ScreencastHostService.this;
                abwl abwlVar2 = this.b;
                screencastHostService.m.h(screencastHostService.getResources().getString(R.string.lc_reconnecting));
                abwlVar2.a(true);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener(bArr, bArr) { // from class: acch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abwl abwlVar2 = abwl.this;
                int i = ScreencastHostService.s;
                abwlVar2.a(false);
            }
        };
        if (acdy.n(acdyVar.i)) {
            acdyVar.e();
            acdyVar.b();
            acdyVar.e.a(1);
            acdyVar.e.a.setText(string);
            acdyVar.e.c(onClickListener);
            acdyVar.e.b(onClickListener2);
            acdyVar.e.setVisibility(0);
            acdyVar.i = 6;
        }
    }

    @Override // defpackage.absp
    public final void a(boolean z) {
        if (z) {
            this.e.e(new acce(this, 0));
        } else {
            this.e.e(new acce(this, 3));
        }
    }

    @Override // defpackage.abwr
    public final boolean d() {
        return true;
    }

    @Override // defpackage.abwt
    public final void g(int i, String str) {
    }

    @Override // defpackage.abwt
    public final void h(int i, aqyg aqygVar) {
    }

    @Override // defpackage.acdx
    public final void i() {
        Log.e("ScreencastHostServ", "Fatal error from UI controller");
        k();
    }

    public final void j(final boolean z) {
        this.n.n(z, new abwv() { // from class: accb
            @Override // defpackage.abwv
            public final void a(final boolean z2) {
                final ScreencastHostService screencastHostService = ScreencastHostService.this;
                boolean z3 = z;
                screencastHostService.o(new accl(z2, 0));
                if (z3 != z2) {
                    screencastHostService.g.execute(new Runnable() { // from class: accg
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScreencastHostService screencastHostService2 = ScreencastHostService.this;
                            boolean z4 = z2;
                            acdy acdyVar = screencastHostService2.m;
                            acdyVar.b.f(z4);
                            acdyVar.c.p(z4);
                            screencastHostService2.m.j(acdm.ERROR, screencastHostService2.getString(R.string.screencast_mic_update_error));
                        }
                    });
                }
            }
        });
    }

    public final void k() {
        if (this.w) {
            return;
        }
        acdy acdyVar = this.m;
        if (acdyVar != null) {
            acdyVar.h("");
        }
        this.e.f();
        acay acayVar = this.o;
        if (acayVar != null) {
            acayVar.i();
        }
        abwy abwyVar = this.n;
        if (abwyVar == null || !this.u) {
            B();
            startActivity(adyu.cs(getApplicationContext(), 26, null, null, null, false));
        } else {
            abwyVar.s(false);
        }
        abvt b = abvt.b();
        b.k(asru.class);
        b.f(asru.class, accp.class, null);
        this.w = true;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            if (!this.k) {
                return null;
            }
            k();
            this.m.i(R.string.screencast_capture_stopped_on_sign_out);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.abwt
    public final void l(abww abwwVar, String str) {
        String.valueOf(abwwVar.name()).length();
        String.valueOf(str).length();
    }

    @Override // defpackage.abwt
    public final void m(String str) {
    }

    @Override // defpackage.abwt
    public final void n(String str, String str2, avhy avhyVar) {
        if (acdy.m(this.m)) {
            if (!TextUtils.isEmpty(str)) {
                acdy acdyVar = this.m;
                if (acdy.n(acdyVar.i)) {
                    acdyVar.c.d.f(str);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            acdy acdyVar2 = this.m;
            if (acdy.n(acdyVar2.i)) {
                acdyVar2.c.d.e(str2);
            }
        }
    }

    public final void o(final zfi zfiVar) {
        this.f.execute(new Runnable() { // from class: accf
            @Override // java.lang.Runnable
            public final void run() {
                ScreencastHostService screencastHostService = ScreencastHostService.this;
                zfi zfiVar2 = zfiVar;
                StreamConfig a = StreamConfig.a(screencastHostService.i.getString("SHARED_PREF_STREAM_CONFIG_KEY", null));
                if (a == null) {
                    Log.e("ScreencastHostServ", "Failed to load live stream state from shared preferences");
                    return;
                }
                zfiVar2.a(a);
                String b = a.b();
                if (TextUtils.isEmpty(b)) {
                    Log.e("ScreencastHostServ", "Failed to save the live stream state to shared preference.");
                    return;
                }
                SharedPreferences.Editor edit = screencastHostService.i.edit();
                edit.putString("SHARED_PREF_STREAM_CONFIG_KEY", b);
                edit.apply();
            }
        });
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (this.y) {
            this.a.m(this);
            this.y = false;
        }
        this.v = true;
        super.onDestroy();
        k();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Size size;
        if (!adyu.cv()) {
            stopSelf();
            return 2;
        }
        if (!this.y) {
            this.a.g(this);
            this.y = true;
        }
        if (intent == null) {
            B();
            return 2;
        }
        if (intent.getBooleanExtra("EXTRA_STOP_SESSION", false)) {
            k();
            return 2;
        }
        if (intent.getBooleanExtra("EXTRA_STOP_SESSION_WITH_CONFIRM", false)) {
            r().show();
            return 2;
        }
        if (!intent.getBooleanExtra("EXTRA_START_SESSION", false)) {
            return 2;
        }
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_ORIENTATION_IS_PORTRAIT", true);
        boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_DID_START_BROADCAST", false);
        long longExtra = intent.getLongExtra("EXTRA_TIMER_START_BASE", 0L);
        long longExtra2 = intent.getLongExtra("EXTRA_TIMER_DURATION", 0L);
        int intExtra = intent.getIntExtra("EXTRA_SEND_BUFFER_CHUNK_COUNT", 0);
        this.z = intent.getStringExtra("EXTRA_VIDEO_ID");
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) intent.getParcelableExtra("EXTRA_STREAM_SCREEN_RENDERER");
        if (parcelableMessageLite != null) {
            this.A = (atgf) parcelableMessageLite.a(atgf.a);
        }
        String stringExtra = intent.getStringExtra("EXTRA_STREAM_URL");
        String stringExtra2 = intent.getStringExtra("EXTRA_STREAM_KEY");
        boolean booleanExtra3 = intent.getBooleanExtra("EXTRA_START_WITH_SELF_CAM", true);
        boolean booleanExtra4 = intent.getBooleanExtra("EXTRA_START_WITH_MIC", true);
        boolean booleanExtra5 = intent.getBooleanExtra("EXTRA_START_WITH_CHAT", false);
        boolean booleanExtra6 = intent.getBooleanExtra("EXTRA_USE_CBR_MODE", false);
        boolean booleanExtra7 = intent.getBooleanExtra("EXTRA_USE_RATE_BOUNCE_MODE", false);
        boolean booleanExtra8 = intent.getBooleanExtra("EXTRA_ALLOW_240P", false);
        boolean booleanExtra9 = intent.getBooleanExtra("EXTRA_ALLOW_360P", false);
        boolean booleanExtra10 = intent.getBooleanExtra("EXTRA_USE_WEBRTC", false);
        final Intent intent2 = (Intent) intent.getParcelableExtra("EXTRA_SCREEN_CAPTURE_PERMISSION");
        String str = this.z;
        if (this.k) {
            r().show();
            return 2;
        }
        C();
        boolean z = this.r.i().G;
        WindowManager windowManager = (WindowManager) getSystemService("window");
        if (windowManager == null || !z) {
            size = new Size(true == booleanExtra ? 608 : 1280, true == booleanExtra ? 1080 : 720);
        } else {
            windowManager.getDefaultDisplay().getRealSize(new Point());
            if (Math.min(r1.x, r1.y) / Math.max(r1.x, r1.y) == 0.5625f) {
                size = new Size(true == booleanExtra ? 608 : 1280, true == booleanExtra ? 1080 : 720);
            } else {
                int sqrt = (int) Math.sqrt(r0 * 921600.0f);
                int sqrt2 = (int) Math.sqrt(921600.0f / r0);
                if (sqrt % 2 != 0) {
                    sqrt++;
                }
                if (sqrt2 % 2 != 0) {
                    sqrt2++;
                }
                int i3 = true != booleanExtra ? sqrt2 : sqrt;
                if (true == booleanExtra) {
                    sqrt = sqrt2;
                }
                size = new Size(i3, sqrt);
                size.getWidth();
                size.getHeight();
            }
        }
        final int width = size.getWidth();
        final int height = size.getHeight();
        abwy a = this.c.a(null, str, booleanExtra, booleanExtra2, false, Integer.valueOf(width), Integer.valueOf(height), stringExtra, stringExtra2, longExtra, longExtra2, booleanExtra4, booleanExtra6, booleanExtra7, booleanExtra8, booleanExtra9, booleanExtra10, intExtra);
        this.n = a;
        a.w = new accc(this);
        this.k = true;
        aeqh aeqhVar = this.q;
        Context context = (Context) aeqhVar.f.get();
        context.getClass();
        wdm wdmVar = (wdm) aeqhVar.g.get();
        wdmVar.getClass();
        ((ScheduledExecutorService) aeqhVar.e.get()).getClass();
        acra acraVar = (acra) aeqhVar.c.get();
        acraVar.getClass();
        axpg axpgVar = ((axqv) aeqhVar.h).get();
        axpgVar.getClass();
        ajut ajutVar = (ajut) aeqhVar.b.get();
        ajutVar.getClass();
        ajjz ajjzVar = (ajjz) aeqhVar.a.get();
        ajjzVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) aeqhVar.d.get();
        sharedPreferences.getClass();
        acdy acdyVar = new acdy(context, wdmVar, acraVar, axpgVar, ajutVar, ajjzVar, sharedPreferences, this);
        this.m = acdyVar;
        atgf atgfVar = this.A;
        acdyVar.h = booleanExtra5;
        acdyVar.l(atgfVar);
        acei aceiVar = acdyVar.b;
        aceiVar.p = acdyVar;
        if (aceiVar.u != 1) {
            aceiVar.d();
        }
        aceiVar.g(false);
        aceiVar.f(booleanExtra4);
        aceiVar.q = acei.l(aceiVar.f);
        if (!TextUtils.isEmpty(aceiVar.q)) {
            aceiVar.t = new accy(aceiVar.f, aceiVar.q, aceiVar.h, aceiVar.b);
            if (!aceiVar.t.k(aceiVar.v)) {
                aceiVar.t = null;
            }
        }
        boolean z2 = aceiVar.k() && booleanExtra3;
        aceiVar.o = z2;
        int i4 = 8;
        if (z2) {
            aceiVar.b.setVisibility(0);
            aceiVar.c.setVisibility(8);
            aceiVar.t.h();
        } else {
            aceiVar.b.setVisibility(8);
            aceiVar.c.setVisibility(0);
        }
        aceiVar.s = new aceh(aceiVar);
        aceiVar.a.setOnTouchListener(new aced(aceiVar, new GestureDetector(aceiVar.f, aceiVar.s)));
        aceiVar.r = 0;
        aceiVar.u = 2;
        final acdn acdnVar = acdyVar.c;
        acei aceiVar2 = acdyVar.b;
        amkq.N(aceiVar2.u != 1);
        boolean k = aceiVar2.k();
        acdnVar.m.setOnClickListener(new acdc(acdnVar, 5));
        acdnVar.m.getChildAt(0).setOnClickListener(new acdc(acdnVar, 6));
        mh mhVar = new mh(acdnVar.f, 2132083833);
        mhVar.f(R.string.lc_confirm_stop_streaming);
        mhVar.i(acdnVar.f.getString(R.string.cancel), null);
        mhVar.l(acdnVar.f.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: acdb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                acdn acdnVar2 = acdn.this;
                acdnVar2.E = false;
                accz acczVar = acdnVar2.z;
                if (acczVar != null) {
                    ((acdy) acczVar).d();
                }
                acdnVar2.l.setEnabled(false);
            }
        });
        mhVar.c(false);
        acdnVar.N = mhVar.b();
        acdnVar.N.getWindow().setType(Build.VERSION.SDK_INT >= 26 ? 2038 : 2003);
        acdnVar.e.setOnClickListener(new acdc(acdnVar, 7));
        acdnVar.e.setVisibility(0);
        acdnVar.g(acrb.SCREENCAST_CONTROLLER_START_STREAM_BUTTON);
        acdnVar.g(acrb.SCREENCAST_CONTROLLER_STOP_STREAM_BUTTON);
        acdnVar.g(acrb.SCREENCAST_CONTROLLER_ENABLE_CAMERA_BUTTON);
        acdnVar.g(acrb.SCREENCAST_CONTROLLER_DISABLE_CAMERA_BUTTON);
        acrb acrbVar = acrb.SCREENCAST_CONTROLLER_DISABLE_CAMERA_BUTTON;
        acdnVar.d.d(null);
        if (!k) {
            acdnVar.l(false);
            acdnVar.j.setEnabled(false);
            acdnVar.j.setImageTintList(aih.f(acdnVar.f, R.color.screencast_control_button_disabled_color));
            acdnVar.j.setContentDescription(acdnVar.i);
        } else if (booleanExtra3) {
            acdnVar.l(true);
            acrbVar = acrb.SCREENCAST_CONTROLLER_ENABLE_CAMERA_BUTTON;
        } else {
            acdnVar.l(false);
        }
        acra acraVar2 = acdnVar.o;
        acqx acqxVar = new acqx(acrbVar);
        int i5 = 3;
        acraVar2.I(3, acqxVar, null);
        acdnVar.j.setOnClickListener(new acdc(acdnVar, i4));
        acdnVar.h.setOnClickListener(new acdc(acdnVar, 9));
        acdnVar.p(booleanExtra4);
        acdnVar.g(acrb.SCREENCAST_CONTROLLER_ENABLE_MIC_BUTTON);
        acdnVar.g(acrb.SCREENCAST_CONTROLLER_DISABLE_MIC_BUTTON);
        acdnVar.o.I(3, new acqx(booleanExtra4 ? acrb.SCREENCAST_CONTROLLER_ENABLE_MIC_BUTTON : acrb.SCREENCAST_CONTROLLER_DISABLE_MIC_BUTTON), null);
        acdnVar.H = booleanExtra5;
        acdnVar.n(booleanExtra5);
        acdnVar.k.setVisibility(0);
        acdnVar.k.setOnClickListener(new acdc(acdnVar, 10));
        acdnVar.q(false);
        acdnVar.l.setOnClickListener(new acdc(acdnVar, 2));
        acdnVar.l.setEnabled(true);
        acdnVar.d();
        acdnVar.g(acrb.SCREENCAST_CONTROLLER_PAUSE_STREAM_BUTTON);
        acdnVar.g(acrb.SCREENCAST_CONTROLLER_RESUME_STREAM_BUTTON);
        acdnVar.s.setVisibility(0);
        acdnVar.s.setOnSeekBarChangeListener(new acde(acdnVar));
        SeekBar seekBar = acdnVar.s;
        seekBar.setProgress(seekBar.getMax());
        acdnVar.k();
        acdnVar.n.setOnClickListener(new acdc(acdnVar, i5));
        acdnVar.r.setOnClickListener(new acdc(acdnVar, 4));
        acdnVar.b.setVisibility(8);
        acdnVar.a();
        acdn acdnVar2 = acdyVar.c;
        acdnVar2.z = acdyVar;
        acdnVar2.A = acdyVar;
        acdnVar2.B = acdyVar;
        acdnVar2.C = acdyVar;
        acei aceiVar3 = acdyVar.b;
        WindowManager.LayoutParams ct = adyu.ct();
        ct.flags |= 256;
        ct.x = 0;
        ct.y = 0;
        aceiVar3.r = ct.gravity;
        aceiVar3.g.addView(aceiVar3.a, ct);
        aceiVar3.h(aceiVar3.h);
        aceiVar3.b();
        acdyVar.i = 2;
        if (acdy.n(2) && acdyVar.i != 3) {
            acdyVar.e();
            acdyVar.b.b();
            if (!acdyVar.j.a.getBoolean("PREFS_SELF_VIEW_WINDOW_TOOLTIP_SEEN", false)) {
                final acei aceiVar4 = acdyVar.b;
                String string = acdyVar.a.getString(R.string.tap_to_toggle_toolbar_tooltip);
                if (aceiVar4.m == null) {
                    aceiVar4.m = new FrameLayout(aceiVar4.f);
                }
                if (aceiVar4.n == null) {
                    aceiVar4.n = new View(aceiVar4.f);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(1, 1);
                    layoutParams.gravity = 81;
                    aceiVar4.n.setLayoutParams(layoutParams);
                    aceiVar4.m.addView(aceiVar4.n);
                }
                if (aceiVar4.m.getParent() == null) {
                    WindowManager.LayoutParams ct2 = adyu.ct();
                    ct2.flags |= 256;
                    ct2.x = 0;
                    ct2.y = 0;
                    aceiVar4.g.addView(aceiVar4.m, ct2);
                }
                aceiVar4.m();
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(aceiVar4.f, R.style.Themed_YouTube_LiveChat_Dark);
                YouTubeTextView youTubeTextView = new YouTubeTextView(contextThemeWrapper);
                youTubeTextView.setText(string);
                youTubeTextView.setTextColor(wbs.Q(contextThemeWrapper, R.attr.liveChatTooltipTextColor));
                youTubeTextView.setTextAppearance(contextThemeWrapper, R.attr.ytTextAppearanceBody1a);
                akcv akcvVar = new akcv(youTubeTextView, aceiVar4.n, 1, 2);
                akcvVar.f(new akcs() { // from class: acdz
                    @Override // defpackage.akcs
                    public final void a(int i6) {
                        acei aceiVar5 = acei.this;
                        aceiVar5.g.removeView(aceiVar5.m);
                    }
                });
                aceiVar4.n.getViewTreeObserver().addOnGlobalLayoutListener(new aceb(aceiVar4, akcvVar));
                aceiVar4.n.requestLayout();
            }
            acdyVar.c.i();
            acdyVar.c.r();
            acdyVar.f();
            acdyVar.i = 3;
        }
        this.e.b(this.d.a());
        this.e.d(new abrk() { // from class: accm
            @Override // defpackage.abrk
            public final void a() {
                acay acayVar;
                final ScreencastHostService screencastHostService = ScreencastHostService.this;
                int i6 = width;
                int i7 = height;
                Intent intent3 = intent2;
                Context applicationContext = screencastHostService.getApplicationContext();
                abqu a2 = screencastHostService.e.a();
                int i8 = acay.g;
                if (i6 <= 0 || i7 <= 0) {
                    Log.e("VirtualDisplaySource", "Invalid size for virtual display");
                } else {
                    try {
                        acayVar = new acay((DisplayManager) applicationContext.getSystemService("display"), (MediaProjectionManager) applicationContext.getSystemService("media_projection"), intent3, a2, i6, i7);
                    } catch (Exception e) {
                        Log.e("VirtualDisplaySource", "Could not create virtual display video source", e);
                    }
                    screencastHostService.o = acayVar;
                    acay acayVar2 = screencastHostService.o;
                    acayVar2.getClass();
                    acayVar2.f();
                    abwy abwyVar = screencastHostService.n;
                    acay acayVar3 = screencastHostService.o;
                    abwyVar.v = acayVar3;
                    acayVar3.c(new acao() { // from class: accd
                        @Override // defpackage.acao
                        public final void f(acap acapVar) {
                            ScreencastHostService.this.e.g();
                        }
                    }, null);
                    screencastHostService.e.i(screencastHostService.o);
                    screencastHostService.e.j();
                }
                acayVar = null;
                screencastHostService.o = acayVar;
                acay acayVar22 = screencastHostService.o;
                acayVar22.getClass();
                acayVar22.f();
                abwy abwyVar2 = screencastHostService.n;
                acay acayVar32 = screencastHostService.o;
                abwyVar2.v = acayVar32;
                acayVar32.c(new acao() { // from class: accd
                    @Override // defpackage.acao
                    public final void f(acap acapVar) {
                        ScreencastHostService.this.e.g();
                    }
                }, null);
                screencastHostService.e.i(screencastHostService.o);
                screencastHostService.e.j();
            }
        }, true);
        this.b.d(acsb.b(13768), null, null);
        this.p = new acby(new acco(this), new acco(this), this.r.i().K, this.r.g(), new acco(this, null), null, null);
        accp accpVar = new accp(this, booleanExtra);
        abvt b = abvt.b();
        b.f(asru.class, accp.class, accpVar);
        b.j(asru.class, t);
        return 2;
    }

    @Override // defpackage.abwu
    public final void q(int i) {
    }

    @Override // defpackage.abwu
    public final void s(int i, final String str, final String str2, final atgf atgfVar) {
        this.A = atgfVar;
        o(new zfi() { // from class: acck
            @Override // defpackage.zfi
            public final void a(Object obj) {
                String str3 = str;
                String str4 = str2;
                atgf atgfVar2 = atgfVar;
                StreamConfig streamConfig = (StreamConfig) obj;
                int i2 = ScreencastHostService.s;
                streamConfig.u = str3;
                streamConfig.v = str4;
                streamConfig.j = atgfVar2;
            }
        });
        if (acdy.m(this.m)) {
            this.m.l(atgfVar);
        }
    }

    @Override // defpackage.abwu
    public final void t() {
        o(zxq.e);
    }

    @Override // defpackage.abwu
    public final void u(int i, atfw atfwVar, String str, aqyg aqygVar, boolean z) {
        if (this.x) {
            return;
        }
        this.m.d();
        B();
        startActivity(adyu.cs(getApplicationContext(), i, atfwVar, str, aqygVar, z));
        acby acbyVar = this.p;
        acbyVar.a();
        if (!acbyVar.d) {
            acbyVar.h.b("SUCCESS");
        }
        this.x = true;
    }

    @Override // defpackage.abwu
    public final void v() {
        this.p.c = true;
    }

    @Override // defpackage.abwu
    public final void w() {
        if (acdy.m(this.m)) {
            acdy acdyVar = this.m;
            if (acdyVar.i == 5) {
                acdyVar.c.l.setEnabled(true);
            }
        }
    }

    @Override // defpackage.abwu
    public final void x(final long j) {
        this.l = true;
        o(new zfi() { // from class: accj
            @Override // defpackage.zfi
            public final void a(Object obj) {
                int i = ScreencastHostService.s;
                ((StreamConfig) obj).l = j;
            }
        });
        if (acdy.m(this.m)) {
            this.m.c();
        }
        C();
        this.p.c();
    }

    @Override // defpackage.abwu
    public final void y(boolean z) {
        this.u = true;
    }

    @Override // defpackage.abwu
    public final void z() {
    }
}
