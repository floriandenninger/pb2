package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.ISelectableItemRegistryService");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c
    public final void a(SelectableItemKey selectableItemKey) {
        Parcel pn = pn();
        ecr.g(pn, selectableItemKey);
        pp(1, pn);
    }
}
