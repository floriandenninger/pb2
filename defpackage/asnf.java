package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asnf extends aonm implements aooz {
    public static final asnf a;
    private static volatile aopf g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int h;

    static {
        asnf asnfVar = new asnf();
        a = asnfVar;
        aonm.registerDefaultInstance(asnf.class, asnfVar);
    }

    private asnf() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0005ဋ\u0005\u0006ဋ\u0006\nဋ\u0003", new Object[]{"h", "b", "c", "e", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new asnf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asnf.class) {
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
