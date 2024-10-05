package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arip extends aonm implements aooz {
    public static final arip a;
    private static volatile aopf g;
    public arnd b;
    public apxf d;
    public aulq f;
    private int h;
    private aota i;
    private aqyg j;
    private apxf k;
    private aulp l;
    private byte m = 2;
    public aony c = emptyProtobufList();
    public aomf e = aomf.b;

    static {
        arip aripVar = new arip();
        a = aripVar;
        aonm.registerDefaultInstance(arip.class, aripVar);
    }

    private arip() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0001\b\u0001ᐉ\u0001\u0003Л\u0004ᐉ\u0003\bᐉ\u0004\nᐉ\u0006\u000bᐉ\u0005\fည\u0007\u000eᐉ\u0000\u0010ᐉ\t", new Object[]{"h", "b", "c", ariq.class, "j", "d", "l", "k", "e", "i", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arip();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arip.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
