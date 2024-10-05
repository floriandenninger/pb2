package com.google.android.libraries.youtube.player.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackLoggingPayloadModel;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import defpackage.aigo;
import defpackage.zhq;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(8);
    public final TrackingUrlModel[] a;
    public final PlaybackLoggingPayloadModel[] b;
    public final String c;

    public PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState(Parcel parcel) {
        TrackingUrlModel[] trackingUrlModelArr = (TrackingUrlModel[]) parcel.createTypedArray(TrackingUrlModel.CREATOR);
        PlaybackLoggingPayloadModel[] playbackLoggingPayloadModelArr = (PlaybackLoggingPayloadModel[]) parcel.createTypedArray(PlaybackLoggingPayloadModel.CREATOR);
        this.a = trackingUrlModelArr == null ? new TrackingUrlModel[0] : trackingUrlModelArr;
        this.b = playbackLoggingPayloadModelArr == null ? new PlaybackLoggingPayloadModel[0] : playbackLoggingPayloadModelArr;
        this.c = zhq.h(parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeTypedArray(this.b, i);
        parcel.writeString(this.c);
    }

    public PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState(PriorityQueue priorityQueue, PriorityQueue priorityQueue2, String str) {
        this.a = (TrackingUrlModel[]) priorityQueue.toArray(new TrackingUrlModel[priorityQueue.size()]);
        this.b = (PlaybackLoggingPayloadModel[]) priorityQueue2.toArray(new PlaybackLoggingPayloadModel[priorityQueue2.size()]);
        this.c = str;
    }
}
