package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fhe {
    public static String A(String str) {
        return n(avzg.b, str);
    }

    public static boolean B(agaf agafVar) {
        agafVar.getClass();
        return agafVar.c("video_notifications_enabled", true);
    }

    public static aozh E(aswb aswbVar) {
        aozi aoziVar = aswbVar.s;
        if (aoziVar == null) {
            aoziVar = aozi.a;
        }
        aozh aozhVar = aoziVar.c;
        return aozhVar == null ? aozh.a : aozhVar;
    }

    public static boolean F(aswb aswbVar) {
        if ((aswbVar.b & 64) == 0) {
            return false;
        }
        aozi aoziVar = aswbVar.s;
        if (aoziVar == null) {
            aoziVar = aozi.a;
        }
        return (aoziVar.b & 4) != 0;
    }

    public static boolean G(List list, Class cls) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cls.isInstance(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void H(View view, boolean z) {
        if (z) {
            I(view);
        } else {
            J(view);
        }
    }

    public static void I(View... viewArr) {
        for (View view : viewArr) {
            if (view != null && (view.getVisibility() != 0 || view.getAlpha() != 1.0f)) {
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(1.0f).setDuration(100L).start();
            }
        }
    }

    public static void J(View... viewArr) {
        for (View view : viewArr) {
            if (view != null && view.getVisibility() == 0) {
                view.animate().cancel();
                view.animate().alpha(0.0f).setDuration(100L).withEndAction(new hgc(view, 0)).start();
            }
        }
    }

    public static void K(View view, boolean z) {
        if (!z) {
            View[] viewArr = {view};
            for (int i = 0; i <= 0; i++) {
                View view2 = viewArr[i];
                if (view2 != null && view2.getVisibility() == 0) {
                    view2.animate().cancel();
                    view2.animate().alpha(0.0f).setStartDelay(100L).setDuration(100L).withEndAction(new hgc(view2, 2)).start();
                    view2.animate().scaleX(0.9f).setDuration(200L).start();
                    view2.animate().scaleY(0.9f).setDuration(200L).start();
                }
            }
            return;
        }
        View[] viewArr2 = {view};
        for (int i2 = 0; i2 <= 0; i2++) {
            View view3 = viewArr2[i2];
            if (view3 != null && (view3.getVisibility() != 0 || view3.getAlpha() != 1.0f || view3.getScaleX() != 1.0f || view3.getScaleY() != 1.0f)) {
                view3.animate().cancel();
                view3.setVisibility(0);
                view3.setScaleX(0.9f);
                view3.setScaleY(0.9f);
                view3.animate().alpha(1.0f).setDuration(100L).start();
                view3.animate().scaleX(1.0f).setDuration(200L).start();
                view3.animate().scaleY(1.0f).setDuration(200L).start();
            }
        }
    }

    public static Bitmap L(Bitmap bitmap, double d) {
        int i;
        int i2;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d2 = height;
        double d3 = width;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if (d2 / d3 > d) {
            Double.isNaN(d3);
            i2 = (int) (d3 * d);
            i = width;
        } else {
            Double.isNaN(d2);
            i = (int) (d2 / d);
            i2 = height;
        }
        try {
            return Bitmap.createBitmap(bitmap, (width - i) / 2, (height - i2) / 2, i, i2);
        } catch (OutOfMemoryError e) {
            afsi.c(2, 6, "[ShortsCreation][Android][Camera]Out of memory when creating bitmap", e);
            return null;
        }
    }

    public static Bundle M(avgg avggVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.youtube.ThumbnailData", new ParcelableMessageLite(avggVar));
        return bundle;
    }

    public static avgg N(apxf apxfVar, ajjz ajjzVar) {
        avgg avggVar;
        avgg avggVar2 = null;
        if (apxfVar != null && apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 64) != 0) {
                avggVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
            } else {
                avggVar = null;
            }
            if (avggVar != null) {
                avggVar2 = avggVar;
            } else if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 64) != 0) {
                avgg avggVar3 = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
                if (avggVar3 == null) {
                    avggVar3 = avgg.a;
                }
                avggVar2 = avggVar3;
            }
            if (avggVar2 != null) {
                ajjzVar.n(avggVar2, avggVar2.c.size() > 0 ? ((avgf) avggVar2.c.get(0)).d : 1, avggVar2.c.size() > 0 ? ((avgf) avggVar2.c.get(0)).e : 1);
            }
        }
        return avggVar2;
    }

    public static AnimatorSet O(TextView textView, float f) {
        if (textView == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int shadowColor = textView.getShadowColor();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 0.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(shadowColor), 0);
        ofObject.addUpdateListener(new abpv(textView, 1, null));
        animatorSet2.playTogether(amru.s(ofFloat, ofObject));
        animatorSet2.setStartDelay(250L);
        animatorSet2.setDuration(250L);
        animatorSet.playSequentially(ObjectAnimator.ofFloat(textView, "translationX", f, 0.0f).setDuration(300L), animatorSet2);
        animatorSet.addListener(new hac(textView, shadowColor));
        return animatorSet;
    }

    public static void P(acra acraVar, String str, acsc acscVar) {
        if (acraVar == null || acscVar == null) {
            return;
        }
        acqx acqxVar = new acqx(acscVar);
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = asir.a.createBuilder();
        createBuilder2.copyOnWrite();
        asir asirVar = (asir) createBuilder2.instance;
        str.getClass();
        asirVar.b |= 1;
        asirVar.c = str;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        asir asirVar2 = (asir) createBuilder2.build();
        asirVar2.getClass();
        ashtVar.g = asirVar2;
        ashtVar.b |= 8;
        acraVar.I(65, acqxVar, (asht) createBuilder.build());
    }

    public static void Q(TextView textView, int i) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i);
    }

    public static String R(PlayerResponseModel playerResponseModel) {
        String x = playerResponseModel.x();
        return x == null ? "" : x;
    }

    public static String S(PlayerResponseModel playerResponseModel) {
        String y = playerResponseModel.y();
        return (y == null || y.isEmpty()) ? "https://www.youtube.com" : wbs.ah(y).toString();
    }

    public static Bitmap a(Resources resources, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int min = Math.min(height, (int) (width / resources.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1)));
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_icon_size) / min;
        Matrix matrix = new Matrix();
        matrix.setScale(dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f);
        return Bitmap.createBitmap(bitmap, (width - min) / 2, (height - min) / 2, min, min, matrix, false);
    }

    public static String b(String str) {
        return n(aoxn.b, str);
    }

    public static String c(String str) {
        return n(awid.b, str);
    }

    public static String d() {
        return n(asxk.b, "");
    }

    public static String e(aqmf aqmfVar) {
        return m(aqmj.b, aqmfVar.toByteString());
    }

    public static String f(awas awasVar) {
        return m(aqmj.b, awasVar.toByteString());
    }

    public static String g(String str) {
        return n(awih.b, str);
    }

    public static String h(String str) {
        return n(awim.b, str);
    }

    public static String i() {
        return n(awiw.b, "downloads_list");
    }

    public static String j() {
        return n(aqoh.b, "downloads_page_state");
    }

    public static String k(awas awasVar) {
        return m(aqol.b, awasVar.toByteString());
    }

    public static String l(String str) {
        return n(aqpc.b, str);
    }

    public static String m(aomu aomuVar, aomf aomfVar) {
        return aalt.e(aomuVar.a(), aomfVar);
    }

    public static String n(aomu aomuVar, String str) {
        return aalt.f(aomuVar.a(), str);
    }

    public static String o(String str) {
        return n(asxt.b, str);
    }

    public static String p() {
        return n(asww.b, "video");
    }

    public static String q(String str) {
        return n(atrf.b, str);
    }

    public static String r(String str) {
        return n(atrl.b, str);
    }

    public static String s(String str) {
        return n(atxc.b, str);
    }

    public static String t(String str) {
        return n(awjc.b, str);
    }

    public static String u(String str, String str2) {
        aonk aonkVar = awjj.b;
        aone createBuilder = awjf.a.createBuilder();
        createBuilder.copyOnWrite();
        awjf awjfVar = (awjf) createBuilder.instance;
        str.getClass();
        awjfVar.b |= 2;
        awjfVar.d = str;
        createBuilder.copyOnWrite();
        awjf awjfVar2 = (awjf) createBuilder.instance;
        str2.getClass();
        awjfVar2.b |= 1;
        awjfVar2.c = str2;
        return m(aonkVar, ((awjf) createBuilder.build()).toByteString());
    }

    public static String v(String str) {
        return n(asxe.b, str);
    }

    public static String w() {
        return n(awiw.b, "DOWNLOADS_LIST_ENTITY_ID_SMART_DOWNLOADS");
    }

    public static String x(String str) {
        return n(avjt.b, str);
    }

    public static String y(String str) {
        return n(awjq.b, str);
    }

    public static String z(String str) {
        return n(asxo.b, str);
    }

    public void C() {
    }

    public void D(apmp apmpVar) {
    }
}
