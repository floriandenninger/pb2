package com.google.android.apps.youtube.app.extensions.reel.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.amkq;
import defpackage.gjj;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelWatchBackstack$BackstackEntryStack implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gjj(4);
    public final List a;

    public ReelWatchBackstack$BackstackEntryStack() {
        this.a = new ArrayList();
    }

    public final int a() {
        return this.a.size();
    }

    public final ReelWatchBackstack$BackstackEntry b(int i) {
        return (ReelWatchBackstack$BackstackEntry) this.a.get(i);
    }

    public final ReelWatchBackstack$BackstackEntry c() {
        if (this.a.isEmpty()) {
            return null;
        }
        return (ReelWatchBackstack$BackstackEntry) amkq.bj(this.a);
    }

    public final ReelWatchBackstack$BackstackEntry d() {
        if (!this.a.isEmpty()) {
            return (ReelWatchBackstack$BackstackEntry) this.a.remove(r0.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(ReelWatchBackstack$BackstackEntry reelWatchBackstack$BackstackEntry) {
        this.a.add(reelWatchBackstack$BackstackEntry);
    }

    public final boolean f() {
        return this.a.isEmpty();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
    }

    public ReelWatchBackstack$BackstackEntryStack(Parcel parcel) {
        this();
        parcel.readTypedList(this.a, ReelWatchBackstack$BackstackEntry.CREATOR);
    }
}
