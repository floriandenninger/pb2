package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aotj extends aonm implements aooz {
    public static final aonv a = new uct(4);
    public static final aotj b;
    private static volatile aopf d;
    public aonu c = emptyIntList();

    static {
        aotj aotjVar = new aotj();
        b = aotjVar;
        aonm.registerDefaultInstance(aotj.class, aotjVar);
    }

    private aotj() {
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
                return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"c", aotk.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aotj();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aotj.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
