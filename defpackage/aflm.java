package defpackage;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aflm {
    public static final /* synthetic */ int a = 0;
    private static final Map b = DesugarCollections.synchronizedMap(new HashMap());

    public static float a(Layout layout, EditText editText) {
        int lineBottom = layout.getLineBottom(layout.getLineForOffset(editText.getSelectionStart()));
        editText.getLocalVisibleRect(new Rect());
        editText.getGlobalVisibleRect(new Rect());
        return (lineBottom - r0.top) + editText.getPaddingTop() + r1.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:? -> B:88:0x018d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence b(defpackage.sxc r16, final android.content.Context r17, defpackage.awnd r18, defpackage.sww r19, final defpackage.szl r20, defpackage.syd r21) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aflm.b(sxc, android.content.Context, awnd, sww, szl, syd):java.lang.CharSequence");
    }

    public static void c(Editable editable) {
        for (ajtg ajtgVar : (ajtg[]) editable.getSpans(0, editable.length(), ajtg.class)) {
            int spanStart = editable.getSpanStart(ajtgVar);
            int spanEnd = editable.getSpanEnd(ajtgVar);
            if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
                String valueOf = String.valueOf(ajtgVar.a);
                editable.replace(spanStart, spanEnd, valueOf.length() != 0 ? "@".concat(valueOf) : new String("@"));
            }
        }
        for (Object obj : (ajtg[]) editable.getSpans(0, editable.length(), ajtg.class)) {
            editable.removeSpan(obj);
        }
    }

    static void d(SpannableString spannableString, Object obj, int i, int i2) {
        int min = i < 0 ? 0 : Math.min(i, spannableString.length());
        int length = i2 <= 0 ? spannableString.length() : Math.min(i2 + min, spannableString.length());
        if (min == length) {
            return;
        }
        spannableString.setSpan(obj, min, length, 18);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, float f, int i, awue awueVar) {
        if (spannableStringBuilder.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < awueVar.m.size(); i2++) {
                arrayList.add((awtx) awueVar.m.get(i2));
            }
            Collections.sort(arrayList, unt.l);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                awtx awtxVar = (awtx) arrayList.get(i3);
                int i4 = awtxVar.c;
                int i5 = awtxVar.d + i4;
                if (spannableStringBuilder.charAt(i5 - 1) != ' ') {
                    spannableStringBuilder.insert(i5, " ");
                    i5++;
                }
                if (i4 != -1 && i5 != -1 && i4 < i5 && i5 <= spannableStringBuilder.length()) {
                    spannableStringBuilder.setSpan(new ajtg(awtxVar.e, 2.0f, 0.0f, f, i, null), i4, i5, 33);
                }
            }
        }
    }
}
