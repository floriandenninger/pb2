package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum amlh implements aonq {
    UNKNOWN_EVENT(0),
    QUEUE_REQUEST(1),
    PROCESS_REQUEST(2),
    REMOTE_CREATE_HANDLE(3),
    REMOTE_INIT(4),
    STORE_VM(5),
    VERIFY_VM_SIGNATURE(6),
    CREATE_VM_CLASS_LOADER(7),
    LOAD_VM_CLASS(8),
    CREATE_VM_OBJECT(9),
    LOCAL_INIT(10),
    LOCAL_CLOSE(11),
    HANDLE_CREATED(12),
    SNAPSHOT_START(13),
    SNAPSHOT_COMPLETE(14);

    public final int p;

    amlh(int i) {
        this.p = i;
    }

    public static amlh a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EVENT;
            case 1:
                return QUEUE_REQUEST;
            case 2:
                return PROCESS_REQUEST;
            case 3:
                return REMOTE_CREATE_HANDLE;
            case 4:
                return REMOTE_INIT;
            case 5:
                return STORE_VM;
            case 6:
                return VERIFY_VM_SIGNATURE;
            case 7:
                return CREATE_VM_CLASS_LOADER;
            case 8:
                return LOAD_VM_CLASS;
            case 9:
                return CREATE_VM_OBJECT;
            case 10:
                return LOCAL_INIT;
            case 11:
                return LOCAL_CLOSE;
            case 12:
                return HANDLE_CREATED;
            case 13:
                return SNAPSHOT_START;
            case 14:
                return SNAPSHOT_COMPLETE;
            default:
                return null;
        }
    }

    public static aons b() {
        return aduo.r;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
