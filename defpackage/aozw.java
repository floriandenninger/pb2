package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozw extends aonm implements aooz {
    public static final aozw a;
    private static volatile aopf d;
    public aony b;
    public aony c;
    private int e;
    private aqyg f;
    private aqyg g;
    private aulq h;
    private aqyg i;
    private byte j = 2;

    static {
        aozw aozwVar = new aozw();
        a = aozwVar;
        aonm.registerDefaultInstance(aozw.class, aozwVar);
    }

    private aozw() {
        emptyProtobufList();
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0006\u0001Л\u0002Л\u0004ᐉ\u0002\u0005ᐉ\u0000\u0006ᐉ\u0001\u0007ᐉ\u0003", new Object[]{"e", "b", aozv.class, "c", aozu.class, "h", "f", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aozw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aozw.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
