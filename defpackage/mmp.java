package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmp extends ajpc implements ajog, lua {
    public final ajoi a;
    public aqbw b;
    public luc c;
    private final Context d;
    private final View e;
    private final TextView f;
    private final TextView g;
    private final ImageView h;
    private final TextView i;
    private final mmq j;
    private final mmw k;
    private final jxq l;
    private final mmv m;
    private final ajut n;
    private final gma o;
    private final fhz p;
    private final akbd q;
    private ajok r;

    public mmp(Context context, c cVar, ajoy ajoyVar, ogx ogxVar, oiy oiyVar, aahd aahdVar, ajut ajutVar, gma gmaVar, fhz fhzVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        context.getClass();
        this.d = context;
        this.o = gmaVar;
        this.p = fhzVar;
        this.q = akbdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_list_item, (ViewGroup) null);
        this.e = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.subtitle);
        this.h = (ImageView) inflate.findViewById(R.id.right_icon);
        this.i = (TextView) inflate.findViewById(R.id.activity_count_live_status);
        ajjz ajjzVar = (ajjz) cVar.b.get();
        ajjzVar.getClass();
        ajut ajutVar2 = (ajut) cVar.a.get();
        ajutVar2.getClass();
        inflate.getClass();
        this.j = new mmq(ajjzVar, ajutVar2, inflate);
        jlb jlbVar = (jlb) ajoyVar.a.get();
        jlbVar.getClass();
        inflate.getClass();
        this.k = new mmw(jlbVar, inflate, null);
        aahv aahvVar = (aahv) ogxVar.c.get();
        aahvVar.getClass();
        ayqi ayqiVar = (ayqi) ogxVar.b.get();
        ayqiVar.getClass();
        isn isnVar = (isn) ogxVar.a.get();
        isnVar.getClass();
        isl islVar = (isl) ogxVar.d.get();
        islVar.getClass();
        inflate.getClass();
        this.m = new mmv(aahvVar, ayqiVar, isnVar, islVar, inflate);
        ajoi ajoiVar = new ajoi(aahdVar, inflate);
        this.a = ajoiVar;
        juy juyVar = (juy) oiyVar.b.get();
        juyVar.getClass();
        ypa ypaVar = (ypa) oiyVar.c.get();
        ypaVar.getClass();
        ogx ogxVar2 = (ogx) oiyVar.d.get();
        agyr agyrVar = (agyr) oiyVar.a.get();
        agyrVar.getClass();
        jry jryVar = (jry) oiyVar.e.get();
        jryVar.getClass();
        azrw azrwVar = oiyVar.f;
        inflate.getClass();
        this.l = new jxq(juyVar, ypaVar, ogxVar2, agyrVar, jryVar, azrwVar, inflate, ajoiVar, null, null, null);
        this.n = ajutVar;
        gmaVar.d(new View.OnClickListener() { // from class: mmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mmp mmpVar = mmp.this;
                luc lucVar = mmpVar.c;
                if (lucVar != null) {
                    lucVar.b(mmpVar, mmpVar.b);
                }
                mmpVar.a.onClick(view);
            }
        });
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.o.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.p.d(this);
        this.a.c();
        jxq jxqVar = this.l;
        jxqVar.b.m(jxqVar);
        whu.I(jxqVar.f, false);
        jxqVar.e.setTypeface(Typeface.DEFAULT);
        TextView textView = jxqVar.e;
        textView.setTextColor(wbs.W(textView.getContext(), R.attr.ytTextSecondary).orElse(0));
        jxqVar.h = null;
        jxqVar.i = null;
        jxqVar.j = null;
        Future future = jxqVar.k;
        if (future != null) {
            future.cancel(false);
            jxqVar.k = null;
        }
        jxqVar.f.setClickable(true);
        mmv mmvVar = this.m;
        Object obj = mmvVar.g;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            mmvVar.g = null;
        }
        mmvVar.f.setTextColor(wbs.W(mmvVar.e, R.attr.ytTextSecondary).orElse(0));
        this.k.a();
        luc lucVar = this.c;
        if (lucVar != null) {
            lucVar.d(this);
        }
    }

    @Override // defpackage.lua
    public final void c(boolean z) {
        etx.p(this.d, this.r, this.o, z);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        aqyg aqygVar3;
        aulq aulqVar;
        auar auarVar;
        auar auarVar2;
        avss avssVar;
        aypy W;
        aypy W2;
        aulq aulqVar2;
        arfs arfsVar;
        ViewStub viewStub4;
        aqbw aqbwVar = (aqbw) obj;
        this.r = ajokVar;
        this.b = aqbwVar;
        ammv a = luc.a(ajokVar);
        if (a.h()) {
            luc lucVar = (luc) a.c();
            this.c = lucVar;
            lucVar.c(this, aqbwVar);
        } else {
            this.c = null;
        }
        this.a.b(ajokVar.a, aqbwVar.c == 4 ? (apxf) aqbwVar.d : null, ajokVar.e(), this);
        final int i = 1;
        if ((aqbwVar.b & 1) != 0) {
            aqygVar = aqbwVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        aqbx aqbxVar = aqbwVar.j;
        if (aqbxVar == null) {
            aqbxVar = aqbx.a;
        }
        int av = aobq.av(aqbxVar.b);
        if (av == 0) {
            av = 1;
        }
        ColorStateList S = wbs.S(this.d, R.attr.ytTextPrimary);
        if (av == 4) {
            S = wbs.S(this.d, R.attr.ytCallToAction);
        }
        this.f.setTextColor(S);
        this.f.setText(b);
        if ((aqbwVar.b & 2) != 0) {
            aqygVar2 = aqbwVar.h;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        if (b2 != null) {
            this.g.setText(b2);
        } else {
            this.g.setVisibility(8);
        }
        aqby aqbyVar = aqbwVar.i;
        if (aqbyVar == null) {
            aqbyVar = aqby.a;
        }
        aqbx aqbxVar2 = aqbwVar.j;
        if (aqbxVar2 == null) {
            aqbxVar2 = aqbx.a;
        }
        int av2 = aobq.av(aqbxVar2.b);
        if (av2 == 0) {
            av2 = 1;
        }
        mmq mmqVar = this.j;
        CircularImageView circularImageView = mmqVar.i;
        if (circularImageView != null) {
            circularImageView.setVisibility(8);
        }
        FrameLayout frameLayout = mmqVar.j;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ImageView imageView = mmqVar.l;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TintableImageView tintableImageView = mmqVar.m;
        if (tintableImageView != null) {
            tintableImageView.setVisibility(8);
        }
        final int i2 = 0;
        if (mmq.b(aqbyVar) != null) {
            if (mmqVar.i == null && (viewStub4 = mmqVar.d) != null) {
                mmqVar.i = (CircularImageView) viewStub4.inflate();
            }
            mmqVar.i.setVisibility(0);
            mmqVar.a.h(mmqVar.i, mmq.b(aqbyVar));
        } else if (mmq.c(aqbyVar) != null) {
            if (mmqVar.j == null && (viewStub3 = mmqVar.e) != null) {
                mmqVar.j = (FrameLayout) viewStub3.inflate();
                mmqVar.k = (ImageView) mmqVar.j.findViewById(R.id.image_view);
            }
            mmqVar.j.setVisibility(0);
            mmqVar.a.h(mmqVar.k, mmq.c(aqbyVar));
        } else if (mmq.a(aqbyVar) != null) {
            if (mmqVar.m == null && (viewStub2 = mmqVar.g) != null) {
                mmqVar.m = (TintableImageView) viewStub2.inflate();
            }
            ajut ajutVar = mmqVar.b;
            arfr b3 = arfr.b(mmq.a(aqbyVar).c);
            if (b3 == null) {
                b3 = arfr.UNKNOWN;
            }
            int a2 = ajutVar.a(b3);
            if (a2 == 0) {
                mmqVar.m.setImageDrawable(null);
                mmqVar.m.a(null);
            } else {
                mmqVar.m.setImageResource(a2);
                ColorStateList colorStateList = mmqVar.h;
                if (av2 == 4) {
                    colorStateList = wbs.S(mmqVar.c, R.attr.ytCallToAction);
                }
                mmqVar.m.a(colorStateList);
            }
            mmqVar.m.setVisibility(0);
        } else {
            if (mmqVar.l == null && (viewStub = mmqVar.f) != null) {
                mmqVar.l = (ImageView) viewStub.inflate();
            }
            mmqVar.l.setVisibility(0);
            if (mmq.d(aqbyVar) != null) {
                mmqVar.a.h(mmqVar.l, mmq.d(aqbyVar));
            } else {
                mmqVar.a.e(mmqVar.l);
                mmqVar.l.setImageDrawable(null);
                mmqVar.l.setBackgroundResource(R.color.yt_grey3);
            }
        }
        this.i.setVisibility(8);
        this.h.setVisibility(8);
        int i3 = aqbwVar.e;
        if (i3 == 20) {
            this.h.setVisibility(0);
            ImageView imageView2 = this.h;
            ajut ajutVar2 = this.n;
            if (aqbwVar.e == 20) {
                arfsVar = (arfs) aqbwVar.f;
            } else {
                arfsVar = arfs.a;
            }
            arfr b4 = arfr.b(arfsVar.c);
            if (b4 == null) {
                b4 = arfr.UNKNOWN;
            }
            imageView2.setImageResource(ajutVar2.a(b4));
        } else if (i3 == 5) {
            this.i.setVisibility(0);
            TextView textView = this.i;
            if (aqbwVar.e == 5) {
                aqygVar3 = (aqyg) aqbwVar.f;
            } else {
                aqygVar3 = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar3));
            this.i.setTextColor(wbs.W(this.d, R.attr.ytTextSecondary).orElse(0));
        } else if (i3 == 6) {
            this.i.setVisibility(0);
            this.i.setText(ajcq.b(aqbwVar.e == 6 ? (aqyg) aqbwVar.f : null));
            this.i.setTextColor(wbs.W(this.d, R.attr.ytBrandRed).orElse(0));
        }
        mmw mmwVar = this.k;
        mmwVar.a();
        if (aqbwVar.e == 23) {
            aulqVar = (aulq) aqbwVar.f;
        } else {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.uploadProgressArrowRenderer)) {
            jlb jlbVar = mmwVar.c;
            UploadArrowView uploadArrowView = mmwVar.a;
            if (aqbwVar.e == 23) {
                aulqVar2 = (aulq) aqbwVar.f;
            } else {
                aulqVar2 = aulq.a;
            }
            UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer = (UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) aulqVar2.pX(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.uploadProgressArrowRenderer);
            ayqi ayqiVar = (ayqi) jlbVar.b.get();
            ayqiVar.getClass();
            Context context = (Context) jlbVar.f.get();
            context.getClass();
            aahv aahvVar = (aahv) jlbVar.c.get();
            aahvVar.getClass();
            isn isnVar = (isn) jlbVar.e.get();
            isnVar.getClass();
            isl islVar = (isl) jlbVar.d.get();
            islVar.getClass();
            aadw aadwVar = (aadw) jlbVar.a.get();
            aadwVar.getClass();
            uploadArrowView.getClass();
            uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.getClass();
            mmwVar.b = new itg(ayqiVar, context, aahvVar, isnVar, islVar, aadwVar, new isy(uploadArrowView), uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer);
            mmwVar.b.b(true);
        }
        aqbt aqbtVar = aqbwVar.k;
        if (aqbtVar == null) {
            aqbtVar = aqbt.a;
        }
        if (aqbtVar.b == 328362115) {
            final mmv mmvVar = this.m;
            aqbt aqbtVar2 = aqbwVar.k;
            if (aqbtVar2 == null) {
                aqbtVar2 = aqbt.a;
            }
            if (aqbtVar2.b == 328362115) {
                avssVar = (avss) aqbtVar2.c;
            } else {
                avssVar = avss.a;
            }
            Object obj2 = mmvVar.g;
            if (obj2 != null) {
                ayrz.c((AtomicReference) obj2);
            }
            if ((avssVar.b & 2) == 0) {
                W = aypy.W(false);
            } else {
                W = mmv.a(mmvVar.c.a, avssVar.c);
            }
            if ((avssVar.b & 2) == 0) {
                W2 = aypy.W(false);
            } else {
                W2 = mmv.a(mmvVar.d.a, avssVar.c);
            }
            aypy h = mmvVar.a.c().h(akvs.a, true);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ayqi ayqiVar2 = mmvVar.b;
            aysw.b(timeUnit, "unit is null");
            azky azkyVar = new azky(h, timeUnit, ayqiVar2);
            ayrv ayrvVar = aynu.l;
            mmvVar.g = aypy.o(azkyVar.ab(mmvVar.b), W.ah(false), W2.ah(false), gii.f).L(khf.r).ax(new ayrs() { // from class: mms
                /* JADX WARN: Removed duplicated region for block: B:10:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
                @Override // defpackage.ayrs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(java.lang.Object r10) {
                    /*
                        Method dump skipped, instructions count: 286
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mms.a(java.lang.Object):void");
                }
            });
        } else {
            aqbt aqbtVar3 = aqbwVar.k;
            if (aqbtVar3 == null) {
                aqbtVar3 = aqbt.a;
            }
            if (aqbtVar3.b == 135739232) {
                auarVar = (auar) aqbtVar3.c;
            } else {
                auarVar = auar.a;
            }
            if (!auarVar.c.isEmpty()) {
                final jxq jxqVar = this.l;
                aqbt aqbtVar4 = aqbwVar.k;
                if (aqbtVar4 == null) {
                    aqbtVar4 = aqbt.a;
                }
                if (aqbtVar4.b == 135739232) {
                    auarVar2 = (auar) aqbtVar4.c;
                } else {
                    auarVar2 = auar.a;
                }
                String str = auarVar2.c;
                jxqVar.h = aqbwVar;
                jxqVar.i = str;
                agsl i4 = ((agof) jxqVar.d.get()).a().i();
                String str2 = jxqVar.i;
                str2.getClass();
                if (i4.e(str2) != null) {
                    String str3 = jxqVar.i;
                    zhq.m(str3);
                    if (str3.startsWith("BL")) {
                        ajoi ajoiVar = jxqVar.g;
                        acra acraVar = ajokVar.a;
                        String str4 = jxqVar.i;
                        zhq.m(str4);
                        ajoiVar.b(acraVar, fia.a(str4), ajokVar.e(), null);
                    }
                }
                String str5 = jxqVar.i;
                zhq.m(str5);
                if ("PPSV".equals(str5)) {
                    jxqVar.j = jxqVar.l.e(4, null, jxqVar.f, new View.OnClickListener() { // from class: jxo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (i != 0) {
                                jxqVar.a();
                            } else {
                                jxqVar.a();
                            }
                        }
                    });
                    juy juyVar = jxqVar.a;
                    jxqVar.k = juyVar.d.submit(new jut(juyVar, new jxp(jxqVar, 0), 0));
                    jxqVar.f.setClickable(false);
                } else {
                    jxqVar.j = jxqVar.l.e(1, str5, jxqVar.f, new View.OnClickListener() { // from class: jxo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (i2 != 0) {
                                jxqVar.a();
                            } else {
                                jxqVar.a();
                            }
                        }
                    });
                    jxqVar.k = jxqVar.a.b(str5, new jxp(jxqVar, 1));
                    jxqVar.f.setClickable(true);
                }
                jxqVar.j.a();
                jxqVar.b.g(jxqVar);
            }
        }
        this.p.c(this, aqbwVar.c == 4 ? (apxf) aqbwVar.d : null);
        this.o.e(ajokVar);
        this.q.b(a(), this.q.a(a(), null));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqbw) obj).m.I();
    }

    @Override // defpackage.ajog
    public final void oh(Map map) {
        map.put("com.google.android.libraries.youtube.rendering.presenter.PresentContext", this.r);
    }
}
