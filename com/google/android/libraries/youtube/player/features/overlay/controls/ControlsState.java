package com.google.android.libraries.youtube.player.features.overlay.controls;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;
import defpackage.ahvo;
import defpackage.amkq;
import defpackage.ammu;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControlsState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapi(18);
    public final ahvo a;
    public final boolean b;

    public ControlsState(ahvo ahvoVar, boolean z) {
        if (ahvoVar != ahvo.PLAYING && ahvoVar != ahvo.PAUSED) {
            amkq.F(!z, "controls can be in the buffering state only if in PLAYING or PAUSED video state");
        }
        ahvoVar.getClass();
        this.a = ahvoVar;
        this.b = z;
    }

    public static ControlsState a() {
        return new ControlsState(ahvo.ENDED, false);
    }

    public static ControlsState b() {
        return new ControlsState(ahvo.NEW, false);
    }

    public static ControlsState c() {
        return new ControlsState(ahvo.PAUSED, true);
    }

    public static ControlsState d() {
        return new ControlsState(ahvo.PAUSED, false);
    }

    public static ControlsState e() {
        return new ControlsState(ahvo.PLAYING, true);
    }

    public static ControlsState f() {
        return new ControlsState(ahvo.PLAYING, false);
    }

    public static ControlsState g() {
        return new ControlsState(ahvo.RECOVERABLE_ERROR, false);
    }

    public static ControlsState h() {
        return new ControlsState(ahvo.UNRECOVERABLE_ERROR, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControlsState)) {
            return false;
        }
        ControlsState controlsState = (ControlsState) obj;
        return this.a == controlsState.a && this.b == controlsState.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final boolean i() {
        return this.a == ahvo.RECOVERABLE_ERROR || this.a == ahvo.UNRECOVERABLE_ERROR;
    }

    public final boolean j() {
        return this.a == ahvo.PLAYING || this.a == ahvo.PAUSED || this.a == ahvo.ENDED;
    }

    public final boolean k() {
        return j() && !this.b;
    }

    public final String toString() {
        ammu X = amkq.X(ControlsState.class);
        X.b("videoState", this.a);
        X.g("isBuffering", this.b);
        return X.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.ordinal());
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }
}
