package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class mtb extends msv {
    protected final TextView h;
    public final ci i;
    public final ajut j;
    public final int k;
    private final FrameLayout l;
    private final ImageView m;
    private final LinearLayout n;
    private final TextView o;
    private final TextView p;
    private final ImageView q;
    private final mti r;
    private final mti s;
    private final ImageView t;
    private final View u;
    private final TextView v;
    private final double x;
    private final aaea y;

    public mtb(Context context, ci ciVar, ajuw ajuwVar, ajjz ajjzVar, aahd aahdVar, hbb hbbVar, ajut ajutVar, int i, double d, aaea aaeaVar) {
        super(context, ajuwVar, ajjzVar, aahdVar, hbbVar, i, R.id.reel_item_channel_avatar);
        this.i = ciVar;
        this.j = ajutVar;
        this.k = i;
        this.y = aaeaVar;
        this.l = (FrameLayout) this.f.findViewById(R.id.reel_item_portrait_container);
        this.u = this.f.findViewById(R.id.reel_item_watched_scrim);
        this.t = (ImageView) this.f.findViewById(R.id.reel_item_contextual_menu_anchor);
        this.v = (TextView) this.f.findViewById(R.id.reel_item_video_tag);
        ImageView imageView = (ImageView) this.f.findViewById(R.id.reel_item_channel_avatar);
        this.q = imageView;
        this.n = (LinearLayout) this.f.findViewById(R.id.headline_layout);
        this.o = (TextView) this.f.findViewById(R.id.reel_item_headline);
        this.h = (TextView) this.f.findViewById(R.id.reel_item_byline);
        this.p = (TextView) this.f.findViewById(R.id.reel_item_byline_below_thumbnail);
        ImageView imageView2 = (ImageView) this.f.findViewById(R.id.reel_item_video_thumbnail);
        this.m = imageView2;
        imageView2.setImageDrawable(new ColorDrawable(wbs.W(context, R.attr.ytIcon1).orElse(0)));
        this.x = d;
        this.r = new mti(context, imageView2, ajjzVar, null, d);
        this.s = imageView != null ? new mti(context, imageView, ajjzVar, this.g, d) : null;
    }

    @Override // defpackage.msv, defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.e(this.q);
        this.c.e(this.m);
    }

    @Override // defpackage.msv, defpackage.ajpc
    protected /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        d(ajokVar, (ReelItemRendererOuterClass$ReelItemRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.msv
    /* renamed from: f */
    public void d(ajok ajokVar, final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        avgg avggVar;
        avgg avggVar2;
        super.d(ajokVar, reelItemRendererOuterClass$ReelItemRenderer);
        int intValue = ((Integer) ajokVar.d("margin", 0)).intValue();
        if (intValue <= 0) {
            intValue = this.a.getResources().getDimensionPixelSize(R.dimen.reel_portrait_item_padding_start);
        }
        h(intValue);
        int intValue2 = ((Integer) ajokVar.d("width", -1)).intValue();
        if (intValue2 != -1) {
            ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
            double d = intValue2;
            double d2 = this.x;
            Double.isNaN(d);
            layoutParams.height = (int) (d / d2);
            this.l.getLayoutParams().width = intValue2;
        }
        TextView textView = this.v;
        if (textView != null) {
            int i = reelItemRendererOuterClass$ReelItemRenderer.b;
            if ((i & 512) != 0) {
                aqyg aqygVar4 = reelItemRendererOuterClass$ReelItemRenderer.j;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar4));
            } else if ((i & 1024) == 0) {
                whu.I(textView, false);
            } else {
                aqyg aqygVar5 = reelItemRendererOuterClass$ReelItemRenderer.k;
                if (aqygVar5 == null) {
                    aqygVar5 = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar5));
            }
        }
        avgg avggVar3 = null;
        if (this.q != null) {
            int intValue3 = ((Integer) ajokVar.d("avatar_size", 0)).intValue();
            if (intValue3 <= 0) {
                intValue3 = this.a.getResources().getDimensionPixelSize(R.dimen.reel_portrait_avatar_size);
            }
            this.q.getLayoutParams().width = intValue3;
            this.q.getLayoutParams().height = intValue3;
            mti mtiVar = this.s;
            if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
                avggVar = reelItemRendererOuterClass$ReelItemRenderer.g;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
            } else {
                avggVar = null;
            }
            mtiVar.a(avggVar, false);
            ajjz ajjzVar = this.c;
            ImageView imageView = this.q;
            if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
                avggVar2 = reelItemRendererOuterClass$ReelItemRenderer.g;
                if (avggVar2 == null) {
                    avggVar2 = avgg.a;
                }
            } else {
                avggVar2 = null;
            }
            ajjzVar.k(imageView, avggVar2, this.g);
        }
        if (this.h != null) {
            int bk = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
            if (bk == 0 || bk != 11) {
                TextView textView2 = this.h;
                if ((reelItemRendererOuterClass$ReelItemRenderer.b & 8) != 0) {
                    aqygVar3 = reelItemRendererOuterClass$ReelItemRenderer.e;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                textView2.setText(ajcq.b(aqygVar3));
                this.h.setContentDescription(mtj.f(reelItemRendererOuterClass$ReelItemRenderer));
                whu.I(this.h, true);
            } else {
                whu.I(this.h, false);
            }
        }
        if (this.p != null) {
            int bk2 = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
            if (bk2 == 0 || bk2 != 11) {
                whu.I(this.p, false);
            } else {
                TextView textView3 = this.p;
                if ((reelItemRendererOuterClass$ReelItemRenderer.b & 8) != 0) {
                    aqygVar2 = reelItemRendererOuterClass$ReelItemRenderer.e;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                textView3.setText(ajcq.b(aqygVar2));
                this.p.setContentDescription(mtj.f(reelItemRendererOuterClass$ReelItemRenderer));
                whu.I(this.p, true);
            }
        }
        if (this.o != null) {
            int bk3 = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
            if (bk3 != 0 && bk3 == 11) {
                this.o.setGravity(1);
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.setGravity(1);
                }
            }
            TextView textView4 = this.o;
            if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0) {
                aqygVar = reelItemRendererOuterClass$ReelItemRenderer.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView4.setText(ajcq.b(aqygVar));
            if (this.h == null) {
                this.o.setContentDescription(mtj.f(reelItemRendererOuterClass$ReelItemRenderer));
            }
        }
        mti mtiVar2 = this.r;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 16) != 0 && (avggVar3 = reelItemRendererOuterClass$ReelItemRenderer.f) == null) {
            avggVar3 = avgg.a;
        }
        mtiVar2.a(avggVar3, true);
        atdf atdfVar = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) == 0) {
            whu.I(this.t, false);
        } else {
            whu.I(this.t, true);
            this.t.setOnClickListener(new View.OnClickListener() { // from class: mta
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mtb mtbVar = mtb.this;
                    ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", reelItemRendererOuterClass$ReelItemRenderer2);
                    ci ciVar = mtbVar.i;
                    atdf atdfVar2 = reelItemRendererOuterClass$ReelItemRenderer2.n;
                    if (atdfVar2 == null) {
                        atdfVar2 = atdf.a;
                    }
                    atdc atdcVar = atdfVar2.c;
                    if (atdcVar == null) {
                        atdcVar = atdc.a;
                    }
                    ajxw.c(ciVar, atdcVar, mtbVar.d, mtbVar.j, hashMap);
                }
            });
        }
    }

    @Override // defpackage.msv
    public final boolean g(ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        boolean g = super.g(reelItemRendererOuterClass$ReelItemRenderer);
        View view = this.u;
        if (view != null) {
            if (g) {
                whu.I(view, true);
            } else {
                whu.I(view, false);
            }
        }
        return g;
    }

    protected void h(int i) {
        View view = this.f;
        view.setPaddingRelative(i, view.getPaddingTop(), this.f.getPaddingEnd(), this.f.getPaddingBottom());
    }

    @Override // defpackage.ajpc
    protected final boolean kC() {
        return evr.Q(this.y);
    }
}
