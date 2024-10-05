package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yae {
    public aahd a;
    public final yal b;
    public final ysy c;
    public final zbi d;
    public final Map e;
    public final Map f;
    public final Map g;

    public yae(yal yalVar, ysy ysyVar, zbi zbiVar) {
        yalVar.getClass();
        this.b = yalVar;
        ysyVar.getClass();
        this.c = ysyVar;
        zbiVar.getClass();
        this.d = zbiVar;
        HashMap hashMap = new HashMap();
        hashMap.put(yad.EnabledLikeButton, Integer.valueOf(R.drawable.yt_fill_thumb_up_black_16));
        hashMap.put(yad.DisabledLikeButton, Integer.valueOf(R.drawable.yt_outline_thumb_up_black_16));
        hashMap.put(yad.EnabledDislikeButton, Integer.valueOf(R.drawable.yt_fill_thumb_down_black_16));
        hashMap.put(yad.DisabledDislikeButton, Integer.valueOf(R.drawable.yt_outline_thumb_down_black_16));
        this.e = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(yad.EnabledLikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_up_googblue_18));
        hashMap2.put(yad.DisabledLikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_up_grey600_18));
        hashMap2.put(yad.EnabledDislikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_down_googblue_18));
        hashMap2.put(yad.DisabledDislikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_down_grey600_18));
        this.g = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put(yad.EnabledLikeButton, Integer.valueOf(R.drawable.yt_fill_thumb_up_black_24));
        hashMap3.put(yad.DisabledLikeButton, Integer.valueOf(R.drawable.yt_outline_thumb_up_black_24));
        hashMap3.put(yad.EnabledDislikeButton, Integer.valueOf(R.drawable.yt_fill_thumb_down_black_24));
        hashMap3.put(yad.DisabledDislikeButton, Integer.valueOf(R.drawable.yt_outline_thumb_down_black_24));
        hashMap3.put(yad.ElementsLikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_up_white_24));
        hashMap3.put(yad.ElementsDislikeButton, Integer.valueOf(R.drawable.quantum_ic_thumb_down_white_24));
        this.f = hashMap3;
    }

    public static void a(apmp apmpVar, ImageView imageView, Map map) {
        int intValue = ((Integer) map.get(yad.EnabledDislikeButton)).intValue();
        int intValue2 = ((Integer) map.get(yad.DisabledDislikeButton)).intValue();
        if (apmpVar.e) {
            imageView.setImageDrawable(g(imageView.getContext(), intValue, R.attr.ytTextPrimary));
            if ((apmpVar.b & 8192) != 0) {
                imageView.setContentDescription(apmpVar.o);
                return;
            }
            return;
        }
        imageView.setImageDrawable(g(imageView.getContext(), intValue2, R.attr.ytTextPrimary));
        if ((apmpVar.b & 128) != 0) {
            imageView.setContentDescription(apmpVar.i);
        }
    }

    public static void b(apmp apmpVar, View view, Map map) {
        int intValue = ((Integer) map.get(yad.EnabledDislikeButton)).intValue();
        int intValue2 = ((Integer) map.get(yad.DisabledDislikeButton)).intValue();
        ImageView imageView = (ImageView) view.findViewById(R.id.comment_dislike_button_image);
        TextView textView = (TextView) view.findViewById(R.id.comment_action_toolbar_dislike_text);
        if (apmpVar.e) {
            imageView.setImageDrawable(g(view.getContext(), intValue, R.attr.ytStaticBlue));
            if ((apmpVar.b & 8192) != 0) {
                view.setContentDescription(apmpVar.o);
            }
        } else {
            imageView.setImageDrawable(g(view.getContext(), intValue2, R.attr.ytIcon1));
            if ((apmpVar.b & 128) != 0) {
                view.setContentDescription(apmpVar.i);
            }
        }
        aqyg aqygVar = apmpVar.h;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        if (TextUtils.isEmpty(ajcq.b(aqygVar).toString())) {
            return;
        }
        aqyg aqygVar2 = apmpVar.h;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar2));
    }

    public static void c(apmp apmpVar, ImageView imageView, TextView textView, Map map) {
        apxf apxfVar;
        int intValue = ((Integer) map.get(yad.EnabledLikeButton)).intValue();
        int intValue2 = ((Integer) map.get(yad.DisabledLikeButton)).intValue();
        if (apmpVar.e) {
            apxfVar = apmpVar.k;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            imageView.setImageDrawable(g(imageView.getContext(), intValue, R.attr.ytTextPrimary));
            if ((apmpVar.b & 8192) != 0) {
                imageView.setContentDescription(apmpVar.o);
            }
        } else {
            apxf apxfVar2 = apmpVar.p;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            imageView.setImageDrawable(g(imageView.getContext(), intValue2, R.attr.ytTextPrimary));
            if ((apmpVar.b & 128) != 0) {
                imageView.setContentDescription(apmpVar.i);
            }
            apxfVar = apxfVar2;
        }
        if (apxfVar == null || !apxfVar.pY(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint)) {
            return;
        }
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint) apxfVar.pX(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
        if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.size() <= 0 || !((apxf) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0)).pY(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction)) {
            return;
        }
        aqyg aqygVar = ((UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction) ((apxf) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0)).pX(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction)).c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
    }

    public static void d(apmp apmpVar, View view, Map map) {
        apxf apxfVar;
        int intValue = ((Integer) map.get(yad.EnabledLikeButton)).intValue();
        int intValue2 = ((Integer) map.get(yad.DisabledLikeButton)).intValue();
        ImageView imageView = (ImageView) view.findViewById(R.id.comment_like_button_image);
        TextView textView = (TextView) view.findViewById(R.id.comment_action_toolbar_like_text);
        if (apmpVar.e) {
            apxfVar = apmpVar.k;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            imageView.setImageDrawable(g(view.getContext(), intValue, R.attr.ytStaticBlue));
            if ((apmpVar.b & 8192) != 0) {
                view.setContentDescription(apmpVar.o);
            }
        } else {
            apxf apxfVar2 = apmpVar.p;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            imageView.setImageDrawable(g(view.getContext(), intValue2, R.attr.ytIcon1));
            if ((apmpVar.b & 128) != 0) {
                view.setContentDescription(apmpVar.i);
            }
            apxfVar = apxfVar2;
        }
        if (apxfVar == null || !apxfVar.pY(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint)) {
            return;
        }
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint) apxfVar.pX(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
        if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.size() <= 0 || !((apxf) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0)).pY(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction)) {
            return;
        }
        UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction updateCommentVoteActionOuterClass$UpdateCommentVoteAction = (UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction) ((apxf) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0)).pX(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction);
        if ((updateCommentVoteActionOuterClass$UpdateCommentVoteAction.b & 1) == 0) {
            aqyg aqygVar = apmpVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
            return;
        }
        aqyg aqygVar2 = updateCommentVoteActionOuterClass$UpdateCommentVoteAction.c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar2));
    }

    public static apxf e(aone aoneVar, acra acraVar) {
        apxf apxfVar;
        apmp apmpVar = (apmp) aoneVar.instance;
        boolean z = apmpVar.e;
        apxf apxfVar2 = null;
        if ((z && (apmpVar.b & 16384) != 0) || (!z && (apmpVar.b & 512) != 0)) {
            if (z) {
                apxfVar = apmpVar.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = apmpVar.k;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            }
            aone createBuilder = aupf.a.createBuilder();
            String k = acraVar.k();
            createBuilder.copyOnWrite();
            aupf aupfVar = (aupf) createBuilder.instance;
            k.getClass();
            aupfVar.b |= 1;
            aupfVar.c = k;
            aupf aupfVar2 = (aupf) createBuilder.build();
            aong aongVar = (aong) apxfVar.toBuilder();
            aongVar.e(aupg.b, aupfVar2);
            apxfVar2 = (apxf) aongVar.build();
            if (!z) {
                aoneVar.copyOnWrite();
                apmp apmpVar2 = (apmp) aoneVar.instance;
                apxfVar2.getClass();
                apmpVar2.k = apxfVar2;
                apmpVar2.b |= 512;
            } else {
                aoneVar.copyOnWrite();
                apmp apmpVar3 = (apmp) aoneVar.instance;
                apxfVar2.getClass();
                apmpVar3.p = apxfVar2;
                apmpVar3.b |= 16384;
            }
        }
        return apxfVar2;
    }

    public static void f(aone aoneVar, aone aoneVar2) {
        boolean z = ((apmp) aoneVar.instance).e;
        aoneVar.copyOnWrite();
        apmp apmpVar = (apmp) aoneVar.instance;
        apmpVar.b |= 8;
        apmpVar.e = !z;
        aoneVar2.copyOnWrite();
        apmp apmpVar2 = (apmp) aoneVar2.instance;
        apmpVar2.b |= 8;
        apmpVar2.e = false;
    }

    private static Drawable g(Context context, int i, int i2) {
        Drawable a = aii.a(context, i);
        int orElse = wbs.W(context, i2).orElse(0);
        if (a == null) {
            return null;
        }
        Drawable c = gl.c(a);
        c.setTint(orElse);
        return c;
    }
}
