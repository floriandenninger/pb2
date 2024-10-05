package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aprb extends aonm implements aooz {
    public static final aprb a;
    private static volatile aopf f;
    public aqyg b;
    public aprd c;
    public aprd d;
    public aprc e;
    private int g;
    private aqyg h;
    private aota i;
    private byte j = 2;

    static {
        aprb aprbVar = new aprb();
        a = aprbVar;
        aonm.registerDefaultInstance(aprb.class, aprbVar);
    }

    private aprb() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"g", "b", "c", "d", "h", "e", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aprb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aprb.class) {
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
