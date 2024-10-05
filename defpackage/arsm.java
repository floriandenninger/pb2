package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arsm extends aonm implements aooz {
    public static final arsm a;
    private static volatile aopf f;
    public int b;
    public arnd c;
    public autf d;
    public apxf e;
    private aota g;
    private aulq h;
    private byte i = 2;

    static {
        arsm arsmVar = new arsm();
        a = arsmVar;
        aonm.registerDefaultInstance(arsm.class, arsmVar);
    }

    private arsm() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "g", "h", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arsm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arsm.class) {
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
