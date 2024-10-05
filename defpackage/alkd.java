package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alkd {
    private static alqi a;
    public static ThreadPoolExecutor b;
    private static alor c;

    public static void A(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof alkg) {
            ((alkg) background).k(f);
        }
    }

    public static void B(View view) {
        Drawable background = view.getBackground();
        if (background instanceof alkg) {
            C(view, (alkg) background);
        }
    }

    public static void C(View view, alkg alkgVar) {
        algu alguVar = alkgVar.a.b;
        if (alguVar == null || !alguVar.a) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += jw.a((View) parent);
        }
        alkgVar.n(f);
    }

    public static alkb D(alkb alkbVar, float f) {
        return alkbVar instanceof alki ? alkbVar : new alka(f, alkbVar);
    }

    public static alkd E(int i) {
        return i != 0 ? i != 1 ? F() : new alkc() : new alkj();
    }

    public static alkd F() {
        return new alkj();
    }

    private static String G(String str, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    private static void H(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int d(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static ColorStateList e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a2 = nz.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : a2;
    }

    public static ColorStateList f(Context context, yk ykVar, int i) {
        int f;
        ColorStateList a2;
        return (!ykVar.q(i) || (f = ykVar.f(i, 0)) == 0 || (a2 = nz.a(context, f)) == null) ? ykVar.g(i) : a2;
    }

    public static Drawable g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b2 = nz.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : b2;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static int j(View view, int i) {
        return k(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static int k(Context context, int i, String str) {
        TypedValue l = l(context, i);
        if (l == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
        }
        return l.data;
    }

    public static TypedValue l(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean m(Context context, int i, boolean z) {
        TypedValue l = l(context, i);
        return (l == null || l.type != 18) ? z : l.data != 0;
    }

    public static float n(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static float o(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        StringBuilder sb = new StringBuilder(87);
        sb.append("Motion easing control point value must be between 0 and 1; instead got: ");
        sb.append(parseFloat);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String p(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static boolean q(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static float r(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static PorterDuff.Mode s(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static TextView t(Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static synchronized alqi u(Context context) {
        alqi alqiVar;
        synchronized (alkd.class) {
            if (a == null) {
                alqc alqcVar = new alqc();
                alqcVar.a = new alqr(alta.q(context));
                ayaw.j(alqcVar.a, alqr.class);
                a = new alqd(alqcVar.a);
            }
            alqiVar = a;
        }
        return alqiVar;
    }

    public static synchronized alor v(Context context) {
        alor alorVar;
        synchronized (alkd.class) {
            if (c == null) {
                aloq aloqVar = new aloq();
                aloqVar.a = new aloh(alta.q(context));
                ayaw.j(aloqVar.a, aloh.class);
                c = new alor(aloqVar.a);
            }
            alorVar = c;
        }
        return alorVar;
    }

    public static amsj w(XmlPullParser xmlPullParser, amsj amsjVar) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String G = G("name", xmlPullParser);
                                    if (G != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String G2 = G("key", xmlPullParser);
                                                                String G3 = G("split", xmlPullParser);
                                                                H(xmlPullParser);
                                                                if (G2 != null && G3 != null) {
                                                                    if (!amsjVar.a.containsKey(G2)) {
                                                                        amsjVar.a.put(G2, new HashMap());
                                                                    }
                                                                    ((Map) amsjVar.a.get(G2)).put(G, G3);
                                                                }
                                                            } else {
                                                                H(xmlPullParser);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    H(xmlPullParser);
                                                }
                                            }
                                        }
                                    } else {
                                        H(xmlPullParser);
                                    }
                                } else {
                                    H(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        H(xmlPullParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : amsjVar.a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new amsj(Collections.unmodifiableMap(hashMap));
    }

    public static RectF x(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.w || !(view instanceof almf)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        almf almfVar = (almf) view;
        View[] viewArr = {almfVar.a, almfVar.b, null};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view2 = viewArr[i3];
            if (view2 != null && view2.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i4 = i - i2;
        View[] viewArr2 = {almfVar.a, almfVar.b, null};
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            View view3 = viewArr2[i7];
            if (view3 != null && view3.getVisibility() == 0) {
                i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i8 = i5 - i6;
        int r = (int) r(almfVar.getContext(), 24);
        if (i4 < r) {
            i4 = r;
        }
        int left = (almfVar.getLeft() + almfVar.getRight()) / 2;
        int top = (almfVar.getTop() + almfVar.getBottom()) / 2;
        int i9 = i4 / 2;
        return new RectF(left - i9, top - (i8 / 2), i9 + left, top + (left / 2));
    }

    public static alkd z() {
        return new alkd();
    }

    public void a(Object obj, int i) {
    }

    public void b(Object obj) {
    }

    public void c(alkv alkvVar, float f, float f2) {
    }

    public void y(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF x = x(tabLayout, view);
        RectF x2 = x(tabLayout, view2);
        drawable.setBounds(aleq.c((int) x.left, (int) x2.left, f), drawable.getBounds().top, aleq.c((int) x.right, (int) x2.right, f), drawable.getBounds().bottom);
    }
}
