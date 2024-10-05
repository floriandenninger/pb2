package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.a;
import defpackage.apxf;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CommandWrapper extends ProtoWrapper {
    public static final Parcelable.Creator CREATOR = new a(2);

    public CommandWrapper(Parcel parcel) {
        super((apxf) yny.H(parcel, apxf.a));
    }

    public CommandWrapper(apxf apxfVar) {
        super(apxfVar);
    }
}
