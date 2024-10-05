package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqsv extends aonm implements aooz {
    public static final aqsv a;
    private static volatile aopf f;
    public int b;
    public aota d;
    public aomf e;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private byte j = 2;
    public aony c = emptyProtobufList();

    static {
        aqsv aqsvVar = new aqsv();
        a = aqsvVar;
        aonm.registerDefaultInstance(aqsv.class, aqsvVar);
    }

    private aqsv() {
        emptyProtobufList();
        this.e = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0001\u0005\u0002Л\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\bᐉ\u000b\tည\f", new Object[]{"b", "c", aqsu.class, "g", "h", "i", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqsv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqsv.class) {
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
