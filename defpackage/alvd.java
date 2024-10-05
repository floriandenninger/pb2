package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alvd extends ecp implements alvf {
    public alvd(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
    }

    @Override // defpackage.alvf
    public final String a(String str) {
        Parcel pn = pn();
        pn.writeString(str);
        Parcel po = po(8, pn);
        String readString = po.readString();
        po.recycle();
        return readString;
    }

    @Override // defpackage.alvf
    public final void f(Bundle bundle) {
        Parcel pn = pn();
        ecr.g(pn, bundle);
        pp(2, pn);
    }

    @Override // defpackage.alvf
    public final void g() {
        pp(3, pn());
    }

    @Override // defpackage.alvf
    public final void h(int i, int i2) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeInt(i2);
        pp(9, pn);
    }

    @Override // defpackage.alvf
    public final void i(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(10, pn);
    }

    @Override // defpackage.alvf
    public final void j(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(6, pn);
    }

    @Override // defpackage.alvf
    public final void k(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(7, pn);
    }

    @Override // defpackage.alvf
    public final void l(int i, String str, long j) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeString(str);
        pn.writeLong(j);
        pp(4, pn);
    }

    @Override // defpackage.alvf
    public final void m(long j) {
        Parcel pn = pn();
        pn.writeLong(j);
        pp(5, pn);
    }
}
