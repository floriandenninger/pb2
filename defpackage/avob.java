package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avob extends aonm implements aooz {
    public static final avob a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apxf e;
    private apxf f;
    private apxf g;
    private aota h;
    private byte i = 2;

    static {
        avob avobVar = new avob();
        a = avobVar;
        aonm.registerDefaultInstance(avob.class, avobVar);
    }

    private avob() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0004ᐉ\u0003\u0006ᐉ\t\bᐉ\u0004\tᐉ\u0005", new Object[]{"c", "d", "e", "h", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new avob();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avob.class) {
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
