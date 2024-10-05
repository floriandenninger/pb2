package com.google.android.libraries.youtube.player.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.stats.attestation.AttestationClient$AttestationClientState;
import defpackage.aigo;
import defpackage.zhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackClientManager$State implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(7);
    public final String a;
    public final HeartbeatClient$HeartbeatClientState b;
    public final PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState c;
    public final VideoStats2Client$VideoStats2ClientState d;
    public final AttestationClient$AttestationClientState e;
    public final VideoStats3Client$VideoStats3ClientState f;

    public PlaybackClientManager$State(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = zhq.h(parcel.readString());
        this.b = (HeartbeatClient$HeartbeatClientState) parcel.readParcelable(classLoader);
        this.c = (PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState) parcel.readParcelable(classLoader);
        this.d = (VideoStats2Client$VideoStats2ClientState) parcel.readParcelable(classLoader);
        this.e = (AttestationClient$AttestationClientState) parcel.readParcelable(classLoader);
        this.f = (VideoStats3Client$VideoStats3ClientState) parcel.readParcelable(classLoader);
    }

    public PlaybackClientManager$State(String str, HeartbeatClient$HeartbeatClientState heartbeatClient$HeartbeatClientState, PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState playbackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState, VideoStats2Client$VideoStats2ClientState videoStats2Client$VideoStats2ClientState, AttestationClient$AttestationClientState attestationClient$AttestationClientState, VideoStats3Client$VideoStats3ClientState videoStats3Client$VideoStats3ClientState) {
        this.a = str;
        this.b = heartbeatClient$HeartbeatClientState;
        this.c = playbackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState;
        this.d = videoStats2Client$VideoStats2ClientState;
        this.e = attestationClient$AttestationClientState;
        this.f = videoStats3Client$VideoStats3ClientState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.US, "State { videoId=%s }", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
    }
}
