package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.time.Duration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahbn {
    public static awwk a() {
        aone createBuilder = awwk.a.createBuilder();
        Duration ofSeconds = Duration.ofSeconds(10L);
        ofSeconds.getClass();
        aoms c = aoqx.c(ofSeconds.getSeconds(), ofSeconds.getNano());
        createBuilder.copyOnWrite();
        awwk awwkVar = (awwk) createBuilder.instance;
        c.getClass();
        awwkVar.c = c;
        awwkVar.b |= 1;
        return (awwk) createBuilder.build();
    }

    public static final Class[] b(ahyw ahywVar, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aeqq.class};
        }
        if (i == 0) {
            ahywVar.g((aeqq) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static boolean c(PlayerResponseModel playerResponseModel) {
        return playerResponseModel != null && playerResponseModel.q() != null && ahbx.j(playerResponseModel.q()) && (!playerResponseModel.C() || playerResponseModel.c().aV());
    }

    public static Set d(aikb aikbVar) {
        return amsx.r(aikbVar.d());
    }

    public static boolean e(aikb aikbVar, String str) {
        if (!str.equals(aikbVar.d())) {
            return false;
        }
        aikbVar.f();
        return true;
    }

    public static vgz f(Context context, vfg vfgVar) {
        vda a = vdb.a(context);
        a.e("elements");
        a.f("elements_settings.pb");
        Uri a2 = a.a();
        vfe a3 = vff.a();
        a3.e(awur.a);
        a3.f(a2);
        return vfgVar.a(a3.a());
    }

    public static ammv g(swu swuVar) {
        sxs sxsVar = swuVar.f;
        syb sybVar = swuVar.h;
        acra acraVar = null;
        syg sygVar = sybVar == null ? null : sybVar.d;
        if (sxsVar instanceof ajgg) {
            acraVar = ((ajgg) sxsVar).a;
        } else if (sygVar instanceof acsd) {
            acraVar = ((acsd) sygVar).a;
        }
        return ammv.i(acraVar);
    }

    public static void h(Map map, swu swuVar) {
        ammv g = g(swuVar);
        if (g.h()) {
            map.put("com.google.android.libraries.youtube.logging.interaction_logger", g.c());
        }
    }

    public static void i(aong aongVar, swu swuVar, View view) {
        asht ashtVar;
        apxg apxgVar = ((apxf) aongVar.instance).e;
        if (apxgVar == null) {
            apxgVar = apxg.a;
        }
        aong aongVar2 = (aong) apxgVar.toBuilder();
        szk szkVar = swuVar.c;
        if (view != null && szkVar != null) {
            float f = view.getResources().getDisplayMetrics().density;
            if (f != 0.0f) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                aone createBuilder = ashl.a.createBuilder();
                float f2 = szkVar.a;
                createBuilder.copyOnWrite();
                ashl ashlVar = (ashl) createBuilder.instance;
                ashlVar.c |= 1;
                ashlVar.d = (int) (f2 / f);
                float f3 = szkVar.b;
                createBuilder.copyOnWrite();
                ashl ashlVar2 = (ashl) createBuilder.instance;
                ashlVar2.c |= 2;
                ashlVar2.e = (int) (f3 / f);
                int measuredWidth = view.getMeasuredWidth();
                createBuilder.copyOnWrite();
                ashl ashlVar3 = (ashl) createBuilder.instance;
                ashlVar3.c |= 4;
                ashlVar3.f = (int) (measuredWidth / f);
                int measuredHeight = view.getMeasuredHeight();
                createBuilder.copyOnWrite();
                ashl ashlVar4 = (ashl) createBuilder.instance;
                ashlVar4.c |= 8;
                ashlVar4.g = (int) (measuredHeight / f);
                int i = iArr[0];
                createBuilder.copyOnWrite();
                ashl ashlVar5 = (ashl) createBuilder.instance;
                ashlVar5.c |= 256;
                ashlVar5.l = (int) (i / f);
                int i2 = iArr[1];
                createBuilder.copyOnWrite();
                ashl ashlVar6 = (ashl) createBuilder.instance;
                ashlVar6.c |= 512;
                ashlVar6.m = (int) (i2 / f);
                int i3 = view.getResources().getConfiguration().orientation;
                if (i3 == 1) {
                    createBuilder.copyOnWrite();
                    ashl ashlVar7 = (ashl) createBuilder.instance;
                    ashlVar7.n = 1;
                    ashlVar7.c |= 2048;
                } else if (i3 == 2) {
                    createBuilder.copyOnWrite();
                    ashl ashlVar8 = (ashl) createBuilder.instance;
                    ashlVar8.n = 5;
                    ashlVar8.c |= 2048;
                } else if (i3 == 3) {
                    createBuilder.copyOnWrite();
                    ashl ashlVar9 = (ashl) createBuilder.instance;
                    ashlVar9.n = 6;
                    ashlVar9.c |= 2048;
                } else {
                    createBuilder.copyOnWrite();
                    ashl ashlVar10 = (ashl) createBuilder.instance;
                    ashlVar10.n = 0;
                    ashlVar10.c |= 2048;
                }
                while (view != null && !(view instanceof dkp)) {
                    view = (ViewGroup) view.getParent();
                }
                if (view instanceof dkp) {
                    int[] iArr2 = new int[2];
                    view.getLocationOnScreen(iArr2);
                    int measuredWidth2 = view.getMeasuredWidth();
                    createBuilder.copyOnWrite();
                    ashl ashlVar11 = (ashl) createBuilder.instance;
                    ashlVar11.c |= 64;
                    ashlVar11.j = (int) (measuredWidth2 / f);
                    int measuredHeight2 = view.getMeasuredHeight();
                    createBuilder.copyOnWrite();
                    ashl ashlVar12 = (ashl) createBuilder.instance;
                    ashlVar12.c |= 128;
                    ashlVar12.k = (int) (measuredHeight2 / f);
                    int i4 = iArr[0];
                    int i5 = iArr2[0];
                    createBuilder.copyOnWrite();
                    ashl ashlVar13 = (ashl) createBuilder.instance;
                    ashlVar13.c |= 16;
                    ashlVar13.h = (int) ((i4 - i5) / f);
                    int i6 = iArr[1];
                    int i7 = iArr2[1];
                    createBuilder.copyOnWrite();
                    ashl ashlVar14 = (ashl) createBuilder.instance;
                    ashlVar14.c |= 32;
                    ashlVar14.i = (int) ((i6 - i7) / f);
                }
                aongVar2.e(ashl.b, (ashl) createBuilder.build());
            }
        }
        Object obj = swuVar.d;
        if ((obj instanceof ajgc) && (ashtVar = ((ajgc) obj).b) != null) {
            aongVar2.e(asit.a, ashtVar);
        }
        apxg apxgVar2 = (apxg) aongVar2.build();
        aongVar.copyOnWrite();
        apxf apxfVar = (apxf) aongVar.instance;
        apxgVar2.getClass();
        apxfVar.e = apxgVar2;
        apxfVar.b |= 2;
    }

    public static ImageView.ScaleType j(int i) {
        return i != 2 ? i != 3 ? i != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.CENTER_INSIDE;
    }

    public static void k(ajjz ajjzVar, szn sznVar, avgf avgfVar, int i, int i2, syd sydVar, sxc sxcVar, Executor executor) {
        if (sznVar != null || avgfVar == null) {
            return;
        }
        try {
            executor.execute(new ajhz(ajjzVar, avgfVar, i, i2, 0));
        } catch (RejectedExecutionException e) {
            sydVar.a(28, "Image preload rejected", sxcVar, e);
        }
    }

    public static void l(awpf awpfVar, ImageView imageView, Context context, sww swwVar) {
        int x;
        if (!awpfVar.c.isEmpty() || (awpfVar.b & 2) == 0) {
            int b = swc.b(context, awpfVar);
            if (b <= 0) {
                ammv t = sgf.t(awpfVar);
                if (t.h()) {
                    imageView.setImageDrawable(sgf.s(context, (byte[]) t.c()));
                    return;
                }
                return;
            }
            int x2 = awxr.x(awpfVar.f);
            if ((x2 == 0 || x2 != 5) && ((x = awxr.x(awpfVar.f)) == 0 || x != 4)) {
                imageView.setImageDrawable(fk.f(context.getResources(), b, null));
                return;
            }
            szn sznVar = new szn(null, null, swwVar, awpfVar);
            FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(FrameSequence.decodeStream(context.getResources().openRawResource(b)));
            sznVar.b(frameSequenceDrawable);
            imageView.setImageDrawable(frameSequenceDrawable);
            sznVar.c();
            return;
        }
        imageView.setImageBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8));
    }

    public static void m(aoam aoamVar, ImageView imageView, Context context) {
        if (imageView instanceof ajib) {
            ajib ajibVar = (ajib) imageView;
            if (aoamVar.aa() != 0 || aoamVar.aC() == null) {
                int c = swc.c(context, aoamVar);
                if (c > 0) {
                    ajibVar.c(fk.f(context.getResources(), c, null), aoamVar);
                    return;
                }
                ammv u = sgf.u(aoamVar);
                if (u.h()) {
                    ajibVar.c(sgf.s(context, (byte[]) u.c()), aoamVar);
                    return;
                }
                return;
            }
            ajibVar.b(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8), aoamVar);
        }
    }

    public static avgg n(awpf awpfVar) {
        aong aongVar = (aong) avgg.a.createBuilder();
        if (awpfVar == null) {
            return (avgg) aongVar.build();
        }
        for (awph awphVar : awpfVar.c) {
            if (awphVar.c == 1) {
                aone createBuilder = avgf.a.createBuilder();
                String str = true != (awphVar.c == 1 ? (String) awphVar.d : "").startsWith("//") ? "" : "https:";
                String valueOf = String.valueOf(awphVar.c == 1 ? (String) awphVar.d : "");
                String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                createBuilder.copyOnWrite();
                avgf avgfVar = (avgf) createBuilder.instance;
                concat.getClass();
                avgfVar.b = 1 | avgfVar.b;
                avgfVar.c = concat;
                int i = awphVar.e;
                createBuilder.copyOnWrite();
                avgf avgfVar2 = (avgf) createBuilder.instance;
                avgfVar2.b |= 2;
                avgfVar2.d = i;
                int i2 = awphVar.f;
                createBuilder.copyOnWrite();
                avgf avgfVar3 = (avgf) createBuilder.instance;
                avgfVar3.b |= 4;
                avgfVar3.e = i2;
                aongVar.cB(createBuilder);
            }
        }
        return (avgg) aongVar.build();
    }

    public static ImageView.ScaleType o(int i) {
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 2 ? i2 != 3 ? i2 != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER;
        }
        throw null;
    }

    public static sxw p(boolean z, axpg axpgVar, axpg axpgVar2, axpg axpgVar3, axpg axpgVar4) {
        return z ? new tay((ahbn) axpgVar.get(), (tbt) axpgVar2.get(), (Executor) axpgVar3.get(), (ajfv) axpgVar4.get(), null, null, null, null) : sxw.a;
    }

    public static boolean q(ajgq ajgqVar, akto aktoVar) {
        return ajgqVar.a().h && aktoVar.b(ajgqVar.a().i, aksi.ELEMENT_PERF_SAMPLING);
    }

    public static final long r() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }
}
