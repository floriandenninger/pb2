package com.google.android.apps.youtube.app.fragments.panels;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import defpackage.gjj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PanelsBackStack implements Parcelable {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class PanelsBackStackEntry implements Parcelable {
        public static final Parcelable.Creator CREATOR = new gjj(17);
        public final PanelDescriptor a;
        public final Fragment$SavedState b;
        public final Object c;
        public final String d;

        public PanelsBackStackEntry(Parcel parcel) {
            this.a = (PanelDescriptor) parcel.readParcelable(PaneDescriptor.class.getClassLoader());
            this.b = (Fragment$SavedState) parcel.readParcelable(Fragment$SavedState.class.getClassLoader());
            this.c = null;
            this.d = parcel.readString();
        }

        public PanelsBackStackEntry(PanelDescriptor panelDescriptor, Fragment$SavedState fragment$SavedState, Object obj, String str) {
            this.a = panelDescriptor;
            this.b = fragment$SavedState;
            this.c = obj;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.d);
        }
    }

    public static PanelsBackStack e(ArrayList arrayList) {
        return new AutoValue_PanelsBackStack(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ArrayList a();

    public final int b() {
        return a().size();
    }

    public final PanelsBackStackEntry c() {
        if (b() == 0) {
            return null;
        }
        return (PanelsBackStackEntry) a().get(0);
    }

    public final PanelsBackStackEntry d() {
        if (b() == 0) {
            return null;
        }
        return (PanelsBackStackEntry) a().remove(b() - 1);
    }

    public final void f(PanelDescriptor panelDescriptor, Fragment$SavedState fragment$SavedState, Object obj, String str) {
        a().add(new PanelsBackStackEntry(panelDescriptor, fragment$SavedState, obj, str));
    }

    public final boolean g() {
        return a().isEmpty();
    }

    public final void h() {
        c();
        a().clear();
    }
}
