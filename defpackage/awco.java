package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class awco extends aonm implements aooz {
    public static final awco a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awco awcoVar = new awco();
        a = awcoVar;
        aonm.registerDefaultInstance(awco.class, awcoVar);
    }

    private awco() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uf395ḫ\uf185ḳ\u0003\u0000\u0000\u0003\uf395ḫᐼ\u0000\ue4e1ḭᐼ\u0000\uf185ḳᐼ\u0000", new Object[]{"c", "b", awcs.class, awch.class, awcr.class});
            case NEW_MUTABLE_INSTANCE:
                return new awco();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awco.class) {
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
