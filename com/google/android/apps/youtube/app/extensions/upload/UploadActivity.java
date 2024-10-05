package com.google.android.apps.youtube.app.extensions.upload;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import defpackage.aahd;
import defpackage.aahg;
import defpackage.aamd;
import defpackage.aarr;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acra;
import defpackage.acrb;
import defpackage.acsb;
import defpackage.acsg;
import defpackage.afot;
import defpackage.afsy;
import defpackage.aftn;
import defpackage.ahbw;
import defpackage.aii;
import defpackage.ajcq;
import defpackage.ajju;
import defpackage.ajjv;
import defpackage.ajjz;
import defpackage.ajrv;
import defpackage.akai;
import defpackage.akcy;
import defpackage.akoh;
import defpackage.akuy;
import defpackage.akuz;
import defpackage.akva;
import defpackage.akvf;
import defpackage.akwd;
import defpackage.akwg;
import defpackage.akxy;
import defpackage.akyb;
import defpackage.alca;
import defpackage.aloh;
import defpackage.alta;
import defpackage.amkq;
import defpackage.amlr;
import defpackage.amml;
import defpackage.ammv;
import defpackage.amnm;
import defpackage.angq;
import defpackage.anib;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aong;
import defpackage.aonm;
import defpackage.aoob;
import defpackage.apft;
import defpackage.apxf;
import defpackage.aqqm;
import defpackage.aqyg;
import defpackage.arvr;
import defpackage.arvt;
import defpackage.asdx;
import defpackage.asdy;
import defpackage.asdz;
import defpackage.asht;
import defpackage.astj;
import defpackage.astx;
import defpackage.atmb;
import defpackage.atmc;
import defpackage.aulq;
import defpackage.auov;
import defpackage.avgg;
import defpackage.avsq;
import defpackage.avst;
import defpackage.avtn;
import defpackage.avto;
import defpackage.avtp;
import defpackage.avuj;
import defpackage.avxs;
import defpackage.axze;
import defpackage.dd;
import defpackage.dn;
import defpackage.evr;
import defpackage.fav;
import defpackage.fxj;
import defpackage.fzc;
import defpackage.gcm;
import defpackage.gcq;
import defpackage.gng;
import defpackage.gou;
import defpackage.hue;
import defpackage.ipr;
import defpackage.iqi;
import defpackage.iqv;
import defpackage.ira;
import defpackage.irc;
import defpackage.ird;
import defpackage.irg;
import defpackage.irs;
import defpackage.irx;
import defpackage.irz;
import defpackage.isa;
import defpackage.isf;
import defpackage.lu;
import defpackage.mi;
import defpackage.vgz;
import defpackage.vsy;
import defpackage.wan;
import defpackage.war;
import defpackage.wbk;
import defpackage.wbs;
import defpackage.wcy;
import defpackage.whu;
import defpackage.wjb;
import defpackage.wjc;
import defpackage.wlu;
import defpackage.yjk;
import defpackage.ynm;
import defpackage.ypd;
import defpackage.zev;
import defpackage.zga;
import defpackage.zhq;
import defpackage.zto;
import defpackage.zyd;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UploadActivity extends iqi implements irx, war, acqz, ypd {
    public akoh S;
    public fxj T;
    public ipr U;
    String V;
    public asdy W;
    public arvt X;
    public LoadingFrameLayout Y;
    public isf Z;
    private View aA;
    private avst aB;
    private FrameLayout aC;
    private YouTubeTextView aD;
    View aa;
    public gou ac;
    public ImageView ad;
    public boolean ae;
    public boolean af;
    public String ah;
    public String ai;
    public vgz aj;
    public akwg ak;
    public axze al;
    public aloh am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private asdy as;
    private LinearLayout au;
    private ViewGroup av;
    private ajjv aw;
    private YouTubeTextView ax;
    private YouTubeTextView ay;
    private ImageView az;
    public anib h;
    public aahd i;
    public ajrv j;
    public afsy k;
    public ajjz l;
    public aarr m;
    public zto n;
    public afot o;
    public aftn p;
    public acsg q;
    public wan r;
    public irz s;
    public akxy t;
    public SharedPreferences u;
    public wbk v;
    public akcy w;
    public akyb x;
    public boolean ab = false;
    private boolean at = false;
    public ammv ag = amlr.a;

    private final String I() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id");
        }
        return null;
    }

    private final void J() {
        F();
        astj astjVar = this.C.a().c;
        if (astjVar == null) {
            astjVar = astj.a;
        }
        if (!astjVar.k || !akai.g(this)) {
            E(null);
        } else {
            ynm.n(this, this.o.a(), new ira(this, 2), new ira(this, 0));
        }
    }

    private final void K() {
        avtn avtnVar;
        boolean z;
        boolean z2;
        avst avstVar;
        this.ai = "";
        avuj avujVar = this.C.a().h;
        if (avujVar == null) {
            avujVar = avuj.a;
        }
        if (avujVar.y) {
            Intent intent = getIntent();
            avtn avtnVar2 = avtn.UPLOAD_FLOW_SOURCE_UNKNOWN;
            if (intent != null) {
                z = akva.g(intent);
                avtnVar = akva.c(intent);
            } else {
                avtnVar = avtnVar2;
                z = false;
            }
            if (z && akva.i(avtnVar)) {
                if (this.ae) {
                    this.ak.d();
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.aC.setVisibility(true == z2 ? 0 : 8);
                this.af = z2;
                return;
            }
            return;
        }
        this.ak.d();
        avuj avujVar2 = this.C.a().h;
        if (avujVar2 == null) {
            avujVar2 = avuj.a;
        }
        if (!avujVar2.z || (avstVar = this.aB) == null) {
            this.aC.setVisibility(8);
            return;
        }
        if ((avstVar.b & 2) != 0) {
            YouTubeTextView youTubeTextView = this.aD;
            aqyg aqygVar = avstVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            youTubeTextView.setText(ajcq.c(aqygVar, this.j));
            this.aD.d(true);
            this.aC.setVisibility(0);
        }
        avst avstVar2 = this.aB;
        if ((avstVar2.b & 1) != 0) {
            this.ai = avstVar2.c;
        }
    }

    @Override // defpackage.iqw
    protected final boolean B() {
        if (this.N) {
            return true;
        }
        zyd zydVar = this.s.z;
        vsy bs = zydVar != null ? zydVar.bs() : null;
        return (bs == null || bs.J()) ? false : true;
    }

    @Override // defpackage.irx
    public final void C(String[] strArr) {
        aone builder;
        if (this.aC.getVisibility() == 0 || !TextUtils.isEmpty(this.ai)) {
            ynm.n(this, this.aj.b(new amml() { // from class: irb
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    UploadActivity uploadActivity = UploadActivity.this;
                    alau alauVar = (alau) obj;
                    aone createBuilder = alas.a.createBuilder();
                    if (uploadActivity.af) {
                        createBuilder.copyOnWrite();
                        alas alasVar = (alas) createBuilder.instance;
                        alasVar.b |= 1;
                        alasVar.c = true;
                    }
                    if (!TextUtils.isEmpty(uploadActivity.ai)) {
                        String str = uploadActivity.ai;
                        createBuilder.copyOnWrite();
                        alas alasVar2 = (alas) createBuilder.instance;
                        str.getClass();
                        alasVar2.b |= 2;
                        alasVar2.d = str;
                    }
                    aone builder2 = alauVar.toBuilder();
                    String b = uploadActivity.k.c().b();
                    alas alasVar3 = (alas) createBuilder.build();
                    alasVar3.getClass();
                    builder2.copyOnWrite();
                    alau alauVar2 = (alau) builder2.instance;
                    aoot aootVar = alauVar2.b;
                    if (!aootVar.b) {
                        alauVar2.b = aootVar.a();
                    }
                    alauVar2.b.put(b, alasVar3);
                    return (alau) builder2.build();
                }
            }, angq.a), hue.p, hue.q);
        }
        whu.C(getCurrentFocus());
        Intent intent = getIntent();
        Intent intent2 = new Intent();
        boolean z = true;
        if (intent != null && !intent.getBooleanExtra("navigate_to_my_uploads", true)) {
            z = false;
        }
        intent2.putExtra("frontend_ids", strArr);
        intent2.putExtra("close_gallery_on_successful_upload", !z);
        setResult(-1, intent2);
        finish();
        if (z) {
            apxf apxfVar = (apxf) ((aong) aahg.a("FEmy_videos").toBuilder()).build();
            if (!apxfVar.pY(atmb.b)) {
                builder = atmc.a.createBuilder();
            } else {
                builder = ((atmc) apxfVar.pX(atmb.b)).toBuilder();
            }
            builder.copyOnWrite();
            atmc atmcVar = (atmc) builder.instance;
            atmcVar.b |= 2;
            atmcVar.d = 9701;
            aong aongVar = (aong) apxfVar.toBuilder();
            aongVar.e(atmb.b, (atmc) builder.build());
            aong aongVar2 = (aong) this.q.h((apxf) aongVar.build()).toBuilder();
            Intent r = this.am.r();
            r.setFlags(67108864);
            r.putExtra("navigation_endpoint", ((apxf) aongVar2.build()).toByteArray());
            startActivity(r);
        }
    }

    public final void D(asdy asdyVar) {
        avxs avxsVar;
        boolean z;
        yjk.f();
        if (this.aq) {
            this.W = asdyVar;
            if (this.as == asdyVar) {
                return;
            }
            this.as = asdyVar;
            this.M.a();
            this.aC.setVisibility(8);
            this.au.setVisibility(8);
            this.aA.setVisibility(8);
            this.V = this.k.c().d();
            asdy asdyVar2 = this.W;
            if ((asdyVar2.b & 16384) != 0) {
                this.q.D(new acqx(asdyVar2.p));
            }
            asdy asdyVar3 = this.W;
            if ((asdyVar3.b & 64) != 0) {
                isf isfVar = this.Z;
                isfVar.e = asdyVar3.j;
                isfVar.c();
            }
            Iterator it = this.W.d.iterator();
            while (true) {
                avxsVar = null;
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                asdz asdzVar = (asdz) it.next();
                int i = asdzVar.b;
                if (i == 96626565) {
                    avsq avsqVar = (avsq) asdzVar.c;
                    avsqVar.getClass();
                    this.ad.setBackgroundResource(R.color.upload_activity_account_header_thumbnail_background);
                    avgg avggVar = avsqVar.d;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    if (ahbw.L(avggVar)) {
                        ajjz ajjzVar = this.l;
                        ImageView imageView = this.ad;
                        avgg avggVar2 = avsqVar.d;
                        if (avggVar2 == null) {
                            avggVar2 = avgg.a;
                        }
                        ajjzVar.k(imageView, avggVar2, this.aw);
                    }
                    YouTubeTextView youTubeTextView = this.ax;
                    aqyg aqygVar = avsqVar.b;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    youTubeTextView.setText(ajcq.b(aqygVar));
                    YouTubeTextView youTubeTextView2 = this.ay;
                    aqyg aqygVar2 = avsqVar.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    youTubeTextView2.setText(ajcq.b(aqygVar2));
                    boolean z2 = avsqVar.e;
                    this.av.setClickable(z2);
                    if (z2) {
                        this.az.setVisibility(0);
                        this.av.setOnClickListener(new View.OnClickListener() { // from class: iqy
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                UploadActivity uploadActivity = UploadActivity.this;
                                uploadActivity.p.c(uploadActivity, null, null);
                            }
                        });
                        ViewGroup viewGroup = this.av;
                        whu.E(viewGroup, viewGroup.getBackground());
                        aqyg aqygVar3 = avsqVar.b;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                        CharSequence b = ajcq.b(aqygVar3);
                        aqyg aqygVar4 = avsqVar.c;
                        if (aqygVar4 == null) {
                            aqygVar4 = aqyg.a;
                        }
                        CharSequence b2 = ajcq.b(aqygVar4);
                        CharSequence[] charSequenceArr = new CharSequence[2];
                        if (b == null) {
                            b = "";
                        }
                        charSequenceArr[0] = b;
                        if (b2 == null) {
                            b2 = "";
                        }
                        charSequenceArr[1] = b2;
                        this.av.setContentDescription(getString(R.string.account_switcher_accessibility_label, new Object[]{TextUtils.join(" ", Arrays.asList(charSequenceArr))}));
                    } else {
                        this.az.setVisibility(8);
                        this.av.setOnClickListener(null);
                        this.av.setBackgroundResource(0);
                        this.av.setContentDescription(null);
                    }
                    this.au.setVisibility(0);
                } else if (i == 334359378) {
                    this.aB = (avst) asdzVar.c;
                }
            }
            aulq aulqVar = this.W.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(SectionListRendererOuterClass.sectionListRenderer)) {
                aulq aulqVar2 = this.W.e;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aamd aamdVar = new aamd((auov) aulqVar2.pX(SectionListRendererOuterClass.sectionListRenderer));
                arvr arvrVar = this.W.l;
                if (arvrVar == null) {
                    arvrVar = arvr.a;
                }
                y(aamdVar, arvrVar);
                this.aA.setVisibility(0);
            }
            K();
            irz irzVar = this.s;
            asdy asdyVar4 = this.W;
            if ((asdyVar4.b & 4) != 0 && (avxsVar = asdyVar4.f) == null) {
                avxsVar = avxs.a;
            }
            if (irzVar.q && !irzVar.z.bI()) {
                irzVar.g.e(avxsVar);
                irzVar.z.bC(irzVar.g);
                irzVar.z.bB(irzVar.g);
                irzVar.z.bJ(irzVar.g.i(), irzVar.g.b);
            }
            irz irzVar2 = this.s;
            if (this.W.g) {
                this.ak.g();
                z = true;
            }
            asdy asdyVar5 = this.W;
            int i2 = asdyVar5.h;
            irzVar2.n = z;
            if (z) {
                irzVar2.p = i2;
            }
            if ((asdyVar5.b & 128) != 0) {
                asdx asdxVar = asdyVar5.k;
                if (asdxVar == null) {
                    asdxVar = asdx.a;
                }
                if ((asdxVar.b & 1) != 0) {
                    isf isfVar2 = this.Z;
                    asdx asdxVar2 = this.W.k;
                    if (asdxVar2 == null) {
                        asdxVar2 = asdx.a;
                    }
                    int dn = amkq.dn(asdxVar2.c);
                    if (dn == 0) {
                        dn = 1;
                    }
                    isfVar2.e(dn);
                    this.at = !this.W.n;
                    t();
                    this.Y.a();
                }
            }
            this.Z.e(2);
            this.at = !this.W.n;
            t();
            this.Y.a();
        }
    }

    public final void E(final astx astxVar) {
        this.h.execute(new Runnable() { // from class: iqz
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                boolean z;
                int i2;
                UploadActivity uploadActivity = UploadActivity.this;
                astx astxVar2 = astxVar;
                avwv b = uploadActivity.s.r ? uploadActivity.n.b() : null;
                aone createBuilder = avsu.a.createBuilder();
                ArrayList arrayList = new ArrayList();
                Intent intent = uploadActivity.getIntent();
                if (intent != null) {
                    Bundle extras = uploadActivity.getIntent().getExtras();
                    if (extras != null) {
                        String string = extras.getString("android.intent.extra.TITLE");
                        String string2 = extras.getString("android.intent.extra.SUBJECT");
                        String string3 = extras.getString("android.intent.extra.TEXT");
                        if (string != null) {
                            aone createBuilder2 = askp.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            askp askpVar = (askp) createBuilder2.instance;
                            askpVar.b |= 1;
                            askpVar.e = "android.intent.extra.TITLE";
                            createBuilder2.copyOnWrite();
                            askp askpVar2 = (askp) createBuilder2.instance;
                            askpVar2.c = 2;
                            askpVar2.d = string;
                            arrayList.add((askp) createBuilder2.build());
                        }
                        if (string2 != null) {
                            aone createBuilder3 = askp.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            askp askpVar3 = (askp) createBuilder3.instance;
                            askpVar3.b |= 1;
                            askpVar3.e = "android.intent.extra.SUBJECT";
                            createBuilder3.copyOnWrite();
                            askp askpVar4 = (askp) createBuilder3.instance;
                            askpVar4.c = 2;
                            askpVar4.d = string2;
                            arrayList.add((askp) createBuilder3.build());
                        }
                        if (string3 != null) {
                            aone createBuilder4 = askp.a.createBuilder();
                            createBuilder4.copyOnWrite();
                            askp askpVar5 = (askp) createBuilder4.instance;
                            askpVar5.b |= 1;
                            askpVar5.e = "android.intent.extra.TEXT";
                            createBuilder4.copyOnWrite();
                            askp askpVar6 = (askp) createBuilder4.instance;
                            askpVar6.c = 2;
                            askpVar6.d = string3;
                            arrayList.add((askp) createBuilder4.build());
                        }
                        i = 0;
                        z = extras.getBoolean("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false);
                    } else {
                        i = 0;
                        z = false;
                    }
                    i2 = akva.l(intent) == 7 ? 4 : 2;
                    if (akva.g(intent)) {
                        createBuilder.copyOnWrite();
                        avsu avsuVar = (avsu) createBuilder.instance;
                        avsuVar.b |= 2;
                        avsuVar.d = true;
                    }
                    if (!TextUtils.isEmpty(uploadActivity.ah)) {
                        String str = uploadActivity.ah;
                        createBuilder.copyOnWrite();
                        avsu avsuVar2 = (avsu) createBuilder.instance;
                        str.getClass();
                        avsuVar2.b |= 1;
                        avsuVar2.c = str;
                    }
                } else {
                    i = 0;
                    z = false;
                    i2 = 2;
                }
                gou gouVar = uploadActivity.ac;
                gou gouVar2 = gou.PUBLIC;
                wjb wjbVar = wjb.STARTED;
                int ordinal = gouVar.ordinal();
                if (ordinal == 0) {
                    i = 2;
                } else if (ordinal == 1) {
                    i = 3;
                } else if (ordinal == 2) {
                    i = 1;
                }
                akxy akxyVar = uploadActivity.t;
                irf irfVar = new irf(uploadActivity);
                avsu avsuVar3 = (avsu) createBuilder.build();
                ammv ammvVar = uploadActivity.ag;
                aasp aaspVar = akxyVar.g;
                aone createBuilder5 = asdw.a.createBuilder();
                if (b != null) {
                    createBuilder5.copyOnWrite();
                    asdw asdwVar = (asdw) createBuilder5.instance;
                    asdwVar.d = b;
                    asdwVar.b |= 2;
                }
                if (astxVar2 != null) {
                    createBuilder5.copyOnWrite();
                    asdw asdwVar2 = (asdw) createBuilder5.instance;
                    asdwVar2.e = astxVar2;
                    asdwVar2.b |= 8;
                }
                createBuilder5.copyOnWrite();
                asdw asdwVar3 = (asdw) createBuilder5.instance;
                aony aonyVar = asdwVar3.f;
                if (!aonyVar.c()) {
                    asdwVar3.f = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) arrayList, (List) asdwVar3.f);
                if (i != 0) {
                    createBuilder5.copyOnWrite();
                    asdw asdwVar4 = (asdw) createBuilder5.instance;
                    asdwVar4.g = i - 1;
                    asdwVar4.b |= 16;
                }
                if (avsuVar3 != null) {
                    createBuilder5.copyOnWrite();
                    asdw asdwVar5 = (asdw) createBuilder5.instance;
                    asdwVar5.j = avsuVar3;
                    asdwVar5.b |= 128;
                }
                if (ammvVar.h()) {
                    aone createBuilder6 = asdv.a.createBuilder();
                    boolean z2 = ((alar) ammvVar.c()).b;
                    createBuilder6.copyOnWrite();
                    asdv asdvVar = (asdv) createBuilder6.instance;
                    asdvVar.b |= 1;
                    asdvVar.c = z2;
                    asdv asdvVar2 = (asdv) createBuilder6.build();
                    createBuilder5.copyOnWrite();
                    asdw asdwVar6 = (asdw) createBuilder5.instance;
                    asdvVar2.getClass();
                    asdwVar6.l = asdvVar2;
                    asdwVar6.b |= 512;
                }
                createBuilder5.copyOnWrite();
                asdw asdwVar7 = (asdw) createBuilder5.instance;
                asdwVar7.h = i2 - 1;
                asdwVar7.b |= 32;
                createBuilder5.copyOnWrite();
                asdw asdwVar8 = (asdw) createBuilder5.instance;
                asdwVar8.b |= 64;
                asdwVar8.i = z;
                createBuilder5.copyOnWrite();
                asdw asdwVar9 = (asdw) createBuilder5.instance;
                asdwVar9.b |= 256;
                asdwVar9.k = true;
                akxl akxlVar = new akxl(akxyVar.f, akxyVar.a.c(), (asdw) createBuilder5.build(), null, null, null);
                akxlVar.m(aaef.b);
                aaspVar.e(akxlVar, irfVar);
            }
        });
    }

    public final void F() {
        this.Y.a();
        this.Y.c();
    }

    public final void G() {
        avst avstVar;
        asdy asdyVar = this.W;
        if (asdyVar != null) {
            aone builder = asdyVar.toBuilder();
            int size = ((asdy) builder.instance).d.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (((asdz) ((asdy) builder.instance).d.get(size)).b == 334359378) {
                    builder.copyOnWrite();
                    asdy asdyVar2 = (asdy) builder.instance;
                    asdyVar2.a();
                    asdyVar2.d.remove(size);
                }
            }
            builder.copyOnWrite();
            asdy asdyVar3 = (asdy) builder.instance;
            asdyVar3.m = null;
            int i = asdyVar3.b & (-513);
            asdyVar3.b = i;
            if ((i & 2048) != 0) {
                asdz asdzVar = asdyVar3.o;
                if (asdzVar == null) {
                    asdzVar = asdz.a;
                }
                if (asdzVar.b == 334359378) {
                    asdz asdzVar2 = ((asdy) builder.instance).o;
                    if (asdzVar2 == null) {
                        asdzVar2 = asdz.a;
                    }
                    if (asdzVar2.b == 334359378) {
                        avstVar = (avst) asdzVar2.c;
                    } else {
                        avstVar = avst.a;
                    }
                    this.aB = avstVar;
                    asdz asdzVar3 = ((asdy) builder.instance).o;
                    if (asdzVar3 == null) {
                        asdzVar3 = asdz.a;
                    }
                    builder.copyOnWrite();
                    asdy asdyVar4 = (asdy) builder.instance;
                    asdzVar3.getClass();
                    asdyVar4.a();
                    asdyVar4.d.add(asdzVar3);
                    K();
                    builder.copyOnWrite();
                    asdy asdyVar5 = (asdy) builder.instance;
                    asdyVar5.o = null;
                    asdyVar5.b &= -2049;
                    this.W = (asdy) builder.build();
                }
            }
            this.aB = null;
            K();
            builder.copyOnWrite();
            asdy asdyVar52 = (asdy) builder.instance;
            asdyVar52.o = null;
            asdyVar52.b &= -2049;
            this.W = (asdy) builder.build();
        }
    }

    final void H() {
        if (this.W == null) {
            J();
        } else if (!this.k.c().d().equals(this.V)) {
            J();
        } else {
            runOnUiThread(new irc(this, 0));
        }
    }

    @Override // defpackage.euc
    protected final Dialog a(int i) {
        mi miVar = i != 1021 ? null : this.s.f.d;
        if (miVar == null) {
            return null;
        }
        return miVar;
    }

    @Override // defpackage.war
    public final void b() {
        if (this.ar) {
            Intent intent = getIntent();
            String I = I();
            this.x.i(zhq.h(I), avto.UPLOAD_FRONTEND_EVENT_TYPE_PRE_MDE_CHANNEL_CREATION_FAILED, akva.l(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false));
        }
    }

    @Override // defpackage.war
    public final void c() {
        this.ar = true;
        Intent intent = getIntent();
        String I = I();
        this.x.i(zhq.h(I), avto.UPLOAD_FRONTEND_EVENT_TYPE_PRE_MDE_CHANNEL_CREATION_INITIATED, akva.l(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false));
    }

    @Override // defpackage.war
    public final void d() {
        if (this.ar) {
            Intent intent = getIntent();
            String I = I();
            this.x.i(zhq.h(I), avto.UPLOAD_FRONTEND_EVENT_TYPE_PRE_MDE_CHANNEL_CREATION_COMPLETED, akva.l(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false));
            G();
        }
    }

    @Override // defpackage.ips
    public final void g(aqqm aqqmVar) {
    }

    @Override // defpackage.euc
    protected final void h(gng gngVar) {
        boolean ag = evr.ag(((irg) alta.t(this, irg.class)).ce().a());
        if (gngVar != gng.DARK) {
            if (ag) {
                setTheme(R.style.Theme_YouTube_UploadActivity_Light_RemoveStatusBarBackground);
            }
        } else if (ag) {
            setTheme(R.style.Theme_YouTube_UploadActivity_Dark_RemoveStatusBarBackground);
        } else {
            setTheme(R.style.Theme_YouTube_UploadActivity_Dark);
        }
    }

    @Override // defpackage.euc
    public final void j() {
        whu.B(this);
        onBackPressed();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wjc.class};
        }
        if (i == 0) {
            gou gouVar = gou.PUBLIC;
            wjb wjbVar = wjb.STARTED;
            int ordinal = ((wjc) obj).a().ordinal();
            if (ordinal != 1 && ordinal != 2) {
                return null;
            }
            if (this.k.t()) {
                r();
                return null;
            }
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
        return R.id.shared_mde_view;
    }

    @Override // defpackage.iqw
    public final View m() {
        return this.U.d;
    }

    @Override // defpackage.war
    public final void mG() {
        finish();
    }

    @Override // defpackage.iqw, defpackage.euc, defpackage.acqz
    public final acra mM() {
        return this.q;
    }

    @Override // defpackage.iqw
    public final ViewAnimatorHelper n() {
        return (ViewAnimatorHelper) findViewById(R.id.view_animator);
    }

    @Override // defpackage.iqw, defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        irz irzVar = this.s;
        irzVar.m = (wlu) irzVar.a.getSupportFragmentManager().f("verificationFragmentTag");
        wlu wluVar = irzVar.m;
        if (wluVar == null || !wluVar.av()) {
            super.onBackPressed();
        } else {
            irzVar.m.aH();
        }
    }

    @Override // defpackage.euc, defpackage.ml, defpackage.ci, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.euc, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        boolean z;
        Bundle extras;
        byte[] byteArray;
        super.onCreate(bundle);
        this.T.a();
        setContentView(R.layout.upload_activity);
        this.U.a(this);
        setSupportActionBar(this.U.d);
        Intent intent = getIntent();
        this.Y = (LoadingFrameLayout) findViewById(R.id.loading_frame_layout);
        F();
        this.aa = findViewById(R.id.upload_thumbnail_container);
        this.ac = gou.a(this.u.getString(fav.UPLOAD_PRIVACY, gou.PUBLIC.name()));
        this.au = (LinearLayout) findViewById(R.id.account_container);
        this.av = (ViewGroup) findViewById(R.id.account_switcher_container);
        this.ad = (ImageView) findViewById(R.id.account_thumbnail);
        ajju a = ajjv.a();
        a.c = new ird(this);
        this.aw = a.a();
        this.ax = (YouTubeTextView) findViewById(R.id.account_name);
        this.ay = (YouTubeTextView) findViewById(R.id.account_name_secondary);
        this.az = (ImageView) findViewById(R.id.account_switcher_icon);
        this.aC = (FrameLayout) findViewById(R.id.music_disclaimer_container);
        this.aD = (YouTubeTextView) findViewById(R.id.music_disclaimer_banner_notice_message);
        this.aA = findViewById(R.id.recycler_view);
        if (bundle != null) {
            this.V = bundle.getString("helper_active_account_identity");
            if (bundle.getByteArray("helper_get_upload_video_form_response") != null) {
                this.W = (asdy) this.m.a(bundle.getByteArray("helper_get_upload_video_form_response"), asdy.a);
            }
            bundle2 = bundle.getBundle("interaction_bundle");
            if (bundle.containsKey("verification_triggered_metadata_update_request")) {
                try {
                    byte[] byteArray2 = bundle.getByteArray("verification_triggered_metadata_update_request");
                    if (byteArray2 != null) {
                        this.X = (arvt) aonm.parseFrom(arvt.a, byteArray2, aomw.b());
                    }
                } catch (aoob e) {
                    this.al.e("Cannot restore metadata update after verification flow rotation.", e);
                }
            }
        } else {
            bundle2 = null;
        }
        this.q.K(bundle2, (bundle2 != null || intent == null || (extras = intent.getExtras()) == null || (byteArray = extras.getByteArray("navigation_endpoint")) == null) ? null : aahg.c(byteArray));
        int i = 0;
        if (intent != null) {
            this.s.I = TimeUnit.SECONDS.toMicros(intent.getIntExtra("video_time_limit_seconds", 0));
        }
        irz irzVar = this.s;
        if (bundle != null) {
            irzVar.l = bundle.getBoolean("helper_was_cellular_dialog_dismissed_by_user");
            irzVar.m = (wlu) irzVar.a.getSupportFragmentManager().g(bundle, "verification_fragment_key");
            irzVar.o = bundle.getLong("max_known_video_length_key");
            irzVar.p = bundle.getLong("required_length_for_verification_key");
            irzVar.n = bundle.getBoolean("user_verification_eligible_key");
            irzVar.B = (UploadFrontendIdMapHelper) bundle.getParcelable("fid_map_helper_key");
        }
        final irz irzVar2 = this.s;
        acsg acsgVar = this.q;
        acsgVar.getClass();
        irzVar2.h = acsgVar;
        View findViewById = findViewById(android.R.id.content);
        if (!irzVar2.S) {
            int i2 = 1;
            irzVar2.S = true;
            irzVar2.y = (TextView) findViewById.findViewById(R.id.upload_duration);
            irzVar2.u = (ViewAnimatorHelper) findViewById.findViewById(R.id.view_animator);
            irzVar2.w = (ImageView) findViewById.findViewById(R.id.upload_thumbnail);
            irzVar2.x = (ImageView) findViewById.findViewById(R.id.upload_thumbnail_background);
            irzVar2.v = (ScrollView) findViewById.findViewById(R.id.scroll_container);
            irzVar2.a.findViewById(R.id.video_edit_fragment_container).setVisibility(8);
            if (irzVar2.q) {
                dd supportFragmentManager = irzVar2.a.getSupportFragmentManager();
                irzVar2.z = (zyd) supportFragmentManager.f("videoEditFragment");
                if (irzVar2.z == null) {
                    irzVar2.z = new zyd();
                    avuj avujVar = irzVar2.e.a().h;
                    if (avujVar == null) {
                        avujVar = avuj.a;
                    }
                    if (avujVar.t) {
                        z = true;
                    } else {
                        irzVar2.aa.f();
                        z = false;
                    }
                    zyd zydVar = irzVar2.z;
                    zydVar.aM = z;
                    zydVar.aL = false;
                    boolean z2 = irzVar2.r;
                    zydVar.bD(irzVar2.I);
                    zyd zydVar2 = irzVar2.z;
                    zydVar2.aO = z2 ? 1 : 0;
                    zydVar2.aP = irzVar2.s;
                    zydVar2.aQ = irzVar2.d.o;
                    dn k = supportFragmentManager.k();
                    k.q(R.id.video_edit_fragment_container, irzVar2.z, "videoEditFragment");
                    k.a();
                    supportFragmentManager.aa();
                    irzVar2.i.a(zev.e(irzVar2.a.getApplicationContext()), "UPLOADS");
                }
                irzVar2.z.bA(irzVar2.h);
            }
            ScrollView scrollView = irzVar2.v;
            avuj avujVar2 = irzVar2.e.a().h;
            if (avujVar2 == null) {
                avujVar2 = avuj.a;
            }
            if (avujVar2.r) {
                scrollView.findViewById(R.id.coppa_container).setVisibility(0);
                aone createBuilder = apft.a.createBuilder();
                createBuilder.copyOnWrite();
                apft apftVar = (apft) createBuilder.instance;
                apftVar.b |= 2;
                apftVar.c = "yt_android_mfk_upload_LML";
                apft apftVar2 = (apft) createBuilder.build();
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint, apftVar2);
                final apxf apxfVar = (apxf) aongVar.build();
                ((TextView) scrollView.findViewById(R.id.learn_more)).setOnClickListener(new View.OnClickListener() { // from class: irr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        irz irzVar3 = irz.this;
                        apxf apxfVar2 = apxfVar;
                        irzVar3.h.I(3, new acqx(acsb.c(85682)), irzVar3.c());
                        irzVar3.c.c(apxfVar2, null);
                    }
                });
            }
            irzVar2.u.c(R.id.shared_mde_view, new irs(irzVar2, i2));
            irzVar2.u.c(R.id.verification_fragment_upload_container, new irs(irzVar2, i));
            irzVar2.j.d((BottomUiContainer) findViewById.findViewById(R.id.bottom_ui_container));
            this.s.t = this;
            isf isfVar = this.Z;
            fzc mH = mH();
            isfVar.d = this;
            mH.a(isfVar.b);
            mH.d(wbs.Q(this, R.attr.ytThemedBlue));
            isfVar.c.a = findViewById(R.id.upload_bottom_button_container);
            isa isaVar = isfVar.c;
            YouTubeTextView youTubeTextView = (YouTubeTextView) findViewById(R.id.upload_bottom_button);
            isaVar.c = youTubeTextView;
            isaVar.d = isaVar.b.a.a(youTubeTextView);
            ynm.n(this, this.aj.a(), hue.o, new ira(this, i2));
            lu supportActionBar = getSupportActionBar();
            supportActionBar.j(true);
            supportActionBar.m(aii.a(this, R.drawable.yt_outline_arrow_left_black_24));
            supportActionBar.A();
            this.w.g(findViewById(android.R.id.content));
            this.q.d(acsb.b(9729), null, this.s.c());
            this.M.d(this.U.d, findViewById(R.id.view_animator), findViewById(R.id.element_fragment));
            int[] iArr = this.S.a;
            return;
        }
        throw new IllegalStateException("Helper UI has already been initialized");
    }

    @Override // defpackage.iqw, defpackage.ml, defpackage.ci, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            irz irzVar = this.s;
            for (alca alcaVar : irzVar.C) {
                UploadFrontendIdMapHelper uploadFrontendIdMapHelper = irzVar.B;
                String e = alcaVar.e();
                akvf akvfVar = irzVar.E;
                if (uploadFrontendIdMapHelper.f(e) && !uploadFrontendIdMapHelper.e(e) && akwd.f(e)) {
                    akvfVar.c(e, avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCELLED_CREATION);
                    uploadFrontendIdMapHelper.b.add(e);
                }
            }
            irzVar.E.B(irzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        finish();
        startActivity(intent);
    }

    @Override // defpackage.iqw, defpackage.ci, android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.T.b();
        this.A.f(new wcy());
        this.A.m(this);
        this.r.e();
        this.aq = false;
        this.s.T = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.aq = true;
        if (this.ao) {
            this.ao = false;
            if (!this.k.t()) {
                this.p.c(this, null, null);
            } else {
                r();
            }
        }
    }

    @Override // defpackage.iqw, defpackage.ci, defpackage.zv, android.app.Activity, defpackage.ahn
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        final irz irzVar = this.s;
        if (i != 0) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        if (irzVar.X) {
            irzVar.X = false;
            gcm d = gcq.d();
            d.d(0);
            d.k(irzVar.a.getString(R.string.upload_external_permission_snackbar_description));
            d.m(irzVar.a.getString(R.string.upload_external_permission_allow_access_button), new View.OnClickListener() { // from class: irq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    irz.this.n();
                }
            });
            irzVar.k.j(d.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.euc, defpackage.ci, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.T.e();
        this.A.g(this);
        this.A.f(new wcy());
        this.s.T = true;
        this.ao = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci
    public final void onResumeFragments() {
        super.onResumeFragments();
        this.r.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zv, defpackage.er, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        arvt arvtVar;
        super.onSaveInstanceState(bundle);
        bundle.putBundle("interaction_bundle", this.q.J());
        bundle.putString("helper_active_account_identity", this.V);
        asdy asdyVar = this.W;
        if (asdyVar != null) {
            bundle.putByteArray("helper_get_upload_video_form_response", asdyVar.toByteArray());
        }
        irz irzVar = this.s;
        bundle.putLong("max_known_video_length_key", irzVar.o);
        bundle.putLong("required_length_for_verification_key", irzVar.p);
        bundle.putBoolean("user_verification_eligible_key", irzVar.n);
        bundle.putBoolean("helper_was_cellular_dialog_dismissed_by_user", irzVar.l);
        dd supportFragmentManager = irzVar.a.getSupportFragmentManager();
        if (irzVar.q()) {
            supportFragmentManager.L(bundle, "verification_fragment_key", irzVar.m);
        }
        bundle.putParcelable("fid_map_helper_key", irzVar.B);
        if (!this.s.q() || (arvtVar = this.X) == null) {
            return;
        }
        bundle.putByteArray("verification_triggered_metadata_update_request", arvtVar.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.euc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.an = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.an = false;
        if (this.ap) {
            this.s.j();
            this.ap = false;
        }
    }

    @Override // defpackage.iqw
    public final ammv p() {
        String stringExtra = getIntent().getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path");
        Long e = akva.e(getIntent());
        iqv iqvVar = null;
        if (TextUtils.isEmpty(stringExtra) || e == null) {
            this.al.d("Invalid model for the requested Thumbnail configuration.");
        } else {
            try {
                iqvVar = new iqv(Uri.fromFile(new File(stringExtra)), zhq.i((int) TimeUnit.MILLISECONDS.toSeconds(e.longValue())));
            } catch (RuntimeException e2) {
                this.al.e("Error while parsing Thumbnail data.", e2);
            }
        }
        return ammv.i(iqvVar);
    }

    public final void r() {
        String stringExtra;
        if (this.an && this.k.t()) {
            if (this.ap) {
                H();
                return;
            }
            irz irzVar = this.s;
            Intent intent = getIntent();
            this.p.getClass();
            intent.getClass();
            asht k = akwg.k(irzVar.C, irzVar.U);
            irzVar.h.n(new acqx(acsb.c(9701)));
            irzVar.h.w(new acqx(acsb.c(9701)), k);
            irzVar.h.n(new acqx(acsb.c(9702)));
            irzVar.h.w(new acqx(acsb.c(9702)), k);
            if (irzVar.a.findViewById(R.id.coppa_container).getVisibility() == 0) {
                irzVar.h.n(new acqx(acsb.c(85682)));
            }
            irzVar.g(13618, k);
            irzVar.g(13617, k);
            irzVar.g(13616, k);
            irzVar.g(13619, k);
            irzVar.g(13620, k);
            irzVar.g(13621, k);
            irzVar.V = akva.c(intent);
            akva akvaVar = irzVar.G;
            acra acraVar = irzVar.h;
            String str = irzVar.U;
            aloh alohVar = irzVar.ab;
            ArrayList arrayList = new ArrayList();
            String action = intent.getAction();
            if (action != null) {
                if (action.equals("com.google.android.youtube.intent.action.UPLOAD") || action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
                    acraVar.I(3, new acqx(acrb.UPLOAD_VIDEO_ACTION_UPLOAD_INTENT), akwg.j(str, null));
                    Uri data = intent.getData();
                    if (data != null) {
                        akuy a = akuz.a(data);
                        a.c = ammv.i(intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path"));
                        if (!TextUtils.isEmpty(str)) {
                            a.b = ammv.j(str);
                        }
                        arrayList.add(a.a());
                    }
                } else if (action.equals("android.intent.action.SEND_MULTIPLE") && intent.hasExtra("android.intent.extra.STREAM")) {
                    acraVar.I(3, new acqx(acrb.UPLOAD_VIDEO_ACTION_SEND_MULTIPLE_INTENT), asht.a);
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        Object obj = extras.get("android.intent.extra.STREAM");
                        if (obj instanceof ArrayList) {
                            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                            if (parcelableArrayListExtra != null) {
                                int size = parcelableArrayListExtra.size();
                                for (int i = 0; i < size; i++) {
                                    Parcelable parcelable = (Parcelable) parcelableArrayListExtra.get(i);
                                    if (parcelable instanceof Uri) {
                                        arrayList.add(akuz.a((Uri) parcelable).a());
                                    }
                                }
                            }
                        } else if ((obj instanceof String) && (stringExtra = intent.getStringExtra("android.intent.extra.STREAM")) != null) {
                            Iterator it = amnm.b(',').f(stringExtra).iterator();
                            while (it.hasNext()) {
                                arrayList.add(akuz.a(Uri.parse((String) it.next())).a());
                            }
                        }
                    }
                } else if (action.equals("android.intent.action.SEND")) {
                    acraVar.I(3, new acqx(acrb.UPLOAD_VIDEO_ACTION_SEND_INTENT), asht.a);
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        Parcelable parcelable2 = extras2.getParcelable("android.intent.extra.STREAM");
                        if (parcelable2 instanceof Uri) {
                            arrayList.add(akuz.a((Uri) parcelable2).a());
                        }
                    }
                }
            }
            irzVar.R = arrayList;
            Iterator it2 = irzVar.R.iterator();
            while (it2.hasNext()) {
                akuz akuzVar = (akuz) it2.next();
                if (akuzVar == null || Uri.EMPTY.equals(akuzVar.a)) {
                    it2.remove();
                }
            }
            if (irzVar.R.isEmpty()) {
                zga.l("no media content uri(s)");
                irzVar.h.I(3, new acqx(acsb.c(13619)), irzVar.c());
                whu.K(irzVar.a, R.string.error_generic, 1);
                irzVar.d();
            } else {
                if (irzVar.B == null) {
                    irzVar.B = new UploadFrontendIdMapHelper(irzVar.R.size());
                }
                irzVar.K = true;
                irzVar.k();
            }
            this.ap = true;
            H();
        }
    }

    @Override // defpackage.iqw
    public final void s() {
        isf isfVar = this.Z;
        isfVar.f = !this.O;
        isfVar.c();
    }

    @Override // defpackage.iqw
    public final void u(aone aoneVar) {
        this.X = (arvt) aoneVar.build();
        this.s.f();
    }

    @Override // defpackage.iqw
    protected final void x() {
        irz irzVar = this.s;
        irzVar.h.I(3, new acqx(acsb.c(9702)), akwg.k(irzVar.C, irzVar.U));
        super.x();
        Intent intent = getIntent();
        if (intent == null || "com.google.android.youtube.intent.action.INTERNAL_UPLOAD".equals(intent.getAction()) || isTaskRoot()) {
            return;
        }
        Intent r = this.am.r();
        r.setFlags(67108864);
        startActivity(r);
    }

    public final void t() {
        if (this.ab && this.at) {
            this.aa.setVisibility(0);
        } else {
            this.aa.setVisibility(8);
        }
    }

    public final void v() {
        asdy asdyVar = this.W;
        if (asdyVar == null || (asdyVar.b & 32) == 0) {
            this.s.f();
            return;
        }
        aahd aahdVar = this.i;
        apxf apxfVar = asdyVar.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.a(apxfVar);
    }
}
