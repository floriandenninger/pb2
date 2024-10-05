package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asce extends aonm implements aooz {
    public static final asce a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        asce asceVar = new asce();
        a = asceVar;
        aonm.registerDefaultInstance(asce.class, asceVar);
    }

    private asce() {
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
                return newMessageInfo(a, "\u0001\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000", new Object[]{"c", "b", asbw.class, asbt.class, asbx.class, ascb.class, asca.class, asbv.class, asbu.class, asbz.class, ascd.class, asby.class, ascc.class, asbs.class});
            case NEW_MUTABLE_INSTANCE:
                return new asce();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asce.class) {
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
