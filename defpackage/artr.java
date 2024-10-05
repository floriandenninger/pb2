package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class artr extends aonm implements aooz {
    public static final artr a;
    private static volatile aopf e;
    public arnd b;
    public aony c;
    public apxf d;
    private int f;
    private byte g = 2;

    static {
        artr artrVar = new artr();
        a = artrVar;
        aonm.registerDefaultInstance(artr.class, artrVar);
    }

    private artr() {
        emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0004Л\u0005ᐉ\u0001", new Object[]{"f", "b", "c", apxf.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new artr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (artr.class) {
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
