package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtg extends aonm implements aooz {
    public static final awtg a;
    private static volatile aopf e;
    public Object c;
    public int b = 0;
    public aonp d = emptyDoubleList();

    static {
        awtg awtgVar = new awtg();
        a = awtgVar;
        aonm.registerDefaultInstance(awtg.class, awtgVar);
    }

    private awtg() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0012\u0002ြ\u0000", new Object[]{"c", "b", "d", awtf.class});
            case NEW_MUTABLE_INSTANCE:
                return new awtg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awtg.class) {
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
