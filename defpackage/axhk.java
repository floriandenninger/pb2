package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.vrcore.common.api.HeadTrackingState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axhk extends ecp implements axhl {
    public axhk(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.common.api.IDaydreamManager");
    }

    @Override // defpackage.axhl
    public final int a(ComponentName componentName, HeadTrackingState headTrackingState) {
        Parcel pn = pn();
        ecr.g(pn, componentName);
        Parcel po = po(3, pn);
        int readInt = po.readInt();
        if (po.readInt() != 0) {
            headTrackingState.b(po);
        }
        po.recycle();
        return readInt;
    }

    @Override // defpackage.axhl
    public final int f(ComponentName componentName, int i, PendingIntent pendingIntent, HeadTrackingState headTrackingState) {
        Parcel pn = pn();
        ecr.g(pn, componentName);
        pn.writeInt(i);
        ecr.g(pn, pendingIntent);
        Parcel po = po(13, pn);
        int readInt = po.readInt();
        if (po.readInt() != 0) {
            headTrackingState.b(po);
        }
        po.recycle();
        return readInt;
    }

    @Override // defpackage.axhl
    public final int g(Bundle bundle, HeadTrackingState headTrackingState) {
        Parcel pn = pn();
        ecr.g(pn, bundle);
        Parcel po = po(16, pn);
        int readInt = po.readInt();
        if (po.readInt() != 0) {
            headTrackingState.b(po);
        }
        po.recycle();
        return readInt;
    }

    @Override // defpackage.axhl
    public final void h() {
        pq(14, pn());
    }

    @Override // defpackage.axhl
    public final void i(PendingIntent pendingIntent) {
        Parcel pn = pn();
        ecr.g(pn, pendingIntent);
        pq(5, pn);
    }

    @Override // defpackage.axhl
    public final void j() {
        pq(6, pn());
    }

    @Override // defpackage.axhl
    public final boolean k(PendingIntent pendingIntent) {
        Parcel pn = pn();
        ecr.g(pn, pendingIntent);
        Parcel po = po(10, pn);
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }

    @Override // defpackage.axhl
    public final boolean l(Bundle bundle) {
        Parcel pn = pn();
        ecr.g(pn, bundle);
        Parcel po = po(17, pn);
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }

    @Override // defpackage.axhl
    public final boolean m() {
        Parcel po = po(8, pn());
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }

    @Override // defpackage.axhl
    public final boolean n(axhn axhnVar) {
        Parcel pn = pn();
        ecr.i(pn, axhnVar);
        Parcel po = po(9, pn);
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }

    @Override // defpackage.axhl
    public final void o(PendingIntent pendingIntent, ComponentName componentName) {
        Parcel pn = pn();
        ecr.g(pn, pendingIntent);
        ecr.g(pn, componentName);
        Parcel po = po(7, pn);
        ecr.j(po);
        po.recycle();
    }

    @Override // defpackage.axhl
    public final void p(ComponentName componentName, axhj axhjVar) {
        Parcel pn = pn();
        ecr.g(pn, componentName);
        ecr.i(pn, axhjVar);
        Parcel po = po(1, pn);
        ecr.j(po);
        po.recycle();
    }

    @Override // defpackage.axhl
    public final void q(ComponentName componentName) {
        Parcel pn = pn();
        ecr.g(pn, componentName);
        Parcel po = po(2, pn);
        ecr.j(po);
        po.recycle();
    }
}
