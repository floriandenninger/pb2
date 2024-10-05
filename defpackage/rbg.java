package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.SyncResult;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import com.google.android.gms.mobiledataplan.CellularInfo;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rbg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rbg(int i) {
        this.a = i;
    }

    public static void a(EventParcel eventParcel, Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, eventParcel.a);
        qip.E(parcel, 3, eventParcel.b, i);
        qip.F(parcel, 4, eventParcel.c);
        qip.t(parcel, 5, eventParcel.d);
        qip.n(parcel, m);
    }

    public static void b(UserAttributeParcel userAttributeParcel, Parcel parcel) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, userAttributeParcel.a);
        qip.F(parcel, 2, userAttributeParcel.b);
        qip.t(parcel, 3, userAttributeParcel.c);
        qip.D(parcel, 4, userAttributeParcel.d);
        qip.F(parcel, 6, userAttributeParcel.e);
        qip.F(parcel, 7, userAttributeParcel.f);
        Double d = userAttributeParcel.g;
        if (d != null) {
            qip.r(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        qip.n(parcel, m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new NetworkLocationStatus[i];
            case 1:
                return new LocationResult[i];
            case 2:
                return new DeviceOrientationRequestInternal[i];
            case 3:
                return new DeviceOrientationRequestUpdateData[i];
            case 4:
                return new FusedLocationProviderResult[i];
            case 5:
                return new LocationRequestInternal[i];
            case 6:
                return new LocationRequestUpdateData[i];
            case 7:
                return new LatLng[i];
            case 8:
                return new CallerInfo[i];
            case 9:
                return new SyncOptions[i];
            case 10:
                return new SyncRequest[i];
            case 11:
                return new SyncResult[i];
            case 12:
                return new InitializationParams[i];
            case 13:
                return new ConditionalUserPropertyParcel[i];
            case 14:
                return new EventParams[i];
            case 15:
                return new EventParcel[i];
            case 16:
                return new UserAttributeParcel[i];
            case 17:
                return new CellularInfo[i];
            case 18:
                return new MdpCarrierPlanIdRequest[i];
            case 19:
                return new MdpCarrierPlanIdResponse[i];
            default:
                return new MdpDataPlanStatusResponse[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 586
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbg.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
