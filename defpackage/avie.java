package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avie extends aonm implements aooz {
    public static final avie a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        avie avieVar = new avie();
        a = avieVar;
        aonm.registerDefaultInstance(avie.class, avieVar);
    }

    private avie() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ueee9ᣑ\ueef3⮀\u0002\u0000\u0000\u0001\ueee9ᣑᐼ\u0000\ueef3⮀ြ\u0000", new Object[]{"c", "b", atmt.class, atsd.class});
            case NEW_MUTABLE_INSTANCE:
                return new avie();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avie.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
