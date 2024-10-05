package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtj extends ajpc {
    private final Context a;
    private final ci b;
    private final ajjz c;
    private final ajuw d;
    private final aahd e;
    private final gma f;
    private final ajut g;
    private final hbb h;
    private final akbd i;
    private final msx j;
    private final aaea k;
    private ajpc l;
    private ajpc m;
    private ajpc n;
    private ajpc o;
    private ajpc p;
    private ajpc q;
    private ajpc r;

    public mtj(Context context, ci ciVar, ajjz ajjzVar, ajuw ajuwVar, aahd aahdVar, gma gmaVar, ajut ajutVar, hbb hbbVar, akbd akbdVar, aaea aaeaVar) {
        this.a = context;
        this.b = ciVar;
        this.c = ajjzVar;
        this.e = aahdVar;
        this.f = gmaVar;
        this.g = ajutVar;
        this.h = hbbVar;
        this.d = ajuwVar;
        this.i = akbdVar;
        this.k = aaeaVar;
        msx msxVar = new msx(context);
        this.j = msxVar;
        gmaVar.c(msxVar);
    }

    public static String f(ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        aott aottVar = reelItemRendererOuterClass$ReelItemRenderer.q;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((aottVar.b & 1) == 0) {
            return null;
        }
        aott aottVar2 = reelItemRendererOuterClass$ReelItemRenderer.q;
        if (aottVar2 == null) {
            aottVar2 = aott.a;
        }
        aots aotsVar = aottVar2.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajpc ajpcVar = this.l;
        if (ajpcVar != null) {
            ajpcVar.b(ajosVar);
        }
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        int bk;
        int bR;
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) obj;
        this.j.removeAllViews();
        int bk2 = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
        if (bk2 != 0 && bk2 == 6) {
            if (this.m == null) {
                this.m = new msw(this.a, this.d, this.c, this.e, this.h);
            }
            this.j.a();
            yny.B(this.j, -1, -2);
            this.l = this.m;
        } else {
            int bk3 = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
            if (bk3 != 0 && bk3 == 7) {
                if (this.n == null) {
                    this.n = new mtc(this.a, this.d, this.c, this.e, this.h);
                    yny.B(this.j, -1, -2);
                }
                this.j.a();
                this.l = this.n;
            } else {
                int bk4 = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
                if (bk4 != 0 && bk4 == 8) {
                    if (this.o == null) {
                        this.o = new msz(this.a, this.b, this.d, this.c, this.e, this.h, this.g);
                    }
                    this.j.a();
                    yny.B(this.j, -2, -2);
                    this.l = this.o;
                } else {
                    int bk5 = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
                    if (bk5 != 0 && bk5 == 9) {
                        if (this.p == null) {
                            this.p = new mtb(this.a, this.b, this.d, this.c, this.e, this.h, this.g, R.layout.reel_item_thumbnail_shelf_style, ((Double) ajokVar.d("aspectRatio", Double.valueOf(0.5625d))).doubleValue(), this.k);
                        }
                        this.j.a();
                        yny.B(this.j, -2, -2);
                        this.l = this.p;
                    } else {
                        int bk6 = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
                        if ((bk6 != 0 && bk6 == 10) || ((bk = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r)) != 0 && bk == 11)) {
                            int i = reelItemRendererOuterClass$ReelItemRenderer.b & 2048;
                            int i2 = R.layout.reel_item_shorts_style_video;
                            if (i != 0 && (bR = aobq.bR(reelItemRendererOuterClass$ReelItemRenderer.l)) != 0 && bR == 2) {
                                i2 = R.layout.reel_item_shorts_style_story;
                            }
                            ajpc ajpcVar = this.q;
                            if (!(ajpcVar instanceof mtb) || ((mtb) ajpcVar).k != i2) {
                                this.q = new mtb(this.a, this.b, this.d, this.c, this.e, this.h, this.g, i2, ((Double) ajokVar.d("aspectRatio", Double.valueOf(0.6d))).doubleValue(), this.k);
                            }
                            this.j.a();
                            yny.B(this.j, -2, -2);
                            this.l = this.q;
                        } else {
                            int bk7 = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
                            if (bk7 == 0 || bk7 != 12) {
                                return;
                            }
                            if (this.r == null) {
                                this.r = new mtd(this.a, this.b, this.d, this.c, this.e, this.h, this.g, this.k);
                            }
                            msx msxVar = this.j;
                            if (msxVar.a != 0.6d) {
                                msxVar.a = 0.6d;
                                msxVar.requestLayout();
                            }
                            yny.B(this.j, -1, -2);
                            this.l = this.r;
                        }
                    }
                }
            }
        }
        this.j.addView(this.l.a());
        View findViewById = this.l.a().findViewById(R.id.reel_item_portrait_container);
        if (findViewById != null) {
            this.i.c(findViewById, this.i.a(findViewById, null));
        }
        this.l.oB(ajokVar, reelItemRendererOuterClass$ReelItemRenderer);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ReelItemRendererOuterClass$ReelItemRenderer) obj).p.I();
    }

    @Override // defpackage.ajpc
    protected final boolean kC() {
        return evr.Q(this.k);
    }
}
