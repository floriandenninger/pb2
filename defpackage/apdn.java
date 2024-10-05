package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apdn extends aonm implements aooz {
    public static final apdn a;
    private static volatile aopf h;
    public int b;
    public apdp c;
    public apdo d;
    public apdp e;
    public apdo f;
    public int g = 1;

    static {
        apdn apdnVar = new apdn();
        a = apdnVar;
        aonm.registerDefaultInstance(apdn.class, apdnVar);
    }

    private apdn() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", apaf.h});
            case NEW_MUTABLE_INSTANCE:
                return new apdn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apdn.class) {
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
