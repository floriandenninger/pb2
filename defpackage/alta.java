package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.view.RichTextView;
import com.google.android.youtube.R;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alta {
    public static void A(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void B(String str, Object... objArr) {
        Log.e("YouTubeAndroidPlayerAPI", String.format(str, objArr));
    }

    public static void C(String str, Object... objArr) {
        Log.w("YouTubeAndroidPlayerAPI", String.format(str, objArr));
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "EMBEDDING_DISABLED";
            case 2:
                return "BLOCKED_FOR_APP";
            case 3:
                return "NOT_PLAYABLE";
            case 4:
                return "NETWORK_ERROR";
            case 5:
                return "UNAUTHORIZED_OVERLAY";
            case 6:
                return "PLAYER_VIEW_TOO_SMALL";
            case 7:
                return "PLAYER_VIEW_NOT_VISIBLE";
            case 8:
                return "EMPTY_PLAYLIST";
            case 9:
                return "AUTOPLAY_DISABLED";
            case 10:
                return "USER_DECLINED_RESTRICTED_CONTENT";
            case 11:
                return "USER_DECLINED_HIGH_BANDWIDTH";
            case 12:
                return "UNEXPECTED_SERVICE_DISCONNECTION";
            case 13:
                return "INTERNAL_ERROR";
            default:
                return "UNKNOWN";
        }
    }

    public static /* synthetic */ String E(int i) {
        switch (i) {
            case 2:
                return "INTERNAL_ERROR";
            case 3:
                return "UNKNOWN_ERROR";
            case 4:
                return "SERVICE_MISSING";
            case 5:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 6:
                return "SERVICE_DISABLED";
            case 7:
                return "SERVICE_INVALID";
            case 8:
                return "ERROR_CONNECTING_TO_SERVICE";
            case 9:
                return "CLIENT_LIBRARY_UPDATE_REQUIRED";
            case 10:
                return "NETWORK_ERROR";
            case 11:
                return "DEVELOPER_KEY_INVALID";
            default:
                return "INVALID_APPLICATION_SIGNATURE";
        }
    }

    public static void F(TextView textView, aluf alufVar) {
        textView.setGravity(alufVar.h);
    }

    public static void G(TextView textView, aluf alufVar) {
        int i;
        int i2;
        Typeface create;
        Typeface create2;
        boolean z;
        int c;
        TemplateLayout I;
        int c2;
        Context context = textView.getContext();
        if (alufVar.a != null && alte.f(context).l(alufVar.a) && (c2 = alte.f(context).c(context, alufVar.a)) != 0) {
            textView.setTextColor(c2);
        }
        if (alufVar.b != null && alte.f(context).l(alufVar.b)) {
            Context context2 = textView.getContext();
            try {
                I = I(alsk.a(context2));
            } catch (ClassCastException | IllegalArgumentException unused) {
            }
            if (I instanceof GlifLayout) {
                z = ((GlifLayout) I).e();
                if (!z && (c = alte.f(context).c(context, alufVar.b)) != 0) {
                    textView.setLinkTextColor(c);
                }
            }
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(new int[]{R.attr.sucFullDynamicColor});
            int[] iArr = alsl.a;
            boolean hasValue = obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            z = hasValue;
            if (!z) {
                textView.setLinkTextColor(c);
            }
        }
        if (alufVar.c != null && alte.f(context).l(alufVar.c)) {
            float b = alte.f(context).b(context, alufVar.c, 0.0f);
            if (b > 0.0f) {
                textView.setTextSize(0, b);
            }
        }
        if (alufVar.d != null && alte.f(context).l(alufVar.d) && (create2 = Typeface.create(alte.f(context).h(context, alufVar.d), 0)) != null) {
            textView.setTypeface(create2);
        }
        if ((textView instanceof RichTextView) && alufVar.e != null && alte.f(context).l(alufVar.e) && (create = Typeface.create(alte.f(context).h(context, alufVar.e), 0)) != null) {
            RichTextView.b = create;
        }
        if (alufVar.f != null || alufVar.g != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (alufVar.f == null || !alte.f(context).l(alufVar.f)) {
                    i = layoutParams2.topMargin;
                } else {
                    i = (int) alte.f(context).a(context, alufVar.f);
                }
                if (alufVar.g == null || !alte.f(context).l(alufVar.g)) {
                    i2 = layoutParams2.bottomMargin;
                } else {
                    i2 = (int) alte.f(context).a(context, alufVar.g);
                }
                layoutParams2.setMargins(layoutParams2.leftMargin, i, layoutParams2.rightMargin, i2);
                textView.setLayoutParams(layoutParams);
            }
        }
        textView.setGravity(alufVar.h);
    }

    public static int H(Context context) {
        char c;
        String h = alte.f(context).h(context, altc.CONFIG_LAYOUT_GRAVITY);
        if (h == null) {
            return 0;
        }
        String lowerCase = h.toLowerCase(Locale.ROOT);
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode == 109757538 && lowerCase.equals("start")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (lowerCase.equals("center")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            return c != 1 ? 0 : 8388611;
        }
        return 17;
    }

    public static TemplateLayout I(Activity activity) {
        View findViewById;
        if (activity == null || (findViewById = activity.findViewById(R.id.suc_layout_status)) == null) {
            return null;
        }
        return (TemplateLayout) findViewById.getParent();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean J(android.view.View r6) {
        /*
            boolean r0 = r6 instanceof com.google.android.setupdesign.GlifLayout
            if (r0 == 0) goto Lb
            com.google.android.setupdesign.GlifLayout r6 = (com.google.android.setupdesign.GlifLayout) r6
            boolean r6 = r6.k()
            return r6
        Lb:
            android.content.Context r6 = r6.getContext()
            r0 = 0
            android.app.Activity r1 = defpackage.alsk.a(r6)     // Catch: java.lang.Throwable -> L24
            com.google.android.setupcompat.internal.TemplateLayout r1 = I(r1)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r1 instanceof com.google.android.setupdesign.GlifLayout     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L25
            com.google.android.setupdesign.GlifLayout r1 = (com.google.android.setupdesign.GlifLayout) r1     // Catch: java.lang.Throwable -> L24
            boolean r0 = r1.k()     // Catch: java.lang.Throwable -> L24
            goto L95
        L24:
        L25:
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 2130970294(0x7f0406b6, float:1.7549294E38)
            r2[r0] = r3
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r2)
            boolean r3 = r2.getBoolean(r0, r0)
            r2.recycle()
            if (r3 != 0) goto L43
            boolean r2 = defpackage.alte.n(r6)
            if (r2 == 0) goto L41
            goto L43
        L41:
            r2 = 0
            goto L44
        L43:
            r2 = 1
        L44:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 >= r4) goto L4b
            goto L95
        L4b:
            alte r3 = defpackage.alte.f(r6)
            boolean r3 = r3.k()
            if (r3 != 0) goto L56
            goto L95
        L56:
            android.app.Activity r3 = defpackage.alsk.a(r6)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L70
            com.google.android.setupcompat.internal.TemplateLayout r4 = I(r3)     // Catch: java.lang.Throwable -> L6d
            boolean r5 = r4 instanceof defpackage.alsk     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L70
            alsk r4 = (defpackage.alsk) r4     // Catch: java.lang.Throwable -> L6d
            boolean r6 = r4.f()     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L95
            goto L93
        L6d:
            goto L70
        L6f:
            r3 = 0
        L70:
            if (r3 == 0) goto L7b
            android.content.Intent r3 = r3.getIntent()
            boolean r3 = d(r3)
            goto L7c
        L7b:
            r3 = 0
        L7c:
            int[] r4 = new int[r1]
            r5 = 2130970224(0x7f040670, float:1.7549152E38)
            r4[r0] = r5
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r4)
            boolean r4 = r6.getBoolean(r0, r1)
            r6.recycle()
            if (r3 != 0) goto L93
            if (r4 != 0) goto L93
            goto L95
        L93:
            if (r2 != 0) goto L96
        L95:
            return r0
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alta.J(android.view.View):boolean");
    }

    public static void K(View view) {
        int paddingStart;
        int paddingEnd;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        boolean l = alte.f(context).l(altc.CONFIG_LAYOUT_MARGIN_START);
        boolean l2 = alte.f(context).l(altc.CONFIG_LAYOUT_MARGIN_END);
        if (J(view)) {
            if (!l) {
                if (!l2) {
                    return;
                } else {
                    l2 = true;
                }
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudMarginStart, R.attr.sudMarginEnd});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            if (l) {
                paddingStart = Math.max(0, ((int) alte.f(context).a(context, altc.CONFIG_LAYOUT_MARGIN_START)) - dimensionPixelSize);
            } else {
                paddingStart = view.getPaddingStart();
            }
            if (l2) {
                paddingEnd = Math.max(0, ((int) alte.f(context).a(context, altc.CONFIG_LAYOUT_MARGIN_END)) - dimensionPixelSize2);
            } else {
                paddingEnd = view.getPaddingEnd();
            }
            if (paddingStart == view.getPaddingStart() && paddingEnd == view.getPaddingEnd()) {
                return;
            }
            int paddingTop = view.getPaddingTop();
            if (view.getId() == R.id.sud_layout_content) {
                paddingEnd = paddingStart;
            }
            view.setPadding(paddingStart, paddingTop, paddingEnd, view.getPaddingBottom());
        }
    }

    public static void L(ImageView imageView, int i) {
        if (imageView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    public static void M(Spannable spannable, Object obj, Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        for (Object obj2 : objArr) {
            spannable.setSpan(obj2, spanStart, spanEnd, 0);
        }
    }

    private static final alth N(XmlPullParser xmlPullParser, Context context) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            try {
                next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("FooterButton")) {
                        return new alth(context, asAttributeSet);
                    }
                    throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": not a FooterButton"));
                }
            } catch (IOException e) {
                String positionDescription = xmlPullParser.getPositionDescription();
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 2 + String.valueOf(message).length());
                sb.append(positionDescription);
                sb.append(": ");
                sb.append(message);
                throw new InflateException(sb.toString(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } while (next != 1);
        throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": No start tag found!"));
    }

    private static void O(final anhy anhyVar, final anhy anhyVar2) {
        anhyVar2.d(new Runnable() { // from class: ambn
            @Override // java.lang.Runnable
            public final void run() {
                anhy anhyVar3 = anhy.this;
                anhy anhyVar4 = anhyVar;
                if (anhyVar3.isCancelled()) {
                    anhyVar4.cancel(true);
                }
            }
        }, angq.a);
    }

    public static void a(String str, String str2, int i, int i2) {
        l(str, String.format("%s cannot be null.", str2));
        int length = str.length();
        j(length <= i2 && length >= i, String.format("Length of %s should be in the range [%s-%s]", str2, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static final alth b(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            return N(xml, context);
        } finally {
            xml.close();
        }
    }

    public static void c(Context context, CustomEvent customEvent) {
        l(context, "Context cannot be null.");
        alsu a = alsu.a(context);
        Bundle bundle = new Bundle();
        bundle.putParcelable("CustomEvent_bundle", CustomEvent.b(customEvent));
        a.e(1, bundle);
    }

    public static boolean d(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return intent.getBooleanExtra("firstRun", false) || intent.getBooleanExtra("preDeferredSetup", false) || intent.getBooleanExtra("deferredSetup", false);
        }
        return intent.getBooleanExtra("isSetupFlow", false);
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static int g(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static void h(Context context, Button button, altc altcVar) {
        int c = alte.f(context).c(context, altcVar);
        if (c != 0) {
            button.setTextColor(ColorStateList.valueOf(c));
        }
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "NOT_STARTED";
            case 2:
                return "BIND_FAILED";
            case 3:
                return "BINDING";
            case 4:
                return "CONNECTED";
            case 5:
                return "DISCONNECTED";
            case 6:
                return "SERVICE_NOT_USABLE";
            default:
                return "REBIND_REQUIRED";
        }
    }

    public static void j(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void k(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str.concat(" must be called from the UI thread."));
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final String m(Activity activity) {
        return activity.getComponentName().toString();
    }

    public static String n(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
            return "";
        }
        if (replaceFirst.startsWith("base-")) {
            return replaceFirst.replace("base-", "config.");
        }
        return replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }

    public static void o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static String p(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static Context q(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static alsc r(Exception exc) {
        alsc alscVar = new alsc(null);
        synchronized (alscVar.a) {
            alscVar.a();
            alscVar.c = true;
            alscVar.e = exc;
        }
        alscVar.b.b(alscVar);
        return alscVar;
    }

    public static alsc s(Object obj) {
        alsc alscVar = new alsc(null);
        synchronized (alscVar.a) {
            alscVar.a();
            alscVar.c = true;
            alscVar.d = obj;
        }
        alscVar.b.b(alscVar);
        return alscVar;
    }

    public static Object t(Context context, Class cls) {
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof axqk) {
            try {
                return cls.cast(((axqk) applicationContext).lM());
            } catch (ClassCastException e) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        }
        String valueOf = String.valueOf(applicationContext.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
        sb.append("Given application context does not implement GeneratedComponentManager: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public static anhy u(anhy anhyVar, Callable callable, Executor executor) {
        anhz a = anhz.a(callable);
        anhyVar.d(a, executor);
        O(anhyVar, a);
        return a;
    }

    public static anhy v(final anhy anhyVar, anfy anfyVar, final Executor executor) {
        anhy T = anaf.T(new ambp(anfyVar, anhyVar), new Executor() { // from class: ambo
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                anhy.this.d(runnable, executor);
            }
        });
        O(anhyVar, T);
        return T;
    }

    public static int w(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.anhy x(java.util.List r4, defpackage.ammy r5, java.util.concurrent.Executor r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r4.next()
            anfy r1 = (defpackage.anfy) r1
            anhy r1 = r1.a()     // Catch: java.lang.Exception -> L4d
            boolean r2 = r1.isDone()     // Catch: java.lang.Exception -> L4d
            if (r2 == 0) goto L49
            java.lang.Object r2 = defpackage.anaf.W(r1)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            boolean r3 = r1.isCancelled()     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r3 != 0) goto L33
            boolean r2 = r5.a(r2)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r2 == 0) goto Ld
        L33:
            boolean r4 = r0.isEmpty()     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r4 == 0) goto L3a
            return r1
        L3a:
            r0.add(r1)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            goto L5c
        L3e:
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L45
            return r1
        L45:
            r0.add(r1)     // Catch: java.lang.Exception -> L4d
            goto L5c
        L49:
            r0.add(r1)     // Catch: java.lang.Exception -> L4d
            goto Ld
        L4d:
            r4 = move-exception
            anhy r4 = defpackage.anaf.N(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L59
            return r4
        L59:
            r0.add(r4)
        L5c:
            alyj r4 = new alyj
            r4.<init>(r0, r5, r6)
            int r5 = r4.d
            r6 = -1
            if (r5 != r6) goto L68
            r5 = 1
            goto L69
        L68:
            r5 = 0
        L69:
            defpackage.amkq.N(r5)
            anhy r5 = r4.b()
            alyi r6 = new alyi
            r6.<init>()
            java.util.concurrent.Executor r4 = r4.c
            r5.d(r6, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alta.x(java.util.List, ammy, java.util.concurrent.Executor):anhy");
    }

    public static void y(alxs alxsVar) {
        if (alxsVar instanceof alxp) {
            ((alxp) alxsVar).a();
        }
    }

    public static void z(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
    }
}
