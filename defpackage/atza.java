package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atza extends aonm implements aooz {
    public static final atza a;
    private static volatile aopf e;
    public int b;
    public aqyg c;
    private aota f;
    private byte g = 2;
    public aomf d = aomf.b;

    static {
        atza atzaVar = new atza();
        a = atzaVar;
        aonm.registerDefaultInstance(atza.class, atzaVar);
    }

    private atza() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002", new Object[]{"b", "c", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new atza();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (atza.class) {
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
