package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apba extends aonm implements aooz {
    public static final apba a;
    private static volatile aopf g;
    public int b;
    public int c;
    public apaz d;
    public int e;
    public aonu f = emptyIntList();

    static {
        apba apbaVar = new apba();
        a = apbaVar;
        aonm.registerDefaultInstance(apba.class, apbaVar);
    }

    private apba() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002ဌ\u0000\u0003ဉ\u0001\u0004ဌ\u0002\u0005\u001e", new Object[]{"b", "c", apac.a(), "d", "e", apab.a(), "f", apah.a()});
            case NEW_MUTABLE_INSTANCE:
                return new apba();
            case NEW_BUILDER:
                return new aone((boolean[]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apba.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
