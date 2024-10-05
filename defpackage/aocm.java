package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aocm extends aonm implements aooz {
    public static final aocm a;
    private static volatile aopf h;
    public aocj b;
    public aoch c;
    public aocg d;
    public aoci e;
    public aocd f;
    public aoce g;
    private aoot i = aoot.a;

    static {
        aocm aocmVar = new aocm();
        a = aocmVar;
        aonm.registerDefaultInstance(aocm.class, aocmVar);
    }

    private aocm() {
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
                return newMessageInfo(a, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u00052\u0006\t\u0007\t", new Object[]{"b", "c", "d", "f", "i", aocl.a, "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aocm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aocm.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
