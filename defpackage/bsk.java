package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bsk extends ce implements bst, bsr, bss, brm {
    public bsu a;
    public RecyclerView b;
    private boolean d;
    private boolean e;
    private final bsg c = new bsg(this);
    private int ae = R.layout.preference_list_fragment;
    private final Handler af = new bse(this);
    private final Runnable ag = new bsf(this);

    public void aF(PreferenceScreen preferenceScreen) {
        bsu bsuVar = this.a;
        PreferenceScreen preferenceScreen2 = bsuVar.b;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.B();
            }
            bsuVar.b = preferenceScreen;
            if (preferenceScreen != null) {
                this.d = true;
                if (!this.e || this.af.hasMessages(1)) {
                    return;
                }
                this.af.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // defpackage.bst
    public boolean aG(Preference preference) {
        if (preference.u == null) {
            return false;
        }
        if ((qR() instanceof bsi) && ((bsi) qR()).b(preference)) {
            return true;
        }
        if ((C() instanceof bsi) && ((bsi) C()).b(preference)) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        dd mO = mO();
        Bundle q = preference.q();
        cn h = mO.h();
        D().getClassLoader();
        ce c = h.c(preference.u);
        c.af(q);
        c.aE(this);
        dn k = mO.k();
        k.y(((View) this.O.getParent()).getId(), c);
        k.s(null);
        k.a();
        return true;
    }

    public abstract void aH();

    @Override // defpackage.bss
    public final void aI() {
        if (!((qR() instanceof bsj) && ((bsj) qR()).a()) && (C() instanceof bsj)) {
            ((bsj) C()).a();
        }
    }

    @Override // defpackage.ce
    public void aa(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen o;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (o = o()) != null) {
            o.v(bundle2);
        }
        if (this.d) {
            q();
        }
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public vw d(PreferenceScreen preferenceScreen) {
        return new bsp(preferenceScreen);
    }

    @Override // defpackage.ce
    public final void lZ() {
        this.af.removeCallbacks(this.ag);
        this.af.removeMessages(1);
        if (this.d) {
            this.b.ac(null);
            PreferenceScreen o = o();
            if (o != null) {
                o.B();
            }
        }
        this.b = null;
        super.lZ();
    }

    @Override // defpackage.ce
    public void mD() {
        super.mD();
        bsu bsuVar = this.a;
        bsuVar.c = null;
        bsuVar.d = null;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        PreferenceScreen o = o();
        if (o != null) {
            Bundle bundle2 = new Bundle();
            o.w(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.ce
    public void mR(Bundle bundle) {
        super.mR(bundle);
        TypedValue typedValue = new TypedValue();
        qR().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        qR().getTheme().applyStyle(i, false);
        bsu bsuVar = new bsu(qR());
        this.a = bsuVar;
        bsuVar.e = this;
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        aH();
    }

    @Override // defpackage.ce
    public void mS() {
        super.mS();
        bsu bsuVar = this.a;
        bsuVar.c = this;
        bsuVar.d = this;
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = qR().obtainStyledAttributes(null, bsy.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.ae = obtainStyledAttributes.getResourceId(0, this.ae);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(qR());
        View inflate = cloneInContext.inflate(this.ae, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView n = n(cloneInContext, viewGroup2, bundle);
        if (n != null) {
            this.b = n;
            n.aB(this.c);
            s(drawable);
            if (dimensionPixelSize != -1) {
                bsg bsgVar = this.c;
                bsgVar.b = dimensionPixelSize;
                bsgVar.d.b.N();
            }
            this.c.c = z;
            if (this.b.getParent() == null) {
                viewGroup2.addView(this.b);
            }
            this.af.post(this.ag);
            return inflate;
        }
        throw new RuntimeException("Could not create RecyclerView");
    }

    public RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (qR().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        qR();
        recyclerView2.af(new LinearLayoutManager());
        recyclerView2.ab(new bsw(recyclerView2));
        return recyclerView2;
    }

    public final PreferenceScreen o() {
        return this.a.b;
    }

    @Override // defpackage.brm
    public final Preference ol(CharSequence charSequence) {
        bsu bsuVar = this.a;
        if (bsuVar == null) {
            return null;
        }
        return bsuVar.d(charSequence);
    }

    public final void p(int i) {
        bsu bsuVar = this.a;
        if (bsuVar != null) {
            Context qR = qR();
            PreferenceScreen o = o();
            bsuVar.f(true);
            int i2 = bsq.a;
            Object[] objArr = new Object[2];
            String[] strArr = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
            XmlResourceParser xml = qR.getResources().getXml(i);
            try {
                Preference a = bsq.a(xml, o, qR, objArr, bsuVar, strArr);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) a;
                preferenceScreen.A(bsuVar);
                bsuVar.f(false);
                aF(preferenceScreen);
                return;
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        PreferenceScreen o = o();
        if (o != null) {
            this.b.ac(d(o));
            o.z();
        }
    }

    @Override // defpackage.bsr
    public void r(Preference preference) {
        bv brvVar;
        if ((qR() instanceof bsh) && ((bsh) qR()).a(preference)) {
            return;
        }
        if (!((C() instanceof bsh) && ((bsh) C()).a(preference)) && mO().f("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.s;
                brvVar = new brp();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                brvVar.af(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.s;
                brvVar = new brt();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                brvVar.af(bundle2);
            } else if (preference instanceof MultiSelectListPreference) {
                String str3 = preference.s;
                brvVar = new brv();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                brvVar.af(bundle3);
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            brvVar.aE(this);
            brvVar.qh(mO(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public final void s(Drawable drawable) {
        bsg bsgVar = this.c;
        if (drawable != null) {
            bsgVar.b = drawable.getIntrinsicHeight();
        } else {
            bsgVar.b = 0;
        }
        bsgVar.a = drawable;
        bsgVar.d.b.N();
    }
}
