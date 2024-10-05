package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxz extends aonm implements aooz {
    public static final arxz a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arxz arxzVar = new arxz();
        a = arxzVar;
        aonm.registerDefaultInstance(arxz.class, arxzVar);
    }

    private arxz() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf74eỔ\uf74eỔ\u0001\u0000\u0000\u0001\uf74eỔᐼ\u0000", new Object[]{"c", "b", apii.class});
            case NEW_MUTABLE_INSTANCE:
                return new arxz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arxz.class) {
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
