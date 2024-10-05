package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aohc extends aonm implements aooz {
    public static final aohc a;
    private static volatile aopf f;
    public int b;
    public int c = 0;
    public Object d;
    public aohb e;

    static {
        aohc aohcVar = new aohc();
        a = aohcVar;
        aonm.registerDefaultInstance(aohc.class, aohcVar);
    }

    private aohc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"d", "c", "b", "e", aoie.class, aohp.class, aohy.class});
            case NEW_MUTABLE_INSTANCE:
                return new aohc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aohc.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
