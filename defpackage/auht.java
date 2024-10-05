package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auht extends aonm implements aooz {
    public static final auht a;
    private static volatile aopf j;
    public int b;
    public augy c;
    public aulq e;
    public boolean f;
    public aoxy g;
    private aota k;
    private aulq l;
    private byte m = 2;
    public aony d = emptyProtobufList();
    public aomf h = aomf.b;
    public String i = "";

    static {
        auht auhtVar = new auht();
        a = auhtVar;
        aonm.registerDefaultInstance(auht.class, auhtVar);
    }

    private auht() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0005\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0004\u0005ည\u0005\u0006ဇ\u0002\u0007ᐉ\u0003\bᐉ\u0006\tဈ\u0007", new Object[]{"b", "c", "d", augu.class, "e", "k", "h", "f", "g", "l", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new auht();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (auht.class) {
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
