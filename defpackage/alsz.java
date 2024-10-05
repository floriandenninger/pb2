package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.AutoValue_ValidationResult;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.messaging.RemoteMessage;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import com.google.vr.vrcore.controller.api.ControllerAccelEvent;
import com.google.vr.vrcore.controller.api.ControllerBatteryEvent;
import com.google.vr.vrcore.controller.api.ControllerButtonEvent;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alsz implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public alsz(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CustomEvent[i];
            case 1:
                return new ReviewInfo[i];
            case 2:
                return new MetricKey[i];
            case 3:
                return new AccountId[i];
            case 4:
                return new AccountActionResult[i];
            case 5:
                return new ValidationResult[i];
            case 6:
                return new ParcelableFuture[i];
            case 7:
                return new ActionImpl[i];
            case 8:
                return new CallStatus[i];
            case 9:
                return new Thing.Metadata[i];
            case 10:
                return new ActionImpl.MetadataImpl[i];
            case 11:
                return new MutateRequest[i];
            case 12:
                return new Thing[i];
            case 13:
                return new RemoteMessage[i];
            case 14:
                return new ProtoParsers$InternalDontUse[i];
            case 15:
                return new HeadTrackingState[i];
            case 16:
                return new ControllerAccelEvent[i];
            case 17:
                return new ControllerBatteryEvent[i];
            case 18:
                return new ControllerButtonEvent[i];
            case 19:
                return new ControllerEventPacket[i];
            default:
                return new ControllerEventPacket2[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ControllerEventPacket controllerEventPacket;
        ControllerEventPacket2 controllerEventPacket2;
        int i = 0;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                return new CustomEvent(parcel.readLong(), (MetricKey) parcel.readParcelable(MetricKey.class.getClassLoader()), parcel.readPersistableBundle(MetricKey.class.getClassLoader()), parcel.readPersistableBundle(MetricKey.class.getClassLoader()), null);
            case 1:
                return ReviewInfo.c((PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader()), parcel.readInt() != 0);
            case 2:
                return new MetricKey(parcel.readString(), parcel.readString());
            case 3:
                return AccountId.b(parcel.readInt());
            case 4:
                return new AccountActionResult(parcel);
            case 5:
                return new AutoValue_ValidationResult(parcel.readInt() == 1, parcel.readInt() == 1, (Intent) parcel.readParcelable(getClass().getClassLoader()));
            case 6:
                return new ParcelableFuture(parcel);
            case 7:
                int Q = qip.Q(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                ActionImpl.MetadataImpl metadataImpl = null;
                String str5 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    switch (qip.M(readInt)) {
                        case 1:
                            str = qip.Y(parcel, readInt);
                            break;
                        case 2:
                            str2 = qip.Y(parcel, readInt);
                            break;
                        case 3:
                            str3 = qip.Y(parcel, readInt);
                            break;
                        case 4:
                            str4 = qip.Y(parcel, readInt);
                            break;
                        case 5:
                            metadataImpl = (ActionImpl.MetadataImpl) qip.U(parcel, readInt, ActionImpl.MetadataImpl.CREATOR);
                            break;
                        case 6:
                            str5 = qip.Y(parcel, readInt);
                            break;
                        case 7:
                            bundle2 = qip.S(parcel, readInt);
                            break;
                        default:
                            qip.ad(parcel, readInt);
                            break;
                    }
                }
                qip.ac(parcel, Q);
                return new ActionImpl(str, str2, str3, str4, metadataImpl, str5, bundle2);
            case 8:
                int Q2 = qip.Q(parcel);
                while (parcel.dataPosition() < Q2) {
                    int readInt2 = parcel.readInt();
                    if (qip.M(readInt2) == 1) {
                        i = qip.O(parcel, readInt2);
                    } else {
                        qip.ad(parcel, readInt2);
                    }
                }
                qip.ac(parcel, Q2);
                return new CallStatus(i);
            case 9:
                int Q3 = qip.Q(parcel);
                String str6 = null;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                boolean z = false;
                int i2 = 0;
                while (parcel.dataPosition() < Q3) {
                    int readInt3 = parcel.readInt();
                    int M = qip.M(readInt3);
                    if (M == 1) {
                        z = qip.ae(parcel, readInt3);
                    } else if (M == 2) {
                        i2 = qip.O(parcel, readInt3);
                    } else if (M == 3) {
                        str6 = qip.Y(parcel, readInt3);
                    } else if (M == 4) {
                        bundle3 = qip.S(parcel, readInt3);
                    } else if (M == 5) {
                        bundle4 = qip.S(parcel, readInt3);
                    } else {
                        qip.ad(parcel, readInt3);
                    }
                }
                qip.ac(parcel, Q3);
                return new Thing.Metadata(z, i2, str6, bundle3, bundle4);
            case 10:
                int Q4 = qip.Q(parcel);
                String str7 = null;
                String str8 = null;
                byte[] bArr = null;
                int i3 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (parcel.dataPosition() < Q4) {
                    int readInt4 = parcel.readInt();
                    switch (qip.M(readInt4)) {
                        case 1:
                            i3 = qip.O(parcel, readInt4);
                            break;
                        case 2:
                            z2 = qip.ae(parcel, readInt4);
                            break;
                        case 3:
                            str7 = qip.Y(parcel, readInt4);
                            break;
                        case 4:
                            str8 = qip.Y(parcel, readInt4);
                            break;
                        case 5:
                            bArr = qip.af(parcel, readInt4);
                            break;
                        case 6:
                            z3 = qip.ae(parcel, readInt4);
                            break;
                        default:
                            qip.ad(parcel, readInt4);
                            break;
                    }
                }
                qip.ac(parcel, Q4);
                return new ActionImpl.MetadataImpl(i3, z2, str7, str8, bArr, z3);
            case 11:
                int Q5 = qip.Q(parcel);
                Thing[] thingArr = null;
                String[] strArr = null;
                String[] strArr2 = null;
                ActionImpl actionImpl = null;
                String str9 = null;
                String str10 = null;
                int i4 = 0;
                while (parcel.dataPosition() < Q5) {
                    int readInt5 = parcel.readInt();
                    switch (qip.M(readInt5)) {
                        case 1:
                            i4 = qip.O(parcel, readInt5);
                            break;
                        case 2:
                            thingArr = (Thing[]) qip.ai(parcel, readInt5, Thing.CREATOR);
                            break;
                        case 3:
                            strArr = qip.aj(parcel, readInt5);
                            break;
                        case 4:
                        default:
                            qip.ad(parcel, readInt5);
                            break;
                        case 5:
                            strArr2 = qip.aj(parcel, readInt5);
                            break;
                        case 6:
                            actionImpl = (ActionImpl) qip.U(parcel, readInt5, ActionImpl.CREATOR);
                            break;
                        case 7:
                            str9 = qip.Y(parcel, readInt5);
                            break;
                        case 8:
                            str10 = qip.Y(parcel, readInt5);
                            break;
                    }
                }
                qip.ac(parcel, Q5);
                return new MutateRequest(i4, thingArr, strArr, strArr2, actionImpl, str9, str10);
            case 12:
                int Q6 = qip.Q(parcel);
                Bundle bundle5 = null;
                Thing.Metadata metadata = null;
                String str11 = null;
                String str12 = null;
                int i5 = 0;
                while (parcel.dataPosition() < Q6) {
                    int readInt6 = parcel.readInt();
                    int M2 = qip.M(readInt6);
                    if (M2 == 1) {
                        bundle5 = qip.S(parcel, readInt6);
                    } else if (M2 == 2) {
                        metadata = (Thing.Metadata) qip.U(parcel, readInt6, Thing.Metadata.CREATOR);
                    } else if (M2 == 3) {
                        str11 = qip.Y(parcel, readInt6);
                    } else if (M2 == 4) {
                        str12 = qip.Y(parcel, readInt6);
                    } else if (M2 == 1000) {
                        i5 = qip.O(parcel, readInt6);
                    } else {
                        qip.ad(parcel, readInt6);
                    }
                }
                qip.ac(parcel, Q6);
                return new Thing(i5, bundle5, metadata, str11, str12);
            case 13:
                int Q7 = qip.Q(parcel);
                while (parcel.dataPosition() < Q7) {
                    int readInt7 = parcel.readInt();
                    if (qip.M(readInt7) == 2) {
                        bundle = qip.S(parcel, readInt7);
                    } else {
                        qip.ad(parcel, readInt7);
                    }
                }
                qip.ac(parcel, Q7);
                return new RemoteMessage(bundle);
            case 14:
                byte[] bArr2 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr2);
                return new ProtoParsers$InternalDontUse(bArr2, null);
            case 15:
                return new HeadTrackingState(parcel);
            case 16:
                return new ControllerAccelEvent(parcel);
            case 17:
                return new ControllerBatteryEvent(parcel);
            case 18:
                return new ControllerButtonEvent(parcel);
            case 19:
                synchronized (ControllerEventPacket.k) {
                    controllerEventPacket = ControllerEventPacket.j.isEmpty() ? new ControllerEventPacket() : (ControllerEventPacket) ControllerEventPacket.j.remove();
                }
                controllerEventPacket.c(parcel);
                return controllerEventPacket;
            default:
                synchronized (ControllerEventPacket2.b) {
                    controllerEventPacket2 = ControllerEventPacket2.a.isEmpty() ? new ControllerEventPacket2() : (ControllerEventPacket2) ControllerEventPacket2.a.remove();
                }
                controllerEventPacket2.c(parcel);
                return controllerEventPacket2;
        }
    }
}
