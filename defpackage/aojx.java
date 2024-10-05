package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aojx extends aonm implements aooz {
    public static final aojx a;
    private static volatile aopf k;
    public int b;
    public Object d;
    public Object f;
    public aokw i;
    public aols j;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public String h = "";

    static {
        aojx aojxVar = new aojx();
        a = aojxVar;
        aonm.registerDefaultInstance(aojx.class, aojxVar);
    }

    private aojx() {
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
                return newMessageInfo(a, "\u0001\t\u0002\u0001\u0002\n\t\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ျ\u0000\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဿ\u0000\bျ\u0001\tြ\u0001\nြ\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", "j", aoib.m, aoio.class, aoms.class});
            case NEW_MUTABLE_INSTANCE:
                return new aojx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aojx.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
