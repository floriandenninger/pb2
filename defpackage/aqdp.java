package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdp extends aonm implements aooz {
    public static final aqdp a;
    private static volatile aopf d;
    public boolean b;
    public atmw c;
    private int e;

    static {
        aqdp aqdpVar = new aqdp();
        a = aqdpVar;
        aonm.registerDefaultInstance(aqdp.class, aqdpVar);
    }

    private aqdp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqdp.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
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
