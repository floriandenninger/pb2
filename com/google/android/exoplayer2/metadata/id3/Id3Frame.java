package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.pms;
import defpackage.pne;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String f;

    public Id3Frame(String str) {
        this.f = str;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ pms a() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void b(pne pneVar) {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f;
    }
}
