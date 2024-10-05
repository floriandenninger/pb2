package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtm extends aonm implements aooz {
    public static final awtm a;
    private static volatile aopf g;
    public Object c;
    public Object e;
    private int h;
    public int b = 0;
    public int d = 0;
    public String f = "";

    static {
        awtm awtmVar = new awtm();
        a = awtmVar;
        aonm.registerDefaultInstance(awtm.class, awtmVar);
    }

    private awtm() {
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
                return newMessageInfo(a, "\u0001\u0005\u0002\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0001\u0005ြ\u0000", new Object[]{"c", "b", "e", "d", "h", "f", awtf.class, awtl.class, awtf.class, awte.class});
            case NEW_MUTABLE_INSTANCE:
                return new awtm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (awtm.class) {
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
