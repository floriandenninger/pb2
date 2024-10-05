package defpackage;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alv {
    public final ame a;
    public final boolean b;
    public final int[] c;
    private final aln d;

    public alv(ame ameVar, aln alnVar, boolean z, int[] iArr) {
        this.a = ameVar;
        this.d = alnVar;
        this.b = z;
        this.c = iArr;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        alw[] alwVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!e(selectionStart, selectionEnd) && (alwVarArr = (alw[]) editable.getSpans(selectionStart, selectionEnd, alw.class)) != null && (alwVarArr.length) > 0) {
                for (alw alwVar : alwVarArr) {
                    int spanStart = editable.getSpanStart(alwVar);
                    int spanEnd = editable.getSpanEnd(alwVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0042, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x007d, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
    
        if (r11 != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alv.b(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static final void d(Spannable spannable, als alsVar, int i, int i2) {
        spannable.setSpan(new alw(alsVar), i, i2, 33);
    }

    private static boolean e(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public final boolean c(CharSequence charSequence, int i, int i2, als alsVar) {
        boolean a;
        if (alsVar.c == 0) {
            aln alnVar = this.d;
            bvj e = alsVar.e();
            int a2 = e.a(8);
            short s = a2 != 0 ? e.b.getShort(a2 + e.a) : (short) 0;
            if (Build.VERSION.SDK_INT >= 23 || s <= Build.VERSION.SDK_INT) {
                if (alt.a.get() == null) {
                    alt.a.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) alt.a.get();
                sb.setLength(0);
                while (i < i2) {
                    sb.append(charSequence.charAt(i));
                    i++;
                }
                a = fo.a(((alt) alnVar).b, sb.toString());
            } else {
                a = false;
            }
            alsVar.c = true != a ? 1 : 2;
        }
        return alsVar.c == 2;
    }
}
