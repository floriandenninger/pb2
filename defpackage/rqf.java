package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rqf extends ecq implements IInterface {
    public rqf() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        throw new IllegalStateException("Not implemented.");
    }

    public void b(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                a((Status) ecr.a(parcel, Status.CREATOR), (UsageReportingOptInOptions) ecr.a(parcel, UsageReportingOptInOptions.CREATOR));
                return true;
            case 3:
                throw new IllegalStateException("Not implemented.");
            case 4:
                throw new IllegalStateException("Not implemented.");
            case 5:
                b((Status) ecr.a(parcel, Status.CREATOR));
                return true;
            case 6:
                parcel.createStringArrayList();
                throw new IllegalStateException("Not implemented.");
            case 7:
                throw new IllegalStateException("Not implemented.");
            case 8:
                ecr.j(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                throw new IllegalStateException("Not implemented");
            default:
                return false;
        }
    }
}
