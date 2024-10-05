package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import com.facebook.yoga.YogaDirection;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dua {
    protected static final ColorStateList a;
    protected static final int b;
    protected static final Typeface c;
    protected static final int d;
    private static final Typeface e;
    private static final int[][] f;
    private static final int[] g;
    private static final Path h;
    private static final Rect i;
    private static final RectF j;

    static {
        Typeface typeface = Typeface.DEFAULT;
        e = typeface;
        int[][] iArr = {new int[]{0}};
        f = iArr;
        int[] iArr2 = {-16777216};
        g = iArr2;
        a = new ColorStateList(iArr, iArr2);
        b = typeface.getStyle();
        c = typeface;
        d = 1;
        h = new Path();
        i = new Rect();
        j = new RectF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i2, int i3, CharSequence charSequence, Layout layout, ClickableSpan[] clickableSpanArr) {
        if (!(charSequence instanceof Spanned)) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        Spanned spanned = (Spanned) charSequence;
        for (int i4 = 0; i4 < clickableSpanArr.length; i4++) {
            ClickableSpan clickableSpan = clickableSpanArr[i4];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            Path path = h;
            layout.getSelectionPath(spanStart, spanEnd, path);
            RectF rectF = j;
            path.computeBounds(rectF, true);
            if (rectF.contains(i2, i3)) {
                return i4;
            }
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(boolean z, ClickableSpan[] clickableSpanArr) {
        if (!z || clickableSpanArr == null) {
            return 0;
        }
        return clickableSpanArr.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ks ksVar, int i2, int i3, int i4, CharSequence charSequence, Layout layout, ClickableSpan[] clickableSpanArr) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ClickableSpan clickableSpan = clickableSpanArr[i2];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineVisibleEnd = lineForOffset == layout.getLineForOffset(spanEnd) ? spanEnd : layout.getLineVisibleEnd(lineForOffset);
            Path path = h;
            layout.getSelectionPath(spanStart, lineVisibleEnd, path);
            RectF rectF = j;
            path.computeBounds(rectF, true);
            Rect rect = i;
            rect.set(((int) rectF.left) + i3, ((int) rectF.top) + i4, i3 + ((int) rectF.right), i4 + ((int) rectF.bottom));
            if (rect.isEmpty()) {
                rect.set(0, 0, 1, 1);
                ksVar.n(rect);
                ksVar.v("");
                return;
            }
            ksVar.n(rect);
            ksVar.s(true);
            ksVar.y(true);
            ksVar.x(true);
            ksVar.E(true);
            ksVar.D(spanned.subSequence(spanStart, spanEnd));
            if (clickableSpan instanceof dur) {
                throw null;
            }
            ksVar.r("android.widget.Button");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dtr d() {
        return new dtr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(dhe dheVar, dtr dtrVar, ColorStateList colorStateList, boolean z, sqf sqfVar, CharSequence charSequence, Layout layout, Float f2, ClickableSpan[] clickableSpanArr, ImageSpan[] imageSpanArr) {
        float floatValue = f2 == null ? 0.0f : f2.floatValue();
        String str = dheVar.c;
        dtrVar.a = layout;
        dtrVar.c = floatValue;
        dtrVar.d = z;
        dtrVar.f = charSequence;
        if (dtrVar.m == null && clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (clickableSpanArr[i2] instanceof drp) {
                    dtrVar.m = new Handler();
                    break;
                }
                i2++;
            }
        }
        dtrVar.k = null;
        dtrVar.e = clickableSpanArr != null && clickableSpanArr.length > 0;
        dtrVar.i = 0;
        dtrVar.o = sqfVar;
        if (colorStateList == null) {
            colorStateList = a;
        }
        dtrVar.g = colorStateList;
        dtrVar.h = dtrVar.g.getDefaultColor();
        Layout layout2 = dtrVar.a;
        if (layout2 != null) {
            layout2.getPaint().setColor(dtrVar.g.getColorForState(dtrVar.getState(), dtrVar.h));
        }
        dtrVar.a();
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                Drawable drawable = imageSpan.getDrawable();
                drawable.setCallback(dtrVar);
                drawable.setVisible(true, false);
            }
        }
        dtrVar.j = imageSpanArr;
        dtrVar.n = str;
        sqf sqfVar2 = dtrVar.o;
        if (sqfVar2 != null) {
            Layout layout3 = dtrVar.a;
            CharSequence charSequence2 = dtrVar.f;
            if (charSequence2 instanceof Spanned) {
                sqfVar2.a = (sqe[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), sqe.class);
                for (sqe sqeVar : sqfVar2.a) {
                    sqeVar.c(layout3, charSequence2);
                }
            }
        }
        dtrVar.invalidateSelf();
        if (charSequence instanceof drq) {
            ((drq) charSequence).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, ks ksVar, CharSequence charSequence) {
        if (jw.c(view) == 0) {
            jw.V(view, 1);
        }
        CharSequence e2 = ksVar.e();
        if (e2 != null) {
            charSequence = e2;
        }
        ksVar.D(charSequence);
        ksVar.v(charSequence);
        ksVar.h(256);
        ksVar.h(512);
        ksVar.b.setMovementGranularities(11);
        ksVar.b.setMultiLine(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(defpackage.dhe r29, defpackage.dhi r30, java.lang.CharSequence r31, android.text.TextUtils.TruncateAt r32, boolean r33, int r34, float r35, float r36, float r37, int r38, android.content.res.ColorStateList r39, int r40, int r41, float r42, int r43, int r44, android.graphics.Typeface r45, int r46, int r47, java.lang.CharSequence r48, boolean r49, boolean r50, android.text.Layout r51, android.text.Layout r52, java.lang.Integer r53, java.lang.Integer r54, defpackage.baql r55, defpackage.baql r56, defpackage.baql r57, defpackage.baql r58, defpackage.baql r59) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dua.h(dhe, dhi, java.lang.CharSequence, android.text.TextUtils$TruncateAt, boolean, int, float, float, float, int, android.content.res.ColorStateList, int, int, float, int, int, android.graphics.Typeface, int, int, java.lang.CharSequence, boolean, boolean, android.text.Layout, android.text.Layout, java.lang.Integer, java.lang.Integer, baql, baql, baql, baql, baql):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(dhe dheVar, dhi dhiVar, int i2, int i3, dlo dloVar, CharSequence charSequence, TextUtils.TruncateAt truncateAt, boolean z, int i4, float f2, float f3, float f4, int i5, ColorStateList colorStateList, int i6, int i7, CharSequence charSequence2, float f5, int i8, Typeface typeface, int i9, int i10, baql baqlVar, baql baqlVar2, baql baqlVar3, baql baqlVar4, baql baqlVar5) {
        int j2;
        char c2;
        CharSequence charSequence3;
        int i11;
        int i12;
        if (TextUtils.isEmpty(charSequence)) {
            baqlVar.a = null;
            dloVar.a = 0;
            dloVar.b = 0;
            return;
        }
        boolean z2 = truncateAt == null && i4 != Integer.MAX_VALUE;
        Layout n = n(dheVar, i2, truncateAt, z, z2 ? i4 + 1 : i4, f2, f3, f4, i5, charSequence, colorStateList, i6, i7, f5, i8, typeface, m(i9), dhiVar.L(), dheVar.b.getResources().getDisplayMetrics().density, i10);
        if (z2 && i4 > 0 && n.getLineCount() > i4) {
            n = n(dheVar, i2, truncateAt, z, i4, f2, f3, f4, i5, charSequence.subSequence(0, n.getLineEnd(i4 - 1)), colorStateList, i6, i7, f5, i8, typeface, m(i9), dhiVar.L(), dheVar.b.getResources().getDisplayMetrics().density, i10);
        }
        Layout layout = n;
        baqlVar.a = layout;
        dloVar.a = did.v(i2, layout.getWidth());
        int O = did.O(layout);
        layout.getLineCount();
        baqlVar5.a = Float.valueOf(layout.getPaint().descent());
        if (!TextUtils.isEmpty(charSequence2) && (j2 = j(layout)) >= 0) {
            CharSequence charSequence4 = charSequence2;
            if (charSequence4 instanceof Spannable) {
                c2 = 0;
                int i13 = 0;
                for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequence4).getSpans(0, charSequence2.length(), AbsoluteSizeSpan.class)) {
                    i13 = Math.max(absoluteSizeSpan.getSize(), i13);
                }
                charSequence3 = charSequence;
                i11 = i13;
            } else {
                c2 = 0;
                charSequence3 = charSequence;
                i11 = 0;
            }
            if (charSequence3 instanceof Spannable) {
                int lineStart = layout.getLineStart(j2);
                i12 = 0;
                for (AbsoluteSizeSpan absoluteSizeSpan2 : (AbsoluteSizeSpan[]) ((Spannable) charSequence3).getSpans(lineStart, (layout.getLineEnd(j2) - lineStart) + 1, AbsoluteSizeSpan.class)) {
                    i12 = Math.max(absoluteSizeSpan2.getSize(), i12);
                }
            } else {
                i12 = 0;
            }
            if (i11 > i12) {
                if (j2 > 0) {
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    charSequenceArr[c2] = "1\n";
                    charSequenceArr[1] = charSequence4;
                    charSequence4 = TextUtils.concat(charSequenceArr);
                }
                Layout n2 = n(dheVar, View.MeasureSpec.makeMeasureSpec(layout.getWidth(), 1073741824), truncateAt, z, i4, f2, f3, f4, i5, charSequence4, colorStateList, i6, i7, f5, i8, typeface, m(i9), dhiVar.L(), dheVar.b.getResources().getDisplayMetrics().density, i10);
                baqlVar2.a = n2;
                O += k(layout, j2, n2);
            }
        }
        int v = did.v(i3, O);
        dloVar.b = v;
        int i14 = dloVar.a;
        if (i14 < 0 || v < 0) {
            dloVar.a = Math.max(i14, 0);
            dloVar.b = Math.max(dloVar.b, 0);
            dhz.a(2, "TextSpec:WrongTextSize", "Text layout measured to less than 0 pixels");
        }
        baqlVar3.a = Integer.valueOf(dloVar.a);
        baqlVar4.a = Integer.valueOf(dloVar.b);
    }

    private static int j(Layout layout) {
        for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
            if (layout.getEllipsisCount(i2) > 0) {
                return i2;
            }
        }
        return -1;
    }

    private static int k(Layout layout, int i2, Layout layout2) {
        if (layout2 == null) {
            return 0;
        }
        Rect rect = new Rect();
        layout.getLineBounds(i2, rect);
        Rect rect2 = new Rect();
        layout2.getLineBounds(layout2.getLineCount() - 1, rect2);
        return Math.max(0, rect2.height() - rect.height());
    }

    private static ajn l(ajn ajnVar, YogaDirection yogaDirection) {
        return ajnVar == null ? yogaDirection == YogaDirection.RTL ? ajt.d : ajt.c : ajnVar;
    }

    private static int m(int i2) {
        if (i2 != 0) {
            return i2;
        }
        return 1;
    }

    private static Layout n(dhe dheVar, int i2, TextUtils.TruncateAt truncateAt, boolean z, int i3, float f2, float f3, float f4, int i4, CharSequence charSequence, ColorStateList colorStateList, int i5, int i6, float f5, int i7, Typeface typeface, int i8, YogaDirection yogaDirection, float f6, int i9) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        dgn dgnVar = new dgn();
        dgnVar.g = false;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i10 = 2;
        } else if (mode == 0) {
            i10 = 0;
        } else {
            if (mode != 1073741824) {
                int mode2 = View.MeasureSpec.getMode(i2);
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected size mode: ");
                sb.append(mode2);
                throw new IllegalStateException(sb.toString());
            }
            i10 = 1;
        }
        if (dgnVar.e.a.density != f6) {
            dgnVar.e.a();
            dgnVar.e.a.density = f6;
            dgnVar.f = null;
        }
        dgm dgmVar = dgnVar.e;
        if (dgmVar.m != truncateAt) {
            dgmVar.m = truncateAt;
            dgnVar.f = null;
        }
        if (dgmVar.n != i3) {
            dgmVar.n = i3;
            dgnVar.f = null;
        }
        dgmVar.a();
        dgm dgmVar2 = dgnVar.e;
        dgmVar2.d = f2;
        dgmVar2.b = f3;
        dgmVar2.c = f4;
        dgmVar2.e = i4;
        dgmVar2.a.setShadowLayer(f2, f3, f4, i4);
        dgnVar.f = null;
        CharSequence charSequence2 = dgnVar.e.h;
        if (charSequence != charSequence2 && (charSequence == null || charSequence2 == null || !charSequence.equals(charSequence2))) {
            dgnVar.e.h = charSequence;
            dgnVar.f = null;
        }
        int size = View.MeasureSpec.getSize(i2);
        dgm dgmVar3 = dgnVar.e;
        if (dgmVar3.f != size || dgmVar3.g != i10) {
            dgmVar3.f = size;
            dgmVar3.g = i10;
            dgnVar.f = null;
        }
        if (dgmVar3.l != z) {
            dgmVar3.l = z;
            dgnVar.f = null;
        }
        if (dgmVar3.k != f5) {
            dgmVar3.k = f5;
            dgnVar.f = null;
        }
        if (dgmVar3.j != 1.0f) {
            dgmVar3.j = 1.0f;
            dgnVar.f = null;
        }
        if (dgmVar3.a.linkColor != i5) {
            dgnVar.e.a();
            dgnVar.e.a.linkColor = i5;
            dgnVar.f = null;
        }
        dgm dgmVar4 = dgnVar.e;
        if (dgmVar4.q != i9) {
            dgmVar4.q = i9;
            dgnVar.f = null;
        }
        if (i6 == -1) {
            dgnVar.d(dheVar.g.b(14.0f));
        } else {
            dgnVar.d(i6);
        }
        if (dgnVar.e.a.getLetterSpacing() != 0.0f) {
            dgnVar.e.a();
            dgnVar.e.a.setLetterSpacing(0.0f);
            dgnVar.f = null;
        }
        dgnVar.b = 2;
        dgnVar.c = Integer.MAX_VALUE;
        dgnVar.d = 2;
        dgnVar.e.a();
        dgm dgmVar5 = dgnVar.e;
        dgmVar5.i = colorStateList;
        TextPaint textPaint = dgmVar5.a;
        ColorStateList colorStateList2 = dgmVar5.i;
        textPaint.setColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : -16777216);
        dgnVar.f = null;
        if (e.equals(typeface)) {
            dgnVar.e(Typeface.defaultFromStyle(i7));
        } else {
            dgnVar.e(typeface);
        }
        ajn ajnVar = yogaDirection == YogaDirection.RTL ? ajt.d : ajt.c;
        dgnVar.c(ajnVar);
        int i11 = i8 - 1;
        switch (dtz.a[i11]) {
            case 3:
                if ((yogaDirection == YogaDirection.RTL) == ajnVar.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 2:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                if ((yogaDirection == YogaDirection.RTL) != ajnVar.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 5:
                if (!ajnVar.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 6:
                if (!ajnVar.a(charSequence, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 7:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        dgnVar.b(alignment);
        ajn l = l(ajnVar, yogaDirection);
        dgnVar.c(l);
        switch (dtz.a[i11]) {
            case 3:
                if ((yogaDirection == YogaDirection.RTL) == l.a(charSequence, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 2:
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                if ((yogaDirection == YogaDirection.RTL) != l.a(charSequence, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 5:
                if (!l.a(charSequence, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 6:
                if (!l.a(charSequence, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 7:
                alignment2 = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment2 = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        dgnVar.b(alignment2);
        return dgnVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(dtr dtrVar, CharSequence charSequence) {
        sqe[] sqeVarArr;
        dtrVar.a = null;
        dtrVar.c = 0.0f;
        dtrVar.f = null;
        dtrVar.e = false;
        dtrVar.i = 0;
        dtrVar.k = null;
        dtrVar.g = null;
        dtrVar.h = 0;
        sqf sqfVar = dtrVar.o;
        if (sqfVar != null && (sqeVarArr = sqfVar.a) != null) {
            for (sqe sqeVar : sqeVarArr) {
                sqeVar.d();
            }
            sqfVar.a = null;
        }
        dtrVar.o = null;
        ImageSpan[] imageSpanArr = dtrVar.j;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Drawable drawable = dtrVar.j[i2].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            dtrVar.j = null;
        }
        if (charSequence instanceof drq) {
            ((drq) charSequence).b();
        }
    }
}
