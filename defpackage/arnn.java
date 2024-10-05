package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnn extends aonm implements aooz {
    public static final arnn a;
    private static volatile aopf i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public String f = "";
    public String h = "";

    static {
        arnn arnnVar = new arnn();
        a = arnnVar;
        aonm.registerDefaultInstance(arnn.class, arnnVar);
    }

    private arnn() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဈ\u0003\u0004ဇ\u0004\u0005ဈ\u0005\u0006ဇ\u0001", new Object[]{"b", "c", "e", "f", "g", "h", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new arnn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arnn.class) {
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
