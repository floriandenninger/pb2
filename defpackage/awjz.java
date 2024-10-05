package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awjz extends aonm implements aooz {
    public static final awjz a;
    private static volatile aopf f;
    public aqyg b;
    public aqyg c;
    public awka e;
    private int g;
    private aota h;
    private aulq i;
    private byte j = 2;
    public aomf d = aomf.b;

    static {
        awjz awjzVar = new awjz();
        a = awjzVar;
        aonm.registerDefaultInstance(awjz.class, awjzVar);
    }

    private awjz() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"g", "b", "c", "h", "d", "e", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new awjz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awjz.class) {
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
