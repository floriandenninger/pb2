package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.pms;
import defpackage.pne;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ pms a() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void b(pne pneVar) {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        return valueOf.length() != 0 ? "SCTE-35 splice command: type=".concat(valueOf) : new String("SCTE-35 splice command: type=");
    }
}
