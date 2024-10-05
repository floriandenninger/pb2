package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class argq extends aonm implements aooz {
    public static final argq a;
    private static volatile aopf j;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public apxf g;
    private aota k;
    private byte l = 2;
    public aony h = emptyProtobufList();
    public aomf i = aomf.b;

    static {
        argq argqVar = new argq();
        a = argqVar;
        aonm.registerDefaultInstance(argq.class, argqVar);
    }

    private argq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007\u001b\tည\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "k", "h", asus.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new argq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (argq.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
