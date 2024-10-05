package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dty {
    protected static final ColorStateList a;
    protected static final ColorStateList b;
    static final CharSequence c;
    static final CharSequence d;
    protected static final Drawable e;
    protected static final Typeface f;
    protected static final MovementMethod g;
    private static final Drawable h;
    private static final Rect i;
    private static final InputFilter[] j;

    static {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        h = colorDrawable;
        a = ColorStateList.valueOf(-16777216);
        b = ColorStateList.valueOf(-3355444);
        c = "";
        d = "";
        e = colorDrawable;
        f = Typeface.DEFAULT;
        g = ArrowKeyMovementMethod.getInstance();
        i = new Rect();
        j = new InputFilter[0];
    }

    static Drawable a(dhe dheVar, Drawable drawable) {
        if (drawable != h) {
            return drawable;
        }
        TypedArray obtainStyledAttributes = dheVar.b.obtainStyledAttributes(null, new int[]{R.attr.background}, R.attr.editTextStyle, 0);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(dim dimVar, dim dimVar2, dim dimVar3, dim dimVar4, dim dimVar5, dim dimVar6, dim dimVar7, dim dimVar8, dim dimVar9, dim dimVar10, dim dimVar11, dim dimVar12, dim dimVar13, dim dimVar14, dim dimVar15, dim dimVar16, dim dimVar17, dim dimVar18, dim dimVar19, dim dimVar20, dim dimVar21, dim dimVar22, dim dimVar23, dim dimVar24, dim dimVar25, dim dimVar26, dim dimVar27) {
        if (k(dimVar27.a, dimVar27.b) && k(dimVar.a, dimVar.b) && k(dimVar2.a, dimVar2.b) && k(dimVar4.a, dimVar4.b) && k(dimVar5.a, dimVar5.b) && k(dimVar6.a, dimVar6.b) && k(dimVar7.a, dimVar7.b) && k(dimVar8.a, dimVar8.b) && k(dimVar9.a, dimVar9.b) && k(dimVar10.a, dimVar10.b) && k(dimVar11.a, dimVar11.b) && k(dimVar12.a, dimVar12.b) && k(dimVar13.a, dimVar13.b) && k(dimVar14.a, dimVar14.b) && k(dimVar15.a, dimVar15.b) && k(dimVar16.a, dimVar16.b) && k(dimVar17.a, dimVar17.b) && k(dimVar18.a, dimVar18.b)) {
            List list = (List) dimVar19.a;
            List list2 = (List) dimVar19.b;
            if (list != null || list2 != null) {
                if (list != null && list2 != null && list.size() == list2.size()) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        InputFilter inputFilter = (InputFilter) list.get(i2);
                        InputFilter inputFilter2 = (InputFilter) list2.get(i2);
                        if (!(inputFilter instanceof InputFilter.AllCaps) || !(inputFilter2 instanceof InputFilter.AllCaps)) {
                            if (!(inputFilter instanceof InputFilter.LengthFilter) || !(inputFilter2 instanceof InputFilter.LengthFilter)) {
                                if (!k(inputFilter, inputFilter2)) {
                                    break;
                                }
                            } else if (((InputFilter.LengthFilter) inputFilter).getMax() != ((InputFilter.LengthFilter) inputFilter2).getMax()) {
                                break;
                            }
                        }
                    }
                }
            }
            if (k(dimVar20.a, dimVar20.b) && k(dimVar21.a, dimVar21.b) && ((!((Boolean) dimVar21.b).booleanValue() || (k(dimVar22.a, dimVar22.b) && k(dimVar23.a, dimVar23.b))) && k(dimVar24.a, dimVar24.b) && k(dimVar25.a, dimVar25.b) && k(dimVar26.a, dimVar26.b))) {
                Drawable drawable = (Drawable) dimVar3.a;
                Drawable drawable2 = (Drawable) dimVar3.b;
                if (drawable == null && drawable2 != null) {
                    return true;
                }
                if (drawable != null && drawable2 == null) {
                    return true;
                }
                if (drawable != null && drawable2 != null) {
                    if (!(drawable instanceof ColorDrawable) || !(drawable2 instanceof ColorDrawable)) {
                        if (!k(drawable.getConstantState(), drawable2.getConstantState())) {
                            return true;
                        }
                    } else if (((ColorDrawable) drawable).getColor() != ((ColorDrawable) drawable2).getColor()) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(dhe dheVar, int i2, int i3, dlo dloVar, CharSequence charSequence, Drawable drawable, ColorStateList colorStateList, ColorStateList colorStateList2, int i4, int i5, Typeface typeface, int i6, int i7, int i8, int i9, int i10, List list, boolean z, int i11, int i12, AtomicReference atomicReference) {
        dtx dtxVar = new dtx(dheVar.b);
        CharSequence charSequence2 = (CharSequence) atomicReference.get();
        if (charSequence2 instanceof Spannable) {
            charSequence2 = charSequence2.toString();
        }
        l(dheVar, dtxVar, charSequence, a(dheVar, drawable == h ? dtxVar.getBackground() : drawable), colorStateList, colorStateList2, i4, i5, typeface, i6, i7, i8, i9, i10, list, z, i11, dtxVar.getMovementMethod(), charSequence2, i12);
        dtxVar.measure(esv.W(i2), esv.W(i3));
        dloVar.b = dtxVar.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i2) == 0) {
            dloVar.a = 0;
        } else {
            dloVar.a = Math.min(View.MeasureSpec.getSize(i2), dtxVar.getMeasuredWidth());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static dtw d(Context context) {
        return new dtw(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(dhe dheVar, dtw dtwVar, List list) {
        if (list != null && list.size() > 0) {
            dtwVar.e = list.size() == 1 ? (TextWatcher) list.get(0) : new dtv(list);
            TextWatcher textWatcher = dtwVar.e;
            if (textWatcher != null && (textWatcher instanceof dub)) {
                ((dub) textWatcher).a = dtwVar;
            }
            dtwVar.addTextChangedListener(textWatcher);
        }
        dtwVar.c = dheVar;
        int i2 = dtu.Q;
        dha dhaVar = dheVar.f;
        dtwVar.a = dhaVar == null ? null : ((dtu) dhaVar).I;
        if (dhaVar != null) {
        }
        if (dhaVar != null) {
        }
        if (dhaVar != null) {
        }
        dtwVar.b = dhaVar != null ? ((dtu) dhaVar).f189J : null;
        if (dhaVar == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(dtw dtwVar) {
        TextWatcher textWatcher = dtwVar.e;
        if (textWatcher != null) {
            dtwVar.removeTextChangedListener(textWatcher);
            TextWatcher textWatcher2 = dtwVar.e;
            if (textWatcher2 != null && (textWatcher2 instanceof dub)) {
                ((dub) textWatcher2).a = null;
            }
            dtwVar.e = null;
        }
        dtwVar.c = null;
        dtwVar.a = null;
        dtwVar.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(dtw dtwVar, AtomicReference atomicReference) {
        dtwVar.d = null;
        atomicReference.set(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(dhe dheVar, dtw dtwVar, CharSequence charSequence, Drawable drawable, ColorStateList colorStateList, ColorStateList colorStateList2, int i2, int i3, Typeface typeface, int i4, int i5, int i6, int i7, int i8, List list, boolean z, int i9, MovementMethod movementMethod, int i10, AtomicReference atomicReference, AtomicReference atomicReference2) {
        atomicReference2.set(dtwVar);
        l(dheVar, dtwVar, charSequence, a(dheVar, drawable), colorStateList, colorStateList2, i2, i3, typeface, i4, i5, i6, i7, i8, list, z, i9, movementMethod, (CharSequence) atomicReference.get(), i10);
        dtwVar.d = atomicReference;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(baql baqlVar) {
        baqlVar.a = Integer.valueOf(((Integer) baqlVar.a).intValue() + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(baql baqlVar, baql baqlVar2, baql baqlVar3, CharSequence charSequence) {
        baqlVar.a = new AtomicReference();
        baqlVar3.a = 0;
        baqlVar2.a = new AtomicReference(charSequence);
    }

    private static boolean k(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static void l(dhe dheVar, EditText editText, CharSequence charSequence, Drawable drawable, ColorStateList colorStateList, ColorStateList colorStateList2, int i2, int i3, Typeface typeface, int i4, int i5, int i6, int i7, int i8, List list, boolean z, int i9, MovementMethod movementMethod, CharSequence charSequence2, int i10) {
        int i11;
        if (i3 == -1) {
            editText.setTextSize(2, 14.0f);
        } else {
            editText.setTextSize(0, i3);
        }
        if (z) {
            i11 = i6 | 131073;
            editText.setMinLines(1);
            editText.setMaxLines(i9);
        } else {
            i11 = i6 & (-131073);
            editText.setLines(1);
        }
        if (i7 == 0) {
            if (i11 != editText.getInputType()) {
                editText.setInputType(i11);
            }
        } else {
            editText.setRawInputType(i7);
        }
        if (list != null) {
            editText.setFilters((InputFilter[]) list.toArray(new InputFilter[list.size()]));
        } else {
            editText.setFilters(j);
        }
        editText.setHint(charSequence);
        editText.setBackground(drawable);
        if (drawable == null || !drawable.getPadding(i)) {
            editText.setPadding(0, 0, 0, 0);
        }
        editText.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
        editText.setTypeface(typeface, 0);
        editText.setGravity(i5);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setClickable(true);
        editText.setLongClickable(true);
        editText.setCursorVisible(true);
        editText.setTextColor(colorStateList);
        editText.setHintTextColor(colorStateList2);
        editText.setHighlightColor(i2);
        editText.setMovementMethod(movementMethod);
        int imeOptions = editText.getImeOptions();
        editText.setImeOptions(i8);
        if (imeOptions != i8) {
            ((InputMethodManager) dheVar.b.getSystemService("input_method")).restartInput(editText);
        }
        editText.setError(null, null);
        editText.setEllipsize(null);
        editText.setTextAlignment(i4);
        if (charSequence2 != null && !k(editText.getText().toString(), charSequence2.toString())) {
            editText.setText(charSequence2);
            if (!(editText instanceof dtx)) {
                editText.setSelection(charSequence2.length());
            }
        }
        if (i10 != 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            if (Build.VERSION.SDK_INT >= 29) {
                Drawable textCursorDrawable = editText.getTextCursorDrawable();
                textCursorDrawable.setColorFilter(porterDuffColorFilter);
                editText.setTextCursorDrawable(textCursorDrawable);
            } else {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    int i12 = declaredField.getInt(editText);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(editText);
                    Drawable a2 = aii.a(editText.getContext(), i12);
                    a2.setColorFilter(porterDuffColorFilter);
                    Drawable[] drawableArr = {a2, a2};
                    Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, drawableArr);
                } catch (Exception unused) {
                }
            }
            jw.P(editText, ColorStateList.valueOf(i10));
        }
    }
}
