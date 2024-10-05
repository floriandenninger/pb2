package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ardi extends aonm implements aooz {
    public static final ardi a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aota g;
    private byte h = 2;

    static {
        ardi ardiVar = new ardi();
        a = ardiVar;
        aonm.registerDefaultInstance(ardi.class, ardiVar);
    }

    private ardi() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0004\u0002ᐉ\u0002\u0006ᐉ\u0004\bᐉ\u0001\tᐉ\u0003", new Object[]{"c", "e", "g", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new ardi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ardi.class) {
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
