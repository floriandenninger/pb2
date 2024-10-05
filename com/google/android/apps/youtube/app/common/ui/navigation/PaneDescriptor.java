package com.google.android.apps.youtube.app.common.ui.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aahg;
import defpackage.ammy;
import defpackage.amru;
import defpackage.amvj;
import defpackage.apxf;
import defpackage.asg;
import defpackage.atmc;
import defpackage.fau;
import defpackage.gir;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PaneDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new asg(20);
    public final Class a;
    public final Bundle b;
    public ammy c;

    public PaneDescriptor(Parcel parcel) {
        try {
            this.a = Class.forName(parcel.readString());
            ClassLoader classLoader = getClass().getClassLoader();
            Bundle bundle = (Bundle) parcel.readParcelable(classLoader);
            this.b = bundle;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("Failed to read fragmentClass.");
        }
    }

    public static Bundle a() {
        return new Bundle();
    }

    public static PaneDescriptor b(gir girVar) {
        Bundle bundle = girVar.m;
        Class<?> cls = girVar.getClass();
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new PaneDescriptor(cls, bundle);
    }

    public static PaneDescriptor c(Class cls, apxf apxfVar, Bundle bundle) {
        apxfVar.getClass();
        PaneDescriptor paneDescriptor = new PaneDescriptor(cls, bundle);
        paneDescriptor.i(apxfVar);
        return paneDescriptor;
    }

    public static apxf f(Bundle bundle) {
        return aahg.c(bundle.getByteArray("navigation_endpoint"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r4 = r4.b;
        r5 = r5.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r4, com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r5, defpackage.aoae r6) {
        /*
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 == 0) goto L46
            if (r5 != 0) goto La
            goto L46
        La:
            java.lang.Class r2 = r4.a
            java.lang.Class r3 = r5.a
            if (r2 != r3) goto L46
            android.os.Bundle r2 = r4.b
            android.os.Bundle r2 = n(r2)
            android.os.Bundle r3 = r5.b
            android.os.Bundle r3 = n(r3)
            boolean r2 = defpackage.wbs.ae(r2, r3)
            if (r2 == 0) goto L46
            android.os.Bundle r4 = r4.b
            android.os.Bundle r5 = r5.b
            java.lang.String r2 = "navigation_endpoint"
            boolean r3 = r4.containsKey(r2)
            boolean r2 = r5.containsKey(r2)
            if (r3 == r2) goto L33
            goto L46
        L33:
            if (r3 != 0) goto L37
            if (r2 == 0) goto L45
        L37:
            apxf r4 = f(r4)
            apxf r5 = f(r5)
            boolean r4 = r6.g(r4, r5)
            if (r4 == 0) goto L46
        L45:
            return r0
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor.m(com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor, com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor, aoae):boolean");
    }

    private static Bundle n(Bundle bundle) {
        amru amruVar = fau.a;
        int i = ((amvj) amruVar).c;
        Bundle bundle2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) amruVar.get(i2);
            if (bundle.containsKey(str)) {
                if (bundle2 == null) {
                    bundle2 = new Bundle(bundle);
                }
                bundle2.remove(str);
            }
        }
        return bundle2 != null ? bundle2 : bundle;
    }

    public final gir d() {
        gir girVar;
        try {
            girVar = (gir) this.a.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            girVar = null;
        }
        if (girVar != null) {
            girVar.af(new Bundle(this.b));
        }
        return girVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final apxf e() {
        return f(this.b);
    }

    public final String g(String str) {
        return this.b.getString(str);
    }

    public final void h(ClassLoader classLoader) {
        this.b.setClassLoader(classLoader);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final void i(apxf apxfVar) {
        this.b.putByteArray("navigation_endpoint", apxfVar.toByteArray());
    }

    public final void j(atmc atmcVar) {
        this.b.putByteArray("navigation_endpoint_interaction_logging_extension", atmcVar.toByteArray());
    }

    public final boolean k() {
        return this.b.getBoolean("pivot", false);
    }

    public final void l(boolean z) {
        this.b.putBoolean("split_pane_library_opened_in_offline_mode", z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.getName());
        parcel.writeParcelable(this.b, i);
    }

    public PaneDescriptor(Class cls, Bundle bundle) {
        cls.getClass();
        this.a = cls;
        this.b = bundle;
    }
}
