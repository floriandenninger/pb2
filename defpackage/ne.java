package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ne extends mn implements LayoutInflater.Factory2, qo {
    private static final aeg D = new aeg();
    private static final int[] E = {R.attr.windowBackground};
    private static final boolean F = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean G = true;
    int A;
    public Rect B;
    public Rect C;
    private mw H;
    private CharSequence I;

    /* renamed from: J, reason: collision with root package name */
    private nd f242J;
    private boolean K;
    private TextView L;
    private boolean M;
    private boolean N;
    private boolean O;
    private nc[] P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private boolean V;
    private boolean W;
    private mz X;
    private mz Y;
    private boolean aa;
    private AppCompatViewInflater ab;
    private nd ac;
    final Object c;
    final Context d;
    public Window e;
    final mm f;
    lu g;
    MenuInflater h;
    public tr i;
    pp j;
    ActionBarContextView k;
    public PopupWindow l;
    public Runnable m;
    ViewGroup p;
    public View q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    public nc w;
    boolean x;
    public int y;
    boolean z;
    ka n = null;
    public boolean o = true;
    private final Runnable Z = new mr(this, 1);

    public ne(Context context, Window window, mm mmVar, Object obj) {
        ml mlVar = null;
        this.U = -100;
        this.d = context;
        this.f = mmVar;
        this.c = obj;
        if (this.U == -100 && (obj instanceof Dialog)) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof ml)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        mlVar = (ml) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (mlVar != null) {
                this.U = mlVar.getDelegate().a();
            }
        }
        if (this.U == -100) {
            aeg aegVar = D;
            Integer num = (Integer) aegVar.get(this.c.getClass().getName());
            if (num != null) {
                this.U = num.intValue();
                aegVar.remove(this.c.getClass().getName());
            }
        }
        if (window != null) {
            aa(window);
        }
        so.f();
    }

    private final int X() {
        int i = this.U;
        if (i != -100) {
            return i;
        }
        return -100;
    }

    private final mz Y(Context context) {
        if (this.Y == null) {
            this.Y = new mx(this, context);
        }
        return this.Y;
    }

    private final mz Z(Context context) {
        if (this.X == null) {
            if (nr.a == null) {
                Context applicationContext = context.getApplicationContext();
                nr.a = new nr(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new na(this, nr.a);
        }
        return this.X;
    }

    private final void aa(Window window) {
        if (this.e != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof mw) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        mw mwVar = new mw(this, callback);
        this.H = mwVar;
        window.setCallback(mwVar);
        yk k = yk.k(this.d, null, E);
        Drawable i = k.i(0);
        if (i != null) {
            window.setBackgroundDrawable(i);
        }
        k.o();
        this.e = window;
    }

    private final void ab() {
        ViewGroup viewGroup;
        Context context;
        if (this.K) {
            return;
        }
        TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(nx.j);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            y(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            y(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            y(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            y(10);
        }
        this.u = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        ac();
        this.e.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.d);
        if (this.v) {
            viewGroup = this.t ? (ViewGroup) from.inflate(com.google.android.youtube.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.google.android.youtube.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.u) {
            viewGroup = (ViewGroup) from.inflate(com.google.android.youtube.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.s = false;
            this.r = false;
        } else if (this.r) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(com.google.android.youtube.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                context = new aaq(this.d, typedValue.resourceId);
            } else {
                context = this.d;
            }
            viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.google.android.youtube.R.layout.abc_screen_toolbar, (ViewGroup) null);
            tr trVar = (tr) viewGroup.findViewById(com.google.android.youtube.R.id.decor_content_parent);
            this.i = trVar;
            trVar.o(H());
            if (this.s) {
                this.i.i(109);
            }
            if (this.M) {
                this.i.i(2);
            }
            if (this.N) {
                this.i.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.r + ", windowActionBarOverlay: " + this.s + ", android:windowIsFloating: " + this.u + ", windowActionModeOverlay: " + this.t + ", windowNoTitle: " + this.v + " }");
        }
        jw.X(viewGroup, new mo(this));
        if (this.i == null) {
            this.L = (TextView) viewGroup.findViewById(com.google.android.youtube.R.id.title);
        }
        zb.a(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.youtube.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.e.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.e.setContentView(viewGroup);
        contentFrameLayout.i = new mp(this);
        this.p = viewGroup;
        CharSequence I = I();
        if (!TextUtils.isEmpty(I)) {
            tr trVar2 = this.i;
            if (trVar2 != null) {
                trVar2.p(I);
            } else {
                lu luVar = this.g;
                if (luVar != null) {
                    luVar.q(I);
                } else {
                    TextView textView = this.L;
                    if (textView != null) {
                        textView.setText(I);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.p.findViewById(R.id.content);
        View decorView = this.e.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (jw.al(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = this.d.obtainStyledAttributes(nx.j);
        if (contentFrameLayout2.b == null) {
            contentFrameLayout2.b = new TypedValue();
        }
        obtainStyledAttributes2.getValue(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.b);
        if (contentFrameLayout2.c == null) {
            contentFrameLayout2.c = new TypedValue();
        }
        obtainStyledAttributes2.getValue(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.c);
        if (obtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.d == null) {
                contentFrameLayout2.d = new TypedValue();
            }
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
        }
        if (obtainStyledAttributes2.hasValue(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            if (contentFrameLayout2.e == null) {
                contentFrameLayout2.e = new TypedValue();
            }
            obtainStyledAttributes2.getValue(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.e);
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.f == null) {
                contentFrameLayout2.f = new TypedValue();
            }
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.g == null) {
                contentFrameLayout2.g = new TypedValue();
            }
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.K = true;
        nc V = V(0);
        if (this.x || V.h != null) {
            return;
        }
        ae(108);
    }

    private final void ac() {
        if (this.e == null) {
            Object obj = this.c;
            if (obj instanceof Activity) {
                aa(((Activity) obj).getWindow());
            }
        }
        if (this.e == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void ad() {
        ab();
        if (this.r && this.g == null) {
            Object obj = this.c;
            if (obj instanceof Activity) {
                this.g = new nw((Activity) obj, this.s);
            } else if (obj instanceof Dialog) {
                this.g = new nw((Dialog) obj);
            }
            lu luVar = this.g;
            if (luVar != null) {
                luVar.i(this.aa);
            }
        }
    }

    private final void ae(int i) {
        this.A = (1 << i) | this.A;
        if (this.z) {
            return;
        }
        jw.H(this.e.getDecorView(), this.Z);
        this.z = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0157, code lost:
    
        if (r14.f != null) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void af(defpackage.nc r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.af(nc, android.view.KeyEvent):void");
    }

    private final void ag() {
        if (this.K) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private static final Configuration ah(Context context, int i, Configuration configuration) {
        int i2;
        if (i != 1) {
            i2 = i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ai(boolean r13) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.ai(boolean):void");
    }

    @Override // defpackage.mn
    public final void A() {
        ab();
    }

    @Override // defpackage.mn
    public final void B() {
    }

    @Override // defpackage.mn
    public final void C() {
        lu c;
        if (this.r && this.K && (c = c()) != null) {
            c.y();
        }
        so.d().e(this.d);
        ai(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0111 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int D(android.content.Context r22, int r23) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.D(android.content.Context, int):int");
    }

    final Context E() {
        lu c = c();
        Context b = c != null ? c.b() : null;
        return b == null ? this.d : b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final nc F(Menu menu) {
        nc[] ncVarArr = this.P;
        int length = ncVarArr != null ? ncVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            nc ncVar = ncVarArr[i];
            if (ncVar != null && ncVar.h == menu) {
                return ncVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.pp G(defpackage.po r8) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.G(po):pp");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Window.Callback H() {
        return this.e.getCallback();
    }

    final CharSequence I() {
        Object obj = this.c;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(int i, nc ncVar, Menu menu) {
        if (menu == null) {
            menu = ncVar.h;
        }
        if (!ncVar.m || this.x) {
            return;
        }
        this.H.b.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(qq qqVar) {
        if (this.O) {
            return;
        }
        this.O = true;
        this.i.g();
        Window.Callback H = H();
        if (H != null && !this.x) {
            H.onPanelClosed(108, qqVar);
        }
        this.O = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(nc ncVar, boolean z) {
        ViewGroup viewGroup;
        tr trVar;
        if (!z || ncVar.a != 0 || (trVar = this.i) == null || !trVar.t()) {
            WindowManager windowManager = (WindowManager) this.d.getSystemService("window");
            if (windowManager != null && ncVar.m && (viewGroup = ncVar.e) != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    J(ncVar.a, ncVar, null);
                }
            }
            ncVar.k = false;
            ncVar.l = false;
            ncVar.m = false;
            ncVar.f = null;
            ncVar.n = true;
            if (this.w == ncVar) {
                this.w = null;
                return;
            }
            return;
        }
        K(ncVar.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M(int i) {
        nc V = V(i);
        if (V.h != null) {
            Bundle bundle = new Bundle();
            V.h.o(bundle);
            if (bundle.size() > 0) {
                V.p = bundle;
            }
            V.h.s();
            V.h.clear();
        }
        V.o = true;
        V.n = true;
        if ((i == 108 || i == 0) && this.i != null) {
            nc V2 = V(0);
            V2.k = false;
            R(V2, null);
        }
    }

    public final void N() {
        ka kaVar = this.n;
        if (kaVar != null) {
            kaVar.a();
        }
    }

    @Override // defpackage.qo
    public final void O(qq qqVar) {
        tr trVar = this.i;
        if (trVar == null || !trVar.q() || (ViewConfiguration.get(this.d).hasPermanentMenuKey() && !this.i.s())) {
            nc V = V(0);
            V.n = true;
            L(V, false);
            af(V, null);
            return;
        }
        Window.Callback H = H();
        if (this.i.t()) {
            this.i.r();
            if (this.x) {
                return;
            }
            H.onPanelClosed(108, V(0).h);
            return;
        }
        if (H == null || this.x) {
            return;
        }
        if (this.z && (1 & this.A) != 0) {
            this.e.getDecorView().removeCallbacks(this.Z);
            this.Z.run();
        }
        nc V2 = V(0);
        qq qqVar2 = V2.h;
        if (qqVar2 == null || V2.o || !H.onPreparePanel(0, V2.g, qqVar2)) {
            return;
        }
        H.onMenuOpened(108, V2.h);
        this.i.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.P(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.qo
    public final boolean Q(qq qqVar, MenuItem menuItem) {
        nc F2;
        Window.Callback H = H();
        if (H == null || this.x || (F2 = F(qqVar.a())) == null) {
            return false;
        }
        return H.onMenuItemSelected(F2.a, menuItem);
    }

    public final boolean R(nc ncVar, KeyEvent keyEvent) {
        tr trVar;
        Resources.Theme theme;
        tr trVar2;
        tr trVar3;
        if (this.x) {
            return false;
        }
        if (ncVar.k) {
            return true;
        }
        nc ncVar2 = this.w;
        if (ncVar2 != null && ncVar2 != ncVar) {
            L(ncVar2, false);
        }
        Window.Callback H = H();
        if (H != null) {
            ncVar.g = H.onCreatePanelView(ncVar.a);
        }
        int i = ncVar.a;
        boolean z = i == 0 || i == 108;
        if (z && (trVar3 = this.i) != null) {
            trVar3.n();
        }
        if (ncVar.g == null && (!z || !(this.g instanceof no))) {
            qq qqVar = ncVar.h;
            if (qqVar == null || ncVar.o) {
                if (qqVar == null) {
                    Context context = this.d;
                    int i2 = ncVar.a;
                    if ((i2 == 0 || i2 == 108) && this.i != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.google.android.youtube.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.google.android.youtube.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.google.android.youtube.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            aaq aaqVar = new aaq(context, 0);
                            aaqVar.getTheme().setTo(theme);
                            context = aaqVar;
                        }
                    }
                    qq qqVar2 = new qq(context);
                    qqVar2.b = this;
                    ncVar.a(qqVar2);
                    if (ncVar.h == null) {
                        return false;
                    }
                }
                if (z && this.i != null) {
                    if (this.ac == null) {
                        this.ac = new nd(this, 1);
                    }
                    this.i.m(ncVar.h, this.ac);
                }
                ncVar.h.s();
                if (!H.onCreatePanelMenu(ncVar.a, ncVar.h)) {
                    ncVar.a(null);
                    if (z && (trVar = this.i) != null) {
                        trVar.m(null, this.ac);
                    }
                    return false;
                }
                ncVar.o = false;
            }
            ncVar.h.s();
            Bundle bundle = ncVar.p;
            if (bundle != null) {
                ncVar.h.n(bundle);
                ncVar.p = null;
            }
            if (!H.onPreparePanel(0, ncVar.g, ncVar.h)) {
                if (z && (trVar2 = this.i) != null) {
                    trVar2.m(null, this.ac);
                }
                ncVar.h.r();
                return false;
            }
            ncVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            ncVar.h.r();
        }
        ncVar.k = true;
        ncVar.l = false;
        this.w = ncVar;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean S() {
        ViewGroup viewGroup;
        return this.K && (viewGroup = this.p) != null && jw.al(viewGroup);
    }

    public final void T() {
        ai(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00bb, code lost:
    
        if (r9.equals("Spinner") != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View U(java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.U(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final nc V(int i) {
        nc[] ncVarArr = this.P;
        if (ncVarArr == null || ncVarArr.length <= i) {
            nc[] ncVarArr2 = new nc[i + 1];
            if (ncVarArr != null) {
                System.arraycopy(ncVarArr, 0, ncVarArr2, 0, ncVarArr.length);
            }
            this.P = ncVarArr2;
            ncVarArr = ncVarArr2;
        }
        nc ncVar = ncVarArr[i];
        if (ncVar != null) {
            return ncVar;
        }
        nc ncVar2 = new nc(i);
        ncVarArr[i] = ncVar2;
        return ncVar2;
    }

    public final boolean W(nc ncVar, int i, KeyEvent keyEvent) {
        qq qqVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((ncVar.k || R(ncVar, keyEvent)) && (qqVar = ncVar.h) != null) {
            return qqVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    @Override // defpackage.mn
    public final int a() {
        return this.U;
    }

    @Override // defpackage.mn
    public final Context b(Context context) {
        this.R = true;
        int D2 = D(context, X());
        Configuration configuration = null;
        if (G && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(ah(context, D2, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof aaq) {
            try {
                ((aaq) context).b(ah(context, D2, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!F) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration4 != null && configuration3.diff(configuration4) != 0) {
                if (configuration3.fontScale != configuration4.fontScale) {
                    configuration.fontScale = configuration4.fontScale;
                }
                if (configuration3.mcc != configuration4.mcc) {
                    configuration.mcc = configuration4.mcc;
                }
                if (configuration3.mnc != configuration4.mnc) {
                    configuration.mnc = configuration4.mnc;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                if (configuration3.touchscreen != configuration4.touchscreen) {
                    configuration.touchscreen = configuration4.touchscreen;
                }
                if (configuration3.keyboard != configuration4.keyboard) {
                    configuration.keyboard = configuration4.keyboard;
                }
                if (configuration3.keyboardHidden != configuration4.keyboardHidden) {
                    configuration.keyboardHidden = configuration4.keyboardHidden;
                }
                if (configuration3.navigation != configuration4.navigation) {
                    configuration.navigation = configuration4.navigation;
                }
                if (configuration3.navigationHidden != configuration4.navigationHidden) {
                    configuration.navigationHidden = configuration4.navigationHidden;
                }
                if (configuration3.orientation != configuration4.orientation) {
                    configuration.orientation = configuration4.orientation;
                }
                if ((configuration3.screenLayout & 15) != (configuration4.screenLayout & 15)) {
                    configuration.screenLayout |= configuration4.screenLayout & 15;
                }
                if ((configuration3.screenLayout & 192) != (configuration4.screenLayout & 192)) {
                    configuration.screenLayout |= configuration4.screenLayout & 192;
                }
                if ((configuration3.screenLayout & 48) != (configuration4.screenLayout & 48)) {
                    configuration.screenLayout |= configuration4.screenLayout & 48;
                }
                if ((configuration3.screenLayout & 768) != (configuration4.screenLayout & 768)) {
                    configuration.screenLayout |= configuration4.screenLayout & 768;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                }
                if ((configuration3.uiMode & 15) != (configuration4.uiMode & 15)) {
                    configuration.uiMode |= configuration4.uiMode & 15;
                }
                if ((configuration3.uiMode & 48) != (configuration4.uiMode & 48)) {
                    configuration.uiMode |= configuration4.uiMode & 48;
                }
                if (configuration3.screenWidthDp != configuration4.screenWidthDp) {
                    configuration.screenWidthDp = configuration4.screenWidthDp;
                }
                if (configuration3.screenHeightDp != configuration4.screenHeightDp) {
                    configuration.screenHeightDp = configuration4.screenHeightDp;
                }
                if (configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                    configuration.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                }
                if (configuration3.densityDpi != configuration4.densityDpi) {
                    configuration.densityDpi = configuration4.densityDpi;
                }
            }
        }
        Configuration ah = ah(context, D2, configuration);
        aaq aaqVar = new aaq(context, 2132083837);
        aaqVar.b(ah);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = aaqVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    fj.a(theme);
                } else if (Build.VERSION.SDK_INT >= 23) {
                    fi.a(theme);
                }
            }
        } catch (NullPointerException unused3) {
        }
        return aaqVar;
    }

    @Override // defpackage.mn
    public final lu c() {
        ad();
        return this.g;
    }

    @Override // defpackage.mn
    public final lv d() {
        return new mt();
    }

    @Override // defpackage.mn
    public final pp g(po poVar) {
        mm mmVar;
        if (poVar != null) {
            pp ppVar = this.j;
            if (ppVar != null) {
                ppVar.f();
            }
            mv mvVar = new mv(this, poVar);
            lu c = c();
            if (c != null) {
                pp c2 = c.c(mvVar);
                this.j = c2;
                if (c2 != null && (mmVar = this.f) != null) {
                    mmVar.onSupportActionModeStarted(c2);
                }
            }
            if (this.j == null) {
                this.j = G(mvVar);
            }
            return this.j;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // defpackage.mn
    public final MenuInflater h() {
        if (this.h == null) {
            ad();
            lu luVar = this.g;
            this.h = new pw(luVar != null ? luVar.b() : this.d);
        }
        return this.h;
    }

    @Override // defpackage.mn
    public final View i(int i) {
        ab();
        return this.e.findViewById(i);
    }

    @Override // defpackage.mn
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        ab();
        ((ViewGroup) this.p.findViewById(R.id.content)).addView(view, layoutParams);
        this.H.b.onContentChanged();
    }

    @Override // defpackage.mn
    public final void k() {
        LayoutInflater from = LayoutInflater.from(this.d);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            from.getFactory2();
        }
    }

    @Override // defpackage.mn
    public final void l() {
        lu c = c();
        if (c == null || !c.u()) {
            ae(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.mn.b
            monitor-enter(r0)
            defpackage.mn.q(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.z
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.e
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.Z
            r0.removeCallbacks(r1)
        L20:
            r0 = 0
            r3.T = r0
            r0 = 1
            r3.x = r0
            int r0 = r3.U
            r1 = -100
            if (r0 == r1) goto L50
            java.lang.Object r0 = r3.c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L50
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L50
            aeg r0 = defpackage.ne.D
            java.lang.Object r1 = r3.c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5f
        L50:
            aeg r0 = defpackage.ne.D
            java.lang.Object r1 = r3.c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5f:
            lu r0 = r3.g
            if (r0 == 0) goto L66
            r0.g()
        L66:
            mz r0 = r3.X
            if (r0 == 0) goto L6d
            r0.c()
        L6d:
            mz r0 = r3.Y
            if (r0 == 0) goto L74
            r0.c()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.m():void");
    }

    @Override // defpackage.mn
    public final void n() {
        lu c = c();
        if (c != null) {
            c.n(true);
        }
    }

    @Override // defpackage.mn
    public final void o() {
        this.T = true;
        T();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return U(str, context, attributeSet);
    }

    @Override // defpackage.mn
    public final void p() {
        this.T = false;
        lu c = c();
        if (c != null) {
            c.n(false);
        }
    }

    @Override // defpackage.mn
    public final void r(int i) {
        ab();
        ViewGroup viewGroup = (ViewGroup) this.p.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.d).inflate(i, viewGroup);
        this.H.b.onContentChanged();
    }

    @Override // defpackage.mn
    public final void s(View view) {
        ab();
        ViewGroup viewGroup = (ViewGroup) this.p.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.H.b.onContentChanged();
    }

    @Override // defpackage.mn
    public final void t(View view, ViewGroup.LayoutParams layoutParams) {
        ab();
        ViewGroup viewGroup = (ViewGroup) this.p.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.H.b.onContentChanged();
    }

    @Override // defpackage.mn
    public final void u(int i) {
        if (this.U != i) {
            this.U = i;
            if (this.R) {
                T();
            }
        }
    }

    @Override // defpackage.mn
    public final void v(Toolbar toolbar) {
        if (this.c instanceof Activity) {
            lu c = c();
            if (!(c instanceof nw)) {
                this.h = null;
                if (c != null) {
                    c.g();
                }
                if (toolbar != null) {
                    no noVar = new no(toolbar, I(), this.H);
                    this.g = noVar;
                    this.e.setCallback(noVar.c);
                } else {
                    this.g = null;
                    this.e.setCallback(this.H);
                }
                l();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // defpackage.mn
    public final void w(int i) {
        this.y = i;
    }

    @Override // defpackage.mn
    public final void x(CharSequence charSequence) {
        this.I = charSequence;
        tr trVar = this.i;
        if (trVar != null) {
            trVar.p(charSequence);
            return;
        }
        lu luVar = this.g;
        if (luVar != null) {
            luVar.q(charSequence);
            return;
        }
        TextView textView = this.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.mn
    public final void z() {
        String str;
        this.R = true;
        ai(false);
        ac();
        Object obj = this.c;
        if (obj instanceof Activity) {
            try {
                str = ej.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                lu luVar = this.g;
                if (luVar == null) {
                    this.aa = true;
                } else {
                    luVar.i(true);
                }
            }
            synchronized (mn.b) {
                mn.q(this);
                mn.a.add(new WeakReference(this));
            }
        }
        this.S = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return U(str, context, attributeSet);
    }

    @Override // defpackage.mn
    public final boolean y(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.v && i == 108) {
            return false;
        }
        if (this.r && i == 1) {
            this.r = false;
        }
        if (i == 1) {
            ag();
            this.v = true;
            return true;
        }
        if (i == 2) {
            ag();
            this.M = true;
            return true;
        }
        if (i == 5) {
            ag();
            this.N = true;
            return true;
        }
        if (i == 10) {
            ag();
            this.t = true;
            return true;
        }
        if (i == 108) {
            ag();
            this.r = true;
            return true;
        }
        if (i != 109) {
            return this.e.requestFeature(i);
        }
        ag();
        this.s = true;
        return true;
    }
}
