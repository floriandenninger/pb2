package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atuo extends aonm implements aooz {
    public static final atuo a;
    private static volatile aopf f;
    public int b;
    public Object d;
    public aqyg e;
    private aqyg g;
    private atup h;
    private aulq i;
    public int c = 0;
    private byte j = 2;

    static {
        atuo atuoVar = new atuo();
        a = atuoVar;
        aonm.registerDefaultInstance(atuo.class, atuoVar);
    }

    private atuo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐼ\u0000\u0004ᐉ\u0000\u0005ᐼ\u0000\u0006ᐉ\u0005", new Object[]{"d", "c", "b", "e", "h", apxf.class, "g", aulq.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new atuo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (atuo.class) {
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
