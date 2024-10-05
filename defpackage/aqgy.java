package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqgy extends aonm implements aooz {
    public static final aqgy a;
    private static volatile aopf e;
    public aony b = emptyProtobufList();
    public boolean c;
    public long d;
    private int f;

    static {
        aqgy aqgyVar = new aqgy();
        a = aqgyVar;
        aonm.registerDefaultInstance(aqgy.class, aqgyVar);
    }

    private aqgy() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဂ\u0001", new Object[]{"f", "b", aqgx.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqgy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqgy.class) {
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
