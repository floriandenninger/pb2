package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ashx extends aonm implements aooz {
    public static final ashx a;
    private static volatile aopf i;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public String g = "";
    public int h;

    static {
        ashx ashxVar = new ashx();
        a = ashxVar;
        aonm.registerDefaultInstance(ashx.class, ashxVar);
    }

    private ashx() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဌ\u0005", new Object[]{"b", "c", atrx.a(), "d", "e", atnn.k, "f", atnn.l, "g", "h", atol.a()});
            case NEW_MUTABLE_INSTANCE:
                return new ashx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (ashx.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
