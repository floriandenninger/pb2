package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arsf extends aonm implements aooz {
    public static final arsf a;
    private static volatile aopf f;
    public int b;
    public Object d;
    public arnb e;
    public int c = 0;
    private byte g = 2;

    static {
        arsf arsfVar = new arsf();
        a = arsfVar;
        aonm.registerDefaultInstance(arsf.class, arsfVar);
    }

    private arsf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ျ\u0000\u0004ျ\u0000", new Object[]{"d", "c", "b", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arsf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arsf.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
