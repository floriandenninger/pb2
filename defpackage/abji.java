package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abji extends ajyo {
    private final ArrayList k;

    public abji(Context context, ajyw ajywVar, ajvb ajvbVar, ajsa ajsaVar, ajut ajutVar, ajsd ajsdVar, acrt acrtVar) {
        super(context, ajvbVar, ajsaVar, ajutVar, ajsdVar, new abjh(ajywVar, acrtVar));
        this.k = new ArrayList();
    }

    private final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aone createBuilder = asri.a.createBuilder();
        createBuilder.copyOnWrite();
        asri asriVar = (asri) createBuilder.instance;
        str.getClass();
        asriVar.b = 2;
        asriVar.c = str;
        this.k.add((asri) createBuilder.build());
    }

    private final void h(String str) {
        aone createBuilder = asri.a.createBuilder();
        createBuilder.copyOnWrite();
        asri asriVar = (asri) createBuilder.instance;
        str.getClass();
        asriVar.b = 1;
        asriVar.c = str;
        this.k.add((asri) createBuilder.build());
    }

    private final void i(Editable editable, int i, int i2) {
        Pattern f;
        char[] cArr = new char[Math.abs(i2 - i)];
        boolean z = false;
        editable.getChars(i, i2, cArr, 0);
        String trim = new String(cArr).trim();
        if (TextUtils.isEmpty(trim) || (f = this.c.f()) == null) {
            return;
        }
        Matcher matcher = f.matcher(trim);
        int length = trim.length();
        int i3 = 0;
        while (matcher.find()) {
            if (matcher.start() > i3) {
                aone createBuilder = asri.a.createBuilder();
                if (!z) {
                    String j = j(trim, i3, matcher.start());
                    createBuilder.copyOnWrite();
                    asri asriVar = (asri) createBuilder.instance;
                    j.getClass();
                    asriVar.b = 1;
                    asriVar.c = j;
                } else {
                    String j2 = j(trim, length, matcher.start());
                    createBuilder.copyOnWrite();
                    asri asriVar2 = (asri) createBuilder.instance;
                    j2.getClass();
                    asriVar2.b = 1;
                    asriVar2.c = j2;
                }
                this.k.add((asri) createBuilder.build());
                i3 = matcher.start();
            }
            g(this.c.d(matcher.group()));
            length = matcher.end();
            z = true;
        }
        if (!z) {
            h(trim);
        } else if (length < trim.length()) {
            h(j(trim, length, trim.length()));
        }
    }

    private static final String j(String str, int i, int i2) {
        return i < i2 ? str.substring(i, i2) : "";
    }

    public final asrh a(final Editable editable) {
        aone createBuilder = asrh.a.createBuilder();
        View view = this.i;
        if (view != null && jw.e(view) == 1) {
            createBuilder.copyOnWrite();
            asrh asrhVar = (asrh) createBuilder.instance;
            asrhVar.b |= 1;
            asrhVar.d = true;
        }
        this.k.clear();
        ImageSpan[] imageSpanArr = (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class);
        if (!this.c.h() || (imageSpanArr.length) <= 0) {
            i(editable, 0, editable.length());
        } else {
            Arrays.sort(imageSpanArr, new Comparator() { // from class: abjg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Editable editable2 = editable;
                    return editable2.getSpanStart((ImageSpan) obj) - editable2.getSpanStart((ImageSpan) obj2);
                }
            });
            int i = 0;
            for (ImageSpan imageSpan : imageSpanArr) {
                int spanStart = editable.getSpanStart(imageSpan);
                if (spanStart > i) {
                    i(editable, i, spanStart);
                }
                i = editable.getSpanEnd(imageSpan);
                if (i > spanStart) {
                    int i2 = i - spanStart;
                    char[] cArr = new char[i2];
                    editable.getChars(spanStart, i, cArr, 0);
                    if (i2 > 0) {
                        g(this.c.d(new String(cArr)));
                    }
                }
            }
            if (i != editable.length()) {
                i(editable, i, editable.length());
            }
        }
        ArrayList arrayList = this.k;
        createBuilder.copyOnWrite();
        asrh asrhVar2 = (asrh) createBuilder.instance;
        aony aonyVar = asrhVar2.c;
        if (!aonyVar.c()) {
            asrhVar2.c = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) arrayList, (List) asrhVar2.c);
        return (asrh) createBuilder.build();
    }
}
