package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqc extends aonm implements aooz {
    public static final atqc a;
    private static volatile aopf b;
    private byte c = 2;

    static {
        atqc atqcVar = new atqc();
        a = atqcVar;
        aonm.registerDefaultInstance(atqc.class, atqcVar);
    }

    private atqc() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new atqc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atqc.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
