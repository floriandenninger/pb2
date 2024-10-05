package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auod extends aonm implements aooz {
    public static final auod a;
    private static volatile aopf c;
    public aulq b;
    private int d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private aqyg h;
    private aota i;
    private byte j = 2;

    static {
        auod auodVar = new auod();
        a = auodVar;
        aonm.registerDefaultInstance(auod.class, auodVar);
    }

    private auod() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0006\u0007ᐉ\u0004\tᐉ\u0001", new Object[]{"d", "e", "f", "g", "i", "h", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new auod();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (auod.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
