package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alsk extends TemplateLayout {
    private static final ammr g = new ammr("PartnerCustomizationLayout", (byte[]) null);
    private boolean c;
    private boolean d;
    private boolean e;
    private Activity f;

    public alsk(Context context) {
        this(context, 0, 0);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    private void k(AttributeSet attributeSet, int i) {
        Window window;
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alsl.c, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        if (z) {
            setSystemUiVisibility(1024);
        }
        j(altj.class, new altj(this, this.f.getWindow(), attributeSet, i));
        j(altk.class, new altk(this, this.f.getWindow()));
        j(altg.class, new altg(this, attributeSet, i));
        altk altkVar = (altk) i(altk.class);
        if (Build.VERSION.SDK_INT >= 27) {
            TypedArray obtainStyledAttributes2 = altkVar.a.getContext().obtainStyledAttributes(attributeSet, alsl.e, i, 0);
            int color = obtainStyledAttributes2.getColor(1, 0);
            altkVar.e = color;
            if (altkVar.b != null) {
                if (altkVar.c && !altkVar.d) {
                    Context context = altkVar.a.getContext();
                    color = alte.f(context).c(context, altc.CONFIG_NAVIGATION_BAR_BG_COLOR);
                }
                altkVar.b.setNavigationBarColor(color);
            }
            boolean z2 = obtainStyledAttributes2.getBoolean(0, Build.VERSION.SDK_INT < 26 || (window = altkVar.b) == null || (window.getDecorView().getSystemUiVisibility() & 16) == 16);
            if (Build.VERSION.SDK_INT >= 26 && altkVar.b != null) {
                if (altkVar.c) {
                    Context context2 = altkVar.a.getContext();
                    z2 = alte.f(context2).j(context2, altc.CONFIG_LIGHT_NAVIGATION_BAR, false);
                }
                if (z2) {
                    altkVar.b.getDecorView().setSystemUiVisibility(altkVar.b.getDecorView().getSystemUiVisibility() | 16);
                } else {
                    altkVar.b.getDecorView().setSystemUiVisibility(altkVar.b.getDecorView().getSystemUiVisibility() & (-17));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                TypedArray obtainStyledAttributes3 = altkVar.a.getContext().obtainStyledAttributes(new int[]{R.attr.navigationBarDividerColor});
                int color2 = obtainStyledAttributes2.getColor(2, obtainStyledAttributes3.getColor(0, 0));
                if (Build.VERSION.SDK_INT >= 28 && altkVar.b != null) {
                    if (altkVar.c) {
                        Context context3 = altkVar.a.getContext();
                        if (alte.f(context3).l(altc.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR)) {
                            color2 = alte.f(context3).c(context3, altc.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR);
                        }
                    }
                    altkVar.b.setNavigationBarDividerColor(color2);
                }
                obtainStyledAttributes3.recycle();
            }
            obtainStyledAttributes2.recycle();
        }
        this.f.getWindow().addFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.f.getWindow().clearFlags(67108864);
        this.f.getWindow().clearFlags(134217728);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected View b(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = com.google.android.youtube.R.layout.partner_customization_layout;
        }
        return h(layoutInflater, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.setupcompat.internal.TemplateLayout
    public ViewGroup c(int i) {
        if (i == 0) {
            i = com.google.android.youtube.R.id.suc_layout_content;
        }
        return super.c(i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected final void d(AttributeSet attributeSet, int i) {
        boolean z = true;
        this.c = true;
        Activity a = a(getContext());
        this.f = a;
        boolean d = alta.d(a.getIntent());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alsl.c, i, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            ammr ammrVar = g;
            String valueOf = String.valueOf(this.f.getComponentName());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Attribute sucUsePartnerResource not found in ");
            sb.append(valueOf);
            ammrVar.h(sb.toString());
        }
        if (!d && !obtainStyledAttributes.getBoolean(2, true)) {
            z = false;
        }
        this.c = z;
        this.e = obtainStyledAttributes.hasValue(0);
        this.d = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        String.valueOf(this.f.getClass().getSimpleName()).length();
    }

    public final boolean e() {
        return this.e && alta.f() && alte.f(getContext()).k();
    }

    public final boolean f() {
        return this.c && Build.VERSION.SDK_INT >= 29 && alte.f(getContext()).k();
    }

    public final boolean g() {
        return e() && this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        alsq.a(this.f);
        altg altgVar = (altg) i(altg.class);
        altgVar.l.b(altgVar.e(), false);
        altgVar.l.c(altgVar.f(), false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        PersistableBundle persistableBundle;
        PersistableBundle persistableBundle2;
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 29 || !alta.d(this.f.getIntent())) {
            return;
        }
        altg altgVar = (altg) i(altg.class);
        altb altbVar = altgVar.l;
        boolean e = altgVar.e();
        boolean f = altgVar.f();
        altbVar.a = altb.a(altbVar.a, e);
        altbVar.b = altb.a(altbVar.b, f);
        alth althVar = altgVar.e;
        alth althVar2 = altgVar.f;
        if (althVar != null) {
            persistableBundle = althVar.a("PrimaryFooterButton");
        } else {
            persistableBundle = PersistableBundle.EMPTY;
        }
        if (althVar2 != null) {
            persistableBundle2 = althVar2.a("SecondaryFooterButton");
        } else {
            persistableBundle2 = PersistableBundle.EMPTY;
        }
        altb altbVar2 = altgVar.l;
        PersistableBundle persistableBundle3 = new PersistableBundle();
        persistableBundle3.putString("PrimaryButtonVisibility", altbVar2.a);
        persistableBundle3.putString("SecondaryButtonVisibility", altbVar2.b);
        alta.c(getContext(), CustomEvent.e(MetricKey.b("SetupCompatMetrics", this.f), alsr.b(persistableBundle3, persistableBundle, persistableBundle2)));
    }

    public alsk(Context context, int i) {
        this(context, i, 0);
    }

    public alsk(Context context, int i, int i2) {
        super(context, i, i2);
        k(null, com.google.android.youtube.R.attr.sucLayoutTheme);
    }

    public alsk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k(attributeSet, com.google.android.youtube.R.attr.sucLayoutTheme);
    }

    public alsk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k(attributeSet, i);
    }
}
