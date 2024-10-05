package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import defpackage.ajcq;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajcq {
    static final CharSequence a = " · ";
    private static final CharSequence[] b = new CharSequence[0];
    private static final Spanned c = new SpannedString("");

    static {
        amkq.x(advx.u);
    }

    public static Spanned a(ajco ajcoVar) {
        return s(ajcoVar.a, ajcoVar.b, 0, ajcoVar.c, null);
    }

    public static Spanned b(aqyg aqygVar) {
        return s(null, aqygVar, 0, null, null);
    }

    public static Spanned c(aqyg aqygVar, ajck ajckVar) {
        return s(null, aqygVar, 0, ajckVar, null);
    }

    public static Spanned d(aqyg aqygVar, ajco ajcoVar) {
        ajcn ajcnVar = new ajcn(ajcoVar);
        ajcnVar.b = aqygVar;
        return a(ajcnVar.a());
    }

    public static Spanned e(aqyg aqygVar, ajco ajcoVar, ajcm ajcmVar) {
        return s(ajcoVar == null ? null : ajcoVar.a, aqygVar, 0, ajcoVar != null ? ajcoVar.c : null, ajcmVar);
    }

    public static aqyg f(long j) {
        aong aongVar = (aong) aqyg.a.createBuilder();
        aong aongVar2 = (aong) aqyi.a.createBuilder();
        String format = NumberFormat.getInstance().format(j);
        aongVar2.copyOnWrite();
        aqyi aqyiVar = (aqyi) aongVar2.instance;
        format.getClass();
        aqyiVar.b |= 1;
        aqyiVar.c = format;
        aongVar.cw(aongVar2);
        return (aqyg) aongVar.build();
    }

    public static aqyg g(String... strArr) {
        aong aongVar = (aong) aqyg.a.createBuilder();
        for (String str : strArr) {
            aong aongVar2 = (aong) aqyi.a.createBuilder();
            aongVar2.copyOnWrite();
            aqyi aqyiVar = (aqyi) aongVar2.instance;
            aqyiVar.b |= 1;
            aqyiVar.c = t(str);
            aongVar.cw(aongVar2);
        }
        return (aqyg) aongVar.build();
    }

    public static aqyg h(String str) {
        aong aongVar = (aong) aqyg.a.createBuilder();
        aongVar.copyOnWrite();
        aqyg aqygVar = (aqyg) aongVar.instance;
        aqygVar.b |= 1;
        aqygVar.d = t(str);
        return (aqyg) aongVar.build();
    }

    public static CharSequence i(aqyg aqygVar) {
        if (aqygVar == null) {
            return null;
        }
        aqyh aqyhVar = aqygVar.f;
        if (aqyhVar == null) {
            aqyhVar = aqyh.a;
        }
        if ((aqyhVar.b & 1) == 0) {
            return null;
        }
        aqyh aqyhVar2 = aqygVar.f;
        if (aqyhVar2 == null) {
            aqyhVar2 = aqyh.a;
        }
        aots aotsVar = aqyhVar2.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }

    public static CharSequence j(CharSequence charSequence, List list) {
        return k(charSequence, (CharSequence[]) list.toArray(new CharSequence[list.size()]));
    }

    public static CharSequence k(CharSequence charSequence, CharSequence... charSequenceArr) {
        CharSequence charSequence2 = "";
        if (charSequenceArr != null && (charSequenceArr.length) > 0) {
            if (charSequence == null) {
                charSequence = a;
            }
            for (CharSequence charSequence3 : charSequenceArr) {
                if (!TextUtils.isEmpty(charSequence3)) {
                    charSequence2 = TextUtils.isEmpty(charSequence2) ? charSequence3 : TextUtils.concat(charSequence2, charSequence, charSequence3);
                }
            }
        }
        return charSequence2;
    }

    public static List l(List list) {
        if (list == null || list.isEmpty()) {
            return Arrays.asList(b);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((aqyg) it.next()));
        }
        return arrayList;
    }

    public static boolean m(aqyg aqygVar) {
        Iterator it = aqygVar.c.iterator();
        while (it.hasNext()) {
            if ((((aqyi) it.next()).b & 512) != 0) {
                return true;
            }
        }
        return false;
    }

    public static Spanned[] n(List list) {
        Spanned[] spannedArr = new Spanned[list.size()];
        for (int i = 0; i < list.size(); i++) {
            spannedArr[i] = b((aqyg) list.get(i));
        }
        return spannedArr;
    }

    public static Spanned[] o(aqyg[] aqygVarArr) {
        Spanned[] spannedArr = new Spanned[aqygVarArr.length];
        for (int i = 0; i < aqygVarArr.length; i++) {
            spannedArr[i] = b(aqygVarArr[i]);
        }
        return spannedArr;
    }

    public static CharSequence[] p(aqyg[] aqygVarArr) {
        int length;
        if (aqygVarArr == null || (length = aqygVarArr.length) == 0) {
            return b;
        }
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i = 0; i < aqygVarArr.length; i++) {
            charSequenceArr[i] = b(aqygVarArr[i]);
        }
        return charSequenceArr;
    }

    public static void q(Context context, Intent intent) {
        String str = intent.getPackage();
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return;
        }
        if (str == null) {
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (packageName.equals(it.next().activityInfo.packageName)) {
                    intent.putExtra("is_loopback", true);
                    intent.setPackage(packageName);
                    return;
                }
            }
            return;
        }
        if (packageName.equals(str)) {
            intent.putExtra("is_loopback", true);
        }
    }

    public static Spanned r(aqyg aqygVar) {
        return s(null, aqygVar, 1, null, null);
    }

    public static Spanned s(Context context, aqyg aqygVar, int i, ajck ajckVar, ajcm ajcmVar) {
        Typeface a2;
        int aO;
        if (aqygVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(aqygVar.d)) {
            if (aqygVar.c.size() != 0) {
                if (aqygVar.c.size() > 0 && aqygVar.c.size() != 0 && aqygVar.c.size() <= 1 && i == 0) {
                    aqyi aqyiVar = (aqyi) aqygVar.c.get(0);
                    if (!aqyiVar.d && !aqyiVar.e && !aqyiVar.g && !aqyiVar.f && !aqyiVar.h && aqyiVar.i == 0 && (aqyiVar.b & 512) == 0 && ((aO = aocz.aO(aqyiVar.k)) == 0 || aO == 1)) {
                        return new SpannedString(((aqyi) aqygVar.c.get(0)).c);
                    }
                }
                int i2 = ajcp.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = 0;
                int i4 = 0;
                for (aqyi aqyiVar2 : aqygVar.c) {
                    if (!aqyiVar2.c.isEmpty() && !TextUtils.isEmpty(aqyiVar2.c)) {
                        i3 += aqyiVar2.c.length();
                        spannableStringBuilder.append(aqyiVar2.c);
                        int i5 = (aqyiVar2.d ? 1 : 0) | (true != aqyiVar2.e ? 0 : 2);
                        if (i5 != 0) {
                            spannableStringBuilder.setSpan(new StyleSpan(i5), i4, i3, 33);
                        }
                        if (aqyiVar2.g) {
                            spannableStringBuilder.setSpan(new ajcp(), i4, i3, 33);
                        }
                        if (aqyiVar2.f) {
                            spannableStringBuilder.setSpan(new ajci(), i4, i3, 33);
                        }
                        if (aqyiVar2.h) {
                            spannableStringBuilder.setSpan(new ajcj(), i4, i3, 33);
                        }
                        int i6 = aqyiVar2.i;
                        if (i6 != 0) {
                            if (ajcmVar != null && (aqyiVar2.b & 128) != 0) {
                                i6 = ajcmVar.a(i6, aqyiVar2.j);
                            }
                            spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i6), null), i4, i3, 33);
                        }
                        if (context != null) {
                            int aO2 = aocz.aO(aqyiVar2.k);
                            if (aO2 == 0) {
                                aO2 = 1;
                            }
                            switch (aO2 - 1) {
                                case 1:
                                    a2 = ajct.YTSANS_MEDIUM.a(context);
                                    break;
                                case 2:
                                    a2 = ajct.ROBOTO_MEDIUM.a(context);
                                    break;
                                case 3:
                                    a2 = ajct.YOUTUBE_SANS_LIGHT.a(context);
                                    break;
                                case 4:
                                    a2 = ajct.YOUTUBE_SANS_REGULAR.a(context);
                                    break;
                                case 5:
                                    a2 = ajct.YOUTUBE_SANS_MEDIUM.a(context);
                                    break;
                                case 6:
                                    a2 = ajct.YOUTUBE_SANS_SEMIBOLD.a(context);
                                    break;
                                case 7:
                                    a2 = ajct.YOUTUBE_SANS_BOLD.a(context);
                                    break;
                                case 8:
                                    a2 = ajct.YOUTUBE_SANS_EXTRABOLD.a(context);
                                    break;
                                case 9:
                                    a2 = ajct.YOUTUBE_SANS_BLACK.a(context);
                                    break;
                                case 10:
                                default:
                                    a2 = null;
                                    break;
                                case 11:
                                    a2 = ajct.ROBOTO_REGULAR.a(context);
                                    break;
                            }
                            if (a2 != null) {
                                spannableStringBuilder.setSpan(new ajcl(a2), i4, i3, 33);
                            }
                        }
                        if (ajckVar != null && (aqyiVar2.b & 512) != 0) {
                            apxf apxfVar = aqyiVar2.m;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            spannableStringBuilder.setSpan(ajckVar.a(apxfVar), i4, i3, 33);
                        }
                        i4 = i3;
                    }
                }
                if (i != 0) {
                    Linkify.addLinks(spannableStringBuilder, 1);
                    for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                        spannableStringBuilder.removeSpan(uRLSpan);
                        final String url = uRLSpan.getURL();
                        spannableStringBuilder.setSpan(new URLSpan(url) { // from class: com.google.android.libraries.youtube.proto.formatted.FormattedStringUtil$SanitizedURLSpan
                            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                Context context2 = view.getContext();
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(getURL()));
                                ajcq.q(context2, intent);
                                context2.startActivity(intent);
                            }
                        }, spanStart, spanEnd, 33);
                    }
                }
                return spannableStringBuilder;
            }
            return c;
        }
        return new SpannedString(aqygVar.d);
    }

    private static String t(String str) {
        return str == null ? "" : str;
    }
}
