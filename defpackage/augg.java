package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class augg extends aonm implements aooz {
    public static final augg a;
    private static volatile aopf h;
    public int b;
    public augh c;
    public aoxy e;
    private aota i;
    private byte j = 2;
    public aony d = emptyProtobufList();
    public aomf f = aomf.b;
    public String g = "";

    static {
        augg auggVar = new augg();
        a = auggVar;
        aonm.registerDefaultInstance(augg.class, auggVar);
    }

    private augg() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0003\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003\u0006ဈ\u0004", new Object[]{"b", "c", "d", augu.class, "e", "i", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new augg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (augg.class) {
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
