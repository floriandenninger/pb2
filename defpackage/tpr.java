package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum tpr {
    NEW_FILE_KEY(0),
    ADD_DOWNLOAD_TRANSFORM(1),
    USE_CHECKSUM_ONLY(2);

    public final int d;

    tpr(int i) {
        this.d = i;
    }

    public static tpr a(int i) {
        if (i == 0) {
            return NEW_FILE_KEY;
        }
        if (i == 1) {
            return ADD_DOWNLOAD_TRANSFORM;
        }
        if (i == 2) {
            return USE_CHECKSUM_ONLY;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Unknown MDD FileKey version:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
