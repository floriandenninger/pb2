package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqhb extends aonm implements aooz {
    public static final aqhb a;
    private static volatile aopf e;
    public int b;
    public aqyg d;
    private aota f;
    private aqyg g;
    private byte h = 2;
    public aony c = emptyProtobufList();

    static {
        aqhb aqhbVar = new aqhb();
        a = aqhbVar;
        aonm.registerDefaultInstance(aqhb.class, aqhbVar);
    }

    private aqhb() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0004\u0001Л\u0002ᐉ\u0000\u0004ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"b", "c", aulq.class, "d", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqhb.class) {
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
