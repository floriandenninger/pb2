package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aurt extends aonm implements aooz {
    public static final aurt a;
    private static volatile aopf d;
    public apxf b;
    private int e;
    private aqyg f;
    private apxf g;
    private aota h;
    private byte i = 2;
    public aomf c = aomf.b;

    static {
        aurt aurtVar = new aurt();
        a = aurtVar;
        aonm.registerDefaultInstance(aurt.class, aurtVar);
    }

    private aurt() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0004\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ည\u0005\u0005ᐉ\u0006\u0007ᐉ\u0004", new Object[]{"e", "f", "b", "c", "h", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aurt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aurt.class) {
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
