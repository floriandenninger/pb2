package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.controller.api.ControllerGyroEvent;
import com.google.vr.vrcore.controller.api.ControllerListenerOptions;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.ControllerPositionEvent;
import com.google.vr.vrcore.controller.api.ControllerRequest;
import com.google.vr.vrcore.controller.api.ControllerTouchEvent;
import com.google.vr.vrcore.controller.api.ControllerTrackingStatusEvent;
import com.google.vr.vrcore.logging.api.VREventParcelable;
import org.chromium.base.UnguessableToken;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axhq implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public axhq(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new ControllerListenerOptions(parcel);
            case 1:
                return new ControllerGyroEvent(parcel);
            case 2:
                return new ControllerOrientationEvent(parcel);
            case 3:
                return new ControllerPositionEvent(parcel);
            case 4:
                return new ControllerRequest(parcel);
            case 5:
                return new ControllerTouchEvent(parcel);
            case 6:
                return new ControllerTrackingStatusEvent(parcel);
            case 7:
                return new VREventParcelable(parcel);
            default:
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                if (readLong == 0 || readLong2 == 0) {
                    return null;
                }
                return new UnguessableToken(readLong, readLong2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ControllerListenerOptions[i];
            case 1:
                return new ControllerGyroEvent[i];
            case 2:
                return new ControllerOrientationEvent[i];
            case 3:
                return new ControllerPositionEvent[i];
            case 4:
                return new ControllerRequest[i];
            case 5:
                return new ControllerTouchEvent[i];
            case 6:
                return new ControllerTrackingStatusEvent[i];
            case 7:
                return new VREventParcelable[i];
            default:
                return new UnguessableToken[i];
        }
    }
}
