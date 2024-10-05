package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dvl extends aonm implements aooz {
    public static final dvl a;
    private static volatile aopf d;
    public String b = "";
    public String c = "";
    private int e;

    static {
        dvl dvlVar = new dvl();
        a = dvlVar;
        aonm.registerDefaultInstance(dvl.class, dvlVar);
    }

    private dvl() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0006ဈ\u0005", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new dvl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (dvl.class) {
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
