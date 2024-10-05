package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatBannerContainerLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatBannerHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatItemRenderer;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abnz implements View.OnClickListener, abps, abju, abnf {
    private final acra A;
    private apxf C;
    private boolean D;
    private apxf E;
    protected final View a;
    final LiveChatBannerContainerLayout b;
    public final ImageView c;
    public final LottieAnimationView d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final aahd h;
    public final ajvb i;
    public final abjv k;
    public abgh l;
    public aulq m;
    public ajom n;
    public ObjectAnimator o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public apxf t;
    public View.OnLayoutChangeListener u;
    protected final aoae v;
    private final ImageButton w;
    private final ViewGroup x;
    private final TextView y;
    private final Handler z;
    public final ajok j = new ajok();
    private final Runnable B = new abnw(this, 0);

    public abnz(Context context, ajvb ajvbVar, abjv abjvVar, aahd aahdVar, aoae aoaeVar, acra acraVar, Handler handler, View view, byte[] bArr) {
        this.h = aahdVar;
        this.a = view;
        this.i = ajvbVar;
        this.v = aoaeVar;
        this.A = acraVar;
        this.k = abjvVar;
        this.z = handler;
        LiveChatBannerContainerLayout liveChatBannerContainerLayout = (LiveChatBannerContainerLayout) view.findViewById(R.id.live_chat_banner);
        this.b = liveChatBannerContainerLayout;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.foreground_content);
        this.e = viewGroup;
        ImageView imageView = (ImageView) view.findViewById(R.id.background_image);
        this.c = imageView;
        this.d = (LottieAnimationView) view.findViewById(R.id.background_animation);
        this.y = (TextView) view.findViewById(R.id.header_text);
        this.w = (ImageButton) view.findViewById(R.id.context_menu_toggle);
        this.f = (ViewGroup) view.findViewById(R.id.banner_content);
        this.x = (ViewGroup) view.findViewById(R.id.header_mid_section_container);
        this.g = (ViewGroup) view.findViewById(R.id.live_chat_banner_container);
        viewGroup.setOnClickListener(this);
        liveChatBannerContainerLayout.b = new abnv(this);
        imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_banner_background, null));
        ajvbVar.a(asra.class);
    }

    private final void l() {
        yny.z(this.f, yny.k(this.D && !this.q ? this.a.getContext().getResources().getDimensionPixelOffset(R.dimen.live_chat_banner_content_bottom_margin) : 0), ViewGroup.MarginLayoutParams.class);
        boolean z = this.D;
        this.e.setPaddingRelative(z ? this.a.getContext().getResources().getDimensionPixelOffset(R.dimen.live_chat_banner_padding_start) : 0, 0, z ? this.a.getContext().getResources().getDimensionPixelOffset(R.dimen.live_chat_banner_padding_end) : 0, 0);
    }

    private final void m() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.o.end();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, (Property<LiveChatBannerContainerLayout, Float>) View.TRANSLATION_Y, 0.0f);
        this.o = ofFloat;
        ofFloat.setDuration(200L);
        this.o.addListener(new abny(this));
        this.o.start();
    }

    private final void n(boolean z) {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.o.end();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, (Property<LiveChatBannerContainerLayout, Float>) View.TRANSLATION_Y, this.b.getTranslationY(), -this.b.getHeight());
        this.o = ofFloat;
        ofFloat.setDuration(200L);
        this.o.addListener(new abnx(this, z));
        this.o.start();
    }

    private final void o() {
        k(false);
    }

    @Override // defpackage.abnf
    public final void a(CharSequence charSequence) {
        this.f.setContentDescription(charSequence);
    }

    @Override // defpackage.abju
    public final int b() {
        return 0;
    }

    @Override // defpackage.abju
    public final void c() {
        this.z.removeCallbacks(this.B);
        n(false);
    }

    public final void d() {
        float width = this.e.getWidth() / this.d.getDrawable().getIntrinsicWidth();
        Matrix matrix = new Matrix();
        matrix.setScale(width, width);
        this.d.setImageMatrix(matrix);
    }

    public final void e(asot asotVar) {
        aots aotsVar;
        int i = asotVar.b;
        if ((i & 4) != 0) {
            if ((i & 2) != 0) {
                aulq aulqVar = asotVar.d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (!aulqVar.pY(LiveChatBannerHeaderRendererOuterClass.liveChatBannerHeaderRenderer)) {
                    return;
                }
            }
            aulq aulqVar2 = asotVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            if (aulqVar2.pY(LiveChatItemRenderer.liveChatTextMessageRenderer) || aulqVar2.pY(ElementRendererOuterClass.elementRenderer)) {
                int dg = amkq.dg(asotVar.k);
                if (dg == 0 || dg != 3) {
                    this.s = false;
                    if (this.d.o()) {
                        this.d.c();
                    }
                    this.d.setVisibility(8);
                    this.c.setVisibility(0);
                } else {
                    this.s = true;
                    LottieAnimationView lottieAnimationView = this.d;
                    if (lottieAnimationView.f == null) {
                        lottieAnimationView.q(new cgd() { // from class: abnu
                            @Override // defpackage.cgd
                            public final void a(cfj cfjVar) {
                                final abnz abnzVar = abnz.this;
                                abnzVar.u = new View.OnLayoutChangeListener() { // from class: abnt
                                    @Override // android.view.View.OnLayoutChangeListener
                                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                        abnz.this.d();
                                    }
                                };
                                abnzVar.e.addOnLayoutChangeListener(abnzVar.u);
                                abnzVar.d();
                                if (abnzVar.s) {
                                    abnzVar.c.setVisibility(8);
                                    abnzVar.d.e();
                                    abnzVar.d.setVisibility(0);
                                }
                            }
                        });
                        this.d.f(R.raw.background_shimmer_lottie);
                    } else {
                        this.c.setVisibility(8);
                        this.d.e();
                        this.d.setVisibility(0);
                    }
                }
                this.b.a = !asotVar.f;
                apxf apxfVar = asotVar.h;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                this.E = apxfVar;
                apxf apxfVar2 = asotVar.i;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                this.t = apxfVar2;
                this.z.removeCallbacks(this.B);
                if (this.q) {
                    o();
                }
                this.j.h();
                this.j.f("on_content_clicked_listener", this);
                this.j.f("accessibility_data_receiver_key", this);
                this.j.a(this.A);
                this.f.removeAllViews();
                if ((asotVar.b & 2) != 0) {
                    this.D = true;
                    aulq aulqVar3 = asotVar.d;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    asos asosVar = (asos) aulqVar3.pX(LiveChatBannerHeaderRendererOuterClass.liveChatBannerHeaderRenderer);
                    if ((asosVar.b & 4) != 0) {
                        aulq aulqVar4 = asosVar.d;
                        if (aulqVar4 == null) {
                            aulqVar4 = aulq.a;
                        }
                        apmg apmgVar = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
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
                        if (aotsVar != null) {
                            this.w.setContentDescription(aotsVar.c);
                        }
                        if ((apmgVar.b & 32768) != 0) {
                            apxf apxfVar3 = apmgVar.p;
                            if (apxfVar3 == null) {
                                apxfVar3 = apxf.a;
                            }
                            this.C = apxfVar3;
                        }
                        this.w.setOnClickListener(this);
                        this.w.setVisibility(0);
                    } else {
                        this.w.setVisibility(8);
                    }
                    TextView textView = this.y;
                    aqyg aqygVar = asosVar.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    whu.G(textView, ajcq.b(aqygVar));
                } else {
                    this.D = false;
                    this.y.setText((CharSequence) null);
                    this.y.setVisibility(8);
                    this.w.setVisibility(8);
                }
                aulq aulqVar5 = asotVar.e;
                if (aulqVar5 == null) {
                    aulqVar5 = aulq.a;
                }
                this.m = aulqVar5;
                j(aulqVar5);
                aoae aoaeVar = this.v;
                if (aoaeVar != null) {
                    aoaeVar.c(asotVar, this.g);
                }
                l();
                if (!this.p) {
                    if (this.r) {
                        m();
                        this.z.postDelayed(this.B, 7000L);
                        abgh abghVar = this.l;
                        if (abghVar != null) {
                            abghVar.e();
                        }
                    } else {
                        this.k.b(this);
                    }
                    this.p = true;
                    return;
                }
                h();
            }
        }
    }

    public final void f() {
        if (this.p) {
            n(true);
        }
    }

    @Override // defpackage.abps
    public final void g() {
        o();
    }

    public final void h() {
        this.z.postDelayed(this.B, 7000L);
        abgh abghVar = this.l;
        if (abghVar != null) {
            abghVar.e();
        }
    }

    @Override // defpackage.abju
    public final void i() {
        m();
        this.z.postDelayed(this.B, 7000L);
        abgh abghVar = this.l;
        if (abghVar != null) {
            abghVar.e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ajos, java.lang.Object] */
    public final void j(aulq aulqVar) {
        Object pX;
        if (aulqVar == null) {
            return;
        }
        if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
            pX = ajds.a((aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer));
        } else {
            pX = aulqVar.pX(LiveChatItemRenderer.liveChatTextMessageRenderer);
        }
        ajom r = ahbw.r(this.i.get(), pX, (ViewGroup) this.a);
        this.n = r;
        if (r != null) {
            r.oB(this.j, pX);
            this.f.addView(this.n.a());
        }
    }

    public final void k(boolean z) {
        boolean z2 = true;
        if (z) {
            if (this.q) {
                return;
            }
        } else if (this.q) {
            z2 = false;
        }
        this.q = z2;
        this.z.removeCallbacks(this.B);
        this.f.removeAllViews();
        this.j.f("render_content_collapsed", Boolean.valueOf(this.q));
        LiveChatBannerContainerLayout liveChatBannerContainerLayout = this.b;
        bwk bwkVar = new bwk();
        bwkVar.f(new bvu());
        bwkVar.f(new bvx());
        bwkVar.J(0);
        bwkVar.z(this.b);
        bwkVar.z(this.g);
        bwkVar.z(this.c);
        bwkVar.z(this.d);
        bwkVar.z(this.x);
        bwkVar.z(this.y);
        bwkVar.z(this.f);
        bwh.b(liveChatBannerContainerLayout, bwkVar);
        TextView textView = this.y;
        textView.setVisibility((this.q || textView.length() == 0) ? 8 : 0);
        j(this.m);
        l();
        if (this.q) {
            apxf apxfVar = this.E;
            if (apxfVar != null) {
                this.h.c(apxfVar, null);
            }
        } else {
            apxf apxfVar2 = this.t;
            if (apxfVar2 != null) {
                this.h.c(apxfVar2, null);
            }
        }
        this.e.sendAccessibilityEvent(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.w) {
            aulq aulqVar = this.m;
            HashMap hashMap = null;
            if (aulqVar != null && aulqVar.pY(LiveChatItemRenderer.liveChatTextMessageRenderer)) {
                hashMap = new HashMap();
                hashMap.put("context_menu_header_renderer_key", this.m.pX(LiveChatItemRenderer.liveChatTextMessageRenderer));
            }
            this.h.c(this.C, hashMap);
            return;
        }
        o();
    }
}
