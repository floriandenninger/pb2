package com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum Tick implements Parcelable {
    REMOTE_EMBED_COORDINATOR_INIT_START(0, "ep_rec_start"),
    REMOTE_EMBED_COORDINATOR_INIT_END(1, "ep_rec_end"),
    REMOTE_EMBEDDED_PLAYER_V2_SERVICE_INIT_START(2, "ep_reps_start"),
    REMOTE_EMBEDDED_PLAYER_V2_SERVICE_INIT_END(3, "ep_reps_end"),
    REMOTE_RECEIVES_REQUEST(4, "ep_r_rr"),
    REMOTE_SENDS_MAIN_APP_REQUEST(5, "ep_r_smar"),
    MAIN_APP_RECEIVES_REQUEST(6, "ep_ma_rr"),
    MAIN_APP_SENDS_PLAYER_REQUEST(7, "ep_ma_spr"),
    REMOTE_RECEIVES_PREVIEW_REQUEST(8, "ep_r_pre_r"),
    MAIN_APP_SENDS_EMBEDDED_PLAYER_REQUEST(9, "ep_ma_sepr"),
    MAIN_APP_RECEIVES_EMBEDDED_PLAYER_REQUEST(10, "ep_ma_repr");

    public static final Parcelable.Creator CREATOR = new a(0);
    public final String l;
    private final int n;

    Tick(int i, String str) {
        this.n = i;
        this.l = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
    }
}
