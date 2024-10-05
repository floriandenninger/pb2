package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqfe extends aonm implements aooz {
    public static final aqfe a;
    private static volatile aopf b;
    private int c;
    private apxf d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private aota h;
    private aqql i;
    private byte j = 2;

    static {
        aqfe aqfeVar = new aqfe();
        a = aqfeVar;
        aonm.registerDefaultInstance(aqfe.class, aqfeVar);
    }

    private aqfe() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0006\u0002ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0006\u0007ᐉ\u0003\bᐉ\u0007\tᐉ\u0004", new Object[]{"c", "d", "e", "h", "f", "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqfe.class) {
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
