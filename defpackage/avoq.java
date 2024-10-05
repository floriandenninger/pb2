package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avoq extends aonm implements aooz {
    public static final avoq a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apxf f;
    private apxf g;
    private aota h;
    private byte i = 2;

    static {
        avoq avoqVar = new avoq();
        a = avoqVar;
        aonm.registerDefaultInstance(avoq.class, avoqVar);
    }

    private avoq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\f\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\n\fᐉ\u0002", new Object[]{"c", "d", "f", "g", "h", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avoq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avoq.class) {
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
