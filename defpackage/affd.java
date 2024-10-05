package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum affd implements aonq {
    SCRIPTED_PLAYER_ERROR_TYPE_SUCCESS(0),
    SCRIPTED_PLAYER_ERROR_TYPE_FAILED_PRECONDITION(1),
    SCRIPTED_PLAYER_ERROR_TYPE_INVALID_ARGUMENT(2),
    SCRIPTED_PLAYER_ERROR_TYPE_JAVA_ERROR(3),
    SCRIPTED_PLAYER_ERROR_TYPE_JNI_ERROR(4),
    SCRIPTED_PLAYER_ERROR_TYPE_CPP_ERROR(5),
    SCRIPTED_PLAYER_ERROR_TYPE_JSC_ERROR(6),
    SCRIPTED_PLAYER_ERROR_TYPE_JS_ERROR(7),
    SCRIPTED_PLAYER_ERROR_TYPE_JAVA_OBJECT_NOT_FOUND(8),
    SCRIPTED_PLAYER_ERROR_TYPE_JS_OBJECT_NOT_FOUND(9),
    UNRECOGNIZED(-1);

    private final int m;

    affd(int i) {
        this.m = i;
    }

    public static affd a(int i) {
        switch (i) {
            case 0:
                return SCRIPTED_PLAYER_ERROR_TYPE_SUCCESS;
            case 1:
                return SCRIPTED_PLAYER_ERROR_TYPE_FAILED_PRECONDITION;
            case 2:
                return SCRIPTED_PLAYER_ERROR_TYPE_INVALID_ARGUMENT;
            case 3:
                return SCRIPTED_PLAYER_ERROR_TYPE_JAVA_ERROR;
            case 4:
                return SCRIPTED_PLAYER_ERROR_TYPE_JNI_ERROR;
            case 5:
                return SCRIPTED_PLAYER_ERROR_TYPE_CPP_ERROR;
            case 6:
                return SCRIPTED_PLAYER_ERROR_TYPE_JSC_ERROR;
            case 7:
                return SCRIPTED_PLAYER_ERROR_TYPE_JS_ERROR;
            case 8:
                return SCRIPTED_PLAYER_ERROR_TYPE_JAVA_OBJECT_NOT_FOUND;
            case 9:
                return SCRIPTED_PLAYER_ERROR_TYPE_JS_OBJECT_NOT_FOUND;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
