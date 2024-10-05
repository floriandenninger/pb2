package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class b extends ecq implements c {
    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.ISelectableItemRegistryService");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((SelectableItemKey) ecr.a(parcel, SelectableItemKey.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
