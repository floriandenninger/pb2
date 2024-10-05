package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AutoplayRendererOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.ReelPlayerOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etx {
    public static String A(arnd arndVar) {
        if (arndVar != null && arndVar.d.size() != 0) {
            for (arne arneVar : arndVar.d) {
                int dC = amkq.dC(arneVar.b);
                if (dC != 0 && dC == 5) {
                    for (askp askpVar : arneVar.c) {
                        if (TextUtils.equals(askpVar.e, "context")) {
                            return askpVar.c == 2 ? (String) askpVar.d : "";
                        }
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "INIT";
            case 2:
                return "WAIT_FOR_MEDIALIST";
            case 3:
                return "PREPARE_UPLOADS";
            case 4:
                return "LOAD_PREVIEW_VIDEO";
            case 5:
                return "VIDEO_THUMBNAIL";
            case 6:
                return "WAITING_ON_CALLBACK";
            case 7:
                return "IDLE";
            case 8:
                return "UPLOADING";
            default:
                return "null";
        }
    }

    public static final void C(TextView textView, aqyc aqycVar) {
        int aP;
        if (textView == null) {
            return;
        }
        if (aqycVar == null || (aqycVar.b & 1) == 0 || (aP = aocz.aP(aqycVar.d)) == 0 || aP != 3) {
            textView.setPadding(0, 0, 0, 0);
            textView.setBackground(null);
            textView.setText(textView.getText().toString());
            return;
        }
        apkv apkvVar = aqycVar.c;
        if (apkvVar == null) {
            apkvVar = apkv.a;
        }
        SpannableString spannableString = new SpannableString(textView.getText().toString());
        as(spannableString, new StyleSpan(1));
        as(spannableString, new ForegroundColorSpan(apkvVar.d));
        textView.setText(spannableString);
        Drawable a = aii.a(textView.getContext(), R.drawable.badge_decorator_pill);
        a.setColorFilter(apkvVar.c, PorterDuff.Mode.SRC_IN);
        textView.setBackground(a);
    }

    public static void D(final Activity activity, final Bitmap bitmap, final axdj axdjVar, final ici iciVar) {
        wcy.C(activity, bitmap, new zpx() { // from class: ich
            @Override // defpackage.zpx
            public final void a(zsb zsbVar) {
                Activity activity2 = activity;
                axdj axdjVar2 = axdjVar;
                ici iciVar2 = iciVar;
                Bitmap bitmap2 = bitmap;
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                aone createBuilder = axbp.a.createBuilder();
                String str = zsbVar.c;
                createBuilder.copyOnWrite();
                axbp axbpVar = (axbp) createBuilder.instance;
                str.getClass();
                axbpVar.b = 1;
                axbpVar.c = str;
                axbp axbpVar2 = (axbp) createBuilder.build();
                aone builder = ((axdk) axdjVar2.instance).i().toBuilder();
                axdi axdiVar = (axdi) builder.instance;
                int i = axdiVar.c;
                if (i == 3) {
                    aone builder2 = ((axcy) axdiVar.d).toBuilder();
                    builder2.copyOnWrite();
                    axcy axcyVar = (axcy) builder2.instance;
                    axbpVar2.getClass();
                    axcyVar.c = axbpVar2;
                    axcyVar.b |= 1;
                    builder.copyOnWrite();
                    axdi axdiVar2 = (axdi) builder.instance;
                    axcy axcyVar2 = (axcy) builder2.build();
                    axcyVar2.getClass();
                    axdiVar2.d = axcyVar2;
                    axdiVar2.c = 3;
                } else if (i == 6) {
                    aone builder3 = ((axbr) axdiVar.d).toBuilder();
                    builder3.copyOnWrite();
                    axbr axbrVar = (axbr) builder3.instance;
                    axbpVar2.getClass();
                    axbrVar.c = axbpVar2;
                    axbrVar.b |= 1;
                    builder.copyOnWrite();
                    axdi axdiVar3 = (axdi) builder.instance;
                    axbr axbrVar2 = (axbr) builder3.build();
                    axbrVar2.getClass();
                    axdiVar3.d = axbrVar2;
                    axdiVar3.c = 6;
                } else if (i == 7) {
                    aone builder4 = ((axed) axdiVar.d).toBuilder();
                    builder4.copyOnWrite();
                    axed axedVar = (axed) builder4.instance;
                    axbpVar2.getClass();
                    axedVar.c = axbpVar2;
                    axedVar.b |= 1;
                    builder.copyOnWrite();
                    axdi axdiVar4 = (axdi) builder.instance;
                    axed axedVar2 = (axed) builder4.build();
                    axedVar2.getClass();
                    axdiVar4.d = axedVar2;
                    axdiVar4.c = 7;
                } else if (i == 1) {
                    aone builder5 = ((axdy) axdiVar.d).toBuilder();
                    builder5.copyOnWrite();
                    axdy axdyVar = (axdy) builder5.instance;
                    axbpVar2.getClass();
                    axdyVar.g = axbpVar2;
                    axdyVar.b |= 128;
                    builder.copyOnWrite();
                    axdi axdiVar5 = (axdi) builder.instance;
                    axdy axdyVar2 = (axdy) builder5.build();
                    axdyVar2.getClass();
                    axdiVar5.d = axdyVar2;
                    axdiVar5.c = 1;
                } else if (i == 8) {
                    aone builder6 = ((axdz) axdiVar.d).toBuilder();
                    builder6.copyOnWrite();
                    axdz axdzVar = (axdz) builder6.instance;
                    axbpVar2.getClass();
                    axdzVar.c = axbpVar2;
                    axdzVar.b |= 1;
                    builder.copyOnWrite();
                    axdi axdiVar6 = (axdi) builder.instance;
                    axdz axdzVar2 = (axdz) builder6.build();
                    axdzVar2.getClass();
                    axdiVar6.d = axdzVar2;
                    axdiVar6.c = 8;
                } else if (i == 9) {
                    aone builder7 = ((axby) axdiVar.d).toBuilder();
                    builder7.copyOnWrite();
                    axby axbyVar = (axby) builder7.instance;
                    axbpVar2.getClass();
                    axbyVar.c = axbpVar2;
                    axbyVar.b |= 1;
                    builder.copyOnWrite();
                    axdi axdiVar7 = (axdi) builder.instance;
                    axby axbyVar2 = (axby) builder7.build();
                    axbyVar2.getClass();
                    axdiVar7.d = axbyVar2;
                    axdiVar7.c = 9;
                } else if (i == 10) {
                    aone builder8 = ((axeh) axdiVar.d).toBuilder();
                    builder8.copyOnWrite();
                    axeh axehVar = (axeh) builder8.instance;
                    axbpVar2.getClass();
                    axehVar.c = axbpVar2;
                    axehVar.b |= 1;
                    builder.copyOnWrite();
                    axdi axdiVar8 = (axdi) builder.instance;
                    axeh axehVar2 = (axeh) builder8.build();
                    axehVar2.getClass();
                    axdiVar8.d = axehVar2;
                    axdiVar8.c = 10;
                } else if (i == 12) {
                    aone builder9 = ((axbz) axdiVar.d).toBuilder();
                    builder9.copyOnWrite();
                    axbz axbzVar = (axbz) builder9.instance;
                    axbpVar2.getClass();
                    axbzVar.c = axbpVar2;
                    axbzVar.b |= 1;
                    builder.copyOnWrite();
                    axdi axdiVar9 = (axdi) builder.instance;
                    axbz axbzVar2 = (axbz) builder9.build();
                    axbzVar2.getClass();
                    axdiVar9.d = axbzVar2;
                    axdiVar9.c = 12;
                } else if (i == 13) {
                    aone builder10 = ((axcw) axdiVar.d).toBuilder();
                    builder10.copyOnWrite();
                    axcw axcwVar = (axcw) builder10.instance;
                    axbpVar2.getClass();
                    axcwVar.c = axbpVar2;
                    axcwVar.b |= 1;
                    builder.copyOnWrite();
                    axdi axdiVar10 = (axdi) builder.instance;
                    axcw axcwVar2 = (axcw) builder10.build();
                    axcwVar2.getClass();
                    axdiVar10.d = axcwVar2;
                    axdiVar10.c = 13;
                }
                axdjVar2.copyOnWrite();
                ((axdk) axdjVar2.instance).F((axdi) builder.build());
                wcy.I(axdjVar2, zsbVar);
                iciVar2.a(axdjVar2);
                bitmap2.recycle();
            }
        });
    }

    public static acqx E(auya auyaVar) {
        int ai = aobq.ai(auyaVar.c);
        if (ai != 0 && ai == 4) {
            return new acqx(acsb.c(65451));
        }
        asuh cf = adyu.cf(auyaVar);
        return new acqx(cf != null ? cf.d : aomf.b);
    }

    public static ammv F(Uri uri) {
        if (uri == null) {
            return amlr.a;
        }
        String lastPathSegment = uri.getLastPathSegment();
        return lastPathSegment != null ? ammv.i(zoz.b(lastPathSegment)) : amlr.a;
    }

    public static ammv G(aulq aulqVar) {
        aulqVar.getClass();
        if (!aulqVar.pY(StickerCatalogRendererOuterClass.stickerRenderer)) {
            return amlr.a;
        }
        auyb auybVar = (auyb) aulqVar.pX(StickerCatalogRendererOuterClass.stickerRenderer);
        if ((auybVar.b & 1) == 0) {
            return auybVar.d.size() != 0 ? ammv.i(ahbw.B((avgg) auybVar.d.get(0))) : amlr.a;
        }
        avgg avggVar = auybVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return ammv.i(ahbw.B(avggVar));
    }

    public static List H(aulq aulqVar) {
        aulqVar.getClass();
        amkq.N(aulqVar.pY(StickerCatalogRendererOuterClass.stickerRenderer));
        auyb auybVar = (auyb) aulqVar.pX(StickerCatalogRendererOuterClass.stickerRenderer);
        ArrayList arrayList = new ArrayList();
        Iterator it = auybVar.d.iterator();
        while (it.hasNext()) {
            Uri B = ahbw.B((avgg) it.next());
            if (B != null) {
                arrayList.add(B.toString());
            }
        }
        return arrayList;
    }

    public static aomf I(aooy aooyVar) {
        asuh cf = adyu.cf(aooyVar);
        return cf != null ? cf.d : aomf.b;
    }

    public static void K(View view) {
        L(view, null);
    }

    public static void L(View view, final Runnable runnable) {
        if (view == null) {
            return;
        }
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: hxv
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                int i = paddingLeft;
                int i2 = paddingTop;
                int i3 = paddingRight;
                int i4 = paddingBottom;
                Runnable runnable2 = runnable;
                view2.setPadding(i, i2 + windowInsets.getSystemWindowInsetTop(), i3, i4);
                windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getStableInsetBottom());
                if (runnable2 != null) {
                    runnable2.run();
                }
                return windowInsets;
            }
        });
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new hxw());
        }
    }

    public static void M(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    public static boolean N(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void O(View view, long j) {
        whu.I(view, true);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(125L).setStartDelay(j);
    }

    public static void P(View view) {
        O(view, 0L);
    }

    public static View Q(Context context, int i, int i2, float f, List list) {
        Point point;
        amkq.N(list.size() == 9);
        float[] am = anaf.am(list);
        Matrix matrix = new Matrix();
        matrix.setValues(am);
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix();
        float f2 = i;
        float f3 = i2;
        if (f2 / f3 > f) {
            point = new Point(i, (int) (f2 / f));
        } else {
            point = new Point((int) (f * f3), i2);
        }
        matrix2.setScale(point.x, point.y);
        matrix3.setTranslate((f2 - point.x) / 2.0f, (f3 - point.y) / 2.0f);
        matrix.postConcat(matrix2);
        matrix.postConcat(matrix3);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        View view = new View(context);
        view.setTranslationX(fArr[2]);
        view.setTranslationY(fArr[5]);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setRotation((float) (Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
        view.setLayoutParams(new FrameLayout.LayoutParams(Math.round((float) Math.hypot(fArr[0], fArr[3])), Math.round((float) Math.hypot(fArr[4], fArr[1]))));
        return view;
    }

    public static int R(aoro aoroVar) {
        return Color.argb((int) aoroVar.f, (int) aoroVar.c, (int) aoroVar.d, (int) aoroVar.e);
    }

    public static boolean S(ce ceVar) {
        if (ceVar.C() != null && !ceVar.C().isDestroyed() && !ceVar.C().isFinishing() && !ceVar.H && !ceVar.s && ceVar.ar()) {
            if (ceVar.at()) {
                return true;
            }
            ci C = ceVar.C();
            if (Build.VERSION.SDK_INT >= 24 && C.isInMultiWindowMode()) {
                return true;
            }
        }
        return false;
    }

    public static void T(Context context, int i) {
        Toast makeText = Toast.makeText(context, i, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public static aphc U(aukf aukfVar) {
        if ((aukfVar.b & 1024) == 0) {
            return null;
        }
        aulq aulqVar = aukfVar.m;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(AutoplayRendererOuterClass.autoplayEndpointRenderer)) {
            return null;
        }
        aulq aulqVar2 = aukfVar.m;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (aphc) aulqVar2.pX(AutoplayRendererOuterClass.autoplayEndpointRenderer);
    }

    public static apmg V(boolean z, aulq aulqVar) {
        if (z && aulqVar != null && aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            return (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        }
        return null;
    }

    public static asni W(boolean z, asnj asnjVar) {
        if (!z || asnjVar == null || (asnjVar.b & 1) == 0) {
            return null;
        }
        asni asniVar = asnjVar.c;
        return asniVar == null ? asni.a : asniVar;
    }

    public static atdu X(aukf aukfVar) {
        if (aukfVar == null || (aukfVar.b & 67108864) == 0) {
            return null;
        }
        aulq aulqVar = aukfVar.B;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
            return null;
        }
        aulq aulqVar2 = aukfVar.B;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (atdu) aulqVar2.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
    }

    public static aukf Y(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null) {
            return null;
        }
        aulq aulqVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.j;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(ReelPlayerOverlayRendererOuterClass.reelPlayerOverlayRenderer)) {
            return null;
        }
        aulq aulqVar2 = reelWatchEndpointOuterClass$ReelWatchEndpoint.j;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (aukf) aulqVar2.pX(ReelPlayerOverlayRendererOuterClass.reelPlayerOverlayRenderer);
    }

    public static aukj Z(aukf aukfVar) {
        if (aukfVar != null && (aukfVar.b & 2097152) != 0) {
            aulq aulqVar = aukfVar.w;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ReelPlayerOverlayRendererOuterClass.reelPlayerPersistentEducationRenderer)) {
                aulq aulqVar2 = aukfVar.w;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                return (aukj) aulqVar2.pX(ReelPlayerOverlayRendererOuterClass.reelPlayerPersistentEducationRenderer);
            }
        }
        return null;
    }

    public static int[] a() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static ReelWatchEndpointOuterClass$ReelWatchEndpoint aa(PlaybackStartDescriptor playbackStartDescriptor) {
        apxf apxfVar;
        if (playbackStartDescriptor == null || (apxfVar = playbackStartDescriptor.b) == null || !apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return null;
        }
        return (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
    }

    public static boolean ab(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null || (reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 65536) == 0) {
            return false;
        }
        auji aujiVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.q;
        if (aujiVar == null) {
            aujiVar = auji.a;
        }
        return aujiVar.b;
    }

    public static boolean ac(arsd arsdVar) {
        aukf aukfVar = null;
        if (arsdVar != null) {
            aukg aukgVar = arsdVar.d;
            if (aukgVar == null) {
                aukgVar = aukg.a;
            }
            if ((aukgVar.b & 1) != 0) {
                aukg aukgVar2 = arsdVar.d;
                if (aukgVar2 == null) {
                    aukgVar2 = aukg.a;
                }
                aukfVar = aukgVar2.c;
                if (aukfVar == null) {
                    aukfVar = aukf.a;
                }
            }
        }
        if (aukfVar == null || (arsdVar.b & 4) == 0) {
            return false;
        }
        aryr aryrVar = arsdVar.e;
        if (aryrVar == null) {
            aryrVar = aryr.a;
        }
        if ((aryrVar.b & 4) == 0) {
            return false;
        }
        aryr aryrVar2 = arsdVar.e;
        if (aryrVar2 == null) {
            aryrVar2 = aryr.a;
        }
        aryi aryiVar = aryrVar2.f;
        if (aryiVar == null) {
            aryiVar = aryi.a;
        }
        int bG = anaf.bG(aryiVar.c);
        return (bG == 0 || bG != 6 || (aukfVar.b & 134217728) == 0) ? false : true;
    }

    public static boolean ad(aukj aukjVar) {
        int bT;
        return (aukjVar == null || (aukjVar.b & 8) == 0 || (bT = aobq.bT(aukjVar.f)) == 0 || bT != 3) ? false : true;
    }

    public static boolean ae(aukf aukfVar) {
        if (aukfVar == null || (aukfVar.b & 4096) == 0) {
            return false;
        }
        int bU = aobq.bU(aukfVar.o);
        if (bU == 0) {
            bU = 1;
        }
        return am(bU);
    }

    public static boolean af(PlaybackStartDescriptor playbackStartDescriptor) {
        int bd;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint aa = aa(playbackStartDescriptor);
        return (aa == null || (bd = anaf.bd(aa.c)) == 0 || bd != 3) ? false : true;
    }

    public static boolean ag(apxf apxfVar) {
        return ai((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
    }

    public static boolean ah(aukf aukfVar) {
        int i = 0;
        if (aukfVar != null && (aukfVar.b & 4096) != 0 && (i = aobq.bU(aukfVar.o)) == 0) {
            i = 1;
        }
        return an(i);
    }

    public static boolean ai(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        return ah(Y(reelWatchEndpointOuterClass$ReelWatchEndpoint));
    }

    public static boolean aj(aukf aukfVar) {
        if (aukfVar == null) {
            return false;
        }
        int bU = aobq.bU(aukfVar.o);
        if (bU == 0) {
            bU = 1;
        }
        return bU == 2 || bU == 3 || bU == 4 || bU == 6 || bU == 8 || bU == 10 || bU == 11 || bU == 1;
    }

    public static boolean ak(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        aukf Y = Y(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        if (Y != null) {
            int i = Y.b;
            if ((1048576 & i) != 0) {
                int bV = aobq.bV(Y.v);
                return bV != 0 && bV == 3;
            }
            if ((i & 4096) != 0) {
                int bU = aobq.bU(Y.o);
                return ao(bU != 0 ? bU : 1);
            }
        }
        return true;
    }

    public static int al(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        aukf Y = Y(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        if (Y == null || (Y.b & 4096) == 0) {
            return 0;
        }
        int bU = aobq.bU(Y.o);
        if (bU == 0) {
            return 1;
        }
        return bU;
    }

    public static boolean am(int i) {
        return i == 12;
    }

    public static boolean an(int i) {
        return i == 5 || i == 7 || i == 9 || i == 12;
    }

    public static boolean ao(int i) {
        return i == 6 || i == 8 || i == 10 || i == 11 || i == 7 || i == 9 || i == 12;
    }

    public static lkb ap() {
        return new lkb(ReelWatchActivity.class, null);
    }

    public static void aq(Activity activity, wcy wcyVar, View view, axdj axdjVar, ici iciVar) {
        D(activity, wcy.A(activity, view), axdjVar, iciVar);
    }

    private static boolean ar(String str) {
        return "FEshared".equals(str) || "FElibrary".equals(str) || "FEoffline_what_to_watch".equals(str) || "FEsubscriptions".equals(str) || "FEwhat_to_watch".equals(str) || "FEactivity".equals(str);
    }

    private static void as(Spannable spannable, Object obj) {
        spannable.setSpan(obj, 0, spannable.length(), 33);
    }

    public static void b(ajwx ajwxVar) {
        aoae aoaeVar = new aoae((byte[]) null, (char[]) null, (byte[]) null);
        ajwxVar.u(new eud(aoaeVar, null, null, null, null));
        ajwxVar.y(new eue(aoaeVar, null, null, null, null));
    }

    public static atda c(Context context, atda atdaVar, int i, int i2, ammv ammvVar) {
        return d(context, atdaVar, i, i2, ammvVar, amlr.a);
    }

    public static atda d(Context context, atda atdaVar, int i, int i2, ammv ammvVar, ammv ammvVar2) {
        aone builder = atdaVar.toBuilder();
        e(context, builder, i2);
        apxf dl = adyu.dl((atda) builder.build());
        if (dl != null && dl.pY(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            aone builder2 = ((OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) dl.pX(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)).toBuilder();
            builder2.copyOnWrite();
            OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) builder2.instance;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint.f = i - 1;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b |= 8;
            if (ammvVar2.h()) {
                String str = (String) ammvVar2.c();
                builder2.copyOnWrite();
                OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) builder2.instance;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.c = 7;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.d = str;
            }
            aong aongVar = (aong) dl.toBuilder();
            aongVar.e(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) builder2.build());
            apxf apxfVar = (apxf) aongVar.build();
            atda atdaVar2 = (atda) builder.instance;
            if ((atdaVar2.b & 2) != 0) {
                atde atdeVar = atdaVar2.d;
                if (atdeVar == null) {
                    atdeVar = atde.a;
                }
                aone builder3 = atdeVar.toBuilder();
                aong aongVar2 = (aong) arfs.a.createBuilder();
                arfr arfrVar = (arfr) ((amna) ammvVar).a;
                aongVar2.copyOnWrite();
                arfs arfsVar = (arfs) aongVar2.instance;
                arfsVar.c = arfrVar.pV;
                arfsVar.b |= 1;
                arfs arfsVar2 = (arfs) aongVar2.build();
                builder3.copyOnWrite();
                atde atdeVar2 = (atde) builder3.instance;
                arfsVar2.getClass();
                atdeVar2.d = arfsVar2;
                atdeVar2.b |= 4;
                builder.copyOnWrite();
                atda atdaVar3 = (atda) builder.instance;
                atde atdeVar3 = (atde) builder3.build();
                atdeVar3.getClass();
                atdaVar3.d = atdeVar3;
                atdaVar3.b |= 2;
            }
            adyu.dq(builder, apxfVar);
        }
        return (atda) builder.build();
    }

    public static void e(Context context, aone aoneVar, int i) {
        aqyg g = ajcq.g(context.getResources().getString(i));
        atda atdaVar = (atda) aoneVar.instance;
        int i2 = atdaVar.b;
        if ((i2 & 1) != 0) {
            atdb atdbVar = atdaVar.c;
            if (atdbVar == null) {
                atdbVar = atdb.a;
            }
            aone builder = atdbVar.toBuilder();
            builder.copyOnWrite();
            atdb atdbVar2 = (atdb) builder.instance;
            g.getClass();
            atdbVar2.c = g;
            atdbVar2.b |= 1;
            aoneVar.copyOnWrite();
            atda atdaVar2 = (atda) aoneVar.instance;
            atdb atdbVar3 = (atdb) builder.build();
            atdbVar3.getClass();
            atdaVar2.c = atdbVar3;
            atdaVar2.b |= 1;
            return;
        }
        if ((i2 & 2) != 0) {
            atde atdeVar = atdaVar.d;
            if (atdeVar == null) {
                atdeVar = atde.a;
            }
            aone builder2 = atdeVar.toBuilder();
            builder2.copyOnWrite();
            atde atdeVar2 = (atde) builder2.instance;
            g.getClass();
            atdeVar2.c = g;
            atdeVar2.b |= 1;
            aoneVar.copyOnWrite();
            atda atdaVar3 = (atda) aoneVar.instance;
            atde atdeVar3 = (atde) builder2.build();
            atdeVar3.getClass();
            atdaVar3.d = atdeVar3;
            atdaVar3.b |= 2;
            return;
        }
        if ((i2 & 16) != 0) {
            atcw atcwVar = atdaVar.g;
            if (atcwVar == null) {
                atcwVar = atcw.a;
            }
            aone builder3 = atcwVar.toBuilder();
            builder3.copyOnWrite();
            atcw atcwVar2 = (atcw) builder3.instance;
            g.getClass();
            atcwVar2.c = g;
            atcwVar2.b |= 1;
            aoneVar.copyOnWrite();
            atda atdaVar4 = (atda) aoneVar.instance;
            atcw atcwVar3 = (atcw) builder3.build();
            atcwVar3.getClass();
            atdaVar4.g = atcwVar3;
            atdaVar4.b |= 16;
            return;
        }
        if ((i2 & 32) != 0) {
            atcx atcxVar = atdaVar.h;
            if (atcxVar == null) {
                atcxVar = atcx.a;
            }
            aone builder4 = atcxVar.toBuilder();
            builder4.copyOnWrite();
            atcx atcxVar2 = (atcx) builder4.instance;
            g.getClass();
            atcxVar2.c = g;
            atcxVar2.b |= 1;
            aoneVar.copyOnWrite();
            atda atdaVar5 = (atda) aoneVar.instance;
            atcx atcxVar3 = (atcx) builder4.build();
            atcxVar3.getClass();
            atdaVar5.h = atcxVar3;
            atdaVar5.b |= 32;
            return;
        }
        if ((i2 & 8) != 0) {
            aone createBuilder = atdk.a.createBuilder();
            atdk atdkVar = ((atda) aoneVar.instance).f;
            if (atdkVar == null) {
                atdkVar = atdk.a;
            }
            if (!atdkVar.i) {
                createBuilder.copyOnWrite();
                atdk atdkVar2 = (atdk) createBuilder.instance;
                g.getClass();
                atdkVar2.c = g;
                atdkVar2.b |= 1;
            } else {
                createBuilder.copyOnWrite();
                atdk atdkVar3 = (atdk) createBuilder.instance;
                g.getClass();
                atdkVar3.f = g;
                atdkVar3.b |= 16;
            }
            aoneVar.copyOnWrite();
            atda atdaVar6 = (atda) aoneVar.instance;
            atdk atdkVar4 = (atdk) createBuilder.build();
            atdkVar4.getClass();
            atdaVar6.f = atdkVar4;
            atdaVar6.b |= 8;
        }
    }

    public static String f(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append("playlistIdToPlaylistThumbnailStyle.");
        sb.append(str);
        return sb.toString();
    }

    public static atoo g(agng agngVar) {
        atqa atqaVar = agngVar.l;
        if (atqaVar != null && atqaVar.j.size() != 0) {
            for (atpz atpzVar : atqaVar.j) {
                if ((atpzVar.b & 2) != 0) {
                    atoo atooVar = atpzVar.c;
                    return atooVar == null ? atoo.a : atooVar;
                }
            }
        }
        return null;
    }

    public static void h(Context context) {
        i(false, context);
    }

    public static void i(boolean z, Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.uiMode = (true != z ? 16 : 32) | (configuration.uiMode & (-49));
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }

    public static boolean j(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean k(int i) {
        return i == 0;
    }

    public static boolean l(int i) {
        return j(i, 1);
    }

    public static boolean m(int i) {
        return j(i, 2);
    }

    public static void n(ajok ajokVar, int i) {
        ajokVar.f("lineSeparatorOverride", Integer.valueOf(i));
    }

    public static void o(ajok ajokVar, int i) {
        ajokVar.f("setBackgroundColor", Integer.valueOf(i));
    }

    public static void p(Context context, ajok ajokVar, ajop ajopVar, boolean z) {
        ajokVar.getClass();
        ajokVar.f("setBackgroundColor", Integer.valueOf(z ? wbs.Q(context, R.attr.yt10PercentLayer) : 0));
        ajopVar.e(ajokVar);
    }

    public static boolean q(xae xaeVar) {
        return xaeVar != null && xaeVar.a() == 1;
    }

    public static int r(Activity activity) {
        return activity.getResources().getConfiguration().orientation;
    }

    public static boolean s(int i) {
        return i == 2;
    }

    public static boolean t(int i) {
        return i == 1;
    }

    public static boolean u(fhg fhgVar) {
        return (fhgVar.e() || fhgVar.m()) ? false : true;
    }

    public static int v(int i, boolean z) {
        if (i == 1) {
            return z ? 3 : 2;
        }
        if (i == 2) {
            return z ? 5 : 4;
        }
        return 0;
    }

    public static String w(PaneDescriptor paneDescriptor) {
        if (paneDescriptor == null) {
            return null;
        }
        return x(paneDescriptor.e());
    }

    public static String x(apxf apxfVar) {
        if (apxfVar == null || !apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
            return null;
        }
        return ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c;
    }

    public static boolean y(apxf apxfVar) {
        String x = x(apxfVar);
        if (x == null) {
            return false;
        }
        if (ar(x)) {
            return true;
        }
        String str = null;
        if (apxfVar != null && apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint)) {
            str = ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).j;
        }
        return ar(str);
    }

    public static awas z(String str, axzg axzgVar) {
        try {
            aswb aswbVar = axzgVar.a.a().e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.aS) {
                aomf b = aalt.b(str);
                if (b.H()) {
                    return null;
                }
                return (awas) aonm.parseFrom(awas.a, b, aomw.b());
            }
            return (awas) aonm.parseFrom(awas.a, aalt.b(str), aomw.b());
        } catch (aoob unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Found entityKey=`");
            sb.append(str);
            sb.append("` that does not contain a ViewModelEntityId message as it's identifier.");
            zga.b(sb.toString());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hxx J(ce ceVar) {
        if (ceVar == 0) {
            throw new IllegalStateException("Could not find VideoEffectsComponent from a parent fragment. Make sure the current fragment is a child of VideoEffectsComponentSupplier.");
        }
        if (!(ceVar instanceof hxy)) {
            return J(ceVar.C);
        }
        return ((hxy) ceVar).h();
    }
}
