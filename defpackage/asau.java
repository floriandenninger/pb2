package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asau extends aonm implements aooz {
    public static final asau a;
    private static volatile aopf h;
    public int b;
    public Object d;
    public arnb e;
    public int c = 0;
    private byte i = 2;
    public aomf f = aomf.b;
    public String g = "";

    static {
        asau asauVar = new asau();
        a = asauVar;
        aonm.registerDefaultInstance(asau.class, asauVar);
    }

    private asau() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0001\u0004ျ\u0000\u0005ဈ\u0004\u0006ြ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", asrh.class});
            case NEW_MUTABLE_INSTANCE:
                return new asau();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asau.class) {
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
