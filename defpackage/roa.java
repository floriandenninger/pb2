package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class roa extends ecq implements IInterface {
    private final rpv a;

    public roa(rpv rpvVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = rpvVar;
    }

    public roa() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                qar.n((Status) ecr.a(parcel, Status.CREATOR), this.a);
                return true;
            case 2:
                qar.n((Status) ecr.a(parcel, Status.CREATOR), this.a);
                return true;
            case 3:
                qar.n((Status) ecr.a(parcel, Status.CREATOR), this.a);
                return true;
            case 4:
                qar.o((Status) ecr.a(parcel, Status.CREATOR), (Configurations) ecr.a(parcel, Configurations.CREATOR), this.a);
                return true;
            case 5:
                qar.n((Status) ecr.a(parcel, Status.CREATOR), this.a);
                return true;
            case 6:
                qar.o((Status) ecr.a(parcel, Status.CREATOR), (ExperimentTokens) ecr.a(parcel, ExperimentTokens.CREATOR), this.a);
                return true;
            case 7:
                qar.o((Status) ecr.a(parcel, Status.CREATOR), (DogfoodsToken) ecr.a(parcel, DogfoodsToken.CREATOR), this.a);
                return true;
            case 8:
                qar.n((Status) ecr.a(parcel, Status.CREATOR), this.a);
                return true;
            case 9:
                qar.o((Status) ecr.a(parcel, Status.CREATOR), (Flag) ecr.a(parcel, Flag.CREATOR), this.a);
                return true;
            case 10:
                qar.o((Status) ecr.a(parcel, Status.CREATOR), (Configurations) ecr.a(parcel, Configurations.CREATOR), this.a);
                return true;
            case 11:
                qar.o((Status) ecr.a(parcel, Status.CREATOR), Long.valueOf(parcel.readLong()), this.a);
                return true;
            case 12:
                qar.n((Status) ecr.a(parcel, Status.CREATOR), this.a);
                return true;
            case 13:
                qar.o((Status) ecr.a(parcel, Status.CREATOR), (FlagOverrides) ecr.a(parcel, FlagOverrides.CREATOR), this.a);
                return true;
            case 14:
                qar.n((Status) ecr.a(parcel, Status.CREATOR), this.a);
                return true;
            case 15:
                qar.n((Status) ecr.a(parcel, Status.CREATOR), this.a);
                return true;
            case 16:
                qar.o((Status) ecr.a(parcel, Status.CREATOR), Long.valueOf(parcel.readLong()), this.a);
                return true;
            default:
                return false;
        }
    }
}
