package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class npw extends nop implements fyv {
    public final Activity d;
    public final afsy e;
    public final aftn f;
    public fsg g;
    public ViewGroup h;
    public Button i;
    public long j;
    public int k;
    private final Context l;
    private final ajjz m;
    private final aahd n;
    private final acra o;
    private final nrx p;
    private final fyx q;
    private aqlc r;
    private fsm s;
    private fsn t;
    private fso u;
    private ajyd v;
    private ViewGroup w;
    private YouTubeTextView x;
    private fsl y;

    public npw(Context context, azrw azrwVar, Activity activity, ajjz ajjzVar, aahd aahdVar, acra acraVar, afsy afsyVar, aftn aftnVar, fyx fyxVar, aaea aaeaVar) {
        super(acraVar, aaeaVar);
        this.l = context;
        nrx nrxVar = (nrx) azrwVar.get();
        this.p = nrxVar;
        this.d = activity;
        this.m = ajjzVar;
        this.n = aahdVar;
        this.o = acraVar;
        this.e = afsyVar;
        this.f = aftnVar;
        this.q = fyxVar;
        nrxVar.h = acraVar;
        this.k = 1;
    }

    private final void e(ViewGroup viewGroup, String str) {
        SpannableStringBuilder spannableStringBuilder;
        HashMap hashMap;
        aqyg aqygVar;
        this.h = (ViewGroup) viewGroup.findViewById(R.id.scroll_view);
        fsl fslVar = new fsl((ViewGroup) this.h.findViewById(R.id.campaign_group), false, this.m);
        this.y = fslVar;
        fslVar.a(this.r);
        fsn fsnVar = new fsn(this.l, this.n, (ViewGroup) this.h.findViewById(R.id.nonprofit_group));
        this.t = fsnVar;
        aqlc aqlcVar = this.r;
        YouTubeTextView youTubeTextView = fsnVar.c;
        aqyg aqygVar2 = aqlcVar.m;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(youTubeTextView, ajcq.b(aqygVar2));
        fsnVar.d.c();
        aqyg aqygVar3 = aqlcVar.n;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        int size = aqygVar3.c.size();
        YouTubeTextView youTubeTextView2 = fsnVar.d;
        aqyg aqygVar4 = aqlcVar.n;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        if (aqygVar4 == null) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(aahk.a(aqygVar4, fsnVar.b, false));
            if (spannableStringBuilder.length() != 0 && size > 1) {
                int length = spannableStringBuilder.length();
                int length2 = spannableStringBuilder.length();
                String valueOf = String.valueOf(spannableStringBuilder.subSequence(spannableStringBuilder.length() - 1, spannableStringBuilder.length()));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
                sb.append(valueOf);
                sb.append("  ");
                spannableStringBuilder.replace(length - 1, length2, (CharSequence) sb.toString());
                Context context = fsnVar.a;
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.quantum_ic_open_in_new_black_12);
                Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), Math.max(fsnVar.d.getLineHeight(), decodeResource.getHeight()), Bitmap.Config.ARGB_8888);
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(wbs.W(fsnVar.a, R.attr.ytCallToAction).orElse(0), PorterDuff.Mode.SRC_IN));
                new Canvas(createBitmap).drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                spannableStringBuilder.setSpan(new ImageSpan(context, createBitmap), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            }
        }
        whu.G(youTubeTextView2, spannableStringBuilder);
        Button button = (Button) viewGroup.findViewById(R.id.donation_button);
        this.i = button;
        whu.E(button, button.getBackground());
        this.v = new ajyd(this.n, new aoae((short[]) null), this.i, null);
        apmh apmhVar = this.r.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = this.r.f;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if (str != null) {
                hashMap = new HashMap();
                hashMap.put("engagement_panel_id_key", str);
            } else {
                hashMap = null;
            }
            Button button2 = this.i;
            if ((apmgVar.b & 256) != 0) {
                aqygVar = apmgVar.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(button2, ajcq.b(aqygVar));
            this.v.a(apmgVar, this.a, hashMap);
        }
        this.o.u(new acqx(this.r.z), null);
    }

    @Override // defpackage.nqg
    public final void B() {
    }

    @Override // defpackage.nqg
    public final void C() {
    }

    @Override // defpackage.nqg
    public final void D(apxf apxfVar) {
    }

    @Override // defpackage.nqg
    public final void F(nqd nqdVar) {
    }

    @Override // defpackage.nqg
    public final nqb b() {
        return this.p;
    }

    public final void c() {
        apmh apmhVar = this.r.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = this.r.f;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            apxf apxfVar = apmgVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
                aone builder = ((YpcGetCartEndpoint$YPCGetCartEndpoint) apxfVar.pX(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).toBuilder();
                long j = this.j;
                builder.copyOnWrite();
                YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) builder.instance;
                ypcGetCartEndpoint$YPCGetCartEndpoint.b |= 1024;
                ypcGetCartEndpoint$YPCGetCartEndpoint.k = j;
                int i = this.k;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 == 1 || i2 == 2) {
                        aone createBuilder = avit.a.createBuilder();
                        aone createBuilder2 = avis.a.createBuilder();
                        boolean z = this.k == 2;
                        createBuilder2.copyOnWrite();
                        avis avisVar = (avis) createBuilder2.instance;
                        avisVar.b |= 2;
                        avisVar.c = z;
                        createBuilder.copyOnWrite();
                        avit avitVar = (avit) createBuilder.instance;
                        avis avisVar2 = (avis) createBuilder2.build();
                        avisVar2.getClass();
                        avitVar.d = avisVar2;
                        avitVar.b = 2 | avitVar.b;
                        builder.copyOnWrite();
                        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint2 = (YpcGetCartEndpoint$YPCGetCartEndpoint) builder.instance;
                        avit avitVar2 = (avit) createBuilder.build();
                        avitVar2.getClass();
                        ypcGetCartEndpoint$YPCGetCartEndpoint2.l = avitVar2;
                        ypcGetCartEndpoint$YPCGetCartEndpoint2.b |= 2048;
                    }
                    aahd aahdVar = this.n;
                    aong aongVar = (aong) apxfVar.toBuilder();
                    aongVar.e(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, (YpcGetCartEndpoint$YPCGetCartEndpoint) builder.build());
                    apxf apxfVar2 = (apxf) aongVar.build();
                    apmh apmhVar3 = this.r.f;
                    if (apmhVar3 == null) {
                        apmhVar3 = apmh.a;
                    }
                    apmg apmgVar2 = apmhVar3.c;
                    if (apmgVar2 == null) {
                        apmgVar2 = apmg.a;
                    }
                    aahdVar.c(apxfVar2, acrc.i(apmgVar2, true));
                    return;
                }
                throw null;
            }
        }
    }

    public final void d() {
        this.h.post(new Runnable() { // from class: npu
            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup viewGroup = npw.this.h;
                viewGroup.scrollTo(0, viewGroup.getBottom());
            }
        });
    }

    @Override // defpackage.fyv
    public final void f(String str, aqlc aqlcVar) {
        aqlc aqlcVar2 = this.r;
        if (aqlcVar2 == null || !aqlcVar2.y.equals(str)) {
            return;
        }
        this.u.a(aqlcVar);
    }

    @Override // defpackage.nqg
    public final void n() {
    }

    @Override // defpackage.nqg
    public final void o(apxf apxfVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)).getClass();
        aqts aqtsVar = this.b;
        if (aqtsVar == null) {
            return;
        }
        String i = oba.i(aqtsVar);
        if ("donation_shelf".equals(i)) {
            aqlc aqlcVar = this.r;
            LayoutInflater from = LayoutInflater.from(this.l);
            ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.donation_engagement_panel, (ViewGroup) null, false);
            this.w = viewGroup;
            e(viewGroup, "donation_shelf");
            fso fsoVar = new fso(this.l, (ViewGroup) this.w.findViewById(R.id.progress_group), this.n);
            this.u = fsoVar;
            fsoVar.a(aqlcVar);
            fsm fsmVar = new fsm((ViewGroup) this.w.findViewById(R.id.creator_messages_container), from, this.m);
            this.s = fsmVar;
            for (int i2 = 0; i2 < aqlcVar.p.size(); i2++) {
                ViewGroup viewGroup2 = (ViewGroup) fsmVar.a.getChildAt(i2);
                if (viewGroup2 == null) {
                    viewGroup2 = (ViewGroup) fsmVar.b.inflate(R.layout.donation_creator_message, fsmVar.a, false);
                    fsmVar.a.addView(viewGroup2);
                }
                fsl fslVar = (fsl) fsmVar.a.getTag();
                if (fslVar == null) {
                    fslVar = new fsl(fsmVar.c, viewGroup2);
                    viewGroup2.setTag(fslVar);
                }
                aqla aqlaVar = (aqla) aqlcVar.p.get(i2);
                if ((aqlaVar.b & 1) == 0) {
                    fslVar.b.setVisibility(8);
                } else {
                    fslVar.b.setVisibility(0);
                    ajjz ajjzVar = fslVar.a;
                    ImageView imageView = fslVar.b;
                    avgg avggVar = aqlaVar.c;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    ajjzVar.h(imageView, avggVar);
                }
                YouTubeTextView youTubeTextView = fslVar.c;
                if ((aqlaVar.b & 2) != 0) {
                    aqygVar2 = aqlaVar.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                whu.G(youTubeTextView, ajcq.b(aqygVar2));
                YouTubeTextView youTubeTextView2 = fslVar.d;
                if ((aqlaVar.b & 4) != 0) {
                    aqygVar3 = aqlaVar.e;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                whu.G(youTubeTextView2, ajcq.b(aqygVar3));
            }
            int childCount = fsmVar.a.getChildCount() - aqlcVar.p.size();
            if (childCount > 0) {
                fsmVar.a.removeViews(aqlcVar.p.size(), childCount);
            }
            if (aqlcVar.p.size() > 0) {
                fsmVar.a.setVisibility(0);
            } else {
                fsmVar.a.setVisibility(8);
            }
            YouTubeTextView youTubeTextView3 = (YouTubeTextView) this.w.findViewById(R.id.nonprofit_description_view);
            this.x = youTubeTextView3;
            aqyg aqygVar4 = aqlcVar.o;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            whu.G(youTubeTextView3, ajcq.b(aqygVar4));
            this.q.c(aqlcVar.y, this);
            return;
        }
        if ("donation_amount_picker".equals(i)) {
            aqlc aqlcVar2 = this.r;
            ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(this.l).inflate(R.layout.donation_amount_picker, (ViewGroup) null, false);
            this.w = viewGroup3;
            e(viewGroup3, null);
            if ((aqlcVar2.b & 256) != 0) {
                this.i.setOnClickListener(new View.OnClickListener() { // from class: nps
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        npw npwVar = npw.this;
                        if (npwVar.e.t()) {
                            npwVar.c();
                        } else {
                            npwVar.f.c(npwVar.d, null, new npv(npwVar));
                        }
                    }
                });
            }
            fsg fsgVar = new fsg((YouTubeTextView) this.w.findViewById(R.id.custom_amount_label), (TextInputLayout) this.w.findViewById(R.id.custom_amount_group));
            this.g = fsgVar;
            fsgVar.f = new npt(this);
            fsg fsgVar2 = this.g;
            fsgVar2.e = aqlcVar2;
            YouTubeTextView youTubeTextView4 = fsgVar2.a;
            aqyg aqygVar5 = aqlcVar2.r;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
            youTubeTextView4.setText(ajcq.b(aqygVar5));
            PrefixedEditText prefixedEditText = fsgVar2.c;
            aqyg aqygVar6 = aqlcVar2.s;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            String obj = ajcq.b(aqygVar6).toString();
            prefixedEditText.a = obj;
            prefixedEditText.c = 20;
            prefixedEditText.b = new float[obj.length()];
            prefixedEditText.invalidate();
            fsgVar2.c.addTextChangedListener(fsgVar2.d);
            final fsj fsjVar = new fsj(this.l, (RadioGroup) this.w.findViewById(R.id.predefined_amounts_group), (CheckedTextView) this.w.findViewById(R.id.privacy_checkbox));
            fsjVar.e = new npt(this);
            fsjVar.d = new npt(this);
            if (aqlcVar2.q.size() == 0) {
                npt nptVar = fsjVar.e;
                if (nptVar != null) {
                    nptVar.a(0L);
                }
            } else {
                fsjVar.b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: fsi
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, int i3) {
                        aqle aqleVar;
                        fsj fsjVar2 = fsj.this;
                        if (fsjVar2.e == null || (aqleVar = (aqle) radioGroup.findViewById(i3).getTag()) == null) {
                            return;
                        }
                        fsjVar2.e.a(aqleVar.c);
                    }
                });
                int min = Math.min(aqlcVar2.q.size() - 1, 1);
                int i3 = 0;
                while (i3 < aqlcVar2.q.size()) {
                    aqle aqleVar = (aqle) aqlcVar2.q.get(i3);
                    RadioButton radioButton = (RadioButton) LayoutInflater.from(fsjVar.a).inflate(R.layout.donation_predefined_amount_button, (ViewGroup) fsjVar.b, false);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) radioButton.getLayoutParams();
                    fsjVar.b.addView(radioButton);
                    if ((aqleVar.b & 2) != 0) {
                        aqygVar = aqleVar.d;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    whu.G(radioButton, ajcq.b(aqygVar));
                    whu.E(radioButton, radioButton.getBackground());
                    if (i3 != 0) {
                        if (i3 == aqlcVar2.q.size() - 1) {
                            marginLayoutParams.setMarginStart(0);
                        }
                    } else {
                        marginLayoutParams.setMarginStart(0);
                        i3 = 0;
                    }
                    radioButton.setTag((aqle) aqlcVar2.q.get(i3));
                    if (i3 == min) {
                        radioButton.setChecked(true);
                    }
                    i3++;
                }
                CheckedTextView checkedTextView = fsjVar.c;
                aqyg aqygVar7 = aqlcVar2.w;
                if (aqygVar7 == null) {
                    aqygVar7 = aqyg.a;
                }
                whu.G(checkedTextView, ajcq.b(aqygVar7));
                if ((aqlcVar2.b & 134217728) != 0) {
                    fsjVar.c.setOnClickListener(new View.OnClickListener() { // from class: fsh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            fsj.this.a(!r2.c.isChecked());
                        }
                    });
                    fsjVar.a(aqlcVar2.x);
                }
            }
            d();
        }
    }

    @Override // defpackage.nqg
    public final View oO() {
        return this.w;
    }

    @Override // defpackage.nqg
    public final void oP(ajol ajolVar) {
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void q(aqts aqtsVar, asht ashtVar) {
        auov auovVar;
        auov auovVar2;
        auov auovVar3;
        aqtu aqtuVar;
        aqyg aqygVar;
        aqtu aqtuVar2;
        if (aqtsVar != null) {
            aqtq aqtqVar = aqtsVar.g;
            if (aqtqVar == null) {
                aqtqVar = aqtq.a;
            }
            if (aqtqVar.b == 49399797) {
                auovVar = (auov) aqtqVar.c;
            } else {
                auovVar = auov.a;
            }
            if (auovVar.d.size() != 0) {
                aqtq aqtqVar2 = aqtsVar.g;
                if (aqtqVar2 == null) {
                    aqtqVar2 = aqtq.a;
                }
                if (aqtqVar2.b == 49399797) {
                    auovVar2 = (auov) aqtqVar2.c;
                } else {
                    auovVar2 = auov.a;
                }
                if ((((auoy) auovVar2.d.get(0)).e & 256) != 0) {
                    super.q(aqtsVar, ashtVar);
                    aqtq aqtqVar3 = aqtsVar.g;
                    if (aqtqVar3 == null) {
                        aqtqVar3 = aqtq.a;
                    }
                    if (aqtqVar3.b == 49399797) {
                        auovVar3 = (auov) aqtqVar3.c;
                    } else {
                        auovVar3 = auov.a;
                    }
                    aqlc aqlcVar = ((auoy) auovVar3.d.get(0)).bf;
                    if (aqlcVar == null) {
                        aqlcVar = aqlc.a;
                    }
                    this.r = aqlcVar;
                    aqtr aqtrVar = aqtsVar.f;
                    if (aqtrVar == null) {
                        aqtrVar = aqtr.a;
                    }
                    if (aqtrVar.b != 138681548) {
                        this.p.k(null);
                    } else {
                        nrx nrxVar = this.p;
                        aqtr aqtrVar2 = aqtsVar.f;
                        if (aqtrVar2 == null) {
                            aqtrVar2 = aqtr.a;
                        }
                        if (aqtrVar2.b == 138681548) {
                            aqtuVar = (aqtu) aqtrVar2.c;
                        } else {
                            aqtuVar = aqtu.a;
                        }
                        if ((aqtuVar.b & 1) != 0) {
                            aqtr aqtrVar3 = aqtsVar.f;
                            if (aqtrVar3 == null) {
                                aqtrVar3 = aqtr.a;
                            }
                            if (aqtrVar3.b == 138681548) {
                                aqtuVar2 = (aqtu) aqtrVar3.c;
                            } else {
                                aqtuVar2 = aqtu.a;
                            }
                            aqygVar = aqtuVar2.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        nrxVar.k(ajcq.b(aqygVar));
                    }
                    this.p.j(null);
                    this.p.g(null);
                    return;
                }
            }
        }
        super.q(null, ashtVar);
    }
}
