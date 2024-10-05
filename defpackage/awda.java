package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awda extends aonm implements aooz {
    public static final awda a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awda awdaVar = new awda();
        a = awdaVar;
        aonm.registerDefaultInstance(awda.class, awdaVar);
    }

    private awda() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue1b7㠂\uf676䙥\u0004\u0000\u0000\u0004\ue1b7㠂ᐼ\u0000\ue4d4㠍ᐼ\u0000\ue206㠠ᐼ\u0000\uf676䙥ᐼ\u0000", new Object[]{"c", "b", awcz.class, awcy.class, awdb.class, awcx.class});
            case NEW_MUTABLE_INSTANCE:
                return new awda();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awda.class) {
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
