package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atox extends aonm implements aooz {
    public static final atox a;
    private static volatile aopf g;
    public int b;
    public long c;
    public long d;
    public long e;
    public int f;

    static {
        atox atoxVar = new atox();
        a = atoxVar;
        aonm.registerDefaultInstance(atox.class, atoxVar);
    }

    private atox() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e", "f", atrx.a()});
            case NEW_MUTABLE_INSTANCE:
                return new atox();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atox.class) {
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
