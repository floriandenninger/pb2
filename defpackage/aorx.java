package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aorx extends aonm implements aooz {
    public static final aorx a;
    private static volatile aopf g;
    public Object c;
    public aoqa e;
    public int f;
    public int b = 0;
    public String d = "";

    static {
        aorx aorxVar = new aorx();
        a = aorxVar;
        aonm.registerDefaultInstance(aorx.class, aorxVar);
    }

    private aorx() {
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
                return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\f\u0004<\u0000", new Object[]{"c", "b", "d", "e", "f", aorz.class});
            case NEW_MUTABLE_INSTANCE:
                return new aorx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aorx.class) {
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
