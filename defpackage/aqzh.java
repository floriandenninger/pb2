package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqzh extends aonm implements aooz {
    public static final aqzh a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public aulq e;
    private aota h;
    public int c = 0;
    private byte i = 2;
    public aony f = emptyProtobufList();

    static {
        aqzh aqzhVar = new aqzh();
        a = aqzhVar;
        aonm.registerDefaultInstance(aqzh.class, aqzhVar);
    }

    private aqzh() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u000e\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐼ\u0000\tЛ\nᐉ\n\rᐼ\u0000\u000eᐼ\u0000", new Object[]{"d", "c", "b", "e", apxf.class, "f", apxf.class, "h", apxf.class, aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqzh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqzh.class) {
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
