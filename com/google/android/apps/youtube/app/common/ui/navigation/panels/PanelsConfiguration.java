package com.google.android.apps.youtube.app.common.ui.navigation.panels;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gjj;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PanelsConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gjj(0);
    public final PanelDescriptor a;
    public final Optional b;

    public PanelsConfiguration(PanelDescriptor panelDescriptor, Optional optional) {
        panelDescriptor.getClass();
        this.a = panelDescriptor;
        this.b = optional;
    }

    public static PanelsConfiguration b(PanelDescriptor panelDescriptor) {
        return new PanelsConfiguration(panelDescriptor, Optional.empty());
    }

    public static PanelsConfiguration c(PanelDescriptor panelDescriptor, PanelDescriptor panelDescriptor2) {
        return new PanelsConfiguration(panelDescriptor, Optional.of(panelDescriptor2));
    }

    public final PanelDescriptor a() {
        return this.b.isPresent() ? (PanelDescriptor) this.b.get() : this.a;
    }

    public final boolean d() {
        return this.b.isPresent();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PanelsConfiguration) {
            PanelsConfiguration panelsConfiguration = (PanelsConfiguration) obj;
            if (this.a.equals(panelsConfiguration.a) && this.b.equals(panelsConfiguration.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable((Parcelable) this.b.orElse(null), i);
    }
}
