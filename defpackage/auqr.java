package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auqr extends aonm implements aooz {
    public static final auqr a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private aqyg h;
    private apxf i;
    private aota j;
    private byte k = 2;

    static {
        auqr auqrVar = new auqr();
        a = auqrVar;
        aonm.registerDefaultInstance(auqr.class, auqrVar);
    }

    private auqr() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0007\u0001ᐉ\u0002\u0002ᐉ\u0007\u0003ᐉ\b\u0006ᐉ\u0005\bᐉ\u0006\nᐉ\t\fᐉ\u0003", new Object[]{"c", "d", "h", "i", "f", "g", "j", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new auqr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (auqr.class) {
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
