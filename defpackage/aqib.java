package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqib implements aonq {
    DATA_PUSH_CLIENT_EVENT_TYPE_UNKNOWN(0),
    DATA_PUSH_CLIENT_EVENT_TYPE_EMBEDDED_FILE_GROUP_INIT_FAILED(1),
    DATA_PUSH_CLIENT_EVENT_TYPE_FILE_GROUP_NOT_FOUND(2),
    DATA_PUSH_CLIENT_EVENT_TYPE_FILE_NOT_FOUND(3),
    DATA_PUSH_CLIENT_EVENT_TYPE_FILE_READ_BYTES_FAILED(4),
    DATA_PUSH_CLIENT_EVENT_TYPE_ADD_FILE_GROUP_FAILED(5),
    DATA_PUSH_CLIENT_EVENT_TYPE_MANIFEST_INIT_FAILED(6);

    public final int h;

    aqib(int i2) {
        this.h = i2;
    }

    public static aons a() {
        return apyu.o;
    }

    public static aqib b(int i2) {
        switch (i2) {
            case 0:
                return DATA_PUSH_CLIENT_EVENT_TYPE_UNKNOWN;
            case 1:
                return DATA_PUSH_CLIENT_EVENT_TYPE_EMBEDDED_FILE_GROUP_INIT_FAILED;
            case 2:
                return DATA_PUSH_CLIENT_EVENT_TYPE_FILE_GROUP_NOT_FOUND;
            case 3:
                return DATA_PUSH_CLIENT_EVENT_TYPE_FILE_NOT_FOUND;
            case 4:
                return DATA_PUSH_CLIENT_EVENT_TYPE_FILE_READ_BYTES_FAILED;
            case 5:
                return DATA_PUSH_CLIENT_EVENT_TYPE_ADD_FILE_GROUP_FAILED;
            case 6:
                return DATA_PUSH_CLIENT_EVENT_TYPE_MANIFEST_INIT_FAILED;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
