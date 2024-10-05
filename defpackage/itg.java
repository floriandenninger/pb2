package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class itg implements isr {
    public final azqw a;
    public final aypn b;
    public final aypn c;
    public final aypn d;
    public final aypn e;
    ayqx f;
    public final Context g;
    public final aahv h;
    public final itf i;
    public final UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer j;
    private final azqw k;
    private final azqw l;
    private final aypn m;
    private final ayqi n;

    public itg(ayqi ayqiVar, Context context, aahv aahvVar, final isn isnVar, isl islVar, final aadw aadwVar, itf itfVar, UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) {
        avua avuaVar;
        String str;
        avub avubVar;
        azqw av = azqv.aq(false).av();
        this.k = av;
        azqw av2 = azqv.aq(false).av();
        this.l = av2;
        this.a = azqv.aq(isq.ALLOW_VISIBLE).av();
        this.n = ayqiVar;
        this.g = context;
        this.h = aahvVar;
        itfVar.getClass();
        this.i = itfVar;
        this.j = uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
        int i = uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.d;
        if (i == 7) {
            str = ((avub) uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.e).b;
        } else {
            if (i == 8) {
                avuaVar = (avua) uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.e;
            } else {
                avuaVar = avua.a;
            }
            str = avuaVar.b;
        }
        this.c = h(isnVar.a, str).aj(ism.j).i(aypg.LATEST).K(false);
        this.e = isnVar.b.i(aypg.LATEST).K(false);
        this.d = av.M(new ayrv() { // from class: iss
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                isn isnVar2 = isn.this;
                if (!((Boolean) obj).booleanValue()) {
                    return isnVar2.c.Y(ism.c).i(aypg.LATEST);
                }
                return aypn.z(true);
            }
        }).K(false);
        if (uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.b == 6) {
            avubVar = (avub) uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.c;
        } else {
            avubVar = avub.a;
        }
        this.m = h(islVar.a, avubVar.b).aj(ism.k).i(aypg.LATEST);
        g();
        this.b = av2.M(new ayrv() { // from class: isu
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                itg itgVar = itg.this;
                aadw aadwVar2 = aadwVar;
                if (!((Boolean) obj).booleanValue()) {
                    return aypn.z(itd.a());
                }
                avui avuiVar = aadwVar2.b().s;
                if (avuiVar == null) {
                    avuiVar = avui.a;
                }
                int i2 = 1;
                if (!avuiVar.h) {
                    return itgVar.h.c().i(akvs.a).ac(aysu.b(amlr.a)).i(aypg.LATEST).A(ism.i).A(ism.h).n().M(new ist(itgVar, i2)).n();
                }
                aypn A = itgVar.h.c().h(akvs.a, true).i(aypg.LATEST).s(gsv.o).A(ism.g).A(ism.d);
                int i3 = itgVar.j.d;
                if (i3 == 5) {
                    A = aypn.sm(A, itgVar.e, itgVar.d, gii.c);
                } else if (i3 == 7) {
                    A = aypn.sm(A, itgVar.c, itgVar.e, gii.d);
                } else if (i3 == 8) {
                    A = aypn.g(A, itgVar.e, itgVar.c, itgVar.d, acul.b);
                }
                return A.M(new ist(itgVar, 0)).n();
            }
        }).ah().c().h(new aypr() { // from class: isw
            @Override // defpackage.aypr
            public final banv a(aypn aypnVar) {
                return aypn.e(aypnVar, itg.this.a, epc.h);
            }
        }).G().E(ayqiVar);
    }

    public static itc d(ita itaVar) {
        if (itaVar instanceof itd) {
            return itc.a(0, 0);
        }
        if (itaVar instanceof ite) {
            ite iteVar = (ite) itaVar;
            int i = iteVar.d;
            return itc.a(i, iteVar.c + i + iteVar.b);
        }
        if (itaVar instanceof itb) {
            itb itbVar = (itb) itaVar;
            int i2 = itbVar.c;
            return itc.a(i2, itbVar.a + i2 + itbVar.b);
        }
        if (itaVar instanceof itc) {
            return (itc) itaVar;
        }
        String valueOf = String.valueOf(itaVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("unrecognized arrow state type: ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    private static aypy h(aypy aypyVar, String str) {
        return aypyVar.Y(new fjx(str, 2));
    }

    @Override // defpackage.isr
    public final void a(boolean z) {
        this.k.c(Boolean.valueOf(z));
    }

    @Override // defpackage.isr
    public final void b(boolean z) {
        if (z) {
            if (this.f == null) {
                this.f = this.b.X(new ayrs() { // from class: isx
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        itg itgVar = itg.this;
                        ita itaVar = (ita) obj;
                        if (itaVar instanceof itd) {
                            itgVar.g();
                            return;
                        }
                        if (itaVar instanceof ite) {
                            Object a = itgVar.i.a();
                            float f = ((ite) itaVar).a;
                            UploadArrowView uploadArrowView = (UploadArrowView) a;
                            uploadArrowView.setVisibility(0);
                            ((jxa) a).l(f);
                            whu.I(uploadArrowView.f, false);
                            LottieAnimationView lottieAnimationView = uploadArrowView.i;
                            if (lottieAnimationView != null) {
                                lottieAnimationView.setVisibility(0);
                                if (lottieAnimationView.o()) {
                                    return;
                                }
                                lottieAnimationView.e();
                                return;
                            }
                            return;
                        }
                        if (itaVar instanceof itb) {
                            Object a2 = itgVar.i.a();
                            UploadArrowView uploadArrowView2 = (UploadArrowView) a2;
                            uploadArrowView2.setVisibility(0);
                            ((jxa) a2).k();
                            int i = uploadArrowView2.l;
                            int Q = wbs.Q(uploadArrowView2.getContext(), R.attr.ytCallToAction);
                            uploadArrowView2.a(i);
                            TintableImageView tintableImageView = uploadArrowView2.f;
                            if (tintableImageView != null) {
                                tintableImageView.a(ColorStateList.valueOf(Q));
                                return;
                            }
                            return;
                        }
                        if (itaVar instanceof itc) {
                            Object a3 = itgVar.i.a();
                            UploadArrowView uploadArrowView3 = (UploadArrowView) a3;
                            uploadArrowView3.setVisibility(0);
                            ((jxa) a3).k();
                            uploadArrowView3.a(uploadArrowView3.m);
                        }
                    }
                });
            }
        } else {
            Object obj = this.f;
            if (obj != null) {
                azqb.f((AtomicReference) obj);
            }
            this.f = null;
            g();
        }
        this.l.c(Boolean.valueOf(z));
    }

    @Override // defpackage.isr
    public final void c(isq isqVar) {
        isqVar.getClass();
        this.a.c(isqVar);
    }

    public final aypn e(ita itaVar) {
        avtx avtxVar;
        if (!(itaVar instanceof itb)) {
            if (itaVar instanceof itc) {
                aypn r = aypn.r();
                int i = this.j.d;
                if (i == 5) {
                    r = this.k;
                } else if (i == 8) {
                    r = aypn.e(this.c, this.k, epc.i);
                } else if (i == 7) {
                    r = this.c;
                }
                return r.s(gsv.q).aj().A(ism.m);
            }
            return aypn.r();
        }
        int i2 = this.j.b;
        if (i2 != 3) {
            if (i2 != 6) {
                return aypn.r();
            }
            return this.m.s(gsv.p).aj().A(ism.l);
        }
        aypn z = aypn.z(itd.a());
        UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer = this.j;
        if (uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.b == 3) {
            avtxVar = (avtx) uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.c;
        } else {
            avtxVar = avtx.a;
        }
        float f = avtxVar.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ayqi ayqiVar = this.n;
        aysw.b(timeUnit, "unit is null");
        aywt aywtVar = new aywt(z, Math.max(0L, f * 1000.0f), timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.j;
        return aywtVar;
    }

    public final String f(ita itaVar) {
        try {
            final ism ismVar = ism.f;
            final ist istVar = new ist(this, 5);
            final ist istVar2 = new ist(this, 3);
            final ist istVar3 = new ist(this, 4);
            return (String) new ayrv() { // from class: isv
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    ayrv ayrvVar = ayrv.this;
                    ayrv ayrvVar2 = istVar;
                    ayrv ayrvVar3 = istVar2;
                    ayrv ayrvVar4 = istVar3;
                    ita itaVar2 = (ita) obj;
                    if (itaVar2 instanceof itd) {
                        return ayrvVar.a((itd) itaVar2);
                    }
                    if (itaVar2 instanceof ite) {
                        return ayrvVar2.a((ite) itaVar2);
                    }
                    if (itaVar2 instanceof itb) {
                        return ayrvVar3.a((itb) itaVar2);
                    }
                    if (itaVar2 instanceof itc) {
                        return ayrvVar4.a((itc) itaVar2);
                    }
                    String valueOf = String.valueOf(itaVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("unrecognized arrow state type: ");
                    sb.append(valueOf);
                    throw new AssertionError(sb.toString());
                }
            }.a(itaVar);
        } catch (MissingFormatArgumentException unused) {
            return "";
        }
    }

    public final void g() {
        if (this.i.b()) {
            Object a = this.i.a();
            ((UploadArrowView) a).setVisibility(8);
            ((jxa) a).k();
        }
    }
}
