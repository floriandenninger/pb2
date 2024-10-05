package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auzo extends aonm implements aooz {
    public static final auzo a;
    private static volatile aopf e;
    public long c;
    private int f;
    public String b = "";
    public aony d = aonm.emptyProtobufList();

    static {
        auzo auzoVar = new auzo();
        a = auzoVar;
        aonm.registerDefaultInstance(auzo.class, auzoVar);
    }

    private auzo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဂ\u0001\u0003ဈ\u0000\u0004\u001a", new Object[]{"f", "c", "b", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new auzo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (auzo.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
