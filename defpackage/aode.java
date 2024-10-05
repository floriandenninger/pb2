package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aode extends aonm implements aooz {
    public static final aode a;
    private static volatile aopf h;
    public int b;
    public Object d;
    public aocx e;
    public aodh g;
    public int c = 0;
    public String f = "";

    static {
        aode aodeVar = new aode();
        a = aodeVar;
        aonm.registerDefaultInstance(aode.class, aodeVar);
    }

    private aode() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ျ\u0000\u0004်\u0000\u0005ဉ\u0004", new Object[]{"d", "c", "b", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aode();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aode.class) {
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
