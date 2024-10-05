package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozg extends aonm implements aooz {
    public static final aozg a;
    private static volatile aopf e;
    public int b;
    public float c;
    public long d;
    private int f;

    static {
        aozg aozgVar = new aozg();
        a = aozgVar;
        aonm.registerDefaultInstance(aozg.class, aozgVar);
    }

    private aozg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ဂ\u0002", new Object[]{"f", "b", aouo.p, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aozg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aozg.class) {
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
