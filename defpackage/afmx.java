package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afmx {
    public static final amsx a = amsx.p(new HashSet(amru.r("#")));
    private static final BreakIterator b = BreakIterator.getCharacterInstance();

    private afmx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(EditText editText) {
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect = new Rect();
            editText.getPaint().getTextBounds(editText.getHint(), 0, editText.getHint().length(), rect);
            return (rect.width() / editText.getWidth()) + 1;
        }
        return editText.getLineCount();
    }

    public static swu b(afmr afmrVar) {
        Optional empty;
        sws a2 = swu.a();
        a2.a = afmrVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(afmrVar.getText());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(afmrVar.getText());
        aflm.c(spannableStringBuilder);
        aone createBuilder = awnd.a.createBuilder();
        String trim = spannableStringBuilder.toString().trim();
        createBuilder.copyOnWrite();
        awnd awndVar = (awnd) createBuilder.instance;
        trim.getClass();
        awndVar.b |= 1;
        awndVar.c = trim;
        awnd awndVar2 = (awnd) createBuilder.build();
        String obj = afmrVar.getText().toString();
        aone createBuilder2 = awud.a.createBuilder();
        createBuilder2.copyOnWrite();
        awud awudVar = (awud) createBuilder2.instance;
        awndVar2.getClass();
        awudVar.d = awndVar2;
        awudVar.c |= 1;
        boolean isFocused = afmrVar.isFocused();
        createBuilder2.copyOnWrite();
        awud awudVar2 = (awud) createBuilder2.instance;
        awudVar2.c |= 4;
        awudVar2.f = isFocused;
        createBuilder2.copyOnWrite();
        awud awudVar3 = (awud) createBuilder2.instance;
        awudVar3.c |= 128;
        awudVar3.k = false;
        int selectionStart = afmrVar.getSelectionStart();
        createBuilder2.copyOnWrite();
        awud awudVar4 = (awud) createBuilder2.instance;
        awudVar4.c |= 256;
        awudVar4.l = selectionStart;
        int selectionEnd = afmrVar.getSelectionEnd();
        createBuilder2.copyOnWrite();
        awud awudVar5 = (awud) createBuilder2.instance;
        awudVar5.c |= 512;
        awudVar5.m = selectionEnd;
        createBuilder2.copyOnWrite();
        awud awudVar6 = (awud) createBuilder2.instance;
        obj.getClass();
        awudVar6.c |= 64;
        awudVar6.j = obj;
        BreakIterator breakIterator = b;
        breakIterator.setText(obj);
        breakIterator.first();
        int i = 0;
        while (b.next() != -1) {
            i++;
        }
        createBuilder2.copyOnWrite();
        awud awudVar7 = (awud) createBuilder2.instance;
        awudVar7.c |= 1024;
        awudVar7.n = i;
        String trim2 = awndVar2.c.trim();
        createBuilder2.copyOnWrite();
        awud awudVar8 = (awud) createBuilder2.instance;
        trim2.getClass();
        awudVar8.c |= 2;
        awudVar8.e = trim2;
        Layout layout = afmrVar.getLayout();
        if (layout != null) {
            float a3 = aflm.a(layout, afmrVar);
            createBuilder2.copyOnWrite();
            awud awudVar9 = (awud) createBuilder2.instance;
            awudVar9.c |= 8;
            awudVar9.g = a3;
        }
        for (ajtg ajtgVar : (ajtg[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ajtg.class)) {
            int spanStart = spannableStringBuilder2.getSpanStart(ajtgVar);
            int spanEnd = spannableStringBuilder2.getSpanEnd(ajtgVar);
            aone createBuilder3 = awtx.a.createBuilder();
            createBuilder3.copyOnWrite();
            awtx awtxVar = (awtx) createBuilder3.instance;
            awtxVar.b |= 2;
            awtxVar.d = spanEnd - spanStart;
            createBuilder3.copyOnWrite();
            awtx awtxVar2 = (awtx) createBuilder3.instance;
            awtxVar2.b |= 1;
            awtxVar2.c = spanStart;
            String str = ajtgVar.a;
            createBuilder3.copyOnWrite();
            awtx awtxVar3 = (awtx) createBuilder3.instance;
            str.getClass();
            awtxVar3.b |= 4;
            awtxVar3.e = str;
            awtx awtxVar4 = (awtx) createBuilder3.build();
            createBuilder2.copyOnWrite();
            awud awudVar10 = (awud) createBuilder2.instance;
            awtxVar4.getClass();
            aony aonyVar = awudVar10.h;
            if (!aonyVar.c()) {
                awudVar10.h = aonm.mutableCopy(aonyVar);
            }
            awudVar10.h.add(awtxVar4);
        }
        if (afmrVar.f) {
            for (ImageSpan imageSpan : (ImageSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ImageSpan.class)) {
                int spanStart2 = spannableStringBuilder2.getSpanStart(imageSpan);
                int spanEnd2 = spannableStringBuilder2.getSpanEnd(imageSpan);
                String substring = spannableStringBuilder2.toString().substring(spanStart2, spanEnd2);
                Map map = afmrVar.g;
                if (map != null) {
                    empty = Optional.of((aqss) map.get(substring));
                } else {
                    empty = Optional.empty();
                }
                if (empty.isPresent()) {
                    aone createBuilder4 = awts.a.createBuilder();
                    createBuilder4.copyOnWrite();
                    awts awtsVar = (awts) createBuilder4.instance;
                    awtsVar.b |= 2;
                    awtsVar.d = spanEnd2 - spanStart2;
                    createBuilder4.copyOnWrite();
                    awts awtsVar2 = (awts) createBuilder4.instance;
                    awtsVar2.b |= 1;
                    awtsVar2.c = spanStart2;
                    aqss aqssVar = (aqss) empty.get();
                    createBuilder4.copyOnWrite();
                    awts awtsVar3 = (awts) createBuilder4.instance;
                    awtsVar3.e = aqssVar;
                    awtsVar3.b |= 4;
                    awts awtsVar4 = (awts) createBuilder4.build();
                    createBuilder2.copyOnWrite();
                    awud awudVar11 = (awud) createBuilder2.instance;
                    awtsVar4.getClass();
                    aony aonyVar2 = awudVar11.i;
                    if (!aonyVar2.c()) {
                        awudVar11.i = aonm.mutableCopy(aonyVar2);
                    }
                    awudVar11.i.add(awtsVar4);
                }
            }
        }
        aong aongVar = (aong) awpu.a.createBuilder();
        aongVar.e(awud.b, (awud) createBuilder2.build());
        a2.e = (awpu) aongVar.build();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afmr c(Context context) {
        afmr afmrVar = new afmr(context);
        afmrVar.setPadding(0, 0, 0, 0);
        return afmrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(dim dimVar, dim dimVar2, dim dimVar3) {
        return (((AtomicInteger) dimVar2.b).get() == ((AtomicInteger) dimVar2.a).get() && !(((AtomicBoolean) dimVar.a).get() ^ true) && dimVar3.a == dimVar3.b) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(int i, int i2, dlo dloVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
        int i3;
        dloVar.a = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        if (atomicInteger.get() == 0) {
            int i4 = atomicInteger2.get();
            i3 = i4 + i4;
        } else {
            i3 = (atomicInteger.get() + 1) * atomicInteger2.get();
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            dloVar.b = i3;
        } else {
            dloVar.b = Math.min(i3, size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(baql baqlVar) {
        baqlVar.a = new AtomicInteger(((AtomicInteger) baqlVar.a).get() + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(baql baqlVar, baql baqlVar2, int i, int i2) {
        baqlVar.a = new AtomicInteger(i);
        baqlVar2.a = new AtomicInteger(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(baql baqlVar, baql baqlVar2, baql baqlVar3, baql baqlVar4, baql baqlVar5, baql baqlVar6) {
        baqlVar2.a = new AtomicInteger(0);
        baqlVar3.a = new AtomicInteger(41);
        baqlVar4.a = new AtomicInteger(0);
        baqlVar.a = new AtomicBoolean(false);
        baqlVar5.a = new AtomicBoolean(false);
        baqlVar6.a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(dhe dheVar, awue awueVar, szl szlVar, syd sydVar, sww swwVar, sxc sxcVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, baql baqlVar, baql baqlVar2, baql baqlVar3, baql baqlVar4) {
        baqlVar.a = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        awnd awndVar = awueVar.d;
        if (awndVar == null) {
            awndVar = awnd.a;
        }
        awnd awndVar2 = awndVar;
        int i = 0;
        while (true) {
            if (i >= awndVar2.f.size()) {
                break;
            }
            awnh awnhVar = (awnh) awndVar2.f.get(i);
            if (awndVar2.f.size() <= i || awnhVar.e != 0) {
                i++;
            } else {
                float f = awnhVar.h;
                if (f != 0.0f) {
                    baqlVar4.a = Float.valueOf(f);
                }
            }
        }
        if ((awndVar2.b & 1) != 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(aflm.b(sxcVar, dheVar.b, awndVar2, swwVar, szlVar, sydVar));
            if ((awueVar.c & 256) != 0 && awueVar.l) {
                int length = spannableStringBuilder2.length();
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    } else if (spannableStringBuilder2.charAt(length) == '\n') {
                        spannableStringBuilder2.delete(length, length + 1);
                    }
                }
            }
            if (awueVar.m.size() > 0) {
                int orElse = wbs.W(dheVar.b, R.attr.ytBadgeChipBackground).orElse(0);
                float measuredWidth = sxcVar.b != null ? r4.getMeasuredWidth() * 0.85f : 0.0f;
                if (measuredWidth > 0.0f) {
                    aflm.e(spannableStringBuilder2, measuredWidth, orElse, awueVar);
                    baqlVar.a = true;
                } else {
                    afmh.a(dheVar);
                }
            } else {
                baqlVar.a = true;
            }
            spannableStringBuilder = spannableStringBuilder2;
        } else {
            baqlVar.a = true;
        }
        awnd awndVar3 = awueVar.e;
        if (awndVar3 == null) {
            awndVar3 = awnd.a;
        }
        awnd awndVar4 = awndVar3;
        if (awndVar4.c.length() > 0) {
            baqlVar3.a = SpannableString.valueOf(aflm.b(sxcVar, dheVar.b, awndVar4, swwVar, szlVar, sydVar));
        }
        baqlVar2.a = spannableStringBuilder;
        boolean z = atomicBoolean.get();
        boolean z2 = awueVar.t;
        boolean z3 = atomicBoolean2.get();
        boolean z4 = awueVar.i;
        if (!awueVar.r && z == z2 && z3 == z4) {
            return;
        }
        afmh.a(dheVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(final dhe dheVar, final afmr afmrVar, final SpannableStringBuilder spannableStringBuilder, final SpannableString spannableString, Float f, final awue awueVar, awnw awnwVar, final awnw awnwVar2, final awnw awnwVar3, final sww swwVar, ajyw ajywVar, afnp afnpVar, akpq akpqVar, aahv aahvVar, afsy afsyVar, final ajut ajutVar, final ajsd ajsdVar, ayqi ayqiVar, acra acraVar, boolean z, AtomicBoolean atomicBoolean, sxc sxcVar, syd sydVar, szl szlVar, AtomicBoolean atomicBoolean2, final AtomicBoolean atomicBoolean3) {
        Context context;
        Context context2;
        ArrayList arrayList;
        afmrVar.b = dheVar;
        final Context context3 = afmrVar.b.b;
        if (awueVar.r) {
            context = context3;
            afmrVar.post(new Runnable() { // from class: afmm
                @Override // java.lang.Runnable
                public final void run() {
                    afmr afmrVar2 = afmr.this;
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    awue awueVar2 = awueVar;
                    Context context4 = context3;
                    ajut ajutVar2 = ajutVar;
                    ajsd ajsdVar2 = ajsdVar;
                    AtomicBoolean atomicBoolean4 = atomicBoolean3;
                    amsx amsxVar = afmx.a;
                    afmrVar2.setText(spannableStringBuilder2);
                    if (awueVar2.u) {
                        afmrVar2.d(context4, ajutVar2, ajsdVar2, awueVar2);
                    }
                    if (awueVar2.i) {
                        afmrVar2.requestFocus();
                        atomicBoolean4.set(true);
                    } else {
                        afmrVar2.clearFocus();
                        atomicBoolean4.set(false);
                    }
                }
            });
        } else {
            context = context3;
        }
        Activity l = yjj.l(context);
        final InputMethodManager inputMethodManager = (InputMethodManager) l.getSystemService("input_method");
        if (atomicBoolean2.get() || !awueVar.t) {
            if (atomicBoolean2.get() && !awueVar.t) {
                afmrVar.setShowSoftInputOnFocus(true);
                inputMethodManager.showSoftInput(afmrVar, 1);
                atomicBoolean2.set(false);
            }
        } else {
            inputMethodManager.hideSoftInputFromWindow(afmrVar.getWindowToken(), 0);
            afmrVar.setShowSoftInputOnFocus(false);
            atomicBoolean2.set(true);
        }
        boolean z2 = afmrVar.j;
        if (z) {
            if (!atomicBoolean.get() || (arrayList = afmrVar.a) == null || arrayList.isEmpty()) {
                atomicBoolean.set(true);
                afmrVar.setMinLines(1);
                if ((awueVar.c & 128) == 0 || awueVar.k) {
                    afmrVar.setMaxLines(Integer.MAX_VALUE);
                    if ((awueVar.c & 256) != 0 && awueVar.l) {
                        afmrVar.setImeOptions(6);
                        afmrVar.setRawInputType(afmrVar.getInputType() & (-131073));
                    }
                } else {
                    afmrVar.setMaxLines(1);
                }
                afmrVar.setBackground(null);
                awnd awndVar = awueVar.d;
                if (awndVar == null) {
                    awndVar = awnd.a;
                }
                int i = 3;
                if (awueVar.s) {
                    i = 16;
                } else if ((awndVar.b & 4) != 0) {
                    avav avavVar = avav.SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN;
                    int D = awxr.D(awndVar.d);
                    if (D == 0) {
                        D = 1;
                    }
                    int i2 = D - 1;
                    if (i2 != 1) {
                        i = i2 != 2 ? i2 != 3 ? 8388611 : 1 : 5;
                    }
                } else {
                    i = 48;
                }
                afmrVar.setGravity(i);
                if (awndVar.f.size() == 1) {
                    awnh awnhVar = (awnh) awndVar.f.get(0);
                    if (l(awndVar, awnhVar)) {
                        if ((awnhVar.b & 32) != 0) {
                            afmrVar.setTextColor(ColorStateList.valueOf(awnhVar.i));
                        }
                        k(spannableStringBuilder);
                    }
                }
                awnd awndVar2 = awueVar.e;
                if (awndVar2 == null) {
                    awndVar2 = awnd.a;
                }
                if (awndVar2.f.size() == 1) {
                    awnh awnhVar2 = (awnh) awndVar2.f.get(0);
                    if (awndVar2.f.size() > 0 && l(awndVar2, awnhVar2)) {
                        if ((awnhVar2.b & 32) != 0) {
                            afmrVar.setHintTextColor(ColorStateList.valueOf(awnhVar2.i));
                        }
                        k(spannableString);
                    }
                }
                if (f != null) {
                    afmrVar.setTextSize(f.floatValue());
                }
                afmrVar.b();
                if (awueVar.u) {
                    context2 = context;
                    afmrVar.d(context2, ajutVar, ajsdVar, awueVar);
                    afmrVar.e(aahvVar.a(afsyVar.c()), ayqiVar, awnwVar, swwVar);
                } else {
                    context2 = context;
                    if (awueVar.w) {
                        afmrVar.e(aahvVar.a(afsyVar.c()), ayqiVar, awnwVar, swwVar);
                    }
                }
                final afmv afmvVar = new afmv(dheVar.b, afmrVar, szlVar, sydVar, sxcVar, acraVar, awnwVar, swwVar, awueVar.l, awueVar.q, ajywVar, afnpVar, akpqVar, awueVar.n, awueVar.o, (!awueVar.j && awueVar.n.isEmpty() && awueVar.o.isEmpty()) ? false : true, null);
                afmvVar.c = new ArrayList();
                for (int i3 = 0; i3 < awueVar.p.size(); i3++) {
                    afmvVar.c.add((awuc) awueVar.p.get(i3));
                }
                boolean z3 = awueVar.l;
                afmrVar.c = z3;
                if ((awueVar.c & 256) != 0) {
                    afmvVar.b = z3;
                }
                afmrVar.addTextChangedListener(afmvVar);
                afmrVar.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: afmk
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z4) {
                        InputMethodManager inputMethodManager2 = inputMethodManager;
                        afmr afmrVar2 = afmrVar;
                        AtomicBoolean atomicBoolean4 = atomicBoolean3;
                        awnw awnwVar4 = awnwVar2;
                        sww swwVar2 = swwVar;
                        afmv afmvVar2 = afmvVar;
                        awnw awnwVar5 = awnwVar3;
                        amsx amsxVar = afmx.a;
                        if (z4) {
                            inputMethodManager2.showSoftInput(afmrVar2, 1);
                            atomicBoolean4.set(true);
                            if (awnwVar4 != null) {
                                swwVar2.b(awnwVar4, afmx.b((afmr) view)).Q();
                                return;
                            }
                            return;
                        }
                        inputMethodManager2.hideSoftInputFromWindow(afmrVar2.getWindowToken(), 0);
                        atomicBoolean4.set(false);
                        afmvVar2.b();
                        if (awnwVar5 != null) {
                            swwVar2.b(awnwVar5, afmx.b((afmr) view)).Q();
                        }
                    }
                });
                if (awueVar.x) {
                    l.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: afmj
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            afmr afmrVar2 = afmr.this;
                            AtomicBoolean atomicBoolean4 = atomicBoolean3;
                            amsx amsxVar = afmx.a;
                            if (windowInsets.getSystemWindowInsetBottom() <= windowInsets.getStableInsetBottom() && afmrVar2.isFocused()) {
                                afmrVar2.clearFocus();
                                atomicBoolean4.set(false);
                            }
                            return view.onApplyWindowInsets(windowInsets);
                        }
                    });
                }
                final Context context4 = context2;
                afmrVar.post(new Runnable() { // from class: afml
                    @Override // java.lang.Runnable
                    public final void run() {
                        afmr afmrVar2 = afmr.this;
                        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                        awue awueVar2 = awueVar;
                        Context context5 = context4;
                        ajut ajutVar2 = ajutVar;
                        ajsd ajsdVar2 = ajsdVar;
                        SpannableString spannableString2 = spannableString;
                        AtomicBoolean atomicBoolean4 = atomicBoolean3;
                        dhe dheVar2 = dheVar;
                        amsx amsxVar = afmx.a;
                        afmrVar2.setText(spannableStringBuilder2);
                        if (awueVar2.u) {
                            afmrVar2.d(context5, ajutVar2, ajsdVar2, awueVar2);
                        }
                        afmrVar2.setHint(spannableString2);
                        if (awueVar2.i) {
                            afmrVar2.requestFocus();
                            atomicBoolean4.set(true);
                        }
                        afmrVar2.post(new afmn(afmrVar2, dheVar2, 0));
                    }
                });
            }
        }
    }

    private static void k(CharSequence charSequence) {
        if (charSequence instanceof SpannableString) {
            SpannableString spannableString = (SpannableString) charSequence;
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), ForegroundColorSpan.class)) {
                spannableString.removeSpan(foregroundColorSpan);
            }
        }
    }

    private static boolean l(awnd awndVar, awnh awnhVar) {
        return awnhVar.e == 0 && (awndVar.c.isEmpty() ? 0L : (long) awndVar.c.length()) <= ((long) awnhVar.f);
    }
}
