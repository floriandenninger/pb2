package defpackage;

import android.os.Parcel;
import com.google.vr.vrcore.common.api.HeadTrackingState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axhi extends ecq implements axhj {
    public axhi() {
        super("com.google.vr.vrcore.common.api.IDaydreamListener");
    }

    @Override // defpackage.ecq
    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeInt(25);
                return true;
            case 2:
                HeadTrackingState requestStopTracking = requestStopTracking();
                parcel2.writeNoException();
                ecr.h(parcel2, requestStopTracking);
                return true;
            case 3:
                applyFade(parcel.readInt(), parcel.readLong());
                return true;
            case 4:
                recenterHeadTracking();
                return true;
            case 5:
                dumpDebugData();
                return true;
            case 6:
                resumeHeadTracking((HeadTrackingState) ecr.a(parcel, HeadTrackingState.CREATOR));
                return true;
            case 7:
                invokeCloseAction();
                return true;
            case 8:
                deprecated_setLensOffsets(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                return true;
            case 9:
                setLensOffset(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
                return true;
            case 10:
                applyColorfulFade(parcel.readInt(), parcel.readLong(), parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
