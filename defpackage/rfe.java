package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfe extends ecp implements rfg {
    public rfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.rfg
    public final String a(AppMetadata appMetadata) {
        Parcel pn = pn();
        ecr.g(pn, appMetadata);
        Parcel po = po(11, pn);
        String readString = po.readString();
        po.recycle();
        return readString;
    }

    @Override // defpackage.rfg
    public final List f(String str, String str2, AppMetadata appMetadata) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        ecr.g(pn, appMetadata);
        Parcel po = po(16, pn);
        ArrayList createTypedArrayList = po.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        po.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.rfg
    public final List g(String str, String str2, String str3) {
        Parcel pn = pn();
        pn.writeString(null);
        pn.writeString(str2);
        pn.writeString(str3);
        Parcel po = po(17, pn);
        ArrayList createTypedArrayList = po.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        po.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.rfg
    public final List h(String str, String str2, boolean z, AppMetadata appMetadata) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        ecr.e(pn, z);
        ecr.g(pn, appMetadata);
        Parcel po = po(14, pn);
        ArrayList createTypedArrayList = po.createTypedArrayList(UserAttributeParcel.CREATOR);
        po.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.rfg
    public final List i(String str, String str2, String str3, boolean z) {
        Parcel pn = pn();
        pn.writeString(null);
        pn.writeString(str2);
        pn.writeString(str3);
        ecr.e(pn, z);
        Parcel po = po(15, pn);
        ArrayList createTypedArrayList = po.createTypedArrayList(UserAttributeParcel.CREATOR);
        po.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.rfg
    public final void j(AppMetadata appMetadata) {
        Parcel pn = pn();
        ecr.g(pn, appMetadata);
        pp(4, pn);
    }

    @Override // defpackage.rfg
    public final void k(EventParcel eventParcel, AppMetadata appMetadata) {
        Parcel pn = pn();
        ecr.g(pn, eventParcel);
        ecr.g(pn, appMetadata);
        pp(1, pn);
    }

    @Override // defpackage.rfg
    public final void l(AppMetadata appMetadata) {
        Parcel pn = pn();
        ecr.g(pn, appMetadata);
        pp(18, pn);
    }

    @Override // defpackage.rfg
    public final void m(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        Parcel pn = pn();
        ecr.g(pn, conditionalUserPropertyParcel);
        ecr.g(pn, appMetadata);
        pp(12, pn);
    }

    @Override // defpackage.rfg
    public final void n(AppMetadata appMetadata) {
        Parcel pn = pn();
        ecr.g(pn, appMetadata);
        pp(20, pn);
    }

    @Override // defpackage.rfg
    public final void o(long j, String str, String str2, String str3) {
        Parcel pn = pn();
        pn.writeLong(j);
        pn.writeString(str);
        pn.writeString(str2);
        pn.writeString(str3);
        pp(10, pn);
    }

    @Override // defpackage.rfg
    public final void p(Bundle bundle, AppMetadata appMetadata) {
        Parcel pn = pn();
        ecr.g(pn, bundle);
        ecr.g(pn, appMetadata);
        pp(19, pn);
    }

    @Override // defpackage.rfg
    public final void q(AppMetadata appMetadata) {
        Parcel pn = pn();
        ecr.g(pn, appMetadata);
        pp(6, pn);
    }

    @Override // defpackage.rfg
    public final void r(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        Parcel pn = pn();
        ecr.g(pn, userAttributeParcel);
        ecr.g(pn, appMetadata);
        pp(2, pn);
    }

    @Override // defpackage.rfg
    public final byte[] s(EventParcel eventParcel, String str) {
        Parcel pn = pn();
        ecr.g(pn, eventParcel);
        pn.writeString(str);
        Parcel po = po(9, pn);
        byte[] createByteArray = po.createByteArray();
        po.recycle();
        return createByteArray;
    }
}
