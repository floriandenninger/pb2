package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asdl extends aonm implements aooz {
    public static final asdl a;
    private static volatile aopf d;
    public arnd b;
    public int c;
    private int e;
    private byte f = 2;

    static {
        asdl asdlVar = new asdl();
        a = asdlVar;
        aonm.registerDefaultInstance(asdl.class, asdlVar);
    }

    private asdl() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဌ\u0001", new Object[]{"e", "b", "c", asaq.j});
            case NEW_MUTABLE_INSTANCE:
                return new asdl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asdl.class) {
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
