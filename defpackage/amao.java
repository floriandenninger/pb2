package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amao extends aonm implements aooz {
    public static final amao a;
    private static volatile aopf f;
    public int b;
    public int c;
    public alym d;
    public int e;
    private byte g = 2;

    static {
        amao amaoVar = new amao();
        a = amaoVar;
        aonm.registerDefaultInstance(amao.class, amaoVar);
    }

    private amao() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e", aduo.m});
            case NEW_MUTABLE_INSTANCE:
                return new amao();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (amao.class) {
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
