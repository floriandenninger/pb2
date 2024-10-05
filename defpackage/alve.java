package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alve extends ecq implements alvf {
    public alve() {
        super("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
    }

    @Override // defpackage.alvf
    public final String a(String str) {
        alta.B("Cannot get embed config, client disconnected.", new Object[0]);
        return "";
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                f((Bundle) ecr.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                g();
                parcel2.writeNoException();
                return true;
            case 4:
                l(parcel.readInt(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                m(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 6:
                j(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                k(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 8:
                String a = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 9:
                h(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                i(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.alvf
    public final void f(Bundle bundle) {
        alta.B("Cannot set fullscreen, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alvf
    public final void g() {
        alta.B("Cannot dismiss fullscreen, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alvf
    public final void h(int i, int i2) {
        alta.B("Cannot send ad event, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alvf
    public final void i(boolean z) {
        alta.B("Cannot handle ad authorization, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alvf
    public final void j(int i) {
        alta.B("Cannot send error, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alvf
    public final void k(boolean z) {
        alta.B("Cannot send fullscreen event, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alvf
    public final void l(int i, String str, long j) {
        alta.B("Cannot send playback event, client disconnected.", new Object[0]);
    }

    @Override // defpackage.alvf
    public final void m(long j) {
        alta.B("Cannot update duration, client disconnected.", new Object[0]);
    }
}
