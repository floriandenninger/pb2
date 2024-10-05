package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class spi {
    public static final String a = "spi";
    public static final AtomicInteger b = new AtomicInteger();
    private static final BreakIterator c = BreakIterator.getCharacterInstance();

    private spi() {
    }

    public static swu a(View view, syb sybVar) {
        sws a2 = swu.a();
        a2.a = view;
        a2.h = sybVar;
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            String obj = editText.getText().toString();
            aone createBuilder = awnd.a.createBuilder();
            createBuilder.copyOnWrite();
            awnd awndVar = (awnd) createBuilder.instance;
            obj.getClass();
            awndVar.b |= 1;
            awndVar.c = obj;
            awnd awndVar2 = (awnd) createBuilder.build();
            aone createBuilder2 = awoq.a.createBuilder();
            createBuilder2.copyOnWrite();
            awoq awoqVar = (awoq) createBuilder2.instance;
            awndVar2.getClass();
            awoqVar.d = awndVar2;
            awoqVar.c |= 1;
            boolean isFocused = view.isFocused();
            createBuilder2.copyOnWrite();
            awoq awoqVar2 = (awoq) createBuilder2.instance;
            awoqVar2.c |= 8;
            awoqVar2.f = isFocused;
            int selectionEnd = editText.getSelectionEnd();
            createBuilder2.copyOnWrite();
            awoq awoqVar3 = (awoq) createBuilder2.instance;
            awoqVar3.c |= 2;
            awoqVar3.e = selectionEnd;
            BreakIterator breakIterator = c;
            breakIterator.setText(obj);
            breakIterator.first();
            int i = 0;
            while (c.next() != -1) {
                i++;
            }
            createBuilder2.copyOnWrite();
            awoq awoqVar4 = (awoq) createBuilder2.instance;
            awoqVar4.c |= 16;
            awoqVar4.g = i;
            awoq awoqVar5 = (awoq) createBuilder2.build();
            aong aongVar = (aong) awpu.a.createBuilder();
            aongVar.e(awoq.b, awoqVar5);
            a2.e = (awpu) aongVar.build();
        }
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(szx szxVar, TextView textView, sww swwVar, sxc sxcVar) {
        if (szxVar == null || textView == null) {
            return false;
        }
        swwVar.b(szxVar.a(), a(textView, sxcVar.u)).Q();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(axos axosVar, AtomicBoolean atomicBoolean, View view) {
        if (axosVar.aM() && (view instanceof EditText) && atomicBoolean.getAndSet(false)) {
            view.post(new hgc(view, 6));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dha e(defpackage.dhe r21, defpackage.axos r22, defpackage.szx r23, defpackage.szx r24, defpackage.szx r25, defpackage.szx r26, defpackage.szx r27, defpackage.szl r28, defpackage.syd r29, defpackage.sww r30, defpackage.sxc r31, java.util.Map r32, defpackage.sph r33) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spi.e(dhe, axos, szx, szx, szx, szx, szx, szl, syd, sww, sxc, java.util.Map, sph):dha");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(baql baqlVar, baql baqlVar2) {
        baqlVar.a = new sph();
        baqlVar2.a = new AtomicBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(szx szxVar, szx szxVar2, View view, boolean z, sww swwVar, sxc sxcVar) {
        if (z) {
            if (szxVar != null) {
                swwVar.b(szxVar.a(), a(view, sxcVar.u)).Q();
            }
        } else if (szxVar2 != null) {
            swwVar.b(szxVar2.a(), a(view, sxcVar.u)).Q();
        }
    }
}
