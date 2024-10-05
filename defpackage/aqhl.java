package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqhl extends aonm implements aooz {
    public static final aqhl a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private avyk e;
    private apxf f;
    private apxf g;
    private apxf h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aulq l;
    private byte m = 2;

    static {
        aqhl aqhlVar = new aqhl();
        a = aqhlVar;
        aonm.registerDefaultInstance(aqhl.class, aqhlVar);
    }

    private aqhl() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0014\t\u0000\u0000\t\u0001ᐉ\u0000\u0004ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\tᐉ\u0006\u000bᐉ\u0007\fᐉ\b\rᐉ\t\u0014ᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqhl.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
