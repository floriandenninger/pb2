package defpackage;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class lp {
    public static void a(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void b(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    public static int c(ws wsVar, vo voVar, View view, View view2, wd wdVar, boolean z) {
        if (wdVar.aq() == 0 || wsVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(wd.bm(view) - wd.bm(view2)) + 1;
        }
        return Math.min(voVar.k(), voVar.a(view2) - voVar.d(view));
    }

    public static int d(ws wsVar, vo voVar, View view, View view2, wd wdVar, boolean z, boolean z2) {
        int max;
        if (wdVar.aq() == 0 || wsVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(wd.bm(view), wd.bm(view2));
        int max2 = Math.max(wd.bm(view), wd.bm(view2));
        if (z2) {
            max = Math.max(0, (wsVar.a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        return !z ? max : Math.round((max * (Math.abs(voVar.a(view2) - voVar.d(view)) / (Math.abs(wd.bm(view) - wd.bm(view2)) + 1))) + (voVar.j() - voVar.d(view)));
    }

    public static int e(ws wsVar, vo voVar, View view, View view2, wd wdVar, boolean z) {
        if (wdVar.aq() == 0 || wsVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return wsVar.a();
        }
        return (int) (((voVar.a(view2) - voVar.d(view)) / (Math.abs(wd.bm(view) - wd.bm(view2)) + 1)) * wsVar.a());
    }

    public static Animator h(Context context, Resources resources, Resources.Theme theme, int i) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = resources.getAnimation(i);
                return l(context, resources, theme, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0);
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static Keyframe i(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static PropertyValuesHolder j(TypedArray typedArray, int i, int i2, int i3, String str) {
        bxl bxlVar;
        int i4;
        PropertyValuesHolder ofInt;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        int i7 = peekValue != null ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        int i8 = peekValue2 != null ? peekValue2.type : 0;
        int i9 = 3;
        if (i == 4) {
            i = ((peekValue == null || !k(i7)) && (peekValue2 == null || !k(i8))) ? 0 : 3;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            fp[] m = gl.m(string);
            fp[] m2 = gl.m(string2);
            if (m == null && m2 == null) {
                return null;
            }
            if (m == null) {
                return PropertyValuesHolder.ofObject(str, new bxk(), m2);
            }
            bxk bxkVar = new bxk();
            if (m2 != null) {
                if (!gl.l(m, m2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return PropertyValuesHolder.ofObject(str, bxkVar, m, m2);
            }
            return PropertyValuesHolder.ofObject(str, bxkVar, m);
        }
        if (i == 3) {
            bxlVar = bxl.a;
        } else {
            i9 = i;
            bxlVar = null;
        }
        if (i9 == 0) {
            if (peekValue != null) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (peekValue2 != null) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f);
            }
        } else {
            if (peekValue == null) {
                if (peekValue2 != null) {
                    if (i8 == 5) {
                        i4 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (k(i8)) {
                        i4 = typedArray.getColor(i3, 0);
                    } else {
                        i4 = typedArray.getInt(i3, 0);
                    }
                    ofInt = PropertyValuesHolder.ofInt(str, i4);
                }
                if (propertyValuesHolder == null && bxlVar != null) {
                    propertyValuesHolder.setEvaluator(bxlVar);
                    return propertyValuesHolder;
                }
            }
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (k(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (peekValue2 != null) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (k(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i5);
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    private static boolean k(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0307, code lost:
    
        if (r13 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0309, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0314, code lost:
    
        if (r14 >= r2) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0316, code lost:
    
        r1[r3] = (android.animation.Animator) r13.get(r14);
        r14 = r14 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0324, code lost:
    
        if (r33 != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0326, code lost:
    
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x032a, code lost:
    
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x032d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0304, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0305, code lost:
    
        if (r32 == null) goto L161;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator l(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.l(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    private static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        ValueAnimator valueAnimator3;
        TypedArray typedArray2;
        TypedArray t = gl.t(resources, theme, attributeSet, bxc.g);
        TypedArray t2 = gl.t(resources, theme, attributeSet, bxc.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long r = gl.r(t, xmlPullParser, "duration", 1, 300);
        int i = 0;
        long r2 = gl.r(t, xmlPullParser, "startOffset", 2, 0);
        int r3 = gl.r(t, xmlPullParser, "valueType", 7, 4);
        if (gl.y(xmlPullParser, "valueFrom") && gl.y(xmlPullParser, "valueTo")) {
            if (r3 == 4) {
                TypedValue peekValue = t.peekValue(5);
                int i2 = peekValue != null ? peekValue.type : 0;
                TypedValue peekValue2 = t.peekValue(6);
                r3 = ((peekValue == null || !k(i2)) && (peekValue2 == null || !k(peekValue2 != null ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder j = j(t, r3, 5, 6, "");
            if (j != null) {
                valueAnimator4.setValues(j);
            }
        }
        valueAnimator4.setDuration(r);
        valueAnimator4.setStartDelay(r2);
        valueAnimator4.setRepeatCount(gl.r(t, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(gl.r(t, xmlPullParser, "repeatMode", 4, 1));
        if (t2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String v = gl.v(t2, xmlPullParser, "pathData", 1);
            if (v != null) {
                String v2 = gl.v(t2, xmlPullParser, "propertyXName", 2);
                String v3 = gl.v(t2, xmlPullParser, "propertyYName", 3);
                if (v2 != null || v3 != null) {
                    Path k = gl.k(v);
                    PathMeasure pathMeasure = new PathMeasure(k, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f = 0.0f;
                    do {
                        f += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(f));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(k, false);
                    int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f2 = f / (min - 1);
                    valueAnimator2 = valueAnimator4;
                    typedArray2 = t;
                    int i3 = 0;
                    float f3 = 0.0f;
                    while (true) {
                        if (i >= min) {
                            break;
                        }
                        int i4 = min;
                        pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
                        fArr[i] = fArr3[0];
                        fArr2[i] = fArr3[1];
                        f3 += f2;
                        int i5 = i3 + 1;
                        if (i5 < arrayList.size() && f3 > ((Float) arrayList.get(i5)).floatValue()) {
                            pathMeasure2.nextContour();
                            i3 = i5;
                        }
                        i++;
                        min = i4;
                    }
                    PropertyValuesHolder ofFloat = v2 != null ? PropertyValuesHolder.ofFloat(v2, fArr) : null;
                    PropertyValuesHolder ofFloat2 = v3 != null ? PropertyValuesHolder.ofFloat(v3, fArr2) : null;
                    if (ofFloat == null) {
                        i = 0;
                        objectAnimator.setValues(ofFloat2);
                    } else {
                        i = 0;
                        if (ofFloat2 == null) {
                            objectAnimator.setValues(ofFloat);
                        } else {
                            objectAnimator.setValues(ofFloat, ofFloat2);
                        }
                    }
                } else {
                    throw new InflateException(t2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray2 = t;
                objectAnimator.setPropertyName(gl.v(t2, xmlPullParser, "propertyName", 0));
            }
            typedArray = typedArray2;
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = t;
        }
        int D = gl.D(typedArray, xmlPullParser, i);
        if (D > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, D));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray.recycle();
        if (t2 != null) {
            t2.recycle();
        }
        return valueAnimator3;
    }

    public boolean f() {
        return false;
    }

    public boolean g(int[] iArr) {
        return false;
    }
}
