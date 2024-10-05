package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqxk extends aonm implements aooz {
    public static final aqxk a;
    private static volatile aopf f;
    public int b;
    public aqyg c;
    public aulq d;
    private aqyg g;
    private byte h = 2;
    public aony e = emptyProtobufList();

    static {
        aqxk aqxkVar = new aqxk();
        a = aqxkVar;
        aonm.registerDefaultInstance(aqxk.class, aqxkVar);
    }

    private aqxk() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л", new Object[]{"b", "c", "g", "d", "e", aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqxk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqxk.class) {
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
