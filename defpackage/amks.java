package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amks extends aonm implements aooz {
    public static final amks a;
    private static volatile aopf c;
    public aomf b;

    static {
        amks amksVar = new amks();
        a = amksVar;
        aonm.registerDefaultInstance(amks.class, amksVar);
    }

    private amks() {
        aomf aomfVar = aomf.b;
        this.b = aomf.b;
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\t\t\u0001\u0000\u0000\u0000\t\n", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new amks();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (amks.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
