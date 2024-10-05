package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qmu implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qmu(int i) {
        this.a = i;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, getServiceRequest.a);
        qip.s(parcel, 2, getServiceRequest.b);
        qip.s(parcel, 3, getServiceRequest.c);
        qip.F(parcel, 4, getServiceRequest.d);
        qip.y(parcel, 5, getServiceRequest.e);
        qip.I(parcel, 6, getServiceRequest.f, i);
        qip.v(parcel, 7, getServiceRequest.g);
        qip.E(parcel, 8, getServiceRequest.h, i);
        qip.I(parcel, 10, getServiceRequest.i, i);
        qip.I(parcel, 11, getServiceRequest.j, i);
        qip.o(parcel, 12, getServiceRequest.k);
        qip.s(parcel, 13, getServiceRequest.l);
        qip.o(parcel, 14, getServiceRequest.m);
        qip.F(parcel, 15, getServiceRequest.n);
        qip.n(parcel, m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ConnectionResult[i];
            case 1:
                return new CloudMessagingMessengerCompat[i];
            case 2:
                return new Feature[i];
            case 3:
                return new GoogleCertificatesLookupQuery[i];
            case 4:
                return new GoogleCertificatesLookupResponse[i];
            case 5:
                return new GoogleCertificatesQuery[i];
            case 6:
                return new Scope[i];
            case 7:
                return new Status[i];
            case 8:
                return new BitmapTeleporter[i];
            case 9:
                return new DataHolder[i];
            case 10:
                return new WebImage[i];
            case 11:
                return new BinderWrapper[i];
            case 12:
                return new ClientIdentity[i];
            case 13:
                return new ConnectionInfo[i];
            case 14:
                return new ConnectionTelemetryConfiguration[i];
            case 15:
                return new GetServiceRequest[i];
            case 16:
                return new MethodInvocation[i];
            case 17:
                return new ResolveAccountRequest[i];
            case 18:
                return new ResolveAccountResponse[i];
            case 19:
                return new RootTelemetryConfiguration[i];
            default:
                return new TelemetryData[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 562
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r27) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmu.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
