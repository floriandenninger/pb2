package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatPopUpItemContainerLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.PollRendererOuterClass;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpo implements abgn, abju {
    private final ImageView A;
    private final TextView B;
    private final TextView C;
    private final ViewGroup D;
    private ammv E;
    public final Context a;
    public final aahd b;
    public final abgd c;
    public final abjv d;
    public final acra e;
    public final Handler h;
    public final View i;
    public final LiveChatPopUpItemContainerLayout j;
    public final TextView k;
    public final ViewGroup l;
    public final View m;
    public asop n;
    public audq o;
    public ObjectAnimator p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final aoae t;
    private final ajut u;
    private final ajjz v;
    private final aahv w;
    private final abge x;
    private final ImageButton y;
    private final ImageView z;
    public final List f = new ArrayList();
    public final Runnable g = new abpl(this, 0);
    private ammv F = amlr.a;

    public abpo(Context context, ajut ajutVar, ajjz ajjzVar, aahd aahdVar, Handler handler, abgd abgdVar, aoae aoaeVar, abjv abjvVar, aahv aahvVar, abge abgeVar, ViewGroup viewGroup, acra acraVar, byte[] bArr) {
        this.a = new ContextThemeWrapper(context, R.style.Themed_YouTube_LiveChat_Dark);
        this.u = ajutVar;
        this.v = ajjzVar;
        this.b = aahdVar;
        this.h = handler;
        this.c = abgdVar;
        this.t = aoaeVar;
        this.d = abjvVar;
        this.w = aahvVar;
        this.m = viewGroup;
        this.x = abgeVar;
        this.e = acraVar;
        LiveChatPopUpItemContainerLayout liveChatPopUpItemContainerLayout = (LiveChatPopUpItemContainerLayout) viewGroup.findViewById(R.id.live_chat_poll_container);
        this.j = liveChatPopUpItemContainerLayout;
        View findViewById = viewGroup.findViewById(R.id.live_chat_poll);
        this.i = findViewById;
        this.y = (ImageButton) findViewById.findViewById(R.id.live_chat_poll_context_menu_toggle);
        this.k = (TextView) findViewById.findViewById(R.id.poll_metadata_text);
        this.z = (ImageView) findViewById.findViewById(R.id.poll_thumbnail);
        this.A = (ImageView) findViewById.findViewById(R.id.poll_question_thumbnail);
        this.B = (TextView) findViewById.findViewById(R.id.poll_question_text);
        this.C = (TextView) findViewById.findViewById(R.id.poll_question_subtext);
        this.l = (ViewGroup) findViewById.findViewById(R.id.poll_choices_container);
        this.D = (ViewGroup) viewGroup.findViewById(R.id.error_snackbar_container);
        liveChatPopUpItemContainerLayout.c = true;
        liveChatPopUpItemContainerLayout.d = new abpj(this);
    }

    private final void l() {
        if (!ammx.e((String) this.F.f())) {
            ((ayqx) this.E.c()).qc();
        }
        this.F = amlr.a;
        this.E = amlr.a;
    }

    @Override // defpackage.abgn
    public final void a(String str) {
        allo.n(this.D, str, 0).h();
        for (abph abphVar : this.f) {
            abphVar.i = false;
            abphVar.a.setClickable(true);
            abphVar.e.setVisibility(8);
            abphVar.f.setVisibility(8);
            abphVar.d.setStroke(abphVar.g.getResources().getDimensionPixelOffset(R.dimen.live_chat_polls_choice_stroke_width), aih.f(abphVar.g, R.color.yt_white1_opacity30));
        }
        this.r = true;
    }

    @Override // defpackage.abju
    public final int b() {
        return 1;
    }

    @Override // defpackage.abju
    public final void c() {
        e(true, false, false);
    }

    public final void d() {
        this.f.clear();
        this.l.removeAllViews();
        this.f.clear();
    }

    public final void e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            if (!z) {
                this.j.setVisibility(8);
                this.s = false;
                if (z2) {
                    d();
                }
                if (z3) {
                    return;
                }
                f();
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.j, (Property<LiveChatPopUpItemContainerLayout, Float>) View.TRANSLATION_Y, this.j.getTranslationY(), this.j.getHeight());
            this.p = ofFloat;
            ofFloat.setDuration(300L);
            this.p.setInterpolator(new DecelerateInterpolator());
            this.p.addListener(new abpm(this, z2, z3));
            this.p.start();
        }
    }

    public final void f() {
        asop asopVar = this.n;
        if ((asopVar.b & 16) != 0) {
            apxf apxfVar = asopVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            this.x.a(amru.r(apxfVar), this.c, true);
        }
    }

    public final void g(audq audqVar) {
        if ((audqVar.b & 16384) == 0) {
            l();
            return;
        }
        String str = audqVar.m;
        if (Objects.equals(this.F.f(), str)) {
            return;
        }
        l();
        ammv j = ammv.j(str);
        this.F = j;
        if (ammx.e((String) j.f())) {
            return;
        }
        this.E = ammv.j(this.w.c().h((String) this.F.c(), true).L(oht.s).Y(zcz.s).k(asqq.class).ab(ayqr.a()).ax(new ayrs() { // from class: abpk
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                abpo abpoVar = abpo.this;
                asqq asqqVar = (asqq) obj;
                if ((asqqVar.c.b & 2) != 0) {
                    abpoVar.k.setText(ajcq.b(asqqVar.getMetadataText()));
                    abpoVar.k.setVisibility(0);
                }
                if (abpoVar.q) {
                    Map pollChoiceStatesMap = asqqVar.getPollChoiceStatesMap();
                    for (int i = 0; i < abpoVar.f.size(); i++) {
                        abph abphVar = (abph) abpoVar.f.get(i);
                        asqr asqrVar = ((asqm) pollChoiceStatesMap.get(Integer.valueOf(i))).b;
                        if ((asqrVar.b & 1) != 0) {
                            ClipDrawable clipDrawable = abphVar.c;
                            ObjectAnimator.ofInt(clipDrawable, "level", clipDrawable.getLevel(), (int) (asqrVar.c * 10000.0d)).setDuration(500L).start();
                        }
                        if ((asqrVar.b & 2) == 0) {
                            abphVar.b.setVisibility(8);
                        } else {
                            TextView textView = abphVar.b;
                            aqyg aqygVar = asqrVar.d;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                            textView.setText(ajcq.b(aqygVar));
                            abphVar.b.setVisibility(0);
                        }
                    }
                }
            }
        }));
    }

    public final void h(audp audpVar, boolean z) {
        aots aotsVar;
        if ((audpVar.b & 64) != 0) {
            aulq aulqVar = audpVar.h;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                aulq aulqVar2 = audpVar.h;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                final apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                if ((apmgVar.b & 32) != 0) {
                    ImageButton imageButton = this.y;
                    Context context = this.a;
                    ajut ajutVar = this.u;
                    arfs arfsVar = apmgVar.g;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b = arfr.b(arfsVar.c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    imageButton.setImageDrawable(aii.a(context, ajutVar.a(b)));
                }
                if ((apmgVar.b & 131072) != 0) {
                    aott aottVar = apmgVar.s;
                    if (aottVar == null) {
                        aottVar = aott.a;
                    }
                    aotsVar = aottVar.c;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                } else {
                    aotsVar = apmgVar.r;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                }
                if ((apmgVar.b & 32768) != 0) {
                    this.y.setOnClickListener(new View.OnClickListener() { // from class: abpi
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            abpo abpoVar = abpo.this;
                            apmg apmgVar2 = apmgVar;
                            aahd aahdVar = abpoVar.b;
                            apxf apxfVar = apmgVar2.p;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar.c(apxfVar, null);
                        }
                    });
                }
                if (!aotsVar.c.isEmpty()) {
                    this.y.setContentDescription(aotsVar.c);
                }
            }
        }
        if ((audpVar.b & 4) != 0) {
            ajjz ajjzVar = this.v;
            ImageView imageView = this.z;
            avgg avggVar = audpVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            this.z.setVisibility(0);
        } else if (z) {
            this.z.setVisibility(8);
        }
        if ((audpVar.b & 8) != 0) {
            ajjz ajjzVar2 = this.v;
            ImageView imageView2 = this.A;
            avgg avggVar2 = audpVar.e;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            ajjzVar2.h(imageView2, avggVar2);
            this.A.setVisibility(0);
        } else if (z) {
            this.A.setVisibility(8);
        }
        if ((audpVar.b & 2) != 0) {
            TextView textView = this.B;
            aqyg aqygVar = audpVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.G(textView, ajcq.b(aqygVar));
        } else if (z) {
            this.B.setVisibility(8);
        }
        if ((audpVar.b & 16) != 0) {
            TextView textView2 = this.k;
            aqyg aqygVar2 = audpVar.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            whu.G(textView2, ajcq.b(aqygVar2));
        } else if (z) {
            this.k.setVisibility(8);
        }
        if ((audpVar.b & 32) == 0) {
            if (z) {
                this.C.setVisibility(8);
            }
        } else {
            TextView textView3 = this.C;
            aqyg aqygVar3 = audpVar.g;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            whu.G(textView3, ajcq.b(aqygVar3));
            this.C.setVisibility(0);
        }
    }

    @Override // defpackage.abju
    public final void i() {
        this.j.setVisibility(4);
        this.j.post(new abpl(this, 1));
    }

    public final void j(audq audqVar) {
        if (k(audqVar)) {
            if ((audqVar.b & 2) != 0) {
                aulq aulqVar = audqVar.e;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(PollRendererOuterClass.pollHeaderRenderer)) {
                    h((audp) aulqVar.pX(PollRendererOuterClass.pollHeaderRenderer), false);
                }
            }
            if (this.q) {
                this.h.removeCallbacks(this.g);
            }
            for (int i = 0; i < audqVar.f.size(); i++) {
                ((abph) this.f.get(i)).a((audo) audqVar.f.get(i), Boolean.valueOf(this.q));
            }
            g(audqVar);
        }
    }

    public final boolean k(audq audqVar) {
        audq audqVar2;
        if (audqVar == null || (audqVar2 = this.o) == null) {
            return false;
        }
        return TextUtils.equals(audqVar2.c == 13 ? (String) audqVar2.d : "", audqVar.c == 13 ? (String) audqVar.d : "") && this.f.size() == audqVar.f.size();
    }
}
