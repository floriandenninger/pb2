package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbx extends aonm implements aooz {
    public static final aqbx a;
    private static volatile aopf c;
    public int b;
    private int d;

    static {
        aqbx aqbxVar = new aqbx();
        a = aqbxVar;
        aonm.registerDefaultInstance(aqbx.class, aqbxVar);
    }

    private aqbx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", apyu.h});
            case NEW_MUTABLE_INSTANCE:
                return new aqbx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aqbx.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
