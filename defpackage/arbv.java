package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arbv extends aonm implements aooz {
    public static final arbv a;
    private static volatile aopf h;
    public Object c;
    public Object e;
    private int i;
    public int b = 0;
    public int d = 0;
    public String f = "";
    public String g = "";

    static {
        arbv arbvVar = new arbv();
        a = arbvVar;
        aonm.registerDefaultInstance(arbv.class, arbvVar);
    }

    private arbv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0002\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ျ\u0000\u0003ျ\u0001\u0004ဈ\u0004\u0005ဈ\u0005\u0006ွ\u0000\u0007ွ\u0001", new Object[]{"c", "b", "e", "d", "i", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arbv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arbv.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
