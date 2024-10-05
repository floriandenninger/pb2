package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.text.Annotation;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataSectionRendererOuterClass;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muf {
    public muf() {
    }

    public muf(byte[] bArr) {
    }

    public static auoy A(boolean z) {
        aong aongVar = (aong) askd.a.createBuilder();
        if (z) {
            aone createBuilder = auoq.a.createBuilder();
            createBuilder.copyOnWrite();
            auoq auoqVar = (auoq) createBuilder.instance;
            auoqVar.c = 1;
            auoqVar.b |= 1;
            auoq auoqVar2 = (auoq) createBuilder.build();
            aone createBuilder2 = askg.a.createBuilder();
            createBuilder2.copyOnWrite();
            askg askgVar = (askg) createBuilder2.instance;
            auoqVar2.getClass();
            askgVar.au = auoqVar2;
            askgVar.h |= 512;
            aongVar.cn((askg) createBuilder2.build());
        }
        aone createBuilder3 = auoq.a.createBuilder();
        createBuilder3.copyOnWrite();
        auoq auoqVar3 = (auoq) createBuilder3.instance;
        auoqVar3.c = 2;
        auoqVar3.b |= 1;
        auoq auoqVar4 = (auoq) createBuilder3.build();
        aone createBuilder4 = auoq.a.createBuilder();
        createBuilder4.copyOnWrite();
        auoq auoqVar5 = (auoq) createBuilder4.instance;
        auoqVar5.c = 4;
        auoqVar5.b |= 1;
        auoq auoqVar6 = (auoq) createBuilder4.build();
        aone createBuilder5 = auoq.a.createBuilder();
        createBuilder5.copyOnWrite();
        auoq auoqVar7 = (auoq) createBuilder5.instance;
        auoqVar7.c = 3;
        auoqVar7.b = 1 | auoqVar7.b;
        auoq auoqVar8 = (auoq) createBuilder5.build();
        aone createBuilder6 = askg.a.createBuilder();
        createBuilder6.copyOnWrite();
        askg askgVar2 = (askg) createBuilder6.instance;
        auoqVar4.getClass();
        askgVar2.au = auoqVar4;
        askgVar2.h |= 512;
        aongVar.cn((askg) createBuilder6.build());
        aone createBuilder7 = askg.a.createBuilder();
        createBuilder7.copyOnWrite();
        askg askgVar3 = (askg) createBuilder7.instance;
        auoqVar6.getClass();
        askgVar3.au = auoqVar6;
        askgVar3.h |= 512;
        aongVar.cn((askg) createBuilder7.build());
        aone createBuilder8 = askg.a.createBuilder();
        createBuilder8.copyOnWrite();
        askg askgVar4 = (askg) createBuilder8.instance;
        auoqVar8.getClass();
        askgVar4.au = auoqVar8;
        askgVar4.h |= 512;
        aongVar.cn((askg) createBuilder8.build());
        aone createBuilder9 = askg.a.createBuilder();
        createBuilder9.copyOnWrite();
        askg askgVar5 = (askg) createBuilder9.instance;
        auoqVar8.getClass();
        askgVar5.au = auoqVar8;
        askgVar5.h |= 512;
        aongVar.cn((askg) createBuilder9.build());
        aone createBuilder10 = auoy.a.createBuilder();
        askd askdVar = (askd) aongVar.build();
        createBuilder10.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder10.instance;
        askdVar.getClass();
        auoyVar.j = askdVar;
        auoyVar.b |= 16;
        return (auoy) createBuilder10.build();
    }

    public static boolean B(int i) {
        return (i == 4 || i == 0) ? false : true;
    }

    public static void C(Spannable spannable, Object obj, int i, int i2) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    public static int D(int i) {
        return i & 7;
    }

    public static final pnv E(psm psmVar) {
        return new pnv(psmVar.a());
    }

    public static final void F(pnv pnvVar, psm psmVar) {
        int i = pnv.b;
        psn psnVar = pnvVar.a;
        for (int i2 = 0; i2 < psnVar.b(); i2++) {
            psmVar.b(psnVar.a(i2));
        }
    }

    public static final void G(int[] iArr, psm psmVar) {
        for (int i : iArr) {
            psmVar.b(i);
        }
    }

    public static final void H(int i, boolean z, psm psmVar) {
        if (z) {
            psmVar.b(i);
        }
    }

    public static final pom I(poj pojVar) {
        pse.g(!pojVar.p);
        pojVar.p = true;
        return new pom(pojVar);
    }

    public static final void J(pmv pmvVar, poj pojVar) {
        pse.g(!pojVar.p);
        pojVar.e = pmvVar;
    }

    public static long K(phq phqVar) {
        phr phrVar = (phr) phqVar;
        if (phrVar.b.containsKey("exo_len")) {
            return ByteBuffer.wrap((byte[]) phrVar.b.get("exo_len")).getLong();
        }
        return -1L;
    }

    public static void L(phg phgVar, String str) {
        Iterator it = phgVar.f(str).iterator();
        while (it.hasNext()) {
            try {
                phgVar.k((phl) it.next());
            } catch (phe unused) {
            }
        }
    }

    public static String M(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] X = X(str2);
        if (X[0] != -1) {
            sb.append(str2);
            W(sb, X[1], X[2]);
            return sb.toString();
        }
        int[] X2 = X(str);
        if (X[3] == 0) {
            sb.append((CharSequence) str, 0, X2[3]);
            sb.append(str2);
            return sb.toString();
        }
        int i = X[2];
        if (i == 0) {
            sb.append((CharSequence) str, 0, X2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (X[1] != 0) {
            int i2 = X2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return W(sb, X[1] + i2, i2 + X[2]);
        }
        if (i == 0 || str2.charAt(0) != '/') {
            int i3 = X2[0];
            int i4 = X2[1];
            if (i3 + 2 >= i4 || i4 != X2[2]) {
                int lastIndexOf = str.lastIndexOf(47, X2[2] - 1);
                int i5 = lastIndexOf == -1 ? X2[1] : lastIndexOf + 1;
                sb.append((CharSequence) str, 0, i5);
                sb.append(str2);
                return W(sb, X2[1], i5 + X[2]);
            }
            sb.append((CharSequence) str, 0, i4);
            sb.append('/');
            sb.append(str2);
            int i6 = X2[1];
            return W(sb, i6, X[2] + i6 + 1);
        }
        sb.append((CharSequence) str, 0, X2[1]);
        sb.append(str2);
        int i7 = X2[1];
        return W(sb, i7, X[2] + i7);
    }

    public static boolean N(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean O(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean P(XmlPullParser xmlPullParser, String str) {
        return O(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String Q(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid mime type: ".concat(valueOf) : new String("Invalid mime type: "));
        }
        return str.substring(0, indexOf);
    }

    public static boolean R(String str) {
        return Q(str).equals("audio");
    }

    public static boolean S(String str) {
        return Q(str).equals("video");
    }

    private static TextView T(View view, ViewGroup viewGroup, Context context, int i) {
        LayoutInflater from = LayoutInflater.from(context);
        if (view == null) {
            return (TextView) from.inflate(i, viewGroup, false);
        }
        return (TextView) view;
    }

    private static void U(TextView textView, String str, String str2) {
        if (true == str.isEmpty()) {
            str = str2;
        }
        textView.setText(str);
    }

    private static void V(TextView textView, boolean z, boolean z2, Context context) {
        int Q;
        if (!z) {
            Q = wbs.Q(context, R.attr.adText1);
        } else if (z2) {
            Q = wbs.Q(context, R.attr.ytTextSecondaryInverse);
        } else {
            Q = wbs.Q(context, R.attr.adText2);
        }
        textView.setTextColor(Q);
    }

    private static String W(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 != i7 || sb.charAt(i6) != '.') {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            } else {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    private static int[] X(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static final int a(Resources resources, aswa aswaVar) {
        if (aswaVar == null) {
            return resources.getInteger(R.integer.compact_renderer_title_max_lines);
        }
        int cX = amkq.cX(aswaVar.b);
        if (cX == 0 || cX != 7) {
            return resources.getInteger(R.integer.compact_renderer_title_max_lines);
        }
        return resources.getInteger(R.integer.compact_renderer_title_smaller_thumbnail_max_lines);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(android.content.res.Resources r7, defpackage.aswa r8, com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView r9, android.widget.RelativeLayout r10, android.widget.TextView r11) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            if (r8 != 0) goto L7
            return
        L7:
            r1 = 2131492894(0x7f0c001e, float:1.8609253E38)
            int r1 = r7.getInteger(r1)
            int r8 = r8.b
            int r8 = defpackage.amkq.cX(r8)
            if (r8 != 0) goto L17
            r8 = 2
        L17:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.widget.LinearLayout
            r3 = 8
            if (r2 == 0) goto L41
            r2 = r0
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r4 = 0
            r2.weight = r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 9
            if (r8 == r3) goto L31
            if (r8 != r6) goto L33
            r8 = 9
        L31:
            r2.weight = r5
        L33:
            if (r10 == 0) goto L41
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r2.weight = r4
            if (r8 != r6) goto L41
            r2.weight = r5
        L41:
            r2 = -1
            int r8 = r8 + r2
            r4 = 5
            r5 = 2131166839(0x7f070677, float:1.7947935E38)
            if (r8 == r4) goto L99
            r4 = 6
            if (r8 == r4) goto L81
            r4 = 7
            if (r8 == r4) goto L6d
            if (r8 == r3) goto L5f
            r8 = 2131167081(0x7f070769, float:1.7948426E38)
            float r7 = r7.getDimension(r8)
            int r7 = (int) r7
            r0.width = r7
            r9.c(r5)
            goto La6
        L5f:
            if (r10 == 0) goto L69
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()
            r7.width = r2
            r0.width = r2
        L69:
            r9.c(r5)
            goto La6
        L6d:
            if (r10 == 0) goto L7d
            android.view.ViewGroup$LayoutParams r8 = r10.getLayoutParams()
            r10 = 2131167077(0x7f070765, float:1.7948417E38)
            float r7 = r7.getDimension(r10)
            int r7 = (int) r7
            r8.width = r7
        L7d:
            r9.c(r5)
            goto La6
        L81:
            r8 = 2131492896(0x7f0c0020, float:1.8609257E38)
            int r1 = r7.getInteger(r8)
            r8 = 2131167076(0x7f070764, float:1.7948415E38)
            float r7 = r7.getDimension(r8)
            int r7 = (int) r7
            r0.width = r7
            r7 = 2131167578(0x7f07095a, float:1.7949434E38)
            r9.c(r7)
            goto La6
        L99:
            r8 = 2131167075(0x7f070763, float:1.7948413E38)
            float r7 = r7.getDimension(r8)
            int r7 = (int) r7
            r0.width = r7
            r9.c(r5)
        La6:
            r11.setMaxLines(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muf.b(android.content.res.Resources, aswa, com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView, android.widget.RelativeLayout, android.widget.TextView):void");
    }

    public static final void c(Resources resources, aswa aswaVar, LinearLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2) {
        if (aswaVar == null) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
            layoutParams2.weight = 1.0f;
            return;
        }
        int cX = amkq.cX(aswaVar.b);
        if (cX == 0) {
            cX = 2;
        }
        int i = cX - 1;
        if (i == 5) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_bigger_thumbnail_width);
            layoutParams2.weight = 1.0f;
            return;
        }
        if (i == 6) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_compact_thumbnail_width);
            layoutParams2.weight = 1.0f;
        } else if (i == 7) {
            layoutParams.weight = 1.0f;
            layoutParams2.weight = 0.0f;
            layoutParams2.width = (int) resources.getDimension(R.dimen.list_item_fixed_metadata_width);
        } else if (i == 8) {
            layoutParams.width = -1;
            layoutParams.weight = 1.0f;
            layoutParams2.weight = 1.0f;
        } else {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
            layoutParams2.weight = 1.0f;
        }
    }

    public static final boolean d(aswa aswaVar) {
        int cX;
        return (aswaVar == null || (cX = amkq.cX(aswaVar.b)) == 0 || cX != 10) ? false : true;
    }

    public static boolean e(boolean z) {
        return !z;
    }

    public static View f(View view, ViewGroup viewGroup, String str, String str2, boolean z, Context context, int i) {
        TextView T = T(view, viewGroup, context, i);
        ViewGroup.LayoutParams layoutParams = T.getLayoutParams();
        layoutParams.height = -2;
        T.setLayoutParams(layoutParams);
        T.setSingleLine(false);
        U(T, str, str2);
        V(T, z, false, context);
        return T;
    }

    public static View g(View view, ViewGroup viewGroup, String str, String str2, boolean z, boolean z2, Context context, int i) {
        TextView T = T(view, viewGroup, context, i);
        T.setSingleLine(false);
        U(T, str, str2);
        V(T, z, z2, context);
        return T;
    }

    public static List h(ajok ajokVar, Object obj, List list, ajos ajosVar, zeq zeqVar, SwipeLayout swipeLayout) {
        if (zeqVar != null) {
            zeqVar.a.add(swipeLayout);
        }
        swipeLayout.h();
        if (list.size() == 0) {
            return null;
        }
        ajok ajokVar2 = new ajok(ajokVar);
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        ajokVar2.g(hashMap);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            apmg apmgVar = (apmg) it.next();
            if (apmgVar != null) {
                mwa mwaVar = new mwa(apmgVar);
                ammv s = ahbw.s(ajosVar, mwaVar, null);
                if (s.h()) {
                    ajom ajomVar = (ajom) s.c();
                    ajomVar.oB(ajokVar2, mwaVar);
                    arrayList.add(ajomVar.a());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(ajomVar);
                }
            }
        }
        yjj.D(swipeLayout, arrayList);
        return arrayList2;
    }

    public static void i(zeq zeqVar, SwipeLayout swipeLayout, List list, ajos ajosVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View a = ((ajom) it.next()).a();
                if (a.getParent() != null) {
                    ((ViewGroup) a.getParent()).removeView(a);
                }
                ajosVar.b(a);
            }
            list.clear();
        }
        if (zeqVar != null) {
            zeqVar.a.remove(swipeLayout);
        }
        yjj.D(swipeLayout, Collections.emptyList());
    }

    public static CharSequence j(Activity activity, int i) {
        SpannableString spannableString = new SpannableString(activity.getText(i));
        for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
            if (annotation.getKey().equals("font") && annotation.getValue().equals("deeplink_emphasis")) {
                spannableString.setSpan(new TextAppearanceSpan(activity, R.style.deeplink_style), spannableString.getSpanStart(annotation), spannableString.getSpanEnd(annotation), 33);
            }
        }
        return spannableString;
    }

    public static void k(View view, FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout, ImageView imageView, boolean z) {
        int dimensionPixelSize = z ? 0 : view.getResources().getDimensionPixelSize(R.dimen.sparkles_text_watch_grid_form_padding_top);
        int dimensionPixelSize2 = z ? 0 : view.getResources().getDimensionPixelSize(R.dimen.sparkles_text_watch_grid_form_padding_horizontal);
        view.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, 0);
        fixedAspectRatioRelativeLayout.a = fixedAspectRatioRelativeLayout.getResources().getFraction(true != z ? R.fraction.rounded_aspect_ratio_16_9 : R.fraction.aspect_ratio_16_9_exact, 1, 1);
        imageView.setScaleType(z ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
    }

    public static boolean l(Context context) {
        AccessibilityManager a = zev.a(context);
        return a != null && a.isEnabled();
    }

    public static augt[] m(List list) {
        augt[] augtVarArr = new augt[list.size()];
        for (int i = 0; i < list.size(); i++) {
            augtVarArr[i] = (augt) list.get(i);
        }
        return augtVarArr;
    }

    public static augu[] n(List list) {
        augu[] auguVarArr = new augu[list.size()];
        for (int i = 0; i < list.size(); i++) {
            auguVarArr[i] = (augu) list.get(i);
        }
        return auguVarArr;
    }

    public static void p(TextView textView, RatingBar ratingBar, float f, int i, int i2) {
        if (textView == null || ratingBar == null) {
            return;
        }
        if (f <= 0.0f) {
            textView.setVisibility(8);
            ratingBar.setVisibility(8);
            return;
        }
        if (f > 5.0f) {
            f = 5.0f;
        }
        textView.setText(String.format(Locale.getDefault(), "%1.1f", Float.valueOf(f)));
        textView.setVisibility(0);
        String valueOf = String.valueOf(textView.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
        sb.append(valueOf);
        sb.append(" stars");
        textView.setContentDescription(sb.toString());
        textView.setTextColor(i);
        ratingBar.setRating(f);
        ratingBar.setVisibility(0);
        ((LayerDrawable) ratingBar.getProgressDrawable()).getDrawable(2).setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
    }

    public static void q(TextView textView, Spanned spanned) {
        if (textView != null) {
            whu.G(textView, spanned);
        }
    }

    public static yxa s(Activity activity, aok aokVar, axpg axpgVar) {
        if (activity instanceof WatchWhileActivity) {
            return new yxa(aokVar.getLifecycle(), axpgVar);
        }
        return new yxa(aokVar.getLifecycle(), nvm.c);
    }

    public static Optional t(Context context, aaea aaeaVar) {
        MediaRouteButton mediaRouteButton = (MediaRouteButton) LayoutInflater.from(context).inflate(R.layout.player_cast_media_route_button, (ViewGroup) null);
        try {
            atcb atcbVar = aaeaVar.a().l;
            if (atcbVar == null) {
                atcbVar = atcb.a;
            }
            mediaRouteButton.e(aii.a(context, true != atcbVar.g ? R.drawable.ic_outlined_media_route : R.drawable.ic_outlined_media_route_outline_checked));
        } catch (Resources.NotFoundException | NullPointerException unused) {
        }
        return Optional.of(mediaRouteButton);
    }

    public static aaha u(final Activity activity, final olx olxVar) {
        return new aaha() { // from class: olu
            @Override // defpackage.aaha
            public final void kE(apxf apxfVar, Map map) {
                olx olxVar2 = olx.this;
                Activity activity2 = activity;
                Intent a = olxVar2.a(apxfVar);
                if (a != null) {
                    activity2.startActivity(a);
                }
            }
        };
    }

    public static zim v(gng gngVar, int i, int i2) {
        gng gngVar2 = gng.LIGHT;
        int ordinal = gngVar.ordinal();
        if (ordinal == 0) {
            return zim.a(i2);
        }
        if (ordinal == 1) {
            return zim.a(i);
        }
        throw new AssertionError();
    }

    public static CharSequence w(aubs aubsVar) {
        aqyg aqygVar;
        int i = aubsVar.c;
        if ((i & 1024) != 0) {
            aqygVar = aubsVar.p;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else if ((i & 512) != 0) {
            aqygVar = aubsVar.o;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    public static final ogt x(yzr yzrVar) {
        return new ogt(yzrVar);
    }

    public static WatchNextResponseModel y(String str, boolean z) {
        aone createBuilder = auov.a.createBuilder();
        if (str != null) {
            aong aongVar = (aong) aulq.a.createBuilder();
            aonk aonkVar = SlimVideoMetadataSectionRendererOuterClass.slimVideoInformationRenderer;
            aone createBuilder2 = auwc.a.createBuilder();
            aqyg h = ajcq.h(str);
            createBuilder2.copyOnWrite();
            auwc auwcVar = (auwc) createBuilder2.instance;
            h.getClass();
            auwcVar.c = h;
            auwcVar.b |= 1;
            aongVar.e(aonkVar, (auwc) createBuilder2.build());
            aulq aulqVar = (aulq) aongVar.build();
            aong aongVar2 = (aong) auwd.a.createBuilder();
            aongVar2.cs(aulqVar);
            auwd auwdVar = (auwd) aongVar2.build();
            aone createBuilder3 = auoy.a.createBuilder();
            createBuilder3.copyOnWrite();
            auoy auoyVar = (auoy) createBuilder3.instance;
            auwdVar.getClass();
            auoyVar.bm = auwdVar;
            auoyVar.e |= 32768;
            createBuilder.aM((auoy) createBuilder3.build());
        }
        if (z) {
            createBuilder.aM(A(str == null));
        }
        return z((auov) createBuilder.build());
    }

    public static WatchNextResponseModel z(auov auovVar) {
        aone createBuilder = aseu.a.createBuilder();
        aone createBuilder2 = aset.a.createBuilder();
        createBuilder2.copyOnWrite();
        aset asetVar = (aset) createBuilder2.instance;
        auovVar.getClass();
        asetVar.c = auovVar;
        asetVar.b = 49399797;
        aset asetVar2 = (aset) createBuilder2.build();
        createBuilder.copyOnWrite();
        aseu aseuVar = (aseu) createBuilder.instance;
        asetVar2.getClass();
        aseuVar.c = asetVar2;
        aseuVar.b |= 1;
        aseu aseuVar2 = (aseu) createBuilder.build();
        aong aongVar = (aong) asfc.a.createBuilder();
        aone createBuilder3 = asfd.a.createBuilder();
        createBuilder3.copyOnWrite();
        asfd asfdVar = (asfd) createBuilder3.instance;
        aseuVar2.getClass();
        asfdVar.c = aseuVar2;
        asfdVar.b = 51779735;
        asfd asfdVar2 = (asfd) createBuilder3.build();
        aongVar.copyOnWrite();
        asfc asfcVar = (asfc) aongVar.instance;
        asfdVar2.getClass();
        asfcVar.d = asfdVar2;
        asfcVar.b |= 2;
        return new WatchNextResponseModel((asfc) aongVar.build());
    }

    public static void o(boolean z, final gol golVar, aahd aahdVar, ajok ajokVar, final mhg mhgVar, nck nckVar, apxf apxfVar) {
        if (!z || golVar == null || aahdVar == null || ajokVar == null || mhgVar == null) {
            nckVar.q(apxfVar);
        } else {
            if (mhgVar.b(golVar, aahdVar, ajokVar.a, ajokVar.e(), new ajog() { // from class: nbn
                @Override // defpackage.ajog
                public final void oh(Map map) {
                    mhg.this.a(golVar, map);
                }
            })) {
                return;
            }
            nckVar.q(apxfVar);
        }
    }

    public static void r(ImageView imageView, avgg avggVar, ajjz ajjzVar) {
        if (imageView == null || avggVar == null) {
            imageView.setVisibility(8);
        } else {
            ajjzVar.h(imageView, avggVar);
            imageView.setVisibility(0);
        }
    }
}
