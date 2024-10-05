package defpackage;

import android.os.Parcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.PhotoEntity;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.gms.phenotype.GenericDimension;
import com.google.android.gms.potokens.PoToken;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnq implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rnq(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new BackedUpContactsPerDeviceEntity[i];
            case 1:
                return new SyncStatus[i];
            case 2:
                return new BirthdayEntity[i];
            case 3:
                return new DeviceVersionEntity[i];
            case 4:
                return new EmailEntity[i];
            case 5:
                return new FetchBackUpDeviceContactInfoResponseEntity[i];
            case 6:
                return new NameEntity[i];
            case 7:
                return new PersonEntity[i];
            case 8:
                return new PersonFieldMetadataEntity[i];
            case 9:
                return new PhoneEntity[i];
            case 10:
                return new PhotoEntity[i];
            case 11:
                return new SourceStatsEntity[i];
            case 12:
                return new Configuration[i];
            case 13:
                return new Configurations[i];
            case 14:
                return new DogfoodsToken[i];
            case 15:
                return new ExperimentTokens[i];
            case 16:
                return new Flag[i];
            case 17:
                return new FlagOverride[i];
            case 18:
                return new FlagOverrides[i];
            case 19:
                return new GenericDimension[i];
            default:
                return new PoToken[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 507
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r24) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rnq.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
