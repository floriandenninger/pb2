package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aohf extends aonm implements aooz {
    public static final aohf a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        aohf aohfVar = new aohf();
        a = aohfVar;
        aonm.registerDefaultInstance(aohf.class, aohfVar);
    }

    private aohf() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"c", "b", aohh.class, aohj.class, aohk.class, aogx.class, aohv.class, aohe.class, aoif.class, aoho.class, aohl.class});
            case NEW_MUTABLE_INSTANCE:
                return new aohf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aohf.class) {
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
