package com.google.android.libraries.youtube.livecreation.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.media.MediaActionSound;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.livecreation.ui.view.CameraStreamViewManager$CameraModelData;
import com.google.android.libraries.youtube.livecreation.ui.view.ViewportOverlay;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveCreationEndpointOuterClass$LiveCreationEndpoint;
import com.google.protos.youtube.api.innertube.VideoManagerEndpointOuterClass$VideoManagerEndpoint;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.aahg;
import defpackage.aaq;
import defpackage.aard;
import defpackage.aayh;
import defpackage.abde;
import defpackage.abqk;
import defpackage.abqo;
import defpackage.abqs;
import defpackage.abqt;
import defpackage.abqv;
import defpackage.abrd;
import defpackage.abrn;
import defpackage.abrs;
import defpackage.abru;
import defpackage.abrx;
import defpackage.abse;
import defpackage.abux;
import defpackage.abuy;
import defpackage.abvb;
import defpackage.abvc;
import defpackage.abvl;
import defpackage.abvs;
import defpackage.abvt;
import defpackage.abwy;
import defpackage.abxd;
import defpackage.abxq;
import defpackage.abxx;
import defpackage.abxy;
import defpackage.abya;
import defpackage.acel;
import defpackage.aceo;
import defpackage.acep;
import defpackage.aceq;
import defpackage.aces;
import defpackage.acew;
import defpackage.acex;
import defpackage.acey;
import defpackage.acez;
import defpackage.acfa;
import defpackage.acfc;
import defpackage.acfd;
import defpackage.acfe;
import defpackage.acff;
import defpackage.acfg;
import defpackage.acfk;
import defpackage.acfm;
import defpackage.acfu;
import defpackage.acge;
import defpackage.acgf;
import defpackage.acgg;
import defpackage.acgl;
import defpackage.acgm;
import defpackage.acgo;
import defpackage.acgp;
import defpackage.acgq;
import defpackage.achy;
import defpackage.acif;
import defpackage.acih;
import defpackage.acip;
import defpackage.aciq;
import defpackage.acir;
import defpackage.acis;
import defpackage.aciu;
import defpackage.acjk;
import defpackage.acjl;
import defpackage.acjm;
import defpackage.acjn;
import defpackage.acjq;
import defpackage.acjr;
import defpackage.ackx;
import defpackage.acky;
import defpackage.ackz;
import defpackage.acld;
import defpackage.acle;
import defpackage.acpl;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acra;
import defpackage.acsb;
import defpackage.acsg;
import defpackage.adyu;
import defpackage.afsx;
import defpackage.afsy;
import defpackage.aftn;
import defpackage.afwx;
import defpackage.agcm;
import defpackage.ahbl;
import defpackage.ajcq;
import defpackage.akai;
import defpackage.akal;
import defpackage.akam;
import defpackage.akap;
import defpackage.akaq;
import defpackage.akar;
import defpackage.akvo;
import defpackage.akvq;
import defpackage.akzv;
import defpackage.akzw;
import defpackage.amkq;
import defpackage.anaf;
import defpackage.anfy;
import defpackage.angq;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aong;
import defpackage.aonm;
import defpackage.aoob;
import defpackage.aosc;
import defpackage.apmg;
import defpackage.apmh;
import defpackage.apxf;
import defpackage.aqdt;
import defpackage.aqrf;
import defpackage.aqyg;
import defpackage.aqzu;
import defpackage.arfd;
import defpackage.arnn;
import defpackage.arno;
import defpackage.arqx;
import defpackage.arux;
import defpackage.aruy;
import defpackage.arvs;
import defpackage.ascq;
import defpackage.asru;
import defpackage.asrz;
import defpackage.assb;
import defpackage.assd;
import defpackage.assu;
import defpackage.astj;
import defpackage.aszm;
import defpackage.atdw;
import defpackage.atdx;
import defpackage.atey;
import defpackage.atfw;
import defpackage.atgf;
import defpackage.atvc;
import defpackage.atvd;
import defpackage.aulq;
import defpackage.auov;
import defpackage.auoy;
import defpackage.avec;
import defpackage.aved;
import defpackage.avuj;
import defpackage.avxs;
import defpackage.axpg;
import defpackage.axze;
import defpackage.ce;
import defpackage.cnq;
import defpackage.dd;
import defpackage.dn;
import defpackage.fjv;
import defpackage.fnz;
import defpackage.omm;
import defpackage.shf;
import defpackage.vgz;
import defpackage.waf;
import defpackage.wan;
import defpackage.war;
import defpackage.wcy;
import defpackage.wdm;
import defpackage.wgs;
import defpackage.whu;
import defpackage.wjb;
import defpackage.wls;
import defpackage.wlt;
import defpackage.wlu;
import defpackage.wlx;
import defpackage.yjk;
import defpackage.ynm;
import defpackage.yny;
import defpackage.ypa;
import defpackage.zar;
import defpackage.zas;
import defpackage.zev;
import defpackage.zga;
import defpackage.zhq;
import defpackage.zok;
import defpackage.ztl;
import defpackage.zto;
import defpackage.zvk;
import defpackage.zxo;
import defpackage.zxq;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LiveCreationActivity extends acel implements acjk, acip, abxy, acjm, wlx, acih, acge, acgl, acis, acgp, akaq, war, acqz, zar, aayh, abvb, abux, acjq, abvl, afwx {
    public SharedPreferences A;
    public akai B;
    public StreamConfig C;
    public dd D;
    public aciq E;
    public acjl F;
    public acgf G;
    public akar H;
    public ViewportOverlay I;

    /* renamed from: J, reason: collision with root package name */
    public acgm f176J;
    public String K;
    public zxo L;
    public boolean M;
    public acle N;
    public boolean O;
    public boolean P;
    public akap V;
    public abrn W;
    public vgz X;
    public abde Y;
    public agcm Z;
    private boolean aB;
    private assu aC;
    private assu aD;
    public axze aa;
    private DisplayManager.DisplayListener ab;
    private zas ac;
    private wlt ad;
    private Parcel ae;
    private aciu af;
    private acir ag;
    private acjl ah;
    private acjr ai;
    private wlu aj;
    private acgg ak;
    private acgf al;
    private acgq am;
    private acjn an;
    private acif ao;
    private SurfaceView ap;
    private akam aq;
    private String ar;
    private String as;
    private boolean at;
    private boolean au;
    private boolean av;
    private int aw;
    private boolean ax;
    private int ay;
    private String az;
    public Handler f;
    public Executor g;
    public ypa h;
    public acfk i;
    public acfg j;
    public afsy k;
    public aftn l;
    public acra m;
    public waf n;
    public wan o;
    public wdm p;
    public abya q;
    public shf r;
    public Choreographer s;
    public DisplayManager t;
    public ScheduledExecutorService u;
    public acpl v;
    public axpg w;
    public zto x;
    public akvq z;
    private static final PermissionDescriptor a = new PermissionDescriptor(0, acsb.c(43000), acsb.c(43001));
    public static final PermissionDescriptor[] c = {new PermissionDescriptor(1, acsb.c(29216), acsb.c(29218)), new PermissionDescriptor(2, acsb.c(29217), acsb.c(29219))};
    private static final long b = TimeUnit.MILLISECONDS.convert(15, TimeUnit.MINUTES);
    public static final long d = TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES);
    public static final abxx e = new acex();
    private boolean aA = false;
    public final List Q = new ArrayList();
    public final Handler R = new Handler();
    final acfe S = new acfe(this);
    public final Runnable T = new acep(this, 5, null);
    final Choreographer.FrameCallback U = new acew(this);

    private final int aR() {
        if (this.aa.m()) {
            aosc a2 = this.Z.a();
            if (a2 == null) {
                return 0;
            }
            return a2.g;
        }
        return this.A.getInt("SHARED_PREF_PORTRAIT_COUNT_KEY", 0);
    }

    private final abxd aS() {
        acif acifVar = this.ao;
        if (acifVar != null) {
            return acifVar.ax;
        }
        return null;
    }

    private final void aT(View view) {
        String q = q();
        if (q != null) {
            zev.c(this, view, q);
        }
    }

    private final void aU() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.lc_fade_in_fullscreen);
        loadAnimation.setAnimationListener(new acey(this));
        this.I.startAnimation(loadAnimation);
    }

    private final void aV() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.lc_fade_out_fullscreen);
        loadAnimation.setAnimationListener(new acez(this));
        this.I.startAnimation(loadAnimation);
    }

    private final void aW() {
        acjl acjlVar = this.F;
        if (acjlVar == null || acjlVar.O == null) {
            return;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.F.O.getWindowToken(), 2);
    }

    private final void aX() {
        if (acfm.b(this.F)) {
            this.F.aG();
        }
    }

    private final void aY() {
        if (this.G != null) {
            dn k = this.D.k();
            k.m(this.G);
            k.a();
            this.G = null;
        }
        if (this.al != null) {
            dn k2 = this.D.k();
            k2.m(this.al);
            k2.a();
            this.al = null;
        }
    }

    private final void aZ() {
        startActivityForResult(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent(), 1000);
    }

    public static void an(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.android.chrome");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(intent.setComponent(null));
        }
    }

    private final void ba(String str) {
        ynm.n(this, this.Z.a.b(new wgs(str, 12), angq.a), zxq.g, zxq.k);
    }

    private final void bb() {
        StreamConfig streamConfig = this.C;
        if (streamConfig.a || TextUtils.isEmpty(streamConfig.c)) {
            return;
        }
        final String b2 = this.C.b();
        if (TextUtils.isEmpty(b2)) {
            zga.b("Failed to save the live stream state.");
        } else if (this.aa.m()) {
            ba(b2);
        } else {
            this.g.execute(new Runnable() { // from class: acer
                @Override // java.lang.Runnable
                public final void run() {
                    LiveCreationActivity liveCreationActivity = LiveCreationActivity.this;
                    String str = b2;
                    SharedPreferences.Editor edit = liveCreationActivity.A.edit();
                    edit.putString("SHARED_PREF_STREAM_CONFIG_KEY", str);
                    edit.commit();
                }
            });
        }
    }

    private final void bc(atey ateyVar) {
        this.i.e();
        aY();
        acgf n = acgf.n(ateyVar, null, this.ay, this.aA, aR());
        this.al = n;
        aD(n, "CONFIRM_THUMBNAIL_FRAGMENT");
    }

    private final void bd(assu assuVar) {
        if (assuVar != null) {
            this.aC = assuVar;
            acgg acggVar = new acgg();
            aulq aulqVar = assuVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aqdt aqdtVar = (aqdt) aulqVar.pX(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
            Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", aqdtVar.toByteArray());
            acggVar.af(bundle);
            this.ak = acggVar;
            bj(acggVar, "COOL_OFF_FRAGMENT_NAME", true);
        }
    }

    private final void be(String str) {
        str.getClass();
        if (this.f176J == null) {
            this.f176J = new acgm();
        }
        acgm acgmVar = this.f176J;
        acgmVar.d = new abrx(this, this.r).b(str);
        if (acfm.b(acgmVar.c)) {
            acgmVar.q();
        }
        akam akamVar = new akam(akal.d(this), this.m, Arrays.asList(a), R.string.lc_permission_open_settings_storage_description, R.string.lc_permissions_missing_storage, new acep(this, 2), omm.j, this.B);
        this.aq = akamVar;
        akamVar.a();
    }

    private final void bf(acgo acgoVar, String str) {
        t();
        acgq acgqVar = new acgq();
        Bundle bundle = new Bundle();
        bundle.putSerializable("state", acgoVar);
        bundle.putString("message", str);
        acgqVar.af(bundle);
        this.am = acgqVar;
        dn k = this.D.k();
        k.u(R.id.error_fragment_container, this.am, "ERROR_STATE_FRAGMENT");
        aW();
        k.i = 4099;
        k.a();
        this.C.w = "ERROR_STATE_FRAGMENT";
    }

    private final void bg(atfw atfwVar, String str, aqyg aqygVar) {
        aciu aciuVar = this.af;
        if (aciuVar == null || !aciuVar.av()) {
            acgq acgqVar = this.am;
            if (acgqVar != null) {
                dn k = this.D.k();
                k.l(acgqVar);
                k.i = 4099;
                k.a();
            }
            aciu aciuVar2 = new aciu();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_ERROR_MESSAGE", str);
            if (aqygVar != null) {
                amkq.cn(bundle, "ARG_ERROR_MESSAGE_FORMATTED_STRING", aqygVar);
            }
            if (atfwVar != null) {
                amkq.cn(bundle, "ARG_ENDSCREEN_RENDERER", atfwVar);
            }
            aciuVar2.af(bundle);
            this.af = aciuVar2;
            dn k2 = this.D.k();
            acif acifVar = this.ao;
            if (acifVar != null) {
                k2.m(acifVar);
            }
            k2.q(R.id.stream_fragment_container, this.af, "POST_STREAM_FRAGMENT");
            k2.i = 4099;
            k2.s(null);
            k2.a();
            this.ao = null;
            this.C.w = "POST_STREAM_FRAGMENT";
            aU();
            this.N.e(true);
            if (aL()) {
                ao(this.U);
            }
        }
    }

    private final void bh(assu assuVar) {
        if (assuVar != null) {
            this.aD = assuVar;
            acjn acjnVar = new acjn();
            aulq aulqVar = assuVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aqdt aqdtVar = (aqdt) aulqVar.pX(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
            Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", aqdtVar.toByteArray());
            acjnVar.af(bundle);
            this.an = acjnVar;
            bj(acjnVar, "SAFEGUARD_FRAGMENT", true);
        }
    }

    private final void bi(boolean z) {
        this.al = null;
        acjr acjrVar = this.ai;
        if (acjrVar == null) {
            this.ai = new acjr();
        } else {
            acjrVar.r();
        }
        bj(this.ai, "SCHEDULED_EVENTS_FRAGMENT_NAME", z);
    }

    private final void bj(ce ceVar, String str, boolean z) {
        ce f = this.D.f(this.C.w);
        ceVar.getClass();
        zhq.m(str);
        dn k = this.D.k();
        if (f != null && f.ar() && !f.equals(ceVar)) {
            if (z) {
                k.m(f);
            } else {
                k.l(f);
            }
        }
        if (!ceVar.ar()) {
            k.q(R.id.stream_fragment_container, ceVar, str);
        } else if (ceVar.G) {
            k.n(ceVar);
        }
        k.i = 4099;
        k.a();
        this.C.w = str;
    }

    private static boolean bk(Intent intent) {
        return intent.hasExtra("statusCode") && intent.hasExtra("didStream");
    }

    private static final boolean bl(StreamMetadata streamMetadata) {
        Date date;
        return (streamMetadata == null || (date = streamMetadata.j) == null || date.getTime() <= 0) ? false : true;
    }

    private final void bm(final String str, String str2, int i) {
        akzv akzvVar;
        if (this.aB) {
            wjb wjbVar = wjb.STARTED;
            int i2 = i - 1;
            if (i2 == 1) {
                akzvVar = akzv.PUBLIC;
            } else if (i2 != 2) {
                akzvVar = akzv.PRIVATE;
            } else {
                akzvVar = akzv.UNLISTED;
            }
            aone createBuilder = akzw.a.createBuilder();
            String h = zhq.h(str2);
            createBuilder.copyOnWrite();
            akzw akzwVar = (akzw) createBuilder.instance;
            akzwVar.b = 1 | akzwVar.b;
            akzwVar.c = h;
            createBuilder.copyOnWrite();
            akzw akzwVar2 = (akzw) createBuilder.instance;
            akzwVar2.e = akzvVar.d;
            akzwVar2.b |= 4;
            final akzw akzwVar3 = (akzw) createBuilder.build();
            final akvq akvqVar = this.z;
            final afsx c2 = this.k.c();
            final String d2 = akvqVar.f.d();
            anaf.Y(anaf.T(new anfy() { // from class: akvl
                @Override // defpackage.anfy
                public final anhy a() {
                    akvq akvqVar2 = akvq.this;
                    String str3 = str;
                    afsx afsxVar = c2;
                    String str4 = d2;
                    akzw akzwVar4 = akzwVar3;
                    amkq.F(!str3.isEmpty(), "Invalid or empty passed Video ID.");
                    amkq.F(!afsxVar.z(), "Cannot use a signed-out identity.");
                    String.valueOf(str4).length();
                    String.valueOf(str3).length();
                    Iterator it = akvqVar2.g.c().values().iterator();
                    while (it.hasNext()) {
                        if (str3.equals(((akzs) it.next()).Y)) {
                            throw new IllegalArgumentException("Attempted to add a new FeedbackOnlyUpload with a non-unique videoId.");
                        }
                    }
                    aone createBuilder2 = akzs.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar = (akzs) createBuilder2.instance;
                    str3.getClass();
                    akzsVar.c |= 524288;
                    akzsVar.Y = str3;
                    createBuilder2.copyOnWrite();
                    akzs akzsVar2 = (akzs) createBuilder2.instance;
                    str4.getClass();
                    akzsVar2.b |= 64;
                    akzsVar2.k = str4;
                    createBuilder2.copyOnWrite();
                    akzs akzsVar3 = (akzs) createBuilder2.instance;
                    akzwVar4.getClass();
                    akzsVar3.i = akzwVar4;
                    akzsVar3.b |= 16;
                    String d3 = afsxVar.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar4 = (akzs) createBuilder2.instance;
                    akzsVar4.b |= 1;
                    akzsVar4.e = d3;
                    long c3 = akvqVar2.b.c();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar5 = (akzs) createBuilder2.instance;
                    akzsVar5.b |= 8;
                    akzsVar5.h = c3;
                    akzq akzqVar = akzq.FEEDBACK_ONLY_UPLOAD;
                    createBuilder2.copyOnWrite();
                    akzs akzsVar6 = (akzs) createBuilder2.instance;
                    akzsVar6.l = akzqVar.g;
                    akzsVar6.b |= 128;
                    akzp d4 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar7 = (akzs) createBuilder2.instance;
                    d4.getClass();
                    akzsVar7.aj = d4;
                    akzsVar7.c |= 1073741824;
                    akzp d5 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar8 = (akzs) createBuilder2.instance;
                    d5.getClass();
                    akzsVar8.M = d5;
                    akzsVar8.c |= 1024;
                    akzp d6 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar9 = (akzs) createBuilder2.instance;
                    d6.getClass();
                    akzsVar9.y = d6;
                    akzsVar9.b |= 67108864;
                    akzp d7 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar10 = (akzs) createBuilder2.instance;
                    d7.getClass();
                    akzsVar10.f65J = d7;
                    akzsVar10.c |= 128;
                    akzp d8 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar11 = (akzs) createBuilder2.instance;
                    d8.getClass();
                    akzsVar11.ac = d8;
                    akzsVar11.c |= 8388608;
                    akzp d9 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar12 = (akzs) createBuilder2.instance;
                    d9.getClass();
                    akzsVar12.ad = d9;
                    akzsVar12.c |= 16777216;
                    akzp d10 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar13 = (akzs) createBuilder2.instance;
                    d10.getClass();
                    akzsVar13.an = d10;
                    akzsVar13.d |= 4;
                    akzp d11 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar14 = (akzs) createBuilder2.instance;
                    d11.getClass();
                    akzsVar14.ao = d11;
                    akzsVar14.d |= 8;
                    akzp d12 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar15 = (akzs) createBuilder2.instance;
                    d12.getClass();
                    akzsVar15.ak = d12;
                    akzsVar15.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                    akzp d13 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar16 = (akzs) createBuilder2.instance;
                    d13.getClass();
                    akzsVar16.N = d13;
                    akzsVar16.c |= 2048;
                    akzp d14 = akvqVar2.m.d();
                    createBuilder2.copyOnWrite();
                    akzs akzsVar17 = (akzs) createBuilder2.instance;
                    d14.getClass();
                    akzsVar17.ai = d14;
                    akzsVar17.c |= 536870912;
                    createBuilder2.copyOnWrite();
                    akzs.a((akzs) createBuilder2.instance);
                    createBuilder2.copyOnWrite();
                    akzs akzsVar18 = (akzs) createBuilder2.instance;
                    akzsVar18.b |= 2097152;
                    akzsVar18.t = false;
                    akvq.e(str4, createBuilder2);
                    List b2 = akvq.b(akvqVar2.a);
                    createBuilder2.copyOnWrite();
                    akzs akzsVar19 = (akzs) createBuilder2.instance;
                    akzsVar19.s = 1;
                    akzsVar19.b |= 131072;
                    b2.add(avtm.UPLOAD_FEATURE_REUSE_OPEN_SOURCE_VIDEO);
                    akzs akzsVar20 = (akzs) createBuilder2.build();
                    akvqVar2.g.h(str4, akzsVar20);
                    akvqVar2.i.j(str4, afsxVar.d(), avtn.UPLOAD_FLOW_SOURCE_UNKNOWN, 5, false, (avtm[]) b2.toArray(new avtm[0]));
                    akvqVar2.j.b(str4);
                    akvqVar2.k.i(str4, akzsVar20);
                    ((akze) akvqVar2.l.get()).B(akzi.a(str4).a());
                    return anaf.O(akzsVar20);
                }
            }, akvqVar.c), new akvo(akvqVar, d2, c2, 0), angq.a);
        }
    }

    @Override // defpackage.acjm
    public final void A() {
        finish();
    }

    @Override // defpackage.acjk
    public final void B(assu assuVar) {
        bd(assuVar);
    }

    @Override // defpackage.acgl
    public final void C(Bitmap bitmap) {
        acgf acgfVar = this.al;
        if (acgfVar != null) {
            acgfVar.aJ(bitmap);
            this.al.aG();
            bj(this.al, "CONFIRM_THUMBNAIL_FRAGMENT", true);
            return;
        }
        acgf acgfVar2 = this.G;
        if (acgfVar2 != null) {
            acgfVar2.aJ(bitmap);
            this.G.aG();
            bj(this.G, "CHOOSE_THUMBNAIL_FRAGMENT", true);
            return;
        }
        finish();
    }

    @Override // defpackage.acge
    public final void D(arqx arqxVar) {
        if (this.al == null) {
            ax();
            return;
        }
        int i = this.ay;
        acjl acjlVar = new acjl();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_CAMERA_COUNT", i);
        bundle.putParcelable("ARG_GET_BROADCAST_RESPONSE", new ParcelableMessageLite(arqxVar));
        acjlVar.af(bundle);
        this.ah = acjlVar;
        aD(acjlVar, "EDIT_SETTINGS_PRE_STREAM_FRAGMENT");
    }

    @Override // defpackage.acge
    public final void E(String str) {
        be(str);
    }

    @Override // defpackage.acgp
    public final void F() {
        finish();
    }

    @Override // defpackage.acjk
    public final void G(atey ateyVar) {
        acgf acgfVar = this.al;
        acgfVar.getClass();
        this.aA = ateyVar.q != acgfVar.aS();
        bc(ateyVar);
    }

    @Override // defpackage.acjm
    public final void H() {
        aw();
    }

    @Override // defpackage.acjk
    public final void I(atey ateyVar) {
        this.C.i = ateyVar;
        abvt.b().h = ateyVar.q;
    }

    @Override // defpackage.acih
    public final void J(int i, String str, String str2, atgf atgfVar) {
        StreamConfig streamConfig = this.C;
        streamConfig.x = i;
        streamConfig.u = str;
        streamConfig.v = str2;
        streamConfig.j = atgfVar;
    }

    @Override // defpackage.acih
    public final void K(int i, atfw atfwVar, String str, aqyg aqygVar, boolean z) {
        avuj avujVar;
        String.valueOf(str).length();
        setRequestedOrientation(-1);
        ViewGroup.LayoutParams layoutParams = this.ap.getLayoutParams();
        if (layoutParams.height != -1 && layoutParams.width != -1) {
            yny.z(this.ap, yny.y(-1, -1), ViewGroup.LayoutParams.class);
        }
        aI("off");
        int i2 = 2;
        int i3 = 0;
        if (i == 0 || i == 26 || i == 31) {
            if (z) {
                this.i.f();
                if (i != 26 || atfwVar != null || str != null || aqygVar != null) {
                    arfd a2 = this.aa.a.a();
                    if (a2 != null) {
                        avujVar = a2.h;
                        if (avujVar == null) {
                            avujVar = avuj.a;
                        }
                    } else {
                        avujVar = avuj.a;
                    }
                    if (avujVar.c) {
                        if (atfwVar == null) {
                            aone createBuilder = arux.a.createBuilder();
                            String str2 = this.C.c;
                            createBuilder.copyOnWrite();
                            arux aruxVar = (arux) createBuilder.instance;
                            str2.getClass();
                            aruxVar.b = 2 | aruxVar.b;
                            aruxVar.d = str2;
                            this.Y.a(createBuilder, this, null);
                        } else {
                            StreamConfig streamConfig = this.C;
                            String str3 = streamConfig.c;
                            String str4 = streamConfig.d.a;
                            int bu = anaf.bu(atfwVar.f);
                            if (bu == 0) {
                                bu = 1;
                            }
                            bm(str3, str4, bu);
                        }
                    }
                    bg(atfwVar, str, aqygVar);
                } else {
                    finish();
                    return;
                }
            } else {
                finish();
                if (this.C.d != null && Boolean.TRUE.equals(this.C.d.f)) {
                    startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
                }
            }
        } else if (i == 33) {
            this.i.f();
            bg(atfwVar, str, aqygVar);
        } else if (i == 21) {
            bf(acgo.CUSTOM_MESSAGE, getString(R.string.lc_error_state_account_not_enabled));
        } else if (i == 22) {
            acjl acjlVar = this.F;
            if (acjlVar != null) {
                aD(acjlVar, "PRE_STREAM_FRAGMENT");
            }
            new AlertDialog.Builder(this).setTitle(R.string.lc_live_streaming_error).setMessage(R.string.lc_live_streaming_account_blocked).setPositiveButton(R.string.lc_live_streaming_account_blocked_more_info, new aces(this, i3)).setNegativeButton(R.string.lc_live_streaming_not_enabled_no, new aces(this, i2)).setCancelable(false).show();
        } else {
            if (TextUtils.isEmpty(str)) {
                str = getString(R.string.lc_live_streaming_error);
            }
            if (z) {
                bg(null, str, aqygVar);
            } else {
                bf(acgo.CUSTOM_MESSAGE, str);
            }
        }
        this.R.removeCallbacks(this.T);
        s(false);
    }

    @Override // defpackage.acih
    public final void L() {
        this.N.e(true);
        aU();
    }

    @Override // defpackage.acih
    public final void M(boolean z) {
        this.C.o = z;
    }

    @Override // defpackage.acih
    public final void N(boolean z) {
        this.N.e(z);
        if (z) {
            aU();
        } else {
            aV();
        }
    }

    @Override // defpackage.acih
    public final void O() {
        this.N.e(false);
        aV();
        zas zasVar = this.ac;
        if (zasVar != null) {
            zasVar.enable();
        }
        if (acfm.c(this)) {
            this.N.f(getWindowManager().getDefaultDisplay().getRotation());
        }
    }

    @Override // defpackage.acih
    public final void P(long j) {
        int aR;
        StreamConfig streamConfig = this.C;
        streamConfig.l = j;
        if (streamConfig.p && (aR = aR() + 1) <= this.aa.h()) {
            if (this.aa.m()) {
                ynm.n(this, this.Z.a.b(new fnz(aR, 6), angq.a), zxq.f, zxq.j);
            } else {
                this.g.execute(new aceq(this, aR, 1));
            }
        }
        bb();
    }

    @Override // defpackage.acih
    public final void Q(View view) {
        this.N.c();
        aT(view);
    }

    @Override // defpackage.acih
    public final void R(abrd abrdVar) {
        acle acleVar = this.N;
        if (acleVar.i == null) {
            abrdVar.getClass();
            acleVar.i = abrdVar;
            abrd abrdVar2 = acleVar.i;
            boolean z = false;
            if (!acleVar.b && acleVar.o) {
                z = true;
            }
            abrdVar2.a = z;
            acleVar.d.b(abrdVar2);
            return;
        }
        zga.m("CameraStreamViewManager", "Pipeline render target already set.");
    }

    @Override // defpackage.acis
    public final void S(apxf apxfVar) {
        if (apxfVar == null || apxfVar.pY(VideoManagerEndpointOuterClass$VideoManagerEndpoint.videoManagerEndpoint)) {
            apxfVar = this.m.h(aahg.a("FEmy_videos"));
        }
        aahc.a(this.j, apxfVar);
        finish();
    }

    @Override // defpackage.acip
    public final void T() {
        finish();
    }

    @Override // defpackage.acip
    public final void U(View view) {
        this.N.c();
        aT(view);
        aciq aciqVar = this.E;
        if (aciqVar != null) {
            aciqVar.an = q();
            if (aciqVar.am == null || TextUtils.isEmpty(aciqVar.an)) {
                return;
            }
            aciqVar.am.setContentDescription(aciqVar.an);
        }
    }

    @Override // defpackage.acjk
    public final void V() {
        acjl acjlVar = this.ah;
        if (acjlVar == null || !acjlVar.av()) {
            if (!TextUtils.isEmpty(this.C.c)) {
                if (!bl(this.C.d)) {
                    acfd acfdVar = new acfd(this);
                    new AlertDialog.Builder(this).setMessage(R.string.lc_confirm_abandon_streaming).setPositiveButton(android.R.string.ok, acfdVar).setNegativeButton(android.R.string.cancel, acfdVar).setOnCancelListener(acfdVar).show();
                    return;
                } else {
                    this.C.a = true;
                    s(false);
                    finish();
                    return;
                }
            }
            finish();
            return;
        }
        acgf acgfVar = this.al;
        acgfVar.getClass();
        y(acgfVar.aS());
        aD(this.al, "CONFIRM_THUMBNAIL_FRAGMENT");
        if (this.al.at()) {
            this.al.Z();
        }
    }

    @Override // defpackage.acjk
    public final void W(StreamMetadata streamMetadata) {
        StreamConfig streamConfig = this.C;
        StreamMetadata streamMetadata2 = streamConfig.d;
        if (streamMetadata2 == null) {
            streamConfig.d = streamMetadata;
        } else {
            String str = streamMetadata.a;
            if (str != null) {
                streamMetadata2.a = str;
            }
            String str2 = streamMetadata.b;
            if (str2 != null) {
                streamMetadata2.b = str2;
            }
            Boolean bool = streamMetadata.c;
            if (bool != null) {
                streamMetadata2.c = bool;
            }
            Boolean bool2 = streamMetadata.d;
            if (bool2 != null) {
                streamMetadata2.d = bool2;
            }
            Boolean bool3 = streamMetadata.e;
            if (bool3 != null) {
                streamMetadata2.e = bool3;
            }
            int i = streamMetadata.l;
            if (i != 0) {
                streamMetadata2.l = i;
            }
            Boolean bool4 = streamMetadata.f;
            if (bool4 != null) {
                streamMetadata2.f = bool4;
            }
            arnn arnnVar = streamMetadata.g;
            if (arnnVar != null) {
                streamMetadata2.g = arnnVar;
            }
            arno arnoVar = streamMetadata.h;
            if (arnoVar != null) {
                streamMetadata2.h = arnoVar;
            }
            int i2 = streamMetadata.m;
            if (i2 != 0) {
                streamMetadata2.m = i2;
            }
            Place place = streamMetadata.i;
            if (place != null) {
                streamMetadata2.i = place;
            }
            Date date = streamMetadata.j;
            if (date != null) {
                streamMetadata2.j = date;
            }
            aqzu aqzuVar = streamMetadata.k;
            if (aqzuVar != null) {
                streamMetadata2.k = aqzuVar;
            }
        }
        this.i.e();
        if (this.G != null) {
            Boolean bool5 = streamMetadata.f;
            this.aA = (bool5 != null && bool5.booleanValue()) != this.G.aS();
        }
        au();
    }

    @Override // defpackage.acjk
    public final void X() {
        waf wafVar = this.n;
        if (!wafVar.b.t()) {
            wafVar.a.b();
            return;
        }
        wan wanVar = wafVar.a;
        aone createBuilder = ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint = (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint) createBuilder.instance;
        channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.d = 5;
        channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.b |= 2;
        ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint2 = (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint2);
        wanVar.k((apxf) aongVar.build());
    }

    @Override // defpackage.acjk
    public final void Y(atvc atvcVar) {
        boolean aa = yjk.aa(this);
        wlu g = wcy.g(atvcVar, aa);
        this.aj = g;
        if (aa) {
            dn k = this.D.k();
            k.r(this.aj, "LIVE_ENABLEMENT_FRAGMENT_NAME");
            k.i = 4099;
            k.d();
            this.C.w = "LIVE_ENABLEMENT_FRAGMENT_NAME";
        } else {
            aD(g, "LIVE_ENABLEMENT_FRAGMENT_NAME");
        }
        if (atvcVar.g.size() > 0) {
            this.D.aa();
            aqdt aqdtVar = ((atvd) atvcVar.g.get(0)).b;
            if (aqdtVar == null) {
                aqdtVar = aqdt.a;
            }
            ay(aqdtVar);
        }
    }

    @Override // defpackage.acjk
    public final void Z() {
        bi(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aB() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity.aB():void");
    }

    public final void aC() {
        if (this.ax) {
            this.W.k();
            acle acleVar = this.N;
            yjk.f();
            acleVar.f.f();
            if (!acleVar.a) {
                abru abruVar = acleVar.g;
                if (abruVar != null) {
                    abruVar.e();
                }
                acleVar.d.e(new ackx(acleVar.j));
            }
            abse abseVar = acleVar.m;
            if (abseVar != null) {
                abseVar.d();
            }
            this.ap.setVisibility(4);
            this.ax = false;
        }
    }

    public final void aD(ce ceVar, String str) {
        bj(ceVar, str, false);
    }

    @Override // defpackage.acge
    public final void aE() {
        acgf acgfVar = this.al;
        if (acgfVar == null || !acgfVar.av()) {
            ax();
        } else {
            this.al = null;
            bi(true);
        }
    }

    @Override // defpackage.acge
    public final void aF() {
        this.I.a(null);
        acfk acfkVar = this.i;
        acfkVar.b = true;
        acfkVar.g();
    }

    @Override // defpackage.acge
    public final void aG(View view) {
        this.N.c();
        aT(view);
        acgf acgfVar = this.G;
        if (acgfVar == null || !acgfVar.av()) {
            acgf acgfVar2 = this.al;
            if (acgfVar2 == null || !acgfVar2.av()) {
                return;
            }
            this.al.aM(q());
            return;
        }
        this.G.aM(q());
    }

    public final void aH() {
        if (!this.M || acfm.c(this)) {
            this.N.f(getWindowManager().getDefaultDisplay().getRotation());
            if (TextUtils.isEmpty(this.C.u) && TextUtils.isEmpty(this.C.v)) {
                int i = getResources().getConfiguration().orientation;
                this.C.p = i == 1;
            }
        }
    }

    @Override // defpackage.acih
    public final boolean aI(String str) {
        acle acleVar = this.N;
        yjk.f();
        return acleVar.f.l(str);
    }

    @Override // defpackage.akaq
    public final void aJ() {
        finish();
    }

    @Override // defpackage.akaq
    public final void aK() {
        this.P = false;
        this.f.post(new acep(this, 0));
    }

    public final boolean aL() {
        return this.i.d && this.aB;
    }

    @Override // defpackage.acih
    public final void aM(float f, float f2, achy achyVar) {
        acle acleVar = this.N;
        yjk.f();
        acleVar.f.m(f, f2, acleVar.n.c, achyVar);
    }

    @Override // defpackage.acge
    public final boolean aN(int i, int i2, int i3, acfu acfuVar) {
        int i4;
        boolean z;
        if (!this.N.f.b) {
            ((MediaActionSound) ((zok) this.w.get()).a.get()).play(0);
        }
        acle acleVar = this.N;
        aceo aceoVar = new aceo(acfuVar);
        yjk.f();
        View decorView = acleVar.c.getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int i5 = acleVar.f.d;
        int width = (rect.width() * i5) / rect.height();
        if (acleVar.b || !acleVar.o) {
            i4 = i;
            z = false;
        } else {
            i4 = i;
            z = true;
        }
        int width2 = (int) ((i4 * width) / rect.width());
        int height = (int) ((i2 * i5) / rect.height());
        Activity activity = acleVar.c;
        amkq.E(i3 > 0);
        amkq.E(i5 > 0);
        amkq.E(rect.height() > 0);
        int integer = activity.getResources().getInteger(R.integer.lc_aspect_ratio_width);
        int integer2 = activity.getResources().getInteger(R.integer.lc_aspect_ratio_height);
        int round = Math.round((i3 * i5) / rect.height()) / integer2;
        Point point = new Point(integer * round, integer2 * round);
        if (point.x < 4 || point.y < 4 || point.x + width2 > width || point.y + height > i5) {
            return false;
        }
        acleVar.l.f(width, i5, new acld(acleVar, z, width2, height, point, aceoVar));
        return true;
    }

    @Override // defpackage.acih
    public final boolean aO() {
        acle acleVar = this.N;
        yjk.f();
        return acleVar.f.k("torch");
    }

    @Override // defpackage.acih
    public final void aP(float f) {
        acle acleVar = this.N;
        yjk.f();
        acleVar.f.n(f);
    }

    @Override // defpackage.acjk
    public final aone aQ(StreamMetadata streamMetadata) {
        abxq abxqVar;
        abxq a2;
        arnn arnnVar;
        arno arnoVar;
        StreamConfig streamConfig = this.C;
        if (streamConfig.c == null) {
            return null;
        }
        StreamMetadata streamMetadata2 = streamConfig.d;
        String str = streamMetadata.a;
        String str2 = streamMetadata.b;
        int i = streamMetadata.m;
        Place place = streamMetadata.i;
        Boolean bool = streamMetadata.c;
        Boolean bool2 = streamMetadata.d;
        Boolean bool3 = streamMetadata.e;
        int i2 = streamMetadata.l;
        Boolean bool4 = streamMetadata.f;
        arnn arnnVar2 = streamMetadata.g;
        Date date = streamMetadata.j;
        aqzu aqzuVar = streamMetadata.k;
        abxq abxqVar2 = abxq.a;
        abxq abxqVar3 = abxq.a;
        boolean equals = Objects.equals(str, streamMetadata2.a);
        boolean z = !equals;
        String str3 = true != equals ? str : null;
        boolean equals2 = Objects.equals(str2, streamMetadata2.b);
        boolean z2 = (!equals2) | z;
        String str4 = true != equals2 ? str2 : null;
        int i3 = streamMetadata2.m;
        boolean z3 = (!(i == i3)) | z2;
        int i4 = i != i3 ? i : 0;
        if (Objects.equals(place, streamMetadata2.i)) {
            abxqVar = abxqVar2;
        } else {
            abxqVar = place == null ? abxq.b : abxq.a(place);
            z3 = true;
        }
        boolean equals3 = Objects.equals(bool, streamMetadata2.c);
        boolean z4 = (!equals3) | z3;
        Boolean bool5 = true != equals3 ? bool : null;
        boolean equals4 = Objects.equals(bool2, streamMetadata2.d);
        boolean z5 = z4 | (!equals4);
        Boolean bool6 = true == equals4 ? null : bool2;
        Boolean bool7 = true != equals4 ? bool : bool5;
        int i5 = streamMetadata2.l;
        boolean z6 = z5 | (!(i2 == i5));
        int i6 = i2 != i5 ? i2 : 0;
        boolean equals5 = Objects.equals(bool3, streamMetadata2.e);
        boolean z7 = (!equals5) | z6;
        Boolean bool8 = true == equals5 ? null : bool3;
        boolean equals6 = Objects.equals(bool4, streamMetadata2.f);
        boolean z8 = !equals6;
        boolean z9 = z7 | z8;
        Boolean bool9 = true != equals6 ? bool4 : null;
        if (z8 || !Objects.equals(aqzuVar, streamMetadata2.k)) {
            a2 = (!bool4.booleanValue() || aqzuVar == null || (aqzuVar.b & 4) == 0) ? abxq.b : abxq.a(aqzuVar.e);
            z9 = true;
        } else {
            a2 = abxqVar3;
        }
        if (arnnVar2 == null || Objects.equals(arnnVar2, streamMetadata2.g)) {
            arnnVar = null;
            arnoVar = null;
        } else {
            arnn arnnVar3 = streamMetadata2.g;
            aone createBuilder = arno.a.createBuilder();
            if (arnnVar3 == null || arnnVar2.c != arnnVar3.c) {
                createBuilder.copyOnWrite();
                arno.a((arno) createBuilder.instance);
            }
            if ((arnnVar2.b & 8) != 0 && (arnnVar3 == null || !TextUtils.equals(arnnVar2.f, arnnVar3.f))) {
                createBuilder.copyOnWrite();
                arno.d((arno) createBuilder.instance);
            } else if ((arnnVar2.b & 4) != 0 && (arnnVar3 == null || arnnVar2.e != arnnVar3.e)) {
                createBuilder.copyOnWrite();
                arno.c((arno) createBuilder.instance);
            }
            if ((arnnVar2.b & 16) != 0 && (arnnVar3 == null || arnnVar2.g != arnnVar3.g)) {
                createBuilder.copyOnWrite();
                arno.e((arno) createBuilder.instance);
            }
            if ((arnnVar2.b & 32) != 0 && (arnnVar3 == null || !TextUtils.equals(arnnVar2.h, arnnVar3.h))) {
                createBuilder.copyOnWrite();
                arno.f((arno) createBuilder.instance);
            }
            if (arnnVar3 == null || arnnVar2.d != arnnVar3.d) {
                createBuilder.copyOnWrite();
                arno.b((arno) createBuilder.instance);
            }
            arnoVar = (arno) createBuilder.build();
            arnnVar = arnnVar2;
            z9 = true;
        }
        boolean equals7 = Objects.equals(date, streamMetadata2.j);
        boolean z10 = (!equals7) | z9;
        Date date2 = true != equals7 ? date : null;
        if (z10) {
            return this.q.l(this.C.c, str3, str4, bool7, bool6, bool8, bool9, arnnVar, arnoVar, i4, i6, abxqVar, date2, a2, null);
        }
        return null;
    }

    @Override // defpackage.acjk
    public final void aa(assu assuVar) {
        bh(assuVar);
    }

    @Override // defpackage.acjk
    public final void ab(View view) {
        this.N.c();
        aT(view);
        this.F.aI(q());
    }

    @Override // defpackage.acjk
    public final void ac(aqdt aqdtVar) {
        ay(aqdtVar);
    }

    @Override // defpackage.acjq
    public final void ad(atey ateyVar) {
        bc(ateyVar);
        y(ateyVar.q);
    }

    @Override // defpackage.acjq
    public final void ae() {
        ax();
    }

    @Override // defpackage.acih
    public final void af(boolean z) {
        abse abseVar = this.N.m;
        if (abseVar != null) {
            abseVar.h(z);
        }
    }

    @Override // defpackage.acih
    public final void ag() {
        this.C.q = true;
    }

    @Override // defpackage.acge
    public final void ah() {
        acgf acgfVar = this.al;
        if (acgfVar == null || !acgfVar.av()) {
            this.F = null;
            this.G = null;
            this.C.a = true;
            s(false);
            String str = this.C.w;
            this.C = new StreamConfig();
            abvt.b().g();
            this.C.w = str;
            ax();
            return;
        }
        this.al.aI();
    }

    @Override // defpackage.acip
    public final void ai(atgf atgfVar, String str, String str2) {
        StreamConfig streamConfig = this.C;
        streamConfig.c = atgfVar.h;
        streamConfig.v = str2;
        streamConfig.u = str;
        streamConfig.j = atgfVar;
        aB();
    }

    @Override // defpackage.acge
    public final void aj(int i) {
        acgf acgfVar = this.G;
        if (acgfVar == null || !acgfVar.av()) {
            return;
        }
        this.C.g = i;
        bb();
    }

    @Override // defpackage.acjk
    public final void ak() {
        aC();
    }

    @Override // defpackage.acjk
    public final void al(String str, apxf apxfVar) {
        if (isDestroyed()) {
            return;
        }
        abvt.b().e = str;
        this.aA = true;
        StreamConfig streamConfig = this.C;
        streamConfig.c = str;
        streamConfig.k = apxfVar;
        bb();
        this.R.post(this.T);
    }

    @Override // defpackage.acjk
    public final void am(avxs avxsVar) {
        this.C.y = avxsVar;
    }

    public final void ao(Choreographer.FrameCallback frameCallback) {
        this.s.postFrameCallback(frameCallback);
    }

    public final void ap(int i) {
        if (acfm.e(this)) {
            aZ();
        } else if (i > 0) {
            new Handler().postDelayed(new aceq(this, i, 0), 200L);
        } else {
            whu.K(this, R.string.lc_error_screen_overlay_permission_required, 1);
            finish();
        }
    }

    public final void aq(long j) {
        ynm.n(this, this.Z.a.b(new fjv(j, 8), angq.a), zxq.h, zxq.l);
    }

    public final void ar(wan wanVar) {
        wanVar.i(this);
    }

    public final void as() {
        ynm.o(this, this.Z.a.b(aard.n, angq.a), zxq.i, zxq.m);
    }

    public final void at(abvt abvtVar, StreamConfig streamConfig) {
        abvtVar.g();
        if (streamConfig == null || streamConfig.a) {
            return;
        }
        abvtVar.e = streamConfig.c;
        abvtVar.f = this.aa.n();
        abvtVar.g = bl(streamConfig.d);
        if (TextUtils.isEmpty(streamConfig.u) && TextUtils.isEmpty(streamConfig.v)) {
            return;
        }
        abvtVar.k = true != streamConfig.p ? 2 : 4;
    }

    public final void au() {
        boolean z;
        StreamConfig streamConfig;
        atey ateyVar;
        atey ateyVar2;
        StreamMetadata streamMetadata;
        StreamConfig streamConfig2 = this.C;
        boolean z2 = true;
        boolean z3 = (streamConfig2 == null || (streamMetadata = streamConfig2.d) == null || TextUtils.isEmpty(streamMetadata.a)) ? false : true;
        StreamConfig streamConfig3 = this.C;
        if (streamConfig3 != null && (ateyVar2 = streamConfig3.i) != null) {
            aqyg aqygVar = ateyVar2.m;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            if (!TextUtils.isEmpty(ajcq.b(aqygVar))) {
                z = true;
                if (!z3 && !z) {
                    z2 = false;
                }
                amkq.E(z2);
                aY();
                StreamConfig streamConfig4 = this.C;
                acgf n = acgf.n(streamConfig4.i, streamConfig4.c, this.ay, this.aA, aR());
                this.G = n;
                this.aA = false;
                aD(n, "CHOOSE_THUMBNAIL_FRAGMENT");
                this.G.aM(q());
                streamConfig = this.C;
                if (streamConfig != null || (ateyVar = streamConfig.i) == null || (ateyVar.b & 524288) == 0) {
                    return;
                }
                y(ateyVar.q);
                return;
            }
        }
        z = false;
        if (!z3) {
            z2 = false;
        }
        amkq.E(z2);
        aY();
        StreamConfig streamConfig42 = this.C;
        acgf n2 = acgf.n(streamConfig42.i, streamConfig42.c, this.ay, this.aA, aR());
        this.G = n2;
        this.aA = false;
        aD(n2, "CHOOSE_THUMBNAIL_FRAGMENT");
        this.G.aM(q());
        streamConfig = this.C;
        if (streamConfig != null) {
        }
    }

    public final void av() {
        int i;
        int i2;
        this.C.b = this.k.c().d();
        String str = this.K;
        aciq aciqVar = new aciq();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_SERIALIZED_PARAMS", str);
        aciqVar.af(bundle);
        this.E = aciqVar;
        StreamConfig streamConfig = this.C;
        int i3 = streamConfig.s;
        if (i3 == 0) {
            if (streamConfig.t == 0) {
                Point point = new Point();
                getWindowManager().getDefaultDisplay().getRealSize(point);
                StreamConfig streamConfig2 = this.C;
                i2 = point.x;
                streamConfig2.s = i2;
                StreamConfig streamConfig3 = this.C;
                i = point.y;
                streamConfig3.t = i;
                this.ap.setLayoutParams(new RelativeLayout.LayoutParams(i2, i / 2));
                aA(false);
                aD(this.E, "PARTICIPANT_PRE_JOIN_FRAGMENT");
            }
            i3 = 0;
        }
        i = streamConfig.t;
        i2 = i3;
        this.ap.setLayoutParams(new RelativeLayout.LayoutParams(i2, i / 2));
        aA(false);
        aD(this.E, "PARTICIPANT_PRE_JOIN_FRAGMENT");
    }

    public final void aw() {
        if (!TextUtils.isEmpty(this.K)) {
            av();
        } else {
            ax();
        }
    }

    public final void ax() {
        LiveCreationActivity liveCreationActivity;
        String str;
        String str2;
        String str3;
        String d2 = this.k.c().d();
        StreamConfig streamConfig = this.C;
        streamConfig.b = d2;
        if (this.F == null) {
            if (TextUtils.isEmpty(streamConfig.c)) {
                boolean z = false;
                if (getIntent() != null) {
                    str2 = getIntent().getStringExtra("android.intent.extra.SUBJECT");
                    String stringExtra = getIntent().getStringExtra("GAME_TITLE");
                    r8 = stringExtra != null ? getString(R.string.lc_initial_video_title, new Object[]{stringExtra}) : null;
                    str3 = getIntent().getStringExtra("GAME_PACKAGE_NAME");
                    this.au = "SCREEN".equals(getIntent().getStringExtra("CAPTURE_MODE"));
                    if (getIntent().getAction() != null) {
                        z = getIntent().getAction().equals("com.google.android.youtube.intent.action.CREATE_LIVE_STREAM");
                    }
                } else {
                    str2 = null;
                    str3 = null;
                }
                int i = this.ay;
                boolean z2 = this.au;
                acjl acjlVar = new acjl();
                Bundle bundle = new Bundle();
                bundle.putInt("ARG_CAMERA_COUNT", i);
                if (r8 != null) {
                    bundle.putString("ARG_TITLE", r8);
                }
                if (str2 != null) {
                    bundle.putString("ARG_DESCRIPTION", str2);
                }
                if (str3 != null) {
                    bundle.putString("ARG_GAME_PACKAGE_NAME", str3);
                }
                bundle.putBoolean("ARG_IS_SCREENCAST", z2);
                bundle.putBoolean("ARG_IS_LAUNCHED_FROM_INTENT", z);
                acjlVar.af(bundle);
                this.F = acjlVar;
                liveCreationActivity = this;
                str = d2;
            } else {
                StreamConfig streamConfig2 = this.C;
                StreamMetadata streamMetadata = streamConfig2.d;
                String str4 = streamMetadata.a;
                String str5 = streamMetadata.b;
                int i2 = streamMetadata.m;
                int i3 = streamMetadata.l;
                Place place = streamMetadata.i;
                Boolean bool = streamMetadata.c;
                Boolean bool2 = streamMetadata.d;
                Boolean bool3 = streamMetadata.e;
                Boolean bool4 = streamMetadata.f;
                arnn arnnVar = streamMetadata.g;
                int i4 = this.ay;
                apxf apxfVar = streamConfig2.k;
                Date date = streamMetadata.j;
                aqzu aqzuVar = streamMetadata.k;
                acjl acjlVar2 = new acjl();
                Bundle bundle2 = new Bundle();
                if (str4 != null) {
                    bundle2.putString("ARG_TITLE", str4);
                }
                if (str5 != null) {
                    bundle2.putString("ARG_DESCRIPTION", str5);
                }
                if (i2 != 0) {
                    bundle2.putInt("ARG_STREAM_PRIVACY", i2 - 1);
                }
                if (i3 != 0) {
                    bundle2.putInt("ARG_AUDIENCE_TYPE", i3 - 1);
                }
                if (place != null) {
                    bundle2.putParcelable("ARG_PLACE", place);
                }
                if (bool != null) {
                    bundle2.putBoolean("ARG_ENABLE_CHAT", bool.booleanValue());
                }
                if (bool2 != null) {
                    bundle2.putBoolean("ARG_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE", bool2.booleanValue());
                }
                if (bool3 != null) {
                    bundle2.putBoolean("ARG_ENABLE_AGE_RESTRICTION", bool3.booleanValue());
                }
                if (bool4 != null) {
                    bundle2.putBoolean("ARG_IS_SCREENCAST", bool4.booleanValue());
                }
                if (arnnVar != null) {
                    bundle2.putParcelable("ARG_MONETIZATION_METADATA", new ParcelableMessageLite(arnnVar));
                }
                bundle2.putInt("ARG_CAMERA_COUNT", i4);
                if (apxfVar != null) {
                    bundle2.putParcelable("ARG_BROADCAST_CREATED_ENDPOINT", new ParcelableMessageLite(apxfVar));
                }
                if (date != null) {
                    bundle2.putSerializable("ARG_SCHEDULED_DATE", date);
                }
                if (aqzuVar != null) {
                    bundle2.putParcelable("ARG_GAME_TITLE", new ParcelableMessageLite(aqzuVar));
                }
                acjlVar2.af(bundle2);
                liveCreationActivity = this;
                liveCreationActivity.F = acjlVar2;
                str = d2;
            }
            liveCreationActivity.az = str;
        } else {
            liveCreationActivity = this;
            str = d2;
        }
        if (!Objects.equals(liveCreationActivity.az, str)) {
            liveCreationActivity.az = str;
            aX();
        } else if (liveCreationActivity.F.at()) {
            liveCreationActivity.F.q();
            liveCreationActivity.y(liveCreationActivity.F.aN());
        }
        liveCreationActivity.aD(liveCreationActivity.F, "PRE_STREAM_FRAGMENT");
        liveCreationActivity.F.aI(q());
    }

    final void ay(aqdt aqdtVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        Spanned b2;
        aqyg aqygVar3;
        Spanned b3;
        int min;
        wlt wltVar = new wlt(this, aqdtVar, this.j, new acfc(this), this);
        this.ad = wltVar;
        AlertDialog.Builder builder = new AlertDialog.Builder(wltVar.a);
        aqdt aqdtVar2 = wltVar.b;
        if ((aqdtVar2.b & 1) != 0) {
            aqygVar = aqdtVar2.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        builder.setTitle(ajcq.b(aqygVar));
        apmh apmhVar = wltVar.b.i;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = wltVar.b.i;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            aqyg aqygVar4 = apmgVar.i;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            b2 = ajcq.b(aqygVar4);
        } else {
            aqdt aqdtVar3 = wltVar.b;
            if ((aqdtVar3.b & 4194304) != 0) {
                aqygVar2 = aqdtVar3.q;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            b2 = ajcq.b(aqygVar2);
        }
        apmh apmhVar3 = wltVar.b.h;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        if ((apmhVar3.b & 1) != 0) {
            apmh apmhVar4 = wltVar.b.h;
            if (apmhVar4 == null) {
                apmhVar4 = apmh.a;
            }
            apmg apmgVar2 = apmhVar4.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            aqyg aqygVar5 = apmgVar2.i;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
            b3 = ajcq.b(aqygVar5);
        } else {
            aqdt aqdtVar4 = wltVar.b;
            if ((aqdtVar4.b & 2097152) != 0) {
                aqygVar3 = aqdtVar4.p;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            b3 = ajcq.b(aqygVar3);
        }
        builder.setPositiveButton(b3, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(b2, (DialogInterface.OnClickListener) null);
        View inflate = ((LayoutInflater) wltVar.a.getSystemService("layout_inflater")).inflate(R.layout.verification_dialog_body, (ViewGroup) null);
        wltVar.f = (YouTubeTextView) inflate.findViewById(R.id.message);
        wltVar.e = (ContentLoadingProgressBar) inflate.findViewById(R.id.progress_bar);
        wltVar.f.setText(ahbl.p(wltVar.b, wltVar.c));
        builder.setView(inflate);
        wltVar.f.setMovementMethod(LinkMovementMethod.getInstance());
        wltVar.d = builder.create();
        wltVar.d.setOnShowListener(new wls(wltVar));
        int i = 0;
        wltVar.d.setCancelable(false);
        wltVar.d.setCanceledOnTouchOutside(false);
        wltVar.d.show();
        if (yjk.aa(wltVar.a)) {
            min = ((aaq) wltVar.a).a().getDimensionPixelSize(R.dimen.av_confirmation_dialog_height);
            i = ((aaq) wltVar.a).a().getDimensionPixelSize(R.dimen.av_confirmation_dialog_width);
        } else {
            int N = yjk.N(wltVar.a);
            int L = yjk.L(wltVar.a);
            min = (int) (Math.min(N, L) * ((aaq) wltVar.a).a().getFraction(R.fraction.av_dialog_height_ratio, 1, 1));
        }
        WindowManager.LayoutParams attributes = wltVar.d.getWindow().getAttributes();
        attributes.height = min;
        if (i == 0) {
            i = attributes.width;
        }
        attributes.width = i;
        wltVar.d.getWindow().setAttributes(attributes);
        this.m.n(new acqx(acsb.c(31777)));
        this.m.n(new acqx(acsb.c(31778)));
    }

    @Override // defpackage.acge
    public final void az(View view) {
        aA(true);
        this.N.e(false);
        this.I.a(view);
    }

    @Override // defpackage.war
    public final void b() {
        aX();
    }

    @Override // defpackage.war
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.war
    public final void d() {
        aX();
    }

    @Override // defpackage.aayh
    public final void e(boolean z) {
        this.ad.getClass();
        String string = getResources().getString(R.string.lc_error_generic);
        Toast.makeText(this, string, 0).show();
        zga.b(String.valueOf(string).concat(", accept live streaming terms of service request failed."));
        if (z) {
            wlt wltVar = this.ad;
            wltVar.d.getClass();
            wltVar.g.setEnabled(true);
            wltVar.h.setEnabled(true);
            wltVar.e.a();
            return;
        }
        this.ad.a();
    }

    protected void g(ViewStub viewStub) {
    }

    @Override // defpackage.wlx
    public final void h() {
        finish();
    }

    @Override // defpackage.wlx
    public final void i() {
        Toast.makeText(this, getResources().getString(R.string.lc_error_generic), 0).show();
        finish();
    }

    @Override // defpackage.aayh
    public final void j() {
        wlt wltVar = this.ad;
        wltVar.getClass();
        wltVar.a();
    }

    @Override // defpackage.abux
    public final abuy k() {
        acif acifVar = this.ao;
        if (acifVar == null || !acifVar.av()) {
            return null;
        }
        return this.ao;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.av) {
            return;
        }
        StreamConfig streamConfig = this.C;
        bm(streamConfig.c, streamConfig.d.a, 2);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aruy aruyVar = (aruy) obj;
        int i = 0;
        if (aruyVar != null) {
            Iterator it = aruyVar.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                avec avecVar = ((arvs) it.next()).b;
                if (avecVar == null) {
                    avecVar = avec.a;
                }
                aved avedVar = avecVar.b;
                if (avedVar == null) {
                    avedVar = aved.a;
                }
                auov auovVar = avedVar.c;
                if (auovVar == null) {
                    auovVar = auov.a;
                }
                if (auovVar.d.size() != 0) {
                    Iterator it2 = auovVar.d.iterator();
                    while (it2.hasNext()) {
                        atdw atdwVar = ((auoy) it2.next()).H;
                        if (atdwVar == null) {
                            atdwVar = atdw.a;
                        }
                        if (atdwVar.b.size() != 0) {
                            for (atdx atdxVar : atdwVar.b) {
                                if ((atdxVar.b & 256) != 0) {
                                    aszm aszmVar = atdxVar.c;
                                    if (aszmVar == null) {
                                        aszmVar = aszm.a;
                                    }
                                    if (aszmVar.b != 1 || (i = anaf.bu(((Integer) aszmVar.c).intValue())) == 0) {
                                        i = 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i == 0) {
            StreamConfig streamConfig = this.C;
            bm(streamConfig.c, streamConfig.d.a, 2);
        } else {
            StreamConfig streamConfig2 = this.C;
            bm(streamConfig2.c, streamConfig2.d.a, i);
        }
    }

    @Override // defpackage.abvb
    public final abvc l() {
        acif acifVar = this.ao;
        if (acifVar == null || !acifVar.av()) {
            return null;
        }
        return this.ao;
    }

    @Override // defpackage.zar
    public final void lI(boolean z, int i) {
        acif acifVar = this.ao;
        if (acifVar == null || !acifVar.at()) {
            return;
        }
        this.ao.aK(z, i);
        if (acfm.c(this)) {
            return;
        }
        this.N.f(getWindowManager().getDefaultDisplay().getRotation());
    }

    @Override // defpackage.zar
    public final void lJ(boolean z, int i) {
        lI(z, i);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }

    @Override // defpackage.abvl
    public final void m(String str, atey ateyVar, Boolean bool) {
        this.i.c();
        StreamConfig streamConfig = this.C;
        ateyVar.getClass();
        streamConfig.i = ateyVar;
        if (!TextUtils.isEmpty(str)) {
            this.C.c = str;
        }
        StreamConfig streamConfig2 = this.C;
        if (streamConfig2.d == null) {
            streamConfig2.d = new StreamMetadata();
        }
        if ((ateyVar.b & 16384) != 0) {
            StreamMetadata streamMetadata = this.C.d;
            aqyg aqygVar = ateyVar.m;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            streamMetadata.a = ajcq.b(aqygVar).toString();
        }
        this.C.d.f = Boolean.valueOf(ateyVar.q);
        if (bool != null) {
            this.C.p = bool.booleanValue();
        }
        aF();
    }

    @Override // defpackage.war
    public final void mG() {
        finish();
    }

    @Override // defpackage.acqz
    public final acra mM() {
        return this.m;
    }

    @Override // defpackage.abxy
    public final void n(ascq ascqVar) {
        aulq aulqVar = ascqVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aqrf aqrfVar = (aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer);
        acir acirVar = new acir();
        Bundle bundle = new Bundle();
        if (aqrfVar != null) {
            amkq.cn(bundle, "ARG_ENDSCREEN_RENDERER", aqrfVar);
        }
        acirVar.af(bundle);
        this.ag = acirVar;
        aD(acirVar, "POST_COSTREAM_FRAGMENT");
    }

    @Override // defpackage.ci, defpackage.zv, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            ap(10);
            return;
        }
        if (i == 1000) {
            if (i2 != -1 || intent == null) {
                this.at = false;
                return;
            }
            StreamConfig streamConfig = this.C;
            streamConfig.e = true;
            streamConfig.w = "LIVE_STREAM_FRAGMENT";
            bb();
            afsy afsyVar = this.k;
            StreamConfig streamConfig2 = this.C;
            String str = streamConfig2.c;
            boolean z = streamConfig2.p;
            boolean z2 = streamConfig2.q;
            String str2 = streamConfig2.u;
            String str3 = streamConfig2.v;
            atgf atgfVar = streamConfig2.j;
            long j = streamConfig2.l;
            long j2 = streamConfig2.m;
            boolean z3 = streamConfig2.n && streamConfig2.o;
            boolean z4 = this.aa.i().c;
            boolean z5 = this.aa.i().b;
            astj i3 = this.aa.i();
            startService(ScreencastHostService.p(this, afsyVar, str, z, str2, str3, atgfVar, j, j2, z3, z4, z5, i3 != null && i3.m, this.aa.i().l, this.C.e, this.aa.i().f, intent));
            if (this.au) {
                setResult(-1);
                finish();
            } else {
                finishAffinity();
                startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
            }
        }
    }

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        acjl acjlVar = (acjl) this.D.f("PRE_STREAM_FRAGMENT");
        aciq aciqVar = (aciq) this.D.f("PARTICIPANT_PRE_JOIN_FRAGMENT");
        acgf acgfVar = (acgf) this.D.f("CHOOSE_THUMBNAIL_FRAGMENT");
        aciu aciuVar = (aciu) this.D.f("POST_STREAM_FRAGMENT");
        acir acirVar = (acir) this.D.f("POST_COSTREAM_FRAGMENT");
        acgq acgqVar = (acgq) this.D.f("ERROR_STATE_FRAGMENT");
        acif acifVar = (acif) this.D.f("LIVE_STREAM_FRAGMENT");
        wlu wluVar = (wlu) this.D.f("LIVE_ENABLEMENT_FRAGMENT_NAME");
        akar akarVar = (akar) this.D.f("PERMISSION_REQUEST_FRAGMENT");
        acgg acggVar = (acgg) this.D.f("COOL_OFF_FRAGMENT_NAME");
        acjn acjnVar = (acjn) this.D.f("SAFEGUARD_FRAGMENT");
        if ((aciuVar == null || !aciuVar.av()) && (acgqVar == null || !acgqVar.av())) {
            if ((acirVar == null || !acirVar.av()) && (acgqVar == null || !acgqVar.av())) {
                if (acjlVar == null || !acjlVar.av()) {
                    if (aciqVar == null || !aciqVar.av()) {
                        acjl acjlVar2 = this.ah;
                        if (acjlVar2 == null || !acjlVar2.av()) {
                            acgm acgmVar = this.f176J;
                            if (acgmVar == null || !acgmVar.av()) {
                                if (acgfVar == null || !acgfVar.av()) {
                                    acgf acgfVar2 = this.al;
                                    if (acgfVar2 == null || !acgfVar2.av()) {
                                        acjr acjrVar = this.ai;
                                        if (acjrVar == null || !acjrVar.av()) {
                                            if (wluVar == null || !wluVar.av()) {
                                                if (acifVar != null && acifVar.av()) {
                                                    if (acifVar.aC) {
                                                        acifVar.aJ();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (akarVar == null || !akarVar.av()) {
                                                    if (acggVar == null || !acggVar.av()) {
                                                        if (acjnVar == null || !acjnVar.av()) {
                                                            if (this.P) {
                                                                finish();
                                                                return;
                                                            } else {
                                                                super.onBackPressed();
                                                                return;
                                                            }
                                                        }
                                                        acjnVar.d.A();
                                                        return;
                                                    }
                                                    aahd aahdVar = acggVar.a;
                                                    apxf apxfVar = acggVar.c.p;
                                                    if (apxfVar == null) {
                                                        apxfVar = apxf.a;
                                                    }
                                                    aahdVar.a(apxfVar);
                                                    return;
                                                }
                                                akarVar.q();
                                                return;
                                            }
                                            wluVar.aH();
                                            return;
                                        }
                                        this.ai.q();
                                        return;
                                    }
                                    this.al.aI();
                                    return;
                                }
                                acgfVar.aI();
                                return;
                            }
                            this.f176J.n();
                            return;
                        }
                        this.ah.s();
                        return;
                    }
                    aciqVar.q();
                    return;
                }
                acjlVar.s();
                return;
            }
            finish();
            return;
        }
        finish();
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aH();
        this.o.l();
        wlu wluVar = this.aj;
        if (wluVar != null && wluVar.av()) {
            this.aj.aI(configuration);
        }
        akar akarVar = this.H;
        if (akarVar == null || !akarVar.av()) {
            return;
        }
        this.H.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        apxf apxfVar;
        byte[] byteArrayExtra;
        Intent intent;
        ParcelableMessageLite parcelableMessageLite;
        super.onCreate(bundle);
        if (this.aa.o()) {
            this.Q.add(new PermissionDescriptor(3, acsb.c(33982), acsb.c(33983)));
        }
        Bundle bundle2 = null;
        if (bundle != null) {
            apxfVar = null;
            bundle2 = bundle.getBundle("BUNDLE_INTERACTION_BUNDLE");
        } else {
            apxfVar = (adyu.cq(getIntent()) || (intent = getIntent()) == null || (parcelableMessageLite = (ParcelableMessageLite) intent.getParcelableExtra("navigation_endpoint")) == null) ? null : (apxf) parcelableMessageLite.a(apxf.a);
            if (apxfVar == null) {
                Intent intent2 = getIntent();
                if (intent2 != null && (byteArrayExtra = intent2.getByteArrayExtra("navigation_endpoint")) != null) {
                    try {
                        apxfVar = (apxf) aonm.parseFrom(apxf.a, byteArrayExtra, aomw.b());
                    } catch (aoob unused) {
                    }
                }
                apxfVar = null;
            }
        }
        ((acsg) this.m).K(bundle2, apxfVar);
        if (apxfVar != null && apxfVar.pY(LiveCreationEndpointOuterClass$LiveCreationEndpoint.liveCreationEndpoint)) {
            LiveCreationEndpointOuterClass$LiveCreationEndpoint liveCreationEndpointOuterClass$LiveCreationEndpoint = (LiveCreationEndpointOuterClass$LiveCreationEndpoint) apxfVar.pX(LiveCreationEndpointOuterClass$LiveCreationEndpoint.liveCreationEndpoint);
            if ((liveCreationEndpointOuterClass$LiveCreationEndpoint.b & 4) != 0) {
                this.K = liveCreationEndpointOuterClass$LiveCreationEndpoint.c;
                this.av = true;
            }
        }
        if (bundle != null) {
            this.C = (StreamConfig) bundle.getParcelable("BUNDLE_STREAM_CONFIG");
        }
        if (this.C == null) {
            this.C = new StreamConfig();
        }
        abvt b2 = abvt.b();
        if (this.aa.i().j) {
            ScheduledExecutorService scheduledExecutorService = this.u;
            acpl acplVar = this.v;
            shf shfVar = this.r;
            if (!b2.c) {
                b2.c = true;
                scheduledExecutorService.getClass();
                b2.a = scheduledExecutorService;
                acplVar.getClass();
                b2.b = acplVar;
                shfVar.getClass();
                b2.d = shfVar;
                synchronized (b2.i) {
                    for (Map.Entry entry : b2.i.entrySet()) {
                        b2.l((Class) entry.getKey(), (abvs) entry.getValue());
                    }
                }
            }
        }
        at(b2, this.C);
        b2.j(asrz.class, 0L);
        b2.j(assd.class, 0L);
        b2.j(assb.class, 0L);
        b2.j(asru.class, 0L);
        this.M = false;
        setContentView(R.layout.lc_live_creation_activity);
        this.D = getSupportFragmentManager();
        this.N = new acle(this.aa.p(), this.aa.i().E, (SurfaceView) findViewById(R.id.stream_view), this, this.W, new abqs(true != this.aa.i().i ? 1.3333333333333333d : 1.7777777777777777d, this.aa.i().N));
        this.k.getClass();
        this.p.getClass();
        g((ViewStub) findViewById(R.id.bottom_ui_container));
        this.I = (ViewportOverlay) findViewById(R.id.viewport_overlay);
        this.ap = (SurfaceView) findViewById(R.id.stream_view);
        this.ar = getString(R.string.lc_front_camera_accessibility_string);
        this.as = getString(R.string.lc_back_camera_accessibility_string);
        if (bundle != null) {
            this.aw = 1;
            this.i.b(bundle);
        } else {
            this.aw = 0;
        }
        this.i.a();
        this.ay = this.N.b();
        dn k = this.D.k();
        if (bundle != null) {
            String str = this.C.w;
            acjl acjlVar = (acjl) this.D.g(bundle, "prestream_fragment");
            this.F = acjlVar;
            if (acjlVar != null && !TextUtils.equals(str, "PRE_STREAM_FRAGMENT")) {
                k.l(this.F);
            }
            aciq aciqVar = (aciq) this.D.g(bundle, "participant_pre_join_fragment");
            this.E = aciqVar;
            if (aciqVar != null && !TextUtils.equals(str, "PARTICIPANT_PRE_JOIN_FRAGMENT")) {
                k.l(this.E);
            }
            acjl acjlVar2 = (acjl) this.D.g(bundle, "edit_settings_fragment");
            this.ah = acjlVar2;
            if (acjlVar2 != null && !TextUtils.equals(str, "EDIT_SETTINGS_PRE_STREAM_FRAGMENT")) {
                k.l(this.ah);
            }
            wlu wluVar = (wlu) this.D.g(bundle, "live_enablement_fragment");
            this.aj = wluVar;
            if (wluVar != null && !TextUtils.equals(str, "LIVE_ENABLEMENT_FRAGMENT_NAME")) {
                k.l(this.aj);
            }
            acgf acgfVar = (acgf) this.D.g(bundle, "choose_thumbnail_fragment");
            this.G = acgfVar;
            if (acgfVar != null && !TextUtils.equals(str, "CHOOSE_THUMBNAIL_FRAGMENT")) {
                k.l(this.G);
            }
            acgg acggVar = (acgg) this.D.g(bundle, "cool_off_fragment");
            this.ak = acggVar;
            if (acggVar != null && !TextUtils.equals(str, "COOL_OFF_FRAGMENT_NAME")) {
                k.l(this.ak);
            }
            acgm acgmVar = (acgm) this.D.g(bundle, "edit_thumbnail_fragment");
            this.f176J = acgmVar;
            if (acgmVar != null && !TextUtils.equals(str, "EDIT_THUMBNAIL_FRAGMENT_NAME")) {
                k.l(this.f176J);
            }
            acgf acgfVar2 = (acgf) this.D.g(bundle, "confirm_thumbnail_fragment");
            this.al = acgfVar2;
            if (acgfVar2 != null && !TextUtils.equals(str, "CONFIRM_THUMBNAIL_FRAGMENT")) {
                k.l(this.al);
            }
            acif acifVar = (acif) this.D.g(bundle, "livestream_fragment");
            this.ao = acifVar;
            if (acifVar != null && !TextUtils.equals(str, "LIVE_STREAM_FRAGMENT")) {
                k.l(this.ao);
            }
            aciu aciuVar = (aciu) this.D.g(bundle, "poststream_fragment");
            this.af = aciuVar;
            if (aciuVar != null && !TextUtils.equals(str, "POST_STREAM_FRAGMENT")) {
                k.l(this.af);
            }
            acir acirVar = (acir) this.D.g(bundle, "post_costream_fragment");
            this.ag = acirVar;
            if (acirVar != null && !TextUtils.equals(str, "POST_COSTREAM_FRAGMENT")) {
                k.l(this.ag);
            }
            acgq acgqVar = (acgq) this.D.g(bundle, "errorstate_fragment");
            this.am = acgqVar;
            if (acgqVar != null && !TextUtils.equals(str, "ERROR_STATE_FRAGMENT")) {
                k.l(this.am);
            }
            akar akarVar = (akar) this.D.g(bundle, "permission_request_fragment");
            this.H = akarVar;
            if (akarVar != null && (!TextUtils.equals(str, "PERMISSION_REQUEST_FRAGMENT") || !akai.f(this, c))) {
                k.l(this.H);
            }
            acjn acjnVar = (acjn) this.D.g(bundle, "safeguard_fragment");
            this.an = acjnVar;
            if (acjnVar != null && !TextUtils.equals(str, "SAFEGUARD_FRAGMENT")) {
                k.l(this.an);
            }
            this.i.c();
            k.a();
            this.O = bundle.getBoolean("is_resume_dialog_displayed");
            CameraStreamViewManager$CameraModelData cameraStreamViewManager$CameraModelData = (CameraStreamViewManager$CameraModelData) bundle.getParcelable("camera_model_bundle");
            Parcel obtain = Parcel.obtain();
            cameraStreamViewManager$CameraModelData.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.ae = obtain;
        }
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    protected final void onDestroy() {
        acle acleVar = this.N;
        if (acleVar != null) {
            yjk.f();
            synchronized (acleVar.q) {
                acleVar.p = true;
                abse abseVar = acleVar.m;
                if (abseVar != null) {
                    abseVar.e();
                }
            }
            acleVar.d.f();
        }
        abrn abrnVar = this.W;
        if (abrnVar != null) {
            abrnVar.f();
            abrnVar.a.getLooper().quitSafely();
            this.W = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.ci, android.app.Activity
    protected final void onPause() {
        super.onPause();
        zas zasVar = this.ac;
        if (zasVar != null) {
            zasVar.disable();
        }
        this.M = true;
        if (isFinishing()) {
            aC();
        }
    }

    @Override // defpackage.ci, defpackage.zv, android.app.Activity, defpackage.ahn
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        zxo zxoVar = this.L;
        if (zxoVar != null) {
            zxoVar.b(i, strArr, iArr);
        } else {
            zga.b("No active FragmentPermissionRequester to handle PermissionsResult");
        }
        akam akamVar = this.aq;
        if (akamVar == null || !akamVar.b(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.i.b(bundle);
    }

    @Override // defpackage.ci, android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.M = false;
        aH();
        this.i.f = false;
        if (acfm.b(this.F)) {
            y(this.F.aN());
            return;
        }
        if (acfm.b(this.ah)) {
            y(this.ah.aN());
            return;
        }
        if (acfm.b(this.G)) {
            y(this.G.aS());
        } else if (acfm.b(this.al)) {
            y(this.al.aS());
        } else if (acfm.b(this.ao)) {
            aA(true);
        }
    }

    @Override // defpackage.ci
    protected final void onResumeFragments() {
        super.onResumeFragments();
        this.o.f();
    }

    @Override // defpackage.zv, defpackage.er, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.M = true;
        acgg acggVar = this.ak;
        if (acggVar != null) {
            this.D.L(bundle, "cool_off_fragment", acggVar);
        } else {
            acjn acjnVar = this.an;
            if (acjnVar == null || !acjnVar.av()) {
                acjl acjlVar = this.F;
                if (acjlVar != null) {
                    this.D.L(bundle, "prestream_fragment", acjlVar);
                }
            } else {
                this.D.L(bundle, "safeguard_fragment", this.an);
            }
        }
        aciq aciqVar = this.E;
        if (aciqVar != null && aciqVar.ar()) {
            this.D.L(bundle, "participant_pre_join_fragment", this.E);
        }
        acjl acjlVar2 = this.ah;
        if (acjlVar2 != null) {
            this.D.L(bundle, "edit_settings_fragment", acjlVar2);
        }
        wlu wluVar = this.aj;
        if (wluVar != null && wluVar.ar()) {
            this.D.L(bundle, "live_enablement_fragment", this.aj);
        }
        acgf acgfVar = this.G;
        if (acgfVar != null) {
            this.D.L(bundle, "choose_thumbnail_fragment", acgfVar);
        }
        acgf acgfVar2 = this.al;
        if (acgfVar2 != null && acgfVar2.ar()) {
            this.D.L(bundle, "confirm_thumbnail_fragment", this.al);
        }
        acgm acgmVar = this.f176J;
        if (acgmVar != null && acgmVar.ar()) {
            this.D.L(bundle, "edit_thumbnail_fragment", this.f176J);
        }
        acif acifVar = this.ao;
        if (acifVar != null) {
            this.D.L(bundle, "livestream_fragment", acifVar);
        }
        aciu aciuVar = this.af;
        if (aciuVar != null) {
            this.D.L(bundle, "poststream_fragment", aciuVar);
        }
        acir acirVar = this.ag;
        if (acirVar != null) {
            this.D.L(bundle, "post_costream_fragment", acirVar);
        }
        acgq acgqVar = this.am;
        if (acgqVar != null) {
            this.D.L(bundle, "errorstate_fragment", acgqVar);
        }
        akar akarVar = this.H;
        if (akarVar != null) {
            this.D.L(bundle, "permission_request_fragment", akarVar);
        }
        bundle.putParcelable("BUNDLE_STREAM_CONFIG", this.C);
        acfk acfkVar = this.i;
        bundle.putInt("stream_control_state", acfkVar.e);
        bundle.putBoolean("enablement_complete", acfkVar.a);
        bundle.putBoolean("thumbnail_chosen", acfkVar.b);
        bundle.putBoolean("live_stream_complete", acfkVar.d);
        acfkVar.f = true;
        bundle.putBoolean("is_resume_dialog_displayed", this.O);
        bundle.putParcelable("camera_model_bundle", this.N.n);
        bundle.putBundle("BUNDLE_INTERACTION_BUNDLE", ((acsg) this.m).J());
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    protected final void onStart() {
        super.onStart();
        this.M = false;
        this.h.g(this.S);
        this.h.f(new adyu());
        if (this.k.t()) {
            w();
        } else {
            this.l.c(this, null, null);
        }
        if (bk(getIntent())) {
            this.ap.setVisibility(4);
        }
        acfk acfkVar = this.i;
        acfkVar.c = acfkVar.e;
        acfkVar.a();
        acfa acfaVar = new acfa(this);
        this.ab = acfaVar;
        this.t.registerDisplayListener(acfaVar, this.f);
        this.aB = true;
        if (aL()) {
            ao(this.U);
        }
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    protected final void onStop() {
        long j;
        super.onStop();
        if (aS() != null) {
            StreamConfig streamConfig = this.C;
            abwy abwyVar = (abwy) aS();
            if (abwyVar.S) {
                j = abwyVar.h.d() - abwyVar.I;
            } else {
                j = abwyVar.f26J;
            }
            streamConfig.m = j;
            bb();
        }
        this.t.unregisterDisplayListener(this.ab);
        this.h.f(new adyu());
        this.h.m(this.S);
        this.o.e();
        CameraStreamViewManager$CameraModelData cameraStreamViewManager$CameraModelData = this.N.n;
        Parcel obtain = Parcel.obtain();
        cameraStreamViewManager$CameraModelData.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        this.ae = obtain;
        aC();
        this.aw = 2;
        this.aB = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (acfm.b(this.ao)) {
            acif acifVar = this.ao;
            if (z) {
                acifVar.aL(true);
            }
        }
    }

    final String q() {
        String str;
        acle acleVar = this.N;
        if (acleVar == null) {
            return null;
        }
        int i = acleVar.n.b;
        if (i != -1) {
            Object[] objArr = new Object[1];
            objArr[0] = i == 1 ? this.ar : this.as;
            str = getString(R.string.lc_camera_facing_accessibility_string, objArr);
        } else {
            str = "";
        }
        return getString(R.string.lc_stream_switch_camera_accessibility_string, new Object[]{str, this.N.b() > 2 ? getString(R.string.lc_camera_id_accessibility_string, new Object[]{Integer.valueOf(this.N.n.a)}) : ""});
    }

    @Override // defpackage.acih
    public final ArrayList r() {
        if (this.x.b.isEmpty()) {
            this.x.e(this.C.y);
        }
        return this.x.b;
    }

    public final void s(boolean z) {
        StreamConfig a2;
        if (this.aa.m()) {
            this.g.execute(new acep(this, 1));
            ba("");
            aq(0L);
            if (!z || (a2 = StreamConfig.a(this.Z.b())) == null || TextUtils.isEmpty(a2.c)) {
                return;
            }
            this.q.e(a2.c, e);
            return;
        }
        this.g.execute(new acff(z, this, this.q, this.r, this.A));
    }

    public final void t() {
        dn k = this.D.k();
        for (ce ceVar : this.D.l()) {
            if (ceVar != null && ceVar.ar()) {
                k.l(ceVar);
            }
        }
        k.i = 4099;
        k.a();
    }

    @Override // defpackage.wlx
    public final void u() {
        bj(this.F, "PRE_STREAM_FRAGMENT", true);
        this.i.e();
        this.F.aG();
    }

    @Override // defpackage.acge
    public final void v(boolean z) {
        this.N.e(true);
        this.I.a(null);
        if (z) {
            aC();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity.w():void");
    }

    @Override // defpackage.acih
    public final void x(final zvk zvkVar, final String str) {
        final acle acleVar = this.N;
        final ztl i = this.x.i();
        final boolean z = this.C.p;
        abse abseVar = acleVar.m;
        if (abseVar != null) {
            abseVar.j(acleVar.c, zvkVar, i, z, str);
        } else {
            acleVar.d.a.post(new Runnable() { // from class: ackw
                @Override // java.lang.Runnable
                public final void run() {
                    acle acleVar2 = acle.this;
                    zvk zvkVar2 = zvkVar;
                    ztl ztlVar = i;
                    boolean z2 = z;
                    String str2 = str;
                    synchronized (acleVar2.q) {
                        if (acleVar2.p) {
                            return;
                        }
                        acleVar2.m.j(acleVar2.c, zvkVar2, ztlVar, z2, str2);
                    }
                }
            });
        }
    }

    @Override // defpackage.acjk
    public final void y(boolean z) {
        if (z) {
            aC();
        } else {
            aA(true);
        }
    }

    @Override // defpackage.acgl
    public final void z() {
        acgf acgfVar = this.al;
        if (acgfVar != null) {
            aD(acgfVar, "CONFIRM_THUMBNAIL_FRAGMENT");
        } else {
            au();
        }
    }

    public final void aA(boolean z) {
        if (this.ax) {
            return;
        }
        if (this.aw == 0 || this.ae == null) {
            this.N.d(null);
        } else {
            this.N.d((CameraStreamViewManager$CameraModelData) CameraStreamViewManager$CameraModelData.CREATOR.createFromParcel(this.ae));
        }
        final acle acleVar = this.N;
        yjk.f();
        acleVar.e.b(z);
        acleVar.l = new abrs();
        acleVar.d.b(acleVar.e);
        acleVar.d.b(acleVar.l);
        if (acleVar.a) {
            acleVar.f.e = new abqo() { // from class: acku
                @Override // defpackage.abqo
                public final void a(boolean z2) {
                    acle acleVar2 = acle.this;
                    acleVar2.o = z2;
                    abrd abrdVar = acleVar2.i;
                    if (abrdVar != null) {
                        boolean z3 = false;
                        if (!acleVar2.b && z2) {
                            z3 = true;
                        }
                        abrdVar.a = z3;
                    }
                    abse abseVar = acleVar2.m;
                    if (abseVar != null) {
                        abseVar.c();
                    }
                }
            };
        } else {
            amkq.N(acleVar.g == null);
            Activity activity = acleVar.c;
            acleVar.g = new abru();
            acleVar.h = new abqv(acleVar.g);
            acleVar.d.l(acleVar.g);
            abrd abrdVar = new abrd(acleVar.h);
            acleVar.d.b(abrdVar);
            acleVar.j = new abqt(adyu.cU(acleVar.c, R.raw.copy_texture_frag));
            acleVar.k = new abqk(new acky(acleVar));
            acleVar.f.e = new ackz(acleVar, abrdVar);
        }
        this.W.j();
        this.ap.setVisibility(0);
        Parcel parcel = this.ae;
        if (parcel != null) {
            parcel.recycle();
            this.ae = null;
        }
        this.ax = true;
    }
}
