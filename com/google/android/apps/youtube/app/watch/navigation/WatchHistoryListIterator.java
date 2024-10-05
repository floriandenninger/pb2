package com.google.android.apps.youtube.app.watch.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import defpackage.amkq;
import defpackage.gig;
import defpackage.gjj;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchHistoryListIterator extends gig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gjj(20);

    public WatchHistoryListIterator() {
    }

    static final PlaybackStartDescriptor e(Parcel parcel) {
        return (PlaybackStartDescriptor) parcel.readParcelable(PlaybackStartDescriptor.class.getClassLoader());
    }

    static final Deque f(Parcel parcel) {
        int max = Math.max(parcel.readInt(), 0);
        ArrayDeque arrayDeque = new ArrayDeque(max);
        if (max != 0) {
            for (int i = 0; i < max; i++) {
                arrayDeque.offerLast(e(parcel));
            }
        }
        return arrayDeque;
    }

    static void g(Parcel parcel, int i, Deque deque) {
        ArrayDeque arrayDeque = new ArrayDeque(deque);
        int size = arrayDeque.size();
        parcel.writeInt(size);
        if (size != 0) {
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeParcelable((PlaybackStartDescriptor) arrayDeque.pollFirst(), i);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) this.c;
        if (playbackStartDescriptor != null) {
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(playbackStartDescriptor, i);
        } else {
            parcel.writeByte((byte) 0);
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.a);
        while (arrayDeque.size() > 10) {
            arrayDeque.pollLast();
        }
        g(parcel, i, arrayDeque);
        ArrayDeque arrayDeque2 = new ArrayDeque(this.b);
        while (arrayDeque2.size() > 10) {
            arrayDeque2.pollLast();
        }
        g(parcel, i, arrayDeque2);
    }

    public WatchHistoryListIterator(Parcel parcel) {
        PlaybackStartDescriptor e = parcel.readByte() != 0 ? e(parcel) : null;
        Deque f = f(parcel);
        Deque f2 = f(parcel);
        if (e == null) {
            amkq.N(f.isEmpty());
            amkq.N(f2.isEmpty());
        }
        a();
        this.c = e;
        this.a.addAll(f);
        this.b.addAll(f2);
    }
}
