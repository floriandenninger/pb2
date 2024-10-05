package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avyq extends aonm implements aooz {
    public static final avyq a;
    private static volatile aopf d;
    public int b;
    public awaj c;
    private byte e = 2;

    static {
        avyq avyqVar = new avyq();
        a = avyqVar;
        aonm.registerDefaultInstance(avyq.class, avyqVar);
    }

    private avyq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ueaf2Ⅶ\ueaf2Ⅶ\u0001\u0000\u0000\u0001\ueaf2Ⅶᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avyq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avyq.class) {
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
