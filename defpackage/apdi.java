package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apdi extends aonm implements aooz {
    public static final apdi a;
    private static volatile aopf e;
    public boolean b;
    public int c;
    public int d;
    private int f;

    static {
        apdi apdiVar = new apdi();
        a = apdiVar;
        aonm.registerDefaultInstance(apdi.class, apdiVar);
    }

    private apdi() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဌ\u0002\u0004င\u0003", new Object[]{"f", "b", "c", apaf.m, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apdi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apdi.class) {
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
